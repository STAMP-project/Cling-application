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
        double[] doubleArray8 = null;
        double[] doubleArray13 = new double[] { (-1.0d), 0L };
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator15 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray13, doubleArray14);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray8, doubleArray14);
        double[] doubleArray23 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray14, doubleArray23);
        double[] doubleArray27 = new double[] { (short) 0, (-1L) };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator28 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) 0.0f, doubleArray14, doubleArray27);
        double[] doubleArray35 = null;
        double[] doubleArray40 = new double[] { (-1.0d), 0L };
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray40, doubleArray41);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray35, doubleArray41);
        double[] doubleArray50 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator51 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray41, doubleArray50);
        double[] doubleArray54 = new double[] { (short) 0, (-1L) };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator55 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) 0.0f, doubleArray41, doubleArray54);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator56 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) 1L, doubleArray14, doubleArray54);
        dormandPrince853Integrator56.setMaxGrowth((double) 0.0f);
        org.apache.commons.math.ode.StepHandler stepHandler59 = dormandPrince853Integrator56.getStepHandler();
        int int60 = dormandPrince853Integrator56.getOrder();
        int int61 = dormandPrince853Integrator56.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction62 = null;
        dormandPrince853Integrator56.addSwitchingFunction(switchingFunction62, 1.4142135623730951d, 31.144823004794873d, (int) '#');
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 8 + "'", int60 == 8);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 8 + "'", int61 == 8);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (-1.0d), (double) (byte) 1, (double) (byte) 0);
        double double5 = dormandPrince853Integrator4.getMinReduction();
        double double6 = dormandPrince853Integrator4.getMinStep();
        double double7 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction8, (double) 100L, (double) 1.0f, (int) (short) 1);
        int int13 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        double double8 = dormandPrince853Integrator6.getSafety();
        dormandPrince853Integrator6.setInitialStepSize(0.0d);
        dormandPrince853Integrator6.setMaxGrowth((double) 10);
        dormandPrince853Integrator6.setMinReduction(35.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (-1L), (-1.0d), (double) ' ');
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        int int7 = dormandPrince853Integrator4.getOrder();
        double double8 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setInitialStepSize(32.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (-1.0d), (double) (byte) 1, (double) (byte) 0);
        double double5 = dormandPrince853Integrator4.getMinReduction();
        double double6 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double7 = dormandPrince853Integrator4.getMaxStep();
        double double8 = dormandPrince853Integrator4.getCurrentStepStart();
        double double9 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        org.apache.commons.math.ode.StepHandler stepHandler7 = dormandPrince853Integrator6.getStepHandler();
        dormandPrince853Integrator6.setMaxGrowth((double) 10.0f);
        double double10 = dormandPrince853Integrator6.getMinStep();
        double double11 = dormandPrince853Integrator6.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) 100);
        dormandPrince853Integrator10.setMinReduction((double) ' ');
        dormandPrince853Integrator10.setMaxGrowth((double) ' ');
        double double17 = dormandPrince853Integrator10.getMaxStep();
        dormandPrince853Integrator10.setInitialStepSize(0.2d);
        double double20 = dormandPrince853Integrator10.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 32.0d + "'", double20 == 32.0d);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) -1, (double) (byte) 10, 100.0d, (double) (short) 10);
        double double5 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety(31.622776601683793d);
        double double8 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) 100L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 31.622776601683793d + "'", double8 == 31.622776601683793d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        dormandPrince853Integrator10.setMinReduction((double) (-1));
        double double21 = dormandPrince853Integrator10.getMaxStep();
        double double22 = dormandPrince853Integrator10.getMinStep();
        java.lang.String str23 = dormandPrince853Integrator10.getName();
        java.lang.Class<?> wildcardClass24 = dormandPrince853Integrator10.getClass();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str23, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(wildcardClass24);
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
        double double18 = dormandPrince853Integrator6.getMaxStep();
        double double19 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction20, (-1.0d), (double) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) 0, (double) 10, (int) '4');
        double double14 = dormandPrince853Integrator6.getCurrentSignedStepsize();
        dormandPrince853Integrator6.setMaxGrowth((double) (short) -1);
        double double17 = dormandPrince853Integrator6.getSafety();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 31.622776601683793d + "'", double14 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9d + "'", double17 == 0.9d);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) 0, (double) 10, (int) '4');
        double double14 = dormandPrince853Integrator6.getMinStep();
        double double15 = dormandPrince853Integrator6.getMaxStep();
        int int16 = dormandPrince853Integrator6.getOrder();
        double double17 = dormandPrince853Integrator6.getMaxStep();
        dormandPrince853Integrator6.setSafety((double) 'a');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (-1L), (-1.0d), (double) ' ');
        dormandPrince853Integrator4.setInitialStepSize(0.2d);
        dormandPrince853Integrator4.setMinReduction(0.0d);
        java.lang.String str9 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler10 = dormandPrince853Integrator4.getStepHandler();
        double double11 = dormandPrince853Integrator4.getMinStep();
        double double12 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str9, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
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
        int int23 = dormandPrince853Integrator10.getOrder();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        double double7 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction8, (double) 8, (double) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
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
        java.lang.String str34 = dormandPrince853Integrator6.getName();
        double double35 = dormandPrince853Integrator6.getMinStep();
        dormandPrince853Integrator6.setMinReduction((double) (short) 1);
        double double38 = dormandPrince853Integrator6.getSafety();
        double double39 = dormandPrince853Integrator6.getSafety();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str34, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.9d + "'", double38 == 0.9d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.9d + "'", double39 == 0.9d);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) (short) 10, Double.NaN, (int) (byte) -1);
        double double14 = dormandPrince853Integrator6.getMinReduction();
        java.lang.String str15 = dormandPrince853Integrator6.getName();
        dormandPrince853Integrator6.setMinReduction((double) 10L);
        double double18 = dormandPrince853Integrator6.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler19 = dormandPrince853Integrator6.getStepHandler();
        double double20 = dormandPrince853Integrator6.getCurrentSignedStepsize();
        double double21 = dormandPrince853Integrator6.getCurrentSignedStepsize();
        dormandPrince853Integrator6.setMinReduction((double) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 31.622776601683793d + "'", double20 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 31.622776601683793d + "'", double21 == 31.622776601683793d);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        double double7 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setMinReduction((double) (short) 100);
        double double10 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setMaxGrowth((double) 1L);
        double double13 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setMinReduction(32.0d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        org.apache.commons.math.ode.StepHandler stepHandler7 = dormandPrince853Integrator6.getStepHandler();
        dormandPrince853Integrator6.setMaxGrowth((double) 10.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction10, (double) (byte) 100, 31.622776601683793d, 100);
        dormandPrince853Integrator6.setInitialStepSize((double) 10.0f);
        double double17 = dormandPrince853Integrator6.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray13 = null;
        double[] doubleArray18 = new double[] { (-1.0d), 0L };
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray18, doubleArray19);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray13, doubleArray19);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, (double) 100, doubleArray8, doubleArray19);
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
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator74 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) 10L, doubleArray8, doubleArray32);
        double[] doubleArray79 = new double[] { (-1.0d), 0L };
        double[] doubleArray80 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator81 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray79, doubleArray80);
        org.apache.commons.math.ode.StepHandler stepHandler82 = dormandPrince853Integrator81.getStepHandler();
        dormandPrince853Integrator81.setInitialStepSize(1.0d);
        java.lang.String str85 = dormandPrince853Integrator81.getName();
        double double86 = dormandPrince853Integrator81.getMinStep();
        dormandPrince853Integrator81.setMaxGrowth(0.2d);
        double double89 = dormandPrince853Integrator81.getCurrentSignedStepsize();
        double double90 = dormandPrince853Integrator81.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler91 = dormandPrince853Integrator81.getStepHandler();
        dormandPrince853Integrator74.setStepHandler(stepHandler91);
        double double93 = dormandPrince853Integrator74.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
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
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[]");
        org.junit.Assert.assertNotNull(stepHandler82);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str85, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 31.622776601683793d + "'", double89 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 0.2d + "'", double90 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler91);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 10.0d + "'", double93 == 10.0d);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) (short) 10, Double.NaN, (int) (byte) -1);
        double double14 = dormandPrince853Integrator6.getMinReduction();
        dormandPrince853Integrator6.setMinReduction((double) 100);
        org.apache.commons.math.ode.StepHandler stepHandler17 = dormandPrince853Integrator6.getStepHandler();
        dormandPrince853Integrator6.setSafety((double) (short) 10);
        double double20 = dormandPrince853Integrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 31.622776601683793d + "'", double20 == 31.622776601683793d);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(10.0d, (double) 0.0f, (double) 100L, 0.2d);
        double double5 = dormandPrince853Integrator4.getCurrentStepStart();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setInitialStepSize(97.0d);
        double double9 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        double double7 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setMinReduction((double) (short) 100);
        dormandPrince853Integrator4.setInitialStepSize((double) 100);
        dormandPrince853Integrator4.setInitialStepSize((double) (short) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction14, (double) '4', 100.0d, (int) (byte) 10);
        dormandPrince853Integrator4.setInitialStepSize(15.905414575341013d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        double[] doubleArray15 = new double[] { (-1.0d), 0L };
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray15, doubleArray16);
        org.apache.commons.math.ode.StepHandler stepHandler18 = dormandPrince853Integrator17.getStepHandler();
        dormandPrince853Integrator10.setStepHandler(stepHandler18);
        int int20 = dormandPrince853Integrator10.getOrder();
        dormandPrince853Integrator10.setMaxGrowth(10.0d);
        dormandPrince853Integrator10.setMaxGrowth(100.0d);
        double double25 = dormandPrince853Integrator10.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) ' ', (double) (byte) 0, 8.0d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((-0.0d), 0.0d, (double) 0L, 0.0d);
        dormandPrince853Integrator4.setMinReduction((double) 1.0f);
        int int7 = dormandPrince853Integrator4.getOrder();
        double double8 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-0.0d) + "'", double8 == (-0.0d));
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (-1), (double) (byte) 10, (double) 10, (double) 100.0f);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        double double6 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double7 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler8);
        dormandPrince853Integrator4.setInitialStepSize(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNull(stepHandler12);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) 0, (double) 10, (int) '4');
        double double14 = dormandPrince853Integrator6.getMinStep();
        double double15 = dormandPrince853Integrator6.getMaxStep();
        java.lang.String str16 = dormandPrince853Integrator6.getName();
        double double17 = dormandPrince853Integrator6.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler18 = dormandPrince853Integrator6.getStepHandler();
        dormandPrince853Integrator6.setMaxGrowth(10.0d);
        double double21 = dormandPrince853Integrator6.getMaxGrowth();
        java.lang.Class<?> wildcardClass22 = dormandPrince853Integrator6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        double double7 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setMinReduction((double) (short) 100);
        double double10 = dormandPrince853Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction11, (double) (-1L), (double) (byte) 100, (int) (short) 10);
        dormandPrince853Integrator4.setMaxGrowth((double) (short) 10);
        double double18 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) '4', (double) '4', (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        double double7 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setMinReduction((double) (short) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction10, (double) 1L, (-1.0d), (int) (byte) 1);
        double double15 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setInitialStepSize((double) 10);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator6 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        double double7 = dormandPrince853Integrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        dormandPrince853Integrator6.addSwitchingFunction(switchingFunction9, (double) (short) 10, Double.NaN, (int) (byte) -1);
        double double14 = dormandPrince853Integrator6.getMinReduction();
        java.lang.String str15 = dormandPrince853Integrator6.getName();
        dormandPrince853Integrator6.setMinReduction((double) 10L);
        double double18 = dormandPrince853Integrator6.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler19 = dormandPrince853Integrator6.getStepHandler();
        double double20 = dormandPrince853Integrator6.getCurrentSignedStepsize();
        double double21 = dormandPrince853Integrator6.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 31.622776601683793d + "'", double20 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (-1.0f), (double) (short) 10, 100.0d, (double) (-1.0f));
        double double5 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray15 = new double[] { (-1.0d), 0L };
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray15, doubleArray16);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, 52.0d, doubleArray8, doubleArray16);
        double[] doubleArray19 = null;
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.2d, (double) ' ', doubleArray8, doubleArray19);
        double double21 = dormandPrince853Integrator20.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2d + "'", double21 == 0.2d);
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
        dormandPrince853Integrator10.setMinReduction((double) 100);
        dormandPrince853Integrator10.setMinReduction((double) ' ');
        java.lang.String str15 = dormandPrince853Integrator10.getName();
        double double16 = dormandPrince853Integrator10.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        dormandPrince853Integrator10.addSwitchingFunction(switchingFunction17, (-1.0d), (double) (-1), 8);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double[] doubleArray2 = null;
        double[] doubleArray7 = new double[] { (-1.0d), 0L };
        double[] doubleArray8 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray7, doubleArray8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray2, doubleArray8);
        dormandPrince853Integrator10.setMinReduction((double) 100);
        dormandPrince853Integrator10.setSafety(0.0d);
        java.lang.String str15 = dormandPrince853Integrator10.getName();
        dormandPrince853Integrator10.setInitialStepSize(18.708286933869708d);
        int int18 = dormandPrince853Integrator10.getOrder();
        dormandPrince853Integrator10.setMaxGrowth((double) (byte) 100);
        double double21 = dormandPrince853Integrator10.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 1, (double) 0L, (double) 1L, (double) 1);
        double double5 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setSafety(0.0d);
        double double8 = dormandPrince853Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.2d + "'", double8 == 0.2d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) (-1.0f), (double) 8, 97.0d);
        int int5 = dormandPrince853Integrator4.getOrder();
        double[] doubleArray14 = null;
        double[] doubleArray19 = new double[] { (-1.0d), 0L };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray19, doubleArray20);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray14, doubleArray20);
        double[] doubleArray29 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator30 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray20, doubleArray29);
        double[] doubleArray33 = new double[] { (short) 0, (-1L) };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator34 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) 0.0f, doubleArray20, doubleArray33);
        double[] doubleArray41 = null;
        double[] doubleArray46 = new double[] { (-1.0d), 0L };
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator48 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) (short) 100, doubleArray46, doubleArray47);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator49 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) 10, doubleArray41, doubleArray47);
        double[] doubleArray56 = new double[] { 0.0d, '#', (short) 1, (short) 100, 'a', 100.0d };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator57 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10.0f, (double) (-1.0f), doubleArray47, doubleArray56);
        double[] doubleArray60 = new double[] { (short) 0, (-1L) };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator61 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) 0.0f, doubleArray47, doubleArray60);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator62 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) 1L, doubleArray20, doubleArray60);
        dormandPrince853Integrator62.setMaxGrowth((double) 0.0f);
        org.apache.commons.math.ode.StepHandler stepHandler65 = dormandPrince853Integrator62.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler65);
        dormandPrince853Integrator4.setMinReduction(0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[0.0, 35.0, 1.0, 100.0, 97.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, -1.0]");
        org.junit.Assert.assertNotNull(stepHandler65);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, (double) ' ', (double) 10L, (double) (byte) 1);
        int int5 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler6 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler6);
        org.apache.commons.math.ode.StepHandler stepHandler8 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNull(stepHandler8);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 0, (double) 0, 52.0d, 2.8284271247461903d);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
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
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) (byte) 10, (double) (byte) 0, (double) (short) 0);
        double double5 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, (-1.0d), 2.5298221281347035d, 22.80350850198276d);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
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
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(2.5298221281347035d, (double) '#', 35.0d, 47.753019278348006d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler6 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler6);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (-1L), (-1.0d), (double) ' ');
        dormandPrince853Integrator4.setInitialStepSize(0.2d);
        dormandPrince853Integrator4.setMinReduction(0.0d);
        double double9 = dormandPrince853Integrator4.getSafety();
        java.lang.String str10 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str10, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 32.0d + "'", double17 == 32.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }
}

