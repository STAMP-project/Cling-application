import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology4, locale5);
        long long9 = dateTimeParserBucket6.computeMillis(false, "hi!");
        java.lang.Object obj10 = dateTimeParserBucket6.saveState();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket6.getZone();
        long long14 = dateTimeParserBucket6.computeMillis(true, "");
        int int15 = dateTimeParserBucket6.getOffset();
        org.joda.time.Chronology chronology16 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology18, locale19);
        long long23 = dateTimeParserBucket20.computeMillis(false, "hi!");
        dateTimeParserBucket20.setOffset(0);
        java.lang.Integer int26 = dateTimeParserBucket20.getPivotYear();
        java.lang.Object obj27 = dateTimeParserBucket20.saveState();
        java.util.Locale locale28 = dateTimeParserBucket20.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket(0L, chronology16, locale28);
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology31, locale32);
        long long36 = dateTimeParserBucket33.computeMillis(false, "hi!");
        int int37 = dateTimeParserBucket33.getOffset();
        dateTimeParserBucket33.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField40 = null;
        dateTimeParserBucket33.saveField(dateTimeField40, (int) '#');
        java.util.Locale locale43 = dateTimeParserBucket33.getLocale();
        java.util.Locale locale44 = dateTimeParserBucket33.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology16, locale44);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.Chronology chronology49 = null;
        java.util.Locale locale50 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(0L, chronology49, locale50, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket53.setOffset((int) 'a');
        org.joda.time.Chronology chronology56 = dateTimeParserBucket53.getChronology();
        long long57 = dateTimeParserBucket53.computeMillis();
        dateTimeParserBucket53.setOffset((java.lang.Integer) (-1));
        java.lang.Object obj60 = null;
        boolean boolean61 = dateTimeParserBucket53.restoreState(obj60);
        dateTimeParserBucket53.setOffset(10);
        java.util.Locale locale64 = dateTimeParserBucket53.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((-32L), chronology47, locale64, (java.lang.Integer) 1, 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket70 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology16, locale64, (java.lang.Integer) 100, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(obj27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + (-97L) + "'", long57 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_US");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType10, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(dateTimeZone9);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
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
        dateTimeParserBucket41.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket41.setOffset((java.lang.Integer) 100);
        org.joda.time.DateTimeZone dateTimeZone52 = dateTimeParserBucket41.getZone();
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
        org.junit.Assert.assertNotNull(dateTimeZone52);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((int) (byte) 1);
        dateTimeParserBucket3.setOffset(0);
        long long17 = dateTimeParserBucket3.computeMillis(true, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        int int10 = dateTimeParserBucket5.getOffset();
        long long13 = dateTimeParserBucket5.computeMillis(true, "");
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
        dateTimeParserBucket5.setOffset(0);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.util.Locale locale14 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket3.saveField(dateTimeField15, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, (int) ' ');
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
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
        java.lang.Class<?> wildcardClass17 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Integer int11 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket3.saveField(dateTimeField12, 0);
        java.lang.Object obj15 = dateTimeParserBucket3.saveState();
        java.lang.Class<?> wildcardClass16 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        int int12 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
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
            dateTimeParserBucket5.saveField(dateTimeFieldType25, (int) (byte) -1);
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, 0);
        java.util.Locale locale17 = dateTimeParserBucket3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeParserBucket3.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
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
        long long32 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-2L) + "'", long32 == (-2L));
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        long long11 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        java.lang.Object obj13 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        long long13 = dateTimeParserBucket5.computeMillis(true);
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass16 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        java.util.Locale locale42 = dateTimeParserBucket41.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket41.saveField(dateTimeFieldType43, 100);
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
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket3.setOffset(100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int10 = dateTimeParserBucket4.getOffsetInteger();
        java.util.Locale locale11 = dateTimeParserBucket4.getLocale();
        java.lang.Integer int12 = dateTimeParserBucket4.getOffsetInteger();
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket4.saveField(dateTimeField13, (int) (byte) 100);
        int int16 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology17 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale20, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        dateTimeParserBucket23.setZone(dateTimeZone24);
        int int26 = dateTimeParserBucket23.getOffset();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket23.getZone();
        java.util.Locale locale28 = dateTimeParserBucket23.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (short) 0, chronology17, locale28, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket3.getOffsetInteger();
        int int12 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
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
        long long29 = dateTimeParserBucket27.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        int int14 = dateTimeParserBucket5.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeParserBucket5.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
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
        long long17 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale20, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket23.setOffset((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket23.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone26);
        org.joda.time.DateTimeField dateTimeField28 = null;
        dateTimeParserBucket3.saveField(dateTimeField28, 97);
        // The following exception was thrown during execution in test generation
        try {
            long long33 = dateTimeParserBucket3.computeMillis(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
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
        dateTimeParserBucket3.setOffset((int) (short) 0);
        java.lang.Integer int24 = dateTimeParserBucket3.getPivotYear();
        java.lang.Integer int25 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNull(int25);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        long long27 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-1L) + "'", long27 == (-1L));
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long8 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        long long12 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        java.lang.Object obj15 = null;
        boolean boolean16 = dateTimeParserBucket3.restoreState(obj15);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        java.util.Locale locale25 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        long long15 = dateTimeParserBucket3.computeMillis(false, "");
        java.util.Locale locale16 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset(97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        int int11 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket3.getZone();
        long long13 = dateTimeParserBucket3.computeMillis();
        java.util.Locale locale14 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
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
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        java.lang.Object obj23 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket3.getChronology();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket3.getChronology();
        java.lang.Class<?> wildcardClass10 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket3.getChronology();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        int int10 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        long long10 = dateTimeParserBucket3.computeMillis(false, "");
        long long12 = dateTimeParserBucket3.computeMillis(true);
        long long13 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        dateTimeParserBucket3.setOffset((int) (short) 0);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
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
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = dateTimeParserBucket3.computeMillis();
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long21 = dateTimeParserBucket3.computeMillis(true, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
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
        java.util.Locale locale26 = dateTimeParserBucket3.getLocale();
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
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType8, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        int int10 = dateTimeParserBucket5.getOffset();
        long long13 = dateTimeParserBucket5.computeMillis(true, "");
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket3.saveField(dateTimeField15, 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset(10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
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
        org.joda.time.Chronology chronology19 = dateTimeParserBucket16.getChronology();
        java.util.Locale locale20 = dateTimeParserBucket16.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology10, locale20, (java.lang.Integer) 10, (int) '4');
        long long25 = dateTimeParserBucket23.computeMillis(false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
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
        dateTimeParserBucket41.setOffset(32);
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
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        dateTimeParserBucket5.setOffset(0);
        java.lang.Object obj45 = dateTimeParserBucket5.saveState();
        org.joda.time.DateTimeField dateTimeField46 = null;
        dateTimeParserBucket5.saveField(dateTimeField46, (int) (byte) 0);
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
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
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
        long long45 = dateTimeParserBucket5.computeMillis();
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
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-10L) + "'", long45 == (-10L));
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        int int8 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        org.joda.time.Chronology chronology20 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = null;
        dateTimeParserBucket17.saveField(dateTimeField21, 0);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket17.getChronology();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale27, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket30.setOffset((int) 'a');
        org.joda.time.Chronology chronology33 = dateTimeParserBucket30.getChronology();
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology24, locale34);
        boolean boolean36 = dateTimeParserBucket3.restoreState((java.lang.Object) 97);
        int int37 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj38 = dateTimeParserBucket3.saveState();
        // The following exception was thrown during execution in test generation
        try {
            long long41 = dateTimeParserBucket3.computeMillis(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, 1);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
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
        dateTimeParserBucket3.setOffset((int) (short) -1);
        org.joda.time.DateTimeField dateTimeField30 = null;
        dateTimeParserBucket3.saveField(dateTimeField30, (int) (byte) 10);
        int int33 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        long long12 = dateTimeParserBucket5.computeMillis(false, "");
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket5.getZone();
        boolean boolean15 = dateTimeParserBucket5.restoreState((java.lang.Object) (byte) 10);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
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
        dateTimeParserBucket27.setOffset((java.lang.Integer) 97);
        int int30 = dateTimeParserBucket27.getOffset();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset(100);
        java.lang.Object obj13 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((int) 'a');
        long long23 = dateTimeParserBucket19.computeMillis(true);
        java.util.Locale locale24 = dateTimeParserBucket19.getLocale();
        dateTimeParserBucket19.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology28, locale29);
        org.joda.time.DateTimeField dateTimeField31 = null;
        dateTimeParserBucket30.saveField(dateTimeField31, (int) (byte) 1);
        int int34 = dateTimeParserBucket30.getOffset();
        dateTimeParserBucket30.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeParserBucket30.getZone();
        dateTimeParserBucket19.setZone(dateTimeZone37);
        dateTimeParserBucket3.setZone(dateTimeZone37);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        org.joda.time.Chronology chronology43 = null;
        java.util.Locale locale44 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket45 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology43, locale44);
        long long48 = dateTimeParserBucket45.computeMillis(false, "hi!");
        int int49 = dateTimeParserBucket45.getOffset();
        long long52 = dateTimeParserBucket45.computeMillis(false, "");
        java.util.Locale locale53 = dateTimeParserBucket45.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType40, "hi!", locale53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-1L) + "'", long48 == (-1L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-1L) + "'", long52 == (-1L));
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "en_US");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        org.joda.time.Chronology chronology11 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        java.lang.Class<?> wildcardClass11 = dateTimeZone10.getClass();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology14 = dateTimeParserBucket5.getChronology();
        java.lang.Class<?> wildcardClass15 = chronology14.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        long long10 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        long long8 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        int int12 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType13, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType12, (int) (short) -1);
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
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        java.lang.Class<?> wildcardClass11 = locale10.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        boolean boolean12 = dateTimeParserBucket5.restoreState((java.lang.Object) 0);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        int int45 = dateTimeParserBucket39.getOffset();
        long long46 = dateTimeParserBucket39.computeMillis();
        java.util.Locale locale47 = dateTimeParserBucket39.getLocale();
        java.lang.Class<?> wildcardClass48 = dateTimeParserBucket39.getClass();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
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
        long long15 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
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
            long long24 = dateTimeParserBucket3.computeMillis(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        int int13 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        java.lang.Integer int22 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(int22);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((int) (byte) 1);
        long long14 = dateTimeParserBucket3.computeMillis(true);
        long long17 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-2L) + "'", long14 == (-2L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-2L) + "'", long17 == (-2L));
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
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
            dateTimeParserBucket5.saveField(dateTimeFieldType16, (int) (byte) 10);
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        org.joda.time.Chronology chronology7 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset(100);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        java.lang.Integer int24 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setOffset((-1));
        long long28 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset(52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset(100);
        java.lang.Object obj13 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long9 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        long long12 = dateTimeParserBucket3.computeMillis();
        int int13 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-101L) + "'", long12 == (-101L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        long long17 = dateTimeParserBucket3.computeMillis();
        java.lang.Integer int18 = dateTimeParserBucket3.getPivotYear();
        long long21 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.DateTimeField dateTimeField22 = null;
        dateTimeParserBucket3.saveField(dateTimeField22, 10);
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale27, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket30.setOffset((int) 'a');
        long long33 = dateTimeParserBucket30.computeMillis();
        long long34 = dateTimeParserBucket30.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket30.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone35);
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale39, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket42.setOffset((int) 'a');
        org.joda.time.Chronology chronology45 = dateTimeParserBucket42.getChronology();
        long long46 = dateTimeParserBucket42.computeMillis();
        dateTimeParserBucket42.setOffset((java.lang.Integer) (-1));
        dateTimeParserBucket42.setOffset((java.lang.Integer) 97);
        long long52 = dateTimeParserBucket42.computeMillis(true);
        org.joda.time.DateTimeField dateTimeField53 = null;
        dateTimeParserBucket42.saveField(dateTimeField53, 52);
        boolean boolean56 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeField53);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-97L) + "'", long33 == (-97L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-97L) + "'", long34 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-97L) + "'", long46 == (-97L));
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-97L) + "'", long52 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
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
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        int int14 = dateTimeParserBucket5.getOffset();
        java.lang.Object obj15 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 97);
        java.lang.Object obj48 = dateTimeParserBucket5.saveState();
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
        org.junit.Assert.assertNotNull(obj48);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        java.lang.Class<?> wildcardClass57 = dateTimeParserBucket3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
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
        dateTimeParserBucket23.setPivotYear((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
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
        long long44 = dateTimeParserBucket41.computeMillis();
        java.util.Locale locale45 = dateTimeParserBucket41.getLocale();
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
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long9 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        int int11 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        dateTimeParserBucket41.setPivotYear((java.lang.Integer) 32);
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj12 = dateTimeParserBucket5.saveState();
        java.lang.Class<?> wildcardClass13 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        long long12 = dateTimeParserBucket5.computeMillis(false, "");
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket5.getZone();
        long long16 = dateTimeParserBucket5.computeMillis(false, "hi!");
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType17, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-97L) + "'", long16 == (-97L));
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket3.getOffsetInteger();
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket3.saveField(dateTimeField12, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.util.Locale locale11 = dateTimeParserBucket3.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeParserBucket3.computeMillis(true, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setOffset((int) (byte) -1);
        int int9 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType10, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.util.Locale locale12 = dateTimeParserBucket3.getLocale();
        java.lang.Object obj13 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        long long14 = dateTimeParserBucket3.computeMillis(false);
        java.util.Locale locale15 = dateTimeParserBucket3.getLocale();
        long long16 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-11L) + "'", long14 == (-11L));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-11L) + "'", long16 == (-11L));
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology4, locale5);
        long long8 = dateTimeParserBucket6.computeMillis(false);
        dateTimeParserBucket6.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology11, locale12, (java.lang.Integer) 100);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology16, locale17, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket20.setOffset((int) 'a');
        long long23 = dateTimeParserBucket20.computeMillis();
        long long24 = dateTimeParserBucket20.computeMillis();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale27, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket30.setOffset((int) 'a');
        long long34 = dateTimeParserBucket30.computeMillis(true);
        java.util.Locale locale35 = dateTimeParserBucket30.getLocale();
        dateTimeParserBucket30.setPivotYear((java.lang.Integer) 1);
        boolean boolean38 = dateTimeParserBucket20.restoreState((java.lang.Object) 1);
        java.util.Locale locale39 = dateTimeParserBucket20.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology11, locale39);
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology42, locale43);
        long long47 = dateTimeParserBucket44.computeMillis(false, "hi!");
        dateTimeParserBucket44.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int50 = dateTimeParserBucket44.getOffsetInteger();
        java.util.Locale locale51 = dateTimeParserBucket44.getLocale();
        long long54 = dateTimeParserBucket44.computeMillis(false, "hi!");
        java.util.Locale locale55 = dateTimeParserBucket44.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((-52L), chronology11, locale55, (java.lang.Integer) 97);
        dateTimeParserBucket57.setOffset((java.lang.Integer) (-1));
        org.joda.time.DateTimeField dateTimeField60 = null;
        dateTimeParserBucket57.saveField(dateTimeField60, 10);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-97L) + "'", long24 == (-97L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-97L) + "'", long34 == (-97L));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((int) '4');
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, (int) (short) 0);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long21 = dateTimeParserBucket3.computeMillis(true, "hi!");
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket3.saveField(dateTimeField5, (int) (byte) -1);
        java.lang.Integer int8 = dateTimeParserBucket3.getOffsetInteger();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset(100);
        java.lang.Object obj13 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((int) 'a');
        long long23 = dateTimeParserBucket19.computeMillis(true);
        java.util.Locale locale24 = dateTimeParserBucket19.getLocale();
        dateTimeParserBucket19.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology28, locale29);
        org.joda.time.DateTimeField dateTimeField31 = null;
        dateTimeParserBucket30.saveField(dateTimeField31, (int) (byte) 1);
        int int34 = dateTimeParserBucket30.getOffset();
        dateTimeParserBucket30.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeParserBucket30.getZone();
        dateTimeParserBucket19.setZone(dateTimeZone37);
        dateTimeParserBucket3.setZone(dateTimeZone37);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType40, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone37);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        java.lang.Object obj9 = dateTimeParserBucket5.saveState();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType45, (int) ' ');
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
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
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
        dateTimeParserBucket26.setOffset((int) (short) -1);
        long long30 = dateTimeParserBucket26.computeMillis(true);
        dateTimeParserBucket26.setOffset(52);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-100L) + "'", long30 == (-100L));
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
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
        org.joda.time.Chronology chronology21 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj12 = dateTimeParserBucket5.saveState();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        long long16 = dateTimeParserBucket5.computeMillis(false);
        int int17 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-97L) + "'", long16 == (-97L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj12 = dateTimeParserBucket5.saveState();
        java.util.Locale locale13 = dateTimeParserBucket5.getLocale();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        java.util.Locale locale12 = dateTimeParserBucket3.getLocale();
        java.lang.Class<?> wildcardClass13 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        int int10 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setOffset(10);
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeParserBucket3.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket5.getZone();
        org.joda.time.Chronology chronology10 = null;
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale11, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket14.setOffset((int) 'a');
        int int17 = dateTimeParserBucket14.getOffset();
        int int18 = dateTimeParserBucket14.getOffset();
        dateTimeParserBucket14.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj21 = dateTimeParserBucket14.saveState();
        dateTimeParserBucket14.setOffset((java.lang.Integer) 97);
        org.joda.time.DateTimeField dateTimeField24 = null;
        dateTimeParserBucket14.saveField(dateTimeField24, (int) 'a');
        boolean boolean27 = dateTimeParserBucket5.restoreState((java.lang.Object) 'a');
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 97 + "'", int18 == 97);
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, (int) (byte) 10);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket5.getChronology();
        int int13 = dateTimeParserBucket5.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = dateTimeParserBucket5.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
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
        int int45 = dateTimeParserBucket39.getOffset();
        long long46 = dateTimeParserBucket39.computeMillis();
        dateTimeParserBucket39.setOffset((java.lang.Integer) 0);
        long long49 = dateTimeParserBucket39.computeMillis();
        int int50 = dateTimeParserBucket39.getOffset();
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
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology16, locale17);
        long long21 = dateTimeParserBucket18.computeMillis(false, "hi!");
        dateTimeParserBucket18.setOffset(0);
        java.util.Locale locale24 = dateTimeParserBucket18.getLocale();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeParserBucket18.getZone();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket(0L, chronology27, locale28, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket31.setOffset((int) 'a');
        dateTimeParserBucket31.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeParserBucket31.getZone();
        dateTimeParserBucket18.setZone(dateTimeZone36);
        dateTimeParserBucket18.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale40 = dateTimeParserBucket18.getLocale();
        org.joda.time.Chronology chronology41 = dateTimeParserBucket18.getChronology();
        boolean boolean42 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket18);
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeParserBucket18.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTimeZone43);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        long long12 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setOffset((int) (byte) -1);
        int int9 = dateTimeParserBucket5.getOffset();
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        long long47 = dateTimeParserBucket41.computeMillis();
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
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-53L) + "'", long47 == (-53L));
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        long long14 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology16, locale17);
        org.joda.time.DateTimeField dateTimeField19 = null;
        dateTimeParserBucket18.saveField(dateTimeField19, (int) (byte) 1);
        int int22 = dateTimeParserBucket18.getOffset();
        int int23 = dateTimeParserBucket18.getOffset();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket18.getZone();
        boolean boolean25 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeZone24);
        java.lang.Object obj26 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        long long14 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-11L) + "'", long14 == (-11L));
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology11, locale12);
        java.lang.Integer int14 = dateTimeParserBucket13.getPivotYear();
        long long15 = dateTimeParserBucket13.computeMillis();
        long long18 = dateTimeParserBucket13.computeMillis(true, "");
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeParserBucket13.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.util.Locale locale11 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket16.saveField(dateTimeFieldType25, (int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-97L) + "'", long24 == (-97L));
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        int int9 = dateTimeParserBucket6.getOffset();
        int int10 = dateTimeParserBucket6.getOffset();
        dateTimeParserBucket6.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket6.setOffset((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology15 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology18, locale19);
        long long23 = dateTimeParserBucket20.computeMillis(false, "hi!");
        dateTimeParserBucket20.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology26 = dateTimeParserBucket20.getChronology();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale30, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket33.setOffset((int) 'a');
        org.joda.time.Chronology chronology36 = dateTimeParserBucket33.getChronology();
        org.joda.time.DateTimeField dateTimeField37 = null;
        dateTimeParserBucket33.saveField(dateTimeField37, 0);
        org.joda.time.Chronology chronology40 = dateTimeParserBucket33.getChronology();
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket(0L, chronology42, locale43, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket46.setOffset((int) 'a');
        org.joda.time.Chronology chronology49 = dateTimeParserBucket46.getChronology();
        java.util.Locale locale50 = dateTimeParserBucket46.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology40, locale50);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket(100L, chronology26, locale50, (java.lang.Integer) (-1));
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket56 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology15, locale50, (java.lang.Integer) (-1), (int) '4');
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-1L) + "'", long23 == (-1L));
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        long long16 = dateTimeParserBucket3.computeMillis(true, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        dateTimeParserBucket5.setOffset(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket21 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology19, locale20);
        long long24 = dateTimeParserBucket21.computeMillis(false, "hi!");
        int int25 = dateTimeParserBucket21.getOffset();
        dateTimeParserBucket21.setOffset((int) (short) 10);
        java.util.Locale locale28 = dateTimeParserBucket21.getLocale();
        dateTimeParserBucket21.setPivotYear((java.lang.Integer) (-1));
        long long32 = dateTimeParserBucket21.computeMillis(false);
        java.util.Locale locale33 = dateTimeParserBucket21.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType16, "hi!", locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-1L) + "'", long24 == (-1L));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-11L) + "'", long32 == (-11L));
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 32);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket3.saveField(dateTimeField15, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
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
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-1L) + "'", long36 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone37);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology11, locale12);
        long long16 = dateTimeParserBucket13.computeMillis(false, "hi!");
        dateTimeParserBucket13.setOffset(0);
        java.util.Locale locale19 = dateTimeParserBucket13.getLocale();
        org.joda.time.DateTimeZone dateTimeZone20 = dateTimeParserBucket13.getZone();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket13.getZone();
        java.lang.Object obj22 = dateTimeParserBucket13.saveState();
        dateTimeParserBucket13.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology26, locale27);
        long long31 = dateTimeParserBucket28.computeMillis(false, "hi!");
        java.lang.Object obj32 = dateTimeParserBucket28.saveState();
        boolean boolean33 = dateTimeParserBucket13.restoreState((java.lang.Object) dateTimeParserBucket28);
        boolean boolean34 = dateTimeParserBucket3.restoreState((java.lang.Object) boolean33);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
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
        dateTimeParserBucket50.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket50.setPivotYear((java.lang.Integer) 35);
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        java.lang.Object obj8 = dateTimeParserBucket3.saveState();
        long long10 = dateTimeParserBucket3.computeMillis(true);
        long long12 = dateTimeParserBucket3.computeMillis(false);
        int int13 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-101L) + "'", long12 == (-101L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setOffset(32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
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
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket3.saveField(dateTimeField15, (int) (short) 10);
        java.util.Locale locale18 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        long long13 = dateTimeParserBucket5.computeMillis(true, "");
        java.lang.Integer int14 = dateTimeParserBucket5.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        boolean boolean12 = dateTimeParserBucket5.restoreState((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass13 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
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
        dateTimeParserBucket41.setOffset((java.lang.Integer) 97);
        long long51 = dateTimeParserBucket41.computeMillis(true);
        dateTimeParserBucket41.setOffset((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-98L) + "'", long51 == (-98L));
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology3, locale4);
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        int int9 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket5.getChronology();
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
        org.joda.time.Chronology chronology30 = dateTimeParserBucket27.getChronology();
        java.util.Locale locale31 = dateTimeParserBucket27.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology21, locale31, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((-100L), chronology10, locale31);
        org.joda.time.Chronology chronology37 = null;
        java.util.Locale locale38 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(0L, chronology37, locale38, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket41.setOffset((int) 'a');
        org.joda.time.Chronology chronology44 = dateTimeParserBucket41.getChronology();
        org.joda.time.DateTimeField dateTimeField45 = null;
        dateTimeParserBucket41.saveField(dateTimeField45, 0);
        dateTimeParserBucket41.setOffset((int) (short) 100);
        dateTimeParserBucket41.setOffset((int) (short) 100);
        java.util.Locale locale52 = dateTimeParserBucket41.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale52, (java.lang.Integer) 100, (int) ' ');
        java.util.Locale locale56 = dateTimeParserBucket55.getLocale();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en_US");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        dateTimeParserBucket3.setOffset(0);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        java.lang.Class<?> wildcardClass11 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        int int10 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setOffset(52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket4.getZone();
        java.lang.Object obj10 = dateTimeParserBucket4.saveState();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket4.getZone();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology14, locale15);
        long long19 = dateTimeParserBucket16.computeMillis(false, "hi!");
        dateTimeParserBucket16.setOffset(0);
        java.util.Locale locale22 = dateTimeParserBucket16.getLocale();
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket16.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket16.getZone();
        java.lang.Object obj25 = dateTimeParserBucket16.saveState();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology27, locale28);
        org.joda.time.DateTimeField dateTimeField30 = null;
        dateTimeParserBucket29.saveField(dateTimeField30, (int) (byte) 1);
        dateTimeParserBucket29.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket29.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeParserBucket29.getZone();
        dateTimeParserBucket16.setZone(dateTimeZone37);
        java.util.Locale locale39 = dateTimeParserBucket16.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale39);
        java.lang.Class<?> wildcardClass41 = locale39.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
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
        int int29 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.util.Locale locale12 = dateTimeParserBucket3.getLocale();
        java.lang.Class<?> wildcardClass13 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
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
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 52);
        long long19 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-10L) + "'", long15 == (-10L));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-10L) + "'", long19 == (-10L));
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology14 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
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
        long long35 = dateTimeParserBucket5.computeMillis(false, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + (-97L) + "'", long35 == (-97L));
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Integer int14 = dateTimeParserBucket3.getOffsetInteger();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
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
        dateTimeParserBucket3.setOffset((int) (short) -1);
        java.lang.Object obj30 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(obj30);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long6 = dateTimeParserBucket4.computeMillis(false);
        dateTimeParserBucket4.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 0, chronology9, locale10, (java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket5.getZone();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 52);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
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
        long long33 = dateTimeParserBucket17.computeMillis(true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-97L) + "'", long21 == (-97L));
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 1L + "'", long25 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-100L) + "'", long33 == (-100L));
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
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
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        long long10 = dateTimeParserBucket3.computeMillis();
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        long long15 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        org.joda.time.Chronology chronology18 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        int int11 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        java.util.Locale locale12 = dateTimeParserBucket5.getLocale();
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket5.saveField(dateTimeField13, 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType16, 97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket5.saveField(dateTimeField12, (int) (byte) -1);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        java.util.Locale locale11 = dateTimeParserBucket5.getLocale();
        long long12 = dateTimeParserBucket5.computeMillis();
        java.lang.Object obj13 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-100L) + "'", long12 == (-100L));
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket3.getChronology();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeParserBucket3.computeMillis(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long8 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, 0);
        java.lang.Object obj17 = null;
        boolean boolean18 = dateTimeParserBucket3.restoreState(obj17);
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        dateTimeParserBucket4.setOffset(0);
        java.lang.Object obj10 = dateTimeParserBucket4.saveState();
        long long12 = dateTimeParserBucket4.computeMillis(false);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((java.lang.Integer) 0);
        java.util.Locale locale22 = dateTimeParserBucket19.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(32L, chronology13, locale22, (java.lang.Integer) 52, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField26 = null;
        dateTimeParserBucket25.saveField(dateTimeField26, 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        long long13 = dateTimeParserBucket5.computeMillis(true, "");
        org.joda.time.Chronology chronology14 = dateTimeParserBucket5.getChronology();
        long long17 = dateTimeParserBucket5.computeMillis(true, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-97L) + "'", long17 == (-97L));
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        int int36 = dateTimeParserBucket32.getOffset();
        dateTimeParserBucket32.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField39 = null;
        dateTimeParserBucket32.saveField(dateTimeField39, (int) '#');
        java.util.Locale locale42 = dateTimeParserBucket32.getLocale();
        java.util.Locale locale43 = dateTimeParserBucket32.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) ' ', chronology15, locale43);
        java.util.Locale locale45 = dateTimeParserBucket44.getLocale();
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        int int20 = dateTimeParserBucket5.getOffset();
        java.lang.Object obj21 = dateTimeParserBucket5.saveState();
        org.joda.time.DateTimeField dateTimeField22 = null;
        dateTimeParserBucket5.saveField(dateTimeField22, (int) (byte) 100);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        dateTimeParserBucket4.setOffset(0);
        java.util.Locale locale10 = dateTimeParserBucket4.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket4.getZone();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        dateTimeParserBucket17.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTimeParserBucket17.getZone();
        boolean boolean23 = dateTimeParserBucket4.restoreState((java.lang.Object) dateTimeParserBucket17);
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket17.getZone();
        org.joda.time.Chronology chronology25 = dateTimeParserBucket17.getChronology();
        org.joda.time.Chronology chronology27 = null;
        java.util.Locale locale28 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology27, locale28);
        long long32 = dateTimeParserBucket29.computeMillis(false, "hi!");
        dateTimeParserBucket29.setOffset(0);
        java.lang.Object obj35 = dateTimeParserBucket29.saveState();
        long long37 = dateTimeParserBucket29.computeMillis(false);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket29.getChronology();
        long long41 = dateTimeParserBucket29.computeMillis(false, "");
        java.util.Locale locale42 = dateTimeParserBucket29.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((-90L), chronology25, locale42, (java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + (-1L) + "'", long32 == (-1L));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + (-1L) + "'", long37 == (-1L));
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-1L) + "'", long41 == (-1L));
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        long long15 = dateTimeParserBucket3.computeMillis(false, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale20, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket23.setOffset((int) 'a');
        dateTimeParserBucket23.setOffset((int) (byte) 100);
        int int28 = dateTimeParserBucket23.getOffset();
        java.util.Locale locale29 = dateTimeParserBucket23.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType16, "", locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 100 + "'", int28 == 100);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
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
        long long17 = dateTimeParserBucket3.computeMillis();
        java.lang.Integer int18 = dateTimeParserBucket3.getPivotYear();
        long long21 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.DateTimeField dateTimeField22 = null;
        dateTimeParserBucket3.saveField(dateTimeField22, 10);
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale27, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket30.setOffset((int) 'a');
        long long33 = dateTimeParserBucket30.computeMillis();
        long long34 = dateTimeParserBucket30.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket30.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone35);
        java.lang.Integer int37 = dateTimeParserBucket3.getPivotYear();
        int int38 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-97L) + "'", long33 == (-97L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-97L) + "'", long34 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNull(int37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
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
        int int24 = dateTimeParserBucket23.getOffset();
        int int25 = dateTimeParserBucket23.getOffset();
        java.lang.Integer int26 = dateTimeParserBucket23.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        int int10 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket4.getZone();
        long long12 = dateTimeParserBucket4.computeMillis(true, "");
        org.joda.time.Chronology chronology13 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology14 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology16, locale17);
        long long21 = dateTimeParserBucket18.computeMillis(false, "hi!");
        int int22 = dateTimeParserBucket18.getOffset();
        dateTimeParserBucket18.setOffset((int) (short) 10);
        java.util.Locale locale25 = dateTimeParserBucket18.getLocale();
        dateTimeParserBucket18.setPivotYear((java.lang.Integer) (-1));
        long long29 = dateTimeParserBucket18.computeMillis(false);
        java.util.Locale locale30 = dateTimeParserBucket18.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology14, locale30);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-11L) + "'", long29 == (-11L));
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket3.saveField(dateTimeField9, 97);
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeParserBucket3.computeMillis(true, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        int int8 = dateTimeParserBucket3.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeParserBucket3.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
            long long13 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass14 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
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
        java.lang.Object obj20 = dateTimeParserBucket15.saveState();
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket15.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        dateTimeParserBucket3.setZone(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType11, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        long long14 = dateTimeParserBucket3.computeMillis(true, "");
        long long16 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset(97);
        org.joda.time.DateTimeField dateTimeField19 = null;
        dateTimeParserBucket3.saveField(dateTimeField19, (int) '4');
        dateTimeParserBucket3.setOffset(32);
        java.util.Locale locale24 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        int int14 = dateTimeParserBucket5.getOffset();
        int int15 = dateTimeParserBucket5.getOffset();
        java.util.Locale locale16 = dateTimeParserBucket5.getLocale();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        long long10 = dateTimeParserBucket3.computeMillis(false, "");
        java.util.Locale locale11 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int12 = dateTimeParserBucket3.getOffsetInteger();
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType16, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
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
        java.lang.Class<?> wildcardClass23 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-97L) + "'", long22 == (-97L));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale16);
        long long20 = dateTimeParserBucket17.computeMillis(false, "hi!");
        int int21 = dateTimeParserBucket17.getOffset();
        dateTimeParserBucket17.setOffset((int) (short) 10);
        dateTimeParserBucket17.setOffset((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket17.getZone();
        java.util.Locale locale27 = dateTimeParserBucket17.getLocale();
        boolean boolean28 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket17);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        int int14 = dateTimeParserBucket5.getOffset();
        long long15 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-97L) + "'", long15 == (-97L));
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        dateTimeParserBucket41.setOffset(100);
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
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        java.lang.Object obj15 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        long long11 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Class<?> wildcardClass12 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket3.saveField(dateTimeField11, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long8 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        long long12 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        java.lang.Integer int7 = dateTimeParserBucket5.getOffsetInteger();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
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
        dateTimeParserBucket5.setOffset(0);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 10);
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
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        long long14 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.Chronology chronology15 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
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
        dateTimeParserBucket41.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket41.setOffset((java.lang.Integer) 100);
        org.joda.time.Chronology chronology52 = dateTimeParserBucket41.getChronology();
        dateTimeParserBucket41.setOffset((java.lang.Integer) 100);
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
        org.junit.Assert.assertNotNull(chronology52);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        dateTimeParserBucket3.setZone(dateTimeZone5);
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        java.lang.Integer int8 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(int7);
        org.junit.Assert.assertNull(int8);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        int int6 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology8, locale9);
        long long13 = dateTimeParserBucket10.computeMillis(false, "hi!");
        dateTimeParserBucket10.setOffset(0);
        java.util.Locale locale16 = dateTimeParserBucket10.getLocale();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket10.getZone();
        long long18 = dateTimeParserBucket10.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeParserBucket10.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone19);
        dateTimeParserBucket3.setOffset(32);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int11 = dateTimeParserBucket3.getPivotYear();
        java.util.Locale locale12 = dateTimeParserBucket3.getLocale();
        long long15 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology17, locale18);
        long long22 = dateTimeParserBucket19.computeMillis(false, "hi!");
        java.lang.Object obj23 = dateTimeParserBucket19.saveState();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket19.getZone();
        java.lang.Object obj25 = dateTimeParserBucket19.saveState();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket19.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-11L) + "'", long15 == (-11L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(obj23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
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
        org.joda.time.Chronology chronology24 = dateTimeParserBucket16.getChronology();
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket16.saveField(dateTimeFieldType27, 1);
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
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology4, locale5, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket8.getChronology();
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
        java.util.Locale locale34 = dateTimeParserBucket33.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(0L, chronology9, locale34, (java.lang.Integer) 10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((-11L), chronology1, locale34, (java.lang.Integer) 35, 97);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        int int10 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
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
        java.lang.Integer int24 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setOffset((-1));
        long long29 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long9 = dateTimeParserBucket3.computeMillis(false);
        int int10 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        java.lang.Class<?> wildcardClass10 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        int int11 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        java.lang.Class<?> wildcardClass14 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
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
        java.util.Locale locale20 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        long long9 = dateTimeParserBucket6.computeMillis();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket6.saveField(dateTimeField10, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(25L, chronology13, locale14);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(obj14);
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        java.util.Locale locale8 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long12 = dateTimeParserBucket3.computeMillis(true);
        int int13 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        long long14 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket3.getZone();
        java.lang.Object obj16 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale9 = dateTimeParserBucket5.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        java.lang.Class<?> wildcardClass11 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
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
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = dateTimeParserBucket3.computeMillis();
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType13, 52);
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
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        java.lang.Object obj8 = dateTimeParserBucket3.saveState();
        long long10 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
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
        dateTimeParserBucket3.setOffset((java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
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
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket3.saveField(dateTimeField15, 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long7 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long10 = dateTimeParserBucket3.computeMillis(false, "");
        dateTimeParserBucket3.setOffset((-1));
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) '#');
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, 100);
        org.joda.time.Chronology chronology16 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        long long12 = dateTimeParserBucket3.computeMillis(false, "");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        java.lang.Object obj15 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType16, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        java.lang.Integer int29 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNull(int29);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        long long12 = dateTimeParserBucket3.computeMillis(false, "");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        java.lang.Object obj15 = dateTimeParserBucket3.saveState();
        long long18 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj19 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology20 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        int int24 = dateTimeParserBucket18.getOffset();
        long long25 = dateTimeParserBucket18.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology4, locale5);
        long long8 = dateTimeParserBucket6.computeMillis(false);
        dateTimeParserBucket6.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology11, locale12, (java.lang.Integer) 100);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology16, locale17, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket20.setOffset((int) 'a');
        long long23 = dateTimeParserBucket20.computeMillis();
        long long24 = dateTimeParserBucket20.computeMillis();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale27, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket30.setOffset((int) 'a');
        long long34 = dateTimeParserBucket30.computeMillis(true);
        java.util.Locale locale35 = dateTimeParserBucket30.getLocale();
        dateTimeParserBucket30.setPivotYear((java.lang.Integer) 1);
        boolean boolean38 = dateTimeParserBucket20.restoreState((java.lang.Object) 1);
        java.util.Locale locale39 = dateTimeParserBucket20.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology11, locale39);
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology42, locale43);
        long long47 = dateTimeParserBucket44.computeMillis(false, "hi!");
        dateTimeParserBucket44.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int50 = dateTimeParserBucket44.getOffsetInteger();
        java.util.Locale locale51 = dateTimeParserBucket44.getLocale();
        long long54 = dateTimeParserBucket44.computeMillis(false, "hi!");
        java.util.Locale locale55 = dateTimeParserBucket44.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((-52L), chronology11, locale55, (java.lang.Integer) 97);
        dateTimeParserBucket57.setOffset((java.lang.Integer) (-1));
        int int60 = dateTimeParserBucket57.getOffset();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-97L) + "'", long24 == (-97L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-97L) + "'", long34 == (-97L));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket3.getZone();
        java.lang.Integer int13 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology26, locale27);
        long long31 = dateTimeParserBucket28.computeMillis(false, "hi!");
        dateTimeParserBucket28.setOffset(0);
        long long34 = dateTimeParserBucket28.computeMillis();
        int int35 = dateTimeParserBucket28.getOffset();
        java.lang.Class<?> wildcardClass36 = dateTimeParserBucket28.getClass();
        boolean boolean37 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket28);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + (-1L) + "'", long31 == (-1L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        dateTimeParserBucket3.setZone(dateTimeZone5);
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
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
        org.joda.time.DateTimeZone dateTimeZone61 = dateTimeParserBucket60.getZone();
        org.joda.time.DateTimeZone dateTimeZone62 = dateTimeParserBucket60.getZone();
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
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(dateTimeZone62);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
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
        long long26 = dateTimeParserBucket24.computeMillis(false);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 97L + "'", long26 == 97L);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        java.lang.Object obj9 = dateTimeParserBucket5.saveState();
        int int10 = dateTimeParserBucket5.getOffset();
        java.lang.Integer int11 = dateTimeParserBucket5.getOffsetInteger();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        long long8 = dateTimeParserBucket3.computeMillis();
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        long long12 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Integer int13 = dateTimeParserBucket3.getOffsetInteger();
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        long long13 = dateTimeParserBucket5.computeMillis(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        long long8 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((int) (short) -1);
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        long long15 = dateTimeParserBucket3.computeMillis(true, "");
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology46, locale47);
        long long51 = dateTimeParserBucket48.computeMillis(false, "hi!");
        dateTimeParserBucket48.setOffset(0);
        java.lang.Object obj54 = dateTimeParserBucket48.saveState();
        long long56 = dateTimeParserBucket48.computeMillis(false);
        org.joda.time.Chronology chronology57 = dateTimeParserBucket48.getChronology();
        org.joda.time.Chronology chronology59 = null;
        java.util.Locale locale60 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket63 = new org.joda.time.format.DateTimeParserBucket(0L, chronology59, locale60, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket63.setOffset((java.lang.Integer) 0);
        java.util.Locale locale66 = dateTimeParserBucket63.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket(32L, chronology57, locale66, (java.lang.Integer) 52, (int) (short) 100);
        java.util.Locale locale70 = dateTimeParserBucket69.getLocale();
        boolean boolean71 = dateTimeParserBucket41.restoreState((java.lang.Object) locale70);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-1L) + "'", long51 == (-1L));
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale70);
        org.junit.Assert.assertEquals(locale70.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Integer int11 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeField dateTimeField12 = null;
        dateTimeParserBucket3.saveField(dateTimeField12, 0);
        java.lang.Object obj15 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket4.getZone();
        long long12 = dateTimeParserBucket4.computeMillis(true, "");
        int int13 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology14 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology16, locale17);
        long long21 = dateTimeParserBucket18.computeMillis(false, "hi!");
        dateTimeParserBucket18.setOffset(0);
        java.lang.Integer int24 = dateTimeParserBucket18.getPivotYear();
        java.lang.Object obj25 = dateTimeParserBucket18.saveState();
        java.util.Locale locale26 = dateTimeParserBucket18.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale26);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeParserBucket27.getZone();
        int int29 = dateTimeParserBucket27.getOffset();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
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
        long long26 = dateTimeParserBucket3.computeMillis(true, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 35);
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        long long13 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Class<?> wildcardClass14 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long8 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        long long12 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        int int15 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        int int16 = dateTimeParserBucket15.getOffset();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        dateTimeParserBucket15.setZone(dateTimeZone17);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology20, locale21);
        long long25 = dateTimeParserBucket22.computeMillis(false, "hi!");
        java.lang.Object obj26 = dateTimeParserBucket22.saveState();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket22.getZone();
        dateTimeParserBucket15.setZone(dateTimeZone27);
        dateTimeParserBucket3.setZone(dateTimeZone27);
        java.util.Locale locale30 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
            long long16 = dateTimeParserBucket5.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
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
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
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
        java.lang.Object obj27 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(obj27);
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        dateTimeParserBucket41.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket41.setOffset((java.lang.Integer) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket41.saveField(dateTimeFieldType52, (int) '4');
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
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(chronology47);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket3.saveField(dateTimeField15, (int) (short) 10);
        org.joda.time.Chronology chronology18 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
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
        long long17 = dateTimeParserBucket13.computeMillis();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        dateTimeParserBucket4.setOffset((int) (byte) 100);
        long long7 = dateTimeParserBucket4.computeMillis();
        org.joda.time.Chronology chronology8 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology11, locale12);
        long long16 = dateTimeParserBucket13.computeMillis(false, "hi!");
        dateTimeParserBucket13.setOffset(0);
        java.lang.Object obj19 = dateTimeParserBucket13.saveState();
        long long21 = dateTimeParserBucket13.computeMillis(false);
        org.joda.time.Chronology chronology22 = dateTimeParserBucket13.getChronology();
        org.joda.time.Chronology chronology24 = null;
        java.util.Locale locale25 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket(0L, chronology24, locale25, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket28.setOffset((java.lang.Integer) 0);
        java.util.Locale locale31 = dateTimeParserBucket28.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(32L, chronology22, locale31, (java.lang.Integer) 52, (int) (short) 100);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((-11L), chronology8, locale31, (java.lang.Integer) 32, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-101L) + "'", long7 == (-101L));
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (byte) -1);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeParserBucket5.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        long long11 = dateTimeParserBucket5.computeMillis(false, "hi!");
        int int12 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        long long15 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-100L) + "'", long15 == (-100L));
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long12 = dateTimeParserBucket3.computeMillis(false);
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField8 = null;
        dateTimeParserBucket3.saveField(dateTimeField8, (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeParserBucket3.computeMillis(true, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
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
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket3.saveField(dateTimeField15, (int) (short) 10);
        java.util.Locale locale18 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale23, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket26.setOffset((int) 'a');
        dateTimeParserBucket26.setOffset((int) (byte) 100);
        int int31 = dateTimeParserBucket26.getOffset();
        java.util.Locale locale32 = dateTimeParserBucket26.getLocale();
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology34, locale35);
        long long39 = dateTimeParserBucket36.computeMillis(false, "hi!");
        dateTimeParserBucket36.setOffset(0);
        java.lang.Object obj42 = dateTimeParserBucket36.saveState();
        long long44 = dateTimeParserBucket36.computeMillis(false);
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology46, locale47);
        int int49 = dateTimeParserBucket48.getOffset();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        dateTimeParserBucket48.setZone(dateTimeZone50);
        org.joda.time.Chronology chronology53 = null;
        java.util.Locale locale54 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology53, locale54);
        long long58 = dateTimeParserBucket55.computeMillis(false, "hi!");
        java.lang.Object obj59 = dateTimeParserBucket55.saveState();
        org.joda.time.DateTimeZone dateTimeZone60 = dateTimeParserBucket55.getZone();
        dateTimeParserBucket48.setZone(dateTimeZone60);
        dateTimeParserBucket36.setZone(dateTimeZone60);
        boolean boolean63 = dateTimeParserBucket26.restoreState((java.lang.Object) dateTimeZone60);
        long long65 = dateTimeParserBucket26.computeMillis(false);
        java.util.Locale locale66 = dateTimeParserBucket26.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType19, "hi!", locale66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + long58 + "' != '" + (-1L) + "'", long58 == (-1L));
        org.junit.Assert.assertNotNull(obj59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + (-100L) + "'", long65 == (-100L));
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "en_US");
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
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
        int int44 = dateTimeParserBucket41.getOffset();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        long long12 = dateTimeParserBucket5.computeMillis(false, "");
        long long13 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale4, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket7.setOffset((int) 'a');
        long long10 = dateTimeParserBucket7.computeMillis();
        long long11 = dateTimeParserBucket7.computeMillis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        long long21 = dateTimeParserBucket17.computeMillis(true);
        java.util.Locale locale22 = dateTimeParserBucket17.getLocale();
        dateTimeParserBucket17.setPivotYear((java.lang.Integer) 1);
        boolean boolean25 = dateTimeParserBucket7.restoreState((java.lang.Object) 1);
        java.util.Locale locale26 = dateTimeParserBucket7.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology1, locale26);
        long long29 = dateTimeParserBucket27.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-97L) + "'", long11 == (-97L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-97L) + "'", long21 == (-97L));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 97L + "'", long29 == 97L);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket3.saveField(dateTimeField5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeParserBucket3.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
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
        // The following exception was thrown during execution in test generation
        try {
            long long31 = dateTimeParserBucket3.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        java.lang.Integer int7 = dateTimeParserBucket5.getOffsetInteger();
        dateTimeParserBucket5.setOffset((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket5.saveField(dateTimeField10, 52);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        long long14 = dateTimeParserBucket3.computeMillis(true, "");
        long long16 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset(97);
        long long19 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setOffset(10);
        java.lang.Object obj22 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType23, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-98L) + "'", long19 == (-98L));
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        int int9 = dateTimeParserBucket3.getOffset();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
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
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        long long14 = dateTimeParserBucket5.computeMillis(true, "");
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket5.getZone();
        long long18 = dateTimeParserBucket5.computeMillis(false, "hi!");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-100L) + "'", long14 == (-100L));
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-100L) + "'", long18 == (-100L));
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long9 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        java.lang.Object obj11 = null;
        boolean boolean12 = dateTimeParserBucket3.restoreState(obj11);
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        java.lang.Object obj8 = dateTimeParserBucket4.saveState();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket4.getZone();
        long long12 = dateTimeParserBucket4.computeMillis(true, "");
        int int13 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology14 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology16, locale17);
        long long21 = dateTimeParserBucket18.computeMillis(false, "hi!");
        dateTimeParserBucket18.setOffset(0);
        java.lang.Integer int24 = dateTimeParserBucket18.getPivotYear();
        java.lang.Object obj25 = dateTimeParserBucket18.saveState();
        java.util.Locale locale26 = dateTimeParserBucket18.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale26);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeParserBucket27.getZone();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeParserBucket27.getZone();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long14 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        long long12 = dateTimeParserBucket3.computeMillis(true);
        java.lang.Class<?> wildcardClass13 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        long long21 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        long long9 = dateTimeParserBucket3.computeMillis();
        long long11 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        java.lang.Integer int14 = dateTimeParserBucket3.getPivotYear();
        long long16 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        int int19 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
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
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket3.getZone();
        java.lang.Integer int18 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        int int11 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        long long17 = dateTimeParserBucket3.computeMillis(true, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-11L) + "'", long17 == (-11L));
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
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
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket5.saveField(dateTimeField11, (int) '#');
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.util.Locale locale14 = dateTimeParserBucket3.getLocale();
        long long17 = dateTimeParserBucket3.computeMillis(false, "");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long16 = dateTimeParserBucket3.computeMillis(true, "hi!");
        java.util.Locale locale17 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket(0L, chronology3, locale4, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket7.setOffset((int) 'a');
        long long10 = dateTimeParserBucket7.computeMillis();
        long long11 = dateTimeParserBucket7.computeMillis();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        long long21 = dateTimeParserBucket17.computeMillis(true);
        java.util.Locale locale22 = dateTimeParserBucket17.getLocale();
        dateTimeParserBucket17.setPivotYear((java.lang.Integer) 1);
        boolean boolean25 = dateTimeParserBucket7.restoreState((java.lang.Object) 1);
        java.util.Locale locale26 = dateTimeParserBucket7.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology1, locale26);
        java.lang.Integer int28 = dateTimeParserBucket27.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-97L) + "'", long11 == (-97L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-97L) + "'", long21 == (-97L));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNull(int28);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setOffset((int) (short) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType14, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
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
        int int16 = dateTimeParserBucket3.getOffset();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket41.saveField(dateTimeFieldType42, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        int int16 = dateTimeParserBucket5.getOffset();
        long long18 = dateTimeParserBucket5.computeMillis(true);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-97L) + "'", long15 == (-97L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-97L) + "'", long18 == (-97L));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long9 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        int int11 = dateTimeParserBucket3.getOffset();
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        dateTimeParserBucket41.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket41.setOffset((-1));
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
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        java.util.Locale locale63 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket60.saveField(dateTimeFieldType61, "hi!", locale63);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        int int13 = dateTimeParserBucket3.getOffset();
        long long16 = dateTimeParserBucket3.computeMillis(true, "");
        java.lang.Integer int17 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(int17);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        // The following exception was thrown during execution in test generation
        try {
            long long39 = dateTimeParserBucket34.computeMillis(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        dateTimeParserBucket4.setOffset(0);
        java.util.Locale locale10 = dateTimeParserBucket4.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket4.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket4.getZone();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket4.saveField(dateTimeField15, (int) ' ');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket24 = new org.joda.time.format.DateTimeParserBucket(0L, chronology20, locale21, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket24.setOffset((int) 'a');
        long long28 = dateTimeParserBucket24.computeMillis(true);
        java.util.Locale locale29 = dateTimeParserBucket24.getLocale();
        dateTimeParserBucket24.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology33 = null;
        java.util.Locale locale34 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology33, locale34);
        org.joda.time.DateTimeField dateTimeField36 = null;
        dateTimeParserBucket35.saveField(dateTimeField36, (int) (byte) 1);
        int int39 = dateTimeParserBucket35.getOffset();
        dateTimeParserBucket35.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeParserBucket35.getZone();
        dateTimeParserBucket24.setZone(dateTimeZone42);
        java.util.Locale locale44 = dateTimeParserBucket24.getLocale();
        java.util.Locale locale45 = dateTimeParserBucket24.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket46 = new org.joda.time.format.DateTimeParserBucket((-33L), chronology18, locale45);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-97L) + "'", long28 == (-97L));
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        java.util.Locale locale8 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology11 = dateTimeParserBucket3.getChronology();
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology13, locale14);
        long long17 = dateTimeParserBucket15.computeMillis(false);
        dateTimeParserBucket15.setOffset((int) (byte) 100);
        java.lang.Integer int20 = dateTimeParserBucket15.getPivotYear();
        java.lang.Integer int21 = dateTimeParserBucket15.getPivotYear();
        boolean boolean22 = dateTimeParserBucket3.restoreState((java.lang.Object) dateTimeParserBucket15);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(int21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
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
        dateTimeParserBucket5.setOffset(0);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
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
        int int47 = dateTimeParserBucket41.getOffset();
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
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket6.getZone();
        long long13 = dateTimeParserBucket6.computeMillis(false, "");
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale16);
        long long20 = dateTimeParserBucket17.computeMillis(false, "hi!");
        dateTimeParserBucket17.setOffset(0);
        java.util.Locale locale23 = dateTimeParserBucket17.getLocale();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket17.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeParserBucket17.getZone();
        dateTimeParserBucket17.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField28 = null;
        dateTimeParserBucket17.saveField(dateTimeField28, (int) ' ');
        boolean boolean31 = dateTimeParserBucket6.restoreState((java.lang.Object) ' ');
        dateTimeParserBucket6.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket6.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket6.setOffset((java.lang.Integer) 10);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology41 = null;
        java.util.Locale locale42 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket43 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology41, locale42);
        long long46 = dateTimeParserBucket43.computeMillis(false, "hi!");
        dateTimeParserBucket43.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology49 = dateTimeParserBucket43.getChronology();
        org.joda.time.Chronology chronology51 = null;
        java.util.Locale locale52 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology51, locale52);
        long long56 = dateTimeParserBucket53.computeMillis(false, "hi!");
        int int57 = dateTimeParserBucket53.getOffset();
        dateTimeParserBucket53.setOffset((int) (short) 10);
        java.util.Locale locale60 = dateTimeParserBucket53.getLocale();
        java.lang.Integer int61 = dateTimeParserBucket53.getPivotYear();
        java.util.Locale locale62 = dateTimeParserBucket53.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket64 = new org.joda.time.format.DateTimeParserBucket(1L, chronology49, locale62, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((long) (short) 100, chronology38, locale62, (java.lang.Integer) 0, 97);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + (-1L) + "'", long56 == (-1L));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(locale60);
        org.junit.Assert.assertEquals(locale60.toString(), "en_US");
        org.junit.Assert.assertNull(int61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "en_US");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Integer int11 = dateTimeParserBucket3.getPivotYear();
        long long12 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
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
        long long18 = dateTimeParserBucket5.computeMillis(true, "hi!");
        long long21 = dateTimeParserBucket5.computeMillis(true, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-97L) + "'", long15 == (-97L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-97L) + "'", long18 == (-97L));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-97L) + "'", long21 == (-97L));
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        java.util.Locale locale8 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeParserBucket3.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_US");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        long long11 = dateTimeParserBucket3.computeMillis(true);
        long long12 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-101L) + "'", long11 == (-101L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-101L) + "'", long12 == (-101L));
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        long long14 = dateTimeParserBucket3.computeMillis(true, "");
        long long16 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset(97);
        org.joda.time.DateTimeField dateTimeField19 = null;
        dateTimeParserBucket3.saveField(dateTimeField19, (int) '4');
        dateTimeParserBucket3.setOffset(32);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
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
        java.lang.Integer int49 = dateTimeParserBucket48.getPivotYear();
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
        org.junit.Assert.assertNull(int49);
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        long long9 = dateTimeParserBucket3.computeMillis();
        long long11 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        java.lang.Integer int14 = dateTimeParserBucket3.getPivotYear();
        long long16 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        java.lang.Integer int13 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        dateTimeParserBucket4.setOffset(0);
        java.util.Locale locale10 = dateTimeParserBucket4.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket4.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket4.getZone();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket4.saveField(dateTimeField15, (int) ' ');
        org.joda.time.Chronology chronology18 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology20, locale21);
        long long25 = dateTimeParserBucket22.computeMillis(false, "hi!");
        java.lang.Object obj26 = dateTimeParserBucket22.saveState();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket22.getZone();
        java.lang.Object obj28 = dateTimeParserBucket22.saveState();
        org.joda.time.DateTimeZone dateTimeZone29 = dateTimeParserBucket22.getZone();
        java.util.Locale locale30 = dateTimeParserBucket22.getLocale();
        java.util.Locale locale31 = dateTimeParserBucket22.getLocale();
        java.util.Locale locale32 = dateTimeParserBucket22.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(97L, chronology18, locale32, (java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        long long8 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((int) (short) -1);
        java.util.Locale locale12 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
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
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setOffset((int) (short) -1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
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
        int int16 = dateTimeParserBucket15.getOffset();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        dateTimeParserBucket15.setZone(dateTimeZone17);
        org.joda.time.Chronology chronology20 = null;
        java.util.Locale locale21 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology20, locale21);
        long long25 = dateTimeParserBucket22.computeMillis(false, "hi!");
        java.lang.Object obj26 = dateTimeParserBucket22.saveState();
        org.joda.time.DateTimeZone dateTimeZone27 = dateTimeParserBucket22.getZone();
        dateTimeParserBucket15.setZone(dateTimeZone27);
        dateTimeParserBucket3.setZone(dateTimeZone27);
        int int30 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology31 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(chronology31);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        int int10 = dateTimeParserBucket5.getOffset();
        long long13 = dateTimeParserBucket5.computeMillis(true, "");
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
        long long19 = dateTimeParserBucket5.computeMillis(true);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int10 = dateTimeParserBucket3.getOffsetInteger();
        long long13 = dateTimeParserBucket3.computeMillis(true, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        org.joda.time.DateTimeField dateTimeField28 = null;
        dateTimeParserBucket26.saveField(dateTimeField28, (int) (byte) -1);
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
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        long long15 = dateTimeParserBucket3.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        int int11 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 35);
        int int14 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Integer int11 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
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
        int int24 = dateTimeParserBucket23.getOffset();
        int int25 = dateTimeParserBucket23.getOffset();
        org.joda.time.Chronology chronology26 = dateTimeParserBucket23.getChronology();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj8 = dateTimeParserBucket3.saveState();
        int int9 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        long long11 = dateTimeParserBucket5.computeMillis(false, "hi!");
        int int12 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        org.joda.time.Chronology chronology15 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
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
        java.lang.Object obj25 = dateTimeParserBucket3.saveState();
        java.lang.Object obj26 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(obj25);
        org.junit.Assert.assertNotNull(obj26);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
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
        long long34 = dateTimeParserBucket5.computeMillis(true);
        dateTimeParserBucket5.setOffset(10);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-97L) + "'", long34 == (-97L));
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        java.lang.Object obj24 = dateTimeParserBucket18.saveState();
        org.joda.time.Chronology chronology25 = dateTimeParserBucket18.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.util.Locale locale14 = dateTimeParserBucket3.getLocale();
        long long17 = dateTimeParserBucket3.computeMillis(false, "");
        long long18 = dateTimeParserBucket3.computeMillis();
        long long19 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeField dateTimeField20 = null;
        dateTimeParserBucket3.saveField(dateTimeField20, 97);
        java.lang.Object obj23 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
        org.junit.Assert.assertNotNull(obj23);
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        int int4 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket3.saveField(dateTimeField5, (int) (byte) -1);
        java.lang.Integer int8 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setOffset((int) '4');
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        long long13 = dateTimeParserBucket5.computeMillis(true, "");
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNull(dateTimeZone14);
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        dateTimeParserBucket5.setOffset(97);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
        long long37 = dateTimeParserBucket5.computeMillis(true);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket5.saveField(dateTimeField15, (int) '4');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        int int8 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket(0L, chronology13, locale14, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket17.setOffset((int) 'a');
        org.joda.time.Chronology chronology20 = dateTimeParserBucket17.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = null;
        dateTimeParserBucket17.saveField(dateTimeField21, 0);
        org.joda.time.Chronology chronology24 = dateTimeParserBucket17.getChronology();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale27, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket30.setOffset((int) 'a');
        org.joda.time.Chronology chronology33 = dateTimeParserBucket30.getChronology();
        java.util.Locale locale34 = dateTimeParserBucket30.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology24, locale34);
        boolean boolean36 = dateTimeParserBucket3.restoreState((java.lang.Object) 97);
        int int37 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj38 = dateTimeParserBucket3.saveState();
        // The following exception was thrown during execution in test generation
        try {
            long long39 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(obj38);
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket3.saveField(dateTimeField5, (int) 'a');
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setOffset((int) '#');
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType32, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
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
        dateTimeParserBucket3.setOffset((int) (byte) -1);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType19, (int) (byte) 100);
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
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj12 = dateTimeParserBucket5.saveState();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        long long16 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-97L) + "'", long16 == (-97L));
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        java.lang.Integer int13 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNull(int13);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Integer int9 = dateTimeParserBucket3.getPivotYear();
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        int int11 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType12, "hi!", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
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
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 35);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        org.joda.time.Chronology chronology48 = dateTimeParserBucket41.getChronology();
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
        org.junit.Assert.assertNotNull(chronology48);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        long long8 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        int int10 = dateTimeParserBucket3.getOffset();
        long long13 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
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
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket22.setOffset((int) 'a');
        long long25 = dateTimeParserBucket22.computeMillis();
        long long26 = dateTimeParserBucket22.computeMillis();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        long long36 = dateTimeParserBucket32.computeMillis(true);
        java.util.Locale locale37 = dateTimeParserBucket32.getLocale();
        dateTimeParserBucket32.setPivotYear((java.lang.Integer) 1);
        boolean boolean40 = dateTimeParserBucket22.restoreState((java.lang.Object) 1);
        java.util.Locale locale41 = dateTimeParserBucket22.getLocale();
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeParserBucket22.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone42);
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-97L) + "'", long25 == (-97L));
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-97L) + "'", long26 == (-97L));
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + (-97L) + "'", long36 == (-97L));
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone42);
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long6 = dateTimeParserBucket4.computeMillis(false);
        dateTimeParserBucket4.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology9 = dateTimeParserBucket4.getChronology();
        java.util.Locale locale10 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology9, locale10, (java.lang.Integer) 100);
        dateTimeParserBucket12.setOffset((java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
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
            long long16 = dateTimeParserBucket3.computeMillis(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        java.util.Locale locale11 = dateTimeParserBucket5.getLocale();
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket5.getZone();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 32);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        long long9 = dateTimeParserBucket3.computeMillis();
        long long10 = dateTimeParserBucket3.computeMillis();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        long long15 = dateTimeParserBucket3.computeMillis(true, "");
        int int16 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((int) '4');
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, (int) (short) 0);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeParserBucket3.computeMillis(false);
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology3, locale4);
        org.joda.time.DateTimeField dateTimeField6 = null;
        dateTimeParserBucket5.saveField(dateTimeField6, (int) (byte) 1);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 10);
        java.util.Locale locale11 = dateTimeParserBucket5.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) 35, chronology1, locale11, (java.lang.Integer) 0, (int) (byte) 0);
        org.joda.time.DateTimeField dateTimeField15 = null;
        dateTimeParserBucket14.saveField(dateTimeField15, (int) (byte) -1);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
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
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        long long17 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long8 = dateTimeParserBucket3.computeMillis();
        long long10 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.util.Locale locale11 = dateTimeParserBucket3.getLocale();
        java.lang.Class<?> wildcardClass12 = locale11.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket(0L, chronology4, locale5, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        dateTimeParserBucket8.setZone(dateTimeZone9);
        int int11 = dateTimeParserBucket8.getOffset();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket8.getChronology();
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale15, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket18.setOffset((int) 'a');
        org.joda.time.Chronology chronology21 = dateTimeParserBucket18.getChronology();
        java.util.Locale locale22 = dateTimeParserBucket18.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology12, locale22, (java.lang.Integer) 10, (int) '4');
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        dateTimeParserBucket32.setZone(dateTimeZone33);
        int int35 = dateTimeParserBucket32.getOffset();
        org.joda.time.Chronology chronology36 = dateTimeParserBucket32.getChronology();
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket42 = new org.joda.time.format.DateTimeParserBucket(0L, chronology38, locale39, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket42.setOffset((int) 'a');
        org.joda.time.Chronology chronology45 = dateTimeParserBucket42.getChronology();
        java.util.Locale locale46 = dateTimeParserBucket42.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology36, locale46, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket52 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology12, locale46, (java.lang.Integer) 97, (int) (short) 1);
        org.joda.time.Chronology chronology55 = null;
        java.util.Locale locale56 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket59 = new org.joda.time.format.DateTimeParserBucket(0L, chronology55, locale56, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        dateTimeParserBucket59.setZone(dateTimeZone60);
        int int62 = dateTimeParserBucket59.getOffset();
        org.joda.time.Chronology chronology63 = dateTimeParserBucket59.getChronology();
        org.joda.time.Chronology chronology65 = null;
        java.util.Locale locale66 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket(0L, chronology65, locale66, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket69.setOffset((int) 'a');
        dateTimeParserBucket69.setOffset((int) (byte) 100);
        int int74 = dateTimeParserBucket69.getOffset();
        java.util.Locale locale75 = dateTimeParserBucket69.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket76 = new org.joda.time.format.DateTimeParserBucket(0L, chronology63, locale75);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket79 = new org.joda.time.format.DateTimeParserBucket((-2L), chronology12, locale75, (java.lang.Integer) 32, (int) ' ');
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 100 + "'", int74 == 100);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "en_US");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(0L, chronology44, locale45, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket48.setOffset((int) 'a');
        org.joda.time.Chronology chronology51 = dateTimeParserBucket48.getChronology();
        long long52 = dateTimeParserBucket48.computeMillis();
        dateTimeParserBucket48.setOffset((java.lang.Integer) (-1));
        java.lang.Object obj55 = null;
        boolean boolean56 = dateTimeParserBucket48.restoreState(obj55);
        dateTimeParserBucket48.setOffset(10);
        java.util.Locale locale59 = dateTimeParserBucket48.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((-52L), chronology16, locale59);
        long long61 = dateTimeParserBucket60.computeMillis();
        java.lang.Integer int62 = dateTimeParserBucket60.getPivotYear();
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-97L) + "'", long11 == (-97L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-97L) + "'", long52 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-52L) + "'", long61 == (-52L));
        org.junit.Assert.assertNull(int62);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        long long13 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        int int12 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket3.getChronology();
        java.lang.Object obj14 = dateTimeParserBucket3.saveState();
        long long15 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
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
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket5.saveField(dateTimeField16, (int) (byte) -1);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 52);
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket(0L, chronology22, locale23, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket26.setOffset((int) 'a');
        dateTimeParserBucket26.setOffset((int) (byte) 100);
        java.lang.Object obj31 = dateTimeParserBucket26.saveState();
        java.util.Locale locale32 = dateTimeParserBucket26.getLocale();
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeParserBucket26.getZone();
        dateTimeParserBucket5.setZone(dateTimeZone33);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-10L) + "'", long15 == (-10L));
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(true, "hi!");
        java.util.Locale locale7 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        java.lang.Object obj11 = dateTimeParserBucket5.saveState();
        long long13 = dateTimeParserBucket5.computeMillis(false);
        int int14 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale9 = dateTimeParserBucket5.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        java.lang.Object obj11 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(obj11);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
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
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket3.getZone();
        java.lang.Object obj17 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(obj17);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        java.lang.Object obj8 = dateTimeParserBucket3.saveState();
        long long10 = dateTimeParserBucket3.computeMillis(true);
        long long12 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (byte) 1);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        dateTimeParserBucket3.setOffset(10);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-101L) + "'", long12 == (-101L));
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
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
        int int23 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((int) (short) 100);
        dateTimeParserBucket3.setOffset((int) (short) -1);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long12 = dateTimeParserBucket3.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        java.lang.Object obj8 = dateTimeParserBucket3.saveState();
        long long10 = dateTimeParserBucket3.computeMillis(true);
        long long12 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (byte) 1);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-101L) + "'", long12 == (-101L));
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
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
        dateTimeParserBucket3.setOffset((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket3.setOffset((int) (short) 10);
        dateTimeParserBucket3.setOffset((int) (short) 0);
        int int15 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology7 = dateTimeParserBucket6.getChronology();
        dateTimeParserBucket6.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology10, locale11);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket12.getZone();
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
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
        java.lang.Integer int24 = dateTimeParserBucket3.getPivotYear();
        long long26 = dateTimeParserBucket3.computeMillis(false);
        long long29 = dateTimeParserBucket3.computeMillis(true, "hi!");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-1L) + "'", long26 == (-1L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-1L) + "'", long29 == (-1L));
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int10 = dateTimeParserBucket4.getOffsetInteger();
        java.util.Locale locale11 = dateTimeParserBucket4.getLocale();
        java.lang.Integer int12 = dateTimeParserBucket4.getOffsetInteger();
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket4.saveField(dateTimeField13, (int) (byte) 100);
        int int16 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology17 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(0L, chronology21, locale22, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket25.setOffset((int) 'a');
        org.joda.time.Chronology chronology28 = dateTimeParserBucket25.getChronology();
        long long29 = dateTimeParserBucket25.computeMillis();
        dateTimeParserBucket25.setOffset((java.lang.Integer) (-1));
        dateTimeParserBucket25.setOffset((java.lang.Integer) 97);
        java.util.Locale locale34 = dateTimeParserBucket25.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 0, chronology19, locale34, (java.lang.Integer) 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket39 = new org.joda.time.format.DateTimeParserBucket((long) 52, chronology17, locale34, (java.lang.Integer) 97, (int) (byte) 1);
        java.lang.Class<?> wildcardClass40 = dateTimeParserBucket39.getClass();
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-97L) + "'", long29 == (-97L));
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket3.getChronology();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        java.lang.Object obj13 = null;
        boolean boolean14 = dateTimeParserBucket3.restoreState(obj13);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        java.util.Locale locale11 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        java.lang.Class<?> wildcardClass27 = dateTimeParserBucket23.getClass();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        java.lang.Integer int11 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket5.saveField(dateTimeField16, (int) (byte) -1);
        org.joda.time.DateTimeField dateTimeField19 = null;
        dateTimeParserBucket5.saveField(dateTimeField19, 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-10L) + "'", long15 == (-10L));
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        long long8 = dateTimeParserBucket3.computeMillis();
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.lang.Integer int10 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset(10);
        dateTimeParserBucket3.setOffset((int) (short) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket3.setOffset(35);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        org.joda.time.DateTimeZone dateTimeZone61 = dateTimeParserBucket60.getZone();
        org.joda.time.Chronology chronology62 = dateTimeParserBucket60.getChronology();
        dateTimeParserBucket60.setOffset((int) (byte) -1);
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
        org.junit.Assert.assertNotNull(dateTimeZone61);
        org.junit.Assert.assertNotNull(chronology62);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
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
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(int24);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket3.saveField(dateTimeField5, (int) 'a');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = null;
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
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType8, "", locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
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
        long long17 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-101L) + "'", long16 == (-101L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-101L) + "'", long17 == (-101L));
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        long long12 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket5.getZone();
        long long11 = dateTimeParserBucket5.computeMillis(false, "");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
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
        java.util.Locale locale19 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int10 = dateTimeParserBucket3.getOffsetInteger();
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 35);
        java.lang.Integer int14 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNull(int14);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        long long9 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology11 = null;
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology11, locale12);
        long long16 = dateTimeParserBucket13.computeMillis(false, "hi!");
        dateTimeParserBucket13.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int19 = dateTimeParserBucket13.getOffsetInteger();
        java.util.Locale locale20 = dateTimeParserBucket13.getLocale();
        dateTimeParserBucket13.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTimeParserBucket13.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone23);
        dateTimeParserBucket3.setOffset((int) 'a');
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long8 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        long long12 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        long long16 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-101L) + "'", long16 == (-101L));
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 52);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology15, locale16);
        org.joda.time.DateTimeField dateTimeField18 = null;
        dateTimeParserBucket17.saveField(dateTimeField18, (int) (byte) 1);
        dateTimeParserBucket17.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket17.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket17.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField27 = null;
        dateTimeParserBucket17.saveField(dateTimeField27, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField30 = null;
        dateTimeParserBucket17.saveField(dateTimeField30, (int) '#');
        java.util.Locale locale33 = dateTimeParserBucket17.getLocale();
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeParserBucket17.getZone();
        java.lang.Object obj35 = dateTimeParserBucket17.saveState();
        java.util.Locale locale36 = dateTimeParserBucket17.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType12, "", locale36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_US");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long8 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        long long12 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        java.util.Locale locale15 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset((int) (byte) -1);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology16, locale17);
        org.joda.time.DateTimeField dateTimeField19 = null;
        dateTimeParserBucket18.saveField(dateTimeField19, (int) (byte) 1);
        dateTimeParserBucket18.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket18.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket18.setOffset((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField28 = null;
        dateTimeParserBucket18.saveField(dateTimeField28, (int) (short) 100);
        org.joda.time.DateTimeField dateTimeField31 = null;
        dateTimeParserBucket18.saveField(dateTimeField31, (int) '#');
        java.util.Locale locale34 = dateTimeParserBucket18.getLocale();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket18.getZone();
        java.lang.Object obj36 = dateTimeParserBucket18.saveState();
        boolean boolean37 = dateTimeParserBucket3.restoreState(obj36);
        org.joda.time.Chronology chronology38 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(chronology38);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        org.joda.time.DateTimeZone dateTimeZone45 = dateTimeParserBucket5.getZone();
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
        org.junit.Assert.assertNotNull(dateTimeZone45);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        long long8 = dateTimeParserBucket3.computeMillis(true, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long8 = dateTimeParserBucket5.computeMillis();
        long long9 = dateTimeParserBucket5.computeMillis();
        int int10 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setOffset(10);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        long long12 = dateTimeParserBucket3.computeMillis(false, "");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        java.lang.Object obj15 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology17, locale18);
        long long22 = dateTimeParserBucket19.computeMillis(false, "hi!");
        dateTimeParserBucket19.setOffset(0);
        java.util.Locale locale25 = dateTimeParserBucket19.getLocale();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket19.getZone();
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket(0L, chronology28, locale29, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket32.setOffset((int) 'a');
        dateTimeParserBucket32.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = dateTimeParserBucket32.getZone();
        dateTimeParserBucket19.setZone(dateTimeZone37);
        dateTimeParserBucket3.setZone(dateTimeZone37);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTimeZone37);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
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
        long long25 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.DateTimeField dateTimeField26 = null;
        dateTimeParserBucket3.saveField(dateTimeField26, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-1L) + "'", long25 == (-1L));
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        long long17 = dateTimeParserBucket3.computeMillis();
        java.lang.Integer int18 = dateTimeParserBucket3.getPivotYear();
        long long21 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.DateTimeField dateTimeField22 = null;
        dateTimeParserBucket3.saveField(dateTimeField22, 10);
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale27, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket30.setOffset((int) 'a');
        long long33 = dateTimeParserBucket30.computeMillis();
        long long34 = dateTimeParserBucket30.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket30.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone35);
        java.lang.Integer int37 = dateTimeParserBucket3.getPivotYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType38, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + (-97L) + "'", long33 == (-97L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-97L) + "'", long34 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNull(int37);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long17 = dateTimeParserBucket3.computeMillis(true);
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        dateTimeParserBucket5.setOffset((int) (short) 1);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 52);
        java.lang.Object obj49 = dateTimeParserBucket5.saveState();
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
        org.junit.Assert.assertNotNull(obj49);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        java.util.Locale locale12 = dateTimeParserBucket5.getLocale();
        long long15 = dateTimeParserBucket5.computeMillis(true, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-97L) + "'", long15 == (-97L));
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        long long9 = dateTimeParserBucket6.computeMillis();
        long long10 = dateTimeParserBucket6.computeMillis();
        org.joda.time.Chronology chronology12 = null;
        java.util.Locale locale13 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket(0L, chronology12, locale13, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket16.setOffset((int) 'a');
        long long20 = dateTimeParserBucket16.computeMillis(true);
        java.util.Locale locale21 = dateTimeParserBucket16.getLocale();
        dateTimeParserBucket16.setPivotYear((java.lang.Integer) 1);
        boolean boolean24 = dateTimeParserBucket6.restoreState((java.lang.Object) 1);
        java.util.Locale locale25 = dateTimeParserBucket6.getLocale();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket6.getZone();
        org.joda.time.Chronology chronology27 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology30 = null;
        java.util.Locale locale31 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket(0L, chronology30, locale31, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket34.setOffset((int) 'a');
        org.joda.time.Chronology chronology37 = dateTimeParserBucket34.getChronology();
        long long38 = dateTimeParserBucket34.computeMillis();
        dateTimeParserBucket34.setOffset((java.lang.Integer) (-1));
        long long42 = dateTimeParserBucket34.computeMillis(false);
        org.joda.time.Chronology chronology43 = dateTimeParserBucket34.getChronology();
        org.joda.time.Chronology chronology46 = null;
        java.util.Locale locale47 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket(0L, chronology46, locale47, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        dateTimeParserBucket50.setZone(dateTimeZone51);
        int int53 = dateTimeParserBucket50.getOffset();
        org.joda.time.Chronology chronology54 = dateTimeParserBucket50.getChronology();
        org.joda.time.Chronology chronology56 = null;
        java.util.Locale locale57 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket(0L, chronology56, locale57, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket60.setOffset((int) 'a');
        org.joda.time.Chronology chronology63 = dateTimeParserBucket60.getChronology();
        java.util.Locale locale64 = dateTimeParserBucket60.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket67 = new org.joda.time.format.DateTimeParserBucket((-1L), chronology54, locale64, (java.lang.Integer) 10, (int) '4');
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket69 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology43, locale64, (java.lang.Integer) 10);
        dateTimeParserBucket69.setOffset(1);
        java.util.Locale locale72 = dateTimeParserBucket69.getLocale();
        java.lang.Object obj73 = dateTimeParserBucket69.saveState();
        java.util.Locale locale74 = dateTimeParserBucket69.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket77 = new org.joda.time.format.DateTimeParserBucket(99L, chronology27, locale74, (java.lang.Integer) 1, 0);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-97L) + "'", long10 == (-97L));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-97L) + "'", long20 == (-97L));
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + (-97L) + "'", long38 == (-97L));
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1L + "'", long42 == 1L);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj73);
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "en_US");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long12 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-11L) + "'", long12 == (-11L));
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
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
        dateTimeParserBucket41.setOffset((java.lang.Integer) 97);
        long long51 = dateTimeParserBucket41.computeMillis(true);
        org.joda.time.DateTimeField dateTimeField52 = null;
        dateTimeParserBucket41.saveField(dateTimeField52, 100);
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
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + (-98L) + "'", long51 == (-98L));
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
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
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_US");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket5.getChronology();
        org.joda.time.Chronology chronology11 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType12, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset((int) '4');
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, (int) (short) 0);
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
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType19, "hi!", locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
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
        org.joda.time.Chronology chronology20 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setOffset((int) (byte) 10);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-100L) + "'", long19 == (-100L));
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        int int12 = dateTimeParserBucket5.getOffset();
        long long13 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-100L) + "'", long13 == (-100L));
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
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
        long long17 = dateTimeParserBucket3.computeMillis();
        java.lang.Integer int18 = dateTimeParserBucket3.getPivotYear();
        long long21 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType22, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-1L) + "'", long17 == (-1L));
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
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
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
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
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket5.getZone();
        java.lang.Object obj19 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(obj19);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        java.lang.Integer int13 = dateTimeParserBucket3.getPivotYear();
        int int14 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        int int9 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        int int11 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone32 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone32);
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale9 = dateTimeParserBucket5.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket5.saveField(dateTimeField11, (int) (byte) 10);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((int) (byte) 1);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
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
        java.lang.Integer int59 = dateTimeParserBucket56.getPivotYear();
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
        org.junit.Assert.assertNull(int59);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
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
        org.joda.time.DateTimeField dateTimeField17 = null;
        dateTimeParserBucket5.saveField(dateTimeField17, (int) (short) 1);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj16);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeParserBucket5.computeMillis(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        int int6 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology8, locale9);
        long long13 = dateTimeParserBucket10.computeMillis(false, "hi!");
        dateTimeParserBucket10.setOffset(0);
        java.util.Locale locale16 = dateTimeParserBucket10.getLocale();
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket10.getZone();
        long long18 = dateTimeParserBucket10.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeParserBucket10.getZone();
        dateTimeParserBucket3.setZone(dateTimeZone19);
        java.util.Locale locale21 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-1L) + "'", long18 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en_US");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long16 = dateTimeParserBucket3.computeMillis(true, "hi!");
        int int17 = dateTimeParserBucket3.getOffset();
        java.util.Locale locale18 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone19 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone19);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
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
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        long long11 = dateTimeParserBucket3.computeMillis();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
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
        org.joda.time.Chronology chronology18 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket6.saveField(dateTimeField10, 0);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((-33L), chronology13, locale14, (java.lang.Integer) 52);
        java.lang.Class<?> wildcardClass17 = dateTimeParserBucket16.getClass();
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
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
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        dateTimeParserBucket3.setZone(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone26);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket(0L, chronology2, locale3, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket6.setOffset((int) 'a');
        org.joda.time.Chronology chronology9 = dateTimeParserBucket6.getChronology();
        dateTimeParserBucket6.setPivotYear((java.lang.Integer) 100);
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology13, locale14);
        org.joda.time.DateTimeField dateTimeField16 = null;
        dateTimeParserBucket15.saveField(dateTimeField16, (int) (byte) 1);
        dateTimeParserBucket15.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket15.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket15.setOffset((int) (short) 10);
        dateTimeParserBucket15.setOffset((int) (short) 0);
        boolean boolean27 = dateTimeParserBucket6.restoreState((java.lang.Object) dateTimeParserBucket15);
        org.joda.time.Chronology chronology28 = dateTimeParserBucket6.getChronology();
        org.joda.time.Chronology chronology31 = null;
        java.util.Locale locale32 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(0L, chronology31, locale32, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket35.setOffset((int) 'a');
        org.joda.time.Chronology chronology38 = dateTimeParserBucket35.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = null;
        dateTimeParserBucket35.saveField(dateTimeField39, 0);
        org.joda.time.Chronology chronology42 = dateTimeParserBucket35.getChronology();
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(0L, chronology44, locale45, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket48.setOffset((int) 'a');
        org.joda.time.Chronology chronology51 = dateTimeParserBucket48.getChronology();
        java.util.Locale locale52 = dateTimeParserBucket48.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket53 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology42, locale52);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((-32L), chronology28, locale52, (java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "en_US");
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
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
        java.util.Locale locale45 = dateTimeParserBucket5.getLocale();
        org.joda.time.Chronology chronology46 = dateTimeParserBucket5.getChronology();
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
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology46);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        org.joda.time.Chronology chronology11 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        long long9 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        long long15 = dateTimeParserBucket3.computeMillis(false);
        long long16 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeField dateTimeField17 = null;
        dateTimeParserBucket3.saveField(dateTimeField17, (int) (short) 1);
        org.joda.time.Chronology chronology20 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-101L) + "'", long16 == (-101L));
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        java.lang.Object obj8 = dateTimeParserBucket3.saveState();
        long long10 = dateTimeParserBucket3.computeMillis(true);
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        long long16 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-101L) + "'", long10 == (-101L));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
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
        java.lang.Object obj25 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(int24);
        org.junit.Assert.assertNotNull(obj25);
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
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
        java.lang.Object obj57 = dateTimeParserBucket56.saveState();
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
        org.junit.Assert.assertNotNull(obj57);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        java.util.Locale locale46 = dateTimeParserBucket41.getLocale();
        org.joda.time.DateTimeFieldType dateTimeFieldType47 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket41.saveField(dateTimeFieldType47, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-1L) + "'", long44 == (-1L));
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket3.getZone();
        long long14 = dateTimeParserBucket3.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        org.joda.time.DateTimeField dateTimeField26 = null;
        dateTimeParserBucket23.saveField(dateTimeField26, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        long long15 = dateTimeParserBucket3.computeMillis(true, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        long long11 = dateTimeParserBucket5.computeMillis(false, "hi!");
        int int12 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology16, locale17);
        long long21 = dateTimeParserBucket18.computeMillis(false, "hi!");
        dateTimeParserBucket18.setOffset(0);
        java.util.Locale locale24 = dateTimeParserBucket18.getLocale();
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeParserBucket18.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket18.getZone();
        org.joda.time.DateTimeField dateTimeField27 = null;
        dateTimeParserBucket18.saveField(dateTimeField27, (int) (short) -1);
        java.lang.Object obj30 = dateTimeParserBucket18.saveState();
        dateTimeParserBucket18.setPivotYear((java.lang.Integer) 100);
        org.joda.time.Chronology chronology34 = null;
        java.util.Locale locale35 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology34, locale35);
        long long39 = dateTimeParserBucket36.computeMillis(false, "hi!");
        dateTimeParserBucket36.setOffset(0);
        java.util.Locale locale42 = dateTimeParserBucket36.getLocale();
        org.joda.time.DateTimeZone dateTimeZone43 = dateTimeParserBucket36.getZone();
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket49 = new org.joda.time.format.DateTimeParserBucket(0L, chronology45, locale46, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket49.setOffset((int) 'a');
        dateTimeParserBucket49.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone54 = dateTimeParserBucket49.getZone();
        boolean boolean55 = dateTimeParserBucket36.restoreState((java.lang.Object) dateTimeParserBucket49);
        org.joda.time.DateTimeZone dateTimeZone56 = dateTimeParserBucket36.getZone();
        dateTimeParserBucket18.setZone(dateTimeZone56);
        dateTimeParserBucket5.setZone(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + (-1L) + "'", long21 == (-1L));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(obj30);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + (-1L) + "'", long39 == (-1L));
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone43);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(dateTimeZone56);
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        dateTimeParserBucket4.setOffset(0);
        java.lang.Object obj10 = dateTimeParserBucket4.saveState();
        long long12 = dateTimeParserBucket4.computeMillis(false);
        java.lang.Integer int13 = dateTimeParserBucket4.getPivotYear();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((int) 'a');
        int int22 = dateTimeParserBucket19.getOffset();
        int int23 = dateTimeParserBucket19.getOffset();
        org.joda.time.DateTimeZone dateTimeZone24 = dateTimeParserBucket19.getZone();
        dateTimeParserBucket4.setZone(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = dateTimeParserBucket4.getZone();
        int int27 = dateTimeParserBucket4.getOffset();
        org.joda.time.Chronology chronology28 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket(0L, chronology32, locale33, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket36.setOffset((int) 'a');
        org.joda.time.Chronology chronology39 = dateTimeParserBucket36.getChronology();
        long long40 = dateTimeParserBucket36.computeMillis();
        dateTimeParserBucket36.setOffset((java.lang.Integer) (-1));
        java.lang.Object obj43 = null;
        boolean boolean44 = dateTimeParserBucket36.restoreState(obj43);
        dateTimeParserBucket36.setOffset(10);
        java.util.Locale locale47 = dateTimeParserBucket36.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((-32L), chronology30, locale47, (java.lang.Integer) 1, 0);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((-9L), chronology28, locale47);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + (-97L) + "'", long40 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_US");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
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
        int int17 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        int int8 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        dateTimeParserBucket3.setOffset((int) 'a');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(chronology10);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        dateTimeParserBucket5.setOffset((int) (short) 1);
        dateTimeParserBucket5.setOffset(100);
        org.joda.time.DateTimeZone dateTimeZone21 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone21);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        dateTimeParserBucket4.setOffset(0);
        java.lang.Object obj10 = dateTimeParserBucket4.saveState();
        long long12 = dateTimeParserBucket4.computeMillis(false);
        org.joda.time.Chronology chronology13 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((java.lang.Integer) 0);
        java.util.Locale locale22 = dateTimeParserBucket19.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(32L, chronology13, locale22, (java.lang.Integer) 52, (int) (short) 100);
        java.util.Locale locale26 = dateTimeParserBucket25.getLocale();
        dateTimeParserBucket25.setOffset((int) '#');
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((int) (byte) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket3.getChronology();
        java.lang.Object obj12 = dateTimeParserBucket3.saveState();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeParserBucket3.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
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
        java.util.Locale locale45 = dateTimeParserBucket5.getLocale();
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
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_US");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset(100);
        long long14 = dateTimeParserBucket3.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-101L) + "'", long14 == (-101L));
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone14 = dateTimeParserBucket5.getZone();
        int int15 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 97);
        org.joda.time.DateTimeField dateTimeField18 = null;
        dateTimeParserBucket5.saveField(dateTimeField18, 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
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
        org.joda.time.Chronology chronology20 = dateTimeParserBucket3.getChronology();
        java.lang.Object obj21 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(obj21);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
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
        org.joda.time.Chronology chronology16 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int10 = dateTimeParserBucket3.getOffsetInteger();
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 35);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale20, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket23.setOffset((int) 'a');
        long long27 = dateTimeParserBucket23.computeMillis(true);
        java.util.Locale locale28 = dateTimeParserBucket23.getLocale();
        dateTimeParserBucket23.setPivotYear((java.lang.Integer) 1);
        org.joda.time.Chronology chronology32 = null;
        java.util.Locale locale33 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket34 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology32, locale33);
        org.joda.time.DateTimeField dateTimeField35 = null;
        dateTimeParserBucket34.saveField(dateTimeField35, (int) (byte) 1);
        int int38 = dateTimeParserBucket34.getOffset();
        dateTimeParserBucket34.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone41 = dateTimeParserBucket34.getZone();
        dateTimeParserBucket23.setZone(dateTimeZone41);
        java.util.Locale locale43 = dateTimeParserBucket23.getLocale();
        java.util.Locale locale44 = dateTimeParserBucket23.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType16, "hi!", locale44);
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
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-97L) + "'", long27 == (-97L));
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeZone dateTimeZone4 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((int) (short) 0);
        org.joda.time.DateTimeField dateTimeField7 = null;
        dateTimeParserBucket3.saveField(dateTimeField7, 32);
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        long long10 = dateTimeParserBucket3.computeMillis(false, "");
        java.lang.Class<?> wildcardClass11 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        java.lang.Object obj8 = dateTimeParserBucket5.saveState();
        long long11 = dateTimeParserBucket5.computeMillis(true, "hi!");
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        org.joda.time.Chronology chronology3 = null;
        java.util.Locale locale4 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology3, locale4);
        long long7 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket5.getChronology();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology10, locale11, (java.lang.Integer) 100);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology16, locale17, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket20.setOffset((int) 'a');
        org.joda.time.Chronology chronology23 = dateTimeParserBucket20.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = null;
        dateTimeParserBucket20.saveField(dateTimeField24, 0);
        org.joda.time.Chronology chronology27 = dateTimeParserBucket20.getChronology();
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket(0L, chronology29, locale30, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket33.setOffset((int) 'a');
        org.joda.time.Chronology chronology36 = dateTimeParserBucket33.getChronology();
        java.util.Locale locale37 = dateTimeParserBucket33.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) 97, chronology27, locale37);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket(1L, chronology10, locale37, (java.lang.Integer) 32, (int) (byte) -1);
        java.lang.Object obj42 = dateTimeParserBucket41.saveState();
        dateTimeParserBucket41.setPivotYear((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj42);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        long long7 = dateTimeParserBucket4.computeMillis(false, "hi!");
        int int8 = dateTimeParserBucket4.getOffset();
        dateTimeParserBucket4.setOffset((int) (short) 10);
        java.util.Locale locale11 = dateTimeParserBucket4.getLocale();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.Chronology chronology16 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology18 = null;
        java.util.Locale locale19 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket(0L, chronology18, locale19, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket22.setOffset((int) 'a');
        org.joda.time.Chronology chronology25 = dateTimeParserBucket22.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = null;
        dateTimeParserBucket22.saveField(dateTimeField26, 0);
        dateTimeParserBucket22.setOffset((int) (short) 100);
        dateTimeParserBucket22.setOffset((int) (short) 100);
        java.util.Locale locale33 = dateTimeParserBucket22.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket35 = new org.joda.time.format.DateTimeParserBucket(10L, chronology16, locale33, (java.lang.Integer) 100);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        int int16 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology17 = dateTimeParserBucket5.getChronology();
        long long19 = dateTimeParserBucket5.computeMillis(true);
        long long22 = dateTimeParserBucket5.computeMillis(true, "");
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-97L) + "'", long15 == (-97L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-97L) + "'", long19 == (-97L));
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-97L) + "'", long22 == (-97L));
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        long long12 = dateTimeParserBucket5.computeMillis(true);
        long long15 = dateTimeParserBucket5.computeMillis(false, "");
        long long17 = dateTimeParserBucket5.computeMillis(false);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-97L) + "'", long12 == (-97L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-97L) + "'", long15 == (-97L));
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-97L) + "'", long17 == (-97L));
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        dateTimeParserBucket3.setOffset((int) (short) 10);
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
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        java.lang.Object obj12 = dateTimeParserBucket5.saveState();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(true, "hi!");
        java.lang.Integer int7 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int7);
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        java.util.Locale locale11 = dateTimeParserBucket5.getLocale();
        long long12 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-100L) + "'", long12 == (-100L));
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
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
        int int16 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology17 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket(0L, chronology21, locale22, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket25.setOffset((int) 'a');
        long long28 = dateTimeParserBucket25.computeMillis();
        long long29 = dateTimeParserBucket25.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeParserBucket25.getZone();
        dateTimeParserBucket5.setZone(dateTimeZone30);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-97L) + "'", long15 == (-97L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 97 + "'", int16 == 97);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + (-97L) + "'", long28 == (-97L));
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-97L) + "'", long29 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        java.lang.Object obj10 = dateTimeParserBucket5.saveState();
        java.util.Locale locale11 = dateTimeParserBucket5.getLocale();
        long long12 = dateTimeParserBucket5.computeMillis();
        int int13 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-100L) + "'", long12 == (-100L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        java.lang.Integer int26 = dateTimeParserBucket3.getPivotYear();
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
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
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
        org.joda.time.Chronology chronology44 = null;
        java.util.Locale locale45 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket48 = new org.joda.time.format.DateTimeParserBucket(0L, chronology44, locale45, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket48.setOffset((int) 'a');
        org.joda.time.Chronology chronology51 = dateTimeParserBucket48.getChronology();
        long long52 = dateTimeParserBucket48.computeMillis();
        dateTimeParserBucket48.setOffset((java.lang.Integer) (-1));
        java.lang.Object obj55 = null;
        boolean boolean56 = dateTimeParserBucket48.restoreState(obj55);
        dateTimeParserBucket48.setOffset(10);
        java.util.Locale locale59 = dateTimeParserBucket48.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket60 = new org.joda.time.format.DateTimeParserBucket((-52L), chronology16, locale59);
        long long61 = dateTimeParserBucket60.computeMillis();
        long long64 = dateTimeParserBucket60.computeMillis(false, "");
        org.joda.time.Chronology chronology65 = dateTimeParserBucket60.getChronology();
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-97L) + "'", long11 == (-97L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + (-97L) + "'", long52 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + (-52L) + "'", long61 == (-52L));
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + (-52L) + "'", long64 == (-52L));
        org.junit.Assert.assertNotNull(chronology65);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        long long48 = dateTimeParserBucket5.computeMillis(false, "");
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
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + (-100L) + "'", long48 == (-100L));
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        dateTimeParserBucket39.setOffset(0);
        org.joda.time.DateTimeZone dateTimeZone42 = dateTimeParserBucket39.getZone();
        org.joda.time.DateTimeFieldType dateTimeFieldType43 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket39.saveField(dateTimeFieldType43, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(dateTimeZone42);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
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
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-97L) + "'", long15 == (-97L));
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
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
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket5.setOffset((int) 'a');
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long13 = dateTimeParserBucket3.computeMillis(true);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = null;
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.Chronology chronology19 = null;
        java.util.Locale locale20 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket23 = new org.joda.time.format.DateTimeParserBucket(0L, chronology19, locale20, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket23.setOffset((int) 'a');
        org.joda.time.Chronology chronology26 = dateTimeParserBucket23.getChronology();
        long long27 = dateTimeParserBucket23.computeMillis();
        dateTimeParserBucket23.setOffset((java.lang.Integer) (-1));
        java.lang.Object obj30 = null;
        boolean boolean31 = dateTimeParserBucket23.restoreState(obj30);
        dateTimeParserBucket23.setOffset(10);
        java.util.Locale locale34 = dateTimeParserBucket23.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket37 = new org.joda.time.format.DateTimeParserBucket((-32L), chronology17, locale34, (java.lang.Integer) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType14, "", locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-97L) + "'", long27 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_US");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        java.lang.Integer int17 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int17);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket5.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket5.getZone();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.Chronology chronology15 = null;
        java.util.Locale locale16 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket(0L, chronology15, locale16, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket19.setOffset((int) 'a');
        long long23 = dateTimeParserBucket19.computeMillis(true);
        java.util.Locale locale24 = dateTimeParserBucket19.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket26 = new org.joda.time.format.DateTimeParserBucket((long) (byte) 10, chronology13, locale24, (java.lang.Integer) 10);
        boolean boolean27 = dateTimeParserBucket5.restoreState((java.lang.Object) dateTimeParserBucket26);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        dateTimeParserBucket41.setOffset((java.lang.Integer) 10);
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
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
        java.lang.Class<?> wildcardClass17 = dateTimeParserBucket5.getClass();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(obj16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        org.joda.time.Chronology chronology4 = null;
        java.util.Locale locale5 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology4, locale5);
        long long8 = dateTimeParserBucket6.computeMillis(false);
        dateTimeParserBucket6.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology11 = dateTimeParserBucket6.getChronology();
        java.util.Locale locale12 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology11, locale12, (java.lang.Integer) 100);
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology16, locale17, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket20.setOffset((int) 'a');
        long long23 = dateTimeParserBucket20.computeMillis();
        long long24 = dateTimeParserBucket20.computeMillis();
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket(0L, chronology26, locale27, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket30.setOffset((int) 'a');
        long long34 = dateTimeParserBucket30.computeMillis(true);
        java.util.Locale locale35 = dateTimeParserBucket30.getLocale();
        dateTimeParserBucket30.setPivotYear((java.lang.Integer) 1);
        boolean boolean38 = dateTimeParserBucket20.restoreState((java.lang.Object) 1);
        java.util.Locale locale39 = dateTimeParserBucket20.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) 0, chronology11, locale39);
        org.joda.time.Chronology chronology42 = null;
        java.util.Locale locale43 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket44 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology42, locale43);
        long long47 = dateTimeParserBucket44.computeMillis(false, "hi!");
        dateTimeParserBucket44.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int50 = dateTimeParserBucket44.getOffsetInteger();
        java.util.Locale locale51 = dateTimeParserBucket44.getLocale();
        long long54 = dateTimeParserBucket44.computeMillis(false, "hi!");
        java.util.Locale locale55 = dateTimeParserBucket44.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket57 = new org.joda.time.format.DateTimeParserBucket((-52L), chronology11, locale55, (java.lang.Integer) 97);
        java.lang.Object obj58 = dateTimeParserBucket57.saveState();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-97L) + "'", long23 == (-97L));
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-97L) + "'", long24 == (-97L));
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-97L) + "'", long34 == (-97L));
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + (-1L) + "'", long47 == (-1L));
        org.junit.Assert.assertNull(int50);
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + (-1L) + "'", long54 == (-1L));
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj58);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 10);
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
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long12 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        java.util.Locale locale17 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long16 = dateTimeParserBucket3.computeMillis(true, "hi!");
        int int17 = dateTimeParserBucket3.getOffset();
        java.lang.Object obj18 = dateTimeParserBucket3.saveState();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(obj18);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        int int12 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket3.getChronology();
        java.lang.Object obj14 = dateTimeParserBucket3.saveState();
        java.util.Locale locale15 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_US");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        int int11 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology12 = dateTimeParserBucket5.getChronology();
        int int13 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
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
        long long27 = dateTimeParserBucket23.computeMillis(true, "hi!");
        org.joda.time.Chronology chronology29 = null;
        java.util.Locale locale30 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology29, locale30);
        long long34 = dateTimeParserBucket31.computeMillis(false, "hi!");
        java.lang.Object obj35 = dateTimeParserBucket31.saveState();
        org.joda.time.DateTimeZone dateTimeZone36 = dateTimeParserBucket31.getZone();
        java.util.Locale locale37 = dateTimeParserBucket31.getLocale();
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeParserBucket31.getZone();
        dateTimeParserBucket31.setOffset(100);
        dateTimeParserBucket31.setPivotYear((java.lang.Integer) 10);
        dateTimeParserBucket31.setPivotYear((java.lang.Integer) 0);
        boolean boolean45 = dateTimeParserBucket23.restoreState((java.lang.Object) 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 0L + "'", long27 == 0L);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + (-1L) + "'", long34 == (-1L));
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
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
        long long20 = dateTimeParserBucket3.computeMillis(true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-1L) + "'", long20 == (-1L));
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 10);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeField dateTimeField10 = null;
        dateTimeParserBucket3.saveField(dateTimeField10, (int) (byte) 10);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 32);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        java.lang.Object obj8 = dateTimeParserBucket5.saveState();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(obj8);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
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
        int int19 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        int int8 = dateTimeParserBucket5.getOffset();
        int int9 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 100);
        long long13 = dateTimeParserBucket5.computeMillis(true);
        long long16 = dateTimeParserBucket5.computeMillis(true, "");
        int int17 = dateTimeParserBucket5.getOffset();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 97);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-97L) + "'", long16 == (-97L));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket3.computeMillis();
        org.joda.time.DateTimeField dateTimeField14 = null;
        dateTimeParserBucket3.saveField(dateTimeField14, 0);
        java.lang.Object obj17 = null;
        boolean boolean18 = dateTimeParserBucket3.restoreState(obj17);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 35);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-11L) + "'", long13 == (-11L));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
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
        java.lang.Class<?> wildcardClass48 = dateTimeParserBucket41.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField8 = null;
        dateTimeParserBucket3.saveField(dateTimeField8, (-1));
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        long long19 = dateTimeParserBucket3.computeMillis(false);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-1L) + "'", long19 == (-1L));
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = null;
        dateTimeParserBucket5.saveField(dateTimeField9, 0);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 32);
        int int14 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology15 = dateTimeParserBucket5.getChronology();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        long long11 = dateTimeParserBucket3.computeMillis(true, "");
        long long13 = dateTimeParserBucket3.computeMillis(false);
        java.util.Locale locale14 = dateTimeParserBucket3.getLocale();
        java.lang.Integer int15 = dateTimeParserBucket3.getPivotYear();
        int int16 = dateTimeParserBucket3.getOffset();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.joda.time.Chronology chronology12 = dateTimeParserBucket3.getChronology();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        long long17 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale13 = dateTimeParserBucket3.getLocale();
        java.util.Locale locale14 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
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
        long long29 = dateTimeParserBucket5.computeMillis();
        org.joda.time.DateTimeZone dateTimeZone30 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + (-97L) + "'", long29 == (-97L));
        org.junit.Assert.assertNotNull(dateTimeZone30);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeField dateTimeField13 = null;
        dateTimeParserBucket3.saveField(dateTimeField13, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = dateTimeParserBucket3.computeMillis(true, "");
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
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        org.joda.time.DateTimeField dateTimeField4 = null;
        dateTimeParserBucket3.saveField(dateTimeField4, (int) (byte) 1);
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        long long18 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-101L) + "'", long18 == (-101L));
    }
}

