import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
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
        dateTimeParserBucket57.setOffset((java.lang.Integer) 1);
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        java.lang.Object obj9 = dateTimeParserBucket3.saveState();
        java.lang.Object obj10 = dateTimeParserBucket3.saveState();
        org.joda.time.DateTimeField dateTimeField11 = null;
        dateTimeParserBucket3.saveField(dateTimeField11, 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
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
        dateTimeParserBucket3.setOffset((java.lang.Integer) (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(obj15);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        dateTimeParserBucket5.setOffset((int) (byte) 100);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 100);
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) (-1));
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 97);
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeParserBucket3.getZone();
        int int9 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        long long13 = dateTimeParserBucket3.computeMillis(false, "");
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-98L) + "'", long13 == (-98L));
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long5 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        int int8 = dateTimeParserBucket3.getOffset();
        org.joda.time.Chronology chronology9 = dateTimeParserBucket3.getChronology();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
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
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-97L) + "'", long15 == (-97L));
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        java.lang.Integer int4 = dateTimeParserBucket3.getPivotYear();
        long long5 = dateTimeParserBucket3.computeMillis();
        long long8 = dateTimeParserBucket3.computeMillis(true, "");
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket3.getZone();
        dateTimeParserBucket3.setOffset((int) (short) -1);
        java.util.Locale locale12 = dateTimeParserBucket3.getLocale();
        long long15 = dateTimeParserBucket3.computeMillis(true, "");
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
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
        org.joda.time.DateTimeZone dateTimeZone17 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone17);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        long long10 = dateTimeParserBucket3.computeMillis(false);
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeZone11);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        dateTimeParserBucket5.setZone(dateTimeZone6);
        int int8 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone9 = dateTimeParserBucket5.getZone();
        dateTimeParserBucket5.setOffset((java.lang.Integer) 97);
        long long13 = dateTimeParserBucket5.computeMillis(false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        java.lang.Object obj11 = dateTimeParserBucket5.saveState();
        long long13 = dateTimeParserBucket5.computeMillis(false);
        int int14 = dateTimeParserBucket5.getOffset();
        org.joda.time.DateTimeZone dateTimeZone15 = dateTimeParserBucket5.getZone();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-97L) + "'", long13 == (-97L));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        org.joda.time.Chronology chronology10 = dateTimeParserBucket3.getChronology();
        int int11 = dateTimeParserBucket3.getOffset();
        java.util.Locale locale12 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) (-1));
        dateTimeParserBucket3.setOffset(100);
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        long long9 = dateTimeParserBucket5.computeMillis(true);
        java.util.Locale locale10 = dateTimeParserBucket5.getLocale();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        java.lang.Object obj13 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(obj13);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
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
        dateTimeParserBucket56.setPivotYear((java.lang.Integer) 52);
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket5.saveField(dateTimeFieldType31, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        dateTimeParserBucket3.setOffset(0);
        dateTimeParserBucket3.setOffset((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        long long11 = dateTimeParserBucket3.computeMillis(false);
        java.lang.Integer int12 = dateTimeParserBucket3.getOffsetInteger();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNull(int12);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 1);
        java.lang.Integer int9 = dateTimeParserBucket3.getOffsetInteger();
        java.util.Locale locale10 = dateTimeParserBucket3.getLocale();
        long long13 = dateTimeParserBucket3.computeMillis(false, "hi!");
        long long16 = dateTimeParserBucket3.computeMillis(true, "hi!");
        dateTimeParserBucket3.setOffset((java.lang.Integer) 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
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
        java.lang.Class<?> wildcardClass16 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
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
        java.lang.Integer int38 = dateTimeParserBucket34.getPivotYear();
        java.lang.Integer int39 = dateTimeParserBucket34.getOffsetInteger();
        org.joda.time.Chronology chronology40 = dateTimeParserBucket34.getChronology();
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_US");
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNull(int39);
        org.junit.Assert.assertNotNull(chronology40);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
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
        dateTimeParserBucket60.setOffset((int) (byte) 100);
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
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
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
        // The following exception was thrown during execution in test generation
        try {
            long long31 = dateTimeParserBucket26.computeMillis();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
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
        java.lang.Integer int15 = dateTimeParserBucket3.getPivotYear();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(int15);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
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
        dateTimeParserBucket5.setOffset(97);
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
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
        long long25 = dateTimeParserBucket18.computeMillis(false, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + (-101L) + "'", long25 == (-101L));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
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
        java.util.Locale locale53 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket55 = new org.joda.time.format.DateTimeParserBucket((-53L), chronology12, locale53, (java.lang.Integer) 32);
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
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
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
        org.joda.time.DateTimeZone dateTimeZone38 = dateTimeParserBucket5.getZone();
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
        org.junit.Assert.assertNotNull(dateTimeZone38);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        java.lang.Object obj7 = dateTimeParserBucket3.saveState();
        dateTimeParserBucket3.setPivotYear((java.lang.Integer) 97);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        dateTimeParserBucket3.setOffset(0);
        java.util.Locale locale9 = dateTimeParserBucket3.getLocale();
        org.joda.time.DateTimeZone dateTimeZone10 = dateTimeParserBucket3.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket3.getZone();
        java.util.Locale locale12 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
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
        org.joda.time.DateTimeField dateTimeField30 = null;
        dateTimeParserBucket27.saveField(dateTimeField30, (int) (short) 10);
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
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
        // The following exception was thrown during execution in test generation
        try {
            long long23 = dateTimeParserBucket3.computeMillis(true, "");
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
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
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
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket3.getZone();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
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
        org.joda.time.DateTimeZone dateTimeZone25 = dateTimeParserBucket3.getZone();
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
        org.junit.Assert.assertNotNull(dateTimeZone25);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
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
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeParserBucket3.saveField(dateTimeFieldType16, 52);
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
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
        int int24 = dateTimeParserBucket5.getOffset();
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-97L) + "'", long8 == (-97L));
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-97L) + "'", long19 == (-97L));
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
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
        dateTimeParserBucket3.setOffset((java.lang.Integer) 32);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-101L) + "'", long15 == (-101L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-101L) + "'", long16 == (-101L));
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        org.joda.time.Chronology chronology2 = null;
        java.util.Locale locale3 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket4 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology2, locale3);
        org.joda.time.DateTimeField dateTimeField5 = null;
        dateTimeParserBucket4.saveField(dateTimeField5, (int) (byte) 1);
        int int8 = dateTimeParserBucket4.getOffset();
        dateTimeParserBucket4.setPivotYear((java.lang.Integer) (-1));
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket4.getZone();
        java.lang.Object obj12 = dateTimeParserBucket4.saveState();
        org.joda.time.Chronology chronology13 = dateTimeParserBucket4.getChronology();
        org.joda.time.Chronology chronology16 = null;
        java.util.Locale locale17 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket(0L, chronology16, locale17, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket20.setOffset((int) 'a');
        org.joda.time.Chronology chronology23 = dateTimeParserBucket20.getChronology();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology25, locale26);
        long long30 = dateTimeParserBucket27.computeMillis(false, "hi!");
        dateTimeParserBucket27.setOffset(0);
        java.util.Locale locale33 = dateTimeParserBucket27.getLocale();
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeParserBucket27.getZone();
        org.joda.time.DateTimeZone dateTimeZone35 = dateTimeParserBucket27.getZone();
        java.lang.Object obj36 = dateTimeParserBucket27.saveState();
        org.joda.time.Chronology chronology38 = null;
        java.util.Locale locale39 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket40 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology38, locale39);
        org.joda.time.DateTimeField dateTimeField41 = null;
        dateTimeParserBucket40.saveField(dateTimeField41, (int) (byte) 1);
        dateTimeParserBucket40.setOffset((java.lang.Integer) 10);
        dateTimeParserBucket40.setPivotYear((java.lang.Integer) 10);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTimeParserBucket40.getZone();
        dateTimeParserBucket27.setZone(dateTimeZone48);
        java.util.Locale locale50 = dateTimeParserBucket27.getLocale();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket(99L, chronology23, locale50);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket54 = new org.joda.time.format.DateTimeParserBucket(100L, chronology13, locale50, (java.lang.Integer) 97, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + (-1L) + "'", long30 == (-1L));
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(obj36);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_US");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
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
        java.util.Locale locale18 = dateTimeParserBucket3.getLocale();
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_US");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        org.joda.time.Chronology chronology6 = dateTimeParserBucket5.getChronology();
        dateTimeParserBucket5.setPivotYear((java.lang.Integer) 1);
        java.lang.Object obj9 = dateTimeParserBucket5.saveState();
        int int10 = dateTimeParserBucket5.getOffset();
        long long11 = dateTimeParserBucket5.computeMillis();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        dateTimeParserBucket3.setOffset((int) (byte) 100);
        org.joda.time.Chronology chronology6 = dateTimeParserBucket3.getChronology();
        int int7 = dateTimeParserBucket3.getOffset();
        org.joda.time.DateTimeField dateTimeField8 = null;
        dateTimeParserBucket3.saveField(dateTimeField8, (-1));
        java.lang.Object obj11 = dateTimeParserBucket3.saveState();
        java.lang.Class<?> wildcardClass12 = dateTimeParserBucket3.getClass();
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket3 = new org.joda.time.format.DateTimeParserBucket((long) (short) -1, chronology1, locale2);
        long long6 = dateTimeParserBucket3.computeMillis(false, "hi!");
        int int7 = dateTimeParserBucket3.getOffset();
        dateTimeParserBucket3.setOffset((int) (short) 10);
        java.lang.Integer int10 = dateTimeParserBucket3.getPivotYear();
        dateTimeParserBucket3.setOffset((int) (short) 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1L) + "'", long6 == (-1L));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
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
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + (-2L) + "'", long44 == (-2L));
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + (-2L) + "'", long45 == (-2L));
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "en_US");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
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
        long long78 = dateTimeParserBucket77.computeMillis();
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
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 99L + "'", long78 == 99L);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket(0L, chronology1, locale2, (java.lang.Integer) 100, (int) '4');
        dateTimeParserBucket5.setOffset((int) 'a');
        org.joda.time.Chronology chronology8 = dateTimeParserBucket5.getChronology();
        long long9 = dateTimeParserBucket5.computeMillis();
        dateTimeParserBucket5.setOffset((java.lang.Integer) (-1));
        long long13 = dateTimeParserBucket5.computeMillis(false);
        dateTimeParserBucket5.setOffset((java.lang.Integer) 1);
        org.joda.time.DateTimeZone dateTimeZone16 = dateTimeParserBucket5.getZone();
        java.lang.Object obj17 = dateTimeParserBucket5.saveState();
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-97L) + "'", long9 == (-97L));
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(obj17);
    }
}

