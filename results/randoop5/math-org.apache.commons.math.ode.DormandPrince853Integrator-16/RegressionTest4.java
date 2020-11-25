import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1L, (double) 0.0f, (double) (short) 1, (double) 8);
        double double5 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int6 = dormandPrince853Integrator4.getOrder();
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler8);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) (byte) 0);
        java.lang.String str13 = dormandPrince853Integrator10.getName();
        double double14 = dormandPrince853Integrator10.getMaxStep();
        double double15 = dormandPrince853Integrator10.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        dormandPrince853Integrator10.addSwitchingFunction(switchingFunction16, (double) (byte) 1, (double) 1L, 100);
        double double21 = dormandPrince853Integrator10.getMaxStep();
        double double22 = dormandPrince853Integrator10.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) ' ', (double) 10L, (double) (byte) 1);
        int int5 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNull(stepHandler8);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        double double5 = dormandPrince853Integrator4.getSafety();
        int int6 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMaxGrowth((double) 100L);
        dormandPrince853Integrator4.setMaxGrowth((double) 10L);
        dormandPrince853Integrator4.setSafety((double) (short) 0);
        dormandPrince853Integrator4.setMinReduction(Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler15 = dormandPrince853Integrator4.getStepHandler();
        int int16 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 0, (double) 0, 52.0d, 2.8284271247461903d);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        org.apache.commons.math.ode.StepHandler stepHandler7 = dormandPrince853Integrator6.getStepHandler();
        double double8 = dormandPrince853Integrator6.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler9 = dormandPrince853Integrator6.getStepHandler();
        int int10 = dormandPrince853Integrator6.getOrder();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double[] doubleArray4 = null;
        double[] doubleArray9 = new double[] { (-1.0d), 0L };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator11 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray9, doubleArray10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray4, doubleArray10);
        double[] doubleArray19 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray10, doubleArray19);
        dormandPrince853Integrator20.setMaxGrowth((double) (byte) 10);
        double double23 = dormandPrince853Integrator20.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator20.getStepHandler();
        int int25 = dormandPrince853Integrator20.getOrder();
        dormandPrince853Integrator20.setSafety((double) (-1.0f));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        dormandPrince853Integrator20.addSwitchingFunction(switchingFunction28, 32.0d, (double) ' ', (-1));
        double double33 = dormandPrince853Integrator20.getCurrentStepStart();
        double double34 = dormandPrince853Integrator20.getMaxGrowth();
        double double35 = dormandPrince853Integrator20.getSafety();
        java.lang.String str36 = dormandPrince853Integrator20.getName();
        int int37 = dormandPrince853Integrator20.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction38 = null;
        dormandPrince853Integrator20.addSwitchingFunction(switchingFunction38, (double) (byte) 0, Double.NaN, 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str36, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) (byte) 10, (double) (byte) 0, (double) (short) 0);
        double double5 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, (-1.0d), 2.5298221281347035d, 22.80350850198276d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) 0, (double) 10, (int) '4');
        org.apache.commons.math.ode.StepHandler stepHandler14 = dormandPrince853Integrator6.getStepHandler();
        double double15 = dormandPrince853Integrator6.getMaxGrowth();
        dormandPrince853Integrator6.setInitialStepSize((double) 10L);
        double double18 = dormandPrince853Integrator6.getSafety();
        double double19 = dormandPrince853Integrator6.getMaxStep();
        dormandPrince853Integrator6.setInitialStepSize((double) 0.0f);
        dormandPrince853Integrator6.setSafety((double) 1.0f);
        double double24 = dormandPrince853Integrator6.getSafety();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9d + "'", double18 == 0.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 1.0d + "'", double24 == 1.0d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(2.5298221281347035d, (double) '#', 35.0d, 47.753019278348006d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler6 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler6);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (-1L), (-1.0d), (double) ' ');
        dormandPrince853Integrator4.setInitialStepSize(0.2d);
        dormandPrince853Integrator4.setMinReduction(0.0d);
        double double9 = dormandPrince853Integrator4.getSafety();
        java.lang.String str10 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str10, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) 100);
        double double13 = dormandPrince853Integrator10.getSafety();
        dormandPrince853Integrator10.setMaxGrowth((double) (-1));
        double double16 = dormandPrince853Integrator10.getMaxStep();
        double double17 = dormandPrince853Integrator10.getMinReduction();
        dormandPrince853Integrator10.setMaxGrowth(0.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        double double5 = dormandPrince853Integrator4.getSafety();
        int int6 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMinReduction(0.0d);
        dormandPrince853Integrator4.setMaxGrowth(22.80350850198276d);
        dormandPrince853Integrator4.setMaxGrowth((double) 1L);
        org.apache.commons.math.ode.StepHandler stepHandler13 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler13);
        double double15 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setMinReduction((double) 100L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction18, (double) (short) 100, (double) 1, 0);
        double double23 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        dormandPrince853Integrator6.setMaxGrowth((double) 0L);
        double double9 = dormandPrince853Integrator6.getMaxStep();
        dormandPrince853Integrator6.setSafety((-1.0d));
        double double12 = dormandPrince853Integrator6.getMinStep();
        dormandPrince853Integrator6.setInitialStepSize(6.841052550594828d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        org.apache.commons.math.ode.StepHandler stepHandler7 = dormandPrince853Integrator6.getStepHandler();
        dormandPrince853Integrator6.setMaxGrowth((double) 10.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction10, (double) (byte) 100, 31.622776601683793d, 100);
        dormandPrince853Integrator6.setInitialStepSize((double) 100);
        java.lang.String str17 = dormandPrince853Integrator6.getName();
        double double18 = dormandPrince853Integrator6.getSafety();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str17, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9d + "'", double18 == 0.9d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) '#', 1.0d, (double) (-1.0f));
        dormandPrince853Integrator4.setInitialStepSize((double) 10L);
        double double7 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double8 = dormandPrince853Integrator4.getSafety();
        double[] doubleArray11 = null;
        double[] doubleArray16 = new double[] { (-1.0d), 0L };
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray16, doubleArray17);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray11, doubleArray17);
        dormandPrince853Integrator19.setMinReduction((double) (byte) 0);
        java.lang.String str22 = dormandPrince853Integrator19.getName();
        double double23 = dormandPrince853Integrator19.getMaxStep();
        double double24 = dormandPrince853Integrator19.getCurrentStepStart();
        double double25 = dormandPrince853Integrator19.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler26 = dormandPrince853Integrator19.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler27 = dormandPrince853Integrator19.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler27);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str22, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertNotNull(stepHandler27);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray15 = null;
        double[] doubleArray20 = new double[] { (-1.0d), 0L };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray20, doubleArray21);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray15, doubleArray21);
        double[] doubleArray30 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator31 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray21, doubleArray30);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, 52.0d, doubleArray9, doubleArray21);
        double[] doubleArray41 = new double[] { (-1.0d), 0L };
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray41, doubleArray42);
        double[] doubleArray46 = null;
        double[] doubleArray51 = new double[] { (-1.0d), 0L };
        double[] doubleArray52 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator53 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray51, doubleArray52);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator54 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray46, doubleArray52);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator55 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, (double) 100, doubleArray41, doubleArray52);
        double[] doubleArray58 = null;
        double[] doubleArray63 = null;
        double[] doubleArray68 = new double[] { (-1.0d), 0L };
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator70 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray68, doubleArray69);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator71 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray63, doubleArray69);
        double[] doubleArray78 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator79 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray69, doubleArray78);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator80 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1L, (double) (-1L), doubleArray58, doubleArray69);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator81 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (-1.0f), (double) (byte) 100, doubleArray41, doubleArray69);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator82 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 0, 0.0d, doubleArray9, doubleArray69);
        double double83 = dormandPrince853Integrator82.getCurrentSignedStepsize();
        java.lang.String str84 = dormandPrince853Integrator82.getName();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str84, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        org.apache.commons.math.ode.StepHandler stepHandler7 = dormandPrince853Integrator6.getStepHandler();
        double double8 = dormandPrince853Integrator6.getMaxStep();
        double[] doubleArray11 = null;
        double[] doubleArray16 = new double[] { (-1.0d), 0L };
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray16, doubleArray17);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray11, doubleArray17);
        dormandPrince853Integrator19.setMinReduction((double) (byte) 0);
        java.lang.String str22 = dormandPrince853Integrator19.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator27 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler28 = dormandPrince853Integrator27.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler29 = dormandPrince853Integrator27.getStepHandler();
        dormandPrince853Integrator19.setStepHandler(stepHandler29);
        dormandPrince853Integrator6.setStepHandler(stepHandler29);
        int int32 = dormandPrince853Integrator6.getOrder();
        double double33 = dormandPrince853Integrator6.getCurrentStepStart();
        double double34 = dormandPrince853Integrator6.getMinStep();
        double[] doubleArray43 = null;
        double[] doubleArray48 = new double[] { (-1.0d), 0L };
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator50 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray48, doubleArray49);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator51 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray43, doubleArray49);
        double[] doubleArray58 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator59 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray49, doubleArray58);
        double[] doubleArray62 = new double[] { (short) 0, (-1L) };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator63 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) 0.0f, doubleArray49, doubleArray62);
        double[] doubleArray70 = null;
        double[] doubleArray75 = new double[] { (-1.0d), 0L };
        double[] doubleArray76 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator77 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray75, doubleArray76);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator78 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray70, doubleArray76);
        double[] doubleArray85 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator86 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray76, doubleArray85);
        double[] doubleArray89 = new double[] { (short) 0, (-1L) };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator90 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) 0.0f, doubleArray76, doubleArray89);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator91 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) 1L, doubleArray49, doubleArray89);
        dormandPrince853Integrator91.setMaxGrowth((double) 0.0f);
        org.apache.commons.math.ode.StepHandler stepHandler94 = dormandPrince853Integrator91.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler95 = dormandPrince853Integrator91.getStepHandler();
        dormandPrince853Integrator6.setStepHandler(stepHandler95);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str22, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler94);
        org.junit.Assert.assertNotNull(stepHandler95);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray11 = null;
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator(100.0d, (double) (short) 0, doubleArray9, doubleArray11);
        double[] doubleArray19 = new double[] { (-1.0d), 0L };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray19, doubleArray20);
        double[] doubleArray24 = null;
        double[] doubleArray29 = new double[] { (-1.0d), 0L };
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator31 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray29, doubleArray30);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray24, doubleArray30);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator33 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, (double) 100, doubleArray19, doubleArray30);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator34 = new org.apache.commons.math.ode.DormandPrince853Integrator(32.0d, 31.144823004794873d, doubleArray9, doubleArray19);
        int int35 = dormandPrince853Integrator34.getOrder();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(22.80350850198276d, (double) '#', (double) (short) 10, (double) (byte) 0);
        dormandPrince853Integrator4.setInitialStepSize((-1.0d));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction7, 8.0d, 8.0d, (int) (short) 1);
        dormandPrince853Integrator4.setInitialStepSize((double) (-1.0f));
        double double14 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (-1L), (-1.0d), (double) ' ');
        dormandPrince853Integrator4.setInitialStepSize(0.2d);
        dormandPrince853Integrator4.setMinReduction(0.0d);
        java.lang.String str9 = dormandPrince853Integrator4.getName();
        double double10 = dormandPrince853Integrator4.getMaxGrowth();
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str9, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(59.16079783099616d, 2.8284271247461903d, (double) 1, (double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        double double5 = dormandPrince853Integrator4.getSafety();
        int int6 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMinReduction(0.0d);
        dormandPrince853Integrator4.setMaxGrowth(22.80350850198276d);
        dormandPrince853Integrator4.setMaxGrowth((double) 1L);
        int int13 = dormandPrince853Integrator4.getOrder();
        java.lang.Class<?> wildcardClass14 = dormandPrince853Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double[] doubleArray4 = null;
        double[] doubleArray9 = new double[] { (-1.0d), 0L };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator11 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray9, doubleArray10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray4, doubleArray10);
        double[] doubleArray19 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray10, doubleArray19);
        dormandPrince853Integrator20.setMaxGrowth((double) (byte) 10);
        double double23 = dormandPrince853Integrator20.getMinStep();
        dormandPrince853Integrator20.setSafety((double) (short) 100);
        double double26 = dormandPrince853Integrator20.getMaxStep();
        dormandPrince853Integrator20.setMaxGrowth((double) 0L);
        double double29 = dormandPrince853Integrator20.getCurrentStepStart();
        dormandPrince853Integrator20.setMinReduction((double) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler32 = dormandPrince853Integrator20.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(stepHandler32);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (-1.0d), (double) (short) -1, (double) (short) 10);
        double[] doubleArray7 = null;
        double[] doubleArray12 = new double[] { (-1.0d), 0L };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator14 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray12, doubleArray13);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray7, doubleArray13);
        dormandPrince853Integrator15.setMinReduction((double) (byte) 0);
        java.lang.String str18 = dormandPrince853Integrator15.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator23.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler25 = dormandPrince853Integrator23.getStepHandler();
        dormandPrince853Integrator15.setStepHandler(stepHandler25);
        dormandPrince853Integrator4.setStepHandler(stepHandler25);
        double double28 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler29 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.9d + "'", double28 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler29);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) 0, (double) 10, (int) '4');
        org.apache.commons.math.ode.StepHandler stepHandler14 = dormandPrince853Integrator6.getStepHandler();
        double double15 = dormandPrince853Integrator6.getMaxGrowth();
        dormandPrince853Integrator6.setInitialStepSize((double) 10L);
        double double18 = dormandPrince853Integrator6.getSafety();
        double double19 = dormandPrince853Integrator6.getMaxStep();
        dormandPrince853Integrator6.setInitialStepSize((double) 0.0f);
        double double22 = dormandPrince853Integrator6.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9d + "'", double18 == 0.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (-1), (double) (byte) 10, (double) 10, (double) 100.0f);
        dormandPrince853Integrator4.setMinReduction(52.0d);
        int int7 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setSafety(0.9d);
        int int10 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        dormandPrince853Integrator6.setMaxGrowth((double) (-1));
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        double double16 = dormandPrince853Integrator15.getSafety();
        int int17 = dormandPrince853Integrator15.getOrder();
        dormandPrince853Integrator15.setMaxGrowth((double) 100L);
        dormandPrince853Integrator15.setMaxGrowth((double) 10L);
        double[] doubleArray26 = null;
        double[] doubleArray31 = new double[] { (-1.0d), 0L };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator33 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray31, doubleArray32);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator34 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray26, doubleArray32);
        double[] doubleArray41 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray32, doubleArray41);
        dormandPrince853Integrator42.setMaxGrowth((double) (byte) 10);
        double double45 = dormandPrince853Integrator42.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler46 = dormandPrince853Integrator42.getStepHandler();
        dormandPrince853Integrator15.setStepHandler(stepHandler46);
        dormandPrince853Integrator6.setStepHandler(stepHandler46);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction49 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction49, (double) ' ', (double) 1.0f, (int) 'a');
        double double54 = dormandPrince853Integrator6.getMinReduction();
        double double55 = dormandPrince853Integrator6.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9d + "'", double16 == 0.9d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.2d + "'", double54 == 0.2d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 0.2d + "'", double55 == 0.2d);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) 100);
        dormandPrince853Integrator10.setMinReduction((double) ' ');
        java.lang.String str15 = dormandPrince853Integrator10.getName();
        dormandPrince853Integrator10.setSafety((double) 10);
        java.lang.String str18 = dormandPrince853Integrator10.getName();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) 100);
        dormandPrince853Integrator10.setMinReduction((double) ' ');
        java.lang.String str15 = dormandPrince853Integrator10.getName();
        double double16 = dormandPrince853Integrator10.getMaxStep();
        double double17 = dormandPrince853Integrator10.getMinReduction();
        double double18 = dormandPrince853Integrator10.getCurrentSignedStepsize();
        double double19 = dormandPrince853Integrator10.getCurrentSignedStepsize();
        dormandPrince853Integrator10.setMinReduction((double) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        dormandPrince853Integrator10.addSwitchingFunction(switchingFunction22, 100.0d, (double) '4', (int) (short) 10);
        dormandPrince853Integrator10.setSafety((-0.0d));
        java.lang.Class<?> wildcardClass29 = dormandPrince853Integrator10.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (-1L), 10.0d, (double) 100.0f, (double) 10.0f);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler6 = dormandPrince853Integrator4.getStepHandler();
        double double7 = dormandPrince853Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(10.0d, 97.0d, (double) (byte) 100, (double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) (byte) 0);
        java.lang.String str13 = dormandPrince853Integrator10.getName();
        double double14 = dormandPrince853Integrator10.getMaxGrowth();
        double double15 = dormandPrince853Integrator10.getMaxGrowth();
        dormandPrince853Integrator10.setMaxGrowth((double) (short) 1);
        double double18 = dormandPrince853Integrator10.getCurrentStepStart();
        double double19 = dormandPrince853Integrator10.getCurrentSignedStepsize();
        double double20 = dormandPrince853Integrator10.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double[] doubleArray10 = new double[] { (-1.0d), 0L };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray10, doubleArray11);
        double[] doubleArray17 = new double[] { (-1.0d), 0L };
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray17, doubleArray18);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, 52.0d, doubleArray10, doubleArray18);
        double[] doubleArray21 = null;
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.2d, (double) ' ', doubleArray10, doubleArray21);
        double[] doubleArray31 = new double[] { (-1.0d), 0L };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator33 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray31, doubleArray32);
        double[] doubleArray38 = null;
        double[] doubleArray43 = new double[] { (-1.0d), 0L };
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator45 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray43, doubleArray44);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator46 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray38, doubleArray44);
        double[] doubleArray53 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator54 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray44, doubleArray53);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator55 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, 52.0d, doubleArray32, doubleArray44);
        double[] doubleArray62 = new double[] { (-1.0d), 0L };
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator64 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray62, doubleArray63);
        double[] doubleArray69 = new double[] { (-1.0d), 0L };
        double[] doubleArray70 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator71 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray69, doubleArray70);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator72 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, 52.0d, doubleArray62, doubleArray70);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator73 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, (double) (-1L), doubleArray32, doubleArray62);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator74 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1L, (double) (short) 1, doubleArray21, doubleArray32);
        dormandPrince853Integrator74.setInitialStepSize((double) 10);
        double double77 = dormandPrince853Integrator74.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[]");
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 1.0d + "'", double77 == 1.0d);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        double double7 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setMinReduction((double) (short) 100);
        dormandPrince853Integrator4.setInitialStepSize((double) 100);
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler13 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler13);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        double double7 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setMinReduction((double) (short) 100);
        dormandPrince853Integrator4.setInitialStepSize((double) 100);
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, Double.NaN, (double) (short) -1, (int) (short) -1);
        double double18 = dormandPrince853Integrator4.getMaxStep();
        dormandPrince853Integrator4.setMaxGrowth((double) (short) 100);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 52.0d + "'", double18 == 52.0d);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        double double5 = dormandPrince853Integrator4.getSafety();
        int int6 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMaxGrowth((double) 100L);
        dormandPrince853Integrator4.setMaxGrowth((double) 10L);
        double[] doubleArray15 = null;
        double[] doubleArray20 = new double[] { (-1.0d), 0L };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray20, doubleArray21);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray15, doubleArray21);
        double[] doubleArray30 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator31 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray21, doubleArray30);
        dormandPrince853Integrator31.setMaxGrowth((double) (byte) 10);
        double double34 = dormandPrince853Integrator31.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler35 = dormandPrince853Integrator31.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler35);
        double[] doubleArray41 = new double[] { (-1.0d), 0L };
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray41, doubleArray42);
        double double44 = dormandPrince853Integrator43.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler45 = dormandPrince853Integrator43.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction46 = null;
        dormandPrince853Integrator43.addSwitchingFunction(switchingFunction46, (double) 0, (double) 10, (int) '4');
        double double51 = dormandPrince853Integrator43.getMinReduction();
        double double52 = dormandPrince853Integrator43.getMinReduction();
        double[] doubleArray57 = new double[] { (-1.0d), 0L };
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator59 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray57, doubleArray58);
        org.apache.commons.math.ode.StepHandler stepHandler60 = dormandPrince853Integrator59.getStepHandler();
        double double61 = dormandPrince853Integrator59.getMaxStep();
        double[] doubleArray64 = null;
        double[] doubleArray69 = new double[] { (-1.0d), 0L };
        double[] doubleArray70 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator71 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray69, doubleArray70);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator72 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray64, doubleArray70);
        dormandPrince853Integrator72.setMinReduction((double) (byte) 0);
        java.lang.String str75 = dormandPrince853Integrator72.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator80 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler81 = dormandPrince853Integrator80.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler82 = dormandPrince853Integrator80.getStepHandler();
        dormandPrince853Integrator72.setStepHandler(stepHandler82);
        dormandPrince853Integrator59.setStepHandler(stepHandler82);
        dormandPrince853Integrator43.setStepHandler(stepHandler82);
        dormandPrince853Integrator4.setStepHandler(stepHandler82);
        double double87 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setSafety(1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertNotNull(stepHandler45);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.2d + "'", double51 == 0.2d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.2d + "'", double52 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertNotNull(stepHandler60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 100.0d + "'", double61 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str75, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler81);
        org.junit.Assert.assertNotNull(stepHandler82);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 22.80350850198276d + "'", double87 == 22.80350850198276d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 'a', (double) 10.0f, (double) 10, (-1.0d));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) 0, (double) 10, (int) '4');
        org.apache.commons.math.ode.StepHandler stepHandler14 = dormandPrince853Integrator6.getStepHandler();
        double[] doubleArray19 = new double[] { (-1.0d), 0L };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray19, doubleArray20);
        org.apache.commons.math.ode.StepHandler stepHandler22 = dormandPrince853Integrator21.getStepHandler();
        double double23 = dormandPrince853Integrator21.getMaxStep();
        double[] doubleArray26 = null;
        double[] doubleArray31 = new double[] { (-1.0d), 0L };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator33 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray31, doubleArray32);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator34 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray26, doubleArray32);
        dormandPrince853Integrator34.setMinReduction((double) (byte) 0);
        java.lang.String str37 = dormandPrince853Integrator34.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler43 = dormandPrince853Integrator42.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler44 = dormandPrince853Integrator42.getStepHandler();
        dormandPrince853Integrator34.setStepHandler(stepHandler44);
        dormandPrince853Integrator21.setStepHandler(stepHandler44);
        dormandPrince853Integrator6.setStepHandler(stepHandler44);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator52 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (-1.0d), (double) (byte) 1, (double) (byte) 0);
        dormandPrince853Integrator52.setInitialStepSize(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler55 = dormandPrince853Integrator52.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler56 = dormandPrince853Integrator52.getStepHandler();
        dormandPrince853Integrator6.setStepHandler(stepHandler56);
        dormandPrince853Integrator6.setInitialStepSize((double) (byte) 10);
        dormandPrince853Integrator6.setInitialStepSize((double) 'a');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str37, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler43);
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertNotNull(stepHandler55);
        org.junit.Assert.assertNotNull(stepHandler56);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) 100);
        dormandPrince853Integrator10.setMinReduction((double) ' ');
        java.lang.String str15 = dormandPrince853Integrator10.getName();
        double double16 = dormandPrince853Integrator10.getMaxStep();
        double double17 = dormandPrince853Integrator10.getMinReduction();
        double double18 = dormandPrince853Integrator10.getMaxGrowth();
        int int19 = dormandPrince853Integrator10.getOrder();
        dormandPrince853Integrator10.setInitialStepSize((double) 'a');
        double double22 = dormandPrince853Integrator10.getSafety();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) 0, (double) 10, (int) '4');
        double double14 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 1, (double) 0L, (double) 1L, (double) 1);
        double double20 = dormandPrince853Integrator19.getCurrentSignedStepsize();
        dormandPrince853Integrator19.setInitialStepSize((double) (byte) 0);
        dormandPrince853Integrator19.setMinReduction((double) (short) 100);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator29 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) 'a', 1.0d, (double) (byte) 1);
        double double30 = dormandPrince853Integrator29.getMaxStep();
        double double31 = dormandPrince853Integrator29.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler32 = dormandPrince853Integrator29.getStepHandler();
        dormandPrince853Integrator19.setStepHandler(stepHandler32);
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator19.getStepHandler();
        dormandPrince853Integrator6.setStepHandler(stepHandler34);
        org.apache.commons.math.ode.StepHandler stepHandler36 = dormandPrince853Integrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 97.0d + "'", double30 == 97.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9d + "'", double31 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler32);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertNotNull(stepHandler36);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) (byte) 0);
        java.lang.String str13 = dormandPrince853Integrator10.getName();
        double double14 = dormandPrince853Integrator10.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        dormandPrince853Integrator10.addSwitchingFunction(switchingFunction15, (double) 10.0f, (double) (short) 1, (int) 'a');
        double double20 = dormandPrince853Integrator10.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        dormandPrince853Integrator10.addSwitchingFunction(switchingFunction21, (double) (byte) 1, 18.708286933869708d, (int) '#');
        org.apache.commons.math.ode.StepHandler stepHandler26 = dormandPrince853Integrator10.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler27 = null;
        dormandPrince853Integrator10.setStepHandler(stepHandler27);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler26);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) '#', 0.0d, 0.0d, 32.0d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 'a', 6.841052550594828d, (double) (short) 100, (double) (short) -1);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (-1), (double) (byte) 10, (double) 10, (double) 100.0f);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        double double6 = dormandPrince853Integrator4.getMaxStep();
        double[] doubleArray9 = null;
        double[] doubleArray14 = new double[] { (-1.0d), 0L };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray14, doubleArray15);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray9, doubleArray15);
        dormandPrince853Integrator17.setMinReduction((double) 100);
        dormandPrince853Integrator17.setMinReduction((double) ' ');
        dormandPrince853Integrator17.setMaxGrowth((double) ' ');
        double double24 = dormandPrince853Integrator17.getMaxStep();
        dormandPrince853Integrator17.setInitialStepSize((double) (short) 10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator31 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) '4', (double) (-1L), 0.0d, (double) (short) 1);
        dormandPrince853Integrator31.setMinReduction((double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator31.getStepHandler();
        dormandPrince853Integrator17.setStepHandler(stepHandler34);
        dormandPrince853Integrator4.setStepHandler(stepHandler34);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler34);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        double double6 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction7, (double) (short) -1, 31.622776601683793d, (int) (byte) 100);
        double double12 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setInitialStepSize((double) (short) 10);
        double double15 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) 100);
        dormandPrince853Integrator10.setMinReduction((double) ' ');
        dormandPrince853Integrator10.setMaxGrowth((double) ' ');
        double double17 = dormandPrince853Integrator10.getMaxStep();
        int int18 = dormandPrince853Integrator10.getOrder();
        int int19 = dormandPrince853Integrator10.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        dormandPrince853Integrator10.addSwitchingFunction(switchingFunction20, (double) '4', (double) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) '4', 52.0d, (double) 0L);
        double double5 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, 35.0d, (double) (byte) -1, (int) (short) 0);
        dormandPrince853Integrator4.setMinReduction((double) '4');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray15 = null;
        double[] doubleArray20 = new double[] { (-1.0d), 0L };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray20, doubleArray21);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray15, doubleArray21);
        double[] doubleArray30 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator31 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray21, doubleArray30);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, 52.0d, doubleArray9, doubleArray21);
        double[] doubleArray35 = null;
        double[] doubleArray40 = new double[] { (-1.0d), 0L };
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray40, doubleArray41);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray35, doubleArray41);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) '#', doubleArray21, doubleArray41);
        double double45 = dormandPrince853Integrator44.getCurrentSignedStepsize();
        dormandPrince853Integrator44.setSafety((double) '#');
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 18.708286933869708d + "'", double45 == 18.708286933869708d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        dormandPrince853Integrator6.setMaxGrowth((double) 0L);
        double double9 = dormandPrince853Integrator6.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler10 = dormandPrince853Integrator6.getStepHandler();
        double double11 = dormandPrince853Integrator6.getMinStep();
        java.lang.Class<?> wildcardClass12 = dormandPrince853Integrator6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        double[] doubleArray6 = new double[] { 10, (-1), (short) -1, 100.0d };
        double[] doubleArray15 = null;
        double[] doubleArray20 = new double[] { (-1.0d), 0L };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray20, doubleArray21);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray15, doubleArray21);
        double[] doubleArray30 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator31 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray21, doubleArray30);
        double[] doubleArray34 = new double[] { (short) 0, (-1L) };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator35 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) 0.0f, doubleArray21, doubleArray34);
        double[] doubleArray42 = null;
        double[] doubleArray47 = new double[] { (-1.0d), 0L };
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator49 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray47, doubleArray48);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator50 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray42, doubleArray48);
        double[] doubleArray57 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator58 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray48, doubleArray57);
        double[] doubleArray61 = new double[] { (short) 0, (-1L) };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator62 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) 0.0f, doubleArray48, doubleArray61);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator63 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) 1L, doubleArray21, doubleArray61);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator64 = new org.apache.commons.math.ode.DormandPrince853Integrator((-1.0d), 1.0d, doubleArray6, doubleArray61);
        dormandPrince853Integrator64.setMaxGrowth((double) 1L);
        double double67 = dormandPrince853Integrator64.getCurrentSignedStepsize();
        double double68 = dormandPrince853Integrator64.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction69 = null;
        dormandPrince853Integrator64.addSwitchingFunction(switchingFunction69, 47.753019278348006d, (double) (short) 100, (int) 'a');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[10.0, -1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, -1.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        double double5 = dormandPrince853Integrator4.getSafety();
        int int6 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMaxGrowth((double) 100L);
        dormandPrince853Integrator4.setMaxGrowth((double) 10L);
        double[] doubleArray15 = null;
        double[] doubleArray20 = new double[] { (-1.0d), 0L };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray20, doubleArray21);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray15, doubleArray21);
        double[] doubleArray30 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator31 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray21, doubleArray30);
        dormandPrince853Integrator31.setMaxGrowth((double) (byte) 10);
        double double34 = dormandPrince853Integrator31.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler35 = dormandPrince853Integrator31.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler35);
        int int37 = dormandPrince853Integrator4.getOrder();
        double double38 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double39 = dormandPrince853Integrator4.getMaxStep();
        double[] doubleArray44 = new double[] { (-1.0d), 0L };
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator46 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray44, doubleArray45);
        org.apache.commons.math.ode.StepHandler stepHandler47 = dormandPrince853Integrator46.getStepHandler();
        dormandPrince853Integrator46.setMaxGrowth((double) 10.0f);
        double double50 = dormandPrince853Integrator46.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler51 = dormandPrince853Integrator46.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler51);
        java.lang.String str53 = dormandPrince853Integrator4.getName();
        double double54 = dormandPrince853Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 22.80350850198276d + "'", double38 == 22.80350850198276d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 52.0d + "'", double39 == 52.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.9d + "'", double50 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str53, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.2d + "'", double54 == 0.2d);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0, (double) 10, (double) 100L, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) '#', (double) (byte) 10, (double) (byte) 10, (double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler11 = dormandPrince853Integrator10.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler11);
        double double13 = dormandPrince853Integrator4.getCurrentStepStart();
        double double14 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) 0, (double) 10, (int) '4');
        org.apache.commons.math.ode.StepHandler stepHandler14 = dormandPrince853Integrator6.getStepHandler();
        double double15 = dormandPrince853Integrator6.getMaxGrowth();
        double double16 = dormandPrince853Integrator6.getMinStep();
        double double17 = dormandPrince853Integrator6.getCurrentSignedStepsize();
        double double18 = dormandPrince853Integrator6.getCurrentStepStart();
        int int19 = dormandPrince853Integrator6.getOrder();
        double double20 = dormandPrince853Integrator6.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 31.622776601683793d + "'", double17 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        double[] doubleArray8 = new double[] { 10, (-1), (short) -1, 100.0d };
        double[] doubleArray17 = null;
        double[] doubleArray22 = new double[] { (-1.0d), 0L };
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray22, doubleArray23);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator25 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray17, doubleArray23);
        double[] doubleArray32 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator33 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray23, doubleArray32);
        double[] doubleArray36 = new double[] { (short) 0, (-1L) };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator37 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) 0.0f, doubleArray23, doubleArray36);
        double[] doubleArray44 = null;
        double[] doubleArray49 = new double[] { (-1.0d), 0L };
        double[] doubleArray50 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator51 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray49, doubleArray50);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator52 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray44, doubleArray50);
        double[] doubleArray59 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator60 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray50, doubleArray59);
        double[] doubleArray63 = new double[] { (short) 0, (-1L) };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator64 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) 0.0f, doubleArray50, doubleArray63);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator65 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) 1L, doubleArray23, doubleArray63);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator66 = new org.apache.commons.math.ode.DormandPrince853Integrator((-1.0d), 1.0d, doubleArray8, doubleArray63);
        double[] doubleArray67 = null;
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator68 = new org.apache.commons.math.ode.DormandPrince853Integrator(52.0d, (double) 8, doubleArray8, doubleArray67);
        java.lang.String str69 = dormandPrince853Integrator68.getName();
        double double70 = dormandPrince853Integrator68.getMinStep();
        double double71 = dormandPrince853Integrator68.getCurrentStepStart();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator76 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, (double) (-1.0f), (double) 1, 0.9d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction77 = null;
        dormandPrince853Integrator76.addSwitchingFunction(switchingFunction77, (double) (short) 10, 1.0d, (int) '#');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction82 = null;
        dormandPrince853Integrator76.addSwitchingFunction(switchingFunction82, 0.0d, 31.144823004794873d, (int) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler87 = dormandPrince853Integrator76.getStepHandler();
        dormandPrince853Integrator68.setStepHandler(stepHandler87);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, -1.0, -1.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, -1.0]");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str69, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 52.0d + "'", double70 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(stepHandler87);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        double[] doubleArray4 = null;
        double[] doubleArray9 = new double[] { (-1.0d), 0L };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator11 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray9, doubleArray10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray4, doubleArray10);
        double[] doubleArray19 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray10, doubleArray19);
        dormandPrince853Integrator20.setMaxGrowth((double) (byte) 10);
        double double23 = dormandPrince853Integrator20.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator20.getStepHandler();
        int int25 = dormandPrince853Integrator20.getOrder();
        dormandPrince853Integrator20.setSafety((double) (-1.0f));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        dormandPrince853Integrator20.addSwitchingFunction(switchingFunction28, 32.0d, (double) ' ', (-1));
        double double33 = dormandPrince853Integrator20.getCurrentStepStart();
        double[] doubleArray36 = null;
        double[] doubleArray41 = new double[] { (-1.0d), 0L };
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray41, doubleArray42);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray36, doubleArray42);
        dormandPrince853Integrator44.setMinReduction((double) (byte) 0);
        java.lang.String str47 = dormandPrince853Integrator44.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator52 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler53 = dormandPrince853Integrator52.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler54 = dormandPrince853Integrator52.getStepHandler();
        dormandPrince853Integrator44.setStepHandler(stepHandler54);
        double double56 = dormandPrince853Integrator44.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler57 = dormandPrince853Integrator44.getStepHandler();
        dormandPrince853Integrator20.setStepHandler(stepHandler57);
        double double59 = dormandPrince853Integrator20.getSafety();
        java.lang.Class<?> wildcardClass60 = dormandPrince853Integrator20.getClass();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str47, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler53);
        org.junit.Assert.assertNotNull(stepHandler54);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.9d + "'", double56 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler57);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        double[] doubleArray4 = null;
        double[] doubleArray9 = new double[] { (-1.0d), 0L };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator11 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray9, doubleArray10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray4, doubleArray10);
        double[] doubleArray19 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray10, doubleArray19);
        dormandPrince853Integrator20.setMaxGrowth((double) (byte) 10);
        dormandPrince853Integrator20.setSafety((double) '#');
        double double25 = dormandPrince853Integrator20.getMaxGrowth();
        double double26 = dormandPrince853Integrator20.getMinReduction();
        double double27 = dormandPrince853Integrator20.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2d + "'", double26 == 0.2d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2d + "'", double27 == 0.2d);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) 0, (double) 10, (int) '4');
        double double14 = dormandPrince853Integrator6.getMaxStep();
        dormandPrince853Integrator6.setSafety(8.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        double double7 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setMinReduction((double) (short) 100);
        double double10 = dormandPrince853Integrator4.getCurrentStepStart();
        int int11 = dormandPrince853Integrator4.getOrder();
        double double12 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setSafety(0.0d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(2.8284271247461903d, 1.0d, (double) ' ', 1.0d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (-1.0d), (double) (byte) 1, (double) (byte) 0);
        double double5 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setSafety((double) 1L);
        double[] doubleArray12 = null;
        double[] doubleArray17 = new double[] { (-1.0d), 0L };
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray17, doubleArray18);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray12, doubleArray18);
        double[] doubleArray27 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator28 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray18, doubleArray27);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator33 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator33.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler35 = dormandPrince853Integrator33.getStepHandler();
        dormandPrince853Integrator28.setStepHandler(stepHandler35);
        dormandPrince853Integrator4.setStepHandler(stepHandler35);
        dormandPrince853Integrator4.setMaxGrowth(0.2d);
        double double40 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) 10L, (double) 10, Double.NaN);
        dormandPrince853Integrator4.setInitialStepSize((double) 0);
        org.apache.commons.math.ode.StepHandler stepHandler7 = dormandPrince853Integrator4.getStepHandler();
        double double8 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, 59.16079783099616d, 31.144823004794873d, (double) (short) 100);
        double double5 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        double double7 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction8, (double) 0, 8.0d, (int) 'a');
        dormandPrince853Integrator4.setSafety(0.2d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 52.0d + "'", double7 == 52.0d);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) (-1.0f), (double) 8, 97.0d);
        int int5 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler6 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(stepHandler6);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) (short) 10, Double.NaN, (int) (byte) -1);
        java.lang.String str14 = dormandPrince853Integrator6.getName();
        double double15 = dormandPrince853Integrator6.getSafety();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str14, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 1, (double) 0L, (double) 1L, (double) 1);
        double double5 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) (byte) 0);
        java.lang.String str13 = dormandPrince853Integrator10.getName();
        double double14 = dormandPrince853Integrator10.getMaxGrowth();
        double double15 = dormandPrince853Integrator10.getMaxGrowth();
        double double16 = dormandPrince853Integrator10.getSafety();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9d + "'", double16 == 0.9d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) 10L, (double) 10, Double.NaN);
        dormandPrince853Integrator4.setInitialStepSize((double) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction7, (double) 1.0f, (double) 10L, (int) (byte) 0);
        double[] doubleArray14 = null;
        double[] doubleArray19 = new double[] { (-1.0d), 0L };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray19, doubleArray20);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray14, doubleArray20);
        double[] doubleArray27 = new double[] { (-1.0d), 0L };
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator29 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray27, doubleArray28);
        org.apache.commons.math.ode.StepHandler stepHandler30 = dormandPrince853Integrator29.getStepHandler();
        dormandPrince853Integrator22.setStepHandler(stepHandler30);
        dormandPrince853Integrator22.setSafety((double) 100);
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator22.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler35 = dormandPrince853Integrator22.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler36 = dormandPrince853Integrator22.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler36);
        double double38 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(stepHandler30);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.0d + "'", double38 == 0.0d);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) 100);
        dormandPrince853Integrator10.setMinReduction((double) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        dormandPrince853Integrator10.addSwitchingFunction(switchingFunction15, 97.0d, 8.0d, (int) ' ');
        java.lang.Class<?> wildcardClass20 = dormandPrince853Integrator10.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) 100);
        dormandPrince853Integrator10.setMinReduction((double) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        dormandPrince853Integrator10.addSwitchingFunction(switchingFunction15, 97.0d, 8.0d, (int) ' ');
        double[] doubleArray28 = new double[] { (-1.0d), 0L };
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator30 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray28, doubleArray29);
        double[] doubleArray35 = null;
        double[] doubleArray40 = new double[] { (-1.0d), 0L };
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray40, doubleArray41);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray35, doubleArray41);
        double[] doubleArray50 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator51 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray41, doubleArray50);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator52 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, 52.0d, doubleArray29, doubleArray41);
        double[] doubleArray59 = new double[] { (-1.0d), 0L };
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator61 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray59, doubleArray60);
        double[] doubleArray66 = new double[] { (-1.0d), 0L };
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator68 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray66, doubleArray67);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator69 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, 52.0d, doubleArray59, doubleArray67);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator70 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, (double) (-1L), doubleArray29, doubleArray59);
        double double71 = dormandPrince853Integrator70.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler72 = dormandPrince853Integrator70.getStepHandler();
        double double73 = dormandPrince853Integrator70.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction74 = null;
        dormandPrince853Integrator70.addSwitchingFunction(switchingFunction74, 0.2d, (double) 1L, (int) (byte) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator83 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 1, (double) 0L, (double) 1L, (double) 1);
        double double84 = dormandPrince853Integrator83.getMinReduction();
        double double85 = dormandPrince853Integrator83.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction86 = null;
        dormandPrince853Integrator83.addSwitchingFunction(switchingFunction86, (double) (byte) 100, (double) 0.0f, (int) '#');
        dormandPrince853Integrator83.setSafety((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler93 = dormandPrince853Integrator83.getStepHandler();
        dormandPrince853Integrator70.setStepHandler(stepHandler93);
        dormandPrince853Integrator10.setStepHandler(stepHandler93);
        double double96 = dormandPrince853Integrator10.getSafety();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 0.2d + "'", double71 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler72);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.9d + "'", double73 == 0.9d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.2d + "'", double84 == 0.2d);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.9d + "'", double85 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler93);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.9d + "'", double96 == 0.9d);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, 22.80350850198276d, (double) 0L, 1.4142135623730951d);
        double[] doubleArray13 = new double[] { (-1.0d), 0L };
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray13, doubleArray14);
        double[] doubleArray20 = null;
        double[] doubleArray25 = new double[] { (-1.0d), 0L };
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator27 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray25, doubleArray26);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator28 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray20, doubleArray26);
        double[] doubleArray35 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray26, doubleArray35);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator37 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, 52.0d, doubleArray14, doubleArray26);
        double[] doubleArray44 = new double[] { (-1.0d), 0L };
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator46 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray44, doubleArray45);
        double[] doubleArray51 = new double[] { (-1.0d), 0L };
        double[] doubleArray52 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator53 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray51, doubleArray52);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator54 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, 52.0d, doubleArray44, doubleArray52);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator55 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, (double) (-1L), doubleArray14, doubleArray44);
        double double56 = dormandPrince853Integrator55.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler57 = dormandPrince853Integrator55.getStepHandler();
        double double58 = dormandPrince853Integrator55.getSafety();
        double double59 = dormandPrince853Integrator55.getCurrentStepStart();
        dormandPrince853Integrator55.setInitialStepSize(10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction62 = null;
        dormandPrince853Integrator55.addSwitchingFunction(switchingFunction62, (double) 8, (double) 100, (int) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler67 = dormandPrince853Integrator55.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler67);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction69 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction69, (double) (short) -1, (double) 0L, (int) '#');
        dormandPrince853Integrator4.setMinReduction(22.80350850198276d);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 0.2d + "'", double56 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.9d + "'", double58 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(stepHandler67);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        org.apache.commons.math.ode.StepHandler stepHandler7 = dormandPrince853Integrator6.getStepHandler();
        double double8 = dormandPrince853Integrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 31.622776601683793d + "'", double8 == 31.622776601683793d);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) (byte) 0);
        java.lang.String str13 = dormandPrince853Integrator10.getName();
        double double14 = dormandPrince853Integrator10.getMinReduction();
        double double15 = dormandPrince853Integrator10.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        dormandPrince853Integrator10.addSwitchingFunction(switchingFunction16, (double) (byte) 100, (double) 100, 0);
        double double21 = dormandPrince853Integrator10.getMinReduction();
        double double22 = dormandPrince853Integrator10.getSafety();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator27 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (-1.0d), (double) (byte) 1, (double) (byte) 0);
        dormandPrince853Integrator27.setInitialStepSize(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler30 = dormandPrince853Integrator27.getStepHandler();
        dormandPrince853Integrator10.setStepHandler(stepHandler30);
        dormandPrince853Integrator10.setInitialStepSize((-0.0d));
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator10.getStepHandler();
        dormandPrince853Integrator10.setInitialStepSize((double) 0L);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler30);
        org.junit.Assert.assertNotNull(stepHandler34);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(35.0d, Double.NaN, (double) (-1), (double) 1L);
        double double5 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        double[] doubleArray12 = new double[] { (-1.0d), 0L };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator14 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray12, doubleArray13);
        double[] doubleArray19 = new double[] { (-1.0d), 0L };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray19, doubleArray20);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, 52.0d, doubleArray12, doubleArray20);
        double[] doubleArray23 = null;
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.2d, (double) ' ', doubleArray12, doubleArray23);
        double[] doubleArray33 = new double[] { (-1.0d), 0L };
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator35 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray33, doubleArray34);
        double[] doubleArray40 = null;
        double[] doubleArray45 = new double[] { (-1.0d), 0L };
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator47 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray45, doubleArray46);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator48 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray40, doubleArray46);
        double[] doubleArray55 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator56 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray46, doubleArray55);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator57 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, 52.0d, doubleArray34, doubleArray46);
        double[] doubleArray64 = new double[] { (-1.0d), 0L };
        double[] doubleArray65 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator66 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray64, doubleArray65);
        double[] doubleArray71 = new double[] { (-1.0d), 0L };
        double[] doubleArray72 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator73 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray71, doubleArray72);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator74 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, 52.0d, doubleArray64, doubleArray72);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator75 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, (double) (-1L), doubleArray34, doubleArray64);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator76 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1L, (double) (short) 1, doubleArray23, doubleArray34);
        double[] doubleArray81 = new double[] { (-1.0d), 0L };
        double[] doubleArray82 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator83 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray81, doubleArray82);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator84 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100, (double) 1, doubleArray34, doubleArray81);
        java.lang.Class<?> wildcardClass85 = doubleArray34.getClass();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (-1.0d), (double) (short) -1, (double) (short) 10);
        double[] doubleArray7 = null;
        double[] doubleArray12 = new double[] { (-1.0d), 0L };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator14 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray12, doubleArray13);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray7, doubleArray13);
        dormandPrince853Integrator15.setMinReduction((double) (byte) 0);
        java.lang.String str18 = dormandPrince853Integrator15.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator23.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler25 = dormandPrince853Integrator23.getStepHandler();
        dormandPrince853Integrator15.setStepHandler(stepHandler25);
        dormandPrince853Integrator4.setStepHandler(stepHandler25);
        dormandPrince853Integrator4.setMinReduction((double) 0);
        java.lang.String str30 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator35 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (-1.0d), (double) (byte) 1, (double) (byte) 0);
        dormandPrince853Integrator35.setInitialStepSize(0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction38 = null;
        dormandPrince853Integrator35.addSwitchingFunction(switchingFunction38, (double) 100, (double) (short) 10, 10);
        org.apache.commons.math.ode.StepHandler stepHandler43 = dormandPrince853Integrator35.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler43);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str30, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler43);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) '4', (double) (byte) -1, (double) (byte) 0, (double) (short) 0);
        dormandPrince853Integrator4.setSafety((double) ' ');
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (-1.0d), (double) (byte) 1, (double) (byte) 0);
        dormandPrince853Integrator4.setInitialStepSize(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler7 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator4.getStepHandler();
        double[] doubleArray13 = new double[] { (-1.0d), 0L };
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray13, doubleArray14);
        double double16 = dormandPrince853Integrator15.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler17 = dormandPrince853Integrator15.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        dormandPrince853Integrator15.addSwitchingFunction(switchingFunction18, (double) (short) 10, Double.NaN, (int) (byte) -1);
        double double23 = dormandPrince853Integrator15.getMinReduction();
        java.lang.String str24 = dormandPrince853Integrator15.getName();
        dormandPrince853Integrator15.setMinReduction((double) 10L);
        double double27 = dormandPrince853Integrator15.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler28 = dormandPrince853Integrator15.getStepHandler();
        double[] doubleArray33 = new double[] { (-1.0d), 0L };
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator35 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray33, doubleArray34);
        double double36 = dormandPrince853Integrator35.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler37 = dormandPrince853Integrator35.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction38 = null;
        dormandPrince853Integrator35.addSwitchingFunction(switchingFunction38, (double) 0, (double) 10, (int) '4');
        double double43 = dormandPrince853Integrator35.getMinStep();
        double double44 = dormandPrince853Integrator35.getMaxStep();
        java.lang.String str45 = dormandPrince853Integrator35.getName();
        double double46 = dormandPrince853Integrator35.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler47 = dormandPrince853Integrator35.getStepHandler();
        dormandPrince853Integrator15.setStepHandler(stepHandler47);
        dormandPrince853Integrator4.setStepHandler(stepHandler47);
        double double50 = dormandPrince853Integrator4.getMaxStep();
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str24, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 100.0d + "'", double44 == 100.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str45, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 100.0d + "'", double46 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        org.apache.commons.math.ode.StepHandler stepHandler7 = dormandPrince853Integrator6.getStepHandler();
        dormandPrince853Integrator6.setMaxGrowth((double) 10.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction10, (double) (byte) 100, 31.622776601683793d, 100);
        dormandPrince853Integrator6.setSafety((double) (short) 100);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 1, (double) 0L, (double) 1L, (double) 1);
        double double22 = dormandPrince853Integrator21.getMinReduction();
        int int23 = dormandPrince853Integrator21.getOrder();
        dormandPrince853Integrator21.setMaxGrowth((double) 100);
        java.lang.String str26 = dormandPrince853Integrator21.getName();
        double[] doubleArray31 = null;
        double[] doubleArray36 = new double[] { (-1.0d), 0L };
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator38 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray36, doubleArray37);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator39 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray31, doubleArray37);
        double[] doubleArray46 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator47 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray37, doubleArray46);
        dormandPrince853Integrator47.setMaxGrowth((double) (byte) 10);
        double double50 = dormandPrince853Integrator47.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler51 = dormandPrince853Integrator47.getStepHandler();
        double[] doubleArray56 = null;
        double[] doubleArray61 = new double[] { (-1.0d), 0L };
        double[] doubleArray62 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator63 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray61, doubleArray62);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator64 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray56, doubleArray62);
        double[] doubleArray71 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator72 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray62, doubleArray71);
        dormandPrince853Integrator72.setMaxGrowth((double) (byte) 10);
        double double75 = dormandPrince853Integrator72.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler76 = dormandPrince853Integrator72.getStepHandler();
        dormandPrince853Integrator47.setStepHandler(stepHandler76);
        dormandPrince853Integrator21.setStepHandler(stepHandler76);
        dormandPrince853Integrator6.setStepHandler(stepHandler76);
        double double80 = dormandPrince853Integrator6.getSafety();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str26, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler76);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 100.0d + "'", double80 == 100.0d);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.2d, (double) (short) 10, 0.0d, Double.NaN);
        int int5 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) (byte) 1, 52.0d, 0);
        double double11 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction12, 0.0d, 0.9d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        double double6 = dormandPrince853Integrator4.getMaxStep();
        double double7 = dormandPrince853Integrator4.getMaxGrowth();
        int int8 = dormandPrince853Integrator4.getOrder();
        double double9 = dormandPrince853Integrator4.getMinReduction();
        double double10 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 52.0d + "'", double6 == 52.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (-1L), 8.0d, (double) 10L, (double) 10);
        java.lang.Class<?> wildcardClass5 = dormandPrince853Integrator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(10.0d, (double) (short) 1, 6.841052550594828d, 2.8284271247461903d);
        dormandPrince853Integrator4.setSafety(2.5298221281347035d);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) 0, (double) 10, (int) '4');
        org.apache.commons.math.ode.StepHandler stepHandler14 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        double double20 = dormandPrince853Integrator19.getSafety();
        double double21 = dormandPrince853Integrator19.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler22 = dormandPrince853Integrator19.getStepHandler();
        dormandPrince853Integrator6.setStepHandler(stepHandler22);
        double double24 = dormandPrince853Integrator6.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9d + "'", double20 == 0.9d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(9.848857801796104d, 18.708286933869708d, 17.647895909936366d, (double) 1.0f);
    }
}

