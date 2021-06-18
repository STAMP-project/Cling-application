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
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Class<?> wildcardClass4 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        java.util.Locale locale6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType4, "hi!", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType8, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType5, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass9 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        java.lang.Class<?> wildcardClass12 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        java.lang.Class<?> wildcardClass10 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale11, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        dateTimeParserBucket14.setZone(dateTimeZone15);
        int int17 = dateTimeParserBucket14.getOffset();
        java.lang.Class<?> wildcardClass18 = dateTimeParserBucket14.getClass();
        boolean boolean19 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeParserBucket14);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType20, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Class<?> wildcardClass12 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale11, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        dateTimeParserBucket14.setZone(dateTimeZone15);
        int int17 = dateTimeParserBucket14.getOffset();
        java.lang.Class<?> wildcardClass18 = dateTimeParserBucket14.getClass();
        boolean boolean19 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeParserBucket14);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType20, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology13, locale14);
        long long18 = dateTimeParserBucket15.computeMillis(false, "hi!");
        dateTimeParserBucket15.setOffset(0);
        java.util.Locale locale21 = dateTimeParserBucket15.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType10, "", locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        dateTimeParserBucket17.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale22 = dateTimeParserBucket17.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType10, "hi!", locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        java.lang.Class<?> wildcardClass9 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeParserBucket5.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        java.lang.Class<?> wildcardClass10 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType14, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        boolean boolean22 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket16);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket16.saveField(dateTimeFieldType23, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType11, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        long long14 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long15 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeParserBucket3.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Class<?> wildcardClass6 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        long long11 = dateTimeParserBucket5.computeMillis(false, "hi!");
        long long14 = dateTimeParserBucket5.computeMillis(true, "hi!");
        long long15 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.lang.Class<?> wildcardClass10 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        java.lang.Class<?> wildcardClass11 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType7, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        java.lang.Class<?> wildcardClass9 = chronology8.getClass();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long7 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        long long11 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType12, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-11L) + "'", long11 == (-11L));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket3.saveField(dateTimeField11, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket5.saveField(dateTimeField10, (int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType13, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket15.setOffset((int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket15.getChronology();
        long long19 = dateTimeParserBucket15.computeMillis();
        dateTimeParserBucket15.setOffset((java.lang.Integer) (-1));
        long long23 = dateTimeParserBucket15.computeMillis(false);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket15.getChronology();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale28, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        dateTimeParserBucket31.setZone(dateTimeZone32);
        int int34 = dateTimeParserBucket31.getOffset();
        org.joda.time.Chronology chronology35 = dateTimeParserBucket31.getChronology();
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(0L, chronology37, locale38, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket41.setOffset((int) 'a');
        org.joda.time.Chronology chronology44 = dateTimeParserBucket41.getChronology();
        java.util.Locale locale45 = dateTimeParserBucket41.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology35, locale45, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology24, locale45, (java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType7, "hi!", locale45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-97L) + "'", long19 == (-97L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        boolean boolean22 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket16);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        org.joda.time.DateTimeField dateTimeField24 = null;
        dateTimeParserBucket16.saveField(dateTimeField24, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long12 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass42 = chronology15.getClass();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType12, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket3.saveField(dateTimeField16, (int) '#');
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket3.saveField(dateTimeField5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeParserBucket3.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType23, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType11, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeParserBucket5.computeMillis(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        java.lang.Class<?> wildcardClass17 = locale16.getClass();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType11, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        long long15 = dateTimeParserBucket5.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket5.getZone();
        org.joda.time.Chronology chronology17 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket3.saveField(dateTimeField12, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeParserBucket3.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale9 = dateTimeParserBucket5.getLocale();
        java.lang.Class<?> wildcardClass10 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeParserBucket3.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Class<?> wildcardClass11 = dateTimeZone10.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setOffset((int) (byte) 100);
        int int21 = dateTimeParserBucket16.getOffset();
        java.util.Locale locale22 = dateTimeParserBucket16.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType9, "hi!", locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        java.lang.Class<?> wildcardClass13 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        int int10 = dateTimeParserBucket5.getOffset();
        long long13 = dateTimeParserBucket5.computeMillis(false, "hi!");
        long long14 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-97L) + "'", long14 == (-97L));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        dateTimeParserBucket17.setZone(dateTimeZone18);
        int int20 = dateTimeParserBucket17.getOffset();
        org.joda.time.Chronology chronology21 = dateTimeParserBucket17.getChronology();
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology23, locale24, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket27.setOffset((int) 'a');
        dateTimeParserBucket27.setOffset((int) (byte) 100);
        int int32 = dateTimeParserBucket27.getOffset();
        java.util.Locale locale33 = dateTimeParserBucket27.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(0L, chronology21, locale33);
        boolean boolean35 = dateTimeParserBucket3.restoreState((java.lang.Object) 0L);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 100 + "'", int32 == 100);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket5.saveField(dateTimeField11, (int) (short) 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale4, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket7.setOffset((int) 'a');
        long long11 = dateTimeParserBucket7.computeMillis(true);
        java.util.Locale locale12 = dateTimeParserBucket7.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale12, (java.lang.Integer) 10);
        long long15 = dateTimeParserBucket14.computeMillis();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-97L) + "'", long11 == (-97L));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        int int19 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType8, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int10 = dateTimeParserBucket3.getOffsetInteger();
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        int int10 = dateTimeParserBucket5.getOffset();
        long long13 = dateTimeParserBucket5.computeMillis(false, "hi!");
        long long14 = dateTimeParserBucket5.computeMillis();
        int int15 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-97L) + "'", long14 == (-97L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        boolean boolean22 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket16);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType24, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType11, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Integer int14 = dateTimeParserBucket3.getOffsetInteger();
        dateTimeParserBucket3.setOffset(0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket3.saveField(dateTimeField11, (int) (byte) -1);
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((int) 'a');
        long long22 = dateTimeParserBucket19.computeMillis();
        long long23 = dateTimeParserBucket19.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket19.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone24);
        java.lang.Integer int26 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-97L) + "'", long22 == (-97L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        long long13 = dateTimeParserBucket5.computeMillis(true, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType14, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket5.getZone();
        java.lang.Class<?> wildcardClass12 = dateTimeZone11.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.Chronology chronology7 = null;
        java.util.Locale locale8 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology7, locale8);
        long long12 = dateTimeParserBucket9.computeMillis(false, "hi!");
        dateTimeParserBucket9.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int15 = dateTimeParserBucket9.getOffsetInteger();
        java.util.Locale locale16 = dateTimeParserBucket9.getLocale();
        long long19 = dateTimeParserBucket9.computeMillis(false, "hi!");
        dateTimeParserBucket9.setOffset((java.lang.Integer) 1);
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology23, locale24);
        int int26 = dateTimeParserBucket25.getOffset();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        dateTimeParserBucket25.setZone(dateTimeZone27);
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology30, locale31);
        long long35 = dateTimeParserBucket32.computeMillis(false, "hi!");
        java.lang.Object obj36 = dateTimeParserBucket32.saveState();
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeParserBucket32.getZone();
        dateTimeParserBucket25.setZone(dateTimeZone37);
        dateTimeParserBucket9.setZone(dateTimeZone37);
        dateTimeParserBucket3.setZone(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        long long6 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = dateTimeParserBucket5.computeMillis(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology4, locale5);
        dateTimeParserBucket6.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        int int10 = dateTimeParserBucket6.getOffset();
        org.joda.time.Chronology chronology11 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale15, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        dateTimeParserBucket18.setZone(dateTimeZone19);
        int int21 = dateTimeParserBucket18.getOffset();
        org.joda.time.Chronology chronology22 = dateTimeParserBucket18.getChronology();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket28.setOffset((int) 'a');
        org.joda.time.Chronology chronology31 = dateTimeParserBucket28.getChronology();
        java.util.Locale locale32 = dateTimeParserBucket28.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology22, locale32, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((-100L), chronology11, locale32);
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale39, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket42.setOffset((int) 'a');
        org.joda.time.Chronology chronology45 = dateTimeParserBucket42.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = null;
        dateTimeParserBucket42.saveField(dateTimeField46, 0);
        dateTimeParserBucket42.setOffset((int) (short) 100);
        dateTimeParserBucket42.setOffset((int) (short) 100);
        java.util.Locale locale53 = dateTimeParserBucket42.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale53, (java.lang.Integer) 100, (int) ' ');
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket61 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology59, locale60);
        dateTimeParserBucket61.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology64 = dateTimeParserBucket61.getChronology();
        int int65 = dateTimeParserBucket61.getOffset();
        org.joda.time.Chronology chronology66 = dateTimeParserBucket61.getChronology();
        org.joda.time.Chronology chronology69 = null;
        java.util.Locale locale70 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket(0L, chronology69, locale70, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        dateTimeParserBucket73.setZone(dateTimeZone74);
        int int76 = dateTimeParserBucket73.getOffset();
        org.joda.time.Chronology chronology77 = dateTimeParserBucket73.getChronology();
        org.joda.time.Chronology chronology79 = null;
        java.util.Locale locale80 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket83 = new org.joda.time.format.DateTimeParserBucket(0L, chronology79, locale80, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket83.setOffset((int) 'a');
        org.joda.time.Chronology chronology86 = dateTimeParserBucket83.getChronology();
        java.util.Locale locale87 = dateTimeParserBucket83.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket90 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology77, locale87, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket91 = new org.joda.time.format.DateTimeParserBucket((-100L), chronology66, locale87);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket93 = new org.joda.time.format.DateTimeParserBucket(10L, chronology11, locale87, (java.lang.Integer) 52);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 100 + "'", int65 == 100);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(chronology86);
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "en_US");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale4, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket7.setOffset((int) 'a');
        long long11 = dateTimeParserBucket7.computeMillis(true);
        java.util.Locale locale12 = dateTimeParserBucket7.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale12, (java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass15 = locale12.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-97L) + "'", long11 == (-97L));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        java.lang.Class<?> wildcardClass10 = chronology9.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket3.saveField(dateTimeField11, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        dateTimeParserBucket19.setZone(dateTimeZone20);
        int int22 = dateTimeParserBucket19.getOffset();
        org.joda.time.Chronology chronology23 = dateTimeParserBucket19.getChronology();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(0L, chronology25, locale26, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket29.setOffset((int) 'a');
        org.joda.time.Chronology chronology32 = dateTimeParserBucket29.getChronology();
        java.util.Locale locale33 = dateTimeParserBucket29.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology23, locale33, (java.lang.Integer) 10, (int) '4');
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket(0L, chronology39, locale40, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        dateTimeParserBucket43.setZone(dateTimeZone44);
        int int46 = dateTimeParserBucket43.getOffset();
        org.joda.time.Chronology chronology47 = dateTimeParserBucket43.getChronology();
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(0L, chronology49, locale50, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket53.setOffset((int) 'a');
        org.joda.time.Chronology chronology56 = dateTimeParserBucket53.getChronology();
        java.util.Locale locale57 = dateTimeParserBucket53.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology47, locale57, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology23, locale57, (java.lang.Integer) 97, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType10, "hi!", locale57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket3.saveField(dateTimeField12, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeParserBucket3.computeMillis(true, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        long long44 = dateTimeParserBucket41.computeMillis(false, "hi!");
        int int45 = dateTimeParserBucket41.getOffset();
        int int46 = dateTimeParserBucket41.getOffset();
        org.joda.time.Chronology chronology47 = dateTimeParserBucket41.getChronology();
        java.lang.Object obj48 = dateTimeParserBucket41.saveState();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        long long13 = dateTimeParserBucket5.computeMillis(true);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType14, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone21);
        int int23 = dateTimeParserBucket3.getOffset();
        long long26 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        int int35 = dateTimeParserBucket32.getOffset();
        int int36 = dateTimeParserBucket32.getOffset();
        dateTimeParserBucket32.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj39 = dateTimeParserBucket32.saveState();
        org.joda.time.DateTimeZone dateTimeZone40 = dateTimeParserBucket32.getZone();
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket(0L, chronology42, locale43, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket46.setOffset((int) 'a');
        int int49 = dateTimeParserBucket46.getOffset();
        int int50 = dateTimeParserBucket46.getOffset();
        dateTimeParserBucket46.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj53 = dateTimeParserBucket46.saveState();
        org.joda.time.DateTimeZone dateTimeZone54 = dateTimeParserBucket46.getZone();
        dateTimeParserBucket32.setZone(dateTimeZone54);
        dateTimeParserBucket3.setZone(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 97 + "'", int35 == 97);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(obj39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 97 + "'", int49 == 97);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeParserBucket5.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone21);
        int int23 = dateTimeParserBucket3.getOffset();
        long long26 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Class<?> wildcardClass27 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        int int12 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        java.lang.Class<?> wildcardClass14 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeParserBucket3.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        java.lang.Integer int6 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj12 = dateTimeParserBucket5.saveState();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, (int) ' ');
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket3.getZone();
        java.lang.Class<?> wildcardClass18 = dateTimeZone17.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 97);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(100L, chronology11, locale12);
        dateTimeParserBucket13.setOffset((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        dateTimeParserBucket41.setOffset((java.lang.Integer) 1);
        org.joda.time.Chronology chronology46 = dateTimeParserBucket41.getChronology();
        java.lang.Class<?> wildcardClass47 = dateTimeParserBucket41.getClass();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket5.saveField(dateTimeField11, (int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType14, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology12, locale13);
        java.lang.Integer int15 = dateTimeParserBucket14.getPivotYear();
        long long18 = dateTimeParserBucket14.computeMillis(false, "hi!");
        dateTimeParserBucket14.setOffset((java.lang.Integer) 10);
        boolean boolean21 = dateTimeParserBucket3.restoreState((java.lang.Object) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType22, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long8 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        long long14 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int10 = dateTimeParserBucket3.getOffsetInteger();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket5.getChronology();
        long long15 = dateTimeParserBucket5.computeMillis();
        org.joda.time.Chronology chronology16 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology18, locale19);
        long long23 = dateTimeParserBucket20.computeMillis(false, "hi!");
        dateTimeParserBucket20.setOffset(0);
        java.lang.Object obj26 = dateTimeParserBucket20.saveState();
        long long28 = dateTimeParserBucket20.computeMillis(false);
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology30, locale31);
        int int33 = dateTimeParserBucket32.getOffset();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        dateTimeParserBucket32.setZone(dateTimeZone34);
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology37, locale38);
        long long42 = dateTimeParserBucket39.computeMillis(false, "hi!");
        java.lang.Object obj43 = dateTimeParserBucket39.saveState();
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeParserBucket39.getZone();
        dateTimeParserBucket32.setZone(dateTimeZone44);
        dateTimeParserBucket20.setZone(dateTimeZone44);
        dateTimeParserBucket5.setZone(dateTimeZone44);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-97L) + "'", long15 == (-97L));
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + (-1L) + "'", long42 == (-1L));
        org.junit.Assert.assertNotNull(obj43);
        org.junit.Assert.assertNotNull(dateTimeZone44);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        dateTimeParserBucket41.setOffset((java.lang.Integer) 1);
        org.joda.time.Chronology chronology46 = dateTimeParserBucket41.getChronology();
        java.lang.Class<?> wildcardClass47 = chronology46.getClass();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        boolean boolean22 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket16);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology27, locale28);
        org.joda.time.DateTimeField dateTimeField30 = null;
        dateTimeParserBucket29.saveField(dateTimeField30, (int) (byte) 1);
        int int33 = dateTimeParserBucket29.getOffset();
        java.util.Locale locale34 = dateTimeParserBucket29.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket16.saveField(dateTimeFieldType24, "", locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        dateTimeParserBucket6.setZone(dateTimeZone7);
        int int9 = dateTimeParserBucket6.getOffset();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setOffset((int) (byte) 100);
        int int21 = dateTimeParserBucket16.getOffset();
        java.util.Locale locale22 = dateTimeParserBucket16.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale22);
        java.lang.Class<?> wildcardClass24 = dateTimeParserBucket23.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket3.saveField(dateTimeField16, (int) '#');
        java.util.Locale locale19 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        boolean boolean22 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket16);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = null;
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale28, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket31.setOffset((int) 'a');
        dateTimeParserBucket31.setOffset((int) (byte) 100);
        int int36 = dateTimeParserBucket31.getOffset();
        java.util.Locale locale37 = dateTimeParserBucket31.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket16.saveField(dateTimeFieldType24, "", locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 100 + "'", int36 == 100);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Class<?> wildcardClass11 = dateTimeZone10.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        long long12 = dateTimeParserBucket5.computeMillis(false, "");
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology14, locale15);
        long long19 = dateTimeParserBucket16.computeMillis(false, "hi!");
        dateTimeParserBucket16.setOffset(0);
        java.util.Locale locale22 = dateTimeParserBucket16.getLocale();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField27 = null;
        dateTimeParserBucket16.saveField(dateTimeField27, (int) ' ');
        boolean boolean30 = dateTimeParserBucket5.restoreState((java.lang.Object) ' ');
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 10);
        java.util.Locale locale35 = dateTimeParserBucket5.getLocale();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale4, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket7.setOffset((int) 'a');
        long long11 = dateTimeParserBucket7.computeMillis(true);
        java.util.Locale locale12 = dateTimeParserBucket7.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale12, (java.lang.Integer) 10);
        dateTimeParserBucket14.setOffset((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass17 = dateTimeParserBucket14.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-97L) + "'", long11 == (-97L));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket41.saveField(dateTimeFieldType44, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale11, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        dateTimeParserBucket14.setZone(dateTimeZone15);
        int int17 = dateTimeParserBucket14.getOffset();
        java.lang.Class<?> wildcardClass18 = dateTimeParserBucket14.getClass();
        boolean boolean19 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeParserBucket14);
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology21, locale22);
        long long26 = dateTimeParserBucket23.computeMillis(false, "hi!");
        dateTimeParserBucket23.setOffset(0);
        java.util.Locale locale29 = dateTimeParserBucket23.getLocale();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeParserBucket23.getZone();
        dateTimeParserBucket5.setZone(dateTimeZone30);
        long long34 = dateTimeParserBucket5.computeMillis(false, "hi!");
        long long35 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-97L) + "'", long34 == (-97L));
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-97L) + "'", long35 == (-97L));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        int int19 = dateTimeParserBucket16.getOffset();
        int int20 = dateTimeParserBucket16.getOffset();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket5.setZone(dateTimeZone21);
        long long23 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        long long12 = dateTimeParserBucket5.computeMillis(false, "");
        java.lang.Class<?> wildcardClass13 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 97);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(100L, chronology11, locale12);
        java.lang.Integer int14 = dateTimeParserBucket13.getPivotYear();
        dateTimeParserBucket13.setOffset((java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket13.saveField(dateTimeFieldType17, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        java.lang.Object obj9 = dateTimeParserBucket5.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        boolean boolean12 = dateTimeParserBucket5.restoreState((java.lang.Object) 0);
        long long13 = dateTimeParserBucket5.computeMillis();
        int int14 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeParserBucket5.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long8 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long12 = dateTimeParserBucket3.computeMillis(false);
        long long14 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology14, locale15);
        org.joda.time.DateTimeField dateTimeField17 = null;
        dateTimeParserBucket16.saveField(dateTimeField17, (int) (byte) 1);
        int int20 = dateTimeParserBucket16.getOffset();
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket5.setZone(dateTimeZone23);
        java.util.Locale locale25 = dateTimeParserBucket5.getLocale();
        long long27 = dateTimeParserBucket5.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-97L) + "'", long27 == (-97L));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        long long8 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket15.setOffset((int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket15.getChronology();
        long long19 = dateTimeParserBucket15.computeMillis();
        dateTimeParserBucket15.setOffset((java.lang.Integer) (-1));
        long long23 = dateTimeParserBucket15.computeMillis(false);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket15.getChronology();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale28, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        dateTimeParserBucket31.setZone(dateTimeZone32);
        int int34 = dateTimeParserBucket31.getOffset();
        org.joda.time.Chronology chronology35 = dateTimeParserBucket31.getChronology();
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(0L, chronology37, locale38, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket41.setOffset((int) 'a');
        org.joda.time.Chronology chronology44 = dateTimeParserBucket41.getChronology();
        java.util.Locale locale45 = dateTimeParserBucket41.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology35, locale45, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology24, locale45, (java.lang.Integer) 10);
        long long53 = dateTimeParserBucket50.computeMillis(false, "hi!");
        int int54 = dateTimeParserBucket50.getOffset();
        boolean boolean55 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket50);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket50.saveField(dateTimeFieldType56, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-97L) + "'", long19 == (-97L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        long long12 = dateTimeParserBucket3.computeMillis(false, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology16, locale17, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket20.setOffset((int) 'a');
        long long24 = dateTimeParserBucket20.computeMillis(true);
        java.util.Locale locale25 = dateTimeParserBucket20.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType13, "", locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-11L) + "'", long12 == (-11L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-97L) + "'", long24 == (-97L));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        long long6 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology7 = dateTimeParserBucket3.getChronology();
        java.lang.Class<?> wildcardClass8 = chronology7.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-101L) + "'", long6 == (-101L));
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale9, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket12.setOffset((int) 'a');
        org.joda.time.Chronology chronology15 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket12.saveField(dateTimeField16, 0);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        boolean boolean23 = dateTimeParserBucket5.restoreState((java.lang.Object) (short) 100);
        java.lang.Integer int24 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType25, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(int24);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        java.lang.Class<?> wildcardClass10 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset(97);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket3.getChronology();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology13, locale14);
        long long18 = dateTimeParserBucket15.computeMillis(false, "hi!");
        int int19 = dateTimeParserBucket15.getOffset();
        dateTimeParserBucket15.setOffset((int) (short) 10);
        java.util.Locale locale22 = dateTimeParserBucket15.getLocale();
        java.lang.Integer int23 = dateTimeParserBucket15.getPivotYear();
        java.util.Locale locale24 = dateTimeParserBucket15.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType10, "hi!", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField8 = null;
        dateTimeParserBucket3.saveField(dateTimeField8, (-1));
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeParserBucket3.computeMillis(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        long long13 = dateTimeParserBucket5.computeMillis(true, "");
        java.lang.Object obj14 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset(97);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket5.saveField(dateTimeField10, 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType13, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.util.Locale locale11 = dateTimeParserBucket3.getLocale();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        int int8 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Integer int11 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long16 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.Chronology chronology17 = dateTimeParserBucket3.getChronology();
        java.lang.Object obj18 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        boolean boolean22 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket16);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        long long24 = dateTimeParserBucket16.computeMillis();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology26, locale27);
        long long31 = dateTimeParserBucket28.computeMillis(false, "hi!");
        dateTimeParserBucket28.setOffset(0);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeParserBucket28.getZone();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket28.getZone();
        dateTimeParserBucket16.setZone(dateTimeZone35);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-97L) + "'", long24 == (-97L));
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        boolean boolean12 = dateTimeParserBucket5.restoreState((java.lang.Object) 0);
        long long13 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        java.lang.Class<?> wildcardClass16 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset((int) (byte) -1);
        long long17 = dateTimeParserBucket3.computeMillis(true, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket15.setOffset((java.lang.Integer) 0);
        java.util.Locale locale18 = dateTimeParserBucket15.getLocale();
        boolean boolean19 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket15);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        java.util.Locale locale22 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        long long8 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket15.setOffset((int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket15.getChronology();
        long long19 = dateTimeParserBucket15.computeMillis();
        dateTimeParserBucket15.setOffset((java.lang.Integer) (-1));
        long long23 = dateTimeParserBucket15.computeMillis(false);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket15.getChronology();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale28, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        dateTimeParserBucket31.setZone(dateTimeZone32);
        int int34 = dateTimeParserBucket31.getOffset();
        org.joda.time.Chronology chronology35 = dateTimeParserBucket31.getChronology();
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(0L, chronology37, locale38, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket41.setOffset((int) 'a');
        org.joda.time.Chronology chronology44 = dateTimeParserBucket41.getChronology();
        java.util.Locale locale45 = dateTimeParserBucket41.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology35, locale45, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology24, locale45, (java.lang.Integer) 10);
        long long53 = dateTimeParserBucket50.computeMillis(false, "hi!");
        int int54 = dateTimeParserBucket50.getOffset();
        boolean boolean55 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket50);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType56, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-97L) + "'", long19 == (-97L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket5.setOffset(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology28, locale29);
        dateTimeParserBucket30.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology33 = dateTimeParserBucket30.getChronology();
        int int34 = dateTimeParserBucket30.getOffset();
        org.joda.time.Chronology chronology35 = dateTimeParserBucket30.getChronology();
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale39, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        dateTimeParserBucket42.setZone(dateTimeZone43);
        int int45 = dateTimeParserBucket42.getOffset();
        org.joda.time.Chronology chronology46 = dateTimeParserBucket42.getChronology();
        org.joda.time.Chronology chronology48 = null;
        java.util.Locale locale49 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket(0L, chronology48, locale49, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket52.setOffset((int) 'a');
        org.joda.time.Chronology chronology55 = dateTimeParserBucket52.getChronology();
        java.util.Locale locale56 = dateTimeParserBucket52.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology46, locale56, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((-100L), chronology35, locale56);
        org.joda.time.Chronology chronology62 = null;
        java.util.Locale locale63 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket66 = new org.joda.time.format.DateTimeParserBucket(0L, chronology62, locale63, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket66.setOffset((int) 'a');
        org.joda.time.Chronology chronology69 = dateTimeParserBucket66.getChronology();
        org.joda.time.DateTimeField dateTimeField70 = null;
        dateTimeParserBucket66.saveField(dateTimeField70, 0);
        dateTimeParserBucket66.setOffset((int) (short) 100);
        dateTimeParserBucket66.setOffset((int) (short) 100);
        java.util.Locale locale77 = dateTimeParserBucket66.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket(0L, chronology35, locale77, (java.lang.Integer) 100, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType23, "hi!", locale77);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(locale77);
        org.junit.Assert.assertEquals(locale77.toString(), "en_US");
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeParserBucket5.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        long long13 = dateTimeParserBucket3.computeMillis(false);
        long long16 = dateTimeParserBucket3.computeMillis(true, "hi!");
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType17, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Integer int11 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long16 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long17 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology11, locale12);
        long long16 = dateTimeParserBucket13.computeMillis(false, "hi!");
        dateTimeParserBucket13.setOffset(0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeParserBucket13.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        long long12 = dateTimeParserBucket5.computeMillis(false, "");
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        long long15 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket3.saveField(dateTimeField5, (int) (byte) -1);
        java.lang.Integer int8 = dateTimeParserBucket3.getOffsetInteger();
        dateTimeParserBucket3.setOffset((int) '4');
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        dateTimeParserBucket4.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket4.getChronology();
        int int8 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        dateTimeParserBucket16.setZone(dateTimeZone17);
        int int19 = dateTimeParserBucket16.getOffset();
        org.joda.time.Chronology chronology20 = dateTimeParserBucket16.getChronology();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale23, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket26.setOffset((int) 'a');
        org.joda.time.Chronology chronology29 = dateTimeParserBucket26.getChronology();
        java.util.Locale locale30 = dateTimeParserBucket26.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology20, locale30, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((-100L), chronology9, locale30);
        long long37 = dateTimeParserBucket34.computeMillis(true, "");
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-100L) + "'", long37 == (-100L));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        java.util.Locale locale44 = dateTimeParserBucket41.getLocale();
        long long45 = dateTimeParserBucket41.computeMillis();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-2L) + "'", long45 == (-2L));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale9, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket12.setOffset((int) 'a');
        org.joda.time.Chronology chronology15 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket12.saveField(dateTimeField16, 0);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        boolean boolean23 = dateTimeParserBucket5.restoreState((java.lang.Object) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        java.lang.Integer int8 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 97);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(100L, chronology11, locale12);
        java.lang.Integer int14 = dateTimeParserBucket13.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket13.getZone();
        java.lang.Integer int16 = dateTimeParserBucket13.getPivotYear();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(int16);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        java.lang.Object obj8 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology14, locale15);
        long long19 = dateTimeParserBucket16.computeMillis(false, "hi!");
        java.lang.Object obj20 = dateTimeParserBucket16.saveState();
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 97);
        org.joda.time.Chronology chronology23 = dateTimeParserBucket16.getChronology();
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(100L, chronology23, locale24);
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology27, locale28);
        long long32 = dateTimeParserBucket29.computeMillis(false, "hi!");
        dateTimeParserBucket29.setOffset(0);
        java.util.Locale locale35 = dateTimeParserBucket29.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology23, locale35, (java.lang.Integer) 1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType9, "", locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        long long14 = dateTimeParserBucket3.computeMillis(true, "");
        java.lang.Class<?> wildcardClass15 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket5.getChronology();
        int int15 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        long long44 = dateTimeParserBucket41.computeMillis(false, "hi!");
        int int45 = dateTimeParserBucket41.getOffset();
        int int46 = dateTimeParserBucket41.getOffset();
        org.joda.time.Chronology chronology47 = dateTimeParserBucket41.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = null;
        dateTimeParserBucket41.saveField(dateTimeField48, (-1));
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(chronology47);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        long long15 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset(97);
        java.lang.Class<?> wildcardClass18 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        dateTimeParserBucket41.setOffset((java.lang.Integer) 1);
        java.util.Locale locale46 = dateTimeParserBucket41.getLocale();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long8 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        dateTimeParserBucket41.setOffset((java.lang.Integer) 1);
        org.joda.time.Chronology chronology46 = dateTimeParserBucket41.getChronology();
        dateTimeParserBucket41.setPivotYear((java.lang.Integer) 52);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology46);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        long long14 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket3.saveField(dateTimeField15, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(10L, chronology1, locale2, (java.lang.Integer) 1, (int) 'a');
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket3.saveField(dateTimeField11, 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        int int10 = dateTimeParserBucket5.getOffset();
        java.util.Locale locale11 = dateTimeParserBucket5.getLocale();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology13, locale14);
        long long18 = dateTimeParserBucket15.computeMillis(false, "hi!");
        dateTimeParserBucket15.setOffset(0);
        java.lang.Object obj21 = dateTimeParserBucket15.saveState();
        long long23 = dateTimeParserBucket15.computeMillis(false);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology25, locale26);
        int int28 = dateTimeParserBucket27.getOffset();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        dateTimeParserBucket27.setZone(dateTimeZone29);
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology32, locale33);
        long long37 = dateTimeParserBucket34.computeMillis(false, "hi!");
        java.lang.Object obj38 = dateTimeParserBucket34.saveState();
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeParserBucket34.getZone();
        dateTimeParserBucket27.setZone(dateTimeZone39);
        dateTimeParserBucket15.setZone(dateTimeZone39);
        boolean boolean42 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeZone39);
        dateTimeParserBucket5.setOffset((int) (short) 10);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long8 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket5.getZone();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        int int20 = dateTimeParserBucket17.getOffset();
        int int21 = dateTimeParserBucket17.getOffset();
        dateTimeParserBucket17.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj24 = dateTimeParserBucket17.saveState();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeParserBucket17.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket17.getZone();
        dateTimeParserBucket5.setZone(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 97 + "'", int20 == 97);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology6, locale7);
        long long11 = dateTimeParserBucket8.computeMillis(false, "hi!");
        dateTimeParserBucket8.setOffset(0);
        java.util.Locale locale14 = dateTimeParserBucket8.getLocale();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket8.getZone();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(0L, chronology17, locale18, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket21.setOffset((int) 'a');
        dateTimeParserBucket21.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket21.getZone();
        dateTimeParserBucket8.setZone(dateTimeZone26);
        dateTimeParserBucket3.setZone(dateTimeZone26);
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology30, locale31);
        long long35 = dateTimeParserBucket32.computeMillis(false, "hi!");
        java.lang.Object obj36 = dateTimeParserBucket32.saveState();
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeParserBucket32.getZone();
        java.lang.Object obj38 = dateTimeParserBucket32.saveState();
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeParserBucket32.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        java.lang.Object obj8 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket6.saveField(dateTimeField10, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((int) 'a');
        org.joda.time.Chronology chronology22 = dateTimeParserBucket19.getChronology();
        java.util.Locale locale23 = dateTimeParserBucket19.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology13, locale23);
        java.lang.Class<?> wildcardClass25 = chronology13.getClass();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 52);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType14, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        int int11 = dateTimeParserBucket3.getOffset();
        java.lang.Class<?> wildcardClass12 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket5.getChronology();
        long long15 = dateTimeParserBucket5.computeMillis();
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket5.saveField(dateTimeField16, (int) (byte) -1);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-97L) + "'", long15 == (-97L));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        org.joda.time.DateTimeField dateTimeField7 = null;
        dateTimeParserBucket3.saveField(dateTimeField7, (int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        dateTimeParserBucket6.setOffset((java.lang.Integer) 97);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        dateTimeParserBucket32.setOffset((int) (byte) 100);
        int int37 = dateTimeParserBucket32.getOffset();
        java.util.Locale locale38 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale38);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology15, locale38);
        java.lang.Class<?> wildcardClass41 = locale38.getClass();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Integer int11 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long16 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.DateTimeField dateTimeField17 = null;
        dateTimeParserBucket3.saveField(dateTimeField17, (int) (byte) 1);
        java.lang.Object obj20 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((int) (short) 0);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 97);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(100L, chronology11, locale12);
        long long14 = dateTimeParserBucket13.computeMillis();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket6.saveField(dateTimeField10, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale16);
        long long20 = dateTimeParserBucket17.computeMillis(false, "hi!");
        dateTimeParserBucket17.setOffset(0);
        java.lang.Object obj23 = dateTimeParserBucket17.saveState();
        java.util.Locale locale24 = dateTimeParserBucket17.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((-101L), chronology13, locale24, (java.lang.Integer) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket26.saveField(dateTimeFieldType27, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        java.lang.Object obj16 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology18, locale19);
        org.joda.time.DateTimeField dateTimeField21 = null;
        dateTimeParserBucket20.saveField(dateTimeField21, (int) (byte) 1);
        dateTimeParserBucket20.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket20.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeParserBucket20.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone28);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType30, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(dateTimeZone28);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, (int) (byte) 10);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType13, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        java.lang.Class<?> wildcardClass12 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale4, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        dateTimeParserBucket7.setZone(dateTimeZone8);
        int int10 = dateTimeParserBucket7.getOffset();
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        org.joda.time.Chronology chronology20 = dateTimeParserBucket17.getChronology();
        java.util.Locale locale21 = dateTimeParserBucket17.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology11, locale21, (java.lang.Integer) 10, (int) '4');
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale28, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        dateTimeParserBucket31.setZone(dateTimeZone32);
        int int34 = dateTimeParserBucket31.getOffset();
        org.joda.time.Chronology chronology35 = dateTimeParserBucket31.getChronology();
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(0L, chronology37, locale38, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket41.setOffset((int) 'a');
        org.joda.time.Chronology chronology44 = dateTimeParserBucket41.getChronology();
        java.util.Locale locale45 = dateTimeParserBucket41.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology35, locale45, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology11, locale45, (java.lang.Integer) 97, (int) (short) 1);
        java.lang.Object obj52 = dateTimeParserBucket51.saveState();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj52);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket3.saveField(dateTimeField12, (int) (short) -1);
        java.lang.Object obj15 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology19, locale20);
        long long24 = dateTimeParserBucket21.computeMillis(false, "hi!");
        dateTimeParserBucket21.setOffset(0);
        java.util.Locale locale27 = dateTimeParserBucket21.getLocale();
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeParserBucket21.getZone();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(0L, chronology30, locale31, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket34.setOffset((int) 'a');
        dateTimeParserBucket34.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeParserBucket34.getZone();
        boolean boolean40 = dateTimeParserBucket21.restoreState((java.lang.Object) dateTimeParserBucket34);
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeParserBucket21.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone41);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(dateTimeZone41);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        long long15 = dateTimeParserBucket5.computeMillis(false);
        long long16 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        int int9 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset(100);
        java.lang.Object obj13 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone21);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField25 = null;
        dateTimeParserBucket3.saveField(dateTimeField25, (int) (byte) -1);
        int int28 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        dateTimeParserBucket3.setZone(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology8, locale9);
        long long13 = dateTimeParserBucket10.computeMillis(false, "hi!");
        java.lang.Object obj14 = dateTimeParserBucket10.saveState();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket10.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone15);
        java.lang.Integer int17 = dateTimeParserBucket3.getPivotYear();
        java.lang.Integer int18 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        int int9 = dateTimeParserBucket6.getOffset();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket6.saveField(dateTimeField10, (int) (byte) 10);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology17, locale18);
        dateTimeParserBucket19.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology22 = dateTimeParserBucket19.getChronology();
        int int23 = dateTimeParserBucket19.getOffset();
        org.joda.time.Chronology chronology24 = dateTimeParserBucket19.getChronology();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology27, locale28);
        long long32 = dateTimeParserBucket29.computeMillis(false, "hi!");
        dateTimeParserBucket29.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology35 = dateTimeParserBucket29.getChronology();
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale39, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket42.setOffset((int) 'a');
        org.joda.time.Chronology chronology45 = dateTimeParserBucket42.getChronology();
        org.joda.time.DateTimeField dateTimeField46 = null;
        dateTimeParserBucket42.saveField(dateTimeField46, 0);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket42.getChronology();
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale52 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket(0L, chronology51, locale52, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket55.setOffset((int) 'a');
        org.joda.time.Chronology chronology58 = dateTimeParserBucket55.getChronology();
        java.util.Locale locale59 = dateTimeParserBucket55.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology49, locale59);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket62 = new org.joda.time.format.DateTimeParserBucket(100L, chronology35, locale59, (java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 100, chronology24, locale59);
        org.joda.time.Chronology chronology67 = null;
        java.util.Locale locale68 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology67, locale68);
        long long72 = dateTimeParserBucket69.computeMillis(false, "hi!");
        java.lang.Object obj73 = dateTimeParserBucket69.saveState();
        dateTimeParserBucket69.setPivotYear((java.lang.Integer) 97);
        org.joda.time.Chronology chronology76 = dateTimeParserBucket69.getChronology();
        java.util.Locale locale77 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket78 = new org.joda.time.format.DateTimeParserBucket(100L, chronology76, locale77);
        org.joda.time.Chronology chronology80 = null;
        java.util.Locale locale81 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket82 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology80, locale81);
        long long85 = dateTimeParserBucket82.computeMillis(false, "hi!");
        dateTimeParserBucket82.setOffset(0);
        java.util.Locale locale88 = dateTimeParserBucket82.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket91 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology76, locale88, (java.lang.Integer) 1, (int) (short) -1);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket94 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology24, locale88, (java.lang.Integer) 1, (int) (short) -1);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket95 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 0, chronology13, locale88);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(chronology58);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + (-1L) + "'", long72 == (-1L));
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertTrue("'" + long85 + "' != '" + (-1L) + "'", long85 == (-1L));
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "en_US");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        long long13 = dateTimeParserBucket5.computeMillis(true);
        java.lang.Object obj14 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        int int14 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        java.lang.Object obj14 = dateTimeParserBucket5.saveState();
        java.util.Locale locale15 = dateTimeParserBucket5.getLocale();
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj12 = dateTimeParserBucket5.saveState();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket5.saveField(dateTimeField15, (int) 'a');
        java.lang.Class<?> wildcardClass18 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType9, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket3.getChronology();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset(0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long13 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket3.getZone();
        java.lang.Class<?> wildcardClass13 = dateTimeZone12.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long8 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType9, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket5.saveField(dateTimeField11, (int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeParserBucket5.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long11 = dateTimeParserBucket3.computeMillis();
        long long13 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology14, locale15);
        org.joda.time.DateTimeField dateTimeField17 = null;
        dateTimeParserBucket16.saveField(dateTimeField17, (int) (byte) 1);
        dateTimeParserBucket16.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone24);
        java.util.Locale locale26 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeField dateTimeField27 = null;
        dateTimeParserBucket3.saveField(dateTimeField27, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        long long13 = dateTimeParserBucket5.computeMillis(true, "");
        java.util.Locale locale14 = dateTimeParserBucket5.getLocale();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        boolean boolean12 = dateTimeParserBucket5.restoreState((java.lang.Object) 0);
        long long13 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        long long17 = dateTimeParserBucket5.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-97L) + "'", long17 == (-97L));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 52);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeParserBucket3.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        int int10 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        long long12 = dateTimeParserBucket5.computeMillis();
        java.lang.Object obj13 = dateTimeParserBucket5.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        java.util.Locale locale16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType14, "", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-100L) + "'", long12 == (-100L));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        long long15 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType16, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        dateTimeParserBucket6.setZone(dateTimeZone7);
        int int9 = dateTimeParserBucket6.getOffset();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setOffset((int) (byte) 100);
        int int21 = dateTimeParserBucket16.getOffset();
        java.util.Locale locale22 = dateTimeParserBucket16.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale22);
        dateTimeParserBucket23.setPivotYear((java.lang.Integer) 97);
        int int26 = dateTimeParserBucket23.getOffset();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType10, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        long long13 = dateTimeParserBucket3.computeMillis();
        java.lang.Integer int14 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology14, locale15);
        org.joda.time.DateTimeField dateTimeField17 = null;
        dateTimeParserBucket16.saveField(dateTimeField17, (int) (byte) 1);
        int int20 = dateTimeParserBucket16.getOffset();
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket5.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology3, locale4);
        long long7 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology10, locale11, (java.lang.Integer) 100);
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((int) 'a');
        long long22 = dateTimeParserBucket19.computeMillis();
        long long23 = dateTimeParserBucket19.computeMillis();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(0L, chronology25, locale26, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket29.setOffset((int) 'a');
        long long33 = dateTimeParserBucket29.computeMillis(true);
        java.util.Locale locale34 = dateTimeParserBucket29.getLocale();
        dateTimeParserBucket29.setPivotYear((java.lang.Integer) 1);
        boolean boolean37 = dateTimeParserBucket19.restoreState((java.lang.Object) 1);
        java.util.Locale locale38 = dateTimeParserBucket19.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology10, locale38);
        dateTimeParserBucket39.setOffset((int) (byte) 1);
        long long44 = dateTimeParserBucket39.computeMillis(true, "hi!");
        java.lang.Integer int45 = dateTimeParserBucket39.getPivotYear();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-97L) + "'", long22 == (-97L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-97L) + "'", long33 == (-97L));
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNull(int45);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        java.lang.Object obj16 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType17, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType9, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        long long13 = dateTimeParserBucket3.computeMillis();
        int int14 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) 'a');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset((int) (byte) -1);
        java.util.Locale locale15 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        boolean boolean12 = dateTimeParserBucket5.restoreState((java.lang.Object) 0);
        long long13 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        long long18 = dateTimeParserBucket5.computeMillis(true, "hi!");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-97L) + "'", long18 == (-97L));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        int int21 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        java.lang.Class<?> wildcardClass13 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField8 = null;
        dateTimeParserBucket3.saveField(dateTimeField8, (-1));
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeParserBucket3.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        int int12 = dateTimeParserBucket3.getOffset();
        java.lang.Class<?> wildcardClass13 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField42 = null;
        dateTimeParserBucket41.saveField(dateTimeField42, 52);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        long long13 = dateTimeParserBucket3.computeMillis(false);
        long long16 = dateTimeParserBucket3.computeMillis(true, "hi!");
        int int17 = dateTimeParserBucket3.getOffset();
        long long20 = dateTimeParserBucket3.computeMillis(true, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        java.util.Locale locale8 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 97);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(100L, chronology11, locale12);
        java.lang.Class<?> wildcardClass14 = chronology11.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        long long15 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset(97);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        int int10 = dateTimeParserBucket5.getOffset();
        java.util.Locale locale11 = dateTimeParserBucket5.getLocale();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology13, locale14);
        long long18 = dateTimeParserBucket15.computeMillis(false, "hi!");
        dateTimeParserBucket15.setOffset(0);
        java.lang.Object obj21 = dateTimeParserBucket15.saveState();
        long long23 = dateTimeParserBucket15.computeMillis(false);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology25, locale26);
        int int28 = dateTimeParserBucket27.getOffset();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        dateTimeParserBucket27.setZone(dateTimeZone29);
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology32, locale33);
        long long37 = dateTimeParserBucket34.computeMillis(false, "hi!");
        java.lang.Object obj38 = dateTimeParserBucket34.saveState();
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeParserBucket34.getZone();
        dateTimeParserBucket27.setZone(dateTimeZone39);
        dateTimeParserBucket15.setZone(dateTimeZone39);
        boolean boolean42 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeZone39);
        dateTimeParserBucket5.setOffset((int) (short) 0);
        java.lang.Object obj45 = dateTimeParserBucket5.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology49, locale50);
        long long54 = dateTimeParserBucket51.computeMillis(false, "hi!");
        dateTimeParserBucket51.setOffset(0);
        java.util.Locale locale57 = dateTimeParserBucket51.getLocale();
        org.joda.time.DateTimeZone dateTimeZone58 = dateTimeParserBucket51.getZone();
        org.joda.time.Chronology chronology60 = null;
        java.util.Locale locale61 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket(0L, chronology60, locale61, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket64.setOffset((int) 'a');
        dateTimeParserBucket64.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone69 = dateTimeParserBucket64.getZone();
        dateTimeParserBucket51.setZone(dateTimeZone69);
        dateTimeParserBucket51.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale73 = dateTimeParserBucket51.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType46, "", locale73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(obj45);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTimeZone69);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "en_US");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        java.lang.Object obj12 = null;
        boolean boolean13 = dateTimeParserBucket5.restoreState(obj12);
        dateTimeParserBucket5.setOffset(10);
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        java.util.Locale locale17 = dateTimeParserBucket5.getLocale();
        long long20 = dateTimeParserBucket5.computeMillis(false, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-10L) + "'", long20 == (-10L));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone21);
        int int23 = dateTimeParserBucket3.getOffset();
        java.lang.Integer int24 = dateTimeParserBucket3.getPivotYear();
        long long25 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 10);
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket5.saveField(dateTimeField12, 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.Chronology chronology11 = dateTimeParserBucket3.getChronology();
        long long12 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-11L) + "'", long12 == (-11L));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType15, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) (short) 0);
        int int13 = dateTimeParserBucket3.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        long long8 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        int int10 = dateTimeParserBucket3.getOffset();
        java.lang.Integer int11 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        int int16 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj17 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        dateTimeParserBucket4.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket4.getChronology();
        int int8 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        dateTimeParserBucket16.setZone(dateTimeZone17);
        int int19 = dateTimeParserBucket16.getOffset();
        org.joda.time.Chronology chronology20 = dateTimeParserBucket16.getChronology();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale23, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket26.setOffset((int) 'a');
        org.joda.time.Chronology chronology29 = dateTimeParserBucket26.getChronology();
        java.util.Locale locale30 = dateTimeParserBucket26.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology20, locale30, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((-100L), chronology9, locale30);
        org.joda.time.DateTimeField dateTimeField35 = null;
        dateTimeParserBucket34.saveField(dateTimeField35, 1);
        int int38 = dateTimeParserBucket34.getOffset();
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-11L) + "'", long14 == (-11L));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset(10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        int int12 = dateTimeParserBucket3.getOffset();
        java.lang.Class<?> wildcardClass13 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale4, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        dateTimeParserBucket7.setZone(dateTimeZone8);
        int int10 = dateTimeParserBucket7.getOffset();
        org.joda.time.Chronology chronology11 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        org.joda.time.Chronology chronology20 = dateTimeParserBucket17.getChronology();
        java.util.Locale locale21 = dateTimeParserBucket17.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology11, locale21, (java.lang.Integer) 10, (int) '4');
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale28, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        dateTimeParserBucket31.setZone(dateTimeZone32);
        int int34 = dateTimeParserBucket31.getOffset();
        org.joda.time.Chronology chronology35 = dateTimeParserBucket31.getChronology();
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(0L, chronology37, locale38, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket41.setOffset((int) 'a');
        org.joda.time.Chronology chronology44 = dateTimeParserBucket41.getChronology();
        java.util.Locale locale45 = dateTimeParserBucket41.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology35, locale45, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology11, locale45, (java.lang.Integer) 97, (int) (short) 1);
        java.lang.Class<?> wildcardClass52 = locale45.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        dateTimeParserBucket3.setZone(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology8, locale9);
        long long13 = dateTimeParserBucket10.computeMillis(false, "hi!");
        java.lang.Object obj14 = dateTimeParserBucket10.saveState();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket10.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone15);
        java.lang.Object obj17 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass20 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket3.saveField(dateTimeField11, (int) (byte) -1);
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((int) 'a');
        long long22 = dateTimeParserBucket19.computeMillis();
        long long23 = dateTimeParserBucket19.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket19.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone24);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType26, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-97L) + "'", long22 == (-97L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone24);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Integer int11 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long16 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long18 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale9 = dateTimeParserBucket5.getLocale();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket5.getChronology();
        long long12 = dateTimeParserBucket5.computeMillis(false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.util.Locale locale14 = dateTimeParserBucket3.getLocale();
        org.joda.time.Chronology chronology15 = dateTimeParserBucket3.getChronology();
        java.lang.Class<?> wildcardClass16 = chronology15.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((int) (short) 100);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        int int10 = dateTimeParserBucket5.getOffset();
        java.util.Locale locale11 = dateTimeParserBucket5.getLocale();
        long long12 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-100L) + "'", long12 == (-100L));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        int int15 = dateTimeParserBucket3.getOffset();
        long long16 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket5.getZone();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale9, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket12.setOffset((int) 'a');
        org.joda.time.Chronology chronology15 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket12.saveField(dateTimeField16, 0);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        boolean boolean23 = dateTimeParserBucket5.restoreState((java.lang.Object) (short) 100);
        java.lang.Integer int24 = dateTimeParserBucket5.getOffsetInteger();
        long long27 = dateTimeParserBucket5.computeMillis(true, "");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone21);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale25 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket3.getZone();
        long long27 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        java.util.Locale locale44 = dateTimeParserBucket41.getLocale();
        java.lang.Object obj45 = dateTimeParserBucket41.saveState();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj45);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket6.saveField(dateTimeField10, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale16);
        long long20 = dateTimeParserBucket17.computeMillis(false, "hi!");
        dateTimeParserBucket17.setOffset(0);
        java.lang.Object obj23 = dateTimeParserBucket17.saveState();
        java.util.Locale locale24 = dateTimeParserBucket17.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((-101L), chronology13, locale24, (java.lang.Integer) 1);
        long long28 = dateTimeParserBucket26.computeMillis(true);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-101L) + "'", long28 == (-101L));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType15, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) '#');
        dateTimeParserBucket3.setOffset(0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) '#');
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        int int12 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset(100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        int int11 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        org.joda.time.Chronology chronology20 = dateTimeParserBucket17.getChronology();
        long long21 = dateTimeParserBucket17.computeMillis();
        dateTimeParserBucket17.setOffset((java.lang.Integer) (-1));
        long long25 = dateTimeParserBucket17.computeMillis(false);
        dateTimeParserBucket17.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket17.setOffset((java.lang.Integer) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeParserBucket17.getZone();
        boolean boolean31 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeParserBucket17);
        java.lang.Object obj32 = new java.lang.Object();
        boolean boolean33 = dateTimeParserBucket5.restoreState(obj32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-97L) + "'", long21 == (-97L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology11, locale12);
        long long16 = dateTimeParserBucket13.computeMillis(false, "hi!");
        dateTimeParserBucket13.setOffset(0);
        java.util.Locale locale19 = dateTimeParserBucket13.getLocale();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeParserBucket13.getZone();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket13.getZone();
        java.lang.Object obj22 = dateTimeParserBucket13.saveState();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology24, locale25);
        org.joda.time.DateTimeField dateTimeField27 = null;
        dateTimeParserBucket26.saveField(dateTimeField27, (int) (byte) 1);
        dateTimeParserBucket26.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket26.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeParserBucket26.getZone();
        dateTimeParserBucket13.setZone(dateTimeZone34);
        java.util.Locale locale36 = dateTimeParserBucket13.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket(99L, chronology9, locale36);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((int) (short) 100);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        long long43 = dateTimeParserBucket41.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone44 = dateTimeParserBucket41.getZone();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + (-1L) + "'", long43 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone44);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType4, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        int int11 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeParserBucket5.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        int int12 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        java.lang.Integer int14 = dateTimeParserBucket3.getOffsetInteger();
        long long16 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket15.setOffset((java.lang.Integer) 0);
        java.util.Locale locale18 = dateTimeParserBucket15.getLocale();
        boolean boolean19 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket15);
        java.lang.Class<?> wildcardClass20 = dateTimeParserBucket15.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket3.saveField(dateTimeField16, (int) '#');
        java.util.Locale locale19 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType22, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj5 = dateTimeParserBucket3.saveState();
        java.lang.Integer int6 = dateTimeParserBucket3.getPivotYear();
        java.lang.Class<?> wildcardClass7 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(int6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType12, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj5 = dateTimeParserBucket3.saveState();
        java.lang.Integer int6 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        long long13 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Object obj14 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        long long20 = dateTimeParserBucket5.computeMillis(false, "hi!");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-100L) + "'", long20 == (-100L));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology9, locale10);
        long long14 = dateTimeParserBucket11.computeMillis(false, "hi!");
        dateTimeParserBucket11.setOffset(0);
        java.util.Locale locale17 = dateTimeParserBucket11.getLocale();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket11.getZone();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(0L, chronology20, locale21, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket24.setOffset((int) 'a');
        dateTimeParserBucket24.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeParserBucket24.getZone();
        boolean boolean30 = dateTimeParserBucket11.restoreState((java.lang.Object) dateTimeParserBucket24);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeParserBucket11.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale9, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket12.setOffset((int) 'a');
        org.joda.time.Chronology chronology15 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket12.saveField(dateTimeField16, 0);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        boolean boolean23 = dateTimeParserBucket5.restoreState((java.lang.Object) (short) 100);
        java.util.Locale locale24 = dateTimeParserBucket5.getLocale();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale27, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket30.setOffset((int) 'a');
        int int33 = dateTimeParserBucket30.getOffset();
        int int34 = dateTimeParserBucket30.getOffset();
        dateTimeParserBucket30.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj37 = dateTimeParserBucket30.saveState();
        dateTimeParserBucket30.setOffset((java.lang.Integer) 97);
        long long41 = dateTimeParserBucket30.computeMillis(false);
        boolean boolean42 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeParserBucket30);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-97L) + "'", long41 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 10);
        int int12 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        int int8 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology10, locale11);
        long long15 = dateTimeParserBucket12.computeMillis(false, "hi!");
        java.lang.Object obj16 = dateTimeParserBucket12.saveState();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket12.getZone();
        long long20 = dateTimeParserBucket12.computeMillis(false, "hi!");
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket12.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket6.saveField(dateTimeField10, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((int) 'a');
        org.joda.time.Chronology chronology22 = dateTimeParserBucket19.getChronology();
        java.util.Locale locale23 = dateTimeParserBucket19.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology13, locale23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        dateTimeParserBucket32.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale37 = dateTimeParserBucket32.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket24.saveField(dateTimeFieldType25, "", locale37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology16, locale17, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket20.setOffset((int) 'a');
        org.joda.time.Chronology chronology23 = dateTimeParserBucket20.getChronology();
        long long24 = dateTimeParserBucket20.computeMillis();
        dateTimeParserBucket20.setOffset((java.lang.Integer) (-1));
        long long28 = dateTimeParserBucket20.computeMillis(false);
        dateTimeParserBucket20.setOffset((java.lang.Integer) 1);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeParserBucket20.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-11L) + "'", long14 == (-11L));
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-97L) + "'", long24 == (-97L));
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1L + "'", long28 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone31);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long9 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 1);
        dateTimeParserBucket4.setOffset((int) (byte) 10);
        dateTimeParserBucket4.setOffset((java.lang.Integer) 1);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((int) 'a');
        org.joda.time.Chronology chronology22 = dateTimeParserBucket19.getChronology();
        long long23 = dateTimeParserBucket19.computeMillis();
        dateTimeParserBucket19.setOffset((java.lang.Integer) (-1));
        long long27 = dateTimeParserBucket19.computeMillis(false);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket19.getChronology();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(0L, chronology31, locale32, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        dateTimeParserBucket35.setZone(dateTimeZone36);
        int int38 = dateTimeParserBucket35.getOffset();
        org.joda.time.Chronology chronology39 = dateTimeParserBucket35.getChronology();
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket(0L, chronology41, locale42, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket45.setOffset((int) 'a');
        org.joda.time.Chronology chronology48 = dateTimeParserBucket45.getChronology();
        java.util.Locale locale49 = dateTimeParserBucket45.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology39, locale49, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology28, locale49, (java.lang.Integer) 10);
        java.util.Locale locale55 = dateTimeParserBucket54.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology12, locale55);
        dateTimeParserBucket56.setOffset((int) 'a');
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale15, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket18.setOffset((int) 'a');
        int int21 = dateTimeParserBucket18.getOffset();
        int int22 = dateTimeParserBucket18.getOffset();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket18.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeParserBucket3.getZone();
        long long26 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale9, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket12.setOffset((int) 'a');
        org.joda.time.Chronology chronology15 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket12.saveField(dateTimeField16, 0);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        boolean boolean23 = dateTimeParserBucket5.restoreState((java.lang.Object) (short) 100);
        java.lang.Integer int24 = dateTimeParserBucket5.getOffsetInteger();
        long long26 = dateTimeParserBucket5.computeMillis(true);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        java.util.Locale locale12 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        int int8 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket3.setOffset((-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology13, locale14);
        long long18 = dateTimeParserBucket15.computeMillis(false, "hi!");
        dateTimeParserBucket15.setOffset(0);
        java.util.Locale locale21 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket15.getZone();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket28.setOffset((int) 'a');
        dateTimeParserBucket28.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeParserBucket28.getZone();
        boolean boolean34 = dateTimeParserBucket15.restoreState((java.lang.Object) dateTimeParserBucket28);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket28.getZone();
        org.joda.time.Chronology chronology36 = dateTimeParserBucket28.getChronology();
        boolean boolean37 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket28);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chronology38);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        long long8 = dateTimeParserBucket3.computeMillis(true, "hi!");
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        dateTimeParserBucket3.setZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket3.getZone();
        long long10 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeParserBucket3.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((int) '4');
        dateTimeParserBucket3.setOffset((java.lang.Integer) 52);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType16, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        int int8 = dateTimeParserBucket3.getOffset();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType13, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        long long13 = dateTimeParserBucket5.computeMillis(false, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType14, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        dateTimeParserBucket41.setOffset((java.lang.Integer) 1);
        org.joda.time.Chronology chronology46 = dateTimeParserBucket41.getChronology();
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeParserBucket41.getZone();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 97);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket(100L, chronology11, locale12);
        java.lang.Integer int14 = dateTimeParserBucket13.getPivotYear();
        long long17 = dateTimeParserBucket13.computeMillis(false, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket13.saveField(dateTimeFieldType18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType16, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long11 = dateTimeParserBucket5.computeMillis(false, "hi!");
        long long13 = dateTimeParserBucket5.computeMillis(true);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-97L) + "'", long11 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        int int10 = dateTimeParserBucket5.getOffset();
        java.util.Locale locale11 = dateTimeParserBucket5.getLocale();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology13, locale14);
        long long18 = dateTimeParserBucket15.computeMillis(false, "hi!");
        dateTimeParserBucket15.setOffset(0);
        java.lang.Object obj21 = dateTimeParserBucket15.saveState();
        long long23 = dateTimeParserBucket15.computeMillis(false);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology25, locale26);
        int int28 = dateTimeParserBucket27.getOffset();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        dateTimeParserBucket27.setZone(dateTimeZone29);
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology32, locale33);
        long long37 = dateTimeParserBucket34.computeMillis(false, "hi!");
        java.lang.Object obj38 = dateTimeParserBucket34.saveState();
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeParserBucket34.getZone();
        dateTimeParserBucket27.setZone(dateTimeZone39);
        dateTimeParserBucket15.setZone(dateTimeZone39);
        boolean boolean42 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeZone39);
        dateTimeParserBucket5.setOffset((int) (short) 10);
        int int45 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType46, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 10 + "'", int45 == 10);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        long long11 = dateTimeParserBucket3.computeMillis(true);
        long long14 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset((java.lang.Integer) 1);
        long long44 = dateTimeParserBucket41.computeMillis();
        long long45 = dateTimeParserBucket41.computeMillis();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-2L) + "'", long44 == (-2L));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-2L) + "'", long45 == (-2L));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        java.lang.Class<?> wildcardClass14 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        int int11 = dateTimeParserBucket3.getOffset();
        long long14 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-11L) + "'", long14 == (-11L));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) (byte) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology3, locale4);
        long long8 = dateTimeParserBucket5.computeMillis(false, "hi!");
        java.lang.Object obj9 = dateTimeParserBucket5.saveState();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 97);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(100L, chronology12, locale13);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology16, locale17);
        long long21 = dateTimeParserBucket18.computeMillis(false, "hi!");
        dateTimeParserBucket18.setOffset(0);
        java.util.Locale locale24 = dateTimeParserBucket18.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology12, locale24, (java.lang.Integer) 1, (int) (short) -1);
        long long30 = dateTimeParserBucket27.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 0L + "'", long30 == 0L);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((int) (short) 10);
        dateTimeParserBucket3.setOffset((int) (short) 0);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeParserBucket3.computeMillis(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        java.lang.Object obj12 = null;
        boolean boolean13 = dateTimeParserBucket5.restoreState(obj12);
        dateTimeParserBucket5.setOffset(10);
        java.lang.Object obj16 = dateTimeParserBucket5.saveState();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 10);
        long long19 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-10L) + "'", long19 == (-10L));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        long long15 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket3.saveField(dateTimeField16, 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) '#');
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeParserBucket3.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj12 = dateTimeParserBucket5.saveState();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket5.getZone();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((int) 'a');
        int int22 = dateTimeParserBucket19.getOffset();
        int int23 = dateTimeParserBucket19.getOffset();
        dateTimeParserBucket19.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj26 = dateTimeParserBucket19.saveState();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket19.getZone();
        dateTimeParserBucket5.setZone(dateTimeZone27);
        long long31 = dateTimeParserBucket5.computeMillis(true, "");
        int int32 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-97L) + "'", long31 == (-97L));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        long long9 = dateTimeParserBucket3.computeMillis();
        long long10 = dateTimeParserBucket3.computeMillis();
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        int int10 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType11, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        java.lang.Object obj12 = null;
        boolean boolean13 = dateTimeParserBucket5.restoreState(obj12);
        dateTimeParserBucket5.setOffset(10);
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        java.util.Locale locale17 = dateTimeParserBucket5.getLocale();
        java.lang.Class<?> wildcardClass18 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket5.saveField(dateTimeField16, 97);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 52);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        int int8 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        java.lang.Class<?> wildcardClass10 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) '#');
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale15, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket18.setOffset((int) 'a');
        int int21 = dateTimeParserBucket18.getOffset();
        int int22 = dateTimeParserBucket18.getOffset();
        dateTimeParserBucket18.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket18.setOffset((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket18.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = dateTimeParserBucket3.computeMillis(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone27);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        dateTimeParserBucket41.setOffset((java.lang.Integer) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology49, locale50);
        long long54 = dateTimeParserBucket51.computeMillis(false, "hi!");
        dateTimeParserBucket51.setOffset(0);
        java.lang.Object obj57 = dateTimeParserBucket51.saveState();
        long long59 = dateTimeParserBucket51.computeMillis(false);
        long long62 = dateTimeParserBucket51.computeMillis(true, "");
        long long64 = dateTimeParserBucket51.computeMillis(false);
        java.util.Locale locale65 = dateTimeParserBucket51.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket41.saveField(dateTimeFieldType46, "hi!", locale65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-1L) + "'", long62 == (-1L));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-1L) + "'", long64 == (-1L));
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "en_US");
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Integer int11 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long16 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        java.util.Locale locale19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType17, "", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket3.saveField(dateTimeField5, (int) (byte) -1);
        java.lang.Integer int8 = dateTimeParserBucket3.getPivotYear();
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeParserBucket3.computeMillis(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket3.saveField(dateTimeField11, 1);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        dateTimeParserBucket41.setOffset((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket41.saveField(dateTimeFieldType46, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        boolean boolean12 = dateTimeParserBucket5.restoreState((java.lang.Object) 0);
        long long13 = dateTimeParserBucket5.computeMillis();
        java.lang.Class<?> wildcardClass14 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket4.getZone();
        long long12 = dateTimeParserBucket4.computeMillis(true, "");
        org.joda.time.Chronology chronology13 = dateTimeParserBucket4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket4.getZone();
        org.joda.time.Chronology chronology15 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(0L, chronology17, locale18, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket21.setOffset((int) 'a');
        org.joda.time.Chronology chronology24 = dateTimeParserBucket21.getChronology();
        long long25 = dateTimeParserBucket21.computeMillis();
        dateTimeParserBucket21.setOffset((java.lang.Integer) (-1));
        long long29 = dateTimeParserBucket21.computeMillis(false);
        dateTimeParserBucket21.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket21.setOffset((java.lang.Integer) 100);
        java.util.Locale locale34 = dateTimeParserBucket21.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(99L, chronology15, locale34, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-97L) + "'", long25 == (-97L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 1L + "'", long29 == 1L);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale4, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket7.setOffset((int) 'a');
        long long11 = dateTimeParserBucket7.computeMillis(true);
        java.util.Locale locale12 = dateTimeParserBucket7.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology1, locale12, (java.lang.Integer) 10);
        dateTimeParserBucket14.setOffset((java.lang.Integer) 10);
        java.lang.Object obj17 = dateTimeParserBucket14.saveState();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-97L) + "'", long11 == (-97L));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        long long15 = dateTimeParserBucket3.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        dateTimeParserBucket4.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket4.getChronology();
        int int8 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        dateTimeParserBucket16.setZone(dateTimeZone17);
        int int19 = dateTimeParserBucket16.getOffset();
        org.joda.time.Chronology chronology20 = dateTimeParserBucket16.getChronology();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale23, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket26.setOffset((int) 'a');
        org.joda.time.Chronology chronology29 = dateTimeParserBucket26.getChronology();
        java.util.Locale locale30 = dateTimeParserBucket26.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology20, locale30, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((-100L), chronology9, locale30);
        org.joda.time.DateTimeField dateTimeField35 = null;
        dateTimeParserBucket34.saveField(dateTimeField35, 1);
        java.lang.Object obj38 = null;
        boolean boolean39 = dateTimeParserBucket34.restoreState(obj38);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        org.joda.time.DateTimeField dateTimeField17 = null;
        dateTimeParserBucket5.saveField(dateTimeField17, (int) ' ');
        dateTimeParserBucket5.setOffset(0);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        long long11 = dateTimeParserBucket5.computeMillis(false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-97L) + "'", long11 == (-97L));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        dateTimeParserBucket4.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket4.getChronology();
        int int8 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        dateTimeParserBucket16.setZone(dateTimeZone17);
        int int19 = dateTimeParserBucket16.getOffset();
        org.joda.time.Chronology chronology20 = dateTimeParserBucket16.getChronology();
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale23, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket26.setOffset((int) 'a');
        org.joda.time.Chronology chronology29 = dateTimeParserBucket26.getChronology();
        java.util.Locale locale30 = dateTimeParserBucket26.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology20, locale30, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((-100L), chronology9, locale30);
        org.joda.time.DateTimeField dateTimeField35 = null;
        dateTimeParserBucket34.saveField(dateTimeField35, 1);
        org.joda.time.DateTimeField dateTimeField38 = null;
        dateTimeParserBucket34.saveField(dateTimeField38, (int) (byte) 1);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        long long15 = dateTimeParserBucket5.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket5.getZone();
        int int17 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        dateTimeParserBucket6.setZone(dateTimeZone7);
        int int9 = dateTimeParserBucket6.getOffset();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setOffset((int) (byte) 100);
        int int21 = dateTimeParserBucket16.getOffset();
        java.util.Locale locale22 = dateTimeParserBucket16.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale22);
        java.util.Locale locale24 = dateTimeParserBucket23.getLocale();
        java.util.Locale locale25 = dateTimeParserBucket23.getLocale();
        java.lang.Integer int26 = dateTimeParserBucket23.getPivotYear();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        long long9 = dateTimeParserBucket3.computeMillis();
        long long11 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long14 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket3.saveField(dateTimeField15, (int) (byte) -1);
        java.lang.Object obj18 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        long long10 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        long long13 = dateTimeParserBucket3.computeMillis(false);
        long long16 = dateTimeParserBucket3.computeMillis(true, "hi!");
        int int17 = dateTimeParserBucket3.getOffset();
        java.lang.Integer int18 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj12 = dateTimeParserBucket5.saveState();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket5.saveField(dateTimeField15, (int) 'a');
        int int18 = dateTimeParserBucket5.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = dateTimeParserBucket5.computeMillis(true, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        long long13 = dateTimeParserBucket3.computeMillis(false);
        long long16 = dateTimeParserBucket3.computeMillis(true, "hi!");
        int int17 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField18 = null;
        dateTimeParserBucket3.saveField(dateTimeField18, 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        long long16 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset(32);
        java.util.Locale locale19 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-101L) + "'", long16 == (-101L));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        long long8 = dateTimeParserBucket3.computeMillis(true, "");
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        int int11 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(dateTimeZone12);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        long long12 = dateTimeParserBucket5.computeMillis(false, "");
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology14, locale15);
        long long19 = dateTimeParserBucket16.computeMillis(false, "hi!");
        dateTimeParserBucket16.setOffset(0);
        java.util.Locale locale22 = dateTimeParserBucket16.getLocale();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField27 = null;
        dateTimeParserBucket16.saveField(dateTimeField27, (int) ' ');
        boolean boolean30 = dateTimeParserBucket5.restoreState((java.lang.Object) ' ');
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        dateTimeParserBucket5.setZone(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        java.lang.Object obj16 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeParserBucket5.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        int int8 = dateTimeParserBucket4.getOffset();
        dateTimeParserBucket4.setOffset((int) (short) 10);
        java.lang.Integer int11 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((int) 'a');
        org.joda.time.Chronology chronology22 = dateTimeParserBucket19.getChronology();
        long long23 = dateTimeParserBucket19.computeMillis();
        dateTimeParserBucket19.setOffset((java.lang.Integer) (-1));
        long long27 = dateTimeParserBucket19.computeMillis(false);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket19.getChronology();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(0L, chronology31, locale32, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        dateTimeParserBucket35.setZone(dateTimeZone36);
        int int38 = dateTimeParserBucket35.getOffset();
        org.joda.time.Chronology chronology39 = dateTimeParserBucket35.getChronology();
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket(0L, chronology41, locale42, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket45.setOffset((int) 'a');
        org.joda.time.Chronology chronology48 = dateTimeParserBucket45.getChronology();
        java.util.Locale locale49 = dateTimeParserBucket45.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology39, locale49, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology28, locale49, (java.lang.Integer) 10);
        long long57 = dateTimeParserBucket54.computeMillis(false, "hi!");
        int int58 = dateTimeParserBucket54.getOffset();
        java.util.Locale locale59 = dateTimeParserBucket54.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((long) 52, chronology12, locale59);
        org.joda.time.Chronology chronology61 = dateTimeParserBucket60.getChronology();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1L + "'", long27 == 1L);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-1L) + "'", long57 == (-1L));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology61);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        long long9 = dateTimeParserBucket3.computeMillis();
        int int10 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, (int) (short) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType12, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone21);
        int int23 = dateTimeParserBucket3.getOffset();
        long long25 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int26 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType14, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket3.getChronology();
        long long9 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-101L) + "'", long9 == (-101L));
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset(100);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long15 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket5.getZone();
        long long19 = dateTimeParserBucket5.computeMillis();
        java.lang.Class<?> wildcardClass20 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-100L) + "'", long19 == (-100L));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset((int) '#');
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        int int11 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        org.joda.time.Chronology chronology20 = dateTimeParserBucket17.getChronology();
        long long21 = dateTimeParserBucket17.computeMillis();
        dateTimeParserBucket17.setOffset((java.lang.Integer) (-1));
        long long25 = dateTimeParserBucket17.computeMillis(false);
        dateTimeParserBucket17.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket17.setOffset((java.lang.Integer) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeParserBucket17.getZone();
        boolean boolean31 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeParserBucket17);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-97L) + "'", long21 == (-97L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTimeZone32);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        long long15 = dateTimeParserBucket5.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long13 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType14, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        int int12 = dateTimeParserBucket3.getOffset();
        long long13 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        long long14 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Class<?> wildcardClass15 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        int int10 = dateTimeParserBucket5.getOffset();
        java.util.Locale locale11 = dateTimeParserBucket5.getLocale();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology13, locale14);
        long long18 = dateTimeParserBucket15.computeMillis(false, "hi!");
        dateTimeParserBucket15.setOffset(0);
        java.lang.Object obj21 = dateTimeParserBucket15.saveState();
        long long23 = dateTimeParserBucket15.computeMillis(false);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology25, locale26);
        int int28 = dateTimeParserBucket27.getOffset();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        dateTimeParserBucket27.setZone(dateTimeZone29);
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology32, locale33);
        long long37 = dateTimeParserBucket34.computeMillis(false, "hi!");
        java.lang.Object obj38 = dateTimeParserBucket34.saveState();
        org.joda.time.DateTimeZone dateTimeZone39 = dateTimeParserBucket34.getZone();
        dateTimeParserBucket27.setZone(dateTimeZone39);
        dateTimeParserBucket15.setZone(dateTimeZone39);
        boolean boolean42 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeZone39);
        long long44 = dateTimeParserBucket5.computeMillis(false);
        int int45 = dateTimeParserBucket5.getOffset();
        java.lang.Class<?> wildcardClass46 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(obj38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-100L) + "'", long44 == (-100L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 100 + "'", int45 == 100);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = dateTimeParserBucket5.computeMillis(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        java.lang.Object obj16 = dateTimeParserBucket5.saveState();
        java.lang.Object obj17 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        long long14 = dateTimeParserBucket5.computeMillis(true, "");
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-100L) + "'", long14 == (-100L));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long14 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset(52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        long long9 = dateTimeParserBucket3.computeMillis();
        long long10 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long15 = dateTimeParserBucket3.computeMillis(true, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        long long10 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale15, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        dateTimeParserBucket18.setZone(dateTimeZone19);
        int int21 = dateTimeParserBucket18.getOffset();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket18.getZone();
        java.util.Locale locale23 = dateTimeParserBucket18.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType11, "", locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        long long13 = dateTimeParserBucket5.computeMillis(false, "");
        dateTimeParserBucket5.setOffset((int) 'a');
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        long long13 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, 100);
        dateTimeParserBucket3.setOffset((int) (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket3.setOffset(0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology3, locale4);
        long long8 = dateTimeParserBucket5.computeMillis(false, "hi!");
        java.lang.Object obj9 = dateTimeParserBucket5.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        long long13 = dateTimeParserBucket5.computeMillis(true, "");
        int int14 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology15 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology17, locale18);
        long long22 = dateTimeParserBucket19.computeMillis(false, "hi!");
        dateTimeParserBucket19.setOffset(0);
        java.lang.Integer int25 = dateTimeParserBucket19.getPivotYear();
        java.lang.Object obj26 = dateTimeParserBucket19.saveState();
        java.util.Locale locale27 = dateTimeParserBucket19.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale27);
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology30, locale31);
        long long35 = dateTimeParserBucket32.computeMillis(false, "hi!");
        dateTimeParserBucket32.setOffset(0);
        java.util.Locale locale38 = dateTimeParserBucket32.getLocale();
        java.util.Locale locale39 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale39, (java.lang.Integer) (-1));
        int int42 = dateTimeParserBucket41.getOffset();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket3.saveField(dateTimeField11, (int) (byte) -1);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket5.saveField(dateTimeField10, (int) (short) -1);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        dateTimeParserBucket3.setZone(dateTimeZone7);
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale11, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket14.setOffset((int) 'a');
        int int17 = dateTimeParserBucket14.getOffset();
        int int18 = dateTimeParserBucket14.getOffset();
        dateTimeParserBucket14.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj21 = dateTimeParserBucket14.saveState();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket14.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        long long16 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Integer int17 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeField dateTimeField18 = null;
        dateTimeParserBucket3.saveField(dateTimeField18, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-101L) + "'", long16 == (-101L));
        org.junit.Assert.assertNull(int17);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        java.util.Locale locale11 = dateTimeParserBucket5.getLocale();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        dateTimeParserBucket41.setOffset((int) '4');
        org.joda.time.Chronology chronology46 = dateTimeParserBucket41.getChronology();
        org.joda.time.DateTimeZone dateTimeZone47 = dateTimeParserBucket41.getZone();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeZone47);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.util.Locale locale11 = dateTimeParserBucket3.getLocale();
        java.util.Locale locale12 = dateTimeParserBucket3.getLocale();
        java.lang.Object obj13 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology11 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        int int8 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        int int11 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        java.lang.Integer int8 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket3.saveField(dateTimeField11, (int) (short) 100);
        java.lang.Object obj14 = dateTimeParserBucket3.saveState();
        java.lang.Class<?> wildcardClass15 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long9 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        dateTimeParserBucket3.setZone(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket3.getZone();
        java.lang.Object obj15 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket3.saveField(dateTimeField16, (int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNull(dateTimeZone19);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset(1);
        dateTimeParserBucket41.setOffset((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket41.saveField(dateTimeFieldType46, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology14, locale15);
        org.joda.time.DateTimeField dateTimeField17 = null;
        dateTimeParserBucket16.saveField(dateTimeField17, (int) (byte) 1);
        int int20 = dateTimeParserBucket16.getOffset();
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket5.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 97 + "'", int25 == 97);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        java.lang.Integer int14 = dateTimeParserBucket3.getPivotYear();
        java.lang.Integer int15 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket(0L, chronology8, locale9, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket12.setOffset((int) 'a');
        org.joda.time.Chronology chronology15 = dateTimeParserBucket12.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket12.saveField(dateTimeField16, 0);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        dateTimeParserBucket12.setOffset((int) (short) 100);
        boolean boolean23 = dateTimeParserBucket5.restoreState((java.lang.Object) (short) 100);
        java.lang.Integer int24 = dateTimeParserBucket5.getOffsetInteger();
        dateTimeParserBucket5.setOffset((int) (short) 1);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        long long36 = dateTimeParserBucket32.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeParserBucket32.getZone();
        dateTimeParserBucket5.setZone(dateTimeZone37);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-97L) + "'", long36 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone37);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        long long8 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket15.setOffset((int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket15.getChronology();
        long long19 = dateTimeParserBucket15.computeMillis();
        dateTimeParserBucket15.setOffset((java.lang.Integer) (-1));
        long long23 = dateTimeParserBucket15.computeMillis(false);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket15.getChronology();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale28, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        dateTimeParserBucket31.setZone(dateTimeZone32);
        int int34 = dateTimeParserBucket31.getOffset();
        org.joda.time.Chronology chronology35 = dateTimeParserBucket31.getChronology();
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(0L, chronology37, locale38, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket41.setOffset((int) 'a');
        org.joda.time.Chronology chronology44 = dateTimeParserBucket41.getChronology();
        java.util.Locale locale45 = dateTimeParserBucket41.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology35, locale45, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology24, locale45, (java.lang.Integer) 10);
        long long53 = dateTimeParserBucket50.computeMillis(false, "hi!");
        int int54 = dateTimeParserBucket50.getOffset();
        boolean boolean55 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket50);
        org.joda.time.DateTimeFieldType dateTimeFieldType56 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType56, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-97L) + "'", long19 == (-97L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        dateTimeParserBucket3.setZone(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket3.getZone();
        long long10 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        java.lang.Object obj15 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket5.saveField(dateTimeField10, (int) (short) 10);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset((java.lang.Integer) 1);
        long long44 = dateTimeParserBucket41.computeMillis();
        org.joda.time.DateTimeField dateTimeField45 = null;
        dateTimeParserBucket41.saveField(dateTimeField45, (int) '4');
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-2L) + "'", long44 == (-2L));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology4, locale5, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket8.setOffset((int) 'a');
        org.joda.time.Chronology chronology11 = dateTimeParserBucket8.getChronology();
        long long12 = dateTimeParserBucket8.computeMillis();
        dateTimeParserBucket8.setOffset((java.lang.Integer) (-1));
        long long16 = dateTimeParserBucket8.computeMillis(false);
        org.joda.time.Chronology chronology17 = dateTimeParserBucket8.getChronology();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(0L, chronology20, locale21, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        dateTimeParserBucket24.setZone(dateTimeZone25);
        int int27 = dateTimeParserBucket24.getOffset();
        org.joda.time.Chronology chronology28 = dateTimeParserBucket24.getChronology();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(0L, chronology30, locale31, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket34.setOffset((int) 'a');
        org.joda.time.Chronology chronology37 = dateTimeParserBucket34.getChronology();
        java.util.Locale locale38 = dateTimeParserBucket34.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology28, locale38, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology17, locale38, (java.lang.Integer) 10);
        dateTimeParserBucket43.setOffset(1);
        java.util.Locale locale46 = dateTimeParserBucket43.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) 100, chronology1, locale46, (java.lang.Integer) 52);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long8 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long15 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        int int11 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        long long8 = dateTimeParserBucket3.computeMillis(true, "");
        long long11 = dateTimeParserBucket3.computeMillis(true, "hi!");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(true, "hi!");
        java.util.Locale locale7 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        dateTimeParserBucket5.setOffset(32);
        java.lang.Object obj16 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket15.setOffset((int) 'a');
        long long19 = dateTimeParserBucket15.computeMillis(true);
        java.util.Locale locale20 = dateTimeParserBucket15.getLocale();
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 1);
        boolean boolean23 = dateTimeParserBucket5.restoreState((java.lang.Object) 1);
        java.util.Locale locale24 = dateTimeParserBucket5.getLocale();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeParserBucket5.getZone();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket5.getChronology();
        long long28 = dateTimeParserBucket5.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-97L) + "'", long19 == (-97L));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-97L) + "'", long28 == (-97L));
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        int int14 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long13 = dateTimeParserBucket3.computeMillis(true);
        long long15 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, (int) ' ');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket3.getChronology();
        java.util.Locale locale18 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long11 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        dateTimeParserBucket17.setOffset((int) (byte) 100);
        int int22 = dateTimeParserBucket17.getOffset();
        java.util.Locale locale23 = dateTimeParserBucket17.getLocale();
        java.lang.Class<?> wildcardClass24 = locale23.getClass();
        boolean boolean25 = dateTimeParserBucket3.restoreState((java.lang.Object) locale23);
        long long28 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-1L) + "'", long28 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset(0);
        dateTimeParserBucket3.setOffset((int) (short) 1);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        long long12 = dateTimeParserBucket3.computeMillis();
        int int13 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        long long13 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, 100);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeParserBucket3.computeMillis(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket3.getChronology();
        int int10 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale4, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket7.setOffset((int) 'a');
        org.joda.time.Chronology chronology10 = dateTimeParserBucket7.getChronology();
        long long11 = dateTimeParserBucket7.computeMillis();
        dateTimeParserBucket7.setOffset((java.lang.Integer) (-1));
        long long15 = dateTimeParserBucket7.computeMillis(false);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket7.getChronology();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale20, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        dateTimeParserBucket23.setZone(dateTimeZone24);
        int int26 = dateTimeParserBucket23.getOffset();
        org.joda.time.Chronology chronology27 = dateTimeParserBucket23.getChronology();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale30, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket33.setOffset((int) 'a');
        org.joda.time.Chronology chronology36 = dateTimeParserBucket33.getChronology();
        java.util.Locale locale37 = dateTimeParserBucket33.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology27, locale37, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology16, locale37, (java.lang.Integer) 10);
        dateTimeParserBucket42.setOffset(1);
        dateTimeParserBucket42.setOffset((java.lang.Integer) 1);
        org.joda.time.Chronology chronology47 = dateTimeParserBucket42.getChronology();
        org.joda.time.Chronology chronology50 = null;
        java.util.Locale locale51 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket(0L, chronology50, locale51, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket54.setOffset((int) 'a');
        org.joda.time.Chronology chronology57 = dateTimeParserBucket54.getChronology();
        long long58 = dateTimeParserBucket54.computeMillis();
        dateTimeParserBucket54.setOffset((java.lang.Integer) (-1));
        long long62 = dateTimeParserBucket54.computeMillis(false);
        org.joda.time.Chronology chronology63 = dateTimeParserBucket54.getChronology();
        org.joda.time.Chronology chronology66 = null;
        java.util.Locale locale67 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket(0L, chronology66, locale67, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        dateTimeParserBucket70.setZone(dateTimeZone71);
        int int73 = dateTimeParserBucket70.getOffset();
        org.joda.time.Chronology chronology74 = dateTimeParserBucket70.getChronology();
        org.joda.time.Chronology chronology76 = null;
        java.util.Locale locale77 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket80 = new org.joda.time.format.DateTimeParserBucket(0L, chronology76, locale77, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket80.setOffset((int) 'a');
        org.joda.time.Chronology chronology83 = dateTimeParserBucket80.getChronology();
        java.util.Locale locale84 = dateTimeParserBucket80.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket87 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology74, locale84, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket89 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology63, locale84, (java.lang.Integer) 10);
        java.util.Locale locale90 = dateTimeParserBucket89.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket91 = new org.joda.time.format.DateTimeParserBucket((-53L), chronology47, locale90);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-97L) + "'", long11 == (-97L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-97L) + "'", long58 == (-97L));
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 1L + "'", long62 == 1L);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(chronology83);
        org.junit.Assert.assertNotNull(locale84);
        org.junit.Assert.assertEquals(locale84.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "en_US");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        int int10 = dateTimeParserBucket5.getOffset();
        long long13 = dateTimeParserBucket5.computeMillis(true, "");
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        dateTimeParserBucket5.setZone(dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType16, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket3.saveField(dateTimeField16, (int) '#');
        java.util.Locale locale19 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeParserBucket3.getZone();
        java.lang.Object obj21 = dateTimeParserBucket3.saveState();
        java.util.Locale locale22 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long14 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Class<?> wildcardClass15 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology3, locale4);
        long long8 = dateTimeParserBucket5.computeMillis(false, "hi!");
        dateTimeParserBucket5.setOffset(0);
        java.lang.Object obj11 = dateTimeParserBucket5.saveState();
        long long13 = dateTimeParserBucket5.computeMillis(false);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology16, locale17, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket20.setOffset((java.lang.Integer) 0);
        java.util.Locale locale23 = dateTimeParserBucket20.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(32L, chronology14, locale23, (java.lang.Integer) 52, (int) (short) 100);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = null;
        dateTimeParserBucket32.saveField(dateTimeField36, 0);
        dateTimeParserBucket32.setOffset((int) (short) 100);
        dateTimeParserBucket32.setOffset((int) (short) 100);
        java.util.Locale locale43 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) (short) 10, chronology14, locale43);
        java.lang.Class<?> wildcardClass45 = dateTimeParserBucket44.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        java.lang.Object obj12 = null;
        boolean boolean13 = dateTimeParserBucket5.restoreState(obj12);
        dateTimeParserBucket5.setOffset(10);
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        java.util.Locale locale17 = dateTimeParserBucket5.getLocale();
        long long20 = dateTimeParserBucket5.computeMillis(true, "");
        org.joda.time.Chronology chronology21 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-10L) + "'", long20 == (-10L));
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        boolean boolean22 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket16);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket3.getZone();
        java.util.Locale locale24 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, (int) ' ');
        org.joda.time.Chronology chronology17 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset(32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.joda.time.Chronology chronology9 = null;
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology9, locale10);
        long long14 = dateTimeParserBucket11.computeMillis(false, "hi!");
        dateTimeParserBucket11.setOffset(0);
        java.util.Locale locale17 = dateTimeParserBucket11.getLocale();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket11.getZone();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(0L, chronology20, locale21, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket24.setOffset((int) 'a');
        dateTimeParserBucket24.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeParserBucket24.getZone();
        boolean boolean30 = dateTimeParserBucket11.restoreState((java.lang.Object) dateTimeParserBucket24);
        org.joda.time.DateTimeZone dateTimeZone31 = dateTimeParserBucket11.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone31);
        dateTimeParserBucket3.setOffset((int) (byte) 0);
        long long36 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType37, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 1);
        dateTimeParserBucket4.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket4.getZone();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale16);
        long long20 = dateTimeParserBucket17.computeMillis(false, "hi!");
        java.lang.Object obj21 = dateTimeParserBucket17.saveState();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket17.getZone();
        java.lang.Object obj23 = dateTimeParserBucket17.saveState();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket17.getZone();
        java.util.Locale locale25 = dateTimeParserBucket17.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(9L, chronology13, locale25);
        java.util.Locale locale27 = dateTimeParserBucket26.getLocale();
        int int28 = dateTimeParserBucket26.getOffset();
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int10 = dateTimeParserBucket3.getOffsetInteger();
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket3.saveField(dateTimeField12, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket5.getZone();
        long long19 = dateTimeParserBucket5.computeMillis();
        long long21 = dateTimeParserBucket5.computeMillis(false);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-100L) + "'", long19 == (-100L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-100L) + "'", long21 == (-100L));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long8 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        java.lang.Integer int10 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        java.lang.Integer int8 = dateTimeParserBucket3.getPivotYear();
        int int9 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology16, locale17);
        long long21 = dateTimeParserBucket18.computeMillis(false, "hi!");
        java.lang.Object obj22 = dateTimeParserBucket18.saveState();
        boolean boolean23 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket18);
        java.lang.Integer int24 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(int24);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        dateTimeParserBucket4.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket4.getChronology();
        int int8 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology12, locale13);
        long long17 = dateTimeParserBucket14.computeMillis(false, "hi!");
        dateTimeParserBucket14.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket14.getChronology();
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology23, locale24, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket27.setOffset((int) 'a');
        org.joda.time.Chronology chronology30 = dateTimeParserBucket27.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = null;
        dateTimeParserBucket27.saveField(dateTimeField31, 0);
        org.joda.time.Chronology chronology34 = dateTimeParserBucket27.getChronology();
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale37 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(0L, chronology36, locale37, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket40.setOffset((int) 'a');
        org.joda.time.Chronology chronology43 = dateTimeParserBucket40.getChronology();
        java.util.Locale locale44 = dateTimeParserBucket40.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology34, locale44);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket(100L, chronology20, locale44, (java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 100, chronology9, locale44);
        java.lang.Class<?> wildcardClass49 = dateTimeParserBucket48.getClass();
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset(0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        int int12 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology13, locale14);
        long long18 = dateTimeParserBucket15.computeMillis(false, "hi!");
        dateTimeParserBucket15.setOffset(0);
        java.util.Locale locale21 = dateTimeParserBucket15.getLocale();
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket15.getZone();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket28.setOffset((int) 'a');
        dateTimeParserBucket28.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeParserBucket28.getZone();
        boolean boolean34 = dateTimeParserBucket15.restoreState((java.lang.Object) dateTimeParserBucket28);
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket28.getZone();
        org.joda.time.Chronology chronology36 = dateTimeParserBucket28.getChronology();
        boolean boolean37 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket28);
        java.lang.Object obj38 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology14, locale15);
        org.joda.time.DateTimeField dateTimeField17 = null;
        dateTimeParserBucket16.saveField(dateTimeField17, (int) (byte) 1);
        int int20 = dateTimeParserBucket16.getOffset();
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket5.setZone(dateTimeZone23);
        long long27 = dateTimeParserBucket5.computeMillis(true, "hi!");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-97L) + "'", long27 == (-97L));
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        int int10 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        org.joda.time.Chronology chronology20 = dateTimeParserBucket17.getChronology();
        long long21 = dateTimeParserBucket17.computeMillis();
        dateTimeParserBucket17.setOffset((java.lang.Integer) (-1));
        long long25 = dateTimeParserBucket17.computeMillis(false);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket17.getChronology();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale30, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        dateTimeParserBucket33.setZone(dateTimeZone34);
        int int36 = dateTimeParserBucket33.getOffset();
        org.joda.time.Chronology chronology37 = dateTimeParserBucket33.getChronology();
        org.joda.time.Chronology chronology39 = null;
        java.util.Locale locale40 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket(0L, chronology39, locale40, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket43.setOffset((int) 'a');
        org.joda.time.Chronology chronology46 = dateTimeParserBucket43.getChronology();
        java.util.Locale locale47 = dateTimeParserBucket43.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology37, locale47, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology26, locale47, (java.lang.Integer) 10);
        boolean boolean53 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeParserBucket52);
        int int54 = dateTimeParserBucket52.getOffset();
        org.joda.time.DateTimeZone dateTimeZone55 = dateTimeParserBucket52.getZone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-97L) + "'", long21 == (-97L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone55);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long12 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket5.getZone();
        long long16 = dateTimeParserBucket5.computeMillis(false);
        java.util.Locale locale17 = dateTimeParserBucket5.getLocale();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology14 = dateTimeParserBucket3.getChronology();
        int int15 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long13 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        dateTimeParserBucket4.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket4.getChronology();
        int int8 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology12, locale13);
        long long17 = dateTimeParserBucket14.computeMillis(false, "hi!");
        dateTimeParserBucket14.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket14.getChronology();
        org.joda.time.Chronology chronology23 = null;
        java.util.Locale locale24 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology23, locale24, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket27.setOffset((int) 'a');
        org.joda.time.Chronology chronology30 = dateTimeParserBucket27.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = null;
        dateTimeParserBucket27.saveField(dateTimeField31, 0);
        org.joda.time.Chronology chronology34 = dateTimeParserBucket27.getChronology();
        org.joda.time.Chronology chronology36 = null;
        java.util.Locale locale37 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(0L, chronology36, locale37, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket40.setOffset((int) 'a');
        org.joda.time.Chronology chronology43 = dateTimeParserBucket40.getChronology();
        java.util.Locale locale44 = dateTimeParserBucket40.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology34, locale44);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket(100L, chronology20, locale44, (java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 100, chronology9, locale44);
        org.joda.time.DateTimeFieldType dateTimeFieldType49 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket48.saveField(dateTimeFieldType49, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket3.getPivotYear();
        java.util.Locale locale12 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType13, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        long long12 = dateTimeParserBucket5.computeMillis();
        java.lang.Object obj13 = dateTimeParserBucket5.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(0L, chronology17, locale18, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket21.setOffset((int) 'a');
        org.joda.time.Chronology chronology24 = dateTimeParserBucket21.getChronology();
        java.util.Locale locale25 = dateTimeParserBucket21.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType14, "", locale25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-100L) + "'", long12 == (-100L));
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone21);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass25 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset((int) '#');
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology4, locale5);
        dateTimeParserBucket6.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        int int10 = dateTimeParserBucket6.getOffset();
        org.joda.time.Chronology chronology11 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology14, locale15);
        long long19 = dateTimeParserBucket16.computeMillis(false, "hi!");
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology22 = dateTimeParserBucket16.getChronology();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(0L, chronology25, locale26, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket29.setOffset((int) 'a');
        org.joda.time.Chronology chronology32 = dateTimeParserBucket29.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = null;
        dateTimeParserBucket29.saveField(dateTimeField33, 0);
        org.joda.time.Chronology chronology36 = dateTimeParserBucket29.getChronology();
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale39, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket42.setOffset((int) 'a');
        org.joda.time.Chronology chronology45 = dateTimeParserBucket42.getChronology();
        java.util.Locale locale46 = dateTimeParserBucket42.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket47 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology36, locale46);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(100L, chronology22, locale46, (java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 100, chronology11, locale46);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.Chronology chronology54 = null;
        java.util.Locale locale55 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket58 = new org.joda.time.format.DateTimeParserBucket(0L, chronology54, locale55, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket58.setOffset((int) 'a');
        long long62 = dateTimeParserBucket58.computeMillis(true);
        java.util.Locale locale63 = dateTimeParserBucket58.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket65 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology52, locale63, (java.lang.Integer) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket68 = new org.joda.time.format.DateTimeParserBucket(10L, chronology11, locale63, (java.lang.Integer) 32, (int) (short) 1);
        org.joda.time.Chronology chronology71 = null;
        java.util.Locale locale72 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket73 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology71, locale72);
        long long76 = dateTimeParserBucket73.computeMillis(false, "hi!");
        dateTimeParserBucket73.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology79 = dateTimeParserBucket73.getChronology();
        org.joda.time.Chronology chronology81 = null;
        java.util.Locale locale82 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket83 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology81, locale82);
        long long86 = dateTimeParserBucket83.computeMillis(false, "hi!");
        int int87 = dateTimeParserBucket83.getOffset();
        dateTimeParserBucket83.setOffset((int) (short) 10);
        java.util.Locale locale90 = dateTimeParserBucket83.getLocale();
        java.lang.Integer int91 = dateTimeParserBucket83.getPivotYear();
        java.util.Locale locale92 = dateTimeParserBucket83.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket94 = new org.joda.time.format.DateTimeParserBucket(1L, chronology79, locale92, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket97 = new org.joda.time.format.DateTimeParserBucket(99L, chronology11, locale92, (java.lang.Integer) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + (-97L) + "'", long62 == (-97L));
        org.junit.Assert.assertNotNull(locale63);
        org.junit.Assert.assertEquals(locale63.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long76 + "' != '" + (-1L) + "'", long76 == (-1L));
        org.junit.Assert.assertNotNull(chronology79);
        org.junit.Assert.assertTrue("'" + long86 + "' != '" + (-1L) + "'", long86 == (-1L));
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 0 + "'", int87 == 0);
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "en_US");
        org.junit.Assert.assertNull(int91);
        org.junit.Assert.assertNotNull(locale92);
        org.junit.Assert.assertEquals(locale92.toString(), "en_US");
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology3, locale4);
        long long8 = dateTimeParserBucket5.computeMillis(false, "hi!");
        java.lang.Object obj9 = dateTimeParserBucket5.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        long long13 = dateTimeParserBucket5.computeMillis(true, "");
        int int14 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology15 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology17, locale18);
        long long22 = dateTimeParserBucket19.computeMillis(false, "hi!");
        dateTimeParserBucket19.setOffset(0);
        java.lang.Integer int25 = dateTimeParserBucket19.getPivotYear();
        java.lang.Object obj26 = dateTimeParserBucket19.saveState();
        java.util.Locale locale27 = dateTimeParserBucket19.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale27);
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology30, locale31);
        long long35 = dateTimeParserBucket32.computeMillis(false, "hi!");
        dateTimeParserBucket32.setOffset(0);
        java.util.Locale locale38 = dateTimeParserBucket32.getLocale();
        java.util.Locale locale39 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology15, locale39, (java.lang.Integer) (-1));
        dateTimeParserBucket41.setPivotYear((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-1L) + "'", long35 == (-1L));
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        int int15 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj16 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket3.getZone();
        java.lang.Integer int13 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) '#');
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale15, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket18.setOffset((int) 'a');
        int int21 = dateTimeParserBucket18.getOffset();
        int int22 = dateTimeParserBucket18.getOffset();
        dateTimeParserBucket18.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket18.setOffset((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket18.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone27);
        int int29 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField30 = null;
        dateTimeParserBucket3.saveField(dateTimeField30, (int) '#');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        int int13 = dateTimeParserBucket5.getOffset();
        int int14 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long6 = dateTimeParserBucket4.computeMillis(false);
        dateTimeParserBucket4.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology9, locale10, (java.lang.Integer) 100);
        int int13 = dateTimeParserBucket12.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (short) -1);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket3.saveField(dateTimeField16, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        long long12 = dateTimeParserBucket5.computeMillis(false, "");
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology14, locale15);
        long long19 = dateTimeParserBucket16.computeMillis(false, "hi!");
        dateTimeParserBucket16.setOffset(0);
        java.util.Locale locale22 = dateTimeParserBucket16.getLocale();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField27 = null;
        dateTimeParserBucket16.saveField(dateTimeField27, (int) ' ');
        boolean boolean30 = dateTimeParserBucket5.restoreState((java.lang.Object) ' ');
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 10);
        long long38 = dateTimeParserBucket5.computeMillis(true);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-10L) + "'", long38 == (-10L));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((int) (byte) 1);
        long long14 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Integer int15 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        long long8 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket15.setOffset((int) 'a');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket15.getChronology();
        long long19 = dateTimeParserBucket15.computeMillis();
        dateTimeParserBucket15.setOffset((java.lang.Integer) (-1));
        long long23 = dateTimeParserBucket15.computeMillis(false);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket15.getChronology();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale28, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        dateTimeParserBucket31.setZone(dateTimeZone32);
        int int34 = dateTimeParserBucket31.getOffset();
        org.joda.time.Chronology chronology35 = dateTimeParserBucket31.getChronology();
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(0L, chronology37, locale38, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket41.setOffset((int) 'a');
        org.joda.time.Chronology chronology44 = dateTimeParserBucket41.getChronology();
        java.util.Locale locale45 = dateTimeParserBucket41.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology35, locale45, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology24, locale45, (java.lang.Integer) 10);
        long long53 = dateTimeParserBucket50.computeMillis(false, "hi!");
        int int54 = dateTimeParserBucket50.getOffset();
        boolean boolean55 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket50);
        org.joda.time.Chronology chronology56 = dateTimeParserBucket3.getChronology();
        long long59 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-97L) + "'", long19 == (-97L));
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1L + "'", long23 == 1L);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long53 + "' != '" + (-1L) + "'", long53 == (-1L));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + (-1L) + "'", long59 == (-1L));
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale11, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        dateTimeParserBucket14.setZone(dateTimeZone15);
        int int17 = dateTimeParserBucket14.getOffset();
        java.lang.Class<?> wildcardClass18 = dateTimeParserBucket14.getClass();
        boolean boolean19 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeParserBucket14);
        long long22 = dateTimeParserBucket5.computeMillis(false, "hi!");
        long long24 = dateTimeParserBucket5.computeMillis(true);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-97L) + "'", long22 == (-97L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-97L) + "'", long24 == (-97L));
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        dateTimeParserBucket3.setZone(dateTimeZone5);
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setOffset((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(0L, chronology11, locale12, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket15.setOffset((int) 'a');
        long long19 = dateTimeParserBucket15.computeMillis(true);
        java.util.Locale locale20 = dateTimeParserBucket15.getLocale();
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 1);
        boolean boolean23 = dateTimeParserBucket5.restoreState((java.lang.Object) 1);
        org.joda.time.DateTimeField dateTimeField24 = null;
        dateTimeParserBucket5.saveField(dateTimeField24, 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-97L) + "'", long19 == (-97L));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket6.computeMillis(false);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        dateTimeParserBucket22.setZone(dateTimeZone23);
        int int25 = dateTimeParserBucket22.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket22.getChronology();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        org.joda.time.Chronology chronology35 = dateTimeParserBucket32.getChronology();
        java.util.Locale locale36 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology26, locale36, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale36, (java.lang.Integer) 10);
        long long44 = dateTimeParserBucket41.computeMillis(false, "hi!");
        int int45 = dateTimeParserBucket41.getOffset();
        dateTimeParserBucket41.setPivotYear((java.lang.Integer) (-1));
        long long48 = dateTimeParserBucket41.computeMillis();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket3.saveField(dateTimeField5, (int) (byte) -1);
        java.lang.Integer int8 = dateTimeParserBucket3.getPivotYear();
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        int int10 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket5.saveField(dateTimeField13, (int) '#');
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        java.util.Locale locale18 = dateTimeParserBucket5.getLocale();
        org.joda.time.Chronology chronology19 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale15, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket18.setOffset((int) 'a');
        int int21 = dateTimeParserBucket18.getOffset();
        int int22 = dateTimeParserBucket18.getOffset();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket18.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeParserBucket3.getZone();
        long long26 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) (byte) 1);
        java.lang.Class<?> wildcardClass29 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        int int10 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType16, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        long long12 = dateTimeParserBucket5.computeMillis(false, "");
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology14, locale15);
        long long19 = dateTimeParserBucket16.computeMillis(false, "hi!");
        dateTimeParserBucket16.setOffset(0);
        java.util.Locale locale22 = dateTimeParserBucket16.getLocale();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket16.getZone();
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField27 = null;
        dateTimeParserBucket16.saveField(dateTimeField27, (int) ' ');
        boolean boolean30 = dateTimeParserBucket5.restoreState((java.lang.Object) ' ');
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 10);
        long long37 = dateTimeParserBucket5.computeMillis(false, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-97L) + "'", long37 == (-97L));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        dateTimeParserBucket3.setZone(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology8, locale9);
        long long13 = dateTimeParserBucket10.computeMillis(false, "hi!");
        java.lang.Object obj14 = dateTimeParserBucket10.saveState();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket10.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone15);
        java.lang.Integer int17 = dateTimeParserBucket3.getPivotYear();
        int int18 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        int int12 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket3.getChronology();
        long long16 = dateTimeParserBucket3.computeMillis(true, "hi!");
        org.joda.time.DateTimeField dateTimeField17 = null;
        dateTimeParserBucket3.saveField(dateTimeField17, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long8 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        int int10 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset(97);
        dateTimeParserBucket3.setOffset(1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 52);
        long long18 = dateTimeParserBucket3.computeMillis(true, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-53L) + "'", long18 == (-53L));
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        int int11 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        org.joda.time.Chronology chronology20 = dateTimeParserBucket17.getChronology();
        long long21 = dateTimeParserBucket17.computeMillis();
        dateTimeParserBucket17.setOffset((java.lang.Integer) (-1));
        long long25 = dateTimeParserBucket17.computeMillis(false);
        dateTimeParserBucket17.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket17.setOffset((java.lang.Integer) 100);
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeParserBucket17.getZone();
        boolean boolean31 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeParserBucket17);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket17.saveField(dateTimeFieldType32, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-97L) + "'", long21 == (-97L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        dateTimeParserBucket3.setZone(dateTimeZone9);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        int int12 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        long long15 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj5 = dateTimeParserBucket3.saveState();
        int int6 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }
}

