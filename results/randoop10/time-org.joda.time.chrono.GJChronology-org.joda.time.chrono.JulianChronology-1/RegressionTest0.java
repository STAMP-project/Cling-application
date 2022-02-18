import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.ReadablePartial readablePartial5 = null;
        int[] intArray8 = new int[] { (byte) -1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial5, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[-1, 35]");
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.set(readablePartial10, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = gJChronology2.getDateTimeMillis((int) ' ', (int) (byte) 0, 0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.getDateTimeMillis(36000000, (-1), (int) '4', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.ReadableInstant readableInstant2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        boolean boolean7 = gJChronology2.equals((java.lang.Object) "+10:00");
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology2.get(readablePartial8, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = gJChronology2.get(readablePartial4, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.eras();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(36000000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology7.set(readablePartial8, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology2.get(readablePeriod7, (long) 'a', (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        boolean boolean9 = julianChronology7.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology10 = julianChronology7.withUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology12 = julianChronology7.withZone(dateTimeZone11);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (long) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        org.joda.time.Instant instant11 = instant6.toInstant();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(instant11);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.set(readablePartial8, 5201L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = gJChronology2.get(readablePeriod5, (long) 36000000, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis((int) (short) 0, (int) (short) -1, 0, (int) '4', (int) (byte) 1, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis((int) (short) 0, 0, 10, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = julianChronology3.getDateTimeMillis((int) '#', (int) ' ', (int) (short) -1, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("1970-01-01T10:00:00.000Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology2.get(readablePeriod7, 5201L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        java.lang.Class<?> wildcardClass24 = instant19.getClass();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        long long10 = dateTimeZone5.convertLocalToUTC((long) (short) 10, false);
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-35999990L) + "'", long10 == (-35999990L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+10:00");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = gJChronology2.get(readablePeriod4, 11L, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = chronology3.get(readablePeriod4, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.getDateTimeMillis((int) (short) -1, (int) (byte) 100, 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis((int) (short) 10, (int) (byte) 1, (-1), (int) (short) 1, (int) '#', (int) (short) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        org.joda.time.DurationField durationField5 = julianChronology3.weeks();
        org.joda.time.DurationField durationField6 = julianChronology3.days();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = julianChronology3.getDateTimeMillis(10, (int) (byte) 100, (int) (short) 0, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        long long10 = dateTimeZone5.convertLocalToUTC((long) (short) 10, false);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology13.getZone();
        org.joda.time.Instant instant19 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, (org.joda.time.ReadableInstant) instant19);
        java.lang.String str21 = instant19.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, (org.joda.time.ReadableInstant) instant19, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-35999990L) + "'", long10 == (-35999990L));
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str21, "1970-01-01T10:00:00.000Z");
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = julianChronology3.getDateTimeMillis((int) (short) -1, 36000000, 1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis(36000000L, (int) (byte) 0, (-1), 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis((int) ' ', 1, (int) (short) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis((int) (short) 10, (int) (byte) 10, (int) ' ', (int) ' ', (int) (byte) 10, 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant3.withMillis((long) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = instant5.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DurationField durationField5 = gJChronology2.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.getDateTimeMillis(0, (int) (byte) -1, 1, (int) (byte) 1, 0, (-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis(0, 10, 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology2.getZone();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray15 = new int[] { 10, 100, '4', (byte) 1, 0, (short) 10 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial8, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[10, 100, 52, 1, 0, 10]");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("JulianChronology[+10:00]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"JulianChronology[+10:00]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        long long12 = dateTimeZone5.convertLocalToUTC((-35999900L), false);
        long long15 = dateTimeZone5.adjustOffset((long) '#', false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, (long) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-71999900L) + "'", long12 == (-71999900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0, 36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 36000000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology9.getDateTimeMillis((int) (byte) -1, (int) (short) 1, (int) (byte) 0, (int) (short) 10, 1, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = gJChronology2.getDateTimeMillis((int) '#', 0, (int) (short) 100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.minuteOfDay();
        boolean boolean12 = julianChronology3.equals((java.lang.Object) dateTimeField11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.secondOfMinute();
        java.lang.Class<?> wildcardClass14 = julianChronology3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        int int10 = dateTimeZone7.getOffsetFromLocal((long) ' ');
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology12 = gJChronology2.withZone(dateTimeZone7);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = gJChronology2.get(readablePeriod13, (long) (short) -1, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        boolean boolean2 = dateTimeZone1.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, 5201L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.dayOfMonth();
        org.joda.time.DurationField durationField12 = julianChronology3.days();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = julianChronology3.get(readablePartial13, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("GJChronology[+10:00]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GJChronology[+10:00]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = new org.joda.time.Instant(1L);
        boolean boolean6 = instant1.isEqual((org.joda.time.ReadableInstant) instant5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = instant1.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DurationField durationField5 = gJChronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.era();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis(1L, (int) (short) -1, (int) (short) -1, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.set(readablePartial8, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology2.centuries();
        org.joda.time.DurationField durationField5 = julianChronology2.weeks();
        org.joda.time.DurationField durationField6 = julianChronology2.days();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = julianChronology2.get(readablePeriod7, (long) (byte) -1, (-71999900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = julianChronology3.set(readablePartial8, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = julianChronology2.getDateTimeMillis(36000000, 36000000, 100, (int) (short) 1, (int) (short) 1, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        boolean boolean7 = gJChronology2.equals((java.lang.Object) "+10:00");
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis((int) (byte) 10, (int) (byte) 10, (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        org.joda.time.DurationField durationField5 = julianChronology3.weeks();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = julianChronology3.get(readablePartial6, 110L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = gJChronology2.getDateTimeMillis((int) (byte) -1, (int) (short) 1, (int) (byte) -1, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            long long5 = gJChronology0.getDateTimeMillis((int) '#', (int) (short) 10, (int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        java.lang.String str9 = instant6.toString();
        org.joda.time.Instant instant11 = instant6.minus((long) 36000000);
        org.joda.time.MutableDateTime mutableDateTime12 = instant6.toMutableDateTime();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime12.toMutableDateTime(chronology13);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str9, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        java.lang.Class<?> wildcardClass11 = instant8.getClass();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        java.lang.String str7 = gJChronology2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis((int) (byte) -1, (int) (short) 100, (int) (byte) 100, (int) (byte) 10, (int) (short) 100, (int) (short) 0, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[+10:00]" + "'", str7, "GJChronology[+10:00]");
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology9.getZone();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, (org.joda.time.ReadableInstant) instant15);
        org.joda.time.Chronology chronology17 = gJChronology2.withZone(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology19 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone13, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        org.joda.time.DurationField durationField5 = julianChronology3.weeks();
        org.joda.time.DurationField durationField6 = julianChronology3.days();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology9 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = julianChronology3.set(readablePartial12, 35999999L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gJChronology2.getDateTimeMillis(1, (int) (short) 10, (int) (short) 0, 0, (int) (byte) -1, (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("UTC", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.clockhourOfHalfday();
        org.joda.time.Chronology chronology11 = gJChronology9.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology11.getDateTimeMillis((int) (short) 0, 10, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gJChronology2.getDateTimeMillis((int) '#', (int) (byte) 1, (int) (byte) 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = julianChronology3.getDateTimeMillis((-1), (int) (short) 1, (int) ' ', (int) '#', (int) (short) -1, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.ReadablePartial readablePartial3 = null;
        int[] intArray7 = new int[] { 0, 4, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial3, intArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(intArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[0, 4, 10]");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-1L), locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        org.joda.time.ReadableInstant readableInstant8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray12 = new int[] { 36000000, '#', (byte) 0 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology3.validate(readablePartial8, intArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[36000000, 35, 0]");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray10 = null;
        // The following exception was thrown during execution in test generation
        try {
            julianChronology3.validate(readablePartial9, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology2.centuries();
        org.joda.time.DurationField durationField5 = julianChronology2.weeks();
        org.joda.time.DurationField durationField6 = julianChronology2.days();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray8 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            julianChronology2.validate(readablePartial7, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[]");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant9);
        java.lang.String str11 = instant9.toString();
        int int12 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant9);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.dayOfYear();
        org.joda.time.Instant instant19 = gJChronology15.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime22 = instant19.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = instant19.toDateTime();
        java.util.Date date24 = instant19.toDate();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology27.getZone();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.Chronology chronology32 = gJChronology27.withZone(dateTimeZone30);
        java.lang.String str34 = dateTimeZone30.getName((long) (byte) 10);
        java.util.TimeZone timeZone35 = dateTimeZone30.toTimeZone();
        long long39 = dateTimeZone30.convertLocalToUTC((long) 10, false, (long) (byte) 10);
        boolean boolean40 = instant19.equals((java.lang.Object) (byte) 10);
        int int41 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant19);
        org.joda.time.ReadableInstant readableInstant42 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant42, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str11, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+10:00" + "'", str31, "+10:00");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+10:00" + "'", str34, "+10:00");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-35999990L) + "'", long39 == (-35999990L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.dayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = gJChronology2.get(readablePeriod13, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant8.minus(readableDuration24);
        java.lang.Class<?> wildcardClass26 = instant25.getClass();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = gJChronology0.getDateTimeMillis((-1), (int) '#', (int) (byte) -1, 36000000, (int) (byte) 0, 36000000, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = julianChronology3.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = chronology9.getDateTimeMillis((int) '4', (int) (byte) 100, (int) 'a', (int) (byte) 1, 278, 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 278 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology2.centuries();
        org.joda.time.DurationField durationField5 = julianChronology2.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = julianChronology2.getDateTimeMillis((int) '#', 0, (int) (short) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        long long7 = julianChronology2.add((-35999900L), 0L, (int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField8 = julianChronology2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = julianChronology2.getDateTimeMillis((int) '#', 1, (int) (byte) 1, (int) '#', 10, (int) (byte) 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-35999900L) + "'", long7 == (-35999900L));
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("GJChronology[+10:00]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'GJChronology[+10:00]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        int int19 = dateTimeZone8.getOffset((-35999900L));
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = julianChronology20.get(readablePeriod21, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertNotNull(julianChronology20);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.Instant instant8 = gJChronology2.getGregorianCutover();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis(0, (int) ' ', (int) 'a', (int) '#', 0, (int) (short) 1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology2.centuries();
        org.joda.time.DurationField durationField5 = julianChronology2.weeks();
        org.joda.time.DurationField durationField6 = julianChronology2.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = julianChronology2.getDateTimeMillis((-12219292800000L), (-1), 4, (int) 'a', 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        long long10 = dateTimeZone5.convertLocalToUTC((long) (short) 10, false);
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology13 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-35999990L) + "'", long10 == (-35999990L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+10:00");
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology2.centuries();
        org.joda.time.DurationField durationField5 = julianChronology2.weeks();
        org.joda.time.DurationField durationField6 = julianChronology2.days();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology2.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = julianChronology2.get(readablePeriod8, (long) 'a', (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology2.centuries();
        org.joda.time.DurationField durationField5 = julianChronology2.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = julianChronology2.getDateTimeMillis((-1), 100, 278, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (short) -1, locale3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str7 = dateTimeZone6.getID();
        boolean boolean8 = dateTimeZone6.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (byte) 1);
        org.joda.time.ReadableInstant readableInstant11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant11, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(36000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant3.withMillis((long) (byte) -1);
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = dateTime6.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.halfdays();
        org.joda.time.DurationField durationField2 = gJChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology0.getDateTimeMillis(1, 1582, (int) (byte) -1, 4, (int) '#', (int) (byte) 1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1582 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.hourOfDay();
        org.joda.time.ReadablePartial readablePartial13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = julianChronology3.get(readablePartial13, (-36000001L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.year();
        org.joda.time.DurationField durationField5 = julianChronology3.eras();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = julianChronology3.get(readablePeriod7, (-35999900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTime dateTime10 = instant8.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = dateTime10.get(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.Instant instant8 = gJChronology2.getGregorianCutover();
        org.joda.time.Chronology chronology9 = instant8.getChronology();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = chronology9.get(readablePartial10, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        java.lang.String str9 = instant6.toString();
        org.joda.time.Instant instant11 = instant6.minus((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.Chronology chronology15 = gJChronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.millisOfDay();
        org.joda.time.DurationField durationField18 = gJChronology14.halfdays();
        org.joda.time.DurationField durationField19 = gJChronology14.millis();
        org.joda.time.DateTime dateTime20 = instant11.toDateTime((org.joda.time.Chronology) gJChronology14);
        org.joda.time.Instant instant21 = instant11.toInstant();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str9, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(instant21);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.minuteOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = gJChronology2.get(readablePeriod10, (long) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant1.minus((long) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, readableInstant7);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology8.dayOfYear();
        org.joda.time.Instant instant12 = gJChronology8.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime15 = instant12.toMutableDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = instant12.toDateTime();
        java.util.Date date17 = instant12.toDate();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19);
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology20.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str24 = dateTimeZone23.getID();
        org.joda.time.Chronology chronology25 = gJChronology20.withZone(dateTimeZone23);
        java.lang.String str27 = dateTimeZone23.getName((long) (byte) 10);
        java.util.TimeZone timeZone28 = dateTimeZone23.toTimeZone();
        long long32 = dateTimeZone23.convertLocalToUTC((long) 10, false, (long) (byte) 10);
        boolean boolean33 = instant12.equals((java.lang.Object) (byte) 10);
        boolean boolean34 = instant5.isBefore((org.joda.time.ReadableInstant) instant12);
        org.joda.time.Instant instant37 = instant12.withDurationAdded((long) (byte) 1, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField38 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int39 = instant12.get(dateTimeField38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeField must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:00" + "'", str27, "+10:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-35999990L) + "'", long32 == (-35999990L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(instant37);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        java.lang.String str9 = instant6.toString();
        org.joda.time.Instant instant11 = instant6.minus((long) 36000000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = instant6.toString(dateTimeFormatter12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 1);
        org.joda.time.DateTime dateTime17 = instant6.toDateTime(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int19 = dateTime17.get(dateTimeFieldType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str9, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str13, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField5 = gJChronology2.weeks();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology2.get(readablePeriod6, (long) (byte) 1, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant3.withMillis((long) (byte) -1);
        java.util.Date date6 = instant3.toDate();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8);
        org.joda.time.Chronology chronology10 = gJChronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.millisOfDay();
        org.joda.time.DurationField durationField13 = gJChronology9.halfdays();
        org.joda.time.DurationField durationField14 = gJChronology9.millis();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology17 = gJChronology9.withZone(dateTimeZone16);
        org.joda.time.DurationField durationField18 = gJChronology9.minutes();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology9.halfdayOfDay();
        org.joda.time.DurationField durationField20 = gJChronology9.centuries();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology9.secondOfDay();
        org.joda.time.DateTime dateTime22 = instant3.toDateTime((org.joda.time.Chronology) gJChronology9);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.halfdays();
        org.joda.time.DurationField durationField2 = gJChronology0.centuries();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = gJChronology0.set(readablePartial3, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.ReadablePartial readablePartial11 = null;
        int[] intArray17 = new int[] { 'a', '4', 1582, (-1), (-1) };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology3.validate(readablePartial11, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[97, 52, 1582, -1, -1]");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("1970-01-01T00:00:00.001Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '1970-01-01T00:00:00.001Z' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = julianChronology10.getDateTimeMillis((long) (short) 100, (int) (byte) -1, (int) ' ', (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNotNull(julianChronology10);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology2.get(readablePeriod7, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTime dateTime10 = instant8.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        boolean boolean16 = julianChronology14.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology17 = julianChronology14.withUTC();
        org.joda.time.DateTimeZone dateTimeZone18 = julianChronology14.getZone();
        org.joda.time.MutableDateTime mutableDateTime19 = dateTime10.toMutableDateTime((org.joda.time.Chronology) julianChronology14);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = julianChronology14.getDateTimeMillis((int) '#', (int) 'a', 278, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant3.withMillis((long) (byte) -1);
        org.joda.time.Instant instant7 = instant5.plus((long) (short) 0);
        java.lang.String str8 = instant7.toString();
        org.joda.time.ReadableInstant readableInstant9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = instant7.compareTo(readableInstant9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str8, "1969-12-31T23:59:59.999Z");
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.yearOfCentury();
        org.joda.time.DurationField durationField9 = gJChronology2.weeks();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology11 = julianChronology10.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = chronology11.getDateTimeMillis((long) (-1), 1582, (int) (byte) 100, (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1582 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        long long12 = dateTimeZone5.convertLocalToUTC((-35999900L), false);
        long long15 = dateTimeZone5.adjustOffset((long) '#', false);
        int int17 = dateTimeZone5.getOffset((long) (byte) 10);
        java.lang.String str19 = dateTimeZone5.getShortName((-71999990L));
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-71999900L) + "'", long12 == (-71999900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36000000 + "'", int17 == 36000000);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+10:00" + "'", str19, "+10:00");
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.equals((java.lang.Object) (-35999900L));
        boolean boolean13 = mutableDateTime9.isEqual(10L);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.year();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.millisOfDay();
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gJChronology2.getDateTimeMillis((int) (byte) 1, (int) (short) 10, (int) (byte) 0, (int) 'a', (int) (byte) 10, (int) (byte) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.seconds();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = julianChronology3.get(readablePeriod10, (long) 278, (-71999990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology2.centuries();
        org.joda.time.DurationField durationField5 = julianChronology2.weeks();
        org.joda.time.DurationField durationField6 = julianChronology2.days();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology2.monthOfYear();
        org.joda.time.DurationField durationField8 = julianChronology2.halfdays();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfDay();
        org.joda.time.DurationField durationField7 = julianChronology3.days();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = julianChronology3.getDateTimeMillis((int) (byte) 100, (int) (byte) 10, 1582, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1582 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.dayOfYear();
        org.joda.time.Instant instant9 = gJChronology5.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.minus(readableDuration10);
        org.joda.time.Instant instant14 = instant11.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant11.plus(readableDuration15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant16);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = gJChronology17.getDateTimeMillis((int) (short) 100, (int) (byte) 1, (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(gJChronology17);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology8.getDateTimeMillis((int) (short) -1, 4, (int) (short) 100, (int) (short) 10, (int) (byte) 1, (int) (byte) 0, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = gJChronology2.get(readablePeriod9, (long) (byte) 10, 36000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = gJChronology2.getDateTimeMillis((int) (byte) 1, 10, 1, (int) '4', (int) 'a', (int) (byte) 1, 3600000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis((int) '#', 4, (int) (short) 100, (int) (short) 100, (int) (short) 10, (int) (byte) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        java.util.Date date11 = instant6.toDate();
        boolean boolean12 = instant6.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime13 = instant6.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        java.lang.String str17 = gJChronology16.toString();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.dayOfYear();
        int int19 = instant6.get(dateTimeField18);
        boolean boolean21 = instant6.isBefore((-1L));
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant24 = instant6.withDurationAdded(readableDuration22, 1582);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[+10:00]" + "'", str17, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 278 + "'", int19 == 278);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(instant24);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray3 = julianChronology0.get(readablePeriod1, (-71999990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(julianChronology0);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.eras();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.set(readablePartial8, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        boolean boolean9 = julianChronology7.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology10 = julianChronology7.withUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology12 = julianChronology7.withZone(dateTimeZone11);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology16 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology2.halfdays();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = gJChronology2.get(readablePeriod9, (long) 1582, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.getID();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4);
        org.joda.time.Chronology chronology6 = gJChronology5.withUTC();
        java.lang.String str7 = gJChronology5.toString();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology5.millisOfDay();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology5.dayOfWeek();
        org.joda.time.Instant instant11 = gJChronology5.getGregorianCutover();
        boolean boolean12 = instant11.isEqualNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[+10:00]" + "'", str7, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.year();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.millisOfDay();
        org.joda.time.DurationField durationField6 = julianChronology3.weeks();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = julianChronology3.get(readablePeriod7, (long) (short) 0, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField13 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.centuryOfEra();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.getDateTimeMillis(1582, (int) (byte) 1, 10, 100, 1582, 10, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology2.centuries();
        org.joda.time.DurationField durationField5 = julianChronology2.weeks();
        org.joda.time.DurationField durationField6 = julianChronology2.days();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = julianChronology2.getDateTimeMillis(3600000, (int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) 'a', (int) '#', 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        long long9 = julianChronology3.add(readablePeriod6, (-1L), (int) (short) 0);
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray13 = new int[] { 4, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology3.validate(readablePartial10, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[4, -1]");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str13 = dateTimeZone12.getID();
        boolean boolean14 = dateTimeZone12.isFixed();
        long long16 = dateTimeZone12.previousTransition(100L);
        java.util.TimeZone timeZone17 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.Chronology chronology19 = julianChronology3.withZone(dateTimeZone18);
        org.joda.time.ReadablePartial readablePartial20 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long22 = julianChronology3.set(readablePartial20, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstanceUTC();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = gJChronology0.getDateTimeMillis((-1), (int) '4', (int) 'a', (int) (short) 10, (int) (short) -1, 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.weekyear();
        org.joda.time.Instant instant14 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = instant14.get(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970-01-01T00:00:00.001Z");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 10);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6);
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology7.getZone();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology7.dayOfYear();
        org.joda.time.Instant instant11 = gJChronology7.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.minus(readableDuration12);
        org.joda.time.Instant instant16 = instant13.withDurationAdded((-12219292800000L), 0);
        org.joda.time.MutableDateTime mutableDateTime17 = instant13.toMutableDateTime();
        boolean boolean18 = instant4.isBefore((org.joda.time.ReadableInstant) mutableDateTime17);
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        java.util.Date date11 = instant6.toDate();
        boolean boolean12 = instant6.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime13 = instant6.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        java.lang.String str17 = gJChronology16.toString();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.dayOfYear();
        int int19 = instant6.get(dateTimeField18);
        boolean boolean21 = instant6.isBefore((-1L));
        boolean boolean22 = instant6.isBeforeNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int24 = instant6.get(dateTimeFieldType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[+10:00]" + "'", str17, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 278 + "'", int19 == 278);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.secondOfDay();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology2.get(readablePeriod7, (-62112218399999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        java.lang.String str9 = instant6.toString();
        org.joda.time.Instant instant11 = instant6.minus((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.Chronology chronology15 = gJChronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.millisOfDay();
        org.joda.time.DurationField durationField18 = gJChronology14.halfdays();
        org.joda.time.DurationField durationField19 = gJChronology14.millis();
        org.joda.time.DateTime dateTime20 = instant11.toDateTime((org.joda.time.Chronology) gJChronology14);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTime20.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int23 = dateTime20.get(dateTimeFieldType22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str9, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 0);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((-35999890L), locale3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant9 = instant6.withDurationAdded(readableDuration7, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant6, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+00:00" + "'", str4, "+00:00");
        org.junit.Assert.assertNotNull(instant9);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = gJChronology2.set(readablePartial6, (-71999900L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.minuteOfDay();
        boolean boolean12 = julianChronology3.equals((java.lang.Object) dateTimeField11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.secondOfMinute();
        int int14 = julianChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = julianChronology3.get(readablePartial15, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        int int9 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = gJChronology2.get(readablePeriod10, (long) 36000000, 36000001L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = julianChronology2.get(readablePartial4, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.MutableDateTime mutableDateTime1 = instant0.toMutableDateTimeISO();
        org.joda.time.Instant instant2 = instant0.toInstant();
        org.junit.Assert.assertNotNull(mutableDateTime1);
        org.junit.Assert.assertNotNull(instant2);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.getDateTimeMillis(4, (-1), 1582, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DurationField durationField12 = gJChronology2.years();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology2.getDateTimeMillis((long) 0, (-1), 0, 278, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = julianChronology3.get(readablePartial9, 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.halfdays();
        org.joda.time.DurationField durationField2 = gJChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = gJChronology0.getDateTimeMillis((-35999900L), 3600000, (int) '#', (int) (short) 1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.DateTimeZone dateTimeZone2 = instant1.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = instant1.get(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis((int) (short) 10, (int) (short) 10, 0, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.clockhourOfDay();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = gJChronology0.getDateTimeMillis((int) (short) 0, 10, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GJChronology[+10:00]" + "'", str2, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray4 = gJChronology0.get(readablePeriod2, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = julianChronology2.get(readablePeriod5, 71999999L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.weeks();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology3.getZone();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = julianChronology3.set(readablePartial6, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis(36000000, 0, (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = julianChronology2.getDateTimeMillis((int) (byte) 0, 4, 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis(71999999L, 3600000, (int) (byte) -1, (int) (byte) -1, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfHalfday();
        int int6 = gJChronology2.getMinimumDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis((-1), (int) '4', 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = chronology5.halfdays();
        org.joda.time.DurationField durationField7 = chronology5.hours();
        org.joda.time.DurationField durationField8 = chronology5.minutes();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.hourOfDay();
        int int6 = julianChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology2.weekyearOfCentury();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = julianChronology2.get(readablePartial8, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("+10:00", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = gJChronology9.toString();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = gJChronology9.get(readablePeriod11, 71999999L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GJChronology[+10:00,cutover=1970-01-01T10:00:00.000Z]" + "'", str10, "GJChronology[+10:00,cutover=1970-01-01T10:00:00.000Z]");
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology2.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) durationField8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        java.lang.String str19 = dateTimeZone8.getNameKey((long) (short) 100);
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            long long26 = julianChronology20.getDateTimeMillis(36000000L, (int) '#', (int) (short) 0, (-1), 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(julianChronology20);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.weeks();
        org.joda.time.DurationField durationField5 = julianChronology3.millis();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = julianChronology3.getDateTimeMillis((int) (byte) -1, 0, (-1), 36000000, (int) (byte) 0, 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("GJChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GJChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTime dateTime10 = instant8.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology14.getZone();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology14.getZone();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant20);
        org.joda.time.DateTime dateTime22 = instant20.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime22.getZone();
        boolean boolean24 = dateTime10.isEqual((org.joda.time.ReadableInstant) dateTime22);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis((int) (byte) 100, (int) (byte) 0, 3600000, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.centuryOfEra();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        boolean boolean9 = julianChronology7.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology10 = julianChronology7.withUTC();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology12 = julianChronology7.withZone(dateTimeZone11);
        long long14 = dateTimeZone1.getMillisKeepLocal(dateTimeZone11, 10L);
        int int16 = dateTimeZone11.getStandardOffset(11L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant17 = new org.joda.time.Instant((java.lang.Object) int16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(julianChronology7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 11L + "'", long14 == 11L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.DateTime dateTime2 = instant1.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = instant1.get(dateTimeFieldType3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime2);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.era();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = julianChronology3.get(readablePeriod9, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        java.lang.String str7 = dateTimeZone6.getID();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.dayOfYear();
        org.joda.time.Instant instant14 = gJChronology10.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime17 = instant14.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = instant14.toDateTime();
        java.util.Date date19 = instant14.toDate();
        boolean boolean20 = instant14.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime21 = instant14.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, readableInstant23);
        java.lang.String str25 = gJChronology24.toString();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology24.dayOfYear();
        int int27 = instant14.get(dateTimeField26);
        boolean boolean29 = instant14.isBefore((-1L));
        boolean boolean30 = instant14.isBeforeNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "GJChronology[+10:00]" + "'", str25, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 278 + "'", int27 == 278);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        long long12 = dateTimeZone5.convertLocalToUTC((-35999900L), false);
        long long15 = dateTimeZone5.adjustOffset((long) '#', false);
        long long17 = dateTimeZone5.previousTransition((long) 4);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19);
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology20.getZone();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.dayOfYear();
        org.joda.time.Instant instant24 = gJChronology20.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant26 = instant24.minus(readableDuration25);
        org.joda.time.Instant instant29 = instant26.withDurationAdded((-12219292800000L), 0);
        boolean boolean31 = instant26.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, readableInstant33);
        org.joda.time.Chronology chronology35 = gJChronology34.withUTC();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology34.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology34.millisOfDay();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology34.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField39 = gJChronology34.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology34.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology34.monthOfYear();
        boolean boolean42 = instant26.equals((java.lang.Object) dateTimeField41);
        org.joda.time.Instant instant44 = instant26.withMillis(1L);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        boolean boolean46 = instant44.isSupported(dateTimeFieldType45);
        boolean boolean47 = instant44.isBeforeNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, (org.joda.time.ReadableInstant) instant44, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-71999900L) + "'", long12 == (-71999900L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 4L + "'", long17 == 4L);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(instant44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField4 = julianChronology2.hours();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = julianChronology2.get(readablePeriod6, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = julianChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekyearOfCentury();
        org.joda.time.Chronology chronology10 = julianChronology3.withUTC();
        java.lang.Class<?> wildcardClass11 = julianChronology3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis((long) 3600000, (int) '4', 278, 1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology15 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        long long18 = dateTimeZone16.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean23 = dateTimeZone21.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone25);
        boolean boolean29 = julianChronology27.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology30 = julianChronology27.withUTC();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology32 = julianChronology27.withZone(dateTimeZone31);
        long long34 = dateTimeZone21.getMillisKeepLocal(dateTimeZone31, 10L);
        org.joda.time.Chronology chronology35 = gJChronology2.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology36 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField37 = gJChronology2.years();
        org.joda.time.Chronology chronology38 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField39 = gJChronology2.eras();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-12219292800000L) + "'", long18 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 11L + "'", long34 == 11L);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(durationField39);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        boolean boolean12 = julianChronology10.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology13 = julianChronology10.withUTC();
        org.joda.time.DateTimeZone dateTimeZone14 = julianChronology10.getZone();
        org.joda.time.Chronology chronology15 = gJChronology2.withZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = gJChronology2.get(readablePeriod16, (-35999968L), (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField13 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.dayOfMonth();
        int int16 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = gJChronology2.get(readablePartial17, (-35999890L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant8.minus(readableDuration24);
        java.util.Date date26 = instant8.toDate();
        org.joda.time.DateTime dateTime27 = instant8.toDateTimeISO();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 10:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.getDateTimeMillis((int) '4', (int) 'a', (-1), 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        org.joda.time.Chronology chronology10 = julianChronology3.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.weeks();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.yearOfEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant10 = new org.joda.time.Instant((java.lang.Object) gJChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.GJChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        java.lang.Class<?> wildcardClass8 = dateTimeField7.getClass();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = gJChronology2.minutes();
        java.lang.Class<?> wildcardClass9 = durationField8.getClass();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        long long9 = gJChronology2.add((long) (byte) 1, (long) (short) 100, (int) '4');
        org.joda.time.DurationField durationField10 = gJChronology2.weeks();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 5201L + "'", long9 == 5201L);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology2.getZone();
        int int9 = dateTimeZone7.getOffset((long) 1);
        org.joda.time.Instant instant11 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant11.plus(readableDuration12);
        org.joda.time.Instant instant15 = new org.joda.time.Instant(1L);
        boolean boolean16 = instant11.isEqual((org.joda.time.ReadableInstant) instant15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology18 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant11, 1582);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 1582");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36000000 + "'", int9 == 36000000);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (-107999990L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfDay();
        org.joda.time.ReadablePartial readablePartial7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology2.get(readablePartial7, 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField13 = gJChronology2.centuries();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.set(readablePartial14, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("+00:00:00.097", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.ReadablePartial readablePartial3 = null;
        int[] intArray9 = new int[] { 0, (byte) 100, ' ', 3600000, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology2.validate(readablePartial3, intArray9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 100, 32, 3600000, 10]");
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology2.get(readablePartial8, (-107999950L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DurationField durationField5 = gJChronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology2.get(readablePeriod8, (long) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("+00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00:00.001\" is malformed at \":00:00.001\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField11 = gJChronology2.weekyears();
        java.lang.Class<?> wildcardClass12 = durationField11.getClass();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long7 = chronology3.set(readablePartial5, (-35999968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology11 = julianChronology10.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = chronology11.getDateTimeMillis((int) (short) 1, (int) (byte) 1, 278, (int) (byte) 0, (int) (byte) 10, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 278 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        boolean boolean4 = instant3.isAfterNow();
        org.joda.time.DateTime dateTime5 = instant3.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        boolean boolean9 = dateTimeZone7.isFixed();
        int int11 = dateTimeZone7.getOffset(100L);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime5.toMutableDateTime(dateTimeZone7);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 36000000 + "'", int11 == 36000000);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = julianChronology3.getDateTimeMillis((long) ' ', (int) (short) 100, (int) (byte) 10, (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970-01-01T00:00:00.001Z");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = instant4.get(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant4);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.Chronology chronology14 = gJChronology13.withUTC();
        java.lang.String str15 = gJChronology13.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology13.dayOfWeek();
        org.joda.time.Instant instant19 = gJChronology13.getGregorianCutover();
        boolean boolean20 = instant8.equals((java.lang.Object) gJChronology13);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = instant8.get(dateTimeFieldType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[+10:00]" + "'", str15, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DurationField durationField5 = gJChronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.era();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology2.get(readablePartial8, (-12219328800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DurationField durationField8 = julianChronology3.years();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology3.getDateTimeMillis((int) ' ', 4, 0, 278);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.set(readablePartial9, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        java.lang.String str19 = dateTimeZone8.getNameKey((long) (short) 100);
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.Instant instant22 = new org.joda.time.Instant(36000001L);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Instant instant24 = instant22.plus(readableDuration23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) instant24, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(julianChronology20);
        org.junit.Assert.assertNotNull(instant24);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        long long24 = instant8.getMillis();
        org.joda.time.Instant instant27 = instant8.withDurationAdded((long) '#', 278);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone29.getName(0L, locale31);
        java.lang.String str34 = dateTimeZone29.getName((-71999990L));
        org.joda.time.DateTime dateTime35 = instant27.toDateTime(dateTimeZone29);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = instant27.get(dateTimeFieldType36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 36000000L + "'", long24 == 36000000L);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.097" + "'", str32, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.097" + "'", str34, "+00:00:00.097");
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfDay();
        java.lang.String str7 = gJChronology2.toString();
        org.joda.time.DurationField durationField8 = gJChronology2.seconds();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = gJChronology2.get(readablePeriod9, (-71999990L), 52L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[+10:00]" + "'", str7, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTime dateTime10 = instant8.toDateTime();
        boolean boolean11 = instant8.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology14.getZone();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.dayOfYear();
        org.joda.time.Instant instant18 = gJChronology14.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.Instant instant20 = instant18.minus(readableDuration19);
        org.joda.time.Instant instant23 = instant20.withDurationAdded((-12219292800000L), 0);
        org.joda.time.DateTime dateTime24 = instant23.toDateTime();
        int int25 = instant8.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        org.joda.time.ReadablePartial readablePartial3 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long5 = gJChronology0.set(readablePartial3, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant9);
        java.lang.String str11 = instant9.toString();
        int int12 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant9);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology15.getZone();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology15.dayOfYear();
        org.joda.time.Instant instant19 = gJChronology15.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime22 = instant19.toMutableDateTime(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = instant19.toDateTime();
        java.util.Date date24 = instant19.toDate();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology27.getZone();
        org.joda.time.DateTimeZone dateTimeZone30 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str31 = dateTimeZone30.getID();
        org.joda.time.Chronology chronology32 = gJChronology27.withZone(dateTimeZone30);
        java.lang.String str34 = dateTimeZone30.getName((long) (byte) 10);
        java.util.TimeZone timeZone35 = dateTimeZone30.toTimeZone();
        long long39 = dateTimeZone30.convertLocalToUTC((long) 10, false, (long) (byte) 10);
        boolean boolean40 = instant19.equals((java.lang.Object) (byte) 10);
        int int41 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology43 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str11, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "+10:00" + "'", str31, "+10:00");
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+10:00" + "'", str34, "+10:00");
        org.junit.Assert.assertNotNull(timeZone35);
        org.junit.Assert.assertEquals(timeZone35.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-35999990L) + "'", long39 == (-35999990L));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        int int10 = dateTimeZone7.getOffsetFromLocal((long) ' ');
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology12 = gJChronology2.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField13 = gJChronology2.weeks();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = gJChronology2.get(readablePeriod14, (long) '4', 35999999L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.getDateTimeMillis((int) (byte) 0, 1, 3600000, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600000 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = julianChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = julianChronology3.getDateTimeMillis((long) 3600000, (-1), (int) (short) 0, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.year();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology3.getZone();
        java.util.Locale locale8 = null;
        java.lang.String str9 = dateTimeZone6.getName((-52L), locale8);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.ReadableInstant readableInstant5 = null;
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone4, readableInstant5);
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology6.getZone();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology6.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology6.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology6.getZone();
        org.joda.time.Chronology chronology11 = julianChronology2.withZone(dateTimeZone10);
        org.joda.time.DateTimeField dateTimeField12 = julianChronology2.millisOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(gJChronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant8.plus(readableDuration12);
        java.util.Date date14 = instant13.toDate();
        org.joda.time.Instant instant16 = instant13.plus(35L);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = instant16.get(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertNotNull(instant16);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.weeks();
        org.joda.time.DurationField durationField5 = julianChronology3.millis();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = julianChronology3.getDateTimeMillis(4, 4, 36000000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = julianChronology3.getDateTimeMillis((long) 0, (int) (byte) 100, (int) '4', 278, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("JulianChronology[+00:00:00.001]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.dayOfYear();
        org.joda.time.Instant instant14 = gJChronology10.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime17 = instant14.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = instant14.toDateTime();
        java.util.Date date19 = instant14.toDate();
        boolean boolean20 = gJChronology2.equals((java.lang.Object) instant14);
        org.joda.time.Instant instant21 = instant14.toInstant();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(instant21);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.dayOfYear();
        java.lang.Class<?> wildcardClass7 = gJChronology2.getClass();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("GJChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'GJChronology[UTC]' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.weeks();
        org.joda.time.DurationField durationField5 = julianChronology3.millis();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = julianChronology3.getDateTimeMillis(4, (int) 'a', (int) (short) -1, (int) (byte) 1, 1582, 3600000, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1582 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.equals((java.lang.Object) (-35999900L));
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        java.lang.String str15 = gJChronology14.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.dayOfYear();
        java.lang.String str17 = gJChronology14.toString();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology14.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology14.monthOfYear();
        int int20 = mutableDateTime9.get(dateTimeField19);
        org.joda.time.Chronology chronology21 = mutableDateTime9.getChronology();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[+10:00]" + "'", str15, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GJChronology[+10:00]" + "'", str17, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str13 = dateTimeZone12.getID();
        boolean boolean14 = dateTimeZone12.isFixed();
        long long16 = dateTimeZone12.previousTransition(100L);
        java.util.TimeZone timeZone17 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.Chronology chronology19 = julianChronology3.withZone(dateTimeZone18);
        org.joda.time.ReadablePartial readablePartial20 = null;
        int[] intArray21 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            chronology19.validate(readablePartial20, intArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+10:00" + "'", str13, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[]");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone11 = julianChronology3.getZone();
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = julianChronology3.set(readablePartial12, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.year();
        org.joda.time.DurationField durationField5 = julianChronology3.eras();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = julianChronology3.get(readablePeriod6, (long) '#', 35999999L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis(0, 0, (int) '4', 278);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        java.lang.Class<?> wildcardClass10 = durationField9.getClass();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTime dateTime10 = instant8.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime10.toDateTime(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray11 = new int[] { 1, (byte) 100, 1582 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial7, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 100, 1582]");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DurationField durationField8 = julianChronology3.years();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = julianChronology3.set(readablePartial10, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        java.util.Locale locale4 = null;
        java.lang.String str5 = dateTimeZone1.getName((-1L), locale4);
        org.joda.time.LocalDateTime localDateTime6 = null;
        boolean boolean7 = dateTimeZone1.isLocalDateTimeGap(localDateTime6);
        boolean boolean9 = dateTimeZone1.isStandardOffset(36000000L);
        java.lang.String str10 = dateTimeZone1.toString();
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.DateTimeZone dateTimeZone15 = gJChronology14.getZone();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology14.getZone();
        org.joda.time.Instant instant20 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, (org.joda.time.ReadableInstant) instant20);
        java.lang.String str22 = instant20.toString();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.ReadableInstant readableInstant24 = null;
        org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, readableInstant24);
        org.joda.time.DateTimeZone dateTimeZone26 = gJChronology25.getZone();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology25.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology25.dayOfYear();
        org.joda.time.Instant instant29 = gJChronology25.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Instant instant31 = instant29.minus(readableDuration30);
        org.joda.time.Instant instant34 = instant31.withDurationAdded((-12219292800000L), 0);
        int int35 = instant20.compareTo((org.joda.time.ReadableInstant) instant31);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant37 = instant20.minus(readableDuration36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology39 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant20, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+10:00" + "'", str5, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "+10:00" + "'", str10, "+10:00");
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str22, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(instant37);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        java.lang.String str9 = instant6.toString();
        org.joda.time.Instant instant11 = instant6.minus((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.Chronology chronology15 = gJChronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.millisOfDay();
        org.joda.time.DurationField durationField18 = gJChronology14.halfdays();
        org.joda.time.DurationField durationField19 = gJChronology14.millis();
        org.joda.time.DateTime dateTime20 = instant11.toDateTime((org.joda.time.Chronology) gJChronology14);
        org.joda.time.ReadableInstant readableInstant21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = dateTime20.compareTo(readableInstant21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str9, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.months();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis((int) (short) 100, (int) (short) 1, (int) ' ', 3600000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.dayOfWeek();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = gJChronology2.get(readablePartial8, 11L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = gJChronology2.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = gJChronology2.getDateTimeMillis((int) (byte) 0, (int) (byte) 0, (int) (byte) 1, 36000000, 0, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = julianChronology3.getDateTimeMillis(0L, (int) (byte) 0, (int) (byte) 10, 36000000, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("1970-01-01T00:00:00.001Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.dayOfYear();
        org.joda.time.Instant instant9 = gJChronology5.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.minus(readableDuration10);
        org.joda.time.Instant instant14 = instant11.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant11.plus(readableDuration15);
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) instant16);
        org.joda.time.DateTimeField dateTimeField18 = gJChronology17.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = gJChronology17.get(readablePartial19, 36000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology15 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        long long18 = dateTimeZone16.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean23 = dateTimeZone21.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone25);
        boolean boolean29 = julianChronology27.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology30 = julianChronology27.withUTC();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology32 = julianChronology27.withZone(dateTimeZone31);
        long long34 = dateTimeZone21.getMillisKeepLocal(dateTimeZone31, 10L);
        org.joda.time.Chronology chronology35 = gJChronology2.withZone(dateTimeZone31);
        long long37 = dateTimeZone31.nextTransition((long) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (-107999950L), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-12219292800000L) + "'", long18 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 11L + "'", long34 == 11L);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = gJChronology2.centuries();
        org.joda.time.DurationField durationField9 = gJChronology2.centuries();
        org.joda.time.ReadablePartial readablePartial10 = null;
        int[] intArray14 = new int[] { (byte) 100, 100, '#' };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial10, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 100, 35]");
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology15 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        long long18 = dateTimeZone16.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone16);
        long long22 = dateTimeZone16.convertLocalToUTC((-71999990L), false);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology24 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone16, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-12219292800000L) + "'", long18 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-107999990L) + "'", long22 == (-107999990L));
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = gJChronology9.toString();
        org.joda.time.DurationField durationField11 = gJChronology9.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.weekyear();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology9.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology9.getDateTimeMillis((-1), (int) (short) -1, (int) (byte) 10, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GJChronology[+10:00,cutover=1970-01-01T10:00:00.000Z]" + "'", str10, "GJChronology[+10:00,cutover=1970-01-01T10:00:00.000Z]");
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant6 = new org.joda.time.Instant((java.lang.Object) gJChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.GJChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        long long8 = gJChronology2.add(readablePeriod5, (-35999900L), (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis((int) (byte) -1, 278, (int) (byte) 100, (int) (byte) 1, (int) '#', 36000000, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-35999900L) + "'", long8 == (-35999900L));
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("GJChronology[+10:00,cutover=1970-01-01T10:00:00.000Z]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"GJChronology[+10:00,cutover=1970...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField13 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.secondOfDay();
        long long18 = gJChronology2.add((long) 9, 0L, 0);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray22 = gJChronology2.get(readablePeriod19, 151199999L, (-59082429599991L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9L + "'", long18 == 9L);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        org.joda.time.Instant instant11 = instant6.toInstant();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(instant11);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gJChronology2.getDateTimeMillis(0, (int) '4', 0, (int) (byte) 100, (int) ' ', (-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.dayOfYear();
        org.joda.time.Instant instant14 = gJChronology10.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime17 = instant14.toMutableDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = instant14.toDateTime();
        java.util.Date date19 = instant14.toDate();
        boolean boolean20 = gJChronology2.equals((java.lang.Object) instant14);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int22 = instant14.get(dateTimeFieldType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(mutableDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(date19);
        org.junit.Assert.assertEquals(date19.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.halfdays();
        org.joda.time.DurationField durationField2 = gJChronology0.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant3 = new org.joda.time.Instant((java.lang.Object) gJChronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.GJChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(durationField2);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = gJChronology2.get(readablePartial5, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = julianChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.yearOfEra();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = julianChronology3.get(readablePeriod11, (long) 1582);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis(36000000, (int) '#', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField8 = gJChronology2.seconds();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = gJChronology2.get(readablePartial9, 110L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.Instant instant3 = instant1.plus(110L);
        boolean boolean5 = instant3.isAfter((long) 36000000);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = instant3.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        org.joda.time.DurationField durationField5 = julianChronology3.weeks();
        org.joda.time.DurationField durationField6 = julianChronology3.days();
        org.joda.time.DurationField durationField7 = julianChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.hourOfHalfday();
        org.joda.time.Chronology chronology9 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.era();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = julianChronology3.getDateTimeMillis((int) (byte) 100, 3600000, (int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = julianChronology3.getDateTimeMillis(10, 0, 1, (-1), 1, (int) (byte) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        org.joda.time.Instant instant8 = instant6.toInstant();
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTime();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        long long8 = instant6.getMillis();
        org.joda.time.DateTimeZone dateTimeZone9 = instant6.getZone();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-12219292800000L) + "'", long8 == (-12219292800000L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField11 = gJChronology2.weekyears();
        org.joda.time.DurationField durationField12 = gJChronology2.centuries();
        org.joda.time.DurationField durationField13 = gJChronology2.minutes();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DurationField durationField1 = gJChronology0.halfdays();
        org.joda.time.DateTimeField dateTimeField2 = gJChronology0.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = gJChronology0.getDateTimeMillis(0, (int) (byte) 0, (int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(durationField1);
        org.junit.Assert.assertNotNull(dateTimeField2);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        java.util.Date date5 = instant1.toDate();
        org.joda.time.Instant instant7 = instant1.plus((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        boolean boolean9 = instant7.isSupported(dateTimeFieldType8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = instant7.get(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Jan 01 10:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) -1);
        java.lang.String str3 = dateTimeZone1.getNameKey((-71999900L));
        boolean boolean4 = dateTimeZone1.isFixed();
        java.lang.Class<?> wildcardClass5 = dateTimeZone1.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone4 = julianChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6);
        org.joda.time.Chronology chronology8 = gJChronology7.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology7.dayOfWeek();
        org.joda.time.Chronology chronology10 = gJChronology7.withUTC();
        org.joda.time.DurationField durationField11 = gJChronology7.halfdays();
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology7.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, readableInstant14);
        org.joda.time.Chronology chronology16 = gJChronology15.withUTC();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology15.dayOfWeek();
        org.joda.time.Chronology chronology18 = gJChronology15.withUTC();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.Chronology chronology21 = chronology18.withZone(dateTimeZone20);
        java.lang.String str22 = dateTimeZone20.getID();
        org.joda.time.Chronology chronology23 = gJChronology7.withZone(dateTimeZone20);
        long long25 = dateTimeZone20.convertUTCToLocal((-107999990L));
        org.joda.time.Chronology chronology26 = julianChronology2.withZone(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant27 = new org.joda.time.Instant((java.lang.Object) julianChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.JulianChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(gJChronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00:00.001" + "'", str22, "+00:00:00.001");
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-107999989L) + "'", long25 == (-107999989L));
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = gJChronology2.weeks();
        org.joda.time.Chronology chronology7 = gJChronology2.withUTC();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = gJChronology2.get(readablePeriod8, (-62112218399999L), 187199999L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        java.lang.String str8 = gJChronology2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.getDateTimeMillis((int) '#', 10, (-1), 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[+10:00]" + "'", str8, "GJChronology[+10:00]");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        int int19 = dateTimeZone8.getOffset((-35999900L));
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField21 = julianChronology20.months();
        // The following exception was thrown during execution in test generation
        try {
            long long26 = julianChronology20.getDateTimeMillis((int) (byte) 10, (int) (short) 100, 10, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertNotNull(julianChronology20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        long long24 = instant8.getMillis();
        org.joda.time.Instant instant27 = instant8.withDurationAdded((long) '#', 278);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        java.util.Locale locale31 = null;
        java.lang.String str32 = dateTimeZone29.getName(0L, locale31);
        java.lang.String str34 = dateTimeZone29.getName((-71999990L));
        org.joda.time.DateTime dateTime35 = instant27.toDateTime(dateTimeZone29);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int37 = instant27.get(dateTimeFieldType36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 36000000L + "'", long24 == 36000000L);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00:00.097" + "'", str32, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00:00.097" + "'", str34, "+00:00:00.097");
        org.junit.Assert.assertNotNull(dateTime35);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        java.lang.String str9 = instant6.toString();
        org.joda.time.Instant instant11 = instant6.minus((long) 36000000);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = instant6.toString(dateTimeFormatter12);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', 1);
        org.joda.time.DateTime dateTime17 = instant6.toDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19);
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology20.getZone();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology20.getZone();
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone24, (org.joda.time.ReadableInstant) instant26);
        java.lang.String str28 = instant26.toString();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.ReadableInstant readableInstant30 = null;
        org.joda.time.chrono.GJChronology gJChronology31 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone29, readableInstant30);
        org.joda.time.DateTimeZone dateTimeZone32 = gJChronology31.getZone();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology31.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology31.dayOfYear();
        org.joda.time.Instant instant35 = gJChronology31.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.Instant instant37 = instant35.minus(readableDuration36);
        org.joda.time.Instant instant40 = instant37.withDurationAdded((-12219292800000L), 0);
        int int41 = instant26.compareTo((org.joda.time.ReadableInstant) instant37);
        long long42 = instant26.getMillis();
        org.joda.time.Instant instant45 = instant26.withDurationAdded((long) '#', 278);
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetMillis((int) 'a');
        java.util.Locale locale49 = null;
        java.lang.String str50 = dateTimeZone47.getName(0L, locale49);
        java.lang.String str52 = dateTimeZone47.getName((-71999990L));
        org.joda.time.DateTime dateTime53 = instant45.toDateTime(dateTimeZone47);
        boolean boolean54 = dateTime17.isBefore((org.joda.time.ReadableInstant) instant45);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str9, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str13, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str28, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(instant37);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 36000000L + "'", long42 == 36000000L);
        org.junit.Assert.assertNotNull(instant45);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "+00:00:00.097" + "'", str50, "+00:00:00.097");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "+00:00:00.097" + "'", str52, "+00:00:00.097");
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.clockhourOfDay();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.Chronology chronology3 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField5 = chronology3.halfdays();
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GJChronology[+10:00]" + "'", str2, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DurationField durationField8 = julianChronology3.years();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = julianChronology3.getDateTimeMillis(1, (int) (byte) 0, (int) (byte) 10, (-1), (int) (byte) 10, (int) ' ', 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.getID();
        boolean boolean3 = dateTimeZone1.isFixed();
        long long5 = dateTimeZone1.previousTransition(100L);
        org.joda.time.chrono.JulianChronology julianChronology6 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        java.lang.String str7 = dateTimeZone1.getID();
        int int9 = dateTimeZone1.getOffsetFromLocal((long) 1);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.chrono.GJChronology gJChronology12 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, readableInstant11);
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology12.getZone();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology12.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology12.dayOfYear();
        org.joda.time.Instant instant16 = gJChronology12.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.Instant instant18 = instant16.minus(readableDuration17);
        java.lang.String str19 = instant16.toString();
        org.joda.time.Instant instant21 = instant16.minus((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, readableInstant23);
        org.joda.time.Chronology chronology25 = gJChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology24.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology24.millisOfDay();
        org.joda.time.DurationField durationField28 = gJChronology24.halfdays();
        org.joda.time.DurationField durationField29 = gJChronology24.millis();
        org.joda.time.DateTime dateTime30 = instant21.toDateTime((org.joda.time.Chronology) gJChronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, (org.joda.time.ReadableInstant) dateTime30, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(julianChronology6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36000000 + "'", int9 == 36000000);
        org.junit.Assert.assertNotNull(gJChronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(instant18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str19, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.seconds();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = julianChronology3.get(readablePartial10, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Chronology chronology9 = instant6.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = instant6.get(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.months();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis(0, 100, 10, (int) (short) -1, (int) 'a', (int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("JulianChronology[+00:00:00.001]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"JulianChronology[+00:00:00.001]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.ReadablePartial readablePartial4 = null;
        int[] intArray5 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            chronology3.validate(readablePartial4, intArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(intArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray5), "[]");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        org.joda.time.Chronology chronology9 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.dayOfYear();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.secondOfMinute();
        org.joda.time.DurationField durationField6 = gJChronology2.eras();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray11 = new int[] { '#', 1, '#' };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial7, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[35, 1, 35]");
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.year();
        org.joda.time.DurationField durationField5 = julianChronology3.eras();
        java.lang.Class<?> wildcardClass6 = julianChronology3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        boolean boolean13 = instant8.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.Chronology chronology17 = gJChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.monthOfYear();
        boolean boolean24 = instant8.equals((java.lang.Object) dateTimeField23);
        boolean boolean26 = instant8.isBefore((long) ' ');
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology29 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, readableInstant31);
        org.joda.time.DateTimeZone dateTimeZone33 = gJChronology32.getZone();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.dayOfYear();
        org.joda.time.Instant instant36 = gJChronology32.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Instant instant38 = instant36.minus(readableDuration37);
        org.joda.time.Instant instant41 = instant38.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration42 = null;
        org.joda.time.Instant instant43 = instant38.plus(readableDuration42);
        org.joda.time.chrono.GJChronology gJChronology44 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, (org.joda.time.ReadableInstant) instant43);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.ReadableInstant readableInstant46 = null;
        org.joda.time.chrono.GJChronology gJChronology47 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone45, readableInstant46);
        org.joda.time.DateTimeZone dateTimeZone48 = gJChronology47.getZone();
        org.joda.time.DateTimeField dateTimeField49 = gJChronology47.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField50 = gJChronology47.dayOfYear();
        org.joda.time.Instant instant51 = gJChronology47.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration52 = null;
        org.joda.time.Instant instant53 = instant51.minus(readableDuration52);
        org.joda.time.Instant instant56 = instant53.withDurationAdded((-12219292800000L), 0);
        org.joda.time.MutableDateTime mutableDateTime57 = instant53.toMutableDateTime();
        int int58 = instant43.compareTo((org.joda.time.ReadableInstant) mutableDateTime57);
        boolean boolean59 = instant8.isBefore((org.joda.time.ReadableInstant) mutableDateTime57);
        org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone61);
        boolean boolean63 = dateTimeZone61.isFixed();
        java.util.Locale locale65 = null;
        java.lang.String str66 = dateTimeZone61.getShortName((long) ' ', locale65);
        org.joda.time.DateTime dateTime67 = mutableDateTime57.toDateTime(dateTimeZone61);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(julianChronology29);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertNotNull(gJChronology44);
        org.junit.Assert.assertNotNull(gJChronology47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(instant51);
        org.junit.Assert.assertNotNull(instant53);
        org.junit.Assert.assertNotNull(instant56);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "+10:00" + "'", str66, "+10:00");
        org.junit.Assert.assertNotNull(dateTime67);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        org.joda.time.Chronology chronology10 = julianChronology3.withUTC();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = chronology10.get(readablePeriod11, 10L, (-35999999L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("1582-10-15T00:00:00.000Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant8.plus(readableDuration12);
        org.joda.time.Instant instant14 = instant13.toInstant();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = instant14.get(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(instant14);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int4 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField6 = julianChronology5.centuries();
        org.joda.time.Chronology chronology7 = julianChronology5.withUTC();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology5.yearOfEra();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = julianChronology5.set(readablePartial9, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        boolean boolean12 = julianChronology10.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology13 = julianChronology10.withUTC();
        org.joda.time.DateTimeZone dateTimeZone14 = julianChronology10.getZone();
        org.joda.time.Chronology chronology15 = gJChronology2.withZone(dateTimeZone14);
        org.joda.time.DurationField durationField16 = chronology15.minutes();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = chronology15.get(readablePeriod18, (long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = gJChronology8.add(readablePeriod10, (-12219292800000L), (int) (short) 10);
        org.joda.time.ReadablePartial readablePartial14 = null;
        int[] intArray20 = new int[] { 100, (byte) 1, (byte) 1, (short) 1, (byte) -1 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology8.validate(readablePartial14, intArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-12219292800000L) + "'", long13 == (-12219292800000L));
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[100, 1, 1, 1, -1]");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        int int10 = julianChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = julianChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.centuryOfEra();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant8.plus(readableDuration12);
        org.joda.time.DateTime dateTime14 = instant8.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16);
        org.joda.time.Chronology chronology18 = gJChronology17.withUTC();
        java.lang.String str19 = gJChronology17.toString();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.monthOfYear();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology17.millisOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology17.dayOfWeek();
        org.joda.time.Instant instant23 = gJChronology17.getGregorianCutover();
        int int24 = dateTime14.compareTo((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Instant instant26 = new org.joda.time.Instant((long) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, readableInstant28);
        org.joda.time.DateTimeZone dateTimeZone30 = gJChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology29.dayOfYear();
        org.joda.time.Instant instant33 = gJChronology29.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.minus(readableDuration34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, readableInstant37);
        org.joda.time.Chronology chronology39 = gJChronology38.withUTC();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology38.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology38.millisOfDay();
        int int42 = instant35.get(dateTimeField41);
        boolean boolean43 = instant26.isAfter((org.joda.time.ReadableInstant) instant35);
        int int44 = dateTime14.compareTo((org.joda.time.ReadableInstant) instant26);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GJChronology[+10:00]" + "'", str19, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 36000000 + "'", int42 == 36000000);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DurationField durationField5 = gJChronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gJChronology2.getDateTimeMillis((int) (byte) 100, (int) (short) 1, 19, 10, 0, (int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        org.joda.time.DurationField durationField8 = gJChronology2.eras();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.seconds();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.year();
        org.joda.time.DateTimeZone dateTimeZone12 = julianChronology3.getZone();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        long long16 = julianChronology3.add(readablePeriod13, (-35999900L), (int) '#');
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long19 = julianChronology3.set(readablePartial17, 187199999L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-35999900L) + "'", long16 == (-35999900L));
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("1582-10-15T10:00:00.000+10:00", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis(0, 19, 3600000, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int4 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField6 = julianChronology5.centuries();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology5.secondOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = julianChronology5.get(readablePartial8, (-107999990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(julianChronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.util.Locale locale3 = null;
        java.lang.String str4 = dateTimeZone1.getShortName((long) (short) -1, locale3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str7 = dateTimeZone6.getID();
        boolean boolean8 = dateTimeZone6.isFixed();
        long long10 = dateTimeZone1.getMillisKeepLocal(dateTimeZone6, (long) (byte) 1);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "+10:00" + "'", str4, "+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+10:00" + "'", str7, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.days();
        org.joda.time.DurationField durationField7 = julianChronology3.eras();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray15 = new int[] { '#', (-1), 4, (byte) 10, (byte) 0, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology3.validate(readablePartial8, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[35, -1, 4, 10, 0, 10]");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = julianChronology3.weeks();
        org.joda.time.DateTimeZone dateTimeZone9 = julianChronology3.getZone();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        long long13 = julianChronology3.add(readablePeriod10, 3L, (int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = julianChronology3.get(readablePeriod14, 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 3L + "'", long13 == 3L);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.minuteOfDay();
        boolean boolean12 = julianChronology3.equals((java.lang.Object) dateTimeField11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = julianChronology3.getDateTimeMillis(100, 36000000, (int) (byte) 1, 4, 3600000, 0, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.hourOfHalfday();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long11 = julianChronology3.set(readablePartial9, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.yearOfCentury();
        java.lang.String str12 = julianChronology10.toString();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "JulianChronology[+10:00]" + "'", str12, "JulianChronology[+10:00]");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.Instant instant2 = instant1.toInstant();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.chrono.GJChronology gJChronology5 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, readableInstant4);
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology5.getZone();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology5.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology5.dayOfYear();
        org.joda.time.Instant instant9 = gJChronology5.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.Instant instant11 = instant9.minus(readableDuration10);
        java.lang.String str12 = instant9.toString();
        org.joda.time.Instant instant14 = instant9.minus((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16);
        org.joda.time.Chronology chronology18 = gJChronology17.withUTC();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.millisOfDay();
        org.joda.time.DurationField durationField21 = gJChronology17.halfdays();
        org.joda.time.DurationField durationField22 = gJChronology17.millis();
        org.joda.time.DateTime dateTime23 = instant14.toDateTime((org.joda.time.Chronology) gJChronology17);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTime23.getZone();
        boolean boolean25 = instant2.isBefore((org.joda.time.ReadableInstant) dateTime23);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(gJChronology5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str12, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = gJChronology9.toString();
        long long14 = gJChronology9.add((long) (short) -1, (long) 10, (int) (byte) -1);
        int int15 = gJChronology9.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology9.minuteOfHour();
        java.lang.Class<?> wildcardClass17 = gJChronology9.getClass();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GJChronology[+10:00,cutover=1970-01-01T10:00:00.000Z]" + "'", str10, "GJChronology[+10:00,cutover=1970-01-01T10:00:00.000Z]");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-11L) + "'", long14 == (-11L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField13 = gJChronology2.centuries();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.set(readablePartial14, (-35999968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        org.joda.time.ReadablePartial readablePartial5 = null;
        int[] intArray8 = new int[] { 10, 1582 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology3.validate(readablePartial5, intArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[10, 1582]");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.chrono.GJChronology gJChronology7 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, readableInstant6);
        org.joda.time.Chronology chronology8 = gJChronology7.withUTC();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology11.getZone();
        java.lang.String str14 = dateTimeZone12.getName((long) 0);
        long long17 = dateTimeZone12.adjustOffset(1L, true);
        org.joda.time.Chronology chronology18 = gJChronology7.withZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.ReadableInstant readableInstant20 = null;
        org.joda.time.chrono.GJChronology gJChronology21 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone19, readableInstant20);
        org.joda.time.DateTimeZone dateTimeZone22 = gJChronology21.getZone();
        boolean boolean24 = dateTimeZone22.isStandardOffset((long) ' ');
        java.lang.String str25 = dateTimeZone22.getID();
        boolean boolean26 = dateTimeZone12.equals((java.lang.Object) dateTimeZone22);
        org.joda.time.Chronology chronology27 = gJChronology2.withZone(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, 151200000L, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(gJChronology7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(gJChronology21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+10:00" + "'", str25, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(chronology27);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis(3600000);
        java.lang.String str3 = dateTimeZone1.getNameKey(35L);
        long long5 = dateTimeZone1.nextTransition(278L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 278L + "'", long5 == 278L);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField12 = gJChronology2.months();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = gJChronology2.get(readablePeriod13, (long) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        boolean boolean12 = julianChronology10.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology13 = julianChronology10.withUTC();
        org.joda.time.DateTimeZone dateTimeZone14 = julianChronology10.getZone();
        org.joda.time.Chronology chronology15 = gJChronology2.withZone(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = gJChronology2.get(readablePeriod16, 5201L, (long) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.year();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.millisOfDay();
        org.joda.time.DurationField durationField6 = julianChronology3.weeks();
        org.joda.time.ReadablePartial readablePartial7 = null;
        int[] intArray11 = new int[] { (byte) 1, 'a', (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            julianChronology3.validate(readablePartial7, intArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(intArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[1, 97, -1]");
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant8.plus(readableDuration12);
        org.joda.time.MutableDateTime mutableDateTime14 = instant13.toMutableDateTimeISO();
        java.lang.String str15 = mutableDateTime14.toString();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology19.getZone();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology19.getZone();
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant25);
        java.lang.String str27 = instant25.toString();
        int int28 = dateTimeZone16.getOffset((org.joda.time.ReadableInstant) instant25);
        org.joda.time.Instant instant29 = new org.joda.time.Instant((java.lang.Object) instant25);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone30, readableInstant31);
        org.joda.time.DateTimeZone dateTimeZone33 = gJChronology32.getZone();
        org.joda.time.DateTimeField dateTimeField34 = gJChronology32.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField35 = gJChronology32.clockhourOfHalfday();
        org.joda.time.DurationField durationField36 = gJChronology32.weeks();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology32.halfdayOfDay();
        boolean boolean38 = instant29.equals((java.lang.Object) gJChronology32);
        org.joda.time.DateTime dateTime39 = mutableDateTime14.toDateTime((org.joda.time.Chronology) gJChronology32);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1582-10-15T10:00:00.000+10:00" + "'", str15, "1582-10-15T10:00:00.000+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str27, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(gJChronology32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        java.lang.String str9 = instant6.toString();
        org.joda.time.Instant instant11 = instant6.minus((long) 36000000);
        boolean boolean13 = instant6.isAfter((long) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone15);
        org.joda.time.DurationField durationField18 = julianChronology17.centuries();
        org.joda.time.DurationField durationField19 = julianChronology17.weeks();
        org.joda.time.DurationField durationField20 = julianChronology17.days();
        org.joda.time.DurationField durationField21 = julianChronology17.centuries();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology17.hourOfHalfday();
        org.joda.time.Chronology chronology23 = julianChronology17.withUTC();
        org.joda.time.DateTimeField dateTimeField24 = julianChronology17.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField25 = julianChronology17.minuteOfDay();
        boolean boolean26 = instant6.equals((java.lang.Object) dateTimeField25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int28 = instant6.get(dateTimeFieldType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str9, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(julianChronology17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.millisOfDay();
        org.joda.time.DurationField durationField13 = julianChronology3.millis();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology3.secondOfMinute();
        org.joda.time.DurationField durationField16 = julianChronology3.hours();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.weeks();
        org.joda.time.DurationField durationField5 = julianChronology3.millis();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = julianChronology3.getDateTimeMillis(0, (int) (short) 1, (int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.days();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.weekyear();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray10 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial9, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.yearOfEra();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.set(readablePartial10, 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[+10:00]" + "'", str8, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology2.weekyears();
        org.joda.time.DurationField durationField5 = julianChronology2.minutes();
        java.lang.String str6 = julianChronology2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = julianChronology2.getDateTimeMillis(1582, (int) (byte) 100, (int) (byte) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[+00:00:00.001]" + "'", str6, "JulianChronology[+00:00:00.001]");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.chrono.GJChronology gJChronology0 = org.joda.time.chrono.GJChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = gJChronology0.clockhourOfDay();
        java.lang.String str2 = gJChronology0.toString();
        org.joda.time.DateTimeField dateTimeField3 = gJChronology0.dayOfYear();
        org.joda.time.Chronology chronology4 = gJChronology0.withUTC();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology0.secondOfDay();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = gJChronology0.set(readablePartial6, (-12219328800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "GJChronology[+10:00]" + "'", str2, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        org.joda.time.Chronology chronology9 = gJChronology2.withUTC();
        org.joda.time.Chronology chronology10 = gJChronology2.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology2.getDateTimeMillis(1, (int) (byte) 1, 9, 9, 4, 3600000, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3600000 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.getDateTimeMillis(1, 100, (-1), (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.Instant instant9 = new org.joda.time.Instant(1L);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone10.getShortName((long) (byte) 1, locale12);
        org.joda.time.Chronology chronology14 = julianChronology3.withZone(dateTimeZone10);
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = julianChronology3.get(readablePartial15, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.Chronology chronology14 = gJChronology13.withUTC();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology13.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = gJChronology13.centuries();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology13.secondOfDay();
        org.joda.time.DateTime dateTime21 = instant6.toDateTime((org.joda.time.Chronology) gJChronology13);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology2.centuries();
        org.joda.time.DurationField durationField5 = julianChronology2.weeks();
        org.joda.time.DurationField durationField6 = julianChronology2.days();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = julianChronology2.getDateTimeMillis((int) (short) 1, 1582, 1, 10, (int) (short) 1, (int) (byte) 10, 36000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        java.util.Date date11 = instant6.toDate();
        boolean boolean12 = instant6.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime13 = instant6.toMutableDateTimeISO();
        boolean boolean14 = instant6.isBeforeNow();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = instant6.get(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology2.getDateTimeMillis((int) '4', (int) '#', (int) (short) 0, (int) (short) 100, (int) (byte) 10, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.dayOfMonth();
        org.joda.time.DurationField durationField9 = gJChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis((-59011667999903L), (int) (short) -1, (int) (byte) 10, (int) (short) 0, 1582);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.weeks();
        org.joda.time.DateTimeZone dateTimeZone5 = julianChronology3.getZone();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.monthOfYear();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = julianChronology3.get(readablePeriod8, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.weekyear();
        org.joda.time.Instant instant14 = gJChronology2.getGregorianCutover();
        org.joda.time.Instant instant15 = gJChronology2.getGregorianCutover();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = gJChronology2.getDateTimeMillis((int) (byte) -1, 0, (-1), (int) ' ', (int) (byte) 0, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(instant15);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        int int9 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = gJChronology2.get(readablePeriod10, 71999999L, 35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        long long4 = dateTimeZone2.previousTransition(0L);
        int int6 = dateTimeZone2.getOffset((long) (short) 100);
        boolean boolean7 = dateTimeZone2.isFixed();
        java.lang.String str9 = dateTimeZone2.getNameKey((-59082429599991L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone2, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3600000 + "'", int6 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        java.util.Date date11 = instant6.toDate();
        boolean boolean12 = instant6.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime13 = instant6.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int15 = instant6.get(dateTimeFieldType14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mutableDateTime13);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.clockhourOfHalfday();
        org.joda.time.Chronology chronology11 = gJChronology9.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.era();
        org.joda.time.ReadablePartial readablePartial13 = null;
        int[] intArray17 = new int[] { 1582, 100, 69 };
        // The following exception was thrown during execution in test generation
        try {
            chronology11.validate(readablePartial13, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[1582, 100, 69]");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.Chronology chronology14 = gJChronology13.withUTC();
        java.lang.String str15 = gJChronology13.toString();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.monthOfYear();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology13.millisOfDay();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology13.dayOfWeek();
        org.joda.time.Instant instant19 = gJChronology13.getGregorianCutover();
        boolean boolean20 = instant8.equals((java.lang.Object) gJChronology13);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = gJChronology13.get(readablePeriod21, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "GJChronology[+10:00]" + "'", str15, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.seconds();
        org.joda.time.DurationField durationField7 = gJChronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) gJChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.GJChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.year();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = julianChronology3.getZone();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = julianChronology3.get(readablePeriod7, 151199999L, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.minuteOfDay();
        boolean boolean12 = julianChronology3.equals((java.lang.Object) dateTimeField11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.secondOfMinute();
        int int14 = julianChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone16);
        boolean boolean20 = julianChronology18.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField21 = julianChronology18.months();
        boolean boolean22 = julianChronology3.equals((java.lang.Object) julianChronology18);
        org.joda.time.Chronology chronology23 = julianChronology18.withUTC();
        org.joda.time.Chronology chronology24 = chronology23.withUTC();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        int int4 = dateTimeZone1.getOffsetFromLocal((long) ' ');
        org.joda.time.chrono.JulianChronology julianChronology5 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = julianChronology5.set(readablePartial6, 3600000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 36000000 + "'", int4 == 36000000);
        org.junit.Assert.assertNotNull(julianChronology5);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = julianChronology10.getZone();
        org.joda.time.DurationField durationField13 = julianChronology10.weeks();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        java.lang.String str6 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.year();
        org.joda.time.DurationField durationField8 = gJChronology2.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) gJChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.GJChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GJChronology[+10:00]" + "'", str6, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        java.lang.String str9 = dateTimeZone5.getName((long) (byte) 10);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone5);
        org.joda.time.Chronology chronology11 = julianChronology10.withUTC();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean15 = dateTimeZone13.isStandardOffset((long) (-1));
        long long19 = dateTimeZone13.convertLocalToUTC((long) 4, true, (long) (short) -1);
        long long21 = dateTimeZone13.convertUTCToLocal((-35999900L));
        org.joda.time.Chronology chronology22 = julianChronology10.withZone(dateTimeZone13);
        java.lang.String str24 = dateTimeZone13.getShortName(400L);
        long long26 = dateTimeZone13.previousTransition((long) 10);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+10:00" + "'", str9, "+10:00");
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 3L + "'", long19 == 3L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-35999899L) + "'", long21 == (-35999899L));
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00:00.001" + "'", str24, "+00:00:00.001");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant8.plus(readableDuration12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.DateTimeZone dateTimeZone17 = gJChronology16.getZone();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.dayOfYear();
        org.joda.time.Instant instant20 = gJChronology16.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant20.minus(readableDuration21);
        org.joda.time.Instant instant25 = instant22.withDurationAdded((-12219292800000L), 0);
        boolean boolean27 = instant22.isEqual(35L);
        boolean boolean28 = instant8.isAfter((org.joda.time.ReadableInstant) instant22);
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int30 = instant22.get(dateTimeFieldType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology8.weekOfWeekyear();
        org.joda.time.DurationField durationField10 = gJChronology8.years();
        org.joda.time.DurationField durationField11 = gJChronology8.minutes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.centuryOfEra();
        org.joda.time.DurationField durationField8 = gJChronology2.seconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant9 = new org.joda.time.Instant((java.lang.Object) durationField8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        boolean boolean2 = dateTimeZone1.isFixed();
        long long4 = dateTimeZone1.convertUTCToLocal((long) ' ');
        java.lang.String str5 = dateTimeZone1.getID();
        java.lang.String str7 = dateTimeZone1.getNameKey((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, 18684000000L, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 32");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str2 = dateTimeZone1.getID();
        boolean boolean3 = dateTimeZone1.isFixed();
        long long5 = dateTimeZone1.previousTransition(100L);
        java.util.TimeZone timeZone6 = dateTimeZone1.toTimeZone();
        java.util.TimeZone timeZone7 = dateTimeZone1.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.Instant instant10 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Instant instant12 = instant10.plus(readableDuration11);
        boolean boolean13 = instant12.isAfterNow();
        org.joda.time.DateTime dateTime14 = instant12.toDateTime();
        org.joda.time.chrono.GJChronology gJChronology15 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "+10:00" + "'", str2, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(gJChronology15);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.era();
        long long12 = julianChronology3.add((long) (short) 0, (long) (byte) -1, (int) '4');
        org.joda.time.Chronology chronology13 = julianChronology3.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology13.getDateTimeMillis(10, (int) (short) 10, 0, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-52L) + "'", long12 == (-52L));
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, readableInstant2);
        org.joda.time.DateTimeZone dateTimeZone4 = gJChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology3.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = gJChronology3.getZone();
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant9);
        java.lang.String str11 = instant9.toString();
        int int12 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant) instant9);
        org.joda.time.Instant instant13 = new org.joda.time.Instant((java.lang.Object) instant9);
        org.joda.time.Instant instant14 = new org.joda.time.Instant((java.lang.Object) instant13);
        java.util.Date date15 = instant14.toDate();
        org.joda.time.Instant instant17 = instant14.withMillis((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19);
        org.joda.time.Chronology chronology21 = gJChronology20.withUTC();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.millisOfDay();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology20.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology20.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.ReadableInstant readableInstant27 = null;
        org.joda.time.chrono.GJChronology gJChronology28 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26, readableInstant27);
        org.joda.time.DateTimeZone dateTimeZone29 = gJChronology28.getZone();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str32 = dateTimeZone31.getID();
        org.joda.time.Chronology chronology33 = gJChronology28.withZone(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone34 = gJChronology28.getZone();
        long long36 = dateTimeZone34.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology37 = gJChronology20.withZone(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone39 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean41 = dateTimeZone39.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone43 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone43);
        org.joda.time.chrono.JulianChronology julianChronology45 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone43);
        boolean boolean47 = julianChronology45.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology48 = julianChronology45.withUTC();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology50 = julianChronology45.withZone(dateTimeZone49);
        long long52 = dateTimeZone39.getMillisKeepLocal(dateTimeZone49, 10L);
        org.joda.time.Chronology chronology53 = gJChronology20.withZone(dateTimeZone49);
        long long55 = dateTimeZone49.nextTransition((long) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime56 = instant14.toMutableDateTime(dateTimeZone49);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int58 = instant14.get(dateTimeFieldType57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(gJChronology3);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str11, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 10:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(gJChronology28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+10:00" + "'", str32, "+10:00");
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-12219292800000L) + "'", long36 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(julianChronology45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 11L + "'", long52 == 11L);
        org.junit.Assert.assertNotNull(chronology53);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + (-1L) + "'", long55 == (-1L));
        org.junit.Assert.assertNotNull(mutableDateTime56);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.Chronology chronology9 = julianChronology3.withUTC();
        long long13 = chronology9.add((-35999890L), (-62112218399999L), (int) (byte) 100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-6211221875999790L) + "'", long13 == (-6211221875999790L));
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.weekyear();
        org.joda.time.DurationField durationField7 = julianChronology3.days();
        org.joda.time.Chronology chronology8 = julianChronology3.withUTC();
        long long12 = julianChronology3.add((long) (byte) 0, 4L, (int) (byte) 100);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = julianChronology3.get(readablePeriod13, (-36000000L), (long) 1582);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 400L + "'", long12 == 400L);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.millisOfDay();
        org.joda.time.DurationField durationField8 = chronology6.millis();
        org.joda.time.DurationField durationField9 = chronology6.minutes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.millisOfDay();
        org.joda.time.DurationField durationField13 = julianChronology3.millis();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology3.clockhourOfHalfday();
        java.lang.String str15 = julianChronology3.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "JulianChronology[+10:00]" + "'", str15, "JulianChronology[+10:00]");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = gJChronology2.centuries();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfDay();
        int int10 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField11 = gJChronology2.days();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 4, true, (long) (short) -1);
        long long9 = dateTimeZone1.convertUTCToLocal((-35999900L));
        long long11 = dateTimeZone1.previousTransition(278L);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-35999899L) + "'", long9 == (-35999899L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 278L + "'", long11 == 278L);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.Instant instant13 = instant8.plus(readableDuration12);
        org.joda.time.MutableDateTime mutableDateTime14 = instant13.toMutableDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = instant13.get(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1, 0L, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.Instant instant1 = org.joda.time.Instant.parse("1970-01-01T00:00:00.001Z");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 10);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = instant4.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant1);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = julianChronology2.getDateTimeMillis(278, 0, 0, (int) (short) 1, 10, (int) '#', (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis((int) '4', (int) '#', (int) ' ', (int) (byte) 100, 1582, 100, 1582);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = julianChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.yearOfEra();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.yearOfEra();
        org.joda.time.ReadablePartial readablePartial11 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology3.set(readablePartial11, 11L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.millisOfSecond();
        java.lang.String str11 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.hourOfHalfday();
        java.lang.Class<?> wildcardClass13 = julianChronology3.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JulianChronology[+10:00]" + "'", str11, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DurationField durationField12 = gJChronology2.weekyears();
        org.joda.time.DurationField durationField13 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology2.halfdayOfDay();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = gJChronology2.get(readablePeriod15, 3L, (-35999990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology2.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis(0L, (int) (byte) 100, (int) (byte) -1, (int) ' ', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis(19, (int) (short) 100, 9, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (-1));
        org.joda.time.chrono.GJChronology gJChronology4 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField5 = gJChronology4.weekyearOfCentury();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = gJChronology4.get(readablePeriod6, (-31L), (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(gJChronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis((int) '4', 0, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.weekyear();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray10 = julianChronology3.get(readablePeriod7, 52L, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.halfdayOfDay();
        org.joda.time.DurationField durationField13 = gJChronology2.centuries();
        org.joda.time.DurationField durationField14 = gJChronology2.halfdays();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = gJChronology2.get(readablePeriod15, 71999999L, 36000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.year();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, readableInstant7);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone9.getName((long) 36000000, locale11);
        int int14 = dateTimeZone9.getOffset((long) ' ');
        org.joda.time.Chronology chronology15 = julianChronology3.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField16 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField17 = julianChronology3.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = julianChronology3.getDateTimeMillis((int) 'a', 9, (int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        org.joda.time.Chronology chronology10 = julianChronology3.withUTC();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = julianChronology3.get(readablePeriod11, 32L, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology3.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = julianChronology3.get(readablePartial15, 8L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology15 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        long long18 = dateTimeZone16.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean23 = dateTimeZone21.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone25);
        boolean boolean29 = julianChronology27.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology30 = julianChronology27.withUTC();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology32 = julianChronology27.withZone(dateTimeZone31);
        long long34 = dateTimeZone21.getMillisKeepLocal(dateTimeZone31, 10L);
        org.joda.time.Chronology chronology35 = gJChronology2.withZone(dateTimeZone31);
        org.joda.time.DateTimeField dateTimeField36 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone38 = gJChronology2.getZone();
        boolean boolean39 = dateTimeZone38.isFixed();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-12219292800000L) + "'", long18 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 11L + "'", long34 == 11L);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.millisOfDay();
        org.joda.time.DurationField durationField13 = julianChronology3.millis();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology3.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = julianChronology3.getDateTimeMillis(278, (-1), 10, (int) ' ', (-1), 36000000, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        long long10 = dateTimeZone5.convertLocalToUTC((long) (short) 10, false);
        java.util.TimeZone timeZone11 = dateTimeZone5.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        boolean boolean13 = dateTimeZone12.isFixed();
        java.util.Locale locale15 = null;
        java.lang.String str16 = dateTimeZone12.getName((-71999990L), locale15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.ReadableInstant readableInstant18 = null;
        org.joda.time.chrono.GJChronology gJChronology19 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone17, readableInstant18);
        org.joda.time.DateTimeZone dateTimeZone20 = gJChronology19.getZone();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology19.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology19.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology19.getZone();
        org.joda.time.Instant instant25 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology26 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone23, (org.joda.time.ReadableInstant) instant25);
        java.lang.String str27 = instant25.toString();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.ReadableInstant readableInstant29 = null;
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone28, readableInstant29);
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology30.getZone();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology30.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = gJChronology30.dayOfYear();
        org.joda.time.Instant instant34 = gJChronology30.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.Instant instant36 = instant34.minus(readableDuration35);
        org.joda.time.Instant instant39 = instant36.withDurationAdded((-12219292800000L), 0);
        int int40 = instant25.compareTo((org.joda.time.ReadableInstant) instant36);
        long long41 = instant25.getMillis();
        org.joda.time.Instant instant42 = instant25.toInstant();
        org.joda.time.Chronology chronology43 = instant25.getChronology();
        org.joda.time.MutableDateTime mutableDateTime44 = instant25.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology46 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, (org.joda.time.ReadableInstant) mutableDateTime44, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-35999990L) + "'", long10 == (-35999990L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+10:00" + "'", str16, "+10:00");
        org.junit.Assert.assertNotNull(gJChronology19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(gJChronology26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str27, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(instant34);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 36000000L + "'", long41 == 36000000L);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(mutableDateTime44);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.seconds();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = julianChronology3.get(readablePeriod10, (-36000000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.dayOfWeek();
        long long14 = julianChronology3.add((-143999601L), 71999999L, (int) (short) 10);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 576000389L + "'", long14 == 576000389L);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant7 = new org.joda.time.Instant((java.lang.Object) gJChronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.GJChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        java.lang.String str9 = instant6.toString();
        org.joda.time.Instant instant11 = instant6.minus((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.chrono.GJChronology gJChronology14 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone12, readableInstant13);
        org.joda.time.Chronology chronology15 = gJChronology14.withUTC();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology14.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField17 = gJChronology14.millisOfDay();
        org.joda.time.DurationField durationField18 = gJChronology14.halfdays();
        org.joda.time.DurationField durationField19 = gJChronology14.millis();
        org.joda.time.DateTime dateTime20 = instant11.toDateTime((org.joda.time.Chronology) gJChronology14);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.chrono.GJChronology gJChronology23 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone21, readableInstant22);
        org.joda.time.DateTimeZone dateTimeZone24 = gJChronology23.getZone();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology23.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology23.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone27 = gJChronology23.getZone();
        org.joda.time.Instant instant29 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology30 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, (org.joda.time.ReadableInstant) instant29);
        java.lang.String str31 = instant29.toString();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.ReadableInstant readableInstant33 = null;
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone32, readableInstant33);
        org.joda.time.DateTimeZone dateTimeZone35 = gJChronology34.getZone();
        org.joda.time.DateTimeField dateTimeField36 = gJChronology34.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology34.dayOfYear();
        org.joda.time.Instant instant38 = gJChronology34.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.Instant instant40 = instant38.minus(readableDuration39);
        org.joda.time.Instant instant43 = instant40.withDurationAdded((-12219292800000L), 0);
        int int44 = instant29.compareTo((org.joda.time.ReadableInstant) instant40);
        boolean boolean46 = instant29.isBefore((long) 'a');
        int int47 = instant11.compareTo((org.joda.time.ReadableInstant) instant29);
        org.joda.time.MutableDateTime mutableDateTime48 = instant11.toMutableDateTime();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str9, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(gJChronology14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(gJChronology23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(gJChronology30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str31, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertNotNull(instant40);
        org.junit.Assert.assertNotNull(instant43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(mutableDateTime48);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DurationField durationField5 = gJChronology2.eras();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfHalfday();
        int int8 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = gJChronology2.get(readablePeriod9, 36009730L, 400L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone7 = instant6.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = instant6.get(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        long long24 = instant8.getMillis();
        org.joda.time.Instant instant25 = instant8.toInstant();
        org.joda.time.Chronology chronology26 = instant8.getChronology();
        boolean boolean27 = instant8.isAfterNow();
        boolean boolean29 = instant8.isEqual((long) (short) -1);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 36000000L + "'", long24 == 36000000L);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.minuteOfDay();
        org.joda.time.Instant instant12 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.Chronology chronology14 = gJChronology2.withZone(dateTimeZone13);
        org.joda.time.ReadablePartial readablePartial15 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long17 = chronology14.set(readablePartial15, 36000001L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        java.lang.String str6 = julianChronology3.toString();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        long long10 = julianChronology3.add(readablePeriod7, (long) (short) 1, (-1));
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.weekyear();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = julianChronology3.get(readablePeriod12, (-35999999L), (-11L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[+10:00]" + "'", str6, "JulianChronology[+10:00]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = gJChronology2.centuries();
        org.joda.time.DurationField durationField9 = gJChronology2.centuries();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.set(readablePartial10, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        boolean boolean13 = instant11.isSupported(dateTimeFieldType12);
        org.joda.time.DateTime dateTime14 = instant11.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        boolean boolean16 = dateTime14.isSupported(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        java.lang.String str6 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfEra();
        org.joda.time.DurationField durationField8 = gJChronology2.weeks();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.weekyearOfCentury();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GJChronology[+10:00]" + "'", str6, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        long long6 = dateTimeZone1.convertLocalToUTC((-35999990L), true);
        org.joda.time.chrono.JulianChronology julianChronology7 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) julianChronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.JulianChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-71999990L) + "'", long6 == (-71999990L));
        org.junit.Assert.assertNotNull(julianChronology7);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.monthOfYear();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfEra();
        org.joda.time.Chronology chronology8 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology2.getDateTimeMillis((int) '4', 278, 3600000, (int) (short) 100, 3600000, 1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.millisOfSecond();
        java.lang.String str11 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.hourOfHalfday();
        org.joda.time.DurationField durationField13 = julianChronology3.weekyears();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology3.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = julianChronology3.getDateTimeMillis(278, (int) '#', 36000000, 9, (int) (short) 10, (int) (short) 10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "JulianChronology[+10:00]" + "'", str11, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.dayOfWeek();
        org.joda.time.DurationField durationField11 = julianChronology3.months();
        org.joda.time.DurationField durationField12 = julianChronology3.eras();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = julianChronology3.get(readablePeriod13, (-107999989L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.months();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis((int) (short) -1, (int) ' ', (int) (byte) 0, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        org.joda.time.DateTimeField dateTimeField18 = chronology17.hourOfHalfday();
        java.lang.Class<?> wildcardClass19 = chronology17.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = gJChronology2.get(readablePeriod4, 100L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("1969-12-31T23:59:59.999Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        java.lang.String str9 = gJChronology2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology2.getDateTimeMillis((int) (byte) 100, (int) (byte) -1, 19, (int) '#', 0, (int) (byte) 0, 19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GJChronology[+10:00]" + "'", str9, "GJChronology[+10:00]");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = gJChronology2.getDateTimeMillis((int) (short) 0, 4, (int) (byte) 0, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        org.joda.time.DurationField durationField5 = julianChronology3.weeks();
        org.joda.time.DurationField durationField6 = julianChronology3.days();
        org.joda.time.DurationField durationField7 = julianChronology3.centuries();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.hourOfHalfday();
        org.joda.time.Chronology chronology9 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField10 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.era();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = julianChronology3.getDateTimeMillis((int) (byte) 10, 1582, (int) (byte) 0, 278);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1582 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        java.lang.String str4 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis((long) (short) 10, (int) (byte) 0, 4200000, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4200000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "GJChronology[+10:00]" + "'", str4, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("GJChronology[+10:00,cutover=1970-01-01T10:00:00.000Z]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.minuteOfDay();
        boolean boolean12 = julianChronology3.equals((java.lang.Object) dateTimeField11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.secondOfMinute();
        int int14 = julianChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone16);
        boolean boolean20 = julianChronology18.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField21 = julianChronology18.months();
        boolean boolean22 = julianChronology3.equals((java.lang.Object) julianChronology18);
        org.joda.time.DateTimeField dateTimeField23 = julianChronology18.year();
        // The following exception was thrown during execution in test generation
        try {
            long long28 = julianChronology18.getDateTimeMillis((int) (short) 100, 10, (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        org.joda.time.DateTimeField dateTimeField10 = gJChronology9.clockhourOfHalfday();
        org.joda.time.DurationField durationField11 = gJChronology9.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology9.getDateTimeMillis((long) (short) -1, 1582, 0, 69, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1582 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.getDateTimeMillis((-59011667999903L), (int) '4', (int) '4', 4200000, 19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        long long10 = dateTimeZone7.convertUTCToLocal((-107999990L));
        java.util.TimeZone timeZone11 = dateTimeZone7.toTimeZone();
        long long14 = dateTimeZone7.adjustOffset((-59082429599991L), true);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology17.getZone();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.dayOfYear();
        org.joda.time.Instant instant21 = gJChronology17.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.Instant instant23 = instant21.minus(readableDuration22);
        org.joda.time.Instant instant26 = instant23.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.Instant instant28 = instant23.plus(readableDuration27);
        java.util.Date date29 = instant28.toDate();
        java.lang.String str30 = instant28.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology32 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (org.joda.time.ReadableInstant) instant28, 278);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 278");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-107999990L) + "'", long10 == (-107999990L));
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-59082429599991L) + "'", long14 == (-59082429599991L));
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(date29);
        org.junit.Assert.assertEquals(date29.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str30, "1582-10-15T00:00:00.000Z");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField4 = julianChronology3.year();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology3.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, readableInstant7);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone9.getName((long) 36000000, locale11);
        int int14 = dateTimeZone9.getOffset((long) ' ');
        org.joda.time.Chronology chronology15 = julianChronology3.withZone(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology15.getDateTimeMillis((long) 1, 100, 69, (int) ' ', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 36000000 + "'", int14 == 36000000);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        org.joda.time.DurationField durationField5 = julianChronology3.weeks();
        org.joda.time.DurationField durationField6 = julianChronology3.days();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        int int9 = dateTimeZone7.getStandardOffset((-59011667999903L));
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology12 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 36000000 + "'", int9 == 36000000);
        org.junit.Assert.assertNotNull(gJChronology10);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.millisOfDay();
        org.joda.time.DurationField durationField13 = julianChronology3.millis();
        org.joda.time.DateTimeField dateTimeField14 = julianChronology3.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField15 = julianChronology3.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial16 = null;
        int[] intArray17 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            julianChronology3.validate(readablePartial16, intArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[]");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        java.lang.String str6 = gJChronology2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis(0, 0, 10, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GJChronology[+10:00]" + "'", str6, "GJChronology[+10:00]");
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.halfdayOfDay();
        org.joda.time.Chronology chronology11 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[+10:00]" + "'", str8, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        long long8 = gJChronology2.add((long) '4', 0L, (int) (byte) -1);
        org.joda.time.DurationField durationField9 = gJChronology2.millis();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.hourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = gJChronology2.get(readablePeriod11, (-12219292800000L), (-11L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.yearOfEra();
        org.joda.time.DurationField durationField7 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology10 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9);
        org.joda.time.DateTimeField dateTimeField11 = julianChronology10.minuteOfDay();
        boolean boolean12 = julianChronology3.equals((java.lang.Object) dateTimeField11);
        org.joda.time.DateTimeField dateTimeField13 = julianChronology3.secondOfMinute();
        int int14 = julianChronology3.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.chrono.JulianChronology julianChronology18 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone16);
        boolean boolean20 = julianChronology18.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField21 = julianChronology18.months();
        boolean boolean22 = julianChronology3.equals((java.lang.Object) julianChronology18);
        org.joda.time.DurationField durationField23 = julianChronology18.months();
        org.joda.time.ReadablePartial readablePartial24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = julianChronology18.set(readablePartial24, (-35999968L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(julianChronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(julianChronology18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.centuryOfEra();
        long long8 = gJChronology2.add((long) (short) -1, (-71999900L), 1);
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray16 = new int[] { 69, 'a', 'a', '4', 1, 278 };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial9, intArray16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-71999901L) + "'", long8 == (-71999901L));
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[69, 97, 97, 52, 1, 278]");
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.hourOfDay();
        java.lang.String str13 = julianChronology3.toString();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone15);
        org.joda.time.chrono.JulianChronology julianChronology17 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone15);
        java.lang.String str19 = dateTimeZone15.getNameKey(10L);
        java.lang.String str21 = dateTimeZone15.getName((long) (byte) -1);
        org.joda.time.Chronology chronology22 = julianChronology3.withZone(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = julianChronology3.getDateTimeMillis(0, 278, (int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "JulianChronology[+10:00]" + "'", str13, "JulianChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(julianChronology17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+10:00" + "'", str21, "+10:00");
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.secondOfMinute();
        org.joda.time.DurationField durationField4 = julianChronology2.centuries();
        org.joda.time.ReadablePartial readablePartial5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray7 = julianChronology2.get(readablePartial5, (long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        java.lang.String str5 = julianChronology3.toString();
        java.lang.String str6 = julianChronology3.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = julianChronology3.getDateTimeMillis((-1), (int) (byte) 100, 3600000, (int) 'a', 1582, (int) ' ', 69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "JulianChronology[+10:00]" + "'", str5, "JulianChronology[+10:00]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "JulianChronology[+10:00]" + "'", str6, "JulianChronology[+10:00]");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant3.withMillis((long) (byte) -1);
        org.joda.time.DateTime dateTime6 = instant5.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = instant5.isSupported(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.ReadableInstant readableInstant10 = null;
        org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, readableInstant10);
        org.joda.time.DateTimeZone dateTimeZone12 = gJChronology11.getZone();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology11.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField14 = gJChronology11.dayOfYear();
        org.joda.time.Instant instant15 = gJChronology11.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.Instant instant17 = instant15.minus(readableDuration16);
        org.joda.time.Instant instant20 = instant17.withDurationAdded((-12219292800000L), 0);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.Instant instant22 = instant17.plus(readableDuration21);
        java.util.Date date23 = instant22.toDate();
        org.joda.time.Instant instant25 = instant22.plus(35L);
        int int26 = instant5.compareTo((org.joda.time.ReadableInstant) instant22);
        boolean boolean27 = instant5.isAfterNow();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(gJChronology11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertNotNull(date23);
        org.junit.Assert.assertEquals(date23.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfHalfday();
        int int6 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.hourOfDay();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.centuryOfEra();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.set(readablePartial10, 18684000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[+10:00]" + "'", str8, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(1L);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant3 = instant1.plus(readableDuration2);
        org.joda.time.Instant instant5 = instant1.minus((long) 10);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.ReadableInstant readableInstant7 = null;
        org.joda.time.chrono.GJChronology gJChronology8 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, readableInstant7);
        org.joda.time.DateTimeZone dateTimeZone9 = gJChronology8.getZone();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology8.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology8.dayOfYear();
        org.joda.time.Instant instant12 = gJChronology8.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime15 = instant12.toMutableDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = instant12.toDateTime();
        java.util.Date date17 = instant12.toDate();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19);
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology20.getZone();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str24 = dateTimeZone23.getID();
        org.joda.time.Chronology chronology25 = gJChronology20.withZone(dateTimeZone23);
        java.lang.String str27 = dateTimeZone23.getName((long) (byte) 10);
        java.util.TimeZone timeZone28 = dateTimeZone23.toTimeZone();
        long long32 = dateTimeZone23.convertLocalToUTC((long) 10, false, (long) (byte) 10);
        boolean boolean33 = instant12.equals((java.lang.Object) (byte) 10);
        boolean boolean34 = instant5.isBefore((org.joda.time.ReadableInstant) instant12);
        boolean boolean36 = instant12.isBefore(36000000L);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(gJChronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+10:00" + "'", str24, "+10:00");
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "+10:00" + "'", str27, "+10:00");
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "GMT+10:00");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-35999990L) + "'", long32 == (-35999990L));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DurationField durationField5 = gJChronology2.years();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.weekyear();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        org.joda.time.LocalDateTime localDateTime9 = null;
        boolean boolean10 = dateTimeZone8.isLocalDateTimeGap(localDateTime9);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.dayOfYear();
        org.joda.time.DurationField durationField10 = gJChronology2.days();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray13 = gJChronology2.get(readablePeriod11, 9L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[+10:00]" + "'", str8, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.seconds();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.year();
        org.joda.time.Instant instant8 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = gJChronology2.get(readablePartial9, (long) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.Instant instant8 = instant6.minus(readableDuration7);
        org.joda.time.Instant instant11 = instant8.withDurationAdded((-12219292800000L), 0);
        boolean boolean13 = instant8.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone14, readableInstant15);
        org.joda.time.Chronology chronology17 = gJChronology16.withUTC();
        org.joda.time.DateTimeField dateTimeField18 = gJChronology16.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology16.millisOfDay();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology16.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField21 = gJChronology16.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology16.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology16.monthOfYear();
        boolean boolean24 = instant8.equals((java.lang.Object) dateTimeField23);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.ReadableInstant readableInstant26 = null;
        org.joda.time.chrono.GJChronology gJChronology27 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone25, readableInstant26);
        org.joda.time.DateTimeZone dateTimeZone28 = gJChronology27.getZone();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology27.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone31 = gJChronology27.getZone();
        org.joda.time.Instant instant33 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology34 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone31, (org.joda.time.ReadableInstant) instant33);
        java.lang.String str35 = instant33.toString();
        boolean boolean36 = instant33.isEqualNow();
        boolean boolean37 = instant8.isEqual((org.joda.time.ReadableInstant) instant33);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.ReadableInstant readableInstant39 = null;
        org.joda.time.chrono.GJChronology gJChronology40 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone38, readableInstant39);
        org.joda.time.Chronology chronology41 = gJChronology40.withUTC();
        java.lang.String str42 = gJChronology40.toString();
        org.joda.time.DateTimeField dateTimeField43 = gJChronology40.monthOfYear();
        org.joda.time.DateTimeField dateTimeField44 = gJChronology40.millisOfDay();
        org.joda.time.DateTimeField dateTimeField45 = gJChronology40.dayOfWeek();
        org.joda.time.Instant instant46 = gJChronology40.getGregorianCutover();
        org.joda.time.Chronology chronology47 = instant46.getChronology();
        org.joda.time.Instant instant48 = instant46.toInstant();
        boolean boolean49 = instant8.equals((java.lang.Object) instant48);
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        org.joda.time.chrono.GJChronology gJChronology52 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone50, readableInstant51);
        org.joda.time.DateTimeZone dateTimeZone53 = gJChronology52.getZone();
        org.joda.time.DateTimeField dateTimeField54 = gJChronology52.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField55 = gJChronology52.dayOfYear();
        org.joda.time.Instant instant56 = gJChronology52.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.Instant instant58 = instant56.minus(readableDuration57);
        java.lang.String str59 = instant56.toString();
        org.joda.time.Instant instant61 = instant56.minus((long) 36000000);
        org.joda.time.DateTimeZone dateTimeZone62 = instant56.getZone();
        org.joda.time.DateTimeZone dateTimeZone63 = instant56.getZone();
        org.joda.time.ReadableDuration readableDuration64 = null;
        org.joda.time.Instant instant66 = instant56.withDurationAdded(readableDuration64, (int) '#');
        boolean boolean67 = instant48.isBefore((org.joda.time.ReadableInstant) instant56);
        org.joda.time.Instant instant70 = instant48.withDurationAdded((-12219328800000L), (int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime71 = instant48.toMutableDateTimeISO();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(gJChronology27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(gJChronology34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str35, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(gJChronology40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "GJChronology[+10:00]" + "'", str42, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(instant46);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(gJChronology52);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertNotNull(instant56);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1582-10-15T00:00:00.000Z" + "'", str59, "1582-10-15T00:00:00.000Z");
        org.junit.Assert.assertNotNull(instant61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(dateTimeZone63);
        org.junit.Assert.assertNotNull(instant66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(instant70);
        org.junit.Assert.assertNotNull(mutableDateTime71);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 1, (int) (short) 0);
        long long4 = dateTimeZone2.previousTransition(0L);
        int int6 = dateTimeZone2.getOffset((long) (short) 100);
        boolean boolean7 = dateTimeZone2.isFixed();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology10.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology10.dayOfYear();
        org.joda.time.Instant instant14 = gJChronology10.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Instant instant16 = instant14.minus(readableDuration15);
        org.joda.time.Instant instant19 = instant16.withDurationAdded((-12219292800000L), 0);
        boolean boolean21 = instant16.isEqual(35L);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.chrono.GJChronology gJChronology24 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone22, readableInstant23);
        org.joda.time.Chronology chronology25 = gJChronology24.withUTC();
        org.joda.time.DateTimeField dateTimeField26 = gJChronology24.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField27 = gJChronology24.millisOfDay();
        org.joda.time.DateTimeField dateTimeField28 = gJChronology24.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField29 = gJChronology24.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField30 = gJChronology24.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology24.monthOfYear();
        boolean boolean32 = instant16.equals((java.lang.Object) dateTimeField31);
        org.joda.time.Instant instant34 = instant16.withMillis(1L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology36 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone2, (org.joda.time.ReadableInstant) instant16, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 69");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3600000 + "'", int6 == 3600000);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(gJChronology24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(instant34);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        java.lang.String str9 = gJChronology2.toString();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = gJChronology2.get(readablePeriod10, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GJChronology[+10:00]" + "'", str9, "GJChronology[+10:00]");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = instant1.toString(dateTimeFormatter5);
        java.lang.String str7 = instant1.toString();
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str6, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str7, "1970-01-01T10:00:00.000Z");
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField6 = gJChronology2.weeks();
        org.joda.time.Chronology chronology7 = gJChronology2.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis((int) 'a', 19, (int) '4', (int) (short) 100, 1582, (int) (short) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology15 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        long long18 = dateTimeZone16.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean23 = dateTimeZone21.isStandardOffset((long) (-1));
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone25);
        org.joda.time.chrono.JulianChronology julianChronology27 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone25);
        boolean boolean29 = julianChronology27.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology30 = julianChronology27.withUTC();
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology32 = julianChronology27.withZone(dateTimeZone31);
        long long34 = dateTimeZone21.getMillisKeepLocal(dateTimeZone31, 10L);
        org.joda.time.Chronology chronology35 = gJChronology2.withZone(dateTimeZone31);
        org.joda.time.Chronology chronology36 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField37 = chronology36.weeks();
        org.joda.time.DurationField durationField38 = chronology36.weekyears();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-12219292800000L) + "'", long18 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(julianChronology27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 11L + "'", long34 == 11L);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(durationField38);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.months();
        org.joda.time.Chronology chronology10 = julianChronology3.withUTC();
        org.joda.time.DurationField durationField11 = chronology10.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.weekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.weeks();
        org.joda.time.DurationField durationField5 = julianChronology3.millis();
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.era();
        org.joda.time.DurationField durationField10 = julianChronology3.halfdays();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        org.joda.time.Instant instant6 = instant4.minus((long) (short) -1);
        org.joda.time.MutableDateTime mutableDateTime7 = instant6.toMutableDateTime();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.Instant instant9 = instant6.minus(readableDuration8);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(instant9);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.monthOfYear();
        org.joda.time.ReadablePartial readablePartial10 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long12 = gJChronology2.set(readablePartial10, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology11 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5, (-35999900L), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        long long24 = instant8.getMillis();
        org.joda.time.Instant instant25 = instant8.toInstant();
        long long26 = instant8.getMillis();
        org.joda.time.Instant instant28 = org.joda.time.Instant.parse("1970-01-01T00:00:00.001Z");
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.Instant instant31 = instant28.withDurationAdded(readableDuration29, 10);
        java.util.Date date32 = instant31.toDate();
        boolean boolean33 = instant8.isAfter((org.joda.time.ReadableInstant) instant31);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = null;
        boolean boolean35 = instant31.isSupported(dateTimeFieldType34);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.ReadableInstant readableInstant37 = null;
        org.joda.time.chrono.GJChronology gJChronology38 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone36, readableInstant37);
        org.joda.time.DateTimeZone dateTimeZone39 = gJChronology38.getZone();
        org.joda.time.DateTimeField dateTimeField40 = gJChronology38.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField41 = gJChronology38.dayOfYear();
        org.joda.time.Instant instant42 = gJChronology38.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime45 = instant42.toMutableDateTime(dateTimeZone44);
        boolean boolean47 = mutableDateTime45.equals((java.lang.Object) (-35999900L));
        boolean boolean48 = instant31.isBefore((org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int50 = mutableDateTime45.get(dateTimeFieldType49);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 36000000L + "'", long24 == 36000000L);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 36000000L + "'", long26 == 36000000L);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(date32);
        org.junit.Assert.assertEquals(date32.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(gJChronology38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(instant42);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DurationField durationField4 = julianChronology3.centuries();
        org.joda.time.DurationField durationField5 = julianChronology3.weeks();
        org.joda.time.DurationField durationField6 = julianChronology3.days();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.ReadableInstant readableInstant8 = null;
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, readableInstant8);
        org.joda.time.DateTimeZone dateTimeZone10 = gJChronology9.getZone();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology9.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone13 = gJChronology9.getZone();
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology16 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone13, (org.joda.time.ReadableInstant) instant15);
        java.lang.String str17 = instant15.toString();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.ReadableInstant readableInstant19 = null;
        org.joda.time.chrono.GJChronology gJChronology20 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone18, readableInstant19);
        org.joda.time.DateTimeZone dateTimeZone21 = gJChronology20.getZone();
        org.joda.time.DateTimeField dateTimeField22 = gJChronology20.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField23 = gJChronology20.dayOfYear();
        org.joda.time.Instant instant24 = gJChronology20.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration25 = null;
        org.joda.time.Instant instant26 = instant24.minus(readableDuration25);
        org.joda.time.Instant instant29 = instant26.withDurationAdded((-12219292800000L), 0);
        int int30 = instant15.compareTo((org.joda.time.ReadableInstant) instant26);
        long long31 = instant15.getMillis();
        org.joda.time.Instant instant32 = instant15.toInstant();
        org.joda.time.DateTimeZone dateTimeZone33 = instant15.getZone();
        long long35 = dateTimeZone33.previousTransition((long) (short) 100);
        java.lang.String str36 = dateTimeZone33.toString();
        org.joda.time.Chronology chronology37 = julianChronology3.withZone(dateTimeZone33);
        org.joda.time.DateTimeField dateTimeField38 = chronology37.dayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(gJChronology16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str17, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 36000000L + "'", long31 == 36000000L);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 100L + "'", long35 == 100L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "UTC" + "'", str36, "UTC");
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.clockhourOfDay();
        java.lang.Class<?> wildcardClass6 = gJChronology2.getClass();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        int int19 = dateTimeZone8.getOffset((-35999900L));
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField21 = julianChronology20.months();
        org.joda.time.DurationField durationField22 = julianChronology20.weeks();
        org.joda.time.DateTimeField dateTimeField23 = julianChronology20.secondOfMinute();
        org.joda.time.ReadablePartial readablePartial24 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long26 = julianChronology20.set(readablePartial24, (-6211221875999790L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertNotNull(julianChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        int int9 = gJChronology2.getMinimumDaysInFirstWeek();
        org.joda.time.DurationField durationField10 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField11 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = gJChronology2.getDateTimeMillis(400L, 19, 1, 69, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = julianChronology3.weeks();
        org.joda.time.DateTimeZone dateTimeZone9 = julianChronology3.getZone();
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone9.getName(0L, locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone9, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DurationField durationField6 = julianChronology3.months();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone8);
        java.util.Locale locale11 = null;
        java.lang.String str12 = dateTimeZone8.getName((-1L), locale11);
        org.joda.time.LocalDateTime localDateTime13 = null;
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime13);
        boolean boolean16 = dateTimeZone8.isStandardOffset(36000000L);
        org.joda.time.Chronology chronology17 = julianChronology3.withZone(dateTimeZone8);
        int int19 = dateTimeZone8.getOffset((-35999900L));
        org.joda.time.chrono.JulianChronology julianChronology20 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone8);
        org.joda.time.DurationField durationField21 = julianChronology20.months();
        org.joda.time.DateTimeField dateTimeField22 = julianChronology20.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = julianChronology20.get(readablePeriod23, (-11L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "+10:00" + "'", str12, "+10:00");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 36000000 + "'", int19 == 36000000);
        org.junit.Assert.assertNotNull(julianChronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology9 = julianChronology3.withUTC();
        org.joda.time.DurationField durationField10 = julianChronology3.years();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = julianChronology3.get(readablePeriod11, (-35999990L), (-71999990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("1970-01-01T10:00:00.001+10:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '1970-01-01T10:00:00.001+10:00' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = julianChronology3.getZone();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = julianChronology3.getDateTimeMillis((int) (byte) 100, 36000000, (-1), (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.millisOfSecond();
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray10 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            julianChronology3.validate(readablePartial9, intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[]");
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = instant6.toMutableDateTime(dateTimeZone8);
        org.joda.time.DateTime dateTime10 = instant6.toDateTime();
        java.util.Date date11 = instant6.toDate();
        boolean boolean12 = instant6.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime13 = instant6.toMutableDateTimeISO();
        org.joda.time.Instant instant15 = instant6.minus((-11L));
        org.joda.time.Instant instant17 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant20 = instant17.withDurationAdded(readableDuration18, 0);
        org.joda.time.DateTime dateTime21 = instant20.toDateTimeISO();
        boolean boolean22 = instant6.equals((java.lang.Object) dateTime21);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        java.lang.String str8 = gJChronology2.toString();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray11 = gJChronology2.get(readablePeriod9, (long) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "GJChronology[+10:00]" + "'", str8, "GJChronology[+10:00]");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("1969-12-31T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '1969-12-31T23:59:59.999Z' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        java.lang.String str3 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfYear();
        java.lang.String str5 = gJChronology2.toString();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        int int10 = dateTimeZone7.getOffsetFromLocal((long) ' ');
        org.joda.time.chrono.JulianChronology julianChronology11 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone7);
        org.joda.time.Chronology chronology12 = gJChronology2.withZone(dateTimeZone7);
        org.joda.time.Chronology chronology13 = gJChronology2.withUTC();
        org.joda.time.ReadablePartial readablePartial14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = chronology13.get(readablePartial14, 71999999L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "GJChronology[+10:00]" + "'", str3, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "GJChronology[+10:00]" + "'", str5, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 36000000 + "'", int10 == 36000000);
        org.junit.Assert.assertNotNull(julianChronology11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            long long8 = gJChronology2.set(readablePartial6, (-12219292800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.Instant instant6 = gJChronology2.getGregorianCutover();
        java.lang.String str7 = gJChronology2.toString();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray12 = gJChronology2.get(readablePeriod10, (-32399903L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "GJChronology[+10:00]" + "'", str7, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str6 = dateTimeZone5.getID();
        org.joda.time.Chronology chronology7 = gJChronology2.withZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone8 = gJChronology2.getZone();
        long long10 = dateTimeZone8.nextTransition((-12219292800000L));
        long long12 = dateTimeZone8.convertUTCToLocal((long) 1);
        java.util.Locale locale14 = null;
        java.lang.String str15 = dateTimeZone8.getName((long) (-1), locale14);
        long long19 = dateTimeZone8.convertLocalToUTC(1L, true, (long) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.chrono.GJChronology gJChronology22 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone20, readableInstant21);
        org.joda.time.DateTimeZone dateTimeZone23 = gJChronology22.getZone();
        org.joda.time.DateTimeField dateTimeField24 = gJChronology22.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField25 = gJChronology22.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone26 = gJChronology22.getZone();
        org.joda.time.Instant instant28 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone26, (org.joda.time.ReadableInstant) instant28);
        java.lang.String str30 = gJChronology29.toString();
        org.joda.time.DurationField durationField31 = gJChronology29.weekyears();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology29.weekyear();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.ReadableInstant readableInstant34 = null;
        org.joda.time.chrono.GJChronology gJChronology35 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone33, readableInstant34);
        org.joda.time.DateTimeZone dateTimeZone36 = gJChronology35.getZone();
        org.joda.time.DateTimeField dateTimeField37 = gJChronology35.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField38 = gJChronology35.dayOfYear();
        org.joda.time.Instant instant39 = gJChronology35.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime42 = instant39.toMutableDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = instant39.toDateTime();
        java.util.Date date44 = instant39.toDate();
        boolean boolean45 = instant39.isBeforeNow();
        org.joda.time.MutableDateTime mutableDateTime46 = instant39.toMutableDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.ReadableInstant readableInstant48 = null;
        org.joda.time.chrono.GJChronology gJChronology49 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone47, readableInstant48);
        java.lang.String str50 = gJChronology49.toString();
        org.joda.time.DateTimeField dateTimeField51 = gJChronology49.dayOfYear();
        int int52 = instant39.get(dateTimeField51);
        boolean boolean53 = gJChronology29.equals((java.lang.Object) instant39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology55 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, (org.joda.time.ReadableInstant) instant39, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 69");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "+10:00" + "'", str6, "+10:00");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-12219292800000L) + "'", long10 == (-12219292800000L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36000001L + "'", long12 == 36000001L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+10:00" + "'", str15, "+10:00");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-35999999L) + "'", long19 == (-35999999L));
        org.junit.Assert.assertNotNull(gJChronology22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "GJChronology[+10:00,cutover=1970-01-01T10:00:00.000Z]" + "'", str30, "GJChronology[+10:00,cutover=1970-01-01T10:00:00.000Z]");
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(gJChronology35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(instant39);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(mutableDateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(date44);
        org.junit.Assert.assertEquals(date44.toString(), "Fri Oct 15 00:00:00 UTC 1582");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(mutableDateTime46);
        org.junit.Assert.assertNotNull(gJChronology49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "GJChronology[+10:00]" + "'", str50, "GJChronology[+10:00]");
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 278 + "'", int52 == 278);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant8.plus(readableDuration24);
        long long26 = instant8.getMillis();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 36000000L + "'", long26 == 36000000L);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.DateTimeField dateTimeField8 = julianChronology3.minuteOfHour();
        org.joda.time.DurationField durationField9 = julianChronology3.weeks();
        org.joda.time.DurationField durationField10 = julianChronology3.days();
        org.joda.time.DateTimeField dateTimeField11 = julianChronology3.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField12 = julianChronology3.millisOfDay();
        org.joda.time.DurationField durationField13 = julianChronology3.halfdays();
        org.joda.time.DurationField durationField14 = julianChronology3.halfdays();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = gJChronology2.getZone();
        org.joda.time.Instant instant8 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.chrono.GJChronology gJChronology9 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone6, (org.joda.time.ReadableInstant) instant8);
        java.lang.String str10 = instant8.toString();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.ReadableInstant readableInstant12 = null;
        org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone11, readableInstant12);
        org.joda.time.DateTimeZone dateTimeZone14 = gJChronology13.getZone();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology13.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology13.dayOfYear();
        org.joda.time.Instant instant17 = gJChronology13.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Instant instant19 = instant17.minus(readableDuration18);
        org.joda.time.Instant instant22 = instant19.withDurationAdded((-12219292800000L), 0);
        int int23 = instant8.compareTo((org.joda.time.ReadableInstant) instant19);
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant25 = instant8.minus(readableDuration24);
        java.util.Date date26 = instant8.toDate();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.chrono.GJChronology gJChronology29 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone27, readableInstant28);
        org.joda.time.DateTimeZone dateTimeZone30 = gJChronology29.getZone();
        org.joda.time.DateTimeField dateTimeField31 = gJChronology29.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField32 = gJChronology29.dayOfYear();
        org.joda.time.Instant instant33 = gJChronology29.getGregorianCutover();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.Instant instant35 = instant33.minus(readableDuration34);
        org.joda.time.Instant instant38 = instant35.withDurationAdded((-12219292800000L), 0);
        boolean boolean39 = instant8.isEqual((org.joda.time.ReadableInstant) instant35);
        org.joda.time.DateTimeZone dateTimeZone40 = instant35.getZone();
        int int42 = dateTimeZone40.getOffsetFromLocal(100L);
        long long46 = dateTimeZone40.convertLocalToUTC((long) (short) 10, true, (long) 100);
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(gJChronology9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str10, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(gJChronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(instant22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(date26);
        org.junit.Assert.assertEquals(date26.toString(), "Thu Jan 01 10:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(gJChronology29);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(instant35);
        org.junit.Assert.assertNotNull(instant38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 10L + "'", long46 == 10L);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = gJChronology2.getDateTimeMillis(100, 36000000, 1582, 69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 36000000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        org.joda.time.DurationField durationField9 = julianChronology3.days();
        org.joda.time.DurationField durationField10 = julianChronology3.years();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        org.joda.time.DurationField durationField11 = gJChronology2.minutes();
        org.joda.time.DateTimeField dateTimeField12 = gJChronology2.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField13 = gJChronology2.weekyear();
        org.joda.time.Instant instant14 = gJChronology2.getGregorianCutover();
        org.joda.time.DateTimeField dateTimeField15 = gJChronology2.weekyearOfCentury();
        org.joda.time.DateTimeField dateTimeField16 = gJChronology2.yearOfEra();
        org.joda.time.DurationField durationField17 = gJChronology2.hours();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology8 = julianChronology3.withZone(dateTimeZone7);
        long long10 = dateTimeZone7.convertUTCToLocal((long) 9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology13 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone7, (long) 3600000, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 9L + "'", long10 == 9L);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.DateTimeZone dateTimeZone3 = gJChronology2.getZone();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.hourOfHalfday();
        long long8 = gJChronology2.add((-12219292800000L), (long) 0, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = gJChronology2.getDateTimeMillis((int) (byte) 0, 1582, 9, (int) '4', 19, 100, 278);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-12219292800000L) + "'", long8 == (-12219292800000L));
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = gJChronology2.getDateTimeMillis((int) (short) 100, (int) (byte) -1, 10, (int) '#', (int) '4', (int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField8 = gJChronology2.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = gJChronology2.getDateTimeMillis((-1), 10, (int) (byte) 0, (-1), (int) '4', 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.yearOfCentury();
        long long11 = gJChronology2.add((long) (short) 100, (long) 1, (int) (byte) 10);
        java.lang.String str12 = gJChronology2.toString();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = gJChronology2.getDateTimeMillis(4200000, 10, (int) (short) 0, (int) (short) 10, (int) (short) 10, (int) 'a', (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 110L + "'", long11 == 110L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GJChronology[+10:00]" + "'", str12, "GJChronology[+10:00]");
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        boolean boolean3 = dateTimeZone1.isStandardOffset((long) (-1));
        long long7 = dateTimeZone1.convertLocalToUTC((long) 4, true, (long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 3L + "'", long7 == 3L);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
        org.joda.time.DateTimeField dateTimeField1 = julianChronology0.secondOfMinute();
        org.junit.Assert.assertNotNull(julianChronology0);
        org.junit.Assert.assertNotNull(dateTimeField1);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField4 = gJChronology2.millis();
        org.joda.time.DurationField durationField5 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField6 = gJChronology2.years();
        org.joda.time.DurationField durationField7 = gJChronology2.days();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = gJChronology2.getDateTimeMillis((int) (short) 1, (int) (byte) 100, (int) 'a', (-1), (int) (byte) 1, 4200000, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.Chronology chronology6 = julianChronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.era();
        org.joda.time.Instant instant9 = new org.joda.time.Instant(1L);
        org.joda.time.DateTimeZone dateTimeZone10 = instant9.getZone();
        java.util.Locale locale12 = null;
        java.lang.String str13 = dateTimeZone10.getShortName((long) (byte) 1, locale12);
        org.joda.time.Chronology chronology14 = julianChronology3.withZone(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.ReadableInstant readableInstant16 = null;
        org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone15, readableInstant16);
        org.joda.time.DateTimeZone dateTimeZone18 = gJChronology17.getZone();
        org.joda.time.DateTimeField dateTimeField19 = gJChronology17.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField20 = gJChronology17.dayOfYear();
        org.joda.time.Instant instant21 = gJChronology17.getGregorianCutover();
        org.joda.time.DateTimeZone dateTimeZone22 = instant21.getZone();
        long long23 = instant21.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology25 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone10, (org.joda.time.ReadableInstant) instant21, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "+00:00" + "'", str13, "+00:00");
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(gJChronology17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(instant21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-12219292800000L) + "'", long23 == (-12219292800000L));
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone1);
        org.joda.time.chrono.JulianChronology julianChronology3 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        boolean boolean5 = julianChronology3.equals((java.lang.Object) 1.0f);
        org.joda.time.DateTimeField dateTimeField6 = julianChronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = julianChronology3.weekOfWeekyear();
        org.joda.time.DurationField durationField8 = julianChronology3.weeks();
        org.joda.time.DateTimeField dateTimeField9 = julianChronology3.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.chrono.JulianChronology julianChronology14 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone12);
        java.lang.String str16 = dateTimeZone12.getNameKey(10L);
        long long18 = dateTimeZone10.getMillisKeepLocal(dateTimeZone12, (long) (short) 10);
        org.joda.time.Chronology chronology19 = julianChronology3.withZone(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = julianChronology3.getDateTimeMillis((-35999900L), (int) (byte) 10, (int) '4', 100, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(julianChronology14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-35999990L) + "'", long18 == (-35999990L));
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.weekyearOfCentury();
        org.joda.time.DurationField durationField5 = chronology3.weekyears();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.Chronology chronology5 = gJChronology2.withUTC();
        org.joda.time.DurationField durationField6 = gJChronology2.hours();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.clockhourOfDay();
        org.joda.time.ReadablePartial readablePartial8 = null;
        int[] intArray14 = new int[] { 3600000, 36000000, 36000000, (byte) 0, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            gJChronology2.validate(readablePartial8, intArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[3600000, 36000000, 36000000, 0, -1]");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        boolean boolean6 = instant4.isEqual((long) 1);
        org.joda.time.DateTime dateTime7 = instant4.toDateTimeISO();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = dateTime7.get(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DurationField durationField7 = gJChronology2.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 0);
        org.joda.time.Chronology chronology10 = gJChronology2.withZone(dateTimeZone9);
        int int12 = dateTimeZone9.getStandardOffset((-12219292800000L));
        java.lang.String str13 = dateTimeZone9.getID();
        org.joda.time.Instant instant15 = org.joda.time.Instant.parse("1970-01-01T00:00:00.001Z");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone9, (org.joda.time.ReadableInstant) instant15, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid min days in first week: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "UTC" + "'", str13, "UTC");
        org.junit.Assert.assertNotNull(instant15);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.dayOfYear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = julianChronology2.get(readablePeriod6, (long) 3600000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (short) 1);
        org.joda.time.chrono.JulianChronology julianChronology2 = org.joda.time.chrono.JulianChronology.getInstance(dateTimeZone1);
        org.joda.time.DateTimeField dateTimeField3 = julianChronology2.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField4 = julianChronology2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField5 = julianChronology2.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = julianChronology2.getDateTimeMillis(0, (int) (byte) -1, (int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(julianChronology2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.Instant instant1 = new org.joda.time.Instant(0L);
        long long2 = instant1.getMillis();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Instant instant4 = instant1.minus(readableDuration3);
        org.joda.time.DateTimeZone dateTimeZone5 = instant4.getZone();
        org.joda.time.chrono.GJChronology gJChronology6 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = gJChronology6.getDateTimeMillis((int) '4', 36000000, (int) (short) 100, (int) '4', (int) (byte) -1, 19, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(gJChronology6);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 36000000);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.Instant instant4 = instant1.withDurationAdded(readableDuration2, 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = null;
        java.lang.String str6 = instant1.toString(dateTimeFormatter5);
        org.joda.time.Instant instant9 = instant1.withDurationAdded(0L, 1582);
        long long10 = instant9.getMillis();
        java.util.Date date11 = instant9.toDate();
        long long12 = instant9.getMillis();
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970-01-01T10:00:00.000Z" + "'", str6, "1970-01-01T10:00:00.000Z");
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 36000000L + "'", long10 == 36000000L);
        org.junit.Assert.assertNotNull(date11);
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 10:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 36000000L + "'", long12 == 36000000L);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DateTimeField dateTimeField6 = gJChronology2.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone8, readableInstant9);
        org.joda.time.DateTimeZone dateTimeZone11 = gJChronology10.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHours((int) (byte) 10);
        java.lang.String str14 = dateTimeZone13.getID();
        org.joda.time.Chronology chronology15 = gJChronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone16 = gJChronology10.getZone();
        long long18 = dateTimeZone16.nextTransition((-12219292800000L));
        org.joda.time.Chronology chronology19 = gJChronology2.withZone(dateTimeZone16);
        org.joda.time.Chronology chronology20 = gJChronology2.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            long long25 = chronology20.getDateTimeMillis((int) ' ', 4200000, (int) (short) 1, 24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4200000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(gJChronology10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+10:00" + "'", str14, "+10:00");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-12219292800000L) + "'", long18 == (-12219292800000L));
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.chrono.GJChronology gJChronology2 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, readableInstant1);
        org.joda.time.Chronology chronology3 = gJChronology2.withUTC();
        org.joda.time.DateTimeField dateTimeField4 = gJChronology2.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField5 = gJChronology2.millisOfDay();
        org.joda.time.DurationField durationField6 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField7 = gJChronology2.hourOfHalfday();
        org.joda.time.DurationField durationField8 = gJChronology2.halfdays();
        org.joda.time.DateTimeField dateTimeField9 = gJChronology2.yearOfCentury();
        org.joda.time.DateTimeField dateTimeField10 = gJChronology2.weekyear();
        org.joda.time.DateTimeField dateTimeField11 = gJChronology2.secondOfDay();
        org.joda.time.DurationField durationField12 = gJChronology2.eras();
        org.junit.Assert.assertNotNull(gJChronology2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }
}
