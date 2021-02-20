import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int4 = empiricalDistributionImpl3.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = empiricalDistributionImpl3.getSampleStats();
        double[] doubleArray9 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl3.load(doubleArray9);
        empiricalDistributionImpl1.load(doubleArray9);
        boolean boolean12 = empiricalDistributionImpl1.isLoaded();
        boolean boolean13 = empiricalDistributionImpl1.isLoaded();
        double[] doubleArray14 = empiricalDistributionImpl1.getUpperBounds();
        double[] doubleArray15 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary16 = empiricalDistributionImpl1.getSampleStats();
        double[] doubleArray17 = empiricalDistributionImpl1.getUpperBounds();
        double[] doubleArray18 = empiricalDistributionImpl1.getUpperBounds();
        int int19 = empiricalDistributionImpl1.getBinCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary16);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int4 = empiricalDistributionImpl3.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = empiricalDistributionImpl3.getSampleStats();
        double[] doubleArray9 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl3.load(doubleArray9);
        empiricalDistributionImpl1.load(doubleArray9);
        double double12 = empiricalDistributionImpl1.getNextValue();
        java.util.List list13 = empiricalDistributionImpl1.getBinStats();
        double double14 = empiricalDistributionImpl1.getNextValue();
        int int15 = empiricalDistributionImpl1.getBinCount();
        boolean boolean16 = empiricalDistributionImpl1.isLoaded();
        boolean boolean17 = empiricalDistributionImpl1.isLoaded();
        boolean boolean18 = empiricalDistributionImpl1.isLoaded();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
        org.junit.Assert.assertNotNull(list13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int2 = empiricalDistributionImpl1.getBinCount();
        double[] doubleArray4 = new double[] { 100.0d };
        empiricalDistributionImpl1.load(doubleArray4);
        boolean boolean6 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary7 = empiricalDistributionImpl1.getSampleStats();
        boolean boolean8 = empiricalDistributionImpl1.isLoaded();
        int int9 = empiricalDistributionImpl1.getBinCount();
        java.util.List list10 = empiricalDistributionImpl1.getBinStats();
        double double11 = empiricalDistributionImpl1.getNextValue();
        double[] doubleArray12 = empiricalDistributionImpl1.getUpperBounds();
        boolean boolean13 = empiricalDistributionImpl1.isLoaded();
        boolean boolean14 = empiricalDistributionImpl1.isLoaded();
        java.util.List list15 = empiricalDistributionImpl1.getBinStats();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(statisticalSummary7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) 'a');
        int int2 = empiricalDistributionImpl1.getBinCount();
        boolean boolean3 = empiricalDistributionImpl1.isLoaded();
        java.io.File file4 = null;
        // The following exception was thrown during execution in test generation
        try {
            empiricalDistributionImpl1.load(file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        boolean boolean2 = empiricalDistributionImpl1.isLoaded();
        int int3 = empiricalDistributionImpl1.getBinCount();
        boolean boolean4 = empiricalDistributionImpl1.isLoaded();
        int int5 = empiricalDistributionImpl1.getBinCount();
        boolean boolean6 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary7 = empiricalDistributionImpl1.getSampleStats();
        int int8 = empiricalDistributionImpl1.getBinCount();
        java.io.File file9 = null;
        // The following exception was thrown during execution in test generation
        try {
            empiricalDistributionImpl1.load(file9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 35 + "'", int3 == 35);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(statisticalSummary7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray6 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl1.load(doubleArray6);
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        java.util.List list9 = empiricalDistributionImpl1.getBinStats();
        boolean boolean10 = empiricalDistributionImpl1.isLoaded();
        java.util.List list11 = empiricalDistributionImpl1.getBinStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary12 = empiricalDistributionImpl1.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary13 = empiricalDistributionImpl1.getSampleStats();
        int int14 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl16 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl18 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int19 = empiricalDistributionImpl18.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary20 = empiricalDistributionImpl18.getSampleStats();
        double[] doubleArray24 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl18.load(doubleArray24);
        empiricalDistributionImpl16.load(doubleArray24);
        double[] doubleArray30 = new double[] { (-1.0d), (short) 0, 1L };
        empiricalDistributionImpl16.load(doubleArray30);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary32 = empiricalDistributionImpl16.getSampleStats();
        int int33 = empiricalDistributionImpl16.getBinCount();
        double[] doubleArray34 = empiricalDistributionImpl16.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray34);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(statisticalSummary12);
        org.junit.Assert.assertNotNull(statisticalSummary13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertNull(statisticalSummary20);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[1.0]");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray6 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl1.load(doubleArray6);
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        java.util.List list9 = empiricalDistributionImpl1.getBinStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl11 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl13 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int14 = empiricalDistributionImpl13.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary15 = empiricalDistributionImpl13.getSampleStats();
        double[] doubleArray19 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl13.load(doubleArray19);
        empiricalDistributionImpl11.load(doubleArray19);
        double double22 = empiricalDistributionImpl11.getNextValue();
        double[] doubleArray23 = empiricalDistributionImpl11.getUpperBounds();
        double[] doubleArray24 = empiricalDistributionImpl11.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray24);
        boolean boolean26 = empiricalDistributionImpl1.isLoaded();
        double double27 = empiricalDistributionImpl1.getNextValue();
        int int28 = empiricalDistributionImpl1.getBinCount();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNull(statisticalSummary15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 32.0d + "'", double22 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.6666666666666666d + "'", double27 == 0.6666666666666666d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int2 = empiricalDistributionImpl1.getBinCount();
        double[] doubleArray4 = new double[] { 100.0d };
        empiricalDistributionImpl1.load(doubleArray4);
        boolean boolean6 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary7 = empiricalDistributionImpl1.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary8 = empiricalDistributionImpl1.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = empiricalDistributionImpl1.getSampleStats();
        java.util.List list10 = empiricalDistributionImpl1.getBinStats();
        java.util.List list11 = empiricalDistributionImpl1.getBinStats();
        java.util.List list12 = empiricalDistributionImpl1.getBinStats();
        boolean boolean13 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl15 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray20 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl15.load(doubleArray20);
        double[] doubleArray22 = empiricalDistributionImpl15.getUpperBounds();
        java.util.List list23 = empiricalDistributionImpl15.getBinStats();
        boolean boolean24 = empiricalDistributionImpl15.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary25 = empiricalDistributionImpl15.getSampleStats();
        int int26 = empiricalDistributionImpl15.getBinCount();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl28 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl30 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int31 = empiricalDistributionImpl30.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary32 = empiricalDistributionImpl30.getSampleStats();
        double[] doubleArray36 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl30.load(doubleArray36);
        empiricalDistributionImpl28.load(doubleArray36);
        empiricalDistributionImpl15.load(doubleArray36);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary40 = empiricalDistributionImpl15.getSampleStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl42 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray47 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl42.load(doubleArray47);
        double[] doubleArray49 = empiricalDistributionImpl42.getUpperBounds();
        int int50 = empiricalDistributionImpl42.getBinCount();
        double[] doubleArray51 = empiricalDistributionImpl42.getUpperBounds();
        int int52 = empiricalDistributionImpl42.getBinCount();
        java.util.List list53 = empiricalDistributionImpl42.getBinStats();
        int int54 = empiricalDistributionImpl42.getBinCount();
        double double55 = empiricalDistributionImpl42.getNextValue();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl57 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int58 = empiricalDistributionImpl57.getBinCount();
        double[] doubleArray60 = new double[] { 100.0d };
        empiricalDistributionImpl57.load(doubleArray60);
        boolean boolean62 = empiricalDistributionImpl57.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary63 = empiricalDistributionImpl57.getSampleStats();
        boolean boolean64 = empiricalDistributionImpl57.isLoaded();
        boolean boolean65 = empiricalDistributionImpl57.isLoaded();
        double[] doubleArray66 = empiricalDistributionImpl57.getUpperBounds();
        empiricalDistributionImpl42.load(doubleArray66);
        empiricalDistributionImpl15.load(doubleArray66);
        empiricalDistributionImpl1.load(doubleArray66);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary70 = empiricalDistributionImpl1.getSampleStats();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(statisticalSummary7);
        org.junit.Assert.assertNotNull(statisticalSummary8);
        org.junit.Assert.assertNotNull(statisticalSummary9);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(list12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(statisticalSummary25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNull(statisticalSummary32);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary40);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 35 + "'", int50 == 35);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 35 + "'", int52 == 35);
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
// flaky:         org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 35 + "'", int58 == 35);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(statisticalSummary63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary70);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (short) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray8 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl3.load(doubleArray8);
        double[] doubleArray10 = empiricalDistributionImpl3.getUpperBounds();
        int int11 = empiricalDistributionImpl3.getBinCount();
        double[] doubleArray12 = empiricalDistributionImpl3.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray12);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl15 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl17 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray22 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl17.load(doubleArray22);
        double[] doubleArray24 = empiricalDistributionImpl17.getUpperBounds();
        empiricalDistributionImpl15.load(doubleArray24);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl27 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int28 = empiricalDistributionImpl27.getBinCount();
        double[] doubleArray30 = new double[] { 100.0d };
        empiricalDistributionImpl27.load(doubleArray30);
        empiricalDistributionImpl15.load(doubleArray30);
        double[] doubleArray33 = empiricalDistributionImpl15.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray33);
        int int35 = empiricalDistributionImpl1.getBinCount();
        int int36 = empiricalDistributionImpl1.getBinCount();
        java.util.List list37 = empiricalDistributionImpl1.getBinStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary38 = empiricalDistributionImpl1.getSampleStats();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(list37);
        org.junit.Assert.assertNotNull(statisticalSummary38);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 10);
        int int2 = empiricalDistributionImpl1.getBinCount();
        int int3 = empiricalDistributionImpl1.getBinCount();
        boolean boolean4 = empiricalDistributionImpl1.isLoaded();
        boolean boolean5 = empiricalDistributionImpl1.isLoaded();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray6 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl1.load(doubleArray6);
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl10 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl12 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int13 = empiricalDistributionImpl12.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary14 = empiricalDistributionImpl12.getSampleStats();
        double[] doubleArray18 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl12.load(doubleArray18);
        empiricalDistributionImpl10.load(doubleArray18);
        empiricalDistributionImpl1.load(doubleArray18);
        double double22 = empiricalDistributionImpl1.getNextValue();
        java.util.List list23 = empiricalDistributionImpl1.getBinStats();
        int int24 = empiricalDistributionImpl1.getBinCount();
        java.util.List list25 = empiricalDistributionImpl1.getBinStats();
        double double26 = empiricalDistributionImpl1.getNextValue();
        double double27 = empiricalDistributionImpl1.getNextValue();
        int int28 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl30 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '4');
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary31 = empiricalDistributionImpl30.getSampleStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl33 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int34 = empiricalDistributionImpl33.getBinCount();
        double[] doubleArray36 = new double[] { 100.0d };
        empiricalDistributionImpl33.load(doubleArray36);
        boolean boolean38 = empiricalDistributionImpl33.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary39 = empiricalDistributionImpl33.getSampleStats();
        boolean boolean40 = empiricalDistributionImpl33.isLoaded();
        boolean boolean41 = empiricalDistributionImpl33.isLoaded();
        double[] doubleArray42 = empiricalDistributionImpl33.getUpperBounds();
        empiricalDistributionImpl30.load(doubleArray42);
        empiricalDistributionImpl1.load(doubleArray42);
        int int45 = empiricalDistributionImpl1.getBinCount();
        boolean boolean46 = empiricalDistributionImpl1.isLoaded();
        double[] doubleArray47 = empiricalDistributionImpl1.getUpperBounds();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNull(statisticalSummary14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(list25);
// flaky:         org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertNull(statisticalSummary31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 35 + "'", int34 == 35);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(statisticalSummary39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
    }

    @Test
    @Ignore
  public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray8 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl3.load(doubleArray8);
        double[] doubleArray10 = empiricalDistributionImpl3.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray10);
        double double12 = empiricalDistributionImpl1.getNextValue();
        double double13 = empiricalDistributionImpl1.getNextValue();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary14 = empiricalDistributionImpl1.getSampleStats();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.75d + "'", double12 == 0.75d);
// flaky:         org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.75d + "'", double13 == 0.75d);
        org.junit.Assert.assertNotNull(statisticalSummary14);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) ' ');
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int4 = empiricalDistributionImpl3.getBinCount();
        double[] doubleArray6 = new double[] { 100.0d };
        empiricalDistributionImpl3.load(doubleArray6);
        boolean boolean8 = empiricalDistributionImpl3.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = empiricalDistributionImpl3.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary10 = empiricalDistributionImpl3.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary11 = empiricalDistributionImpl3.getSampleStats();
        double[] doubleArray12 = empiricalDistributionImpl3.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray12);
        java.util.List list14 = empiricalDistributionImpl1.getBinStats();
        java.util.List list15 = empiricalDistributionImpl1.getBinStats();
        java.lang.Class<?> wildcardClass16 = list15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(statisticalSummary9);
        org.junit.Assert.assertNotNull(statisticalSummary10);
        org.junit.Assert.assertNotNull(statisticalSummary11);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(list15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int4 = empiricalDistributionImpl3.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = empiricalDistributionImpl3.getSampleStats();
        double[] doubleArray9 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl3.load(doubleArray9);
        empiricalDistributionImpl1.load(doubleArray9);
        double[] doubleArray15 = new double[] { (-1.0d), (short) 0, 1L };
        empiricalDistributionImpl1.load(doubleArray15);
        double[] doubleArray17 = empiricalDistributionImpl1.getUpperBounds();
        double double18 = empiricalDistributionImpl1.getNextValue();
        boolean boolean19 = empiricalDistributionImpl1.isLoaded();
        int int20 = empiricalDistributionImpl1.getBinCount();
        int int21 = empiricalDistributionImpl1.getBinCount();
        int int22 = empiricalDistributionImpl1.getBinCount();
        java.util.List list23 = empiricalDistributionImpl1.getBinStats();
        int int24 = empiricalDistributionImpl1.getBinCount();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.12205383205706662d + "'", double18 == 0.12205383205706662d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray8 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl3.load(doubleArray8);
        double[] doubleArray10 = empiricalDistributionImpl3.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray10);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl13 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int14 = empiricalDistributionImpl13.getBinCount();
        double[] doubleArray16 = new double[] { 100.0d };
        empiricalDistributionImpl13.load(doubleArray16);
        empiricalDistributionImpl1.load(doubleArray16);
        double[] doubleArray19 = empiricalDistributionImpl1.getUpperBounds();
        double double20 = empiricalDistributionImpl1.getNextValue();
        boolean boolean21 = empiricalDistributionImpl1.isLoaded();
        double[] doubleArray22 = empiricalDistributionImpl1.getUpperBounds();
        double double23 = empiricalDistributionImpl1.getNextValue();
        int int24 = empiricalDistributionImpl1.getBinCount();
        java.net.URL uRL25 = null;
        // The following exception was thrown during execution in test generation
        try {
            empiricalDistributionImpl1.load(uRL25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray8 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl3.load(doubleArray8);
        double[] doubleArray10 = empiricalDistributionImpl3.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray10);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl13 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int14 = empiricalDistributionImpl13.getBinCount();
        double[] doubleArray16 = new double[] { 100.0d };
        empiricalDistributionImpl13.load(doubleArray16);
        empiricalDistributionImpl1.load(doubleArray16);
        double[] doubleArray19 = empiricalDistributionImpl1.getUpperBounds();
        java.util.List list20 = empiricalDistributionImpl1.getBinStats();
        double[] doubleArray21 = empiricalDistributionImpl1.getUpperBounds();
        double double22 = empiricalDistributionImpl1.getNextValue();
        double double23 = empiricalDistributionImpl1.getNextValue();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary24 = empiricalDistributionImpl1.getSampleStats();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(list20);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(statisticalSummary24);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray6 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl1.load(doubleArray6);
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        java.util.List list9 = empiricalDistributionImpl1.getBinStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl11 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl13 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int14 = empiricalDistributionImpl13.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary15 = empiricalDistributionImpl13.getSampleStats();
        double[] doubleArray19 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl13.load(doubleArray19);
        empiricalDistributionImpl11.load(doubleArray19);
        double double22 = empiricalDistributionImpl11.getNextValue();
        double[] doubleArray23 = empiricalDistributionImpl11.getUpperBounds();
        double[] doubleArray24 = empiricalDistributionImpl11.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray24);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary26 = empiricalDistributionImpl1.getSampleStats();
        double[] doubleArray27 = empiricalDistributionImpl1.getUpperBounds();
        double double28 = empiricalDistributionImpl1.getNextValue();
        java.util.List list29 = empiricalDistributionImpl1.getBinStats();
        boolean boolean30 = empiricalDistributionImpl1.isLoaded();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNull(statisticalSummary15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(statisticalSummary26);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.6666666666666666d + "'", double28 == 0.6666666666666666d);
        org.junit.Assert.assertNotNull(list29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int2 = empiricalDistributionImpl1.getBinCount();
        double[] doubleArray4 = new double[] { 100.0d };
        empiricalDistributionImpl1.load(doubleArray4);
        boolean boolean6 = empiricalDistributionImpl1.isLoaded();
        double[] doubleArray7 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary8 = empiricalDistributionImpl1.getSampleStats();
        int int9 = empiricalDistributionImpl1.getBinCount();
        boolean boolean10 = empiricalDistributionImpl1.isLoaded();
        boolean boolean11 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl13 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl15 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray20 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl15.load(doubleArray20);
        double[] doubleArray22 = empiricalDistributionImpl15.getUpperBounds();
        empiricalDistributionImpl13.load(doubleArray22);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl25 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int26 = empiricalDistributionImpl25.getBinCount();
        double[] doubleArray28 = new double[] { 100.0d };
        empiricalDistributionImpl25.load(doubleArray28);
        empiricalDistributionImpl13.load(doubleArray28);
        double[] doubleArray31 = empiricalDistributionImpl13.getUpperBounds();
        java.util.List list32 = empiricalDistributionImpl13.getBinStats();
        double[] doubleArray33 = empiricalDistributionImpl13.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray33);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int4 = empiricalDistributionImpl3.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = empiricalDistributionImpl3.getSampleStats();
        double[] doubleArray9 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl3.load(doubleArray9);
        empiricalDistributionImpl1.load(doubleArray9);
        int int12 = empiricalDistributionImpl1.getBinCount();
        double[] doubleArray13 = empiricalDistributionImpl1.getUpperBounds();
        java.util.List list14 = empiricalDistributionImpl1.getBinStats();
        double[] doubleArray15 = empiricalDistributionImpl1.getUpperBounds();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertNotNull(list14);
        org.junit.Assert.assertNotNull(doubleArray15);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 100);
        int int2 = empiricalDistributionImpl1.getBinCount();
        int int3 = empiricalDistributionImpl1.getBinCount();
        java.util.List list4 = empiricalDistributionImpl1.getBinStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = empiricalDistributionImpl1.getSampleStats();
        java.util.List list6 = empiricalDistributionImpl1.getBinStats();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = empiricalDistributionImpl1.getNextValue();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: distribution not loaded");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(list4);
        org.junit.Assert.assertNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(list6);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray6 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl1.load(doubleArray6);
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        int int9 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl11 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl13 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray18 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl13.load(doubleArray18);
        double[] doubleArray20 = empiricalDistributionImpl13.getUpperBounds();
        empiricalDistributionImpl11.load(doubleArray20);
        empiricalDistributionImpl1.load(doubleArray20);
        boolean boolean23 = empiricalDistributionImpl1.isLoaded();
        java.util.List list24 = empiricalDistributionImpl1.getBinStats();
        double double25 = empiricalDistributionImpl1.getNextValue();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(list24);
// flaky:         org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.75d + "'", double25 == 0.75d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray6 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl1.load(doubleArray6);
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        java.util.List list9 = empiricalDistributionImpl1.getBinStats();
        boolean boolean10 = empiricalDistributionImpl1.isLoaded();
        java.util.List list11 = empiricalDistributionImpl1.getBinStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary12 = empiricalDistributionImpl1.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary13 = empiricalDistributionImpl1.getSampleStats();
        int int14 = empiricalDistributionImpl1.getBinCount();
        int int15 = empiricalDistributionImpl1.getBinCount();
        int int16 = empiricalDistributionImpl1.getBinCount();
        java.lang.Class<?> wildcardClass17 = empiricalDistributionImpl1.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(statisticalSummary12);
        org.junit.Assert.assertNotNull(statisticalSummary13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray6 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl1.load(doubleArray6);
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl10 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl12 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int13 = empiricalDistributionImpl12.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary14 = empiricalDistributionImpl12.getSampleStats();
        double[] doubleArray18 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl12.load(doubleArray18);
        empiricalDistributionImpl10.load(doubleArray18);
        empiricalDistributionImpl1.load(doubleArray18);
        double double22 = empiricalDistributionImpl1.getNextValue();
        double double23 = empiricalDistributionImpl1.getNextValue();
        double[] doubleArray24 = empiricalDistributionImpl1.getUpperBounds();
        boolean boolean25 = empiricalDistributionImpl1.isLoaded();
        int int26 = empiricalDistributionImpl1.getBinCount();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNull(statisticalSummary14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 32.0d + "'", double22 == 32.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double23 + "' != '" + 1.0d + "'", double23 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray6 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl1.load(doubleArray6);
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        java.util.List list9 = empiricalDistributionImpl1.getBinStats();
        boolean boolean10 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary11 = empiricalDistributionImpl1.getSampleStats();
        int int12 = empiricalDistributionImpl1.getBinCount();
        boolean boolean13 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary14 = empiricalDistributionImpl1.getSampleStats();
        java.io.File file15 = null;
        // The following exception was thrown during execution in test generation
        try {
            empiricalDistributionImpl1.load(file15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(statisticalSummary11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(statisticalSummary14);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '4');
        boolean boolean2 = empiricalDistributionImpl1.isLoaded();
        java.util.List list3 = empiricalDistributionImpl1.getBinStats();
        int int4 = empiricalDistributionImpl1.getBinCount();
        java.util.List list5 = empiricalDistributionImpl1.getBinStats();
        java.io.File file6 = null;
        // The following exception was thrown during execution in test generation
        try {
            empiricalDistributionImpl1.load(file6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(list5);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int2 = empiricalDistributionImpl1.getBinCount();
        double[] doubleArray4 = new double[] { 100.0d };
        empiricalDistributionImpl1.load(doubleArray4);
        boolean boolean6 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary7 = empiricalDistributionImpl1.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary8 = empiricalDistributionImpl1.getSampleStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl10 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl12 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int13 = empiricalDistributionImpl12.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary14 = empiricalDistributionImpl12.getSampleStats();
        double[] doubleArray18 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl12.load(doubleArray18);
        empiricalDistributionImpl10.load(doubleArray18);
        double[] doubleArray24 = new double[] { (-1.0d), (short) 0, 1L };
        empiricalDistributionImpl10.load(doubleArray24);
        empiricalDistributionImpl1.load(doubleArray24);
        double[] doubleArray27 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl29 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl31 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int32 = empiricalDistributionImpl31.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary33 = empiricalDistributionImpl31.getSampleStats();
        double[] doubleArray37 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl31.load(doubleArray37);
        empiricalDistributionImpl29.load(doubleArray37);
        double double40 = empiricalDistributionImpl29.getNextValue();
        double[] doubleArray41 = empiricalDistributionImpl29.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray41);
        boolean boolean43 = empiricalDistributionImpl1.isLoaded();
        double[] doubleArray44 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary45 = empiricalDistributionImpl1.getSampleStats();
        java.util.List list46 = empiricalDistributionImpl1.getBinStats();
        double double47 = empiricalDistributionImpl1.getNextValue();
        double double48 = empiricalDistributionImpl1.getNextValue();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl50 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray55 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl50.load(doubleArray55);
        double double57 = empiricalDistributionImpl50.getNextValue();
        double double58 = empiricalDistributionImpl50.getNextValue();
        int int59 = empiricalDistributionImpl50.getBinCount();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl61 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int62 = empiricalDistributionImpl61.getBinCount();
        double[] doubleArray64 = new double[] { 100.0d };
        empiricalDistributionImpl61.load(doubleArray64);
        double double66 = empiricalDistributionImpl61.getNextValue();
        boolean boolean67 = empiricalDistributionImpl61.isLoaded();
        double[] doubleArray68 = empiricalDistributionImpl61.getUpperBounds();
        empiricalDistributionImpl50.load(doubleArray68);
        empiricalDistributionImpl1.load(doubleArray68);
        java.net.URL uRL71 = null;
        // The following exception was thrown during execution in test generation
        try {
            empiricalDistributionImpl1.load(uRL71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(statisticalSummary7);
        org.junit.Assert.assertNotNull(statisticalSummary8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNull(statisticalSummary14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 1.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNull(statisticalSummary33);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double40 + "' != '" + 32.0d + "'", double40 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary45);
        org.junit.Assert.assertNotNull(list46);
// flaky:         org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.6666666666666666d + "'", double47 == 0.6666666666666666d);
// flaky:         org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.3333333333333333d + "'", double48 == 0.3333333333333333d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, -1.0, 1.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double58 + "' != '" + 1.0d + "'", double58 == 1.0d);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 35 + "'", int59 == 35);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35 + "'", int62 == 35);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[100.0]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 100.0d + "'", double66 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int2 = empiricalDistributionImpl1.getBinCount();
        double[] doubleArray4 = new double[] { 100.0d };
        empiricalDistributionImpl1.load(doubleArray4);
        boolean boolean6 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary7 = empiricalDistributionImpl1.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary8 = empiricalDistributionImpl1.getSampleStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl10 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl12 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int13 = empiricalDistributionImpl12.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary14 = empiricalDistributionImpl12.getSampleStats();
        double[] doubleArray18 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl12.load(doubleArray18);
        empiricalDistributionImpl10.load(doubleArray18);
        double[] doubleArray24 = new double[] { (-1.0d), (short) 0, 1L };
        empiricalDistributionImpl10.load(doubleArray24);
        empiricalDistributionImpl1.load(doubleArray24);
        double[] doubleArray27 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl29 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl31 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int32 = empiricalDistributionImpl31.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary33 = empiricalDistributionImpl31.getSampleStats();
        double[] doubleArray37 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl31.load(doubleArray37);
        empiricalDistributionImpl29.load(doubleArray37);
        empiricalDistributionImpl1.load(doubleArray37);
        int int41 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary42 = empiricalDistributionImpl1.getSampleStats();
        double double43 = empiricalDistributionImpl1.getNextValue();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary44 = empiricalDistributionImpl1.getSampleStats();
        int int45 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary46 = empiricalDistributionImpl1.getSampleStats();
        double[] doubleArray47 = empiricalDistributionImpl1.getUpperBounds();
        boolean boolean48 = empiricalDistributionImpl1.isLoaded();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(statisticalSummary7);
        org.junit.Assert.assertNotNull(statisticalSummary8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
        org.junit.Assert.assertNull(statisticalSummary14);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 1.0]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 35 + "'", int32 == 35);
        org.junit.Assert.assertNull(statisticalSummary33);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(statisticalSummary42);
// flaky:         org.junit.Assert.assertTrue("'" + double43 + "' != '" + 1.0d + "'", double43 == 1.0d);
        org.junit.Assert.assertNotNull(statisticalSummary44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 35 + "'", int45 == 35);
        org.junit.Assert.assertNotNull(statisticalSummary46);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int4 = empiricalDistributionImpl3.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = empiricalDistributionImpl3.getSampleStats();
        double[] doubleArray9 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl3.load(doubleArray9);
        empiricalDistributionImpl1.load(doubleArray9);
        double[] doubleArray15 = new double[] { (-1.0d), (short) 0, 1L };
        empiricalDistributionImpl1.load(doubleArray15);
        double double17 = empiricalDistributionImpl1.getNextValue();
        boolean boolean18 = empiricalDistributionImpl1.isLoaded();
        boolean boolean19 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl21 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        boolean boolean22 = empiricalDistributionImpl21.isLoaded();
        int int23 = empiricalDistributionImpl21.getBinCount();
        boolean boolean24 = empiricalDistributionImpl21.isLoaded();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl26 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int27 = empiricalDistributionImpl26.getBinCount();
        double[] doubleArray29 = new double[] { 100.0d };
        empiricalDistributionImpl26.load(doubleArray29);
        empiricalDistributionImpl21.load(doubleArray29);
        empiricalDistributionImpl1.load(doubleArray29);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl34 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray39 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl34.load(doubleArray39);
        double[] doubleArray41 = empiricalDistributionImpl34.getUpperBounds();
        int int42 = empiricalDistributionImpl34.getBinCount();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl44 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl46 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray51 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl46.load(doubleArray51);
        double[] doubleArray53 = empiricalDistributionImpl46.getUpperBounds();
        empiricalDistributionImpl44.load(doubleArray53);
        empiricalDistributionImpl34.load(doubleArray53);
        empiricalDistributionImpl1.load(doubleArray53);
        java.util.List list57 = empiricalDistributionImpl1.getBinStats();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.8506934786614793d + "'", double17 == 0.8506934786614793d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(list57);
    }

    @Test
    @Ignore
  public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray6 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl1.load(doubleArray6);
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        int int9 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl11 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray16 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl11.load(doubleArray16);
        double[] doubleArray18 = empiricalDistributionImpl11.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray18);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary20 = empiricalDistributionImpl1.getSampleStats();
        boolean boolean21 = empiricalDistributionImpl1.isLoaded();
        java.util.List list22 = empiricalDistributionImpl1.getBinStats();
        double double23 = empiricalDistributionImpl1.getNextValue();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(list22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.75d + "'", double23 == 0.75d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int2 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary3 = empiricalDistributionImpl1.getSampleStats();
        double[] doubleArray7 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl1.load(doubleArray7);
        int int9 = empiricalDistributionImpl1.getBinCount();
        java.util.List list10 = empiricalDistributionImpl1.getBinStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl12 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl14 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int15 = empiricalDistributionImpl14.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary16 = empiricalDistributionImpl14.getSampleStats();
        double[] doubleArray20 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl14.load(doubleArray20);
        empiricalDistributionImpl12.load(doubleArray20);
        double[] doubleArray26 = new double[] { (-1.0d), (short) 0, 1L };
        empiricalDistributionImpl12.load(doubleArray26);
        double[] doubleArray28 = empiricalDistributionImpl12.getUpperBounds();
        double double29 = empiricalDistributionImpl12.getNextValue();
        boolean boolean30 = empiricalDistributionImpl12.isLoaded();
        int int31 = empiricalDistributionImpl12.getBinCount();
        java.util.List list32 = empiricalDistributionImpl12.getBinStats();
        java.util.List list33 = empiricalDistributionImpl12.getBinStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl35 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl37 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray42 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl37.load(doubleArray42);
        double[] doubleArray44 = empiricalDistributionImpl37.getUpperBounds();
        empiricalDistributionImpl35.load(doubleArray44);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl47 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int48 = empiricalDistributionImpl47.getBinCount();
        double[] doubleArray50 = new double[] { 100.0d };
        empiricalDistributionImpl47.load(doubleArray50);
        empiricalDistributionImpl35.load(doubleArray50);
        java.util.List list53 = empiricalDistributionImpl35.getBinStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary54 = empiricalDistributionImpl35.getSampleStats();
        double double55 = empiricalDistributionImpl35.getNextValue();
        double double56 = empiricalDistributionImpl35.getNextValue();
        int int57 = empiricalDistributionImpl35.getBinCount();
        double[] doubleArray58 = empiricalDistributionImpl35.getUpperBounds();
        empiricalDistributionImpl12.load(doubleArray58);
        empiricalDistributionImpl1.load(doubleArray58);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNull(statisticalSummary3);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(list10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertNull(statisticalSummary16);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0910354539736496d + "'", double29 == 0.0910354539736496d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertNotNull(list32);
        org.junit.Assert.assertNotNull(list33);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 35 + "'", int48 == 35);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0]");
        org.junit.Assert.assertNotNull(list53);
        org.junit.Assert.assertNotNull(statisticalSummary54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 100.0d + "'", double55 == 100.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 35 + "'", int57 == 35);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray8 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl3.load(doubleArray8);
        double[] doubleArray10 = empiricalDistributionImpl3.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray10);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl13 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int14 = empiricalDistributionImpl13.getBinCount();
        double[] doubleArray16 = new double[] { 100.0d };
        empiricalDistributionImpl13.load(doubleArray16);
        empiricalDistributionImpl1.load(doubleArray16);
        double[] doubleArray19 = empiricalDistributionImpl1.getUpperBounds();
        double double20 = empiricalDistributionImpl1.getNextValue();
        boolean boolean21 = empiricalDistributionImpl1.isLoaded();
        double[] doubleArray22 = empiricalDistributionImpl1.getUpperBounds();
        int int23 = empiricalDistributionImpl1.getBinCount();
        int int24 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary25 = empiricalDistributionImpl1.getSampleStats();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[100.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 35 + "'", int24 == 35);
        org.junit.Assert.assertNotNull(statisticalSummary25);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray6 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl1.load(doubleArray6);
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        int int9 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl11 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl13 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray18 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl13.load(doubleArray18);
        double[] doubleArray20 = empiricalDistributionImpl13.getUpperBounds();
        empiricalDistributionImpl11.load(doubleArray20);
        empiricalDistributionImpl1.load(doubleArray20);
        java.util.List list23 = empiricalDistributionImpl1.getBinStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl25 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int26 = empiricalDistributionImpl25.getBinCount();
        double[] doubleArray28 = new double[] { 100.0d };
        empiricalDistributionImpl25.load(doubleArray28);
        boolean boolean30 = empiricalDistributionImpl25.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary31 = empiricalDistributionImpl25.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary32 = empiricalDistributionImpl25.getSampleStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl34 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl36 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int37 = empiricalDistributionImpl36.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary38 = empiricalDistributionImpl36.getSampleStats();
        double[] doubleArray42 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl36.load(doubleArray42);
        empiricalDistributionImpl34.load(doubleArray42);
        double[] doubleArray48 = new double[] { (-1.0d), (short) 0, 1L };
        empiricalDistributionImpl34.load(doubleArray48);
        empiricalDistributionImpl25.load(doubleArray48);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl52 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl54 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int55 = empiricalDistributionImpl54.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary56 = empiricalDistributionImpl54.getSampleStats();
        double[] doubleArray60 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl54.load(doubleArray60);
        empiricalDistributionImpl52.load(doubleArray60);
        empiricalDistributionImpl25.load(doubleArray60);
        empiricalDistributionImpl1.load(doubleArray60);
        double double65 = empiricalDistributionImpl1.getNextValue();
        boolean boolean66 = empiricalDistributionImpl1.isLoaded();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(statisticalSummary31);
        org.junit.Assert.assertNotNull(statisticalSummary32);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 35 + "'", int37 == 35);
        org.junit.Assert.assertNull(statisticalSummary38);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 35 + "'", int55 == 35);
        org.junit.Assert.assertNull(statisticalSummary56);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl(52);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl5 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int6 = empiricalDistributionImpl5.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary7 = empiricalDistributionImpl5.getSampleStats();
        double[] doubleArray11 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl5.load(doubleArray11);
        empiricalDistributionImpl3.load(doubleArray11);
        double[] doubleArray17 = new double[] { (-1.0d), (short) 0, 1L };
        empiricalDistributionImpl3.load(doubleArray17);
        double double19 = empiricalDistributionImpl3.getNextValue();
        boolean boolean20 = empiricalDistributionImpl3.isLoaded();
        boolean boolean21 = empiricalDistributionImpl3.isLoaded();
        double[] doubleArray22 = empiricalDistributionImpl3.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray22);
        double[] doubleArray24 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary25 = empiricalDistributionImpl1.getSampleStats();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35 + "'", int6 == 35);
        org.junit.Assert.assertNull(statisticalSummary7);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.25815114746964235d + "'", double19 == 0.25815114746964235d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary25);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int4 = empiricalDistributionImpl3.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = empiricalDistributionImpl3.getSampleStats();
        double[] doubleArray9 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl3.load(doubleArray9);
        empiricalDistributionImpl1.load(doubleArray9);
        double[] doubleArray15 = new double[] { (-1.0d), (short) 0, 1L };
        empiricalDistributionImpl1.load(doubleArray15);
        double[] doubleArray17 = empiricalDistributionImpl1.getUpperBounds();
        double double18 = empiricalDistributionImpl1.getNextValue();
        boolean boolean19 = empiricalDistributionImpl1.isLoaded();
        int int20 = empiricalDistributionImpl1.getBinCount();
        int int21 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary22 = empiricalDistributionImpl1.getSampleStats();
        java.util.List list23 = empiricalDistributionImpl1.getBinStats();
        boolean boolean24 = empiricalDistributionImpl1.isLoaded();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.13212715869642114d + "'", double18 == 0.13212715869642114d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(statisticalSummary22);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }
}
