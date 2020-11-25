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
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Class<?> wildcardClass4 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
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
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
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
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
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
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
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
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
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
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
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
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
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
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
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
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
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
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
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
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
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
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
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
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
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
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
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
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
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
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
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
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
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
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
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
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
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
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
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
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
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
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
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
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
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
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
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
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Class<?> wildcardClass6 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
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
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
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
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
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
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
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
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
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
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
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
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
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
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
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
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
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
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
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
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
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
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
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
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
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
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
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
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
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
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
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
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
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
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
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
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
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
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
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
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
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
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
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
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
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
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
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
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
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
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
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
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
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
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
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
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
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
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
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
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
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
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
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
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
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
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
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
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
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
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
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
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
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
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
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
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
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
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        long long6 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
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
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
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
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
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
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
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
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
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
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
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
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
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
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
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
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
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
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
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
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
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
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
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
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
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
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
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
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        java.lang.Integer int6 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertNull(int6);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
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
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
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
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
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
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
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
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
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
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
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
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
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
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
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
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
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
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
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
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
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
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
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
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
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
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
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
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
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
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
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
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
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
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
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
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
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
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
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
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
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
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
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
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
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
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
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
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
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
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
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
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
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
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
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
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
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
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
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
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
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
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
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
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
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
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
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
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
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
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
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
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
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
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
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
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
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
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
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
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
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
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
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
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
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
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
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
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
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
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
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
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
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
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
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
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
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
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
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
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
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
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
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
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
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
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
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
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
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
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(10L, chronology1, locale2, (java.lang.Integer) 1, (int) 'a');
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
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
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
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
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
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
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
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
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
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
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        java.lang.Object obj8 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
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
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
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
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
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
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
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
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
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
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
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
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
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
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
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
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
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
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
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
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
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
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
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
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
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
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
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
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
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
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
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
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
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
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
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
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
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
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
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
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
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
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
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
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
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
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
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
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
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
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
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
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
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
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
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
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
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
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
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
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
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
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
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
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
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
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
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
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
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
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
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
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
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
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
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
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
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
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
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
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
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
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
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
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
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
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
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
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
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
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
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
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
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
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
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
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
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
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
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
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
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
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
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
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
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
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
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
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((int) (short) 100);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
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
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
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
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
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
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
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
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
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
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
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
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
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
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
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
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((int) (short) 100);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
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
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
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
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
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
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
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
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
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
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
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
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
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
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
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
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
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
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
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
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
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
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
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
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
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
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
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
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
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
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
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
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
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
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
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
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
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
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
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
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
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
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
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
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
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
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
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
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
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
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
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
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
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
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
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
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
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
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
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
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
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
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
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
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
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
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
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
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
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
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
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
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
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
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 52);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
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
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
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
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
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
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
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
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
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
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
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
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
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
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
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
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
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
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
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
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
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
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
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
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
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
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
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
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
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
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
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
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
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
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
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
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
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
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
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
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
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
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
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
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
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
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
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
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
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
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
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
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
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
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
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
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
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
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
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
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
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
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
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
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
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
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
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
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
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
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
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
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
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
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
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
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
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
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
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
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
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
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
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
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
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
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
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
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
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
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
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
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
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
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
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
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
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
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
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
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
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
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
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
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
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
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
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
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
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
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
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
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
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
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
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
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
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
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
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
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
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
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
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
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
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
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
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
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
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
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
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
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
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
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
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
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
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
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
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
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
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
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
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
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
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
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
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
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
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
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
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
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
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
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
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
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj12 = dateTimeParserBucket5.saveState();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket5.getZone();
        java.lang.Class<?> wildcardClass14 = dateTimeZone13.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeParserBucket3.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long7 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Integer int8 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology14 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology16, locale17);
        java.lang.Integer int19 = dateTimeParserBucket18.getPivotYear();
        dateTimeParserBucket18.setOffset((int) (byte) 100);
        boolean boolean22 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeParserBucket18);
        long long24 = dateTimeParserBucket18.computeMillis(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-101L) + "'", long24 == (-101L));
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
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
        org.joda.time.Chronology chronology26 = dateTimeParserBucket3.getChronology();
        java.lang.Class<?> wildcardClass27 = chronology26.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
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
        long long15 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale9 = dateTimeParserBucket5.getLocale();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology11 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket24.saveField(dateTimeFieldType25, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        int int11 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) (short) 0);
        int int13 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        long long12 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType15, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        int int11 = dateTimeParserBucket5.getOffset();
        java.lang.Integer int12 = dateTimeParserBucket5.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket3.getPivotYear();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        dateTimeParserBucket5.setZone(dateTimeZone43);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        long long49 = dateTimeParserBucket5.computeMillis(true, "hi!");
        org.joda.time.DateTimeField dateTimeField50 = null;
        dateTimeParserBucket5.saveField(dateTimeField50, 0);
        dateTimeParserBucket5.setOffset(1);
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
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + (-100L) + "'", long49 == (-100L));
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        long long15 = dateTimeParserBucket5.computeMillis(false);
        long long18 = dateTimeParserBucket5.computeMillis(false, "hi!");
        java.lang.Object obj19 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-10L) + "'", long15 == (-10L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-10L) + "'", long18 == (-10L));
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        int int8 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        java.lang.Integer int11 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone22);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        long long10 = dateTimeParserBucket6.computeMillis();
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        dateTimeParserBucket6.setOffset((java.lang.Integer) 97);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket(0L, chronology17, locale18, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket21.setOffset((int) 'a');
        long long25 = dateTimeParserBucket21.computeMillis(true);
        java.util.Locale locale26 = dateTimeParserBucket21.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale26, (java.lang.Integer) 100, 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-97L) + "'", long25 == (-97L));
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        dateTimeParserBucket13.setOffset((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType14, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long8 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        long long15 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 52);
        java.lang.Object obj12 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        int int9 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }
}

