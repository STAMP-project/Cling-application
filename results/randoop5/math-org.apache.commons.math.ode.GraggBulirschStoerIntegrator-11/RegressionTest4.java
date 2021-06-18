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
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        double double20 = graggBulirschStoerIntegrator6.getMaxStep();
        double double21 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (byte) -1);
        double double25 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray30 = new double[] { (-1.0d), 0L };
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray30, doubleArray31);
        graggBulirschStoerIntegrator32.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator32.setInterpolationControl(false, (int) (short) 0);
        double double41 = graggBulirschStoerIntegrator32.getMinStep();
        double[] doubleArray46 = new double[] { (-1.0d), 0L };
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray46, doubleArray47);
        graggBulirschStoerIntegrator48.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str54 = graggBulirschStoerIntegrator48.getName();
        double[] doubleArray59 = new double[] { (-1.0d), 0L };
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator61 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray59, doubleArray60);
        graggBulirschStoerIntegrator61.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator61.setInterpolationControl(false, (int) (short) 0);
        double double70 = graggBulirschStoerIntegrator61.getMinStep();
        double double71 = graggBulirschStoerIntegrator61.getCurrentSignedStepsize();
        double double72 = graggBulirschStoerIntegrator61.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler73 = graggBulirschStoerIntegrator61.getStepHandler();
        graggBulirschStoerIntegrator48.setStepHandler(stepHandler73);
        graggBulirschStoerIntegrator32.setStepHandler(stepHandler73);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler73);
        double double77 = graggBulirschStoerIntegrator6.getMinStep();
        java.lang.String str78 = graggBulirschStoerIntegrator6.getName();
        double double79 = graggBulirschStoerIntegrator6.getMaxStep();
        double double80 = graggBulirschStoerIntegrator6.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str54, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 31.622776601683793d + "'", double71 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(stepHandler73);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str78, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 100.0d + "'", double79 == 100.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (short) 0, (int) 'a', 0.0d);
        double[] doubleArray29 = new double[] { (-1.0d), 0L };
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator31 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray29, doubleArray30);
        graggBulirschStoerIntegrator31.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator31.setInterpolationControl(false, (int) (short) 0);
        double double40 = graggBulirschStoerIntegrator31.getMinStep();
        double[] doubleArray45 = new double[] { (-1.0d), 0L };
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray45, doubleArray46);
        graggBulirschStoerIntegrator47.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator47.setInterpolationControl(false, (int) (short) 0);
        double double56 = graggBulirschStoerIntegrator47.getMinStep();
        double double57 = graggBulirschStoerIntegrator47.getCurrentSignedStepsize();
        double double58 = graggBulirschStoerIntegrator47.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler59 = graggBulirschStoerIntegrator47.getStepHandler();
        graggBulirschStoerIntegrator31.setStepHandler(stepHandler59);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler59);
        double double62 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double double63 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) (-1.0f), (double) (-1.0f));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '#', (double) 'a', 5.916079783099616d, (double) 'a');
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (short) 100, (double) 0L, (double) (byte) 100, 0.0d);
        double double81 = graggBulirschStoerIntegrator6.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 31.622776601683793d + "'", double57 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(stepHandler59);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 31.622776601683793d + "'", double63 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 1, (double) 0L, 100.0d, (double) 0);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        double double6 = graggBulirschStoerIntegrator4.getMinStep();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (short) 0, (int) 'a', 0.0d);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (byte) 1);
        graggBulirschStoerIntegrator6.setStepsizeControl(32.0d, (double) ' ', 3.1622776601683795d, 1.0d);
        graggBulirschStoerIntegrator6.setStepsizeControl(31.622776601683793d, (double) '4', (double) (-1.0f), (-0.0d));
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) '4', (int) (byte) 1, Double.NaN);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray8, doubleArray11);
        double[] doubleArray19 = new double[] { (-1.0d), 0L };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray19, doubleArray20);
        double[] doubleArray29 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray34 = new double[] { (-1.0d), 0L };
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray34, doubleArray35);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray29, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray20, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 1L, doubleArray8, doubleArray34);
        java.lang.String str40 = graggBulirschStoerIntegrator39.getName();
        graggBulirschStoerIntegrator39.setOrderControl((int) '#', Double.NaN, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler45 = graggBulirschStoerIntegrator39.getStepHandler();
        graggBulirschStoerIntegrator39.setStepsizeControl(35.0d, 3.1622776601683795d, 15.100830606950982d, (double) 10);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str40, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler45);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100L, (double) (short) 1, (double) 100.0f, (double) 1.0f);
        graggBulirschStoerIntegrator4.setOrderControl((int) (byte) 10, 52.0d, (double) (byte) 1);
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) ' ', (int) (byte) 100, (double) 10L);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        double[] doubleArray9 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray14 = new double[] { (-1.0d), 0L };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray14, doubleArray15);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator17 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray9, doubleArray14);
        double[] doubleArray24 = new double[] { (-1.0d), 0L };
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray24, doubleArray25);
        double[] doubleArray33 = new double[] { (-1.0d), 0L };
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray33, doubleArray34);
        double[] doubleArray43 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray48 = new double[] { (-1.0d), 0L };
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray48, doubleArray49);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator51 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray43, doubleArray48);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray34, doubleArray48);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator53 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 100.0f, doubleArray24, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator54 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) (byte) 10, doubleArray14, doubleArray34);
        java.lang.String str55 = graggBulirschStoerIntegrator54.getName();
        java.lang.String str56 = graggBulirschStoerIntegrator54.getName();
        graggBulirschStoerIntegrator54.setStepsizeControl((double) (short) -1, (double) 100, (double) (short) 100, (double) 0.0f);
        org.apache.commons.math.ode.StepHandler stepHandler62 = graggBulirschStoerIntegrator54.getStepHandler();
        graggBulirschStoerIntegrator54.setOrderControl((int) (short) 1, 15.100830606950982d, (-0.0d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str55, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str56, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler62);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1), 0.0d, 0.0d, (double) (short) 0);
        double double5 = graggBulirschStoerIntegrator4.getMinStep();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double11 = graggBulirschStoerIntegrator10.getMaxStep();
        graggBulirschStoerIntegrator10.setInitialStepSize(31.622776601683793d);
        org.apache.commons.math.ode.StepHandler stepHandler14 = graggBulirschStoerIntegrator10.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        graggBulirschStoerIntegrator10.addSwitchingFunction(switchingFunction15, 100.0d, (double) (-1L), (int) (short) 1);
        graggBulirschStoerIntegrator10.setStabilityCheck(true, (int) (byte) 1, 1, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler25 = graggBulirschStoerIntegrator10.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler25);
        double double27 = graggBulirschStoerIntegrator4.getMinStep();
        java.lang.String str28 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str28, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        double double19 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) 1);
        java.lang.String str25 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.StepHandler stepHandler26 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) 'a');
        double[] doubleArray34 = new double[] { (-1.0d), 0L };
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray34, doubleArray35);
        graggBulirschStoerIntegrator36.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str42 = graggBulirschStoerIntegrator36.getName();
        java.lang.String str43 = graggBulirschStoerIntegrator36.getName();
        graggBulirschStoerIntegrator36.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator36.setOrderControl((int) '#', (double) (short) 0, (double) 1);
        graggBulirschStoerIntegrator36.setInterpolationControl(false, (int) (short) 1);
        graggBulirschStoerIntegrator36.setStepsizeControl((double) 10.0f, 0.0d, (double) '#', (double) (-1L));
        org.apache.commons.math.ode.StepHandler stepHandler61 = graggBulirschStoerIntegrator36.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler61);
        graggBulirschStoerIntegrator6.setInitialStepSize(32.0d);
        double double65 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str25, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str42, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str43, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 31.622776601683793d + "'", double65 == 31.622776601683793d);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        double[] doubleArray9 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray14 = new double[] { (-1.0d), 0L };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray14, doubleArray15);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator17 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray9, doubleArray14);
        double[] doubleArray25 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray30 = new double[] { (-1.0d), 0L };
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray30, doubleArray31);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray25, doubleArray30);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 0, doubleArray14, doubleArray25);
        double double35 = graggBulirschStoerIntegrator34.getCurrentStepStart();
        graggBulirschStoerIntegrator34.setStabilityCheck(true, (int) (short) 0, 10, 100.0d);
        double double41 = graggBulirschStoerIntegrator34.getMaxStep();
        java.lang.String str42 = graggBulirschStoerIntegrator34.getName();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str42, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 100L, (double) 0.0f, (double) (byte) 0);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, (double) 1L, (double) (-1), (double) (byte) 0);
        graggBulirschStoerIntegrator10.setOrderControl((int) (short) 100, (double) 10L, 31.622776601683793d);
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator10.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler15);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler15);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        double double6 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        graggBulirschStoerIntegrator4.setOrderControl(100, Double.NaN, 52.0d);
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) (byte) 10, 0, Double.NaN);
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) (short) 10, (int) (short) 100, 22.80350850198276d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) '#', (double) '4', (-0.0d), (double) (-1.0f));
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator9 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1), 0.0d, 0.0d, (double) (short) 0);
        org.apache.commons.math.ode.StepHandler stepHandler10 = graggBulirschStoerIntegrator9.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler10);
        java.lang.Class<?> wildcardClass12 = graggBulirschStoerIntegrator4.getClass();
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        double[] doubleArray9 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray14 = new double[] { (-1.0d), 0L };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray14, doubleArray15);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator17 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray9, doubleArray14);
        double[] doubleArray24 = new double[] { (-1.0d), 0L };
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray24, doubleArray25);
        double[] doubleArray33 = new double[] { (-1.0d), 0L };
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray33, doubleArray34);
        double[] doubleArray43 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray48 = new double[] { (-1.0d), 0L };
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray48, doubleArray49);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator51 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray43, doubleArray48);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray34, doubleArray48);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator53 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 100.0f, doubleArray24, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator54 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) (byte) 10, doubleArray14, doubleArray34);
        graggBulirschStoerIntegrator54.setInterpolationControl(false, (int) (short) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction58 = null;
        graggBulirschStoerIntegrator54.addSwitchingFunction(switchingFunction58, 0.0d, (double) (byte) 100, (int) (short) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction63 = null;
        graggBulirschStoerIntegrator54.addSwitchingFunction(switchingFunction63, 5.916079783099616d, (double) 1L, (int) (short) 1);
        java.lang.Class<?> wildcardClass68 = graggBulirschStoerIntegrator54.getClass();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) 1, (int) '4', (double) (-1.0f));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (-1), (int) (short) 10, (double) 10L);
        double double34 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray39 = new double[] { (-1.0d), 0L };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray39, doubleArray40);
        graggBulirschStoerIntegrator41.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str47 = graggBulirschStoerIntegrator41.getName();
        java.lang.String str48 = graggBulirschStoerIntegrator41.getName();
        graggBulirschStoerIntegrator41.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator41.setOrderControl((int) '#', (double) (short) 0, (double) 1);
        org.apache.commons.math.ode.StepHandler stepHandler58 = graggBulirschStoerIntegrator41.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler58);
        org.apache.commons.math.ode.StepHandler stepHandler60 = graggBulirschStoerIntegrator6.getStepHandler();
        double double61 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInitialStepSize(0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction64 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction64, (double) 0, (double) '4', (int) 'a');
        graggBulirschStoerIntegrator6.setInitialStepSize(32.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str47, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str48, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertNotNull(stepHandler60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 100.0d + "'", double61 == 100.0d);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', (double) (byte) 10, (double) (byte) 10, 0.0d);
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (-1));
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(Double.NaN, (double) 0L, (double) 10, (double) 0L);
        double[] doubleArray9 = new double[] { (-1.0d), 0L };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator11 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray9, doubleArray10);
        graggBulirschStoerIntegrator11.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator11.setInterpolationControl(false, (int) (short) 0);
        double double20 = graggBulirschStoerIntegrator11.getMinStep();
        double double21 = graggBulirschStoerIntegrator11.getCurrentSignedStepsize();
        double double22 = graggBulirschStoerIntegrator11.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler23 = graggBulirschStoerIntegrator11.getStepHandler();
        double double24 = graggBulirschStoerIntegrator11.getMaxStep();
        graggBulirschStoerIntegrator11.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator11.setOrderControl((-1), (double) 10, (double) 10.0f);
        double double32 = graggBulirschStoerIntegrator11.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler33 = graggBulirschStoerIntegrator11.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler33);
        double[] doubleArray39 = new double[] { (-1.0d), 0L };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray39, doubleArray40);
        graggBulirschStoerIntegrator41.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str47 = graggBulirschStoerIntegrator41.getName();
        org.apache.commons.math.ode.StepHandler stepHandler48 = graggBulirschStoerIntegrator41.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler48);
        java.lang.Class<?> wildcardClass50 = graggBulirschStoerIntegrator4.getClass();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 31.622776601683793d + "'", double21 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str47, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) 1, (int) '4', (double) (-1.0f));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (-1), (int) (short) 10, (double) 10L);
        double double34 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler35 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler35);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100, (double) (byte) 10, 5.656854249492381d, (double) 1);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) (short) 100);
        double double7 = graggBulirschStoerIntegrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) 1, (int) '4', (double) (-1.0f));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        org.apache.commons.math.ode.StepHandler stepHandler29 = graggBulirschStoerIntegrator6.getStepHandler();
        java.lang.String str30 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) 0, (double) 1.0f, (double) ' ');
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (-1), (double) 1);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 1, (int) ' ', (double) 100);
        double double45 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) 10);
        org.apache.commons.math.ode.StepHandler stepHandler48 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str30, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 100.0d + "'", double45 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler48);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, (double) 10.0f, 100.0d, (double) (short) -1);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) ' ', (double) '4', (double) (byte) -1, (double) (-1));
        graggBulirschStoerIntegrator6.setInitialStepSize((double) '#');
        double double27 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double28 = graggBulirschStoerIntegrator6.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 31.622776601683793d + "'", double27 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray8, doubleArray11);
        double[] doubleArray15 = null;
        double[] doubleArray24 = new double[] { (-1.0d), 0L };
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray24, doubleArray25);
        double[] doubleArray34 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray39 = new double[] { (-1.0d), 0L };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray39, doubleArray40);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray34, doubleArray39);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray24, doubleArray39);
        double[] doubleArray50 = new double[] { (-1.0d), 0L };
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray50, doubleArray51);
        double[] doubleArray53 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator54 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray50, doubleArray53);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator55 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, (double) (-1), doubleArray39, doubleArray50);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1.0f, 0.0d, doubleArray15, doubleArray50);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, 0.0d, doubleArray8, doubleArray15);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[]");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) '4', (double) 10L, 10.0d, (-0.0d));
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray20 = new double[] { (-1.0d), 0L };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator22 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray20, doubleArray21);
        graggBulirschStoerIntegrator22.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator22.setInterpolationControl(false, (int) (short) 0);
        double double31 = graggBulirschStoerIntegrator22.getMinStep();
        double double32 = graggBulirschStoerIntegrator22.getCurrentSignedStepsize();
        double double33 = graggBulirschStoerIntegrator22.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler34 = graggBulirschStoerIntegrator22.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler34);
        double double36 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (int) '#', (double) (short) 0);
        double double42 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double43 = graggBulirschStoerIntegrator6.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 31.622776601683793d + "'", double32 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 31.622776601683793d + "'", double42 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, 52.0d, (double) 0L, (double) (byte) 0);
        graggBulirschStoerIntegrator4.setStepsizeControl(31.622776601683793d, 56.568542494923804d, 22.80350850198276d, 0.0d);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) 10.0f);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100, (double) 10, 0.0d, 35.0d);
        double double5 = graggBulirschStoerIntegrator4.getMinStep();
        double double6 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 31.622776601683793d + "'", double6 == 31.622776601683793d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(31.622776601683793d, (double) 10, (double) ' ', 0.0d);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        double[] doubleArray6 = new double[] { (short) 1, (byte) 0, '4', 1.0d };
        double[] doubleArray13 = new double[] { (-1.0d), 0L };
        double[] doubleArray14 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator15 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray13, doubleArray14);
        double[] doubleArray23 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray28 = new double[] { (-1.0d), 0L };
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator30 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray28, doubleArray29);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator31 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray23, doubleArray28);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray13, doubleArray28);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) '4', (double) 10L, doubleArray6, doubleArray28);
        org.apache.commons.math.ode.StepHandler stepHandler34 = graggBulirschStoerIntegrator33.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler35 = graggBulirschStoerIntegrator33.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[1.0, 0.0, 52.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertNotNull(stepHandler35);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, (double) (byte) 100, (double) 10L, (double) ' ');
        graggBulirschStoerIntegrator4.setOrderControl(1, (double) 100L, 1.0d);
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) 'a', (-1), (double) 0L);
        graggBulirschStoerIntegrator4.setInterpolationControl(false, 10);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) '#', (double) 0.0f, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) ' ');
        graggBulirschStoerIntegrator4.setOrderControl(100, (double) (short) 10, (double) 10.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction13, (double) ' ', 35.0d, (int) (short) 0);
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) '4');
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) (byte) 100);
        graggBulirschStoerIntegrator4.setOrderControl((int) 'a', Double.NaN, (double) 'a');
        org.apache.commons.math.ode.StepHandler stepHandler28 = graggBulirschStoerIntegrator4.getStepHandler();
        java.lang.String str29 = graggBulirschStoerIntegrator4.getName();
        graggBulirschStoerIntegrator4.setOrderControl((int) (byte) 100, (double) 10L, 5.916079783099616d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str29, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(52.0d, (double) 10L, (double) (short) 10, (double) 10L);
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (-1));
        org.apache.commons.math.ode.StepHandler stepHandler8 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction9, (double) 100, (double) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(stepHandler8);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        java.lang.String str17 = graggBulirschStoerIntegrator6.getName();
        double double18 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInitialStepSize(3.1622776601683795d);
        graggBulirschStoerIntegrator6.setOrderControl((int) 'a', (double) (short) -1, (double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str17, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        double double21 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setOrderControl(1, (double) (byte) 1, 0.0d);
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (-1));
        org.apache.commons.math.ode.StepHandler stepHandler29 = graggBulirschStoerIntegrator6.getStepHandler();
        double double30 = graggBulirschStoerIntegrator6.getMinStep();
        double double31 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100L, (double) (short) 0, 100.0d, 35.0d);
        graggBulirschStoerIntegrator36.setInterpolationControl(true, 100);
        org.apache.commons.math.ode.StepHandler stepHandler40 = graggBulirschStoerIntegrator36.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler40);
        double double42 = graggBulirschStoerIntegrator6.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNotNull(stepHandler40);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        double double19 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) 1);
        double double25 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 10, (int) (short) 100, (double) (short) 0);
        double double31 = graggBulirschStoerIntegrator6.getMinStep();
        double double32 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 1, (int) (byte) 0, (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 100L);
        double double21 = graggBulirschStoerIntegrator6.getMinStep();
        double double22 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        double[] doubleArray10 = new double[] { (-1.0d), 0L };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray10, doubleArray11);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray10, doubleArray13);
        double[] doubleArray21 = new double[] { (-1.0d), 0L };
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray21, doubleArray22);
        double[] doubleArray31 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray36 = new double[] { (-1.0d), 0L };
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray36, doubleArray37);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray31, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray22, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 1L, doubleArray10, doubleArray36);
        double[] doubleArray51 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray56 = new double[] { (-1.0d), 0L };
        double[] doubleArray57 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator58 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray56, doubleArray57);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator59 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray51, doubleArray56);
        double[] doubleArray66 = new double[] { (-1.0d), 0L };
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator68 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray66, doubleArray67);
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator70 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray66, doubleArray69);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator71 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (short) 10, doubleArray56, doubleArray69);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator72 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, (double) '#', doubleArray10, doubleArray69);
        java.lang.String str73 = graggBulirschStoerIntegrator72.getName();
        org.apache.commons.math.ode.StepHandler stepHandler74 = graggBulirschStoerIntegrator72.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str73, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler74);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        double[] doubleArray9 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray14 = new double[] { (-1.0d), 0L };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray14, doubleArray15);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator17 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray9, doubleArray14);
        double[] doubleArray24 = new double[] { (-1.0d), 0L };
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray24, doubleArray25);
        double[] doubleArray33 = new double[] { (-1.0d), 0L };
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray33, doubleArray34);
        double[] doubleArray43 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray48 = new double[] { (-1.0d), 0L };
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray48, doubleArray49);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator51 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray43, doubleArray48);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray34, doubleArray48);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator53 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 100.0f, doubleArray24, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator54 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) (byte) 10, doubleArray14, doubleArray34);
        java.lang.String str55 = graggBulirschStoerIntegrator54.getName();
        java.lang.String str56 = graggBulirschStoerIntegrator54.getName();
        java.lang.String str57 = graggBulirschStoerIntegrator54.getName();
        java.lang.String str58 = graggBulirschStoerIntegrator54.getName();
        graggBulirschStoerIntegrator54.setStabilityCheck(false, (int) (byte) 1, 1, 31.622776601683793d);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str55, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str56, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str57, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str58, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        double double20 = graggBulirschStoerIntegrator6.getMaxStep();
        double double21 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (byte) -1);
        double double25 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray30 = new double[] { (-1.0d), 0L };
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray30, doubleArray31);
        graggBulirschStoerIntegrator32.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator32.setInterpolationControl(false, (int) (short) 0);
        double double41 = graggBulirschStoerIntegrator32.getMinStep();
        double[] doubleArray46 = new double[] { (-1.0d), 0L };
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray46, doubleArray47);
        graggBulirschStoerIntegrator48.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str54 = graggBulirschStoerIntegrator48.getName();
        double[] doubleArray59 = new double[] { (-1.0d), 0L };
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator61 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray59, doubleArray60);
        graggBulirschStoerIntegrator61.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator61.setInterpolationControl(false, (int) (short) 0);
        double double70 = graggBulirschStoerIntegrator61.getMinStep();
        double double71 = graggBulirschStoerIntegrator61.getCurrentSignedStepsize();
        double double72 = graggBulirschStoerIntegrator61.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler73 = graggBulirschStoerIntegrator61.getStepHandler();
        graggBulirschStoerIntegrator48.setStepHandler(stepHandler73);
        graggBulirschStoerIntegrator32.setStepHandler(stepHandler73);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler73);
        double double77 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double81 = graggBulirschStoerIntegrator6.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler82 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str54, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 31.622776601683793d + "'", double71 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(stepHandler73);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 100.0d + "'", double81 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler82);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) '#', (double) 10, (double) (short) -1, (-0.0d));
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator6.setOrderControl((int) '#', (double) (short) 0, (double) 1);
        org.apache.commons.math.ode.StepHandler stepHandler23 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, 1, 0, (double) (byte) 10);
        java.lang.String str29 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 1.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str29, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100L, (double) 100L, (-0.0d), 1.0d);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        double[] doubleArray12 = new double[] { (-1.0d), 0L };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray12, doubleArray13);
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray12, doubleArray15);
        double[] doubleArray26 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray31 = new double[] { (-1.0d), 0L };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray31, doubleArray32);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray26, doubleArray31);
        double[] doubleArray41 = new double[] { (-1.0d), 0L };
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray41, doubleArray42);
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray41, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (short) 10, doubleArray31, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0.0f, (double) ' ', doubleArray12, doubleArray31);
        double[] doubleArray54 = new double[] { (-1.0d), 0L };
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray54, doubleArray55);
        double[] doubleArray63 = new double[] { (-1.0d), 0L };
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator65 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray63, doubleArray64);
        double[] doubleArray73 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray78 = new double[] { (-1.0d), 0L };
        double[] doubleArray79 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator80 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray78, doubleArray79);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator81 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray73, doubleArray78);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator82 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray64, doubleArray78);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator83 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 100.0f, doubleArray54, doubleArray64);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator84 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-0.0d), (double) 100.0f, doubleArray12, doubleArray64);
        double[] doubleArray85 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator86 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1.0f), (-1.0d), doubleArray64, doubleArray85);
        java.lang.Class<?> wildcardClass87 = graggBulirschStoerIntegrator86.getClass();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        double[] doubleArray9 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray14 = new double[] { (-1.0d), 0L };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray14, doubleArray15);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator17 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray9, doubleArray14);
        double[] doubleArray24 = new double[] { (-1.0d), 0L };
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray24, doubleArray25);
        double[] doubleArray33 = new double[] { (-1.0d), 0L };
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray33, doubleArray34);
        double[] doubleArray43 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray48 = new double[] { (-1.0d), 0L };
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray48, doubleArray49);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator51 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray43, doubleArray48);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray34, doubleArray48);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator53 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 100.0f, doubleArray24, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator54 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) (byte) 10, doubleArray14, doubleArray34);
        java.lang.String str55 = graggBulirschStoerIntegrator54.getName();
        double double56 = graggBulirschStoerIntegrator54.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str55, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 100.0d + "'", double56 == 100.0d);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        double[] doubleArray10 = new double[] { (-1.0d), 0L };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray10, doubleArray11);
        double[] doubleArray19 = new double[] { (-1.0d), 0L };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray19, doubleArray20);
        double[] doubleArray29 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray34 = new double[] { (-1.0d), 0L };
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray34, doubleArray35);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray29, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray20, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 100.0f, doubleArray10, doubleArray20);
        double[] doubleArray44 = new double[] { (-1.0d), 0L };
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray44, doubleArray45);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(56.568542494923804d, (double) 0, doubleArray10, doubleArray44);
        double[] doubleArray54 = new double[] { (-1.0d), 0L };
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray54, doubleArray55);
        double[] doubleArray64 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray69 = new double[] { (-1.0d), 0L };
        double[] doubleArray70 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator71 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray69, doubleArray70);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator72 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray64, doubleArray69);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator73 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray54, doubleArray69);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator74 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(3.1622776601683795d, (double) 1.0f, doubleArray44, doubleArray69);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[]");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) 1, (int) '4', (double) (-1.0f));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        org.apache.commons.math.ode.StepHandler stepHandler29 = graggBulirschStoerIntegrator6.getStepHandler();
        double double30 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double double31 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) 'a', 0.0d, Double.NaN);
        double double36 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) ' ');
        java.lang.String str40 = graggBulirschStoerIntegrator6.getName();
        double[] doubleArray48 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray53 = new double[] { (-1.0d), 0L };
        double[] doubleArray54 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator55 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray53, doubleArray54);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray48, doubleArray53);
        org.apache.commons.math.ode.StepHandler stepHandler57 = graggBulirschStoerIntegrator56.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler58 = graggBulirschStoerIntegrator56.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler58);
        double double60 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str40, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[]");
        org.junit.Assert.assertNotNull(stepHandler57);
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 31.622776601683793d + "'", double60 == 31.622776601683793d);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) 1, (int) '4', (double) (-1.0f));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (-1), (int) (short) 10, (double) 10L);
        double double34 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray39 = new double[] { (-1.0d), 0L };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray39, doubleArray40);
        graggBulirschStoerIntegrator41.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str47 = graggBulirschStoerIntegrator41.getName();
        java.lang.String str48 = graggBulirschStoerIntegrator41.getName();
        graggBulirschStoerIntegrator41.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator41.setOrderControl((int) '#', (double) (short) 0, (double) 1);
        org.apache.commons.math.ode.StepHandler stepHandler58 = graggBulirschStoerIntegrator41.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler58);
        org.apache.commons.math.ode.StepHandler stepHandler60 = graggBulirschStoerIntegrator6.getStepHandler();
        java.lang.String str61 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str47, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str48, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertNotNull(stepHandler60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str61, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        double double20 = graggBulirschStoerIntegrator6.getMaxStep();
        double double21 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (byte) -1);
        double double25 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray30 = new double[] { (-1.0d), 0L };
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray30, doubleArray31);
        graggBulirschStoerIntegrator32.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator32.setInterpolationControl(false, (int) (short) 0);
        double double41 = graggBulirschStoerIntegrator32.getMinStep();
        double[] doubleArray46 = new double[] { (-1.0d), 0L };
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray46, doubleArray47);
        graggBulirschStoerIntegrator48.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str54 = graggBulirschStoerIntegrator48.getName();
        double[] doubleArray59 = new double[] { (-1.0d), 0L };
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator61 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray59, doubleArray60);
        graggBulirschStoerIntegrator61.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator61.setInterpolationControl(false, (int) (short) 0);
        double double70 = graggBulirschStoerIntegrator61.getMinStep();
        double double71 = graggBulirschStoerIntegrator61.getCurrentSignedStepsize();
        double double72 = graggBulirschStoerIntegrator61.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler73 = graggBulirschStoerIntegrator61.getStepHandler();
        graggBulirschStoerIntegrator48.setStepHandler(stepHandler73);
        graggBulirschStoerIntegrator32.setStepHandler(stepHandler73);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler73);
        double double77 = graggBulirschStoerIntegrator6.getMinStep();
        java.lang.String str78 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str79 = graggBulirschStoerIntegrator6.getName();
        double double80 = graggBulirschStoerIntegrator6.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str54, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 31.622776601683793d + "'", double71 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(stepHandler73);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str78, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str79, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 10.0d + "'", double80 == 10.0d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) 10.0f, (double) ' ', 5.916079783099616d);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        java.lang.String str17 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (-1.0f));
        double double20 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double21 = graggBulirschStoerIntegrator6.getMinStep();
        java.lang.String str22 = graggBulirschStoerIntegrator6.getName();
        double double23 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) '#', (double) (byte) 0, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str17, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 31.622776601683793d + "'", double20 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str22, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) ' ', (double) '4', (double) (byte) -1, (double) (-1));
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 1.0f, (double) 1.0f, (double) (short) 1, (double) (byte) 10);
        java.lang.String str30 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) '#');
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (short) -1);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (short) 1, (int) (byte) 100, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler41 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str30, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler41);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) 1, (int) '4', (double) (-1.0f));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (-1), (int) (short) 10, (double) 10L);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) -1);
        graggBulirschStoerIntegrator6.setInitialStepSize(97.0d);
        double double39 = graggBulirschStoerIntegrator6.getMaxStep();
        double double40 = graggBulirschStoerIntegrator6.getMinStep();
        java.lang.String str41 = graggBulirschStoerIntegrator6.getName();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str41, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (byte) 10);
        double double24 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler25 = graggBulirschStoerIntegrator6.getStepHandler();
        double double26 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (byte) 10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 31.622776601683793d + "'", double26 == 31.622776601683793d);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, (double) 1L, (double) (-1), (double) (byte) 0);
        double double5 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double double6 = graggBulirschStoerIntegrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction7, 35.0d, 0.0d, 1);
        graggBulirschStoerIntegrator4.setStepsizeControl((double) 100, (double) (byte) -1, (double) 1.0f, 5.656854249492381d);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) (short) -1);
        double double19 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        double[] doubleArray11 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray16 = new double[] { (-1.0d), 0L };
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator18 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray16, doubleArray17);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray11, doubleArray16);
        double[] doubleArray27 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray32 = new double[] { (-1.0d), 0L };
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray32, doubleArray33);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray27, doubleArray32);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 0, doubleArray16, doubleArray27);
        double[] doubleArray41 = new double[] { (-1.0d), 0L };
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray41, doubleArray42);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, Double.NaN, doubleArray27, doubleArray42);
        graggBulirschStoerIntegrator44.setOrderControl(0, 0.0d, (double) (-1L));
        graggBulirschStoerIntegrator44.setInterpolationControl(false, (int) (short) 100);
        double double52 = graggBulirschStoerIntegrator44.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler53 = graggBulirschStoerIntegrator44.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(stepHandler53);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        double[] doubleArray10 = new double[] { (-1.0d), 0L };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray10, doubleArray11);
        double[] doubleArray20 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray25 = new double[] { (-1.0d), 0L };
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator27 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray25, doubleArray26);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator28 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray20, doubleArray25);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray10, doubleArray25);
        double[] doubleArray36 = new double[] { (-1.0d), 0L };
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray36, doubleArray37);
        double[] doubleArray45 = new double[] { (-1.0d), 0L };
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray45, doubleArray46);
        double[] doubleArray55 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray60 = new double[] { (-1.0d), 0L };
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator62 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray60, doubleArray61);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator63 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray55, doubleArray60);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator64 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray46, doubleArray60);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator65 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 100.0f, doubleArray36, doubleArray46);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator66 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) -1, doubleArray25, doubleArray46);
        double[] doubleArray74 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray79 = new double[] { (-1.0d), 0L };
        double[] doubleArray80 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator81 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray79, doubleArray80);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator82 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray74, doubleArray79);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator83 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(32.0d, (double) (short) 1, doubleArray25, doubleArray79);
        graggBulirschStoerIntegrator83.setStepsizeControl(0.0d, (double) (-1.0f), 10.0d, (double) ' ');
        double double89 = graggBulirschStoerIntegrator83.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator83.setStepsizeControl((double) '#', (double) (-1.0f), (double) '#', (double) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[]");
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 5.656854249492381d + "'", double89 == 5.656854249492381d);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        double[] doubleArray2 = null;
        double[] doubleArray11 = new double[] { (-1.0d), 0L };
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator13 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray11, doubleArray12);
        double[] doubleArray21 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray26 = new double[] { (-1.0d), 0L };
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator28 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray26, doubleArray27);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray21, doubleArray26);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator30 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray11, doubleArray26);
        double[] doubleArray37 = new double[] { (-1.0d), 0L };
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray37, doubleArray38);
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray37, doubleArray40);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, (double) (-1), doubleArray26, doubleArray37);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1.0f, 0.0d, doubleArray2, doubleArray37);
        graggBulirschStoerIntegrator43.setStepsizeControl(56.568542494923804d, 56.568542494923804d, (double) (-1.0f), (double) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        double[] doubleArray11 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray16 = new double[] { (-1.0d), 0L };
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator18 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray16, doubleArray17);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray11, doubleArray16);
        double[] doubleArray29 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray34 = new double[] { (-1.0d), 0L };
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray34, doubleArray35);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray29, doubleArray34);
        double[] doubleArray44 = new double[] { (-1.0d), 0L };
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray44, doubleArray45);
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray44, doubleArray47);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (short) 10, doubleArray34, doubleArray47);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, (double) (byte) 0, doubleArray11, doubleArray47);
        double[] doubleArray58 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray63 = new double[] { (-1.0d), 0L };
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator65 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray63, doubleArray64);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator66 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray58, doubleArray63);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) '#', 31.622776601683793d, doubleArray47, doubleArray63);
        double double68 = graggBulirschStoerIntegrator67.getMinStep();
        double double69 = graggBulirschStoerIntegrator67.getCurrentStepStart();
        double double70 = graggBulirschStoerIntegrator67.getCurrentStepStart();
        double double71 = graggBulirschStoerIntegrator67.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction72 = null;
        graggBulirschStoerIntegrator67.addSwitchingFunction(switchingFunction72, (double) (byte) 100, 0.0d, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 35.0d + "'", double68 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 35.0d + "'", double71 == 35.0d);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        double double19 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        double double23 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 0.0f);
        double double26 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler27 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (-1), (-0.0d), (double) 100, 15.100830606950982d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 100.0d + "'", double23 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(stepHandler27);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        double double19 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) 1);
        double double25 = graggBulirschStoerIntegrator6.getMinStep();
        double double26 = graggBulirschStoerIntegrator6.getMaxStep();
        double[] doubleArray31 = new double[] { (-1.0d), 0L };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray31, doubleArray32);
        graggBulirschStoerIntegrator33.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator33.setInterpolationControl(false, (int) (short) 0);
        double double42 = graggBulirschStoerIntegrator33.getMinStep();
        graggBulirschStoerIntegrator33.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        double double48 = graggBulirschStoerIntegrator33.getMinStep();
        double double49 = graggBulirschStoerIntegrator33.getCurrentStepStart();
        double[] doubleArray54 = new double[] { (-1.0d), 0L };
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray54, doubleArray55);
        graggBulirschStoerIntegrator56.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator56.setInterpolationControl(false, (int) (short) 0);
        double double65 = graggBulirschStoerIntegrator56.getMinStep();
        graggBulirschStoerIntegrator56.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler71 = graggBulirschStoerIntegrator56.getStepHandler();
        graggBulirschStoerIntegrator33.setStepHandler(stepHandler71);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler71);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction74 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction74, (double) (byte) 1, (double) (short) -1, 1);
        double double79 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler71);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 31.622776601683793d + "'", double79 == 31.622776601683793d);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) '#', (int) (short) 10, (double) (short) 1);
        double double26 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double27 = graggBulirschStoerIntegrator6.getMinStep();
        double double28 = graggBulirschStoerIntegrator6.getMaxStep();
        double double29 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) -1, (int) (short) -1, (double) 1.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction35, 35.0d, 0.0d, (int) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 31.622776601683793d + "'", double26 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (-1), (-1), (double) (short) 100);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (short) 100, (double) (-1L), 1.0d, (double) 'a');
        double double27 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) 100, (int) (byte) 100, (double) 100);
        java.lang.Class<?> wildcardClass33 = graggBulirschStoerIntegrator6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 31.622776601683793d + "'", double27 == 31.622776601683793d);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler20 = graggBulirschStoerIntegrator6.getStepHandler();
        double[] doubleArray25 = new double[] { (-1.0d), 0L };
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator27 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray25, doubleArray26);
        graggBulirschStoerIntegrator27.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator27.setInterpolationControl(false, (int) (short) 0);
        double double36 = graggBulirschStoerIntegrator27.getMinStep();
        graggBulirschStoerIntegrator27.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator27.setStabilityCheck(false, (int) (byte) 1, (int) '4', (double) (-1.0f));
        graggBulirschStoerIntegrator27.setInterpolationControl(true, 10);
        graggBulirschStoerIntegrator27.setStabilityCheck(true, (-1), (int) (short) 10, (double) 10L);
        double double55 = graggBulirschStoerIntegrator27.getMinStep();
        double[] doubleArray60 = new double[] { (-1.0d), 0L };
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator62 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray60, doubleArray61);
        graggBulirschStoerIntegrator62.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str68 = graggBulirschStoerIntegrator62.getName();
        java.lang.String str69 = graggBulirschStoerIntegrator62.getName();
        graggBulirschStoerIntegrator62.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator62.setOrderControl((int) '#', (double) (short) 0, (double) 1);
        org.apache.commons.math.ode.StepHandler stepHandler79 = graggBulirschStoerIntegrator62.getStepHandler();
        graggBulirschStoerIntegrator27.setStepHandler(stepHandler79);
        org.apache.commons.math.ode.StepHandler stepHandler81 = graggBulirschStoerIntegrator27.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler81);
        java.lang.String str83 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.StepHandler stepHandler84 = graggBulirschStoerIntegrator6.getStepHandler();
        double double85 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction86 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction86, 0.0d, (double) 100.0f, (int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str68, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str69, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler79);
        org.junit.Assert.assertNotNull(stepHandler81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str83, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler84);
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 10.0d + "'", double85 == 10.0d);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler20 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (byte) -1, (int) (byte) -1, (double) (short) 1);
        double double26 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setInitialStepSize(0.0d);
        graggBulirschStoerIntegrator6.setOrderControl((int) ' ', (double) 0, (double) (short) 1);
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) 10, (double) 0, (double) (short) 100);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler42 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler42);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', (double) 100.0f, (double) 1.0f, (double) (short) 0);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) (short) 10);
        double double7 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double8 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        graggBulirschStoerIntegrator4.setStepsizeControl((-1.0d), (double) 1.0f, (double) 0L, (double) 10.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, (double) (short) -1, (double) ' ');
        double double5 = graggBulirschStoerIntegrator4.getMinStep();
        double double6 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 1, (double) 0L, 100.0d, (double) 0);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) (byte) 1, (int) (byte) 100, (double) (-1L));
        org.apache.commons.math.ode.StepHandler stepHandler11 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction15, 52.0d, 10.0d, (int) '#');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler11);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 10.0f);
        double double18 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) '4', (int) 'a', (-0.0d));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction24, (double) 0, 0.0d, (int) (byte) 100);
        double double29 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 31.622776601683793d + "'", double29 == 31.622776601683793d);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        double double20 = graggBulirschStoerIntegrator6.getMaxStep();
        double double21 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (byte) -1);
        double double25 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray30 = new double[] { (-1.0d), 0L };
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray30, doubleArray31);
        graggBulirschStoerIntegrator32.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator32.setInterpolationControl(false, (int) (short) 0);
        double double41 = graggBulirschStoerIntegrator32.getMinStep();
        double[] doubleArray46 = new double[] { (-1.0d), 0L };
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray46, doubleArray47);
        graggBulirschStoerIntegrator48.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str54 = graggBulirschStoerIntegrator48.getName();
        double[] doubleArray59 = new double[] { (-1.0d), 0L };
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator61 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray59, doubleArray60);
        graggBulirschStoerIntegrator61.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator61.setInterpolationControl(false, (int) (short) 0);
        double double70 = graggBulirschStoerIntegrator61.getMinStep();
        double double71 = graggBulirschStoerIntegrator61.getCurrentSignedStepsize();
        double double72 = graggBulirschStoerIntegrator61.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler73 = graggBulirschStoerIntegrator61.getStepHandler();
        graggBulirschStoerIntegrator48.setStepHandler(stepHandler73);
        graggBulirschStoerIntegrator32.setStepHandler(stepHandler73);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler73);
        double double77 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler78 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (-1.0f), (double) (-1.0f), 5.916079783099616d, 5.656854249492381d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str54, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 31.622776601683793d + "'", double71 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(stepHandler73);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler78);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) ' ', (double) '4', (double) (byte) -1, (double) (-1));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 100);
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) 100, 0.0d, 1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler32 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setOrderControl((int) 'a', 0.0d, (double) (-1L));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler32);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(33.26856145160071d, 0.0d, 5.916079783099616d, (double) (byte) 1);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1.0f), (double) (byte) 100, 5.656854249492381d, (double) 1L);
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setInitialStepSize(31.622776601683793d);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) '4');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction10, 31.622776601683793d, 0.0d, 0);
        double double15 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler20 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (byte) -1, (int) (byte) -1, (double) (short) 1);
        double double26 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setInitialStepSize(0.0d);
        graggBulirschStoerIntegrator6.setOrderControl((int) ' ', (double) 0, (double) (short) 1);
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        graggBulirschStoerIntegrator6.setOrderControl(10, (double) 'a', 0.0d);
        graggBulirschStoerIntegrator6.setInitialStepSize(0.0d);
        double double42 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) '#', 0, (double) (byte) 0);
        double double48 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, 100.0d, (double) '4', (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setOrderControl((int) (byte) 100, (double) (short) 100, (double) (short) -1);
        java.lang.String str10 = graggBulirschStoerIntegrator4.getName();
        double double11 = graggBulirschStoerIntegrator4.getMinStep();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str10, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray18 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray23 = new double[] { (-1.0d), 0L };
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator25 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray23, doubleArray24);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray18, doubleArray23);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator27 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray9, doubleArray23);
        double[] doubleArray35 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray40 = new double[] { (-1.0d), 0L };
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray40, doubleArray41);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray35, doubleArray40);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100, (double) 1, doubleArray9, doubleArray40);
        graggBulirschStoerIntegrator44.setStabilityCheck(false, 1, 10, (double) (short) 100);
        graggBulirschStoerIntegrator44.setStabilityCheck(false, (int) '4', 100, (double) 0.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        graggBulirschStoerIntegrator44.addSwitchingFunction(switchingFunction55, (double) 0L, (double) (byte) 1, 1);
        java.lang.Class<?> wildcardClass60 = graggBulirschStoerIntegrator44.getClass();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        double[] doubleArray5 = new double[] { (-1L), 31.622776601683793d, (byte) -1 };
        double[] doubleArray15 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray20 = new double[] { (-1.0d), 0L };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator22 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray20, doubleArray21);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray15, doubleArray20);
        double[] doubleArray30 = new double[] { (-1.0d), 0L };
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray30, doubleArray31);
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray30, doubleArray33);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (short) 10, doubleArray20, doubleArray33);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) (-1.0f), doubleArray5, doubleArray20);
        graggBulirschStoerIntegrator36.setOrderControl((int) (short) 10, 22.80350850198276d, 1.0d);
        graggBulirschStoerIntegrator36.setInterpolationControl(false, 0);
        double double44 = graggBulirschStoerIntegrator36.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[-1.0, 31.622776601683793, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-0.0d) + "'", double44 == (-0.0d));
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', (double) 100.0f, (double) 1.0f, (double) (short) 0);
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setStabilityCheck(false, (int) (byte) 100, 100, 31.622776601683793d);
        graggBulirschStoerIntegrator4.setStabilityCheck(false, (int) (short) -1, (-1), 10.0d);
        graggBulirschStoerIntegrator4.setStepsizeControl((double) 100, (-1.0d), 32.0d, (double) (short) -1);
        double double21 = graggBulirschStoerIntegrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 100, (double) 0L, (double) (-1), (double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) (short) 0);
        double double9 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double double10 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double11 = graggBulirschStoerIntegrator4.getMinStep();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        double[] doubleArray7 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray12 = new double[] { (-1.0d), 0L };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray12, doubleArray13);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator15 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray7, doubleArray12);
        org.apache.commons.math.ode.StepHandler stepHandler16 = graggBulirschStoerIntegrator15.getStepHandler();
        java.lang.String str17 = graggBulirschStoerIntegrator15.getName();
        graggBulirschStoerIntegrator15.setOrderControl((int) (short) 0, (double) 0L, 32.0d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str17, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray20 = new double[] { (-1.0d), 0L };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator22 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray20, doubleArray21);
        graggBulirschStoerIntegrator22.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator22.setInterpolationControl(false, (int) (short) 0);
        double double31 = graggBulirschStoerIntegrator22.getMinStep();
        double double32 = graggBulirschStoerIntegrator22.getCurrentSignedStepsize();
        double double33 = graggBulirschStoerIntegrator22.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler34 = graggBulirschStoerIntegrator22.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler34);
        double double36 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (int) '#', (double) (short) 0);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction44 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction44, 56.568542494923804d, 0.0d, (int) '#');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 31.622776601683793d + "'", double32 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(52.0d, (-0.0d), (double) (short) 1, (double) 0L);
        double double5 = graggBulirschStoerIntegrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 52.0d + "'", double5 == 52.0d);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        double[] doubleArray6 = new double[] { (-1.0d), 0L };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator8 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray6, doubleArray7);
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray6, doubleArray9);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        graggBulirschStoerIntegrator10.addSwitchingFunction(switchingFunction11, (double) (short) 1, (double) 100.0f, (int) (byte) 1);
        graggBulirschStoerIntegrator10.setStabilityCheck(true, 1, (int) '#', 0.0d);
        graggBulirschStoerIntegrator10.setInterpolationControl(false, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (short) 1, (double) (-1L), (double) (-1L));
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        double double6 = graggBulirschStoerIntegrator4.getMaxStep();
        java.lang.String str7 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str7, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction6, (double) 10, (double) (-1), 0);
        double double11 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        graggBulirschStoerIntegrator4.setStepsizeControl((double) 10, (double) (short) 0, (double) (short) 0, (double) 1L);
        graggBulirschStoerIntegrator4.setOrderControl((int) (short) 10, (double) 10, (double) (-1));
        graggBulirschStoerIntegrator4.setInitialStepSize((double) 1.0f);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        double[] doubleArray10 = new double[] { (-1.0d), 0L };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray10, doubleArray11);
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray10, doubleArray13);
        double[] doubleArray24 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray29 = new double[] { (-1.0d), 0L };
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator31 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray29, doubleArray30);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray24, doubleArray29);
        double[] doubleArray40 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray45 = new double[] { (-1.0d), 0L };
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray45, doubleArray46);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray40, doubleArray45);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 0, doubleArray29, doubleArray40);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) 10L, doubleArray13, doubleArray29);
        double[] doubleArray53 = null;
        double[] doubleArray63 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray68 = new double[] { (-1.0d), 0L };
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator70 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray68, doubleArray69);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator71 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray63, doubleArray68);
        double[] doubleArray79 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray84 = new double[] { (-1.0d), 0L };
        double[] doubleArray85 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator86 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray84, doubleArray85);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator87 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray79, doubleArray84);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator88 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 0, doubleArray68, doubleArray79);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator89 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10L, (double) (byte) 100, doubleArray53, doubleArray79);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator90 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) -1, doubleArray29, doubleArray79);
        double double91 = graggBulirschStoerIntegrator90.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 0.0d + "'", double91 == 0.0d);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        double double19 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setOrderControl((-1), (double) 10, (double) 10.0f);
        double double27 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler28 = graggBulirschStoerIntegrator6.getStepHandler();
        double double29 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction32, 10.0d, (double) 0L, (int) (byte) 0);
        double double37 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setInitialStepSize(5.916079783099616d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        double double19 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) 1);
        java.lang.String str25 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setInitialStepSize(Double.NaN);
        double double28 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (short) 1);
        graggBulirschStoerIntegrator6.setInitialStepSize(3.1622776601683795d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str25, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 31.622776601683793d + "'", double28 == 31.622776601683793d);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(22.80350850198276d, (double) 100, (double) (-1.0f), 33.26856145160071d);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 0, (double) 0.0f, (double) '#', (double) ' ');
        double[] doubleArray9 = new double[] { (-1.0d), 0L };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator11 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray9, doubleArray10);
        graggBulirschStoerIntegrator11.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator11.setInterpolationControl(false, (int) (short) 0);
        double double20 = graggBulirschStoerIntegrator11.getMinStep();
        graggBulirschStoerIntegrator11.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator11.setStabilityCheck(false, (int) (byte) 1, (int) '4', (double) (-1.0f));
        graggBulirschStoerIntegrator11.setInterpolationControl(true, 10);
        org.apache.commons.math.ode.StepHandler stepHandler34 = graggBulirschStoerIntegrator11.getStepHandler();
        double double35 = graggBulirschStoerIntegrator11.getCurrentStepStart();
        double double36 = graggBulirschStoerIntegrator11.getMinStep();
        double[] doubleArray41 = new double[] { (-1.0d), 0L };
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray41, doubleArray42);
        graggBulirschStoerIntegrator43.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator43.setInterpolationControl(false, (int) (short) 0);
        double double52 = graggBulirschStoerIntegrator43.getMinStep();
        double[] doubleArray57 = new double[] { (-1.0d), 0L };
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator59 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray57, doubleArray58);
        graggBulirschStoerIntegrator59.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator59.setInterpolationControl(false, (int) (short) 0);
        double double68 = graggBulirschStoerIntegrator59.getMinStep();
        double double69 = graggBulirschStoerIntegrator59.getCurrentSignedStepsize();
        double double70 = graggBulirschStoerIntegrator59.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler71 = graggBulirschStoerIntegrator59.getStepHandler();
        graggBulirschStoerIntegrator43.setStepHandler(stepHandler71);
        graggBulirschStoerIntegrator11.setStepHandler(stepHandler71);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler71);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 31.622776601683793d + "'", double69 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertNotNull(stepHandler71);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator6.setOrderControl((int) '#', (double) (short) 0, (double) 1);
        org.apache.commons.math.ode.StepHandler stepHandler23 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, 1, 0, (double) (byte) 10);
        java.lang.String str29 = graggBulirschStoerIntegrator6.getName();
        double double30 = graggBulirschStoerIntegrator6.getMinStep();
        java.lang.Class<?> wildcardClass31 = graggBulirschStoerIntegrator6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str29, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', 5.916079783099616d, 15.100830606950982d, 35.0d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        double[] doubleArray6 = new double[] { (-1.0d), 0L };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator8 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray6, doubleArray7);
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray6, doubleArray9);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        graggBulirschStoerIntegrator10.addSwitchingFunction(switchingFunction11, (double) 100, (double) 10L, (int) '4');
        double double16 = graggBulirschStoerIntegrator10.getMinStep();
        graggBulirschStoerIntegrator10.setInterpolationControl(true, 0);
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(52.0d, (double) 10L, (double) (short) 10, (double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 0, (double) 10, (double) 'a');
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator27 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double28 = graggBulirschStoerIntegrator27.getMaxStep();
        graggBulirschStoerIntegrator27.setInitialStepSize(31.622776601683793d);
        org.apache.commons.math.ode.StepHandler stepHandler31 = graggBulirschStoerIntegrator27.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler31);
        graggBulirschStoerIntegrator6.setInitialStepSize(10.0d);
        java.lang.String str35 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (-1));
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str35, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        double[] doubleArray11 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray16 = new double[] { (-1.0d), 0L };
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator18 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray16, doubleArray17);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray11, doubleArray16);
        double[] doubleArray26 = new double[] { (-1.0d), 0L };
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator28 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray26, doubleArray27);
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator30 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray26, doubleArray29);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator31 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (short) 10, doubleArray16, doubleArray29);
        double[] doubleArray34 = null;
        double[] doubleArray44 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray49 = new double[] { (-1.0d), 0L };
        double[] doubleArray50 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator51 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray49, doubleArray50);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray44, doubleArray49);
        double[] doubleArray60 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray65 = new double[] { (-1.0d), 0L };
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray65, doubleArray66);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator68 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray60, doubleArray65);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator69 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 0, doubleArray49, doubleArray60);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator70 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10L, (double) (byte) 100, doubleArray34, doubleArray60);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator71 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) (byte) -1, doubleArray29, doubleArray34);
        double double72 = graggBulirschStoerIntegrator71.getCurrentStepStart();
        graggBulirschStoerIntegrator71.setStabilityCheck(false, (int) 'a', (int) (short) -1, 0.0d);
        graggBulirschStoerIntegrator71.setStabilityCheck(false, (int) '#', (int) (byte) 100, (double) 0.0f);
        java.lang.String str83 = graggBulirschStoerIntegrator71.getName();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str83, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 100, (double) 0L, (double) (-1), (double) '4');
        double double5 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double double6 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double double7 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator4.setStepsizeControl(Double.NaN, (double) ' ', (double) 1L, (double) (byte) 1);
        graggBulirschStoerIntegrator4.setStabilityCheck(true, 0, (int) '4', 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100.0f, (double) 100, (double) 0.0f, (double) (short) -1);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        java.lang.String str6 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str6, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator6.setOrderControl((int) '#', (double) (short) 0, (double) 1);
        org.apache.commons.math.ode.StepHandler stepHandler23 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setInitialStepSize(1.0d);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator30 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double31 = graggBulirschStoerIntegrator30.getMaxStep();
        graggBulirschStoerIntegrator30.setOrderControl(0, (double) (short) 10, (double) 1.0f);
        org.apache.commons.math.ode.StepHandler stepHandler36 = graggBulirschStoerIntegrator30.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler36);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 1.0d + "'", double31 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        double double14 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (short) 1);
        double double17 = graggBulirschStoerIntegrator6.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        double double19 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setOrderControl((-1), (double) 10, (double) 10.0f);
        double double27 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler28 = graggBulirschStoerIntegrator6.getStepHandler();
        double double29 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction32, 10.0d, (double) 0L, (int) (byte) 0);
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, (double) (byte) 100, (double) 10L, (double) ' ');
        graggBulirschStoerIntegrator4.setOrderControl(1, (double) 100L, 1.0d);
        double double9 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double10 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double[] doubleArray15 = new double[] { (-1.0d), 0L };
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator17 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray15, doubleArray16);
        graggBulirschStoerIntegrator17.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator17.setInterpolationControl(false, (int) (short) 0);
        double double26 = graggBulirschStoerIntegrator17.getMinStep();
        graggBulirschStoerIntegrator17.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler31 = graggBulirschStoerIntegrator17.getStepHandler();
        graggBulirschStoerIntegrator17.setStabilityCheck(true, (int) (byte) -1, (int) (byte) -1, (double) (short) 1);
        graggBulirschStoerIntegrator17.setOrderControl((int) (short) 0, (double) (-1L), (double) 100.0f);
        double[] doubleArray45 = new double[] { (-1.0d), 0L };
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray45, doubleArray46);
        graggBulirschStoerIntegrator47.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator47.setInterpolationControl(false, (int) (short) 0);
        double double56 = graggBulirschStoerIntegrator47.getMinStep();
        double double57 = graggBulirschStoerIntegrator47.getCurrentSignedStepsize();
        double double58 = graggBulirschStoerIntegrator47.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler59 = graggBulirschStoerIntegrator47.getStepHandler();
        double double60 = graggBulirschStoerIntegrator47.getMaxStep();
        graggBulirschStoerIntegrator47.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator47.setOrderControl((-1), (double) 10, (double) 10.0f);
        double double68 = graggBulirschStoerIntegrator47.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler69 = graggBulirschStoerIntegrator47.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler70 = graggBulirschStoerIntegrator47.getStepHandler();
        graggBulirschStoerIntegrator17.setStepHandler(stepHandler70);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler70);
        double double73 = graggBulirschStoerIntegrator4.getMinStep();
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) (byte) -1, (int) ' ', 5.656854249492381d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 31.622776601683793d + "'", double57 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(stepHandler59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(stepHandler69);
        org.junit.Assert.assertNotNull(stepHandler70);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (-1L), 100.0d, (double) (short) 0, (double) (short) 100);
        double double18 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        double double20 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler21 = graggBulirschStoerIntegrator6.getStepHandler();
        double double22 = graggBulirschStoerIntegrator6.getMaxStep();
        double double23 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 1L);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 31.622776601683793d + "'", double23 == 31.622776601683793d);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        double double19 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) 1);
        java.lang.String str25 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setInitialStepSize(Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler28 = graggBulirschStoerIntegrator6.getStepHandler();
        java.lang.String str29 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) '#', (double) 0.0f, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler35 = graggBulirschStoerIntegrator34.getStepHandler();
        graggBulirschStoerIntegrator34.setInterpolationControl(true, (int) ' ');
        graggBulirschStoerIntegrator34.setOrderControl(100, (double) (short) 10, (double) 10.0f);
        double[] doubleArray47 = new double[] { (-1.0d), 0L };
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray47, doubleArray48);
        graggBulirschStoerIntegrator49.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str55 = graggBulirschStoerIntegrator49.getName();
        org.apache.commons.math.ode.StepHandler stepHandler56 = graggBulirschStoerIntegrator49.getStepHandler();
        graggBulirschStoerIntegrator34.setStepHandler(stepHandler56);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler56);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction59 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction59, 0.0d, (double) (byte) 0, (int) '4');
        java.lang.Class<?> wildcardClass64 = graggBulirschStoerIntegrator6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str25, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str29, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str55, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler56);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, 1.0d, (double) 100.0f);
        double[] doubleArray9 = new double[] { (-1.0d), 0L };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator11 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray9, doubleArray10);
        graggBulirschStoerIntegrator11.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator11.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator11.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator11.setStabilityCheck(true, (int) (byte) 0, (int) '4', (double) (byte) -1);
        graggBulirschStoerIntegrator11.setOrderControl((int) ' ', (double) (short) 100, (double) (byte) 10);
        double double34 = graggBulirschStoerIntegrator11.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler35 = graggBulirschStoerIntegrator11.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler35);
        graggBulirschStoerIntegrator4.setInterpolationControl(true, 100);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 31.622776601683793d + "'", double34 == 31.622776601683793d);
        org.junit.Assert.assertNotNull(stepHandler35);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray19 = new double[] { (-1.0d), 0L };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray19, doubleArray20);
        double[] doubleArray29 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray34 = new double[] { (-1.0d), 0L };
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray34, doubleArray35);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray29, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray20, doubleArray34);
        double[] doubleArray44 = new double[] { (-1L), 31.622776601683793d, (byte) -1 };
        double[] doubleArray54 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray59 = new double[] { (-1.0d), 0L };
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator61 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray59, doubleArray60);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator62 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray54, doubleArray59);
        double[] doubleArray69 = new double[] { (-1.0d), 0L };
        double[] doubleArray70 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator71 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray69, doubleArray70);
        double[] doubleArray72 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator73 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray69, doubleArray72);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator74 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (short) 10, doubleArray59, doubleArray72);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator75 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) (-1.0f), doubleArray44, doubleArray59);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator76 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (short) 100, doubleArray34, doubleArray59);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator77 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1.0f, 0.0d, doubleArray8, doubleArray59);
        double[] doubleArray78 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator79 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, 0.0d, doubleArray8, doubleArray78);
        org.apache.commons.math.ode.StepHandler stepHandler80 = graggBulirschStoerIntegrator79.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 31.622776601683793, -1.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertNotNull(stepHandler80);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        double[] doubleArray10 = new double[] { (-1.0d), 0L };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray10, doubleArray11);
        double[] doubleArray20 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray25 = new double[] { (-1.0d), 0L };
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator27 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray25, doubleArray26);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator28 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray20, doubleArray25);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray10, doubleArray25);
        double[] doubleArray36 = new double[] { (-1.0d), 0L };
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray36, doubleArray37);
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray36, doubleArray39);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, (double) (-1), doubleArray25, doubleArray36);
        double[] doubleArray50 = new double[] { (-1.0d), 0L };
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray50, doubleArray51);
        double[] doubleArray60 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray65 = new double[] { (-1.0d), 0L };
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray65, doubleArray66);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator68 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray60, doubleArray65);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator69 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray50, doubleArray65);
        double[] doubleArray76 = new double[] { (-1.0d), 0L };
        double[] doubleArray77 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator78 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray76, doubleArray77);
        double[] doubleArray79 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator80 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray76, doubleArray79);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator81 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, (double) (-1), doubleArray65, doubleArray76);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator82 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) '4', (double) (short) -1, doubleArray36, doubleArray65);
        graggBulirschStoerIntegrator82.setOrderControl(0, (double) (byte) 1, 35.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction87 = null;
        graggBulirschStoerIntegrator82.addSwitchingFunction(switchingFunction87, 3.1622776601683795d, Double.NaN, (int) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler92 = graggBulirschStoerIntegrator82.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertNotNull(stepHandler92);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setInitialStepSize(0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction19, 0.0d, Double.NaN, (int) (short) 100);
        double double24 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        java.lang.Class<?> wildcardClass25 = graggBulirschStoerIntegrator6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 1, (double) 0L, 100.0d, (double) 0);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) (short) 0);
        double double9 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        graggBulirschStoerIntegrator4.setInitialStepSize((double) (byte) 100);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(15.100830606950982d, (double) (short) 100, (double) ' ', (double) (short) 10);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        double[] doubleArray9 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray14 = new double[] { (-1.0d), 0L };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray14, doubleArray15);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator17 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray9, doubleArray14);
        double[] doubleArray25 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray30 = new double[] { (-1.0d), 0L };
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray30, doubleArray31);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray25, doubleArray30);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 0, doubleArray14, doubleArray25);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        graggBulirschStoerIntegrator34.addSwitchingFunction(switchingFunction35, 35.0d, 15.100830606950982d, (int) (byte) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        graggBulirschStoerIntegrator34.addSwitchingFunction(switchingFunction40, (double) 0, (double) (byte) 0, 1);
        graggBulirschStoerIntegrator34.setInitialStepSize((-1.0d));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        java.lang.String str17 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) ' ', (int) (byte) 100, (-1.0d));
        double double23 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str17, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 31.622776601683793d + "'", double23 == 31.622776601683793d);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        double[] doubleArray9 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray14 = new double[] { (-1.0d), 0L };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray14, doubleArray15);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator17 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray9, doubleArray14);
        double[] doubleArray25 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray30 = new double[] { (-1.0d), 0L };
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray30, doubleArray31);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray25, doubleArray30);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 0, doubleArray14, doubleArray25);
        double double35 = graggBulirschStoerIntegrator34.getCurrentStepStart();
        graggBulirschStoerIntegrator34.setStabilityCheck(true, (int) (short) 0, 10, 100.0d);
        double double41 = graggBulirschStoerIntegrator34.getCurrentStepStart();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1.0f, (double) (byte) 0, 31.622776601683793d, (double) ' ');
        java.lang.String str47 = graggBulirschStoerIntegrator46.getName();
        org.apache.commons.math.ode.StepHandler stepHandler48 = graggBulirschStoerIntegrator46.getStepHandler();
        graggBulirschStoerIntegrator34.setStepHandler(stepHandler48);
        org.apache.commons.math.ode.StepHandler stepHandler50 = graggBulirschStoerIntegrator34.getStepHandler();
        double double51 = graggBulirschStoerIntegrator34.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator34.setStabilityCheck(false, (int) (short) -1, (int) (byte) -1, 5.916079783099616d);
        graggBulirschStoerIntegrator34.setStabilityCheck(true, (int) (byte) 1, (int) (short) -1, (double) 1.0f);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str47, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray18 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray23 = new double[] { (-1.0d), 0L };
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator25 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray23, doubleArray24);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray18, doubleArray23);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator27 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray8, doubleArray23);
        double[] doubleArray28 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) -1, (double) 1.0f, doubleArray8, doubleArray28);
        graggBulirschStoerIntegrator29.setStepsizeControl((double) (-1L), (double) '#', (double) 0L, (double) (byte) 1);
        double double35 = graggBulirschStoerIntegrator29.getCurrentStepStart();
        java.lang.String str36 = graggBulirschStoerIntegrator29.getName();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str36, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 0, (double) 10, (double) 'a');
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 0, (double) (byte) 100, (double) 10L);
        double double27 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setOrderControl(0, (double) 1, (double) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) '#', (int) (short) 10, (double) (short) 1);
        double double26 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double27 = graggBulirschStoerIntegrator6.getMinStep();
        double double28 = graggBulirschStoerIntegrator6.getMaxStep();
        double double29 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) -1, (int) (short) -1, (double) 1.0f);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 31.622776601683793d + "'", double26 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 100.0d + "'", double29 == 100.0d);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) (byte) 100, (double) 0.0f, (double) (short) 0);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray18 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray23 = new double[] { (-1.0d), 0L };
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator25 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray23, doubleArray24);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray18, doubleArray23);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator27 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray8, doubleArray23);
        double[] doubleArray28 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) -1, (double) 1.0f, doubleArray8, doubleArray28);
        graggBulirschStoerIntegrator29.setStepsizeControl((double) (-1L), (double) '#', (double) 0L, (double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler35 = graggBulirschStoerIntegrator29.getStepHandler();
        graggBulirschStoerIntegrator29.setInterpolationControl(false, 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        graggBulirschStoerIntegrator29.addSwitchingFunction(switchingFunction39, (double) 0.0f, 0.0d, (int) 'a');
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[]");
        org.junit.Assert.assertNotNull(stepHandler35);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        double[] doubleArray11 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray16 = new double[] { (-1.0d), 0L };
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator18 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray16, doubleArray17);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray11, doubleArray16);
        double[] doubleArray27 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray32 = new double[] { (-1.0d), 0L };
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray32, doubleArray33);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray27, doubleArray32);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 0, doubleArray16, doubleArray27);
        double[] doubleArray41 = new double[] { (-1.0d), 0L };
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray41, doubleArray42);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, Double.NaN, doubleArray27, doubleArray42);
        graggBulirschStoerIntegrator44.setOrderControl(0, 0.0d, (double) (-1L));
        graggBulirschStoerIntegrator44.setInterpolationControl(false, (int) (short) 100);
        double double52 = graggBulirschStoerIntegrator44.getCurrentStepStart();
        double double53 = graggBulirschStoerIntegrator44.getCurrentSignedStepsize();
        double double54 = graggBulirschStoerIntegrator44.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        graggBulirschStoerIntegrator44.addSwitchingFunction(switchingFunction55, (double) (short) -1, (double) '#', (int) ' ');
        double double60 = graggBulirschStoerIntegrator44.getMaxStep();
        java.lang.Class<?> wildcardClass61 = graggBulirschStoerIntegrator44.getClass();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 100.0d + "'", double54 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) -1, (int) 'a', (double) (-1.0f));
        double double19 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (short) 0, (double) (byte) 10, Double.NaN, (double) 10.0f);
        java.lang.String str25 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction26, (double) (byte) 10, 52.0d, (int) (byte) 1);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) '4');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str25, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100L, (double) 100, (double) (byte) 0, (double) 1.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, 1.0d, 5.656854249492381d, (-1));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        double double19 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setOrderControl((-1), (double) 10, (double) 10.0f);
        double double27 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler28 = graggBulirschStoerIntegrator6.getStepHandler();
        java.lang.String str29 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) ' ', (double) 100.0f, Double.NaN, 35.0d);
        java.lang.String str35 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, (double) (short) 10, 35.0d, 1.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str29, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str35, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        double[] doubleArray9 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray14 = new double[] { (-1.0d), 0L };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray14, doubleArray15);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator17 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray9, doubleArray14);
        double[] doubleArray24 = new double[] { (-1.0d), 0L };
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray24, doubleArray25);
        double[] doubleArray33 = new double[] { (-1.0d), 0L };
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray33, doubleArray34);
        double[] doubleArray43 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray48 = new double[] { (-1.0d), 0L };
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray48, doubleArray49);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator51 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray43, doubleArray48);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray34, doubleArray48);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator53 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 100.0f, doubleArray24, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator54 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) (byte) 10, doubleArray14, doubleArray34);
        java.lang.String str55 = graggBulirschStoerIntegrator54.getName();
        java.lang.String str56 = graggBulirschStoerIntegrator54.getName();
        double double57 = graggBulirschStoerIntegrator54.getCurrentSignedStepsize();
        double[] doubleArray62 = new double[] { (-1.0d), 0L };
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator64 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray62, doubleArray63);
        graggBulirschStoerIntegrator64.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator64.setInterpolationControl(false, (int) (short) 0);
        double double73 = graggBulirschStoerIntegrator64.getMinStep();
        double double74 = graggBulirschStoerIntegrator64.getCurrentSignedStepsize();
        java.lang.String str75 = graggBulirschStoerIntegrator64.getName();
        graggBulirschStoerIntegrator64.setStabilityCheck(false, (int) ' ', (int) (byte) 100, (-1.0d));
        graggBulirschStoerIntegrator64.setInitialStepSize((double) (byte) 100);
        double double83 = graggBulirschStoerIntegrator64.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler84 = graggBulirschStoerIntegrator64.getStepHandler();
        graggBulirschStoerIntegrator54.setStepHandler(stepHandler84);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str55, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str56, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 31.622776601683793d + "'", double57 == 31.622776601683793d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 31.622776601683793d + "'", double74 == 31.622776601683793d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str75, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler84);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler20 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (byte) -1, (int) (byte) -1, (double) (short) 1);
        double double26 = graggBulirschStoerIntegrator6.getMinStep();
        double double27 = graggBulirschStoerIntegrator6.getMinStep();
        double double28 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction29, (double) (byte) 1, (double) '4', (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction34 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction34, (double) (short) -1, 32.0d, 0);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (int) (short) 1, (double) 1.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        double double21 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (short) 1, (double) (short) 10, (double) (byte) 10, (double) (short) -1);
        java.lang.String str27 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 10L);
        graggBulirschStoerIntegrator6.setStepsizeControl(42.661458015403085d, (double) (short) 10, (double) (byte) 0, (double) 1.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str27, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler21 = graggBulirschStoerIntegrator6.getStepHandler();
        double double22 = graggBulirschStoerIntegrator6.getMaxStep();
        double double23 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double24 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 100.0d + "'", double22 == 100.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 31.622776601683793d + "'", double23 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 31.622776601683793d + "'", double24 == 31.622776601683793d);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) 1, (int) '4', (double) (-1.0f));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        org.apache.commons.math.ode.StepHandler stepHandler29 = graggBulirschStoerIntegrator6.getStepHandler();
        java.lang.String str30 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str31 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction32, 97.0d, (double) 0, 10);
        double double37 = graggBulirschStoerIntegrator6.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str30, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str31, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        double double19 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) 1);
        double double25 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 10, (int) (short) 100, (double) (short) 0);
        double double31 = graggBulirschStoerIntegrator6.getMinStep();
        double double32 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction33, 33.26856145160071d, (double) 'a', (int) (short) 1);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 10.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(56.568542494923804d, (double) 10L, (double) 10, (double) '4');
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        double[] doubleArray17 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray22 = new double[] { (-1.0d), 0L };
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator24 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray22, doubleArray23);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator25 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray17, doubleArray22);
        double[] doubleArray33 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray38 = new double[] { (-1.0d), 0L };
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray38, doubleArray39);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray33, doubleArray38);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 0, doubleArray22, doubleArray33);
        double[] doubleArray47 = new double[] { (-1.0d), 0L };
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray47, doubleArray48);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, Double.NaN, doubleArray33, doubleArray48);
        org.apache.commons.math.ode.StepHandler stepHandler51 = graggBulirschStoerIntegrator50.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler51);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(stepHandler51);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(56.568542494923804d, (double) 10L, (double) 10, (double) '4');
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setStabilityCheck(false, (int) '#', (int) (byte) -1, 52.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', (double) 10.0f, (double) ' ', (double) (byte) -1);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, 100.0d, (double) (byte) 0, 22.80350850198276d);
        double double5 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = graggBulirschStoerIntegrator4.getStepHandler();
        double double7 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        double[] doubleArray2 = null;
        double[] doubleArray11 = new double[] { (-1.0d), 0L };
        double[] doubleArray12 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator13 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray11, doubleArray12);
        double[] doubleArray21 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray26 = new double[] { (-1.0d), 0L };
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator28 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray26, doubleArray27);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray21, doubleArray26);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator30 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray12, doubleArray26);
        double[] doubleArray38 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray43 = new double[] { (-1.0d), 0L };
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray43, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray38, doubleArray43);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100, (double) 1, doubleArray12, doubleArray43);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 0, 0.0d, doubleArray2, doubleArray43);
        graggBulirschStoerIntegrator48.setInitialStepSize((double) 100.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction51 = null;
        graggBulirschStoerIntegrator48.addSwitchingFunction(switchingFunction51, (double) 1.0f, (double) (byte) 10, (int) (byte) 1);
        graggBulirschStoerIntegrator48.setStabilityCheck(true, (int) 'a', (int) (short) 10, (double) 100L);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        double[] doubleArray9 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray14 = new double[] { (-1.0d), 0L };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray14, doubleArray15);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator17 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray9, doubleArray14);
        double[] doubleArray27 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray32 = new double[] { (-1.0d), 0L };
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray32, doubleArray33);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray27, doubleArray32);
        double[] doubleArray42 = new double[] { (-1.0d), 0L };
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray42, doubleArray43);
        double[] doubleArray51 = new double[] { (-1.0d), 0L };
        double[] doubleArray52 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator53 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray51, doubleArray52);
        double[] doubleArray61 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray66 = new double[] { (-1.0d), 0L };
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator68 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray66, doubleArray67);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator69 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray61, doubleArray66);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator70 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray52, doubleArray66);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator71 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 100.0f, doubleArray42, doubleArray52);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator72 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) (byte) 10, doubleArray32, doubleArray52);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator73 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) -1, (double) (byte) 1, doubleArray9, doubleArray52);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction74 = null;
        graggBulirschStoerIntegrator73.addSwitchingFunction(switchingFunction74, 100.0d, 35.0d, (int) '#');
        org.apache.commons.math.ode.StepHandler stepHandler79 = graggBulirschStoerIntegrator73.getStepHandler();
        double double80 = graggBulirschStoerIntegrator73.getMinStep();
        graggBulirschStoerIntegrator73.setInitialStepSize((double) (-1));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertNotNull(stepHandler79);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + (-1.0d) + "'", double80 == (-1.0d));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setInitialStepSize(31.622776601683793d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction9, 100.0d, (double) (-1L), (int) (short) 1);
        double double14 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double15 = graggBulirschStoerIntegrator4.getMinStep();
        graggBulirschStoerIntegrator4.setInitialStepSize((-0.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) ' ', (double) '4', (double) (byte) -1, (double) (-1));
        graggBulirschStoerIntegrator6.setInitialStepSize((double) '#');
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler30 = graggBulirschStoerIntegrator6.getStepHandler();
        double double31 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double double32 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler33 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler30);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(stepHandler33);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, 22.80350850198276d, (double) (-1L), 15.100830606950982d);
        double double5 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double6 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) (byte) 1, 1.0d, (double) 0.0f);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (-1L), 100.0d, (double) (short) 0, (double) (short) 100);
        double double18 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 1);
        graggBulirschStoerIntegrator6.setInitialStepSize(22.80350850198276d);
        java.lang.String str24 = graggBulirschStoerIntegrator6.getName();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str24, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        double[] doubleArray11 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray16 = new double[] { (-1.0d), 0L };
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator18 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray16, doubleArray17);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray11, doubleArray16);
        double[] doubleArray27 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray32 = new double[] { (-1.0d), 0L };
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray32, doubleArray33);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray27, doubleArray32);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 0, doubleArray16, doubleArray27);
        double[] doubleArray41 = new double[] { (-1.0d), 0L };
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray41, doubleArray42);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, Double.NaN, doubleArray27, doubleArray42);
        org.apache.commons.math.ode.StepHandler stepHandler45 = graggBulirschStoerIntegrator44.getStepHandler();
        graggBulirschStoerIntegrator44.setInterpolationControl(true, (int) 'a');
        graggBulirschStoerIntegrator44.setStepsizeControl((double) (byte) 0, (double) 1.0f, (double) (short) 10, (double) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(stepHandler45);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (-1), 31.622776601683793d, (-0.0d));
        graggBulirschStoerIntegrator4.setOrderControl((int) (short) -1, (double) 1.0f, (double) 10L);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) ' ', (double) '4', (double) (byte) -1, (double) (-1));
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 1.0f, (double) 1.0f, (double) (short) 1, (double) (byte) 10);
        java.lang.String str30 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) '#');
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (byte) 1);
        double double37 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double38 = graggBulirschStoerIntegrator6.getMinStep();
        java.lang.String str39 = graggBulirschStoerIntegrator6.getName();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str30, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 31.622776601683793d + "'", double37 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str39, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        double double19 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) 1);
        java.lang.String str25 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction26, (double) (byte) 100, (double) (-1L), (int) (byte) 100);
        double[] doubleArray35 = new double[] { (-1.0d), 0L };
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray35, doubleArray36);
        graggBulirschStoerIntegrator37.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str43 = graggBulirschStoerIntegrator37.getName();
        java.lang.String str44 = graggBulirschStoerIntegrator37.getName();
        graggBulirschStoerIntegrator37.setStabilityCheck(false, (int) (byte) -1, (int) 'a', (double) (-1.0f));
        double double50 = graggBulirschStoerIntegrator37.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler51 = graggBulirschStoerIntegrator37.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler51);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str25, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str43, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str44, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(stepHandler51);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler20 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (byte) -1, (int) (byte) -1, (double) (short) 1);
        double double26 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setInitialStepSize(0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) 10, (int) ' ', (double) 100L);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (byte) 0, (double) 0.0f, 1.0d, (double) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) 1, (int) '4', (double) (-1.0f));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        org.apache.commons.math.ode.StepHandler stepHandler29 = graggBulirschStoerIntegrator6.getStepHandler();
        java.lang.String str30 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) 0, (double) 1.0f, (double) ' ');
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (-1), (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction40, (double) (byte) 1, (double) (short) 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str30, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        double[] doubleArray6 = new double[] { (-1.0d), 0L };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator8 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray6, doubleArray7);
        double[] doubleArray15 = new double[] { (-1.0d), 0L };
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator17 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray15, doubleArray16);
        double[] doubleArray25 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray30 = new double[] { (-1.0d), 0L };
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray30, doubleArray31);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray25, doubleArray30);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray16, doubleArray30);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 100.0f, doubleArray6, doubleArray16);
        double double36 = graggBulirschStoerIntegrator35.getMinStep();
        java.lang.Class<?> wildcardClass37 = graggBulirschStoerIntegrator35.getClass();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 1.0d + "'", double36 == 1.0d);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(31.622776601683793d, (double) 10L, (double) (byte) 1, (double) 100);
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations5 = null;
        double[] doubleArray17 = new double[] { (-1.0d), 0L };
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray17, doubleArray18);
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray17, doubleArray20);
        double[] doubleArray28 = new double[] { (-1.0d), 0L };
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator30 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray28, doubleArray29);
        double[] doubleArray38 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray43 = new double[] { (-1.0d), 0L };
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray43, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray38, doubleArray43);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray29, doubleArray43);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 1L, doubleArray17, doubleArray43);
        double[] doubleArray58 = new double[] { (byte) 10, 0.0f, 0.0d, 10.0f, 31.622776601683793d };
        double[] doubleArray63 = new double[] { (-1.0d), 0L };
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator65 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray63, doubleArray64);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator66 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, (double) (byte) 1, doubleArray58, doubleArray63);
        double[] doubleArray73 = new double[] { (-1.0d), 0L };
        double[] doubleArray74 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator75 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray73, doubleArray74);
        double[] doubleArray76 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator77 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray73, doubleArray76);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator78 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) (short) 10, doubleArray63, doubleArray76);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator79 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, (double) '#', doubleArray17, doubleArray76);
        double[] doubleArray81 = null;
        // The following exception was thrown during execution in test generation
        try {
            graggBulirschStoerIntegrator4.integrate(firstOrderDifferentialEquations5, (double) 0.0f, doubleArray17, 5.656854249492381d, doubleArray81);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 0.0, 0.0, 10.0, 31.622776601683793]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray20 = new double[] { (-1.0d), 0L };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator22 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray20, doubleArray21);
        graggBulirschStoerIntegrator22.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator22.setInterpolationControl(false, (int) (short) 0);
        double double31 = graggBulirschStoerIntegrator22.getMinStep();
        double double32 = graggBulirschStoerIntegrator22.getCurrentSignedStepsize();
        double double33 = graggBulirschStoerIntegrator22.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler34 = graggBulirschStoerIntegrator22.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler34);
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 0, (double) 1L, (double) 0.0f);
        double[] doubleArray44 = new double[] { (-1.0d), 0L };
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray44, doubleArray45);
        graggBulirschStoerIntegrator46.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str52 = graggBulirschStoerIntegrator46.getName();
        java.lang.String str53 = graggBulirschStoerIntegrator46.getName();
        graggBulirschStoerIntegrator46.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator46.setOrderControl((int) '#', (double) (short) 0, (double) 1);
        org.apache.commons.math.ode.StepHandler stepHandler63 = graggBulirschStoerIntegrator46.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler63);
        graggBulirschStoerIntegrator6.setInitialStepSize(10.0d);
        java.lang.String str67 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (-1L), (double) 100, (double) (short) -1, (double) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler73 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) 10, (double) 1L, (double) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 31.622776601683793d + "'", double32 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str52, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str53, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str67, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler73);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (short) 0, (int) 'a', 0.0d);
        double double25 = graggBulirschStoerIntegrator6.getMaxStep();
        double double26 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setOrderControl(10, (double) (short) 1, 31.622776601683793d);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) ' ', 32.0d, (double) 0L, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 100.0d + "'", double25 == 100.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 31.622776601683793d + "'", double26 == 31.622776601683793d);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) ' ', (double) '4', (double) (byte) -1, (double) (-1));
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 1.0f, (double) 1.0f, (double) (short) 1, (double) (byte) 10);
        java.lang.String str30 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) '#');
        double[] doubleArray38 = new double[] { (-1.0d), 0L };
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray38, doubleArray39);
        graggBulirschStoerIntegrator40.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator40.setInterpolationControl(false, (int) (short) 0);
        double double49 = graggBulirschStoerIntegrator40.getMinStep();
        double[] doubleArray54 = new double[] { (-1.0d), 0L };
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray54, doubleArray55);
        graggBulirschStoerIntegrator56.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator56.setInterpolationControl(false, (int) (short) 0);
        double double65 = graggBulirschStoerIntegrator56.getMinStep();
        double double66 = graggBulirschStoerIntegrator56.getCurrentSignedStepsize();
        double double67 = graggBulirschStoerIntegrator56.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler68 = graggBulirschStoerIntegrator56.getStepHandler();
        graggBulirschStoerIntegrator40.setStepHandler(stepHandler68);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler68);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (int) (byte) -1, (double) 100.0f);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str30, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 10.0d + "'", double65 == 10.0d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 31.622776601683793d + "'", double66 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertNotNull(stepHandler68);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray8, doubleArray11);
        double[] doubleArray21 = new double[] { (-1.0d), 0L };
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray21, doubleArray22);
        double[] doubleArray31 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray36 = new double[] { (-1.0d), 0L };
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray36, doubleArray37);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray31, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray21, doubleArray36);
        double[] doubleArray47 = new double[] { (-1.0d), 0L };
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray47, doubleArray48);
        double[] doubleArray50 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator51 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray47, doubleArray50);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, (double) (-1), doubleArray36, doubleArray47);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator53 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100L, (double) 100, doubleArray11, doubleArray36);
        graggBulirschStoerIntegrator53.setOrderControl((int) (short) 100, (double) '4', (double) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        double[] doubleArray11 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray16 = new double[] { (-1.0d), 0L };
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator18 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray16, doubleArray17);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray11, doubleArray16);
        double[] doubleArray27 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray32 = new double[] { (-1.0d), 0L };
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray32, doubleArray33);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray27, doubleArray32);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 0, doubleArray16, doubleArray27);
        double[] doubleArray41 = new double[] { (-1.0d), 0L };
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray41, doubleArray42);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, Double.NaN, doubleArray27, doubleArray42);
        org.apache.commons.math.ode.StepHandler stepHandler45 = graggBulirschStoerIntegrator44.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator44.getStepHandler();
        graggBulirschStoerIntegrator44.setOrderControl((int) (short) 0, 32.0d, (double) 0L);
        double double51 = graggBulirschStoerIntegrator44.getMaxStep();
        double double52 = graggBulirschStoerIntegrator44.getCurrentStepStart();
        graggBulirschStoerIntegrator44.setStepsizeControl(42.661458015403085d, (double) 10, (double) ' ', (double) 10L);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(stepHandler45);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1.0f), (double) 100, (double) 0);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInitialStepSize((double) (-1));
        java.lang.String str8 = graggBulirschStoerIntegrator4.getName();
        java.lang.String str9 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str8, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str9, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1.0f), (double) 100, (double) 0);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100, 10.0d, (double) 'a', (double) 100.0f);
        double double11 = graggBulirschStoerIntegrator10.getCurrentStepStart();
        double double12 = graggBulirschStoerIntegrator10.getCurrentStepStart();
        graggBulirschStoerIntegrator10.setStepsizeControl(0.0d, (double) 10.0f, (double) (short) 100, (double) 0);
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator10.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler18);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(stepHandler18);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0.0f, 10.0d, 42.661458015403085d, (double) (short) 100);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 100L);
        double double21 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction24, 31.622776601683793d, 1.0d, 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction29, (double) 0, (double) 1, (int) (short) 10);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 1, (double) 0L, 100.0d, (double) 0);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) (short) 0);
        double double9 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double10 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) (byte) 10);
        java.lang.String str14 = graggBulirschStoerIntegrator4.getName();
        double double15 = graggBulirschStoerIntegrator4.getMinStep();
        double double16 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str14, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 100L);
        double double21 = graggBulirschStoerIntegrator6.getMinStep();
        java.lang.Class<?> wildcardClass22 = graggBulirschStoerIntegrator6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        java.lang.String str18 = graggBulirschStoerIntegrator6.getName();
        double double19 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double[] doubleArray24 = new double[] { (-1.0d), 0L };
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray24, doubleArray25);
        graggBulirschStoerIntegrator26.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str32 = graggBulirschStoerIntegrator26.getName();
        java.lang.String str33 = graggBulirschStoerIntegrator26.getName();
        graggBulirschStoerIntegrator26.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator26.setInitialStepSize((double) 100L);
        double[] doubleArray45 = new double[] { (-1.0d), 0L };
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray45, doubleArray46);
        graggBulirschStoerIntegrator47.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler53 = graggBulirschStoerIntegrator47.getStepHandler();
        graggBulirschStoerIntegrator26.setStepHandler(stepHandler53);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler53);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (byte) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str18, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 31.622776601683793d + "'", double19 == 31.622776601683793d);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str32, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str33, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertNotNull(stepHandler53);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (short) 0, (int) 'a', 0.0d);
        double[] doubleArray29 = new double[] { (-1.0d), 0L };
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator31 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray29, doubleArray30);
        graggBulirschStoerIntegrator31.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator31.setInterpolationControl(false, (int) (short) 0);
        double double40 = graggBulirschStoerIntegrator31.getMinStep();
        double[] doubleArray45 = new double[] { (-1.0d), 0L };
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray45, doubleArray46);
        graggBulirschStoerIntegrator47.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator47.setInterpolationControl(false, (int) (short) 0);
        double double56 = graggBulirschStoerIntegrator47.getMinStep();
        double double57 = graggBulirschStoerIntegrator47.getCurrentSignedStepsize();
        double double58 = graggBulirschStoerIntegrator47.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler59 = graggBulirschStoerIntegrator47.getStepHandler();
        graggBulirschStoerIntegrator31.setStepHandler(stepHandler59);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler59);
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) '4');
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (short) 100, (double) (byte) 10, (double) (-1L), 35.0d);
        graggBulirschStoerIntegrator6.setStepsizeControl((-1.0d), (double) 1.0f, 97.0d, 0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 31.622776601683793d + "'", double57 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(stepHandler59);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (short) -1, (int) '4', (double) (byte) 100);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator24 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1.0f, (double) (byte) 0, 31.622776601683793d, (double) ' ');
        java.lang.String str25 = graggBulirschStoerIntegrator24.getName();
        org.apache.commons.math.ode.StepHandler stepHandler26 = graggBulirschStoerIntegrator24.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler26);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (byte) -1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str25, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler26);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(31.622776601683793d, (double) (-1L), 31.622776601683793d, (double) 1.0f);
        graggBulirschStoerIntegrator4.setStabilityCheck(false, 1, (int) (byte) 10, (double) (short) 10);
        graggBulirschStoerIntegrator4.setStabilityCheck(false, (int) ' ', (int) ' ', 15.100830606950982d);
        double double15 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (-1), (-1), (double) (short) 100);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (short) 100, (double) (-1L), 1.0d, (double) 'a');
        double double27 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, 100, 10, (double) 10L);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 1.0f, 97.0d, (double) (short) -1, 31.622776601683793d);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(31.622776601683793d, 56.568542494923804d, 15.100830606950982d, 35.0d);
        org.apache.commons.math.ode.StepHandler stepHandler24 = graggBulirschStoerIntegrator23.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler24);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler24);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler20 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (byte) -1, (int) (byte) -1, (double) (short) 1);
        double double26 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setInitialStepSize(0.0d);
        graggBulirschStoerIntegrator6.setOrderControl((int) ' ', (double) 0, (double) (short) 1);
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1), 0.0d, 0.0d, (double) (short) 0);
        double double41 = graggBulirschStoerIntegrator40.getMinStep();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double47 = graggBulirschStoerIntegrator46.getMaxStep();
        graggBulirschStoerIntegrator46.setInitialStepSize(31.622776601683793d);
        org.apache.commons.math.ode.StepHandler stepHandler50 = graggBulirschStoerIntegrator46.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction51 = null;
        graggBulirschStoerIntegrator46.addSwitchingFunction(switchingFunction51, 100.0d, (double) (-1L), (int) (short) 1);
        graggBulirschStoerIntegrator46.setStabilityCheck(true, (int) (byte) 1, 1, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler61 = graggBulirschStoerIntegrator46.getStepHandler();
        graggBulirschStoerIntegrator40.setStepHandler(stepHandler61);
        graggBulirschStoerIntegrator40.setInitialStepSize(56.568542494923804d);
        graggBulirschStoerIntegrator40.setOrderControl(1, (double) 'a', (double) 10.0f);
        graggBulirschStoerIntegrator40.setOrderControl((int) (short) 100, (double) (-1), 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler73 = graggBulirschStoerIntegrator40.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler73);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 1.0d + "'", double47 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertNotNull(stepHandler73);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        double double12 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) '4', (int) (byte) 0, 22.80350850198276d);
        double double18 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, (double) '#', (double) 'a', (double) (byte) 10);
        java.lang.String str24 = graggBulirschStoerIntegrator6.getName();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.622776601683793d + "'", double12 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 31.622776601683793d + "'", double18 == 31.622776601683793d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str24, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(33.26856145160071d, (double) 0L, 0.0d, (double) (short) 0);
        graggBulirschStoerIntegrator4.setStepsizeControl((-0.0d), 0.0d, 35.0d, (double) 0L);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) ' ', (int) (byte) 100, 52.0d);
        double double10 = graggBulirschStoerIntegrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray8, doubleArray11);
        double[] doubleArray22 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray27 = new double[] { (-1.0d), 0L };
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray27, doubleArray28);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator30 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray22, doubleArray27);
        double[] doubleArray38 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray43 = new double[] { (-1.0d), 0L };
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray43, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray38, doubleArray43);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 0, doubleArray27, doubleArray38);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) 10L, doubleArray11, doubleArray27);
        graggBulirschStoerIntegrator48.setStepsizeControl(10.0d, (double) (short) -1, (double) 10L, (double) (-1));
        double double54 = graggBulirschStoerIntegrator48.getCurrentStepStart();
        java.lang.String str55 = graggBulirschStoerIntegrator48.getName();
        org.apache.commons.math.ode.StepHandler stepHandler56 = graggBulirschStoerIntegrator48.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler57 = graggBulirschStoerIntegrator48.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str55, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler56);
        org.junit.Assert.assertNotNull(stepHandler57);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 0, (double) 10, (double) 'a');
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator27 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double28 = graggBulirschStoerIntegrator27.getMaxStep();
        graggBulirschStoerIntegrator27.setInitialStepSize(31.622776601683793d);
        org.apache.commons.math.ode.StepHandler stepHandler31 = graggBulirschStoerIntegrator27.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler31);
        double double33 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) 1, (double) 100.0f, (double) 1L);
        java.lang.Class<?> wildcardClass38 = graggBulirschStoerIntegrator6.getClass();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 1.0d + "'", double28 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 31.622776601683793d + "'", double33 == 31.622776601683793d);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) 100L, (double) (-1L), (double) 0.0f);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator9 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 10L, (double) 100, 31.622776601683793d);
        double double10 = graggBulirschStoerIntegrator9.getCurrentStepStart();
        double[] doubleArray15 = new double[] { (-1.0d), 0L };
        double[] doubleArray16 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator17 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray15, doubleArray16);
        graggBulirschStoerIntegrator17.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator17.setInterpolationControl(false, (int) (short) 0);
        double double26 = graggBulirschStoerIntegrator17.getMinStep();
        double double27 = graggBulirschStoerIntegrator17.getCurrentSignedStepsize();
        double double28 = graggBulirschStoerIntegrator17.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler29 = graggBulirschStoerIntegrator17.getStepHandler();
        double double30 = graggBulirschStoerIntegrator17.getMaxStep();
        graggBulirschStoerIntegrator17.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator17.setInitialStepSize((double) (byte) 1);
        java.lang.String str36 = graggBulirschStoerIntegrator17.getName();
        org.apache.commons.math.ode.StepHandler stepHandler37 = graggBulirschStoerIntegrator17.getStepHandler();
        graggBulirschStoerIntegrator17.setInterpolationControl(true, (int) 'a');
        double[] doubleArray45 = new double[] { (-1.0d), 0L };
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray45, doubleArray46);
        graggBulirschStoerIntegrator47.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str53 = graggBulirschStoerIntegrator47.getName();
        java.lang.String str54 = graggBulirschStoerIntegrator47.getName();
        graggBulirschStoerIntegrator47.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator47.setOrderControl((int) '#', (double) (short) 0, (double) 1);
        graggBulirschStoerIntegrator47.setInterpolationControl(false, (int) (short) 1);
        graggBulirschStoerIntegrator47.setStepsizeControl((double) 10.0f, 0.0d, (double) '#', (double) (-1L));
        org.apache.commons.math.ode.StepHandler stepHandler72 = graggBulirschStoerIntegrator47.getStepHandler();
        graggBulirschStoerIntegrator17.setStepHandler(stepHandler72);
        graggBulirschStoerIntegrator9.setStepHandler(stepHandler72);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler72);
        double double76 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 31.622776601683793d + "'", double27 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 100.0d + "'", double30 == 100.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str36, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str53, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str54, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler72);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 31.622776601683793d + "'", double76 == 31.622776601683793d);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 10.0f);
        double double18 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) '4', (int) 'a', (-0.0d));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction24, (double) 0, 0.0d, (int) (byte) 100);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double34 = graggBulirschStoerIntegrator33.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        graggBulirschStoerIntegrator33.addSwitchingFunction(switchingFunction35, (double) 10, (double) (-1), 0);
        double[] doubleArray44 = new double[] { (-1.0d), 0L };
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray44, doubleArray45);
        graggBulirschStoerIntegrator46.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator46.setInterpolationControl(false, (int) (short) 0);
        double double55 = graggBulirschStoerIntegrator46.getMinStep();
        double[] doubleArray60 = new double[] { (-1.0d), 0L };
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator62 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray60, doubleArray61);
        graggBulirschStoerIntegrator62.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator62.setInterpolationControl(false, (int) (short) 0);
        double double71 = graggBulirschStoerIntegrator62.getMinStep();
        double double72 = graggBulirschStoerIntegrator62.getCurrentSignedStepsize();
        double double73 = graggBulirschStoerIntegrator62.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler74 = graggBulirschStoerIntegrator62.getStepHandler();
        graggBulirschStoerIntegrator46.setStepHandler(stepHandler74);
        graggBulirschStoerIntegrator33.setStepHandler(stepHandler74);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler74);
        double double78 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 1.0d + "'", double34 == 1.0d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 31.622776601683793d + "'", double72 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(stepHandler74);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (-1L), 100.0d, (double) (short) 0, (double) (short) 100);
        double[] doubleArray22 = new double[] { (-1.0d), 0L };
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator24 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray22, doubleArray23);
        graggBulirschStoerIntegrator24.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator24.setInterpolationControl(false, (int) (short) 0);
        double double33 = graggBulirschStoerIntegrator24.getMinStep();
        graggBulirschStoerIntegrator24.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler38 = graggBulirschStoerIntegrator24.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler38);
        graggBulirschStoerIntegrator6.setInitialStepSize(32.0d);
        double double42 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double double16 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double17 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        double double19 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setOrderControl((-1), (double) 10, (double) 10.0f);
        double double27 = graggBulirschStoerIntegrator6.getMinStep();
        java.lang.String str28 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) -1);
        double double31 = graggBulirschStoerIntegrator6.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 31.622776601683793d + "'", double16 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str28, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (double) (byte) -1, (double) (byte) 100, (-0.0d));
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, 1.0d, (double) (byte) 0, (double) (short) -1);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray8, doubleArray11);
        double[] doubleArray19 = new double[] { (-1.0d), 0L };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray19, doubleArray20);
        double[] doubleArray29 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray34 = new double[] { (-1.0d), 0L };
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray34, doubleArray35);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray29, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) 10.0f, doubleArray20, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 1L, doubleArray8, doubleArray34);
        double double40 = graggBulirschStoerIntegrator39.getMinStep();
        graggBulirschStoerIntegrator39.setStabilityCheck(false, (int) (byte) 100, (int) (byte) 1, (double) 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 1.0d + "'", double40 == 1.0d);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) '#', (double) 0.0f, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) ' ');
        graggBulirschStoerIntegrator4.setInitialStepSize((double) (-1));
        org.junit.Assert.assertNotNull(stepHandler5);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 1, (double) 0L, 100.0d, (double) 0);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator4.setOrderControl((int) '#', (double) (short) 1, (-1.0d));
        graggBulirschStoerIntegrator4.setStepsizeControl(1.0d, (double) 10L, (double) (byte) 1, 10.0d);
        graggBulirschStoerIntegrator4.setStepsizeControl((double) (byte) 10, (double) 'a', (double) (byte) 100, (double) (short) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction23, 1.0d, 5.916079783099616d, (int) ' ');
        java.lang.String str28 = graggBulirschStoerIntegrator4.getName();
        graggBulirschStoerIntegrator4.setStabilityCheck(false, (int) '#', 10, (double) (byte) -1);
        double double34 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str28, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        double double13 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction14, 10.0d, (double) 0L, (int) (short) 0);
        double double19 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) '#');
        org.apache.commons.math.ode.StepHandler stepHandler23 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler23);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, (double) (byte) 100, (double) 10L, (double) ' ');
        graggBulirschStoerIntegrator4.setOrderControl(1, (double) 100L, 1.0d);
        double double9 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double10 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double double11 = graggBulirschStoerIntegrator4.getMinStep();
        graggBulirschStoerIntegrator4.setStepsizeControl((double) 100L, 33.26856145160071d, 42.661458015403085d, 3.1622776601683795d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setInitialStepSize(31.622776601683793d);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) '4');
        double double10 = graggBulirschStoerIntegrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction6, (double) 10, (double) (-1), 0);
        double double11 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double12 = graggBulirschStoerIntegrator4.getMinStep();
        graggBulirschStoerIntegrator4.setStepsizeControl(42.661458015403085d, (double) 0L, (double) (short) 10, (double) 'a');
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) ' ', (double) '4', (double) (byte) -1, (double) (-1));
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 1.0f, (double) 1.0f, (double) (short) 1, (double) (byte) 10);
        double double30 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (-1.0f), Double.NaN, 100.0d, (double) (byte) -1);
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 52.0d, 52.0d, (double) 'a');
        double double41 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 31.622776601683793d + "'", double30 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(Double.NaN, (double) 0L, (double) 10, (double) 0L);
        double[] doubleArray9 = new double[] { (-1.0d), 0L };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator11 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray9, doubleArray10);
        graggBulirschStoerIntegrator11.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator11.setInterpolationControl(false, (int) (short) 0);
        double double20 = graggBulirschStoerIntegrator11.getMinStep();
        double double21 = graggBulirschStoerIntegrator11.getCurrentSignedStepsize();
        double double22 = graggBulirschStoerIntegrator11.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler23 = graggBulirschStoerIntegrator11.getStepHandler();
        double double24 = graggBulirschStoerIntegrator11.getMaxStep();
        graggBulirschStoerIntegrator11.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator11.setOrderControl((-1), (double) 10, (double) 10.0f);
        double double32 = graggBulirschStoerIntegrator11.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler33 = graggBulirschStoerIntegrator11.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler33);
        double[] doubleArray39 = new double[] { (-1.0d), 0L };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray39, doubleArray40);
        graggBulirschStoerIntegrator41.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str47 = graggBulirschStoerIntegrator41.getName();
        org.apache.commons.math.ode.StepHandler stepHandler48 = graggBulirschStoerIntegrator41.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler48);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) '#');
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 31.622776601683793d + "'", double21 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str47, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler48);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(52.0d, (double) 10L, (double) (short) 10, (double) 10L);
        double[] doubleArray9 = new double[] { (-1.0d), 0L };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator11 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray9, doubleArray10);
        graggBulirschStoerIntegrator11.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator11.setInterpolationControl(false, (int) (short) 0);
        graggBulirschStoerIntegrator11.setStepsizeControl((double) '4', (double) (byte) -1, (double) 1L, 0.0d);
        graggBulirschStoerIntegrator11.setStepsizeControl((double) ' ', (double) '4', (double) (byte) -1, (double) (-1));
        graggBulirschStoerIntegrator11.setStepsizeControl((double) 1.0f, (double) 1.0f, (double) (short) 1, (double) (byte) 10);
        java.lang.String str35 = graggBulirschStoerIntegrator11.getName();
        graggBulirschStoerIntegrator11.setInterpolationControl(false, (int) '#');
        double[] doubleArray43 = new double[] { (-1.0d), 0L };
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray43, doubleArray44);
        graggBulirschStoerIntegrator45.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator45.setInterpolationControl(false, (int) (short) 0);
        double double54 = graggBulirschStoerIntegrator45.getMinStep();
        double[] doubleArray59 = new double[] { (-1.0d), 0L };
        double[] doubleArray60 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator61 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray59, doubleArray60);
        graggBulirschStoerIntegrator61.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator61.setInterpolationControl(false, (int) (short) 0);
        double double70 = graggBulirschStoerIntegrator61.getMinStep();
        double double71 = graggBulirschStoerIntegrator61.getCurrentSignedStepsize();
        double double72 = graggBulirschStoerIntegrator61.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler73 = graggBulirschStoerIntegrator61.getStepHandler();
        graggBulirschStoerIntegrator45.setStepHandler(stepHandler73);
        graggBulirschStoerIntegrator11.setStepHandler(stepHandler73);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler73);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) 0L);
        java.lang.String str79 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str35, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[]");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 10.0d + "'", double70 == 10.0d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 31.622776601683793d + "'", double71 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertNotNull(stepHandler73);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str79, "Gragg-Bulirsch-Stoer");
    }
}

