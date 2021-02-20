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
        java.lang.String str60 = graggBulirschStoerIntegrator44.getName();
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
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str60, "Gragg-Bulirsch-Stoer");
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
        double double33 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) 1, 0.0d, 100.0d);
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction85 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction85, 5.656854249492381d, (double) (short) 1, 10);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, 10, 100, 15.100830606950982d);
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
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray20 = new double[] { (-1.0d), 0L };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator22 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray20, doubleArray21);
        graggBulirschStoerIntegrator22.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str28 = graggBulirschStoerIntegrator22.getName();
        double[] doubleArray33 = new double[] { (-1.0d), 0L };
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray33, doubleArray34);
        graggBulirschStoerIntegrator35.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator35.setInterpolationControl(false, (int) (short) 0);
        double double44 = graggBulirschStoerIntegrator35.getMinStep();
        double double45 = graggBulirschStoerIntegrator35.getCurrentSignedStepsize();
        double double46 = graggBulirschStoerIntegrator35.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler47 = graggBulirschStoerIntegrator35.getStepHandler();
        graggBulirschStoerIntegrator22.setStepHandler(stepHandler47);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler47);
        org.apache.commons.math.ode.StepHandler stepHandler50 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setOrderControl((-1), (-1.0d), (double) 1L);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str28, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 31.622776601683793d + "'", double45 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertNotNull(stepHandler50);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        double[] doubleArray6 = new double[] { (-1.0d), 0L };
        double[] doubleArray7 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator8 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray6, doubleArray7);
        double[] doubleArray16 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray21 = new double[] { (-1.0d), 0L };
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray21, doubleArray22);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator24 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray16, doubleArray21);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator25 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray6, doubleArray21);
        graggBulirschStoerIntegrator25.setStepsizeControl(0.0d, (double) 1.0f, (double) (byte) 10, 1.0d);
        java.lang.String str31 = graggBulirschStoerIntegrator25.getName();
        double double32 = graggBulirschStoerIntegrator25.getMinStep();
        double double33 = graggBulirschStoerIntegrator25.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray6), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str31, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.0d + "'", double32 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) '4', (double) 100L, (double) 1L, 1.0d);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 0, (double) 10L, (double) ' ', (double) '4');
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) '#', (double) 0.0f, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        double double6 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setOrderControl((int) (short) -1, 42.661458015403085d, (double) ' ');
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 35.0d + "'", double6 == 35.0d);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', (double) 100.0f, (double) 1.0f, (double) (short) 0);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInitialStepSize((double) 'a');
        graggBulirschStoerIntegrator4.setInitialStepSize((double) 10.0f);
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) (byte) 0);
        org.junit.Assert.assertNotNull(stepHandler5);
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, (double) 1L, (double) (-1), (double) (byte) 0);
        graggBulirschStoerIntegrator4.setOrderControl((int) (short) 100, (double) 10L, 31.622776601683793d);
        org.apache.commons.math.ode.StepHandler stepHandler9 = graggBulirschStoerIntegrator4.getStepHandler();
        double double10 = graggBulirschStoerIntegrator4.getMinStep();
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(3.1622776601683795d, (double) (short) 10, 3.1622776601683795d, (double) (byte) 100);
        double[] doubleArray9 = new double[] { (-1.0d), 0L };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator11 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray9, doubleArray10);
        graggBulirschStoerIntegrator11.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str17 = graggBulirschStoerIntegrator11.getName();
        java.lang.String str18 = graggBulirschStoerIntegrator11.getName();
        graggBulirschStoerIntegrator11.setInitialStepSize((double) (short) 1);
        double[] doubleArray25 = new double[] { (-1.0d), 0L };
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator27 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray25, doubleArray26);
        graggBulirschStoerIntegrator27.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator27.setInterpolationControl(false, (int) (short) 0);
        double double36 = graggBulirschStoerIntegrator27.getMinStep();
        graggBulirschStoerIntegrator27.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        double double41 = graggBulirschStoerIntegrator27.getMaxStep();
        double double42 = graggBulirschStoerIntegrator27.getMaxStep();
        graggBulirschStoerIntegrator27.setInterpolationControl(true, (int) (byte) -1);
        double double46 = graggBulirschStoerIntegrator27.getMinStep();
        double[] doubleArray51 = new double[] { (-1.0d), 0L };
        double[] doubleArray52 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator53 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray51, doubleArray52);
        graggBulirschStoerIntegrator53.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator53.setInterpolationControl(false, (int) (short) 0);
        double double62 = graggBulirschStoerIntegrator53.getMinStep();
        double[] doubleArray67 = new double[] { (-1.0d), 0L };
        double[] doubleArray68 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator69 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray67, doubleArray68);
        graggBulirschStoerIntegrator69.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str75 = graggBulirschStoerIntegrator69.getName();
        double[] doubleArray80 = new double[] { (-1.0d), 0L };
        double[] doubleArray81 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator82 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray80, doubleArray81);
        graggBulirschStoerIntegrator82.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator82.setInterpolationControl(false, (int) (short) 0);
        double double91 = graggBulirschStoerIntegrator82.getMinStep();
        double double92 = graggBulirschStoerIntegrator82.getCurrentSignedStepsize();
        double double93 = graggBulirschStoerIntegrator82.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler94 = graggBulirschStoerIntegrator82.getStepHandler();
        graggBulirschStoerIntegrator69.setStepHandler(stepHandler94);
        graggBulirschStoerIntegrator53.setStepHandler(stepHandler94);
        graggBulirschStoerIntegrator27.setStepHandler(stepHandler94);
        graggBulirschStoerIntegrator11.setStepHandler(stepHandler94);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler94);
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str17, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str18, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str75, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 31.622776601683793d + "'", double92 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
        org.junit.Assert.assertNotNull(stepHandler94);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction66 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction66, (double) 100, (double) (byte) 0, 0);
        double double71 = graggBulirschStoerIntegrator6.getCurrentStepStart();
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
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        double[] doubleArray38 = new double[] { (short) 1, (byte) 0, '4', 1.0d };
        double[] doubleArray45 = new double[] { (-1.0d), 0L };
        double[] doubleArray46 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray45, doubleArray46);
        double[] doubleArray55 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray60 = new double[] { (-1.0d), 0L };
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator62 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray60, doubleArray61);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator63 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray55, doubleArray60);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator64 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray45, doubleArray60);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator65 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) '4', (double) 10L, doubleArray38, doubleArray60);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator66 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(33.26856145160071d, 22.80350850198276d, doubleArray16, doubleArray38);
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
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 0.0, 52.0, 1.0]");
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
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', (double) 100.0f, (double) 1.0f, (double) (short) 0);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInitialStepSize((double) 'a');
        double double8 = graggBulirschStoerIntegrator4.getMaxStep();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
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
        double double21 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (short) 1, (int) 'a', (double) (-1L));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction27, (double) 1L, (double) 0, (-1));
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 'a', (double) 10L, (double) 100, 31.622776601683793d);
        double double37 = graggBulirschStoerIntegrator36.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler38 = graggBulirschStoerIntegrator36.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler38);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(stepHandler38);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, (double) 1.0f, (double) ' ', 0.0d);
        double double5 = graggBulirschStoerIntegrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = graggBulirschStoerIntegrator4.getStepHandler();
        java.lang.String str7 = graggBulirschStoerIntegrator4.getName();
        double double8 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double double9 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler10 = graggBulirschStoerIntegrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str7, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 1.0d + "'", double9 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', (double) (byte) 10, (double) (byte) 10, (-0.0d));
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        graggBulirschStoerIntegrator4.setStepsizeControl(10.0d, (double) (-1.0f), (double) ' ', 52.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1.0f, (double) (byte) 0, 31.622776601683793d, (double) ' ');
        graggBulirschStoerIntegrator4.setStabilityCheck(false, 10, (int) (byte) 10, (double) 100);
        graggBulirschStoerIntegrator4.setStabilityCheck(false, 100, (int) (short) 1, (double) 0L);
        graggBulirschStoerIntegrator4.setOrderControl(100, (double) (-1), (double) 10.0f);
        graggBulirschStoerIntegrator4.setOrderControl((int) '#', 15.100830606950982d, (double) 1.0f);
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray18 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray23 = new double[] { (-1.0d), 0L };
        double[] doubleArray24 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator25 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray23, doubleArray24);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray18, doubleArray23);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator27 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 100.0d, doubleArray8, doubleArray23);
        double[] doubleArray34 = new double[] { (-1.0d), 0L };
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray34, doubleArray35);
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray34, doubleArray37);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, (double) (-1), doubleArray23, doubleArray34);
        graggBulirschStoerIntegrator39.setStepsizeControl((double) (-1.0f), (double) (short) 1, (double) 100.0f, (double) 1.0f);
        graggBulirschStoerIntegrator39.setInterpolationControl(true, (int) ' ');
        double double48 = graggBulirschStoerIntegrator39.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction49 = null;
        graggBulirschStoerIntegrator39.addSwitchingFunction(switchingFunction49, 10.0d, (double) 10.0f, 10);
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
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 1.0d + "'", double48 == 1.0d);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        graggBulirschStoerIntegrator43.setStepsizeControl((double) 0L, (double) 10.0f, (double) 1.0f, 0.0d);
        graggBulirschStoerIntegrator43.setStabilityCheck(true, (int) (short) 1, 0, (double) 100);
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
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(Double.NaN, (double) 1.0f, doubleArray2, doubleArray37);
        double[] doubleArray48 = new double[] { (-1.0d), 0L };
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray48, doubleArray49);
        graggBulirschStoerIntegrator50.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str56 = graggBulirschStoerIntegrator50.getName();
        java.lang.String str57 = graggBulirschStoerIntegrator50.getName();
        graggBulirschStoerIntegrator50.setStabilityCheck(false, (int) (byte) -1, (int) 'a', (double) (-1.0f));
        double double63 = graggBulirschStoerIntegrator50.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler64 = graggBulirschStoerIntegrator50.getStepHandler();
        graggBulirschStoerIntegrator43.setStepHandler(stepHandler64);
        graggBulirschStoerIntegrator43.setInterpolationControl(false, (int) (byte) -1);
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
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str56, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str57, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(stepHandler64);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) -1, (int) 'a', (double) (-1.0f));
        graggBulirschStoerIntegrator6.setStabilityCheck(false, 1, (int) (byte) 1, (double) '#');
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (byte) 0, (double) (short) 10, (double) (byte) -1, (double) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(32.0d, (-0.0d), 33.26856145160071d, (double) (short) 100);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1.0f), (double) 100, (double) 0);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        double double6 = graggBulirschStoerIntegrator4.getMaxStep();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10, (double) (-1.0f), (double) 100, (double) 0);
        graggBulirschStoerIntegrator4.setOrderControl(100, (double) 10L, (double) 'a');
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction37 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction37, (double) 10, 0.0d, (int) (byte) 100);
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
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) 100L, (double) 10, 32.0d);
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        double double72 = graggBulirschStoerIntegrator67.getCurrentSignedStepsize();
        double double73 = graggBulirschStoerIntegrator67.getMaxStep();
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
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 33.26856145160071d + "'", double72 == 33.26856145160071d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 31.622776601683793d + "'", double73 == 31.622776601683793d);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) (byte) 1, (double) '#', (double) (byte) 1);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (short) 1, (int) (short) -1, (double) (byte) 0);
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
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) 1, (int) '4', (double) (-1.0f));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (byte) 0, 0, (double) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction34 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction34, (double) (byte) -1, (double) 1L, (-1));
        graggBulirschStoerIntegrator6.setInitialStepSize(22.80350850198276d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        double double31 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setOrderControl((int) ' ', (double) 100.0f, Double.NaN);
        double double36 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str30, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 31.622776601683793d + "'", double36 == 31.622776601683793d);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) '#', (double) 0.0f, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) ' ');
        graggBulirschStoerIntegrator4.setOrderControl(100, (double) (short) 10, (double) 10.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction13, (double) ' ', 35.0d, (int) (short) 0);
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) '4');
        double[] doubleArray28 = new double[] { 0.0f, (byte) -1, '#', 100, (short) 100 };
        double[] doubleArray33 = new double[] { (-1.0d), 0L };
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray33, doubleArray34);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0, (double) 1L, doubleArray28, doubleArray33);
        org.apache.commons.math.ode.StepHandler stepHandler37 = graggBulirschStoerIntegrator36.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler38 = graggBulirschStoerIntegrator36.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler38);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, -1.0, 35.0, 100.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertNotNull(stepHandler38);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double5 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setOrderControl(0, (double) (short) 10, (double) 1.0f);
        org.apache.commons.math.ode.StepHandler stepHandler10 = graggBulirschStoerIntegrator4.getStepHandler();
        double double11 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
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
        graggBulirschStoerIntegrator6.setOrderControl((-1), (double) 10, (double) 10.0f);
        double double27 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler28 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler29 = graggBulirschStoerIntegrator6.getStepHandler();
        double double30 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double[] doubleArray35 = new double[] { (-1.0d), 0L };
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray35, doubleArray36);
        graggBulirschStoerIntegrator37.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator37.setInterpolationControl(false, (int) (short) 0);
        double double46 = graggBulirschStoerIntegrator37.getMinStep();
        graggBulirschStoerIntegrator37.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        double double51 = graggBulirschStoerIntegrator37.getMaxStep();
        double double52 = graggBulirschStoerIntegrator37.getMaxStep();
        graggBulirschStoerIntegrator37.setInterpolationControl(true, (int) (byte) -1);
        double double56 = graggBulirschStoerIntegrator37.getMinStep();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator61 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (double) (byte) 1, (double) '4', (double) 100);
        double double62 = graggBulirschStoerIntegrator61.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction63 = null;
        graggBulirschStoerIntegrator61.addSwitchingFunction(switchingFunction63, (double) 10, (double) (-1), 0);
        double double68 = graggBulirschStoerIntegrator61.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler69 = graggBulirschStoerIntegrator61.getStepHandler();
        graggBulirschStoerIntegrator37.setStepHandler(stepHandler69);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler69);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (short) 100, (int) (byte) 0, (double) '#');
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
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 100.0d + "'", double52 == 100.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(stepHandler69);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100, (double) 10, 0.0d, 35.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, (double) (byte) 0, (-0.0d), (int) (byte) -1);
        graggBulirschStoerIntegrator4.setInitialStepSize(56.568542494923804d);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10L, (double) (short) 1, (double) (short) 0, (double) (-1L));
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) (byte) -1);
        java.lang.String str8 = graggBulirschStoerIntegrator4.getName();
        double double9 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str8, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        double double36 = graggBulirschStoerIntegrator6.getMinStep();
        double double37 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) ' ', 1, 33.26856145160071d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 31.622776601683793d + "'", double30 == 31.622776601683793d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 10, (-1.0d), (-0.0d), (double) '#');
        graggBulirschStoerIntegrator4.setStepsizeControl((double) ' ', (double) 1L, 97.0d, (double) (-1.0f));
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        double double15 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(0.0d, 0.0d, 0.0d, 0.0d);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) '#', (int) (short) 10, (double) (short) 1);
        double double26 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) '4');
        graggBulirschStoerIntegrator6.setStepsizeControl(35.0d, 0.0d, (double) '4', (-0.0d));
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (short) 1);
        double double37 = graggBulirschStoerIntegrator6.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 100.0d + "'", double26 == 100.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 1);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (byte) 10, Double.NaN, 5.916079783099616d, (double) 1.0f);
        double double32 = graggBulirschStoerIntegrator6.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 100.0d + "'", double21 == 100.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 100.0d + "'", double32 == 100.0d);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1), (double) (short) 10, 0.0d, (double) (byte) 1);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 1, (double) 0L, 100.0d, (double) 0);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) (short) 0);
        double double9 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double10 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) (byte) 10);
        double double14 = graggBulirschStoerIntegrator4.getMinStep();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 1.0d + "'", double14 == 1.0d);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) '4', (double) (byte) 1, (double) (byte) -1, (double) (short) 100);
        java.lang.Class<?> wildcardClass5 = graggBulirschStoerIntegrator4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (short) 1);
        double[] doubleArray20 = new double[] { (-1.0d), 0L };
        double[] doubleArray21 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator22 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray20, doubleArray21);
        graggBulirschStoerIntegrator22.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator22.setInterpolationControl(false, (int) (short) 0);
        double double31 = graggBulirschStoerIntegrator22.getMinStep();
        graggBulirschStoerIntegrator22.setOrderControl((int) (byte) 100, (double) 100L, 1.0d);
        double double36 = graggBulirschStoerIntegrator22.getMaxStep();
        double double37 = graggBulirschStoerIntegrator22.getMaxStep();
        graggBulirschStoerIntegrator22.setInterpolationControl(true, (int) (byte) -1);
        double double41 = graggBulirschStoerIntegrator22.getMinStep();
        double[] doubleArray46 = new double[] { (-1.0d), 0L };
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray46, doubleArray47);
        graggBulirschStoerIntegrator48.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator48.setInterpolationControl(false, (int) (short) 0);
        double double57 = graggBulirschStoerIntegrator48.getMinStep();
        double[] doubleArray62 = new double[] { (-1.0d), 0L };
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator64 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray62, doubleArray63);
        graggBulirschStoerIntegrator64.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str70 = graggBulirschStoerIntegrator64.getName();
        double[] doubleArray75 = new double[] { (-1.0d), 0L };
        double[] doubleArray76 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator77 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray75, doubleArray76);
        graggBulirschStoerIntegrator77.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        graggBulirschStoerIntegrator77.setInterpolationControl(false, (int) (short) 0);
        double double86 = graggBulirschStoerIntegrator77.getMinStep();
        double double87 = graggBulirschStoerIntegrator77.getCurrentSignedStepsize();
        double double88 = graggBulirschStoerIntegrator77.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler89 = graggBulirschStoerIntegrator77.getStepHandler();
        graggBulirschStoerIntegrator64.setStepHandler(stepHandler89);
        graggBulirschStoerIntegrator48.setStepHandler(stepHandler89);
        graggBulirschStoerIntegrator22.setStepHandler(stepHandler89);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler89);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, (double) (short) 10, (double) 'a', (double) 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[]");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str70, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 31.622776601683793d + "'", double87 == 31.622776601683793d);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertNotNull(stepHandler89);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, 22.80350850198276d, (double) '#', (double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
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
        double double60 = graggBulirschStoerIntegrator6.getMaxStep();
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
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 100.0d + "'", double60 == 100.0d);
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
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (-1));
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) 100);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (short) 1, 22.80350850198276d, 3.1622776601683795d, 1.0d);
        java.lang.String str73 = graggBulirschStoerIntegrator6.getName();
        double double74 = graggBulirschStoerIntegrator6.getMinStep();
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
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str73, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        double[] doubleArray8 = new double[] { (-1.0d), 0L };
        double[] doubleArray9 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator10 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray8, doubleArray9);
        double[] doubleArray11 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator12 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 10.0f, doubleArray8, doubleArray11);
        double[] doubleArray13 = null;
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 0, 32.0d, doubleArray8, doubleArray13);
        graggBulirschStoerIntegrator14.setInterpolationControl(false, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[]");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        double[] doubleArray4 = new double[] { (-1.0d), 0L };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) (short) 100, doubleArray4, doubleArray5);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) '4', (double) (byte) 1, 100.0d, (double) (byte) 100);
        java.lang.String str12 = graggBulirschStoerIntegrator6.getName();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 0, (int) (byte) 100, (double) 10.0f);
        graggBulirschStoerIntegrator6.setOrderControl((int) '#', (double) (short) 0, (double) 1);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 1);
        java.lang.String str26 = graggBulirschStoerIntegrator6.getName();
        double double27 = graggBulirschStoerIntegrator6.getMaxStep();
        double double28 = graggBulirschStoerIntegrator6.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction29, (double) (byte) -1, (-1.0d), 100);
        graggBulirschStoerIntegrator6.setOrderControl(100, 0.0d, (double) 100L);
        graggBulirschStoerIntegrator6.setOrderControl(100, (double) 1, (double) (-1.0f));
        double double42 = graggBulirschStoerIntegrator6.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler43 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[-1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str12, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str26, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 100.0d + "'", double28 == 100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 100.0d + "'", double42 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler43);
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 1, (double) 0L, 100.0d, (double) 0);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        double double6 = graggBulirschStoerIntegrator4.getMinStep();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
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
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100L, (double) (short) 1, (double) 100.0f, (double) 1.0f);
        graggBulirschStoerIntegrator4.setOrderControl((int) (byte) 10, 52.0d, (double) (byte) 1);
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) ' ', (int) (byte) 100, (double) 10L);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
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
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
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
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) '#', (double) '4', (-0.0d), (double) (-1.0f));
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator9 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1), 0.0d, 0.0d, (double) (short) 0);
        org.apache.commons.math.ode.StepHandler stepHandler10 = graggBulirschStoerIntegrator9.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler10);
        java.lang.Class<?> wildcardClass12 = graggBulirschStoerIntegrator4.getClass();
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', (double) (byte) 10, (double) (byte) 10, 0.0d);
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (-1));
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100, (double) (byte) 10, 5.656854249492381d, (double) 1);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) (short) 100);
        double double7 = graggBulirschStoerIntegrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
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
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 10.0f, (double) 10.0f, 100.0d, (double) (short) -1);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
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
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) '4', (double) 10L, 10.0d, (-0.0d));
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
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
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, 52.0d, (double) 0L, (double) (byte) 0);
        graggBulirschStoerIntegrator4.setStepsizeControl(31.622776601683793d, 56.568542494923804d, 22.80350850198276d, 0.0d);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) 10.0f);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100, (double) 10, 0.0d, 35.0d);
        double double5 = graggBulirschStoerIntegrator4.getMinStep();
        double double6 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 31.622776601683793d + "'", double6 == 31.622776601683793d);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(31.622776601683793d, (double) 10, (double) ' ', 0.0d);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, (double) (byte) 100, (double) 10L, (double) ' ');
        graggBulirschStoerIntegrator4.setOrderControl(1, (double) 100L, 1.0d);
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) 'a', (-1), (double) 0L);
        graggBulirschStoerIntegrator4.setInterpolationControl(false, 10);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(52.0d, (double) 10L, (double) (short) 10, (double) 10L);
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (-1));
        org.apache.commons.math.ode.StepHandler stepHandler8 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction9, (double) 100, (double) (short) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(stepHandler8);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        graggBulirschStoerIntegrator4.setInitialStepSize(56.568542494923804d);
        graggBulirschStoerIntegrator4.setOrderControl(1, (double) 'a', (double) 10.0f);
        graggBulirschStoerIntegrator4.setOrderControl((int) (short) 100, (double) (-1), 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler37 = graggBulirschStoerIntegrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + (-1.0d) + "'", double5 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertNotNull(stepHandler37);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
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
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) '#', (double) 10, (double) (short) -1, (-0.0d));
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
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100L, (double) 100L, (-0.0d), 1.0d);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
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
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
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
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
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
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 100, (double) 10.0f, (double) ' ', 5.916079783099616d);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 1, (double) 0L, 100.0d, (double) 0);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) (byte) 1, (int) (byte) 100, (double) (-1L));
        org.apache.commons.math.ode.StepHandler stepHandler11 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler11);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
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
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
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
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
}

