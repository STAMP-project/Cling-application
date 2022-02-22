import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test14501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14501");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double double15 = graggBulirschStoerIntegrator6.getMaxStep();
        double[] doubleArray20 = new double[] { '4', (byte) 10 };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator22 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray20, doubleArray21);
        double double23 = graggBulirschStoerIntegrator22.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator22.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double29 = graggBulirschStoerIntegrator22.getCurrentSignedStepsize();
        double double30 = graggBulirschStoerIntegrator22.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler31 = graggBulirschStoerIntegrator22.getStepHandler();
        boolean boolean32 = stepHandler31.requiresDenseOutput();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler31);
        java.lang.String str34 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction35, (double) (byte) 100, (double) 1, (-1));
        org.apache.commons.math.ode.StepHandler stepHandler40 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) -1, (double) 'a', (double) 0.0f);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (short) 0, 10, (double) 1.0f);
        double[] doubleArray54 = new double[] { '4', (byte) 10 };
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray54, doubleArray55);
        double double57 = graggBulirschStoerIntegrator56.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator56.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler63 = graggBulirschStoerIntegrator56.getStepHandler();
        boolean boolean64 = stepHandler63.requiresDenseOutput();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler63);
        graggBulirschStoerIntegrator6.setStepsizeControl(32.0d, 22.80350850198276d, 5.602043370695193d, 31.622776601683793d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 18.708286933869708d + "'", double23 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 18.708286933869708d + "'", double29 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str34, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler40);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 18.708286933869708d + "'", double57 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test14502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14502");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator6.getStepHandler();
        double double16 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, (double) 0, (double) ' ', (-1.0d));
        double double22 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction23, (double) (-1.0f), (double) (short) 1, (int) (byte) 0);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 0L);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 1, (double) (byte) 0, 0.0d, (double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler35 = graggBulirschStoerIntegrator34.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler36 = graggBulirschStoerIntegrator34.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        stepHandler36.handleStep(stepInterpolator37, true);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler36);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction41, 18.708286933869708d, (double) 10L, 0);
        double[] doubleArray50 = new double[] { '4', (byte) 10 };
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray50, doubleArray51);
        double double53 = graggBulirschStoerIntegrator52.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator52.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double59 = graggBulirschStoerIntegrator52.getCurrentSignedStepsize();
        double double60 = graggBulirschStoerIntegrator52.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler61 = graggBulirschStoerIntegrator52.getStepHandler();
        double double62 = graggBulirschStoerIntegrator52.getMinStep();
        double double63 = graggBulirschStoerIntegrator52.getCurrentSignedStepsize();
        double double64 = graggBulirschStoerIntegrator52.getCurrentStepStart();
        double double65 = graggBulirschStoerIntegrator52.getMaxStep();
        graggBulirschStoerIntegrator52.setInterpolationControl(true, (int) (short) 10);
        org.apache.commons.math.ode.StepHandler stepHandler69 = graggBulirschStoerIntegrator52.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler69);
        double double71 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 18.708286933869708d + "'", double53 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 18.708286933869708d + "'", double59 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 18.708286933869708d + "'", double63 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + 35.0d + "'", double65 == 35.0d);
        org.junit.Assert.assertNotNull(stepHandler69);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }

    @Test
    public void test14503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14503");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 2);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction16, (double) (short) 1, 18.708286933869708d, (int) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler21 = graggBulirschStoerIntegrator6.getStepHandler();
        double double22 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (byte) 1);
        double double26 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double double27 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        java.lang.String str28 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction29, (double) 1.0f, (double) ' ', 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction34 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction34, 1.4142135623730951d, 1.0d, (int) (short) 100);
        double double39 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 18.708286933869708d + "'", double22 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str28, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 18.708286933869708d + "'", double39 == 18.708286933869708d);
    }

    @Test
    public void test14504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14504");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, (double) (short) 1, (double) 2, (double) 2);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, (double) (byte) 0, (double) 2, (int) (short) 1);
        double[] doubleArray15 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray20 = new double[] { '4', (byte) 10 };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator22 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray20, doubleArray21);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray15, doubleArray21);
        graggBulirschStoerIntegrator23.setStepsizeControl((-1.0d), (double) 0, (double) 10, (double) 1L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        graggBulirschStoerIntegrator23.addSwitchingFunction(switchingFunction29, (double) (short) 1, (double) 'a', (int) (short) 10);
        org.apache.commons.math.ode.StepHandler stepHandler34 = graggBulirschStoerIntegrator23.getStepHandler();
        boolean boolean35 = stepHandler34.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        stepHandler34.handleStep(stepInterpolator36, false);
        stepHandler34.reset();
        boolean boolean40 = stepHandler34.requiresDenseOutput();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler34);
        double[] doubleArray46 = new double[] { '4', (byte) 10 };
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray46, doubleArray47);
        org.apache.commons.math.ode.StepHandler stepHandler49 = graggBulirschStoerIntegrator48.getStepHandler();
        java.lang.String str50 = graggBulirschStoerIntegrator48.getName();
        double[] doubleArray55 = new double[] { '4', (byte) 10 };
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray55, doubleArray56);
        double double58 = graggBulirschStoerIntegrator57.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator57.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double[] doubleArray68 = new double[] { '4', (byte) 10 };
        double[] doubleArray69 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator70 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray68, doubleArray69);
        double double71 = graggBulirschStoerIntegrator70.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator70.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler77 = graggBulirschStoerIntegrator70.getStepHandler();
        graggBulirschStoerIntegrator57.setStepHandler(stepHandler77);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator79 = null;
        stepHandler77.handleStep(stepInterpolator79, true);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator82 = null;
        stepHandler77.handleStep(stepInterpolator82, false);
        graggBulirschStoerIntegrator48.setStepHandler(stepHandler77);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler77);
        double double87 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator4.setStepsizeControl(14.142135623730951d, (double) 0.0f, 5.958664854575224d, (double) (byte) 10);
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str50, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 18.708286933869708d + "'", double58 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[]");
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 18.708286933869708d + "'", double71 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler77);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 3.1622776601683795d + "'", double87 == 3.1622776601683795d);
    }

    @Test
    public void test14505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14505");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, 10.0d, (double) 100, 18.708286933869708d);
        double[] doubleArray9 = new double[] { '4', (byte) 10 };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator11 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray9, doubleArray10);
        double double12 = graggBulirschStoerIntegrator11.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator11.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double18 = graggBulirschStoerIntegrator11.getCurrentSignedStepsize();
        double double19 = graggBulirschStoerIntegrator11.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler20 = graggBulirschStoerIntegrator11.getStepHandler();
        double double21 = graggBulirschStoerIntegrator11.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler22 = graggBulirschStoerIntegrator11.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler22);
        double double24 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        java.lang.String str25 = graggBulirschStoerIntegrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction26, 0.0d, (double) (short) -1, (int) (byte) 0);
        graggBulirschStoerIntegrator4.setStepsizeControl((double) (byte) -1, 1.0d, (double) (short) 10, (double) '#');
        graggBulirschStoerIntegrator4.setInitialStepSize((double) '4');
        double double38 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler39 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler40 = graggBulirschStoerIntegrator4.getStepHandler();
        java.lang.String str41 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 18.708286933869708d + "'", double12 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 18.708286933869708d + "'", double18 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str25, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertNotNull(stepHandler40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str41, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14506");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setInitialStepSize(35.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction10, (double) (short) 10, (double) 10.0f, (int) '4');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction15, 3.1622776601683795d, 1.0d, 0);
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 10, (double) 'a', (double) 1L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction24, (double) 1L, (-1.0d), 3);
        org.apache.commons.math.ode.StepHandler stepHandler29 = graggBulirschStoerIntegrator6.getStepHandler();
        double double30 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray35 = new double[] { '4', (byte) 10 };
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray35, doubleArray36);
        double double38 = graggBulirschStoerIntegrator37.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator37.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double44 = graggBulirschStoerIntegrator37.getCurrentSignedStepsize();
        double double45 = graggBulirschStoerIntegrator37.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator37.getStepHandler();
        double double47 = graggBulirschStoerIntegrator37.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler48 = graggBulirschStoerIntegrator37.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction49 = null;
        graggBulirschStoerIntegrator37.addSwitchingFunction(switchingFunction49, (double) 1, (double) (byte) 10, (int) (short) 10);
        double double54 = graggBulirschStoerIntegrator37.getCurrentStepStart();
        graggBulirschStoerIntegrator37.setInitialStepSize((double) (short) 0);
        double[] doubleArray61 = new double[] { '4', (byte) 10 };
        double[] doubleArray62 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator63 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray61, doubleArray62);
        double double64 = graggBulirschStoerIntegrator63.getCurrentStepStart();
        double[] doubleArray69 = new double[] { '4', (byte) 10 };
        double[] doubleArray70 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator71 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray69, doubleArray70);
        org.apache.commons.math.ode.StepHandler stepHandler72 = graggBulirschStoerIntegrator71.getStepHandler();
        graggBulirschStoerIntegrator63.setStepHandler(stepHandler72);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction74 = null;
        graggBulirschStoerIntegrator63.addSwitchingFunction(switchingFunction74, (-1.0d), (double) (short) 10, (int) (short) 10);
        org.apache.commons.math.ode.StepHandler stepHandler79 = graggBulirschStoerIntegrator63.getStepHandler();
        graggBulirschStoerIntegrator37.setStepHandler(stepHandler79);
        double double81 = graggBulirschStoerIntegrator37.getCurrentStepStart();
        double double82 = graggBulirschStoerIntegrator37.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler83 = graggBulirschStoerIntegrator37.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler83);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, 100, 0, (double) 2);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (short) -1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 18.708286933869708d + "'", double38 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 18.708286933869708d + "'", double44 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertNotNull(doubleArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray69), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[]");
        org.junit.Assert.assertNotNull(stepHandler72);
        org.junit.Assert.assertNotNull(stepHandler79);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 18.708286933869708d + "'", double82 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler83);
    }

    @Test
    public void test14507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14507");
        double[] doubleArray5 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray10 = new double[] { '4', (byte) 10 };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray10, doubleArray11);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator13 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray5, doubleArray11);
        graggBulirschStoerIntegrator13.setStepsizeControl((-1.0d), (double) 0, (double) 10, (double) 1L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        graggBulirschStoerIntegrator13.addSwitchingFunction(switchingFunction19, 52.0d, 0.0d, (-1));
        graggBulirschStoerIntegrator13.setInitialStepSize((double) ' ');
        double double26 = graggBulirschStoerIntegrator13.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler27 = graggBulirschStoerIntegrator13.getStepHandler();
        double double28 = graggBulirschStoerIntegrator13.getCurrentStepStart();
        java.lang.String str29 = graggBulirschStoerIntegrator13.getName();
        graggBulirschStoerIntegrator13.setInterpolationControl(true, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str29, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14508");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, 17.88854381999832d, 0.0d, Double.NaN);
        graggBulirschStoerIntegrator4.setStabilityCheck(false, (int) (short) 0, (int) '#', 10.0d);
        double double10 = graggBulirschStoerIntegrator4.getMinStep();
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) (short) -1, (-1), (double) (-1L));
        graggBulirschStoerIntegrator4.setStepsizeControl((double) 'a', 10.0d, 18.566368063325246d, (double) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction21, 18.566368063325246d, 18.708286933869708d, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test14509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14509");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', 31.622776601683793d, (double) 10.0f, 9.848857801796104d);
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (-1));
        double double8 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        graggBulirschStoerIntegrator4.setStepsizeControl(19.364331453687083d, (double) '#', 1.7715216602443777d, 14.38967659151819d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test14510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14510");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 18.708286933869708d, (double) 1, (double) 0);
        double[] doubleArray9 = new double[] { '4', (byte) 10 };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator11 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray9, doubleArray10);
        double double12 = graggBulirschStoerIntegrator11.getCurrentStepStart();
        graggBulirschStoerIntegrator11.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        graggBulirschStoerIntegrator11.addSwitchingFunction(switchingFunction18, (double) (short) 10, (double) 2, (int) '#');
        double[] doubleArray27 = new double[] { '4', (byte) 10 };
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray27, doubleArray28);
        double double30 = graggBulirschStoerIntegrator29.getCurrentStepStart();
        double[] doubleArray35 = new double[] { '4', (byte) 10 };
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray35, doubleArray36);
        org.apache.commons.math.ode.StepHandler stepHandler38 = graggBulirschStoerIntegrator37.getStepHandler();
        graggBulirschStoerIntegrator29.setStepHandler(stepHandler38);
        graggBulirschStoerIntegrator11.setStepHandler(stepHandler38);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler38);
        graggBulirschStoerIntegrator4.setStabilityCheck(false, 100, (int) ' ', (double) (byte) 0);
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) (short) 0, 3, (double) '4');
        double[] doubleArray56 = new double[] { '4', (byte) 10 };
        double[] doubleArray57 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator58 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray56, doubleArray57);
        double double59 = graggBulirschStoerIntegrator58.getCurrentStepStart();
        double[] doubleArray64 = new double[] { '4', (byte) 10 };
        double[] doubleArray65 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator66 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray64, doubleArray65);
        org.apache.commons.math.ode.StepHandler stepHandler67 = graggBulirschStoerIntegrator66.getStepHandler();
        graggBulirschStoerIntegrator58.setStepHandler(stepHandler67);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator69 = null;
        stepHandler67.handleStep(stepInterpolator69, false);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler67);
        java.lang.String str73 = graggBulirschStoerIntegrator4.getName();
        java.lang.String str74 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertNotNull(stepHandler67);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str73, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str74, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14511");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double[] doubleArray18 = new double[] { '4', (byte) 10 };
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator20 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray18, doubleArray19);
        double double21 = graggBulirschStoerIntegrator20.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator20.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double27 = graggBulirschStoerIntegrator20.getCurrentSignedStepsize();
        double double28 = graggBulirschStoerIntegrator20.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler29 = graggBulirschStoerIntegrator20.getStepHandler();
        boolean boolean30 = stepHandler29.requiresDenseOutput();
        boolean boolean31 = stepHandler29.requiresDenseOutput();
        stepHandler29.reset();
        stepHandler29.reset();
        stepHandler29.reset();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler29);
        double double36 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction37 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction37, 31.622776601683793d, 9.848857801796104d, 0);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (byte) 1);
        java.lang.String str45 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str46 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str47 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.StepHandler stepHandler48 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 18.708286933869708d + "'", double21 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 18.708286933869708d + "'", double27 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 18.708286933869708d + "'", double36 == 18.708286933869708d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str45, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str46, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str47, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler48);
    }

    @Test
    public void test14512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14512");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double double15 = graggBulirschStoerIntegrator6.getMaxStep();
        double[] doubleArray20 = new double[] { '4', (byte) 10 };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator22 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray20, doubleArray21);
        double double23 = graggBulirschStoerIntegrator22.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator22.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double29 = graggBulirschStoerIntegrator22.getCurrentSignedStepsize();
        double double30 = graggBulirschStoerIntegrator22.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler31 = graggBulirschStoerIntegrator22.getStepHandler();
        boolean boolean32 = stepHandler31.requiresDenseOutput();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler31);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) -1);
        graggBulirschStoerIntegrator6.setInitialStepSize(0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction38 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction38, (-1.0d), (double) 'a', (int) '4');
        org.apache.commons.math.ode.StepHandler stepHandler43 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction44 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction44, 20.819449099200266d, (double) 0L, 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 18.708286933869708d + "'", double23 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 18.708286933869708d + "'", double29 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(stepHandler43);
    }

    @Test
    public void test14513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14513");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 18.708286933869708d, (double) 1, (double) 0);
        double[] doubleArray9 = new double[] { '4', (byte) 10 };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator11 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray9, doubleArray10);
        double double12 = graggBulirschStoerIntegrator11.getCurrentStepStart();
        graggBulirschStoerIntegrator11.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        graggBulirschStoerIntegrator11.addSwitchingFunction(switchingFunction18, (double) (short) 10, (double) 2, (int) '#');
        double[] doubleArray27 = new double[] { '4', (byte) 10 };
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray27, doubleArray28);
        double double30 = graggBulirschStoerIntegrator29.getCurrentStepStart();
        double[] doubleArray35 = new double[] { '4', (byte) 10 };
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray35, doubleArray36);
        org.apache.commons.math.ode.StepHandler stepHandler38 = graggBulirschStoerIntegrator37.getStepHandler();
        graggBulirschStoerIntegrator29.setStepHandler(stepHandler38);
        graggBulirschStoerIntegrator11.setStepHandler(stepHandler38);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler38);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction42, 35.0d, 0.0d, (int) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler47 = graggBulirschStoerIntegrator4.getStepHandler();
        double double48 = graggBulirschStoerIntegrator4.getMinStep();
        java.lang.String str49 = graggBulirschStoerIntegrator4.getName();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction53 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction53, 3.1622776601683795d, (double) 100L, (int) (short) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction58 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction58, (double) 2, (double) (-1.0f), (int) (byte) 10);
        graggBulirschStoerIntegrator4.setStepsizeControl(25.588865599815865d, 5.785015217038156d, 22.80350850198276d, (double) (short) 1);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str49, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14514");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, (double) 100, (double) 0.0f, (double) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, (double) (short) 0, 24.23056147866101d, 100);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(18.708286933869708d, (double) '#', (double) (byte) 100, (double) 0);
        double double15 = graggBulirschStoerIntegrator14.getCurrentStepStart();
        double[] doubleArray20 = new double[] { '4', (byte) 10 };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator22 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray20, doubleArray21);
        double double23 = graggBulirschStoerIntegrator22.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        graggBulirschStoerIntegrator22.addSwitchingFunction(switchingFunction24, 0.0d, (double) (-1.0f), (int) (short) 10);
        graggBulirschStoerIntegrator22.setOrderControl(0, (double) 2, 0.0d);
        double[] doubleArray37 = new double[] { '4', (byte) 10 };
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray37, doubleArray38);
        double double40 = graggBulirschStoerIntegrator39.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator39.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator39.getStepHandler();
        boolean boolean47 = stepHandler46.requiresDenseOutput();
        graggBulirschStoerIntegrator22.setStepHandler(stepHandler46);
        graggBulirschStoerIntegrator14.setStepHandler(stepHandler46);
        stepHandler46.reset();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler46);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 18.708286933869708d + "'", double23 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 18.708286933869708d + "'", double40 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test14515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14515");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(17.88854381999832d, (double) (byte) -1, (double) (short) 100, (double) (-1.0f));
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        java.lang.String str6 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str6, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14516");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 0L, 10.0d);
        double double17 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler18 = graggBulirschStoerIntegrator6.getStepHandler();
        java.lang.String str19 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator24 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 18.708286933869708d, (double) 1, (double) 0);
        double[] doubleArray29 = new double[] { '4', (byte) 10 };
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator31 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray29, doubleArray30);
        double double32 = graggBulirschStoerIntegrator31.getCurrentStepStart();
        graggBulirschStoerIntegrator31.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction38 = null;
        graggBulirschStoerIntegrator31.addSwitchingFunction(switchingFunction38, (double) (short) 10, (double) 2, (int) '#');
        double[] doubleArray47 = new double[] { '4', (byte) 10 };
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray47, doubleArray48);
        double double50 = graggBulirschStoerIntegrator49.getCurrentStepStart();
        double[] doubleArray55 = new double[] { '4', (byte) 10 };
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray55, doubleArray56);
        org.apache.commons.math.ode.StepHandler stepHandler58 = graggBulirschStoerIntegrator57.getStepHandler();
        graggBulirschStoerIntegrator49.setStepHandler(stepHandler58);
        graggBulirschStoerIntegrator31.setStepHandler(stepHandler58);
        graggBulirschStoerIntegrator24.setStepHandler(stepHandler58);
        graggBulirschStoerIntegrator24.setStabilityCheck(false, 100, (int) ' ', (double) (byte) 0);
        double[] doubleArray71 = new double[] { '4', (byte) 10 };
        double[] doubleArray72 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator73 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray71, doubleArray72);
        double double74 = graggBulirschStoerIntegrator73.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator73.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double80 = graggBulirschStoerIntegrator73.getCurrentSignedStepsize();
        double double81 = graggBulirschStoerIntegrator73.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler82 = graggBulirschStoerIntegrator73.getStepHandler();
        boolean boolean83 = stepHandler82.requiresDenseOutput();
        boolean boolean84 = stepHandler82.requiresDenseOutput();
        graggBulirschStoerIntegrator24.setStepHandler(stepHandler82);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler82);
        double double87 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInitialStepSize(20.819449099200266d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 18.708286933869708d + "'", double17 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str19, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 18.708286933869708d + "'", double74 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 18.708286933869708d + "'", double80 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(stepHandler82);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 35.0d + "'", double87 == 35.0d);
    }

    @Test
    public void test14517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14517");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) 'a', 10, (double) 2);
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) 1, (double) (byte) 10, 18.708286933869708d);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 1, (double) (byte) 0, 0.0d, (double) 0L);
        double double30 = graggBulirschStoerIntegrator29.getCurrentSignedStepsize();
        java.lang.String str31 = graggBulirschStoerIntegrator29.getName();
        double double32 = graggBulirschStoerIntegrator29.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler33 = graggBulirschStoerIntegrator29.getStepHandler();
        double[] doubleArray38 = new double[] { '4', (byte) 10 };
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray38, doubleArray39);
        double double41 = graggBulirschStoerIntegrator40.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator40.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double47 = graggBulirschStoerIntegrator40.getCurrentSignedStepsize();
        double double48 = graggBulirschStoerIntegrator40.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler49 = graggBulirschStoerIntegrator40.getStepHandler();
        double double50 = graggBulirschStoerIntegrator40.getMinStep();
        graggBulirschStoerIntegrator40.setStepsizeControl(0.0d, (double) 0, (double) ' ', (-1.0d));
        double double56 = graggBulirschStoerIntegrator40.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        graggBulirschStoerIntegrator40.addSwitchingFunction(switchingFunction57, (double) (-1.0f), (double) (short) 1, (int) (byte) 0);
        graggBulirschStoerIntegrator40.setInitialStepSize((double) 0L);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator68 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 1, (double) (byte) 0, 0.0d, (double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler69 = graggBulirschStoerIntegrator68.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler70 = graggBulirschStoerIntegrator68.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator71 = null;
        stepHandler70.handleStep(stepInterpolator71, true);
        graggBulirschStoerIntegrator40.setStepHandler(stepHandler70);
        graggBulirschStoerIntegrator29.setStepHandler(stepHandler70);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler70);
        org.apache.commons.math.ode.StepHandler stepHandler77 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction78 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction78, (-0.0d), (double) (-1.0f), 1);
        org.apache.commons.math.ode.StepHandler stepHandler83 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.0d + "'", double30 == 0.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str31, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 18.708286933869708d + "'", double41 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 18.708286933869708d + "'", double47 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(stepHandler69);
        org.junit.Assert.assertNotNull(stepHandler70);
        org.junit.Assert.assertNotNull(stepHandler77);
        org.junit.Assert.assertNotNull(stepHandler83);
    }

    @Test
    public void test14518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14518");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (short) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction19, (double) '4', (double) '4', (int) ' ');
        double double24 = graggBulirschStoerIntegrator6.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction25, 20.819449099200266d, 14.38967659151819d, 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 35.0d + "'", double24 == 35.0d);
    }

    @Test
    public void test14519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14519");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler0.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray15 = new double[] { 10, 100, (byte) 0 };
        boolean boolean16 = switchingFunctionsHandler10.reset((double) 0, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler0.reset((double) 100.0f, doubleArray15);
        double[] doubleArray26 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray31 = new double[] { '4', (byte) 10 };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray31, doubleArray32);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray26, doubleArray32);
        double[] doubleArray40 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray45 = new double[] { '4', (byte) 10 };
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray45, doubleArray46);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray40, doubleArray46);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, (double) (short) 100, doubleArray32, doubleArray40);
        boolean boolean50 = switchingFunctionsHandler0.reset((double) 1, doubleArray40);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator51 = null;
        boolean boolean52 = switchingFunctionsHandler0.evaluateStep(stepInterpolator51);
        boolean boolean53 = switchingFunctionsHandler0.isEmpty();
        boolean boolean54 = switchingFunctionsHandler0.isEmpty();
        boolean boolean55 = switchingFunctionsHandler0.isEmpty();
        boolean boolean56 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator57 = null;
        boolean boolean58 = switchingFunctionsHandler0.evaluateStep(stepInterpolator57);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test14520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14520");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler0.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray15 = new double[] { 10, 100, (byte) 0 };
        boolean boolean16 = switchingFunctionsHandler10.reset((double) 0, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler0.reset((double) 100.0f, doubleArray15);
        double double18 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        boolean boolean20 = switchingFunctionsHandler0.evaluateStep(stepInterpolator19);
        double[] doubleArray27 = new double[] { (short) 100, 3, 'a' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler28 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        switchingFunctionsHandler28.add(switchingFunction29, 35.0d, 100.0d, (int) 'a');
        double double34 = switchingFunctionsHandler28.getEventTime();
        double[] doubleArray40 = new double[] { '4', (byte) 10 };
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray40, doubleArray41);
        boolean boolean43 = switchingFunctionsHandler28.reset((double) 3, doubleArray40);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', 10.0d, doubleArray27, doubleArray40);
        boolean boolean45 = switchingFunctionsHandler0.reset((double) '4', doubleArray27);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator46 = null;
        boolean boolean47 = switchingFunctionsHandler0.evaluateStep(stepInterpolator46);
        boolean boolean48 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler50 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray55 = new double[] { 10, 100, (byte) 0 };
        boolean boolean56 = switchingFunctionsHandler50.reset((double) 0, doubleArray55);
        double[] doubleArray62 = new double[] { '4', (byte) 10 };
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator64 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray62, doubleArray63);
        boolean boolean65 = switchingFunctionsHandler50.reset(18.708286933869708d, doubleArray63);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction66 = null;
        switchingFunctionsHandler50.add(switchingFunction66, Double.NaN, (-1.0d), (int) (byte) 10);
        double[] doubleArray75 = new double[] { (byte) 10, 1L, (byte) 10 };
        boolean boolean76 = switchingFunctionsHandler50.reset((double) 10L, doubleArray75);
        switchingFunctionsHandler0.stepAccepted((double) (byte) -1, doubleArray75);
        boolean boolean78 = switchingFunctionsHandler0.isEmpty();
        boolean boolean79 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator80 = null;
        boolean boolean81 = switchingFunctionsHandler0.evaluateStep(stepInterpolator80);
        double double82 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 3.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[10.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
    }

    @Test
    public void test14521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14521");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) -1, 17.320508075688775d, 19.364331453687083d, (double) (byte) 0);
    }

    @Test
    public void test14522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14522");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double double15 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction16, 52.0d, 0.0d, 2);
        double[] doubleArray25 = new double[] { '4', (byte) 10 };
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator27 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray25, doubleArray26);
        double double28 = graggBulirschStoerIntegrator27.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator27.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double34 = graggBulirschStoerIntegrator27.getCurrentSignedStepsize();
        double double35 = graggBulirschStoerIntegrator27.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler36 = graggBulirschStoerIntegrator27.getStepHandler();
        double double37 = graggBulirschStoerIntegrator27.getMinStep();
        double[] doubleArray42 = new double[] { '4', (byte) 10 };
        double[] doubleArray43 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray42, doubleArray43);
        org.apache.commons.math.ode.StepHandler stepHandler45 = graggBulirschStoerIntegrator44.getStepHandler();
        stepHandler45.reset();
        stepHandler45.reset();
        graggBulirschStoerIntegrator27.setStepHandler(stepHandler45);
        double double49 = graggBulirschStoerIntegrator27.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        graggBulirschStoerIntegrator27.addSwitchingFunction(switchingFunction50, (double) (-1), (double) (short) 10, (int) (short) 10);
        double double55 = graggBulirschStoerIntegrator27.getMaxStep();
        graggBulirschStoerIntegrator27.setInitialStepSize((double) (short) 10);
        graggBulirschStoerIntegrator27.setInterpolationControl(true, (int) (short) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction61 = null;
        graggBulirschStoerIntegrator27.addSwitchingFunction(switchingFunction61, 31.622776601683793d, 0.0d, (int) (short) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction66 = null;
        graggBulirschStoerIntegrator27.addSwitchingFunction(switchingFunction66, 3.138288992714996d, 18.566368063325246d, (int) (byte) 100);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator75 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 1, (double) (byte) 0, 0.0d, (double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler76 = graggBulirschStoerIntegrator75.getStepHandler();
        java.lang.String str77 = graggBulirschStoerIntegrator75.getName();
        double double78 = graggBulirschStoerIntegrator75.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction79 = null;
        graggBulirschStoerIntegrator75.addSwitchingFunction(switchingFunction79, (double) (byte) 1, (double) (short) -1, (int) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler84 = graggBulirschStoerIntegrator75.getStepHandler();
        graggBulirschStoerIntegrator27.setStepHandler(stepHandler84);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler84);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction87 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction87, (double) 100L, 7.521206186172787d, (int) ' ');
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 18.708286933869708d + "'", double15 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 18.708286933869708d + "'", double28 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 18.708286933869708d + "'", double34 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[]");
        org.junit.Assert.assertNotNull(stepHandler45);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 35.0d + "'", double55 == 35.0d);
        org.junit.Assert.assertNotNull(stepHandler76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str77, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertNotNull(stepHandler84);
    }

    @Test
    public void test14523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14523");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(97.0d, (double) 1, (double) (byte) 10, (double) (byte) 0);
    }

    @Test
    public void test14524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14524");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        org.apache.commons.math.ode.StepHandler stepHandler7 = graggBulirschStoerIntegrator6.getStepHandler();
        java.lang.String str8 = graggBulirschStoerIntegrator6.getName();
        double double9 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction10, (double) 100, (double) (byte) 100, (int) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction16, (double) (short) 10, (-0.0d), 100);
        org.apache.commons.math.ode.StepHandler stepHandler21 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str8, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 18.708286933869708d + "'", double9 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertNotNull(stepHandler21);
    }

    @Test
    public void test14525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14525");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 1, (double) (byte) 0, 0.0d, (double) 0L);
        double double5 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction6, (double) (byte) 0, (double) 0, (int) '#');
        graggBulirschStoerIntegrator4.setOrderControl(2, (double) (short) 10, (double) 10);
        double[] doubleArray19 = new double[] { '4', (byte) 10 };
        double[] doubleArray20 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator21 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray19, doubleArray20);
        org.apache.commons.math.ode.StepHandler stepHandler22 = graggBulirschStoerIntegrator21.getStepHandler();
        stepHandler22.reset();
        stepHandler22.reset();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler22);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        stepHandler22.handleStep(stepInterpolator26, false);
        boolean boolean29 = stepHandler22.requiresDenseOutput();
        boolean boolean30 = stepHandler22.requiresDenseOutput();
        boolean boolean31 = stepHandler22.requiresDenseOutput();
        java.lang.Class<?> wildcardClass32 = stepHandler22.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[]");
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test14526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14526");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 2);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction16, (double) (short) 1, 18.708286933869708d, (int) (byte) 100);
        double double21 = graggBulirschStoerIntegrator6.getMaxStep();
        double double22 = graggBulirschStoerIntegrator6.getMaxStep();
        double double23 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler24 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 35.0d + "'", double21 == 35.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 18.708286933869708d + "'", double23 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler24);
    }

    @Test
    public void test14527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14527");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator6.getStepHandler();
        double double16 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray21 = new double[] { '4', (byte) 10 };
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray21, doubleArray22);
        org.apache.commons.math.ode.StepHandler stepHandler24 = graggBulirschStoerIntegrator23.getStepHandler();
        stepHandler24.reset();
        stepHandler24.reset();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler24);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) -1, 0, (double) (byte) 1);
        double double33 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double34 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double35 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 18.708286933869708d + "'", double33 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 18.708286933869708d + "'", double34 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
    }

    @Test
    public void test14528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14528");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 0L, 10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction17, (double) 1, (double) (short) 1, (int) '4');
        double double22 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction23, 97.0d, (double) '#', (int) '#');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction28, (double) (byte) 10, 7.211102550927978d, (int) 'a');
        double[] doubleArray37 = new double[] { '4', (byte) 10 };
        double[] doubleArray38 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray37, doubleArray38);
        double double40 = graggBulirschStoerIntegrator39.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator39.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double46 = graggBulirschStoerIntegrator39.getCurrentSignedStepsize();
        double double47 = graggBulirschStoerIntegrator39.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler48 = graggBulirschStoerIntegrator39.getStepHandler();
        double double49 = graggBulirschStoerIntegrator39.getMinStep();
        graggBulirschStoerIntegrator39.setStepsizeControl(0.0d, (double) 0, (double) ' ', (-1.0d));
        graggBulirschStoerIntegrator39.setInterpolationControl(false, (int) '4');
        java.lang.String str58 = graggBulirschStoerIntegrator39.getName();
        graggBulirschStoerIntegrator39.setStepsizeControl(0.0d, (double) (byte) 0, (double) (byte) 100, (double) 10.0f);
        double double64 = graggBulirschStoerIntegrator39.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler65 = graggBulirschStoerIntegrator39.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator66 = null;
        stepHandler65.handleStep(stepInterpolator66, true);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler65);
        graggBulirschStoerIntegrator6.setInitialStepSize((-1.0d));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction72 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction72, (double) (byte) -1, 0.0d, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[]");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 18.708286933869708d + "'", double40 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 18.708286933869708d + "'", double46 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str58, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 18.708286933869708d + "'", double64 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler65);
    }

    @Test
    public void test14529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14529");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 18.708286933869708d, (double) 1, (double) 0);
        double[] doubleArray9 = new double[] { '4', (byte) 10 };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator11 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray9, doubleArray10);
        double double12 = graggBulirschStoerIntegrator11.getCurrentStepStart();
        graggBulirschStoerIntegrator11.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        graggBulirschStoerIntegrator11.addSwitchingFunction(switchingFunction18, (double) (short) 10, (double) 2, (int) '#');
        double[] doubleArray27 = new double[] { '4', (byte) 10 };
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray27, doubleArray28);
        double double30 = graggBulirschStoerIntegrator29.getCurrentStepStart();
        double[] doubleArray35 = new double[] { '4', (byte) 10 };
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray35, doubleArray36);
        org.apache.commons.math.ode.StepHandler stepHandler38 = graggBulirschStoerIntegrator37.getStepHandler();
        graggBulirschStoerIntegrator29.setStepHandler(stepHandler38);
        graggBulirschStoerIntegrator11.setStepHandler(stepHandler38);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler38);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction42, 35.0d, 0.0d, (int) (byte) 100);
        double double47 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        graggBulirschStoerIntegrator4.setStepsizeControl((double) 10L, Double.NaN, (double) (byte) 0, (double) (short) 1);
        double double53 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setOrderControl((int) '#', (double) 1, Double.NaN);
        graggBulirschStoerIntegrator4.setOrderControl((int) 'a', 52.0d, (double) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler62 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, 10.0d, (double) 100, 18.708286933869708d);
        double double68 = graggBulirschStoerIntegrator67.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator67.setStepsizeControl((double) 0, 100.0d, (double) (short) 100, (double) 0);
        double[] doubleArray78 = new double[] { '4', (byte) 10 };
        double[] doubleArray79 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator80 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray78, doubleArray79);
        double double81 = graggBulirschStoerIntegrator80.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator80.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double87 = graggBulirschStoerIntegrator80.getCurrentSignedStepsize();
        double double88 = graggBulirschStoerIntegrator80.getCurrentStepStart();
        graggBulirschStoerIntegrator80.setInterpolationControl(false, (int) (byte) 1);
        java.lang.String str92 = graggBulirschStoerIntegrator80.getName();
        org.apache.commons.math.ode.StepHandler stepHandler93 = graggBulirschStoerIntegrator80.getStepHandler();
        graggBulirschStoerIntegrator67.setStepHandler(stepHandler93);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler93);
        double double96 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 18.708286933869708d + "'", double53 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler62);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 3.1622776601683795d + "'", double68 == 3.1622776601683795d);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 18.708286933869708d + "'", double81 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 18.708286933869708d + "'", double87 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str92, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler93);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 0.0d + "'", double96 == 0.0d);
    }

    @Test
    public void test14530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14530");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler0.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray15 = new double[] { 10, 100, (byte) 0 };
        boolean boolean16 = switchingFunctionsHandler10.reset((double) 0, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler0.reset((double) 100.0f, doubleArray15);
        double double18 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        boolean boolean20 = switchingFunctionsHandler0.evaluateStep(stepInterpolator19);
        double[] doubleArray27 = new double[] { (short) 100, 3, 'a' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler28 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        switchingFunctionsHandler28.add(switchingFunction29, 35.0d, 100.0d, (int) 'a');
        double double34 = switchingFunctionsHandler28.getEventTime();
        double[] doubleArray40 = new double[] { '4', (byte) 10 };
        double[] doubleArray41 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator42 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray40, doubleArray41);
        boolean boolean43 = switchingFunctionsHandler28.reset((double) 3, doubleArray40);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', 10.0d, doubleArray27, doubleArray40);
        boolean boolean45 = switchingFunctionsHandler0.reset((double) '4', doubleArray27);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator46 = null;
        boolean boolean47 = switchingFunctionsHandler0.evaluateStep(stepInterpolator46);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler49 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator50 = null;
        boolean boolean51 = switchingFunctionsHandler49.evaluateStep(stepInterpolator50);
        double[] doubleArray58 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray63 = new double[] { '4', (byte) 10 };
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator65 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray63, doubleArray64);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator66 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray58, doubleArray64);
        switchingFunctionsHandler49.stepAccepted((double) 100.0f, doubleArray64);
        switchingFunctionsHandler0.stepAccepted((double) 'a', doubleArray64);
        boolean boolean69 = switchingFunctionsHandler0.isEmpty();
        double double70 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 3.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
    }

    @Test
    public void test14531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14531");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        double[] doubleArray12 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray12, doubleArray13);
        boolean boolean15 = switchingFunctionsHandler0.reset(18.708286933869708d, doubleArray13);
        boolean boolean16 = switchingFunctionsHandler0.isEmpty();
        boolean boolean17 = switchingFunctionsHandler0.isEmpty();
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        switchingFunctionsHandler0.add(switchingFunction19, (double) (byte) 1, (double) (byte) 0, (int) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        switchingFunctionsHandler0.add(switchingFunction24, Double.NaN, (double) (-1L), (int) (byte) 1);
        double double29 = switchingFunctionsHandler0.getEventTime();
        double double30 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test14532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14532");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(31.622776601683793d, 1.7715216602443777d, (double) (-1.0f), 59.16079783099616d);
    }

    @Test
    public void test14533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14533");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, 100.0d, 35.0d, (double) (short) 10);
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) '4');
        double double8 = graggBulirschStoerIntegrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler9 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction10, (double) (-1), 0.0d, 10);
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setStepsizeControl(9.924141172814958d, 97.0d, (double) (byte) 10, 22.80350850198276d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction21, 59.16079783099616d, 52.0d, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertNotNull(stepHandler15);
    }

    @Test
    public void test14534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14534");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 1, (double) (byte) 0, 0.0d, (double) 0L);
        double double5 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double[] doubleArray10 = new double[] { '4', (byte) 10 };
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray10, doubleArray11);
        double double13 = graggBulirschStoerIntegrator12.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator12.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double19 = graggBulirschStoerIntegrator12.getCurrentSignedStepsize();
        double double20 = graggBulirschStoerIntegrator12.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler21 = graggBulirschStoerIntegrator12.getStepHandler();
        double double22 = graggBulirschStoerIntegrator12.getMinStep();
        double[] doubleArray27 = new double[] { '4', (byte) 10 };
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator29 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray27, doubleArray28);
        org.apache.commons.math.ode.StepHandler stepHandler30 = graggBulirschStoerIntegrator29.getStepHandler();
        stepHandler30.reset();
        stepHandler30.reset();
        graggBulirschStoerIntegrator12.setStepHandler(stepHandler30);
        boolean boolean34 = stepHandler30.requiresDenseOutput();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler30);
        double double36 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator4.setStepsizeControl((double) (short) 100, (double) (short) 10, (double) ' ', (double) (byte) 0);
        java.lang.String str42 = graggBulirschStoerIntegrator4.getName();
        double double43 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double double44 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 18.708286933869708d + "'", double19 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertNotNull(stepHandler30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str42, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 0.0d + "'", double43 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
    }

    @Test
    public void test14535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test14535");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(4.949232003839766d, 15.595830465537215d, 7.303997693124478d, (double) (short) 0);
    }
}

