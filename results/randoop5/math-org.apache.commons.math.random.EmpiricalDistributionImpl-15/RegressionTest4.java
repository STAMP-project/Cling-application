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
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl3 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int4 = empiricalDistributionImpl3.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary5 = empiricalDistributionImpl3.getSampleStats();
        double[] doubleArray9 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl3.load(doubleArray9);
        empiricalDistributionImpl1.load(doubleArray9);
        int int12 = empiricalDistributionImpl1.getBinCount();
        int int13 = empiricalDistributionImpl1.getBinCount();
        double double14 = empiricalDistributionImpl1.getNextValue();
        double double15 = empiricalDistributionImpl1.getNextValue();
        double[] doubleArray16 = empiricalDistributionImpl1.getUpperBounds();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
// flaky:         org.junit.Assert.assertTrue("'" + double15 + "' != '" + 32.0d + "'", double15 == 32.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 10);
        int int2 = empiricalDistributionImpl1.getBinCount();
        java.util.List list3 = empiricalDistributionImpl1.getBinStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl5 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl7 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int8 = empiricalDistributionImpl7.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = empiricalDistributionImpl7.getSampleStats();
        double[] doubleArray13 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl7.load(doubleArray13);
        empiricalDistributionImpl5.load(doubleArray13);
        int int16 = empiricalDistributionImpl5.getBinCount();
        java.util.List list17 = empiricalDistributionImpl5.getBinStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary18 = empiricalDistributionImpl5.getSampleStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl20 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        boolean boolean21 = empiricalDistributionImpl20.isLoaded();
        int int22 = empiricalDistributionImpl20.getBinCount();
        boolean boolean23 = empiricalDistributionImpl20.isLoaded();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl25 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl27 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int28 = empiricalDistributionImpl27.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary29 = empiricalDistributionImpl27.getSampleStats();
        double[] doubleArray33 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl27.load(doubleArray33);
        empiricalDistributionImpl25.load(doubleArray33);
        double[] doubleArray39 = new double[] { (-1.0d), (short) 0, 1L };
        empiricalDistributionImpl25.load(doubleArray39);
        double[] doubleArray41 = empiricalDistributionImpl25.getUpperBounds();
        double double42 = empiricalDistributionImpl25.getNextValue();
        boolean boolean43 = empiricalDistributionImpl25.isLoaded();
        double[] doubleArray44 = empiricalDistributionImpl25.getUpperBounds();
        empiricalDistributionImpl20.load(doubleArray44);
        empiricalDistributionImpl5.load(doubleArray44);
        double[] doubleArray47 = empiricalDistributionImpl5.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(list3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNull(statisticalSummary9);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
        org.junit.Assert.assertNotNull(list17);
        org.junit.Assert.assertNotNull(statisticalSummary18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35 + "'", int28 == 35);
        org.junit.Assert.assertNull(statisticalSummary29);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-0.4333375665082928d) + "'", double42 == (-0.4333375665082928d));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        int int22 = empiricalDistributionImpl1.getBinCount();
        java.util.List list23 = empiricalDistributionImpl1.getBinStats();
        boolean boolean24 = empiricalDistributionImpl1.isLoaded();
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
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertNotNull(list23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int2 = empiricalDistributionImpl1.getBinCount();
        double[] doubleArray4 = new double[] { 100.0d };
        empiricalDistributionImpl1.load(doubleArray4);
        boolean boolean6 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary7 = empiricalDistributionImpl1.getSampleStats();
        int int8 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = empiricalDistributionImpl1.getSampleStats();
        boolean boolean10 = empiricalDistributionImpl1.isLoaded();
        boolean boolean11 = empiricalDistributionImpl1.isLoaded();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(statisticalSummary7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(statisticalSummary9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary21 = empiricalDistributionImpl1.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary22 = empiricalDistributionImpl1.getSampleStats();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl24 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (short) 10);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl26 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int27 = empiricalDistributionImpl26.getBinCount();
        double[] doubleArray29 = new double[] { 100.0d };
        empiricalDistributionImpl26.load(doubleArray29);
        boolean boolean31 = empiricalDistributionImpl26.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary32 = empiricalDistributionImpl26.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary33 = empiricalDistributionImpl26.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary34 = empiricalDistributionImpl26.getSampleStats();
        double[] doubleArray35 = empiricalDistributionImpl26.getUpperBounds();
        empiricalDistributionImpl24.load(doubleArray35);
        empiricalDistributionImpl1.load(doubleArray35);
        java.util.List list38 = empiricalDistributionImpl1.getBinStats();
        boolean boolean39 = empiricalDistributionImpl1.isLoaded();
        java.util.List list40 = empiricalDistributionImpl1.getBinStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary41 = empiricalDistributionImpl1.getSampleStats();
        int int42 = empiricalDistributionImpl1.getBinCount();
        boolean boolean43 = empiricalDistributionImpl1.isLoaded();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.026847344537078273d) + "'", double18 == (-0.026847344537078273d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(statisticalSummary21);
        org.junit.Assert.assertNotNull(statisticalSummary22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 35 + "'", int27 == 35);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(statisticalSummary32);
        org.junit.Assert.assertNotNull(statisticalSummary33);
        org.junit.Assert.assertNotNull(statisticalSummary34);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(list38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(list40);
        org.junit.Assert.assertNotNull(statisticalSummary41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary11 = empiricalDistributionImpl1.getSampleStats();
        int int12 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl14 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 1);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl16 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int17 = empiricalDistributionImpl16.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary18 = empiricalDistributionImpl16.getSampleStats();
        double[] doubleArray22 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl16.load(doubleArray22);
        empiricalDistributionImpl14.load(doubleArray22);
        empiricalDistributionImpl1.load(doubleArray22);
        double[] doubleArray26 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary27 = empiricalDistributionImpl1.getSampleStats();
        double[] doubleArray28 = empiricalDistributionImpl1.getUpperBounds();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(statisticalSummary11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
        org.junit.Assert.assertNull(statisticalSummary18);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 1.0]");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary27 = empiricalDistributionImpl1.getSampleStats();
        double[] doubleArray28 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl30 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray35 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl30.load(doubleArray35);
        double[] doubleArray37 = empiricalDistributionImpl30.getUpperBounds();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl39 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl41 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int42 = empiricalDistributionImpl41.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary43 = empiricalDistributionImpl41.getSampleStats();
        double[] doubleArray47 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl41.load(doubleArray47);
        empiricalDistributionImpl39.load(doubleArray47);
        empiricalDistributionImpl30.load(doubleArray47);
        double double51 = empiricalDistributionImpl30.getNextValue();
        java.util.List list52 = empiricalDistributionImpl30.getBinStats();
        int int53 = empiricalDistributionImpl30.getBinCount();
        java.util.List list54 = empiricalDistributionImpl30.getBinStats();
        double double55 = empiricalDistributionImpl30.getNextValue();
        java.util.List list56 = empiricalDistributionImpl30.getBinStats();
        double[] doubleArray57 = empiricalDistributionImpl30.getUpperBounds();
        double[] doubleArray58 = empiricalDistributionImpl30.getUpperBounds();
        java.util.List list59 = empiricalDistributionImpl30.getBinStats();
        double[] doubleArray60 = empiricalDistributionImpl30.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray60);
        int int62 = empiricalDistributionImpl1.getBinCount();
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
        org.junit.Assert.assertNotNull(statisticalSummary27);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNull(statisticalSummary43);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double51 + "' != '" + 1.0d + "'", double51 == 1.0d);
        org.junit.Assert.assertNotNull(list52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 35 + "'", int53 == 35);
        org.junit.Assert.assertNotNull(list54);
// flaky:         org.junit.Assert.assertTrue("'" + double55 + "' != '" + 32.0d + "'", double55 == 32.0d);
        org.junit.Assert.assertNotNull(list56);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 1.0]");
        org.junit.Assert.assertNotNull(list59);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 1.0]");
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 35 + "'", int62 == 35);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl28 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl30 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int31 = empiricalDistributionImpl30.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary32 = empiricalDistributionImpl30.getSampleStats();
        double[] doubleArray36 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl30.load(doubleArray36);
        empiricalDistributionImpl28.load(doubleArray36);
        empiricalDistributionImpl1.load(doubleArray36);
        double double40 = empiricalDistributionImpl1.getNextValue();
        java.net.URL uRL41 = null;
        // The following exception was thrown during execution in test generation
        try {
            empiricalDistributionImpl1.load(uRL41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(list9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNull(statisticalSummary15);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double22 + "' != '" + 1.0d + "'", double22 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertNotNull(statisticalSummary26);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertNull(statisticalSummary32);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double40 + "' != '" + 32.0d + "'", double40 == 32.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl24 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl26 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray31 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl26.load(doubleArray31);
        double[] doubleArray33 = empiricalDistributionImpl26.getUpperBounds();
        empiricalDistributionImpl24.load(doubleArray33);
        empiricalDistributionImpl1.load(doubleArray33);
        double[] doubleArray36 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary37 = empiricalDistributionImpl1.getSampleStats();
        java.util.List list38 = empiricalDistributionImpl1.getBinStats();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.17142857142857143, 0.9714285714285715, 0.9714285714285715, 0.9714285714285715, 0.9714285714285715, 0.9714285714285715, 0.9714285714285715, 0.9714285714285715, 0.9714285714285715, 0.9714285714285715, 0.9714285714285715, 0.9714285714285715, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary37);
        org.junit.Assert.assertNotNull(list38);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray6 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl1.load(doubleArray6);
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        int int9 = empiricalDistributionImpl1.getBinCount();
        double[] doubleArray10 = empiricalDistributionImpl1.getUpperBounds();
        java.util.List list11 = empiricalDistributionImpl1.getBinStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary12 = empiricalDistributionImpl1.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary13 = empiricalDistributionImpl1.getSampleStats();
        int int14 = empiricalDistributionImpl1.getBinCount();
        java.util.List list15 = empiricalDistributionImpl1.getBinStats();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertNotNull(statisticalSummary12);
        org.junit.Assert.assertNotNull(statisticalSummary13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertNotNull(list15);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary21 = empiricalDistributionImpl1.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary22 = empiricalDistributionImpl1.getSampleStats();
        boolean boolean23 = empiricalDistributionImpl1.isLoaded();
        boolean boolean24 = empiricalDistributionImpl1.isLoaded();
        java.util.List list25 = empiricalDistributionImpl1.getBinStats();
        java.util.List list26 = empiricalDistributionImpl1.getBinStats();
        int int27 = empiricalDistributionImpl1.getBinCount();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl29 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        boolean boolean30 = empiricalDistributionImpl29.isLoaded();
        int int31 = empiricalDistributionImpl29.getBinCount();
        boolean boolean32 = empiricalDistributionImpl29.isLoaded();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl34 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int35 = empiricalDistributionImpl34.getBinCount();
        double[] doubleArray37 = new double[] { 100.0d };
        empiricalDistributionImpl34.load(doubleArray37);
        empiricalDistributionImpl29.load(doubleArray37);
        empiricalDistributionImpl1.load(doubleArray37);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary41 = empiricalDistributionImpl1.getSampleStats();
        boolean boolean42 = empiricalDistributionImpl1.isLoaded();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 35 + "'", int4 == 35);
        org.junit.Assert.assertNull(statisticalSummary5);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 32.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-0.6473724069780341d) + "'", double18 == (-0.6473724069780341d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(statisticalSummary21);
        org.junit.Assert.assertNotNull(statisticalSummary22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(list25);
        org.junit.Assert.assertNotNull(list26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 35 + "'", int31 == 35);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 35 + "'", int35 == 35);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0]");
        org.junit.Assert.assertNotNull(statisticalSummary41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int2 = empiricalDistributionImpl1.getBinCount();
        double[] doubleArray4 = new double[] { 100.0d };
        empiricalDistributionImpl1.load(doubleArray4);
        boolean boolean6 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary7 = empiricalDistributionImpl1.getSampleStats();
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = empiricalDistributionImpl1.getSampleStats();
        int int10 = empiricalDistributionImpl1.getBinCount();
        boolean boolean11 = empiricalDistributionImpl1.isLoaded();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(statisticalSummary7);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray6 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl1.load(doubleArray6);
        double[] doubleArray8 = empiricalDistributionImpl1.getUpperBounds();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary9 = empiricalDistributionImpl1.getSampleStats();
        boolean boolean10 = empiricalDistributionImpl1.isLoaded();
        java.util.List list11 = empiricalDistributionImpl1.getBinStats();
        int int12 = empiricalDistributionImpl1.getBinCount();
        boolean boolean13 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary14 = empiricalDistributionImpl1.getSampleStats();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(list11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(statisticalSummary14);
    }

    @Test
    @Ignore
  public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int2 = empiricalDistributionImpl1.getBinCount();
        double[] doubleArray4 = new double[] { 100.0d };
        empiricalDistributionImpl1.load(doubleArray4);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl7 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl9 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int10 = empiricalDistributionImpl9.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary11 = empiricalDistributionImpl9.getSampleStats();
        double[] doubleArray15 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl9.load(doubleArray15);
        empiricalDistributionImpl7.load(doubleArray15);
        double double18 = empiricalDistributionImpl7.getNextValue();
        java.util.List list19 = empiricalDistributionImpl7.getBinStats();
        double double20 = empiricalDistributionImpl7.getNextValue();
        int int21 = empiricalDistributionImpl7.getBinCount();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl23 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl25 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int26 = empiricalDistributionImpl25.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary27 = empiricalDistributionImpl25.getSampleStats();
        double[] doubleArray31 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl25.load(doubleArray31);
        empiricalDistributionImpl23.load(doubleArray31);
        double double34 = empiricalDistributionImpl23.getNextValue();
        java.util.List list35 = empiricalDistributionImpl23.getBinStats();
        double double36 = empiricalDistributionImpl23.getNextValue();
        int int37 = empiricalDistributionImpl23.getBinCount();
        double[] doubleArray38 = empiricalDistributionImpl23.getUpperBounds();
        empiricalDistributionImpl7.load(doubleArray38);
        empiricalDistributionImpl1.load(doubleArray38);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl42 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        double[] doubleArray47 = new double[] { 10, (-1.0d), (byte) 1, (byte) 1 };
        empiricalDistributionImpl42.load(doubleArray47);
        double[] doubleArray49 = empiricalDistributionImpl42.getUpperBounds();
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl51 = new org.apache.commons.math.random.EmpiricalDistributionImpl(100);
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl53 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) '#');
        int int54 = empiricalDistributionImpl53.getBinCount();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary55 = empiricalDistributionImpl53.getSampleStats();
        double[] doubleArray59 = new double[] { (byte) 10, ' ', 1.0f };
        empiricalDistributionImpl53.load(doubleArray59);
        empiricalDistributionImpl51.load(doubleArray59);
        empiricalDistributionImpl42.load(doubleArray59);
        double double63 = empiricalDistributionImpl42.getNextValue();
        double double64 = empiricalDistributionImpl42.getNextValue();
        double[] doubleArray65 = empiricalDistributionImpl42.getUpperBounds();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary66 = empiricalDistributionImpl42.getSampleStats();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary67 = empiricalDistributionImpl42.getSampleStats();
        double[] doubleArray68 = empiricalDistributionImpl42.getUpperBounds();
        empiricalDistributionImpl1.load(doubleArray68);
        java.io.File file70 = null;
        // The following exception was thrown during execution in test generation
        try {
            empiricalDistributionImpl1.load(file70);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNull(statisticalSummary11);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(list19);
// flaky:         org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 35 + "'", int26 == 35);
        org.junit.Assert.assertNull(statisticalSummary27);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double34 + "' != '" + 32.0d + "'", double34 == 32.0d);
        org.junit.Assert.assertNotNull(list35);
// flaky:         org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 100 + "'", int37 == 100);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, -1.0, 1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.25, 0.25, 0.25, 0.25, 0.25, 0.25, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 0.75, 1.0]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
        org.junit.Assert.assertNull(statisticalSummary55);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 32.0, 1.0]");
// flaky:         org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary66);
        org.junit.Assert.assertNotNull(statisticalSummary67);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.3333333333333333, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 0.6666666666666666, 1.0]");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.random.EmpiricalDistributionImpl empiricalDistributionImpl1 = new org.apache.commons.math.random.EmpiricalDistributionImpl((int) (byte) 100);
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary2 = empiricalDistributionImpl1.getSampleStats();
        boolean boolean3 = empiricalDistributionImpl1.isLoaded();
        org.apache.commons.math.stat.descriptive.StatisticalSummary statisticalSummary4 = empiricalDistributionImpl1.getSampleStats();
        java.io.File file5 = null;
        // The following exception was thrown during execution in test generation
        try {
            empiricalDistributionImpl1.load(file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(statisticalSummary2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(statisticalSummary4);
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
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
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
        java.io.File file48 = null;
        // The following exception was thrown during execution in test generation
        try {
            empiricalDistributionImpl1.load(file48);
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
// flaky:         org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.29, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 0.99, 1.0]");
        org.junit.Assert.assertNotNull(statisticalSummary45);
        org.junit.Assert.assertNotNull(list46);
// flaky:         org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.6666666666666666d + "'", double47 == 0.6666666666666666d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
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
// flaky:         org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(list13);
// flaky:         org.junit.Assert.assertTrue("'" + double14 + "' != '" + 32.0d + "'", double14 == 32.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
}
