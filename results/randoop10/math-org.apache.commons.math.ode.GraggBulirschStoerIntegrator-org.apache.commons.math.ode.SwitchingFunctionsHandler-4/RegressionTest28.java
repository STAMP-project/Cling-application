import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest28 {

    public static boolean debug = false;

    @Test
    public void test14001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14001");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, 35.0d, 100.0d, (int) 'a');
        double double6 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray12 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray12, doubleArray13);
        boolean boolean15 = switchingFunctionsHandler0.reset((double) 3, doubleArray12);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler19 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray24 = new double[] { 10, 100, (byte) 0 };
        boolean boolean25 = switchingFunctionsHandler19.reset((double) 0, doubleArray24);
        double[] doubleArray31 = new double[] { '4', (byte) 10 };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray31, doubleArray32);
        boolean boolean34 = switchingFunctionsHandler19.reset(18.708286933869708d, doubleArray32);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler35 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        switchingFunctionsHandler35.add(switchingFunction36, 35.0d, 100.0d, (int) 'a');
        double double41 = switchingFunctionsHandler35.getEventTime();
        double[] doubleArray47 = new double[] { '4', (byte) 10 };
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray47, doubleArray48);
        boolean boolean50 = switchingFunctionsHandler35.reset((double) 3, doubleArray47);
        double[] doubleArray59 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray64 = new double[] { '4', (byte) 10 };
        double[] doubleArray65 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator66 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray64, doubleArray65);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray59, doubleArray65);
        double[] doubleArray73 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray78 = new double[] { '4', (byte) 10 };
        double[] doubleArray79 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator80 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray78, doubleArray79);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator81 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray73, doubleArray79);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator82 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, (double) (short) 100, doubleArray65, doubleArray73);
        boolean boolean83 = switchingFunctionsHandler35.reset((double) (byte) 10, doubleArray73);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator84 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 2, doubleArray32, doubleArray73);
        boolean boolean85 = switchingFunctionsHandler0.reset(Double.NaN, doubleArray73);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction86 = null;
        switchingFunctionsHandler0.add(switchingFunction86, (double) 'a', (double) '4', (int) (short) 100);
        double double91 = switchingFunctionsHandler0.getEventTime();
        boolean boolean92 = switchingFunctionsHandler0.stop();
        java.lang.Class<?> wildcardClass93 = switchingFunctionsHandler0.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test14002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14002");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler0.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray15 = new double[] { 10, 100, (byte) 0 };
        boolean boolean16 = switchingFunctionsHandler10.reset((double) 0, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler0.reset((double) 100.0f, doubleArray15);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler19 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        switchingFunctionsHandler19.add(switchingFunction20, 35.0d, 100.0d, (int) 'a');
        double double25 = switchingFunctionsHandler19.getEventTime();
        double[] doubleArray31 = new double[] { '4', (byte) 10 };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray31, doubleArray32);
        boolean boolean34 = switchingFunctionsHandler19.reset((double) 3, doubleArray31);
        boolean boolean35 = switchingFunctionsHandler0.reset((double) (short) 0, doubleArray31);
        boolean boolean36 = switchingFunctionsHandler0.stop();
        boolean boolean37 = switchingFunctionsHandler0.stop();
        boolean boolean38 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator39 = null;
        boolean boolean40 = switchingFunctionsHandler0.evaluateStep(stepInterpolator39);
        double double41 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray45 = new double[] {};
        double[] doubleArray51 = new double[] { (short) 100, 3, 'a' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler52 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction53 = null;
        switchingFunctionsHandler52.add(switchingFunction53, 35.0d, 100.0d, (int) 'a');
        double double58 = switchingFunctionsHandler52.getEventTime();
        double[] doubleArray64 = new double[] { '4', (byte) 10 };
        double[] doubleArray65 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator66 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray64, doubleArray65);
        boolean boolean67 = switchingFunctionsHandler52.reset((double) 3, doubleArray64);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator68 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', 10.0d, doubleArray51, doubleArray64);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator69 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((-1.0d), (double) (short) 100, doubleArray45, doubleArray64);
        boolean boolean70 = switchingFunctionsHandler0.reset((double) 10, doubleArray45);
        double[] doubleArray72 = null;
        boolean boolean73 = switchingFunctionsHandler0.reset(1.7782794100389228d, doubleArray72);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator74 = null;
        boolean boolean75 = switchingFunctionsHandler0.evaluateStep(stepInterpolator74);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[100.0, 3.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test14003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14003");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(17.88854381999832d, (double) 0.0f, (double) 10L, (double) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        double double6 = graggBulirschStoerIntegrator4.getMaxStep();
        double double7 = graggBulirschStoerIntegrator4.getMaxStep();
        graggBulirschStoerIntegrator4.setOrderControl((int) (short) 10, (double) (-1.0f), 18.566368063325246d);
        double double12 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double[] doubleArray17 = new double[] { '4', (byte) 10 };
        double[] doubleArray18 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator19 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray17, doubleArray18);
        double double20 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        graggBulirschStoerIntegrator19.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator19.setOrderControl((int) (byte) 100, (double) 0L, 10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        graggBulirschStoerIntegrator19.addSwitchingFunction(switchingFunction30, (double) 1, (double) (short) 1, (int) '4');
        double[] doubleArray39 = new double[] { '4', (byte) 10 };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray39, doubleArray40);
        double double42 = graggBulirschStoerIntegrator41.getCurrentSignedStepsize();
        double[] doubleArray47 = new double[] { '4', (byte) 10 };
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray47, doubleArray48);
        double double50 = graggBulirschStoerIntegrator49.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator49.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double[] doubleArray60 = new double[] { '4', (byte) 10 };
        double[] doubleArray61 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator62 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray60, doubleArray61);
        double double63 = graggBulirschStoerIntegrator62.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator62.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler69 = graggBulirschStoerIntegrator62.getStepHandler();
        graggBulirschStoerIntegrator49.setStepHandler(stepHandler69);
        graggBulirschStoerIntegrator41.setStepHandler(stepHandler69);
        graggBulirschStoerIntegrator19.setStepHandler(stepHandler69);
        double double73 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        double double74 = graggBulirschStoerIntegrator19.getCurrentSignedStepsize();
        double double75 = graggBulirschStoerIntegrator19.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler76 = graggBulirschStoerIntegrator19.getStepHandler();
        boolean boolean77 = stepHandler76.requiresDenseOutput();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler76);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 18.708286933869708d + "'", double42 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 18.708286933869708d + "'", double50 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[]");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 18.708286933869708d + "'", double63 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler69);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 18.708286933869708d + "'", double73 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 18.708286933869708d + "'", double74 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertNotNull(stepHandler76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test14004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14004");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(4.229485053762256d, (double) 10, (double) (-1.0f), 0.0d);
        java.lang.String str5 = graggBulirschStoerIntegrator4.getName();
        java.lang.String str6 = graggBulirschStoerIntegrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str5, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str6, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14005");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        boolean boolean7 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        switchingFunctionsHandler9.add(switchingFunction10, 35.0d, 100.0d, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler16 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray21 = new double[] { 10, 100, (byte) 0 };
        boolean boolean22 = switchingFunctionsHandler16.reset((double) 0, doubleArray21);
        double[] doubleArray28 = new double[] { '4', (byte) 10 };
        double[] doubleArray29 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator30 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray28, doubleArray29);
        boolean boolean31 = switchingFunctionsHandler16.reset(18.708286933869708d, doubleArray29);
        boolean boolean32 = switchingFunctionsHandler9.reset((double) (byte) 0, doubleArray29);
        switchingFunctionsHandler0.stepAccepted((-0.0d), doubleArray29);
        boolean boolean34 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        switchingFunctionsHandler0.add(switchingFunction35, 1.7782794100389228d, 7.691605673134586d, 3);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test14006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14006");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 0L, 10.0d);
        double double17 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) 'a', (int) (byte) 100, 35.0d);
        double double23 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, 100, 2, 0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler29 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 18.708286933869708d + "'", double17 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(stepHandler29);
    }

    @Test
    public void test14007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14007");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler0.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray15 = new double[] { 10, 100, (byte) 0 };
        boolean boolean16 = switchingFunctionsHandler10.reset((double) 0, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler0.reset((double) 100.0f, doubleArray15);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler19 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        switchingFunctionsHandler19.add(switchingFunction20, 35.0d, 100.0d, (int) 'a');
        double double25 = switchingFunctionsHandler19.getEventTime();
        double[] doubleArray31 = new double[] { '4', (byte) 10 };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray31, doubleArray32);
        boolean boolean34 = switchingFunctionsHandler19.reset((double) 3, doubleArray31);
        boolean boolean35 = switchingFunctionsHandler0.reset((double) (short) 0, doubleArray31);
        boolean boolean36 = switchingFunctionsHandler0.isEmpty();
        double double37 = switchingFunctionsHandler0.getEventTime();
        boolean boolean38 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        switchingFunctionsHandler0.add(switchingFunction39, (double) 3, (double) (short) 10, 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test14008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14008");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, 35.0d, 100.0d, (int) 'a');
        double double6 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray12 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray12, doubleArray13);
        boolean boolean15 = switchingFunctionsHandler0.reset((double) 3, doubleArray12);
        double[] doubleArray24 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray29 = new double[] { '4', (byte) 10 };
        double[] doubleArray30 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator31 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray29, doubleArray30);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray24, doubleArray30);
        double[] doubleArray38 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray43 = new double[] { '4', (byte) 10 };
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray43, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray38, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator47 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, (double) (short) 100, doubleArray30, doubleArray38);
        boolean boolean48 = switchingFunctionsHandler0.reset((double) (byte) 10, doubleArray38);
        double double49 = switchingFunctionsHandler0.getEventTime();
        boolean boolean50 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction51 = null;
        switchingFunctionsHandler0.add(switchingFunction51, 42.599340752943135d, 17.78279410038923d, (int) '4');
        double double56 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        switchingFunctionsHandler0.add(switchingFunction57, 32.0d, 7.691605673134586d, 2);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
    }

    @Test
    public void test14009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14009");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 2);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction16, (double) (short) 1, 18.708286933869708d, (int) (byte) 100);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (short) 0, 0, (double) (byte) 1);
        graggBulirschStoerIntegrator6.setStepsizeControl((double) (byte) 1, (double) 'a', 100.0d, (double) '4');
        double[] doubleArray35 = new double[] { '4', (byte) 10 };
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray35, doubleArray36);
        double double38 = graggBulirschStoerIntegrator37.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator37.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double44 = graggBulirschStoerIntegrator37.getCurrentSignedStepsize();
        double double45 = graggBulirschStoerIntegrator37.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler46 = graggBulirschStoerIntegrator37.getStepHandler();
        boolean boolean47 = stepHandler46.requiresDenseOutput();
        boolean boolean48 = stepHandler46.requiresDenseOutput();
        boolean boolean49 = stepHandler46.requiresDenseOutput();
        boolean boolean50 = stepHandler46.requiresDenseOutput();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler46);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 1, (double) (byte) 0, 0.0d, (double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler57 = graggBulirschStoerIntegrator56.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler58 = graggBulirschStoerIntegrator56.getStepHandler();
        double double59 = graggBulirschStoerIntegrator56.getMinStep();
        double double60 = graggBulirschStoerIntegrator56.getMinStep();
        java.lang.String str61 = graggBulirschStoerIntegrator56.getName();
        graggBulirschStoerIntegrator56.setOrderControl((int) (byte) 1, (double) (-1), Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler66 = graggBulirschStoerIntegrator56.getStepHandler();
        boolean boolean67 = stepHandler66.requiresDenseOutput();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler66);
        graggBulirschStoerIntegrator6.setStepsizeControl(5.916079783099616d, 3.1622776601683795d, (double) (byte) 100, (double) ' ');
        java.lang.String str74 = graggBulirschStoerIntegrator6.getName();
        double double75 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 18.708286933869708d + "'", double38 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 18.708286933869708d + "'", double44 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(stepHandler57);
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 1.0d + "'", double59 == 1.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 1.0d + "'", double60 == 1.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str61, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str74, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 18.708286933869708d + "'", double75 == 18.708286933869708d);
    }

    @Test
    public void test14010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14010");
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
        boolean boolean19 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler21 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray26 = new double[] { 10, 100, (byte) 0 };
        boolean boolean27 = switchingFunctionsHandler21.reset((double) 0, doubleArray26);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator28 = null;
        boolean boolean29 = switchingFunctionsHandler21.evaluateStep(stepInterpolator28);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler31 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray36 = new double[] { 10, 100, (byte) 0 };
        boolean boolean37 = switchingFunctionsHandler31.reset((double) 0, doubleArray36);
        boolean boolean38 = switchingFunctionsHandler21.reset((double) 100.0f, doubleArray36);
        double double39 = switchingFunctionsHandler21.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        boolean boolean41 = switchingFunctionsHandler21.evaluateStep(stepInterpolator40);
        double[] doubleArray48 = new double[] { (short) 100, 3, 'a' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler49 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        switchingFunctionsHandler49.add(switchingFunction50, 35.0d, 100.0d, (int) 'a');
        double double55 = switchingFunctionsHandler49.getEventTime();
        double[] doubleArray61 = new double[] { '4', (byte) 10 };
        double[] doubleArray62 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator63 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray61, doubleArray62);
        boolean boolean64 = switchingFunctionsHandler49.reset((double) 3, doubleArray61);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator65 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', 10.0d, doubleArray48, doubleArray61);
        boolean boolean66 = switchingFunctionsHandler21.reset((double) (byte) -1, doubleArray48);
        switchingFunctionsHandler0.stepAccepted((double) 10, doubleArray48);
        boolean boolean68 = switchingFunctionsHandler0.isEmpty();
        double double69 = switchingFunctionsHandler0.getEventTime();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[100.0, 3.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
    }

    @Test
    public void test14011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14011");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double[] doubleArray12 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray12, doubleArray13);
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator14.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler15);
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) -1, (double) (-1L), (double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler21 = graggBulirschStoerIntegrator6.getStepHandler();
        java.lang.String str22 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction23, (double) 100L, (double) 2, (int) '4');
        double double28 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler29 = graggBulirschStoerIntegrator6.getStepHandler();
        double double30 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        java.lang.String str31 = graggBulirschStoerIntegrator6.getName();
        double[] doubleArray36 = new double[] { '4', (byte) 10 };
        double[] doubleArray37 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray36, doubleArray37);
        double double39 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator38.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double45 = graggBulirschStoerIntegrator38.getCurrentSignedStepsize();
        double double46 = graggBulirschStoerIntegrator38.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler47 = graggBulirschStoerIntegrator38.getStepHandler();
        boolean boolean48 = stepHandler47.requiresDenseOutput();
        stepHandler47.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator50 = null;
        stepHandler47.handleStep(stepInterpolator50, false);
        stepHandler47.reset();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler47);
        double double55 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str22, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 18.708286933869708d + "'", double28 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 18.708286933869708d + "'", double30 == 18.708286933869708d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str31, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[]");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 18.708286933869708d + "'", double39 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 18.708286933869708d + "'", double45 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test14012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14012");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 0L, 10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction17, (double) 1, (double) (short) 1, (int) '4');
        double[] doubleArray26 = new double[] { '4', (byte) 10 };
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator28 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray26, doubleArray27);
        double double29 = graggBulirschStoerIntegrator28.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator28.setOrderControl((-1), (-1.0d), (double) 10L);
        double[] doubleArray38 = new double[] { '4', (byte) 10 };
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray38, doubleArray39);
        org.apache.commons.math.ode.StepHandler stepHandler41 = graggBulirschStoerIntegrator40.getStepHandler();
        stepHandler41.reset();
        stepHandler41.reset();
        graggBulirschStoerIntegrator28.setStepHandler(stepHandler41);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction45 = null;
        graggBulirschStoerIntegrator28.addSwitchingFunction(switchingFunction45, (double) (byte) 100, (double) 10.0f, (int) '4');
        org.apache.commons.math.ode.StepHandler stepHandler50 = graggBulirschStoerIntegrator28.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler50);
        double double52 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) '#', 19.364331453687083d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 18.708286933869708d + "'", double29 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 18.708286933869708d + "'", double52 == 18.708286933869708d);
    }

    @Test
    public void test14013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14013");
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
        graggBulirschStoerIntegrator4.setInitialStepSize(24.23056147866101d);
        org.apache.commons.math.ode.StepHandler stepHandler45 = graggBulirschStoerIntegrator4.getStepHandler();
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
        org.junit.Assert.assertNotNull(stepHandler45);
    }

    @Test
    public void test14014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14014");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator6.getStepHandler();
        double double16 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler17 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction18, (double) 1, (double) (byte) 10, (int) (short) 10);
        double double23 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (short) 0);
        double[] doubleArray30 = new double[] { '4', (byte) 10 };
        double[] doubleArray31 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator32 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray30, doubleArray31);
        double double33 = graggBulirschStoerIntegrator32.getCurrentStepStart();
        double[] doubleArray38 = new double[] { '4', (byte) 10 };
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray38, doubleArray39);
        org.apache.commons.math.ode.StepHandler stepHandler41 = graggBulirschStoerIntegrator40.getStepHandler();
        graggBulirschStoerIntegrator32.setStepHandler(stepHandler41);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction43 = null;
        graggBulirschStoerIntegrator32.addSwitchingFunction(switchingFunction43, (-1.0d), (double) (short) 10, (int) (short) 10);
        org.apache.commons.math.ode.StepHandler stepHandler48 = graggBulirschStoerIntegrator32.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler48);
        double[] doubleArray54 = new double[] { '4', (byte) 10 };
        double[] doubleArray55 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator56 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray54, doubleArray55);
        double double57 = graggBulirschStoerIntegrator56.getCurrentSignedStepsize();
        java.lang.String str58 = graggBulirschStoerIntegrator56.getName();
        graggBulirschStoerIntegrator56.setOrderControl(3, 9.848857801796104d, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler63 = graggBulirschStoerIntegrator56.getStepHandler();
        stepHandler63.reset();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler63);
        double double66 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[]");
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 18.708286933869708d + "'", double57 == 18.708286933869708d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str58, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
    }

    @Test
    public void test14015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14015");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction37 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction37, (double) (short) 100, (double) (byte) 100, 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction42, 13.677823998673805d, 100.0d, (int) ' ');
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
    }

    @Test
    public void test14016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14016");
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
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray56 = new double[] { 10, 100, (byte) 0 };
        boolean boolean57 = switchingFunctionsHandler51.reset((double) 0, doubleArray56);
        double[] doubleArray64 = new double[] { 0.0d, 0, (short) 100, 'a', 3.1622776601683795d, (short) 0 };
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator65 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 'a', doubleArray56, doubleArray64);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler68 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray73 = new double[] { 10, 100, (byte) 0 };
        boolean boolean74 = switchingFunctionsHandler68.reset((double) 0, doubleArray73);
        double[] doubleArray81 = new double[] { 0.0d, 0, (short) 100, 'a', 3.1622776601683795d, (short) 0 };
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator82 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 'a', doubleArray73, doubleArray81);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator83 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1.0f, (double) (-1L), doubleArray56, doubleArray81);
        switchingFunctionsHandler0.stepAccepted(0.0d, doubleArray56);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction85 = null;
        switchingFunctionsHandler0.add(switchingFunction85, 17.88854381999832d, (double) '4', (int) (byte) 10);
        boolean boolean90 = switchingFunctionsHandler0.isEmpty();
        double double91 = switchingFunctionsHandler0.getEventTime();
        boolean boolean92 = switchingFunctionsHandler0.isEmpty();
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
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 0.0, 100.0, 97.0, 3.1622776601683795, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 0.0, 100.0, 97.0, 3.1622776601683795, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test14017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14017");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler0.evaluateStep(stepInterpolator7);
        boolean boolean9 = switchingFunctionsHandler0.stop();
        double double10 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray17 = new double[] { 10, 100, (byte) 0 };
        boolean boolean18 = switchingFunctionsHandler12.reset((double) 0, doubleArray17);
        double[] doubleArray24 = new double[] { '4', (byte) 10 };
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator26 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray24, doubleArray25);
        boolean boolean27 = switchingFunctionsHandler12.reset(18.708286933869708d, doubleArray25);
        boolean boolean28 = switchingFunctionsHandler12.isEmpty();
        boolean boolean29 = switchingFunctionsHandler12.isEmpty();
        double[] doubleArray38 = new double[] { (short) 100, 3, 'a' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        switchingFunctionsHandler39.add(switchingFunction40, 35.0d, 100.0d, (int) 'a');
        double double45 = switchingFunctionsHandler39.getEventTime();
        double[] doubleArray51 = new double[] { '4', (byte) 10 };
        double[] doubleArray52 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator53 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray51, doubleArray52);
        boolean boolean54 = switchingFunctionsHandler39.reset((double) 3, doubleArray51);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator55 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', 10.0d, doubleArray38, doubleArray51);
        double[] doubleArray61 = new double[] { (short) 100, 3, 'a' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler62 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction63 = null;
        switchingFunctionsHandler62.add(switchingFunction63, 35.0d, 100.0d, (int) 'a');
        double double68 = switchingFunctionsHandler62.getEventTime();
        double[] doubleArray74 = new double[] { '4', (byte) 10 };
        double[] doubleArray75 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator76 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray74, doubleArray75);
        boolean boolean77 = switchingFunctionsHandler62.reset((double) 3, doubleArray74);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator78 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', 10.0d, doubleArray61, doubleArray74);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator79 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, 1.0d, doubleArray51, doubleArray61);
        boolean boolean80 = switchingFunctionsHandler12.reset((double) 0.0f, doubleArray51);
        boolean boolean81 = switchingFunctionsHandler0.reset((double) 100.0f, doubleArray51);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator82 = null;
        boolean boolean83 = switchingFunctionsHandler0.evaluateStep(stepInterpolator82);
        double double84 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[100.0, 3.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 3.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
    }

    @Test
    public void test14018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14018");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setOrderControl((-1), (-1.0d), (double) 10L);
        double[] doubleArray16 = new double[] { '4', (byte) 10 };
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator18 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray16, doubleArray17);
        org.apache.commons.math.ode.StepHandler stepHandler19 = graggBulirschStoerIntegrator18.getStepHandler();
        stepHandler19.reset();
        stepHandler19.reset();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler19);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction23, (double) (byte) 100, (double) 10.0f, (int) '4');
        graggBulirschStoerIntegrator6.setOrderControl((-1), (double) 10.0f, (double) 0.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction32, (double) 10.0f, 2.0d, (int) (byte) 100);
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 0);
        double[] doubleArray44 = new double[] { '4', (byte) 10 };
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray44, doubleArray45);
        double double47 = graggBulirschStoerIntegrator46.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator46.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double53 = graggBulirschStoerIntegrator46.getCurrentSignedStepsize();
        double double54 = graggBulirschStoerIntegrator46.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler55 = graggBulirschStoerIntegrator46.getStepHandler();
        double double56 = graggBulirschStoerIntegrator46.getMinStep();
        graggBulirschStoerIntegrator46.setStepsizeControl(0.0d, (double) 0, (double) ' ', (-1.0d));
        graggBulirschStoerIntegrator46.setStepsizeControl((double) 3, (double) 3, Double.NaN, (double) 0L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction67 = null;
        graggBulirschStoerIntegrator46.addSwitchingFunction(switchingFunction67, (double) (-1L), (double) (short) -1, (int) 'a');
        graggBulirschStoerIntegrator46.setStabilityCheck(true, (int) (short) 0, (int) (short) 0, 18.708286933869708d);
        org.apache.commons.math.ode.StepHandler stepHandler77 = graggBulirschStoerIntegrator46.getStepHandler();
        stepHandler77.reset();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler77);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction80 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction80, Double.NaN, 8.770179971434215d, (int) '#');
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 18.708286933869708d + "'", double47 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 18.708286933869708d + "'", double53 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(stepHandler55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler77);
    }

    @Test
    public void test14019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14019");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction3 = null;
        switchingFunctionsHandler2.add(switchingFunction3, 35.0d, 100.0d, (int) 'a');
        double double8 = switchingFunctionsHandler2.getEventTime();
        double[] doubleArray14 = new double[] { '4', (byte) 10 };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray14, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler2.reset((double) 3, doubleArray14);
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
        boolean boolean50 = switchingFunctionsHandler2.reset((double) (byte) 10, doubleArray40);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler53 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray58 = new double[] { 10, 100, (byte) 0 };
        boolean boolean59 = switchingFunctionsHandler53.reset((double) 0, doubleArray58);
        double[] doubleArray66 = new double[] { 0.0d, 0, (short) 100, 'a', 3.1622776601683795d, (short) 0 };
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 'a', doubleArray58, doubleArray66);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator68 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, (-0.0d), doubleArray40, doubleArray58);
        org.apache.commons.math.ode.StepHandler stepHandler69 = graggBulirschStoerIntegrator68.getStepHandler();
        double double70 = graggBulirschStoerIntegrator68.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator68.setInterpolationControl(false, 0);
        java.lang.Class<?> wildcardClass74 = graggBulirschStoerIntegrator68.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
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
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.0, 0.0, 100.0, 97.0, 3.1622776601683795, 0.0]");
        org.junit.Assert.assertNotNull(stepHandler69);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-0.0d) + "'", double70 == (-0.0d));
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test14020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14020");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction13, (double) (short) 10, (double) 2, (int) '#');
        double[] doubleArray22 = new double[] { '4', (byte) 10 };
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator24 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray22, doubleArray23);
        double double25 = graggBulirschStoerIntegrator24.getCurrentStepStart();
        graggBulirschStoerIntegrator24.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator24.setOrderControl((int) (byte) 100, (double) 0L, 10.0d);
        double[] doubleArray39 = new double[] { '4', (byte) 10 };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray39, doubleArray40);
        double double42 = graggBulirschStoerIntegrator41.getCurrentStepStart();
        graggBulirschStoerIntegrator41.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        graggBulirschStoerIntegrator41.addSwitchingFunction(switchingFunction48, (double) (short) 10, (double) 2, (int) '#');
        double[] doubleArray57 = new double[] { '4', (byte) 10 };
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator59 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray57, doubleArray58);
        double double60 = graggBulirschStoerIntegrator59.getCurrentStepStart();
        double[] doubleArray65 = new double[] { '4', (byte) 10 };
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray65, doubleArray66);
        org.apache.commons.math.ode.StepHandler stepHandler68 = graggBulirschStoerIntegrator67.getStepHandler();
        graggBulirschStoerIntegrator59.setStepHandler(stepHandler68);
        graggBulirschStoerIntegrator41.setStepHandler(stepHandler68);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator71 = null;
        stepHandler68.handleStep(stepInterpolator71, false);
        graggBulirschStoerIntegrator24.setStepHandler(stepHandler68);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler68);
        double[] doubleArray80 = new double[] { '4', (byte) 10 };
        double[] doubleArray81 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator82 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray80, doubleArray81);
        org.apache.commons.math.ode.StepHandler stepHandler83 = graggBulirschStoerIntegrator82.getStepHandler();
        stepHandler83.reset();
        stepHandler83.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator86 = null;
        stepHandler83.handleStep(stepInterpolator86, true);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler83);
        org.apache.commons.math.ode.StepHandler stepHandler90 = graggBulirschStoerIntegrator6.getStepHandler();
        stepHandler90.reset();
        stepHandler90.reset();
        boolean boolean93 = stepHandler90.requiresDenseOutput();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertNotNull(stepHandler68);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[]");
        org.junit.Assert.assertNotNull(stepHandler83);
        org.junit.Assert.assertNotNull(stepHandler90);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test14021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14021");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double[] doubleArray12 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray12, doubleArray13);
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator14.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler15);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (short) -1, (int) '4', (double) 100);
        java.lang.String str22 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (short) 10, 0, (double) 100L);
        double[] doubleArray32 = new double[] { '4', (byte) 10 };
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray32, doubleArray33);
        double double35 = graggBulirschStoerIntegrator34.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator34.setOrderControl((-1), (-1.0d), (double) 10L);
        double[] doubleArray44 = new double[] { '4', (byte) 10 };
        double[] doubleArray45 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray44, doubleArray45);
        org.apache.commons.math.ode.StepHandler stepHandler47 = graggBulirschStoerIntegrator46.getStepHandler();
        stepHandler47.reset();
        stepHandler47.reset();
        graggBulirschStoerIntegrator34.setStepHandler(stepHandler47);
        org.apache.commons.math.ode.StepHandler stepHandler51 = graggBulirschStoerIntegrator34.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        graggBulirschStoerIntegrator34.addSwitchingFunction(switchingFunction52, (double) 0, (double) (short) -1, (int) (byte) 10);
        double[] doubleArray61 = new double[] { '4', (byte) 10 };
        double[] doubleArray62 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator63 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray61, doubleArray62);
        double double64 = graggBulirschStoerIntegrator63.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator63.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double70 = graggBulirschStoerIntegrator63.getCurrentSignedStepsize();
        double double71 = graggBulirschStoerIntegrator63.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler72 = graggBulirschStoerIntegrator63.getStepHandler();
        double double73 = graggBulirschStoerIntegrator63.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler74 = graggBulirschStoerIntegrator63.getStepHandler();
        stepHandler74.reset();
        graggBulirschStoerIntegrator34.setStepHandler(stepHandler74);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler74);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, 3, (-1), 13.677823998673805d);
        graggBulirschStoerIntegrator6.setStepsizeControl(5.656854249492381d, 24.947901585376336d, (double) 100, 42.599340752943135d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str22, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 18.708286933869708d + "'", double35 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[]");
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[]");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 18.708286933869708d + "'", double64 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 18.708286933869708d + "'", double70 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(stepHandler72);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler74);
    }

    @Test
    public void test14022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14022");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray7 = new double[] { 10, 100, (byte) 0 };
        boolean boolean8 = switchingFunctionsHandler2.reset((double) 0, doubleArray7);
        double[] doubleArray16 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray21 = new double[] { '4', (byte) 10 };
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray21, doubleArray22);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator24 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray16, doubleArray22);
        double[] doubleArray30 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray35 = new double[] { '4', (byte) 10 };
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray35, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray30, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, (double) (short) 100, doubleArray22, doubleArray30);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) -1, (double) (byte) 10, doubleArray7, doubleArray22);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        graggBulirschStoerIntegrator40.addSwitchingFunction(switchingFunction41, (double) (byte) 10, (double) (short) 1, 0);
        graggBulirschStoerIntegrator40.setStabilityCheck(false, (int) (short) 100, 10, (-0.0d));
        graggBulirschStoerIntegrator40.setStepsizeControl((double) (byte) 10, (double) 100L, Double.NaN, (double) (short) -1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction56 = null;
        graggBulirschStoerIntegrator40.addSwitchingFunction(switchingFunction56, 4.47213595499958d, (double) (short) 0, 10);
        double double61 = graggBulirschStoerIntegrator40.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double61));
    }

    @Test
    public void test14023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14023");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, 24.23056147866101d, 18.708286933869708d, Double.NaN);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction5, 40.55100964572346d, 59.16079783099616d, (int) (byte) 10);
    }

    @Test
    public void test14024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14024");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 2);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction16, (double) (short) 10, (double) '#', (int) (short) 0);
        double double21 = graggBulirschStoerIntegrator6.getMinStep();
        double double22 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction23, 32.0d, 1.0d, 0);
        graggBulirschStoerIntegrator6.setInitialStepSize(12.489995996796797d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
    }

    @Test
    public void test14025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14025");
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
    public void test14026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14026");
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
        double double22 = graggBulirschStoerIntegrator6.getMaxStep();
        double double23 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double24 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 35.0d + "'", double22 == 35.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 18.708286933869708d + "'", double23 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 18.708286933869708d + "'", double24 == 18.708286933869708d);
    }

    @Test
    public void test14027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14027");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double double15 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction16, 5.477225575051661d, 31.144823004794873d, 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 18.708286933869708d + "'", double15 == 18.708286933869708d);
    }

    @Test
    public void test14028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14028");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        org.apache.commons.math.ode.StepHandler stepHandler7 = graggBulirschStoerIntegrator6.getStepHandler();
        double double8 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler9 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler10 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler11 = graggBulirschStoerIntegrator6.getStepHandler();
        double[] doubleArray16 = new double[] { '4', (byte) 10 };
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator18 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray16, doubleArray17);
        double double19 = graggBulirschStoerIntegrator18.getCurrentStepStart();
        graggBulirschStoerIntegrator18.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator18.setInterpolationControl(true, 2);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        graggBulirschStoerIntegrator18.addSwitchingFunction(switchingFunction28, (double) (short) 1, 18.708286933869708d, (int) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler33 = graggBulirschStoerIntegrator18.getStepHandler();
        boolean boolean34 = stepHandler33.requiresDenseOutput();
        stepHandler33.reset();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler33);
        org.apache.commons.math.ode.StepHandler stepHandler37 = null;
        // The following exception was thrown during execution in test generation
        try {
            graggBulirschStoerIntegrator6.setStepHandler(stepHandler37);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 18.708286933869708d + "'", double8 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test14029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14029");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction8, 0.0d, (double) (-1.0f), (int) (short) 10);
        graggBulirschStoerIntegrator6.setOrderControl(0, (double) 2, 0.0d);
        double double17 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double[] doubleArray22 = new double[] { '4', (byte) 10 };
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator24 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray22, doubleArray23);
        double double25 = graggBulirschStoerIntegrator24.getCurrentStepStart();
        graggBulirschStoerIntegrator24.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator24.setOrderControl((int) (byte) 100, (double) 0L, 10.0d);
        double[] doubleArray39 = new double[] { '4', (byte) 10 };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray39, doubleArray40);
        double double42 = graggBulirschStoerIntegrator41.getCurrentStepStart();
        graggBulirschStoerIntegrator41.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        graggBulirschStoerIntegrator41.addSwitchingFunction(switchingFunction48, (double) (short) 10, (double) 2, (int) '#');
        double[] doubleArray57 = new double[] { '4', (byte) 10 };
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator59 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray57, doubleArray58);
        double double60 = graggBulirschStoerIntegrator59.getCurrentStepStart();
        double[] doubleArray65 = new double[] { '4', (byte) 10 };
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray65, doubleArray66);
        org.apache.commons.math.ode.StepHandler stepHandler68 = graggBulirschStoerIntegrator67.getStepHandler();
        graggBulirschStoerIntegrator59.setStepHandler(stepHandler68);
        graggBulirschStoerIntegrator41.setStepHandler(stepHandler68);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator71 = null;
        stepHandler68.handleStep(stepInterpolator71, false);
        graggBulirschStoerIntegrator24.setStepHandler(stepHandler68);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler68);
        double double76 = graggBulirschStoerIntegrator6.getMinStep();
        double[] doubleArray81 = new double[] { '4', (byte) 10 };
        double[] doubleArray82 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator83 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray81, doubleArray82);
        org.apache.commons.math.ode.StepHandler stepHandler84 = graggBulirschStoerIntegrator83.getStepHandler();
        stepHandler84.reset();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler84);
        org.apache.commons.math.ode.StepHandler stepHandler87 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator88 = null;
        stepHandler87.handleStep(stepInterpolator88, true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 18.708286933869708d + "'", double17 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertNotNull(stepHandler68);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 10.0d + "'", double76 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[]");
        org.junit.Assert.assertNotNull(stepHandler84);
        org.junit.Assert.assertNotNull(stepHandler87);
    }

    @Test
    public void test14030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14030");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(17.88854381999832d, (double) 0.0f, (double) 10L, (double) (byte) 0);
        org.apache.commons.math.ode.StepHandler stepHandler5 = graggBulirschStoerIntegrator4.getStepHandler();
        double double6 = graggBulirschStoerIntegrator4.getMaxStep();
        double double7 = graggBulirschStoerIntegrator4.getMaxStep();
        java.lang.String str8 = graggBulirschStoerIntegrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler9 = graggBulirschStoerIntegrator4.getStepHandler();
        double double10 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str8, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test14031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14031");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, 35.0d, 100.0d, (int) 'a');
        double double6 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray12 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray12, doubleArray13);
        boolean boolean15 = switchingFunctionsHandler0.reset((double) 3, doubleArray12);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler19 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray24 = new double[] { 10, 100, (byte) 0 };
        boolean boolean25 = switchingFunctionsHandler19.reset((double) 0, doubleArray24);
        double[] doubleArray31 = new double[] { '4', (byte) 10 };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray31, doubleArray32);
        boolean boolean34 = switchingFunctionsHandler19.reset(18.708286933869708d, doubleArray32);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler35 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        switchingFunctionsHandler35.add(switchingFunction36, 35.0d, 100.0d, (int) 'a');
        double double41 = switchingFunctionsHandler35.getEventTime();
        double[] doubleArray47 = new double[] { '4', (byte) 10 };
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray47, doubleArray48);
        boolean boolean50 = switchingFunctionsHandler35.reset((double) 3, doubleArray47);
        double[] doubleArray59 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray64 = new double[] { '4', (byte) 10 };
        double[] doubleArray65 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator66 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray64, doubleArray65);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray59, doubleArray65);
        double[] doubleArray73 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray78 = new double[] { '4', (byte) 10 };
        double[] doubleArray79 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator80 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray78, doubleArray79);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator81 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray73, doubleArray79);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator82 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, (double) (short) 100, doubleArray65, doubleArray73);
        boolean boolean83 = switchingFunctionsHandler35.reset((double) (byte) 10, doubleArray73);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator84 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, (double) 2, doubleArray32, doubleArray73);
        boolean boolean85 = switchingFunctionsHandler0.reset(Double.NaN, doubleArray73);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction86 = null;
        switchingFunctionsHandler0.add(switchingFunction86, (double) 'a', (double) '4', (int) (short) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction91 = null;
        switchingFunctionsHandler0.add(switchingFunction91, 18.708286933869708d, (-0.0d), (-1));
        boolean boolean96 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test14032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14032");
        double[] doubleArray5 = new double[] { (short) 100, 3, 'a' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        switchingFunctionsHandler6.add(switchingFunction7, 35.0d, 100.0d, (int) 'a');
        double double12 = switchingFunctionsHandler6.getEventTime();
        double[] doubleArray18 = new double[] { '4', (byte) 10 };
        double[] doubleArray19 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator20 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray18, doubleArray19);
        boolean boolean21 = switchingFunctionsHandler6.reset((double) 3, doubleArray18);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator22 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', 10.0d, doubleArray5, doubleArray18);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        graggBulirschStoerIntegrator22.addSwitchingFunction(switchingFunction23, 100.0d, (double) 100, (-1));
        double double28 = graggBulirschStoerIntegrator22.getCurrentSignedStepsize();
        double double29 = graggBulirschStoerIntegrator22.getCurrentSignedStepsize();
        java.lang.String str30 = graggBulirschStoerIntegrator22.getName();
        double[] doubleArray35 = new double[] { '4', (byte) 10 };
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray35, doubleArray36);
        double double38 = graggBulirschStoerIntegrator37.getCurrentSignedStepsize();
        double[] doubleArray43 = new double[] { '4', (byte) 10 };
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray43, doubleArray44);
        double double46 = graggBulirschStoerIntegrator45.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator45.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double[] doubleArray56 = new double[] { '4', (byte) 10 };
        double[] doubleArray57 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator58 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray56, doubleArray57);
        double double59 = graggBulirschStoerIntegrator58.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator58.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler65 = graggBulirschStoerIntegrator58.getStepHandler();
        graggBulirschStoerIntegrator45.setStepHandler(stepHandler65);
        graggBulirschStoerIntegrator37.setStepHandler(stepHandler65);
        double double68 = graggBulirschStoerIntegrator37.getMinStep();
        java.lang.String str69 = graggBulirschStoerIntegrator37.getName();
        org.apache.commons.math.ode.StepHandler stepHandler70 = graggBulirschStoerIntegrator37.getStepHandler();
        graggBulirschStoerIntegrator37.setInitialStepSize((double) (short) -1);
        org.apache.commons.math.ode.StepHandler stepHandler73 = graggBulirschStoerIntegrator37.getStepHandler();
        graggBulirschStoerIntegrator22.setStepHandler(stepHandler73);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[100.0, 3.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 17.88854381999832d + "'", double28 == 17.88854381999832d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 17.88854381999832d + "'", double29 == 17.88854381999832d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str30, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 18.708286933869708d + "'", double38 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 18.708286933869708d + "'", double46 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[]");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 18.708286933869708d + "'", double59 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler65);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str69, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler70);
        org.junit.Assert.assertNotNull(stepHandler73);
    }

    @Test
    public void test14033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14033");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 1, (double) 100.0f, (double) ' ', (double) 0);
        double double5 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction9, 18.708286933869708d, (double) (byte) 100, 0);
        double double14 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator4.setOrderControl((int) '4', 52.0d, (double) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test14034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14034");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        org.apache.commons.math.ode.StepHandler stepHandler7 = graggBulirschStoerIntegrator6.getStepHandler();
        double double8 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double9 = graggBulirschStoerIntegrator6.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction10, (double) 1, (double) (byte) 0, 1);
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        stepHandler15.handleStep(stepInterpolator16, true);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        stepHandler15.handleStep(stepInterpolator19, true);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 18.708286933869708d + "'", double8 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertNotNull(stepHandler15);
    }

    @Test
    public void test14035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14035");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 0L, 10.0d);
        double[] doubleArray21 = new double[] { '4', (byte) 10 };
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray21, doubleArray22);
        double double24 = graggBulirschStoerIntegrator23.getCurrentStepStart();
        graggBulirschStoerIntegrator23.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        graggBulirschStoerIntegrator23.addSwitchingFunction(switchingFunction30, (double) (short) 10, (double) 2, (int) '#');
        double[] doubleArray39 = new double[] { '4', (byte) 10 };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray39, doubleArray40);
        double double42 = graggBulirschStoerIntegrator41.getCurrentStepStart();
        double[] doubleArray47 = new double[] { '4', (byte) 10 };
        double[] doubleArray48 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator49 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray47, doubleArray48);
        org.apache.commons.math.ode.StepHandler stepHandler50 = graggBulirschStoerIntegrator49.getStepHandler();
        graggBulirschStoerIntegrator41.setStepHandler(stepHandler50);
        graggBulirschStoerIntegrator23.setStepHandler(stepHandler50);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator53 = null;
        stepHandler50.handleStep(stepInterpolator53, false);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler50);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction57, (double) (-1), (double) 10, (int) (short) -1);
        org.apache.commons.math.ode.StepHandler stepHandler62 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setInitialStepSize(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler65 = graggBulirschStoerIntegrator6.getStepHandler();
        double double66 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[]");
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertNotNull(stepHandler62);
        org.junit.Assert.assertNotNull(stepHandler65);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
    }

    @Test
    public void test14036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14036");
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
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) 1);
        double double30 = graggBulirschStoerIntegrator6.getMaxStep();
        double double31 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction32, 1.189207115002721d, (double) (byte) 0, (int) (short) 10);
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
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 35.0d + "'", double30 == 35.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 18.708286933869708d + "'", double31 == 18.708286933869708d);
    }

    @Test
    public void test14037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14037");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler0.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray15 = new double[] { 10, 100, (byte) 0 };
        boolean boolean16 = switchingFunctionsHandler10.reset((double) 0, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler0.reset((double) 100.0f, doubleArray15);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler19 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        switchingFunctionsHandler19.add(switchingFunction20, 35.0d, 100.0d, (int) 'a');
        double double25 = switchingFunctionsHandler19.getEventTime();
        double[] doubleArray31 = new double[] { '4', (byte) 10 };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray31, doubleArray32);
        boolean boolean34 = switchingFunctionsHandler19.reset((double) 3, doubleArray31);
        boolean boolean35 = switchingFunctionsHandler0.reset((double) (short) 0, doubleArray31);
        boolean boolean36 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler0.evaluateStep(stepInterpolator37);
        boolean boolean39 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test14038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14038");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        switchingFunctionsHandler0.add(switchingFunction7, (double) (short) -1, 0.0d, 100);
        boolean boolean12 = switchingFunctionsHandler0.stop();
        boolean boolean13 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        switchingFunctionsHandler0.add(switchingFunction14, 18.708286933869708d, (double) (byte) 10, (int) (short) 0);
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
        double[] doubleArray50 = new double[] { (short) 100, 3, 'a' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        switchingFunctionsHandler51.add(switchingFunction52, 35.0d, 100.0d, (int) 'a');
        double double57 = switchingFunctionsHandler51.getEventTime();
        double[] doubleArray63 = new double[] { '4', (byte) 10 };
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator65 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray63, doubleArray64);
        boolean boolean66 = switchingFunctionsHandler51.reset((double) 3, doubleArray63);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) ' ', 10.0d, doubleArray50, doubleArray63);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator68 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0L, 1.0d, doubleArray40, doubleArray50);
        boolean boolean69 = switchingFunctionsHandler0.reset(32.0d, doubleArray50);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction70 = null;
        switchingFunctionsHandler0.add(switchingFunction70, 31.622776601683793d, 18.566368063325246d, (int) (byte) 0);
        boolean boolean75 = switchingFunctionsHandler0.stop();
        boolean boolean76 = switchingFunctionsHandler0.isEmpty();
        boolean boolean77 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 3.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[100.0, 3.0, 97.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test14039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14039");
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
        graggBulirschStoerIntegrator4.setOrderControl((int) 'a', 1.0d, (double) 0);
        graggBulirschStoerIntegrator4.setStepsizeControl((double) 3, (double) ' ', (double) 1L, (-1.0d));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction56 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction56, (double) (byte) 10, (double) 10, (int) '4');
        graggBulirschStoerIntegrator4.setStabilityCheck(true, (int) (short) 1, (int) (short) 10, (double) (byte) -1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction66 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction66, 13.33521432163324d, 18.708286933869708d, (int) (byte) -1);
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
    }

    @Test
    public void test14040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14040");
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
        org.apache.commons.math.ode.StepHandler stepHandler42 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) (byte) -1);
        double[] doubleArray50 = new double[] { '4', (byte) 10 };
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray50, doubleArray51);
        double double53 = graggBulirschStoerIntegrator52.getCurrentStepStart();
        double[] doubleArray58 = new double[] { '4', (byte) 10 };
        double[] doubleArray59 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator60 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray58, doubleArray59);
        org.apache.commons.math.ode.StepHandler stepHandler61 = graggBulirschStoerIntegrator60.getStepHandler();
        graggBulirschStoerIntegrator52.setStepHandler(stepHandler61);
        graggBulirschStoerIntegrator52.setOrderControl((int) (short) -1, (double) (-1L), (double) 10);
        double double67 = graggBulirschStoerIntegrator52.getMinStep();
        graggBulirschStoerIntegrator52.setStepsizeControl(35.0d, (double) (byte) 1, (double) 10.0f, (double) 100L);
        java.lang.String str73 = graggBulirschStoerIntegrator52.getName();
        double[] doubleArray78 = new double[] { '4', (byte) 10 };
        double[] doubleArray79 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator80 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray78, doubleArray79);
        double double81 = graggBulirschStoerIntegrator80.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler82 = graggBulirschStoerIntegrator80.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator83 = null;
        stepHandler82.handleStep(stepInterpolator83, true);
        graggBulirschStoerIntegrator52.setStepHandler(stepHandler82);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction87 = null;
        graggBulirschStoerIntegrator52.addSwitchingFunction(switchingFunction87, (double) (short) 0, (double) 'a', (int) (byte) 100);
        org.apache.commons.math.ode.StepHandler stepHandler92 = graggBulirschStoerIntegrator52.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler92);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator94 = null;
        stepHandler92.handleStep(stepInterpolator94, true);
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
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str73, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(stepHandler82);
        org.junit.Assert.assertNotNull(stepHandler92);
    }

    @Test
    public void test14041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14041");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double[] doubleArray12 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray12, doubleArray13);
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator14.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler15);
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) -1, (double) (-1L), (double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler21 = graggBulirschStoerIntegrator6.getStepHandler();
        double double22 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setOrderControl((int) '4', 5.602043370695193d, 5.477225575051661d);
        double double27 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler28 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction29, (double) 0L, (double) 0, 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 18.708286933869708d + "'", double22 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 18.708286933869708d + "'", double27 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler28);
    }

    @Test
    public void test14042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14042");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 0L, 10.0d);
        double double17 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        java.lang.String str18 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction19, (double) (byte) 10, (double) 0.0f, (int) (short) 0);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, 3);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction27, (double) '4', 18.708286933869708d, 100);
        org.apache.commons.math.ode.StepHandler stepHandler32 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) (byte) 1, (int) (short) 10, (double) 2);
        org.apache.commons.math.ode.StepHandler stepHandler38 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 18.708286933869708d + "'", double17 == 18.708286933869708d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str18, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler32);
        org.junit.Assert.assertNotNull(stepHandler38);
    }

    @Test
    public void test14043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14043");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        org.apache.commons.math.ode.StepHandler stepHandler7 = graggBulirschStoerIntegrator6.getStepHandler();
        double double8 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler9 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler10 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction11, (double) 2, (double) 2, (int) (byte) 1);
        graggBulirschStoerIntegrator6.setInitialStepSize(4.438210856143747d);
        double double18 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 18.708286933869708d + "'", double8 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 18.708286933869708d + "'", double18 == 18.708286933869708d);
    }

    @Test
    public void test14044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14044");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double double15 = graggBulirschStoerIntegrator6.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler16 = graggBulirschStoerIntegrator6.getStepHandler();
        double[] doubleArray21 = new double[] { '4', (byte) 10 };
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray21, doubleArray22);
        double double24 = graggBulirschStoerIntegrator23.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator23.setOrderControl((-1), (-1.0d), (double) 10L);
        double[] doubleArray33 = new double[] { '4', (byte) 10 };
        double[] doubleArray34 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator35 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray33, doubleArray34);
        org.apache.commons.math.ode.StepHandler stepHandler36 = graggBulirschStoerIntegrator35.getStepHandler();
        stepHandler36.reset();
        stepHandler36.reset();
        graggBulirschStoerIntegrator23.setStepHandler(stepHandler36);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler36);
        double double41 = graggBulirschStoerIntegrator6.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction42, 3.138288992714996d, 17.78279410038923d, (int) '4');
        graggBulirschStoerIntegrator6.setInitialStepSize(42.661458015403085d);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (byte) 100, (-1), 5.602043370695193d);
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (byte) 10, 100, 24.947901585376336d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 18.708286933869708d + "'", double24 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[]");
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 35.0d + "'", double41 == 35.0d);
    }

    @Test
    public void test14045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14045");
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
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 1, (double) (byte) 0, 0.0d, (double) 0L);
        double double41 = graggBulirschStoerIntegrator40.getCurrentSignedStepsize();
        double[] doubleArray46 = new double[] { '4', (byte) 10 };
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray46, doubleArray47);
        double double49 = graggBulirschStoerIntegrator48.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator48.setOrderControl((-1), (-1.0d), (double) 10L);
        double[] doubleArray58 = new double[] { '4', (byte) 10 };
        double[] doubleArray59 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator60 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray58, doubleArray59);
        org.apache.commons.math.ode.StepHandler stepHandler61 = graggBulirschStoerIntegrator60.getStepHandler();
        stepHandler61.reset();
        stepHandler61.reset();
        graggBulirschStoerIntegrator48.setStepHandler(stepHandler61);
        graggBulirschStoerIntegrator40.setStepHandler(stepHandler61);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler61);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction67 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction67, (double) '#', (double) (short) 1, 2);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction72 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction72, 17.88854381999832d, (double) 0, (int) (byte) 1);
        double double77 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler78 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction79 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction79, 20.819449099200266d, 35.0d, (int) ' ');
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
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.0d + "'", double41 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 18.708286933869708d + "'", double49 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[]");
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 0.0d + "'", double77 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler78);
    }

    @Test
    public void test14046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14046");
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
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) ' ');
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction28, (double) (byte) 10, 17.88854381999832d, (int) '4');
        graggBulirschStoerIntegrator6.setInitialStepSize((double) (byte) -1);
        java.lang.String str35 = graggBulirschStoerIntegrator6.getName();
        double double36 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double[] doubleArray41 = new double[] { '4', (byte) 10 };
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray41, doubleArray42);
        org.apache.commons.math.ode.StepHandler stepHandler44 = graggBulirschStoerIntegrator43.getStepHandler();
        java.lang.String str45 = graggBulirschStoerIntegrator43.getName();
        double[] doubleArray50 = new double[] { '4', (byte) 10 };
        double[] doubleArray51 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator52 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray50, doubleArray51);
        double double53 = graggBulirschStoerIntegrator52.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator52.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double[] doubleArray63 = new double[] { '4', (byte) 10 };
        double[] doubleArray64 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator65 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray63, doubleArray64);
        double double66 = graggBulirschStoerIntegrator65.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator65.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        org.apache.commons.math.ode.StepHandler stepHandler72 = graggBulirschStoerIntegrator65.getStepHandler();
        graggBulirschStoerIntegrator52.setStepHandler(stepHandler72);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator74 = null;
        stepHandler72.handleStep(stepInterpolator74, true);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator77 = null;
        stepHandler72.handleStep(stepInterpolator77, false);
        graggBulirschStoerIntegrator43.setStepHandler(stepHandler72);
        boolean boolean81 = stepHandler72.requiresDenseOutput();
        stepHandler72.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator83 = null;
        stepHandler72.handleStep(stepInterpolator83, false);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler72);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str35, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str45, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[]");
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 18.708286933869708d + "'", double53 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[]");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 18.708286933869708d + "'", double66 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler72);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test14047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14047");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setOrderControl((-1), (-1.0d), (double) 10L);
        double[] doubleArray16 = new double[] { '4', (byte) 10 };
        double[] doubleArray17 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator18 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray16, doubleArray17);
        org.apache.commons.math.ode.StepHandler stepHandler19 = graggBulirschStoerIntegrator18.getStepHandler();
        stepHandler19.reset();
        stepHandler19.reset();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler19);
        org.apache.commons.math.ode.StepHandler stepHandler23 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStepsizeControl(18.708286933869708d, 18.708286933869708d, (double) 0, (double) ' ');
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) 'a', 10, (double) '#');
        graggBulirschStoerIntegrator6.setOrderControl(0, 10.0d, (double) 3);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction38 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction38, 10.0d, 3.0d, (int) '#');
        double double43 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double44 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl(31.622776601683793d, 3.1622776601683795d, 3.1622776601683795d, (-0.0d));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction50, 15.100830606950982d, 31.622776601683793d, 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[]");
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 18.708286933869708d + "'", double43 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 18.708286933869708d + "'", double44 == 18.708286933869708d);
    }

    @Test
    public void test14048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14048");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double[] doubleArray12 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray12, doubleArray13);
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator14.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler15);
        java.lang.String str17 = graggBulirschStoerIntegrator6.getName();
        double double18 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction19, 18.708286933869708d, 0.0d, (int) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction24, (double) 10L, 35.0d, (-1));
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (short) -1, (int) (short) 1, (double) (short) 10);
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) -1, (double) 'a', 3.1622776601683795d);
        java.lang.String str38 = graggBulirschStoerIntegrator6.getName();
        double[] doubleArray43 = new double[] { '4', (byte) 10 };
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray43, doubleArray44);
        double double46 = graggBulirschStoerIntegrator45.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator45.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double52 = graggBulirschStoerIntegrator45.getCurrentSignedStepsize();
        double double53 = graggBulirschStoerIntegrator45.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler54 = graggBulirschStoerIntegrator45.getStepHandler();
        double double55 = graggBulirschStoerIntegrator45.getMinStep();
        graggBulirschStoerIntegrator45.setStepsizeControl(0.0d, (double) 0, (double) ' ', (-1.0d));
        double double61 = graggBulirschStoerIntegrator45.getCurrentStepStart();
        graggBulirschStoerIntegrator45.setOrderControl((int) '#', 0.0d, 35.0d);
        graggBulirschStoerIntegrator45.setStabilityCheck(true, (int) (short) 0, (int) (short) 100, 10.0d);
        double double71 = graggBulirschStoerIntegrator45.getCurrentStepStart();
        double double72 = graggBulirschStoerIntegrator45.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler73 = graggBulirschStoerIntegrator45.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler73);
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction77 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction77, (double) (byte) -1, 3.138288992714996d, (int) (short) 100);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str17, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str38, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 18.708286933869708d + "'", double46 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 18.708286933869708d + "'", double52 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(stepHandler54);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 18.708286933869708d + "'", double72 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler73);
    }

    @Test
    public void test14049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14049");
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
        java.lang.String str42 = graggBulirschStoerIntegrator4.getName();
        graggBulirschStoerIntegrator4.setOrderControl((-1), (double) 3, (double) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler47 = graggBulirschStoerIntegrator4.getStepHandler();
        double double48 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        double double49 = graggBulirschStoerIntegrator4.getMaxStep();
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
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str42, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 18.708286933869708d + "'", double49 == 18.708286933869708d);
    }

    @Test
    public void test14050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14050");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray7 = new double[] { 10, 100, (byte) 0 };
        boolean boolean8 = switchingFunctionsHandler2.reset((double) 0, doubleArray7);
        double[] doubleArray14 = new double[] { '4', (byte) 10 };
        double[] doubleArray15 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator16 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray14, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler2.reset(18.708286933869708d, doubleArray15);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        switchingFunctionsHandler2.add(switchingFunction18, Double.NaN, (-1.0d), (int) (byte) 10);
        double[] doubleArray27 = new double[] { (byte) 10, 1L, (byte) 10 };
        boolean boolean28 = switchingFunctionsHandler2.reset((double) 10L, doubleArray27);
        double[] doubleArray36 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray41 = new double[] { '4', (byte) 10 };
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray41, doubleArray42);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator44 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray36, doubleArray42);
        double[] doubleArray50 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray55 = new double[] { '4', (byte) 10 };
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray55, doubleArray56);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator58 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray50, doubleArray56);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator59 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, (double) (short) 100, doubleArray42, doubleArray50);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator60 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 100L, (double) (byte) 100, doubleArray27, doubleArray50);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction61 = null;
        graggBulirschStoerIntegrator60.addSwitchingFunction(switchingFunction61, (double) '#', 59.16079783099616d, 2);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction66 = null;
        graggBulirschStoerIntegrator60.addSwitchingFunction(switchingFunction66, 14.142135623730951d, 25.588865599815865d, 1);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 1.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
    }

    @Test
    public void test14051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14051");
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
        graggBulirschStoerIntegrator4.setStepsizeControl((double) (byte) 10, (double) 100, (double) 0.0f, 100.0d);
        java.lang.String str78 = graggBulirschStoerIntegrator4.getName();
        double[] doubleArray83 = new double[] { '4', (byte) 10 };
        double[] doubleArray84 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator85 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray83, doubleArray84);
        org.apache.commons.math.ode.StepHandler stepHandler86 = graggBulirschStoerIntegrator85.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler86);
        stepHandler86.reset();
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
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str78, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[]");
        org.junit.Assert.assertNotNull(stepHandler86);
    }

    @Test
    public void test14052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14052");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        double[] doubleArray12 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray12, doubleArray13);
        boolean boolean15 = switchingFunctionsHandler0.reset(18.708286933869708d, doubleArray13);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        switchingFunctionsHandler0.add(switchingFunction16, Double.NaN, (-1.0d), (int) (byte) 10);
        boolean boolean21 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        switchingFunctionsHandler0.add(switchingFunction22, (double) 100.0f, (double) '4', (int) 'a');
        boolean boolean27 = switchingFunctionsHandler0.isEmpty();
        boolean boolean28 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        switchingFunctionsHandler0.add(switchingFunction29, (double) 100L, (double) 10, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test14053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14053");
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
        org.apache.commons.math.ode.StepHandler stepHandler30 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setOrderControl(10, 17.88854381999832d, 3.0d);
        double double35 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler36 = graggBulirschStoerIntegrator6.getStepHandler();
        stepHandler36.reset();
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
        org.junit.Assert.assertNotNull(stepHandler30);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(stepHandler36);
    }

    @Test
    public void test14054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14054");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, 10.0d, (double) 100, 18.708286933869708d);
        double double5 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = graggBulirschStoerIntegrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler7 = graggBulirschStoerIntegrator4.getStepHandler();
        boolean boolean8 = stepHandler7.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        stepHandler7.handleStep(stepInterpolator9, false);
        stepHandler7.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test14055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14055");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (short) 1);
        java.lang.String str19 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.StepHandler stepHandler20 = graggBulirschStoerIntegrator6.getStepHandler();
        java.lang.String str21 = graggBulirschStoerIntegrator6.getName();
        double[] doubleArray26 = new double[] { '4', (byte) 10 };
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator28 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray26, doubleArray27);
        double double29 = graggBulirschStoerIntegrator28.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator28.setOrderControl((-1), (-1.0d), (double) 10L);
        double[] doubleArray38 = new double[] { '4', (byte) 10 };
        double[] doubleArray39 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray38, doubleArray39);
        org.apache.commons.math.ode.StepHandler stepHandler41 = graggBulirschStoerIntegrator40.getStepHandler();
        stepHandler41.reset();
        stepHandler41.reset();
        graggBulirschStoerIntegrator28.setStepHandler(stepHandler41);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler41);
        double double46 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str19, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str21, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 18.708286933869708d + "'", double29 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[]");
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 35.0d + "'", double46 == 35.0d);
    }

    @Test
    public void test14056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14056");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(17.88854381999832d, (double) (byte) -1, (double) (short) 100, (double) (-1.0f));
        graggBulirschStoerIntegrator4.setStepsizeControl(31.622776601683793d, 0.0d, 15.100830606950982d, (double) (byte) 0);
        org.apache.commons.math.ode.FirstOrderDifferentialEquations firstOrderDifferentialEquations10 = null;
        double[] doubleArray12 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler14 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray19 = new double[] { 10, 100, (byte) 0 };
        boolean boolean20 = switchingFunctionsHandler14.reset((double) 0, doubleArray19);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        switchingFunctionsHandler14.add(switchingFunction21, (double) (short) -1, 0.0d, 100);
        boolean boolean26 = switchingFunctionsHandler14.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        switchingFunctionsHandler14.add(switchingFunction27, 9.848857801796104d, (double) (short) 10, (int) (byte) 0);
        boolean boolean32 = switchingFunctionsHandler14.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler34 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray39 = new double[] { 10, 100, (byte) 0 };
        boolean boolean40 = switchingFunctionsHandler34.reset((double) 0, doubleArray39);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        switchingFunctionsHandler34.add(switchingFunction41, (double) (short) -1, 0.0d, 100);
        boolean boolean46 = switchingFunctionsHandler34.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        switchingFunctionsHandler34.add(switchingFunction47, 9.848857801796104d, (double) (short) 10, (int) (byte) 0);
        double double52 = switchingFunctionsHandler34.getEventTime();
        boolean boolean53 = switchingFunctionsHandler34.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler55 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator56 = null;
        boolean boolean57 = switchingFunctionsHandler55.evaluateStep(stepInterpolator56);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler59 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction60 = null;
        switchingFunctionsHandler59.add(switchingFunction60, 35.0d, 100.0d, (int) 'a');
        double double65 = switchingFunctionsHandler59.getEventTime();
        double[] doubleArray71 = new double[] { '4', (byte) 10 };
        double[] doubleArray72 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator73 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray71, doubleArray72);
        boolean boolean74 = switchingFunctionsHandler59.reset((double) 3, doubleArray71);
        switchingFunctionsHandler55.stepAccepted((double) 'a', doubleArray71);
        boolean boolean76 = switchingFunctionsHandler34.reset(0.0d, doubleArray71);
        boolean boolean77 = switchingFunctionsHandler14.reset(15.100830606950982d, doubleArray71);
        // The following exception was thrown during execution in test generation
        try {
            graggBulirschStoerIntegrator4.integrate(firstOrderDifferentialEquations10, 10.246950765959598d, doubleArray12, (double) 1.0f, doubleArray71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test14057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14057");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(0.0d, 40.55100964572346d, 18.708286933869708d, 17.88854381999832d);
    }

    @Test
    public void test14058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14058");
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
        double double47 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double double48 = graggBulirschStoerIntegrator4.getMaxStep();
        double double49 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction50, 25.588865599815865d, 0.0d, (int) (short) 100);
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
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 18.708286933869708d + "'", double48 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
    }

    @Test
    public void test14059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14059");
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
        double double46 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double[] doubleArray51 = new double[] { '4', (byte) 10 };
        double[] doubleArray52 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator53 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray51, doubleArray52);
        double double54 = graggBulirschStoerIntegrator53.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        graggBulirschStoerIntegrator53.addSwitchingFunction(switchingFunction55, 0.0d, (double) (-1.0f), (int) (short) 10);
        java.lang.String str60 = graggBulirschStoerIntegrator53.getName();
        java.lang.String str61 = graggBulirschStoerIntegrator53.getName();
        double[] doubleArray66 = new double[] { '4', (byte) 10 };
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator68 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray66, doubleArray67);
        graggBulirschStoerIntegrator68.setStepsizeControl((double) (byte) 10, 0.0d, (double) 0, 0.0d);
        graggBulirschStoerIntegrator68.setStepsizeControl(0.0d, (double) (-1.0f), (double) (-1.0f), (double) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler79 = graggBulirschStoerIntegrator68.getStepHandler();
        boolean boolean80 = stepHandler79.requiresDenseOutput();
        graggBulirschStoerIntegrator53.setStepHandler(stepHandler79);
        boolean boolean82 = stepHandler79.requiresDenseOutput();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler79);
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
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 18.708286933869708d + "'", double54 == 18.708286933869708d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str60, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str61, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertNotNull(stepHandler79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test14060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14060");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1L, (double) 0.0f, (double) 100.0f, (double) (-1.0f));
        double double5 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        double double6 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator11 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(5.602043370695193d, 0.0d, 25.588865599815865d, 2.0d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = graggBulirschStoerIntegrator11.getStepHandler();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler12);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler12);
    }

    @Test
    public void test14061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14061");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 0L, 10.0d);
        org.apache.commons.math.ode.StepHandler stepHandler17 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 100);
        graggBulirschStoerIntegrator6.setOrderControl((int) ' ', (double) 100L, (double) (-1L));
        org.apache.commons.math.ode.StepHandler stepHandler25 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction26, 0.0d, (double) (short) 10, 0);
        double double31 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double32 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 18.708286933869708d + "'", double31 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 18.708286933869708d + "'", double32 == 18.708286933869708d);
    }

    @Test
    public void test14062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14062");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, (int) (short) 1);
        graggBulirschStoerIntegrator6.setOrderControl((int) '#', (double) 10, 10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction23, (-1.0d), 97.0d, 10);
        double double28 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setInterpolationControl(true, 10);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) 'a');
        graggBulirschStoerIntegrator6.setInitialStepSize(3.1622776601683795d);
        double double37 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double double38 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction39, 5.477225575051661d, 3.138288992714996d, (int) (short) 0);
        org.apache.commons.math.ode.StepHandler stepHandler44 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(stepHandler44);
    }

    @Test
    public void test14063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14063");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double[] doubleArray12 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray12, doubleArray13);
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator14.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler15);
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) -1, (double) (-1L), (double) 10);
        double double21 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction22, (double) 100L, 0.0d, (int) '#');
        org.apache.commons.math.ode.StepHandler stepHandler27 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStabilityCheck(false, (int) 'a', (int) 'a', 0.0d);
        java.lang.String str33 = graggBulirschStoerIntegrator6.getName();
        double double34 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double[] doubleArray39 = new double[] { '4', (byte) 10 };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray39, doubleArray40);
        double double42 = graggBulirschStoerIntegrator41.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator41.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double48 = graggBulirschStoerIntegrator41.getCurrentSignedStepsize();
        double double49 = graggBulirschStoerIntegrator41.getCurrentStepStart();
        double double50 = graggBulirschStoerIntegrator41.getMaxStep();
        double[] doubleArray55 = new double[] { '4', (byte) 10 };
        double[] doubleArray56 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator57 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray55, doubleArray56);
        double double58 = graggBulirschStoerIntegrator57.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator57.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double64 = graggBulirschStoerIntegrator57.getCurrentSignedStepsize();
        double double65 = graggBulirschStoerIntegrator57.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler66 = graggBulirschStoerIntegrator57.getStepHandler();
        boolean boolean67 = stepHandler66.requiresDenseOutput();
        graggBulirschStoerIntegrator41.setStepHandler(stepHandler66);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction69 = null;
        graggBulirschStoerIntegrator41.addSwitchingFunction(switchingFunction69, 0.0d, (double) (byte) 1, (-1));
        double double74 = graggBulirschStoerIntegrator41.getMinStep();
        double[] doubleArray79 = new double[] { '4', (byte) 10 };
        double[] doubleArray80 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator81 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray79, doubleArray80);
        org.apache.commons.math.ode.StepHandler stepHandler82 = graggBulirschStoerIntegrator81.getStepHandler();
        double double83 = graggBulirschStoerIntegrator81.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler84 = graggBulirschStoerIntegrator81.getStepHandler();
        graggBulirschStoerIntegrator81.setInterpolationControl(true, (int) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler88 = graggBulirschStoerIntegrator81.getStepHandler();
        graggBulirschStoerIntegrator81.setInterpolationControl(false, 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction92 = null;
        graggBulirschStoerIntegrator81.addSwitchingFunction(switchingFunction92, 32.0d, (double) (short) 0, (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler97 = graggBulirschStoerIntegrator81.getStepHandler();
        graggBulirschStoerIntegrator41.setStepHandler(stepHandler97);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler97);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str33, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 18.708286933869708d + "'", double42 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 18.708286933869708d + "'", double48 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 35.0d + "'", double50 == 35.0d);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray56), "[]");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 18.708286933869708d + "'", double58 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 18.708286933869708d + "'", double64 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[]");
        org.junit.Assert.assertNotNull(stepHandler82);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 18.708286933869708d + "'", double83 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler84);
        org.junit.Assert.assertNotNull(stepHandler88);
        org.junit.Assert.assertNotNull(stepHandler97);
    }

    @Test
    public void test14064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14064");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double double15 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0, (double) 100.0f, (double) 2, (double) (-1L));
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator25 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 1, (double) (byte) 0, 0.0d, (double) 0L);
        double double26 = graggBulirschStoerIntegrator25.getCurrentSignedStepsize();
        double[] doubleArray31 = new double[] { '4', (byte) 10 };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray31, doubleArray32);
        double double34 = graggBulirschStoerIntegrator33.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator33.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double40 = graggBulirschStoerIntegrator33.getCurrentSignedStepsize();
        double double41 = graggBulirschStoerIntegrator33.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler42 = graggBulirschStoerIntegrator33.getStepHandler();
        double double43 = graggBulirschStoerIntegrator33.getMinStep();
        double[] doubleArray48 = new double[] { '4', (byte) 10 };
        double[] doubleArray49 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator50 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray48, doubleArray49);
        org.apache.commons.math.ode.StepHandler stepHandler51 = graggBulirschStoerIntegrator50.getStepHandler();
        stepHandler51.reset();
        stepHandler51.reset();
        graggBulirschStoerIntegrator33.setStepHandler(stepHandler51);
        boolean boolean55 = stepHandler51.requiresDenseOutput();
        graggBulirschStoerIntegrator25.setStepHandler(stepHandler51);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        graggBulirschStoerIntegrator25.addSwitchingFunction(switchingFunction57, (double) (short) 10, (double) 0, (int) (byte) -1);
        double double62 = graggBulirschStoerIntegrator25.getCurrentStepStart();
        double[] doubleArray67 = new double[] { '4', (byte) 10 };
        double[] doubleArray68 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator69 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray67, doubleArray68);
        double double70 = graggBulirschStoerIntegrator69.getCurrentStepStart();
        graggBulirschStoerIntegrator69.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator69.setOrderControl((int) (byte) 100, (double) 0L, 10.0d);
        double double80 = graggBulirschStoerIntegrator69.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler81 = graggBulirschStoerIntegrator69.getStepHandler();
        graggBulirschStoerIntegrator25.setStepHandler(stepHandler81);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler81);
        org.apache.commons.math.ode.StepHandler stepHandler84 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 35.0d + "'", double15 == 35.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 18.708286933869708d + "'", double34 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 18.708286933869708d + "'", double40 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[]");
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 18.708286933869708d + "'", double80 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(stepHandler81);
        org.junit.Assert.assertNotNull(stepHandler84);
    }

    @Test
    public void test14065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14065");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction25, 52.0d, (double) 100.0f, (int) ' ');
        graggBulirschStoerIntegrator4.setStepsizeControl(0.0d, 18.708286933869708d, (double) (-1), (double) (short) 100);
        double[] doubleArray39 = new double[] { '4', (byte) 10 };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray39, doubleArray40);
        org.apache.commons.math.ode.StepHandler stepHandler42 = graggBulirschStoerIntegrator41.getStepHandler();
        stepHandler42.reset();
        stepHandler42.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator45 = null;
        stepHandler42.handleStep(stepInterpolator45, true);
        stepHandler42.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator49 = null;
        stepHandler42.handleStep(stepInterpolator49, true);
        stepHandler42.reset();
        stepHandler42.reset();
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler42);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction55, 42.661458015403085d, (double) (short) -1, (int) (byte) 1);
        java.lang.String str60 = graggBulirschStoerIntegrator4.getName();
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
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str60, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14066");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray7 = new double[] { 10, 100, (byte) 0 };
        boolean boolean8 = switchingFunctionsHandler2.reset((double) 0, doubleArray7);
        double[] doubleArray16 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray21 = new double[] { '4', (byte) 10 };
        double[] doubleArray22 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator23 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray21, doubleArray22);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator24 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray16, doubleArray22);
        double[] doubleArray30 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray35 = new double[] { '4', (byte) 10 };
        double[] doubleArray36 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator37 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray35, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator38 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray30, doubleArray36);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator39 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, (double) (short) 100, doubleArray22, doubleArray30);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator40 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) -1, (double) (byte) 10, doubleArray7, doubleArray22);
        double double41 = graggBulirschStoerIntegrator40.getCurrentStepStart();
        double double42 = graggBulirschStoerIntegrator40.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction43 = null;
        graggBulirschStoerIntegrator40.addSwitchingFunction(switchingFunction43, (double) 1, (double) (short) 0, (int) (short) 1);
        double double48 = graggBulirschStoerIntegrator40.getCurrentSignedStepsize();
        double double49 = graggBulirschStoerIntegrator40.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        graggBulirschStoerIntegrator40.addSwitchingFunction(switchingFunction50, (double) (byte) 0, (double) 10, (int) 'a');
        graggBulirschStoerIntegrator40.setStabilityCheck(true, 10, (int) (short) 10, 22.80350850198276d);
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue(Double.isNaN(double49));
    }

    @Test
    public void test14067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14067");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator6.getStepHandler();
        double double16 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setOrderControl(2, (double) 1.0f, (double) (byte) 1);
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        graggBulirschStoerIntegrator6.setStabilityCheck(false, 100, (int) (byte) 1, (double) (-1L));
        double double29 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        java.lang.String str30 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.StepHandler stepHandler31 = graggBulirschStoerIntegrator6.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 18.708286933869708d + "'", double29 == 18.708286933869708d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str30, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler31);
    }

    @Test
    public void test14068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14068");
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
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction28, 3.1622776601683795d, 18.708286933869708d, (int) '4');
        java.lang.String str33 = graggBulirschStoerIntegrator6.getName();
        double double34 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double[] doubleArray39 = new double[] { '4', (byte) 10 };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray39, doubleArray40);
        double double42 = graggBulirschStoerIntegrator41.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator41.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double48 = graggBulirschStoerIntegrator41.getCurrentSignedStepsize();
        double double49 = graggBulirschStoerIntegrator41.getCurrentStepStart();
        graggBulirschStoerIntegrator41.setInterpolationControl(false, (int) (byte) 1);
        java.lang.String str53 = graggBulirschStoerIntegrator41.getName();
        org.apache.commons.math.ode.StepHandler stepHandler54 = graggBulirschStoerIntegrator41.getStepHandler();
        java.lang.String str55 = graggBulirschStoerIntegrator41.getName();
        org.apache.commons.math.ode.StepHandler stepHandler56 = graggBulirschStoerIntegrator41.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler56);
        double double58 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double59 = graggBulirschStoerIntegrator6.getCurrentStepStart();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str33, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 18.708286933869708d + "'", double34 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 18.708286933869708d + "'", double42 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 18.708286933869708d + "'", double48 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str53, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str55, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(stepHandler56);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 18.708286933869708d + "'", double58 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test14069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14069");
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
        double double25 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator4.setInterpolationControl(false, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction29, 59.16079783099616d, (double) (-1L), 0);
        graggBulirschStoerIntegrator4.setStepsizeControl(8.8953032533072d, 72.11102550927978d, (double) (short) 10, (double) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 3.1622776601683795d + "'", double25 == 3.1622776601683795d);
    }

    @Test
    public void test14070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14070");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator6.setOrderControl((int) (byte) 100, (double) 0L, 10.0d);
        double double17 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        java.lang.String str18 = graggBulirschStoerIntegrator6.getName();
        double double19 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction20, (double) 100, (double) (byte) 0, 1);
        java.lang.String str25 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setOrderControl((int) 'a', 100.0d, (double) (-1.0f));
        double[] doubleArray34 = new double[] { '4', (byte) 10 };
        double[] doubleArray35 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator36 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray34, doubleArray35);
        double double37 = graggBulirschStoerIntegrator36.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator36.setOrderControl((-1), (-1.0d), (double) 10L);
        double[] doubleArray46 = new double[] { '4', (byte) 10 };
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray46, doubleArray47);
        org.apache.commons.math.ode.StepHandler stepHandler49 = graggBulirschStoerIntegrator48.getStepHandler();
        stepHandler49.reset();
        stepHandler49.reset();
        graggBulirschStoerIntegrator36.setStepHandler(stepHandler49);
        org.apache.commons.math.ode.StepHandler stepHandler53 = graggBulirschStoerIntegrator36.getStepHandler();
        graggBulirschStoerIntegrator36.setStepsizeControl(18.708286933869708d, 18.708286933869708d, (double) 0, (double) ' ');
        graggBulirschStoerIntegrator36.setStabilityCheck(false, (int) 'a', 10, (double) '#');
        graggBulirschStoerIntegrator36.setOrderControl(0, 10.0d, (double) 3);
        double[] doubleArray72 = new double[] { '4', (byte) 10 };
        double[] doubleArray73 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator74 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray72, doubleArray73);
        double double75 = graggBulirschStoerIntegrator74.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator74.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double81 = graggBulirschStoerIntegrator74.getCurrentSignedStepsize();
        double double82 = graggBulirschStoerIntegrator74.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler83 = graggBulirschStoerIntegrator74.getStepHandler();
        double double84 = graggBulirschStoerIntegrator74.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler85 = graggBulirschStoerIntegrator74.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction86 = null;
        graggBulirschStoerIntegrator74.addSwitchingFunction(switchingFunction86, (double) 1, (double) (byte) 10, (int) (short) 10);
        org.apache.commons.math.ode.StepHandler stepHandler91 = graggBulirschStoerIntegrator74.getStepHandler();
        graggBulirschStoerIntegrator36.setStepHandler(stepHandler91);
        double double93 = graggBulirschStoerIntegrator36.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler94 = graggBulirschStoerIntegrator36.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler94);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 18.708286933869708d + "'", double17 == 18.708286933869708d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str18, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str25, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[]");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 18.708286933869708d + "'", double37 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertNotNull(stepHandler53);
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[]");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 18.708286933869708d + "'", double75 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 18.708286933869708d + "'", double81 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double82));
        org.junit.Assert.assertNotNull(stepHandler83);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler85);
        org.junit.Assert.assertNotNull(stepHandler91);
        org.junit.Assert.assertTrue(Double.isNaN(double93));
        org.junit.Assert.assertNotNull(stepHandler94);
    }

    @Test
    public void test14071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14071");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        double double2 = switchingFunctionsHandler0.getEventTime();
        double double3 = switchingFunctionsHandler0.getEventTime();
        double double4 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test14072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14072");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(3.0d, (double) 0, 7.211102550927978d, (double) 2);
        graggBulirschStoerIntegrator4.setStepsizeControl((double) (short) 1, (double) (short) 10, 40.55100964572346d, (double) ' ');
    }

    @Test
    public void test14073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14073");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException9 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "hi!");
        org.apache.commons.math.ode.IntegratorException integratorException10 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException9);
        java.lang.Object[] objArray11 = integratorException10.getArguments();
        java.lang.Object[] objArray18 = new java.lang.Object[] { "hi!", (byte) 1, 10.0d, '4', (byte) 100 };
        org.apache.commons.math.MathException mathException19 = new org.apache.commons.math.MathException("", objArray18);
        org.apache.commons.math.MathException mathException20 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException19);
        org.apache.commons.math.ode.DerivativeException derivativeException21 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException19);
        double[] doubleArray26 = new double[] { '4', (byte) 10 };
        double[] doubleArray27 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator28 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray26, doubleArray27);
        double double29 = graggBulirschStoerIntegrator28.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator28.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        java.lang.String str35 = graggBulirschStoerIntegrator28.getName();
        double[] doubleArray41 = new double[] { '4', (byte) 10 };
        double[] doubleArray42 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator43 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray41, doubleArray42);
        double double44 = graggBulirschStoerIntegrator43.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator43.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double50 = graggBulirschStoerIntegrator43.getCurrentSignedStepsize();
        double double51 = graggBulirschStoerIntegrator43.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler52 = graggBulirschStoerIntegrator43.getStepHandler();
        double double53 = graggBulirschStoerIntegrator43.getMinStep();
        graggBulirschStoerIntegrator43.setOrderControl((int) (short) 1, (double) 0.0f, (double) 1.0f);
        double[] doubleArray62 = new double[] { '4', (byte) 10 };
        double[] doubleArray63 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator64 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray62, doubleArray63);
        double double65 = graggBulirschStoerIntegrator64.getCurrentStepStart();
        double[] doubleArray70 = new double[] { '4', (byte) 10 };
        double[] doubleArray71 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator72 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray70, doubleArray71);
        org.apache.commons.math.ode.StepHandler stepHandler73 = graggBulirschStoerIntegrator72.getStepHandler();
        graggBulirschStoerIntegrator64.setStepHandler(stepHandler73);
        java.lang.Object[] objArray75 = new java.lang.Object[] { integratorException10, derivativeException21, str35, '#', 0.0f, graggBulirschStoerIntegrator64 };
        org.apache.commons.math.ode.IntegratorException integratorException76 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: ", objArray75);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException77 = new org.apache.commons.math.FunctionEvaluationException(0.0d, (java.lang.Throwable) integratorException76);
        java.lang.Throwable[] throwableArray78 = integratorException76.getSuppressed();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException80 = new org.apache.commons.math.FunctionEvaluationException((double) 3);
        java.lang.String str81 = functionEvaluationException80.getPattern();
        org.apache.commons.math.MathException mathException82 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ", (java.lang.Object[]) throwableArray78, (java.lang.Throwable) functionEvaluationException80);
        java.lang.String str83 = mathException82.getPattern();
        java.lang.Object[] objArray84 = mathException82.getArguments();
        org.apache.commons.math.ode.IntegratorException integratorException85 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: Evaluation failed for argument = 97", objArray84);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException87 = new org.apache.commons.math.FunctionEvaluationException((-1.0d));
        java.lang.String str88 = functionEvaluationException87.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException89 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ", objArray84, (java.lang.Throwable) functionEvaluationException87);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException90 = new org.apache.commons.math.FunctionEvaluationException(17.51402104133522d, (java.lang.Throwable) functionEvaluationException89);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[]");
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[hi!, 1, 10.0, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[hi!, 1, 10.0, 4, 100]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 18.708286933869708d + "'", double29 == 18.708286933869708d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str35, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[]");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 18.708286933869708d + "'", double44 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 18.708286933869708d + "'", double50 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertNotNull(stepHandler52);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[]");
        org.junit.Assert.assertNotNull(stepHandler73);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(throwableArray78);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Evaluation failed for argument = {0}" + "'", str81, "Evaluation failed for argument = {0}");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: " + "'", str83, "org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: ");
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray84), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray84), "[]");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "Evaluation failed for argument = {0}" + "'", str88, "Evaluation failed for argument = {0}");
    }

    @Test
    public void test14074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14074");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        org.apache.commons.math.ode.StepHandler stepHandler7 = graggBulirschStoerIntegrator6.getStepHandler();
        double double8 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double9 = graggBulirschStoerIntegrator6.getMaxStep();
        graggBulirschStoerIntegrator6.setInitialStepSize((double) 100);
        double double12 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        java.lang.String str13 = graggBulirschStoerIntegrator6.getName();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 18.708286933869708d + "'", double8 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 35.0d + "'", double9 == 35.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str13, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14075");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 0.0f, 18.708286933869708d, 1.0d, 18.708286933869708d);
        double[] doubleArray9 = new double[] { '4', (byte) 10 };
        double[] doubleArray10 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator11 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray9, doubleArray10);
        double double12 = graggBulirschStoerIntegrator11.getCurrentStepStart();
        graggBulirschStoerIntegrator11.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        graggBulirschStoerIntegrator11.setInterpolationControl(true, 2);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        graggBulirschStoerIntegrator11.addSwitchingFunction(switchingFunction21, (double) (short) 1, 18.708286933869708d, (int) (byte) 100);
        double double26 = graggBulirschStoerIntegrator11.getMaxStep();
        double double27 = graggBulirschStoerIntegrator11.getCurrentSignedStepsize();
        double[] doubleArray32 = new double[] { '4', (byte) 10 };
        double[] doubleArray33 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray32, doubleArray33);
        double double35 = graggBulirschStoerIntegrator34.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator34.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double41 = graggBulirschStoerIntegrator34.getCurrentSignedStepsize();
        double double42 = graggBulirschStoerIntegrator34.getCurrentStepStart();
        double double43 = graggBulirschStoerIntegrator34.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler44 = graggBulirschStoerIntegrator34.getStepHandler();
        double[] doubleArray49 = new double[] { '4', (byte) 10 };
        double[] doubleArray50 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator51 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray49, doubleArray50);
        double double52 = graggBulirschStoerIntegrator51.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator51.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double58 = graggBulirschStoerIntegrator51.getCurrentSignedStepsize();
        double double59 = graggBulirschStoerIntegrator51.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler60 = graggBulirschStoerIntegrator51.getStepHandler();
        double double61 = graggBulirschStoerIntegrator51.getMinStep();
        graggBulirschStoerIntegrator51.setStepsizeControl(0.0d, (double) 0, (double) ' ', (-1.0d));
        graggBulirschStoerIntegrator51.setInitialStepSize((-1.0d));
        org.apache.commons.math.ode.StepHandler stepHandler69 = graggBulirschStoerIntegrator51.getStepHandler();
        stepHandler69.reset();
        graggBulirschStoerIntegrator34.setStepHandler(stepHandler69);
        graggBulirschStoerIntegrator11.setStepHandler(stepHandler69);
        graggBulirschStoerIntegrator4.setStepHandler(stepHandler69);
        double double74 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        java.lang.Class<?> wildcardClass75 = graggBulirschStoerIntegrator4.getClass();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 18.708286933869708d + "'", double27 == 18.708286933869708d);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[]");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 18.708286933869708d + "'", double35 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 18.708286933869708d + "'", double41 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 35.0d + "'", double43 == 35.0d);
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 18.708286933869708d + "'", double52 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 18.708286933869708d + "'", double58 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
        org.junit.Assert.assertNotNull(stepHandler60);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler69);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test14076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14076");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        double[] doubleArray12 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray12, doubleArray13);
        boolean boolean15 = switchingFunctionsHandler0.reset(18.708286933869708d, doubleArray13);
        boolean boolean16 = switchingFunctionsHandler0.isEmpty();
        boolean boolean17 = switchingFunctionsHandler0.stop();
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        boolean boolean20 = switchingFunctionsHandler0.evaluateStep(stepInterpolator19);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray29 = new double[] { 10, 100, (byte) 0 };
        boolean boolean30 = switchingFunctionsHandler24.reset((double) 0, doubleArray29);
        double[] doubleArray38 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray43 = new double[] { '4', (byte) 10 };
        double[] doubleArray44 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator45 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray43, doubleArray44);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator46 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray38, doubleArray44);
        double[] doubleArray52 = new double[] { 1.0d, (byte) 0, 10.0d };
        double[] doubleArray57 = new double[] { '4', (byte) 10 };
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator59 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray57, doubleArray58);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator60 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (-1L), (double) (byte) 100, doubleArray52, doubleArray58);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator61 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator(35.0d, (double) (short) 100, doubleArray44, doubleArray52);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator62 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) -1, (double) (byte) 10, doubleArray29, doubleArray44);
        boolean boolean63 = switchingFunctionsHandler0.reset(31.622776601683793d, doubleArray44);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction64 = null;
        switchingFunctionsHandler0.add(switchingFunction64, 3.1622776601683795d, (double) 100.0f, 100);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[1.0, 0.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test14077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14077");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray5 = new double[] { 10, 100, (byte) 0 };
        boolean boolean6 = switchingFunctionsHandler0.reset((double) 0, doubleArray5);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler8 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray13 = new double[] { 10, 100, (byte) 0 };
        boolean boolean14 = switchingFunctionsHandler8.reset((double) 0, doubleArray13);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator15 = null;
        boolean boolean16 = switchingFunctionsHandler8.evaluateStep(stepInterpolator15);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler18 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray23 = new double[] { 10, 100, (byte) 0 };
        boolean boolean24 = switchingFunctionsHandler18.reset((double) 0, doubleArray23);
        boolean boolean25 = switchingFunctionsHandler8.reset((double) 100.0f, doubleArray23);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        switchingFunctionsHandler27.add(switchingFunction28, 35.0d, 100.0d, (int) 'a');
        double double33 = switchingFunctionsHandler27.getEventTime();
        double[] doubleArray39 = new double[] { '4', (byte) 10 };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray39, doubleArray40);
        boolean boolean42 = switchingFunctionsHandler27.reset((double) 3, doubleArray39);
        boolean boolean43 = switchingFunctionsHandler8.reset((double) (short) 0, doubleArray39);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler47 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray52 = new double[] { 10, 100, (byte) 0 };
        boolean boolean53 = switchingFunctionsHandler47.reset((double) 0, doubleArray52);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler54 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray59 = new double[] { 10, 100, (byte) 0 };
        boolean boolean60 = switchingFunctionsHandler54.reset((double) 0, doubleArray59);
        double[] doubleArray66 = new double[] { '4', (byte) 10 };
        double[] doubleArray67 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator68 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray66, doubleArray67);
        boolean boolean69 = switchingFunctionsHandler54.reset(18.708286933869708d, doubleArray67);
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator70 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, 35.0d, doubleArray52, doubleArray67);
        boolean boolean71 = switchingFunctionsHandler8.reset((double) (byte) 10, doubleArray67);
        boolean boolean72 = switchingFunctionsHandler0.reset((double) (short) -1, doubleArray67);
        boolean boolean73 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray75 = null;
        boolean boolean76 = switchingFunctionsHandler0.reset((double) 'a', doubleArray75);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator77 = null;
        boolean boolean78 = switchingFunctionsHandler0.evaluateStep(stepInterpolator77);
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[10.0, 100.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test14078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14078");
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
        double double24 = graggBulirschStoerIntegrator6.getMinStep();
        java.lang.String str25 = graggBulirschStoerIntegrator6.getName();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str25, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14079");
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
        graggBulirschStoerIntegrator4.setOrderControl((int) 'a', 1.0d, (double) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction51 = null;
        graggBulirschStoerIntegrator4.addSwitchingFunction(switchingFunction51, 0.0d, (double) (short) -1, 3);
        org.apache.commons.math.ode.StepHandler stepHandler56 = graggBulirschStoerIntegrator4.getStepHandler();
        graggBulirschStoerIntegrator4.setInitialStepSize((double) (byte) -1);
        graggBulirschStoerIntegrator4.setInitialStepSize((double) 3);
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
        org.junit.Assert.assertNotNull(stepHandler56);
    }

    @Test
    public void test14080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14080");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator6.getStepHandler();
        double double16 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler17 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction18, (double) 1, (double) (byte) 10, (int) (short) 10);
        org.apache.commons.math.ode.StepHandler stepHandler23 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (byte) 10, (int) (short) 1, 52.0d);
        graggBulirschStoerIntegrator6.setOrderControl(0, (double) (byte) 1, (-1.0d));
        graggBulirschStoerIntegrator6.setInitialStepSize(0.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertNotNull(stepHandler23);
    }

    @Test
    public void test14081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14081");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator6.getStepHandler();
        double double16 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler17 = graggBulirschStoerIntegrator6.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction18, (double) 1, (double) (byte) 10, (int) (short) 10);
        org.apache.commons.math.ode.StepHandler stepHandler23 = graggBulirschStoerIntegrator6.getStepHandler();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) (byte) 10, (int) (short) 1, 52.0d);
        graggBulirschStoerIntegrator6.setOrderControl(0, (double) (byte) 1, (-1.0d));
        double double33 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setStepsizeControl(40.792156108742276d, 31.144823004794873d, (double) 1L, 3.0d);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test14082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14082");
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
        java.lang.String str23 = graggBulirschStoerIntegrator6.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction24, (double) '4', (double) 100L, (int) (short) 100);
        double double29 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator34 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (short) 0, 18.708286933869708d, (double) 1, (double) 0);
        double[] doubleArray39 = new double[] { '4', (byte) 10 };
        double[] doubleArray40 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator41 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray39, doubleArray40);
        double double42 = graggBulirschStoerIntegrator41.getCurrentStepStart();
        graggBulirschStoerIntegrator41.setStepsizeControl((double) 100, (double) 3, 0.0d, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        graggBulirschStoerIntegrator41.addSwitchingFunction(switchingFunction48, (double) (short) 10, (double) 2, (int) '#');
        double[] doubleArray57 = new double[] { '4', (byte) 10 };
        double[] doubleArray58 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator59 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray57, doubleArray58);
        double double60 = graggBulirschStoerIntegrator59.getCurrentStepStart();
        double[] doubleArray65 = new double[] { '4', (byte) 10 };
        double[] doubleArray66 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator67 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray65, doubleArray66);
        org.apache.commons.math.ode.StepHandler stepHandler68 = graggBulirschStoerIntegrator67.getStepHandler();
        graggBulirschStoerIntegrator59.setStepHandler(stepHandler68);
        graggBulirschStoerIntegrator41.setStepHandler(stepHandler68);
        graggBulirschStoerIntegrator34.setStepHandler(stepHandler68);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction72 = null;
        graggBulirschStoerIntegrator34.addSwitchingFunction(switchingFunction72, 35.0d, 0.0d, (int) (byte) 100);
        double double77 = graggBulirschStoerIntegrator34.getCurrentStepStart();
        graggBulirschStoerIntegrator34.setStepsizeControl((double) 10L, Double.NaN, (double) (byte) 0, (double) (short) 1);
        graggBulirschStoerIntegrator34.setOrderControl(1, (double) 10, (double) '4');
        double double87 = graggBulirschStoerIntegrator34.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler88 = graggBulirschStoerIntegrator34.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator89 = null;
        stepHandler88.handleStep(stepInterpolator89, false);
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler88);
        double double93 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str23, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[]");
        org.junit.Assert.assertNotNull(stepHandler68);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 0.0d + "'", double87 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler88);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 18.708286933869708d + "'", double93 == 18.708286933869708d);
    }

    @Test
    public void test14083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14083");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException7 = new org.apache.commons.math.FunctionEvaluationException((double) (byte) 1, "org.apache.commons.math.ode.DerivativeException: ");
        java.lang.Object[] objArray8 = functionEvaluationException7.getArguments();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException14 = new org.apache.commons.math.FunctionEvaluationException(100.0d, "hi!");
        org.apache.commons.math.ode.IntegratorException integratorException15 = new org.apache.commons.math.ode.IntegratorException((java.lang.Throwable) functionEvaluationException14);
        java.lang.Object[] objArray16 = integratorException15.getArguments();
        java.lang.Object[] objArray23 = new java.lang.Object[] { "hi!", (byte) 1, 10.0d, '4', (byte) 100 };
        org.apache.commons.math.MathException mathException24 = new org.apache.commons.math.MathException("", objArray23);
        org.apache.commons.math.MathException mathException25 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException24);
        org.apache.commons.math.ode.DerivativeException derivativeException26 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException24);
        double[] doubleArray31 = new double[] { '4', (byte) 10 };
        double[] doubleArray32 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator33 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray31, doubleArray32);
        double double34 = graggBulirschStoerIntegrator33.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator33.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        java.lang.String str40 = graggBulirschStoerIntegrator33.getName();
        double[] doubleArray46 = new double[] { '4', (byte) 10 };
        double[] doubleArray47 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator48 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray46, doubleArray47);
        double double49 = graggBulirschStoerIntegrator48.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator48.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double55 = graggBulirschStoerIntegrator48.getCurrentSignedStepsize();
        double double56 = graggBulirschStoerIntegrator48.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler57 = graggBulirschStoerIntegrator48.getStepHandler();
        double double58 = graggBulirschStoerIntegrator48.getMinStep();
        graggBulirschStoerIntegrator48.setOrderControl((int) (short) 1, (double) 0.0f, (double) 1.0f);
        double[] doubleArray67 = new double[] { '4', (byte) 10 };
        double[] doubleArray68 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator69 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray67, doubleArray68);
        double double70 = graggBulirschStoerIntegrator69.getCurrentStepStart();
        double[] doubleArray75 = new double[] { '4', (byte) 10 };
        double[] doubleArray76 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator77 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray75, doubleArray76);
        org.apache.commons.math.ode.StepHandler stepHandler78 = graggBulirschStoerIntegrator77.getStepHandler();
        graggBulirschStoerIntegrator69.setStepHandler(stepHandler78);
        java.lang.Object[] objArray80 = new java.lang.Object[] { integratorException15, derivativeException26, str40, '#', 0.0f, graggBulirschStoerIntegrator69 };
        org.apache.commons.math.ode.IntegratorException integratorException81 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.FunctionEvaluationException: ", objArray80);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException84 = new org.apache.commons.math.FunctionEvaluationException(0.0d, "hi!");
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException85 = new org.apache.commons.math.FunctionEvaluationException(Double.NaN, "", objArray80, (java.lang.Throwable) functionEvaluationException84);
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException86 = new org.apache.commons.math.FunctionEvaluationException((double) 1, "org.apache.commons.math.FunctionEvaluationException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.FunctionEvaluationException: ", objArray8, (java.lang.Throwable) functionEvaluationException85);
        java.lang.Throwable[] throwableArray87 = functionEvaluationException85.getSuppressed();
        double double88 = functionEvaluationException85.getArgument();
        java.lang.String str89 = functionEvaluationException85.getPattern();
        org.apache.commons.math.FunctionEvaluationException functionEvaluationException90 = new org.apache.commons.math.FunctionEvaluationException(10.0d, (java.lang.Throwable) functionEvaluationException85);
        java.lang.Throwable[] throwableArray91 = functionEvaluationException90.getSuppressed();
        org.apache.commons.math.ode.IntegratorException integratorException92 = new org.apache.commons.math.ode.IntegratorException("org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.ode.IntegratorException: hi!", (java.lang.Object[]) throwableArray91);
        org.apache.commons.math.MathException mathException93 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: org.apache.commons.math.MathException: org.apache.commons.math.ode.IntegratorException: Gragg-Bulirsch-Stoer", (java.lang.Object[]) throwableArray91);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[]");
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[]");
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[hi!, 1, 10.0, 4, 100]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[hi!, 1, 10.0, 4, 100]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[]");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 18.708286933869708d + "'", double34 == 18.708286933869708d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str40, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[]");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 18.708286933869708d + "'", double49 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 18.708286933869708d + "'", double55 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertNotNull(stepHandler57);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[]");
        org.junit.Assert.assertNotNull(stepHandler78);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(throwableArray87);
        org.junit.Assert.assertTrue(Double.isNaN(double88));
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertNotNull(throwableArray91);
    }

    @Test
    public void test14084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14084");
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator4 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) 1, 10.0d, (double) 100, 18.708286933869708d);
        double double5 = graggBulirschStoerIntegrator4.getCurrentSignedStepsize();
        java.lang.String str6 = graggBulirschStoerIntegrator4.getName();
        double double7 = graggBulirschStoerIntegrator4.getCurrentStepStart();
        graggBulirschStoerIntegrator4.setInterpolationControl(true, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 3.1622776601683795d + "'", double5 == 3.1622776601683795d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str6, "Gragg-Bulirsch-Stoer");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test14085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14085");
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
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (short) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction31 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction31, (double) '#', (double) (short) 10, (int) (short) 10);
        java.lang.String str36 = graggBulirschStoerIntegrator6.getName();
        graggBulirschStoerIntegrator6.setStabilityCheck(true, (int) '#', (int) '4', 31.810829150682025d);
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Gragg-Bulirsch-Stoer" + "'", str36, "Gragg-Bulirsch-Stoer");
    }

    @Test
    public void test14086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14086");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        graggBulirschStoerIntegrator6.setStepsizeControl((double) 0.0f, 0.0d, (double) 0.0f, (double) '#');
        double double13 = graggBulirschStoerIntegrator6.getCurrentSignedStepsize();
        double double14 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        graggBulirschStoerIntegrator6.setInterpolationControl(false, (int) (byte) 1);
        double double18 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double double19 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction20, 1.7320508075688772d, 7.691605673134587d, (int) (short) 10);
        org.apache.commons.math.ode.StepHandler stepHandler25 = graggBulirschStoerIntegrator6.getStepHandler();
        double double26 = graggBulirschStoerIntegrator6.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 18.708286933869708d + "'", double7 == 18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 18.708286933869708d + "'", double13 == 18.708286933869708d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 35.0d + "'", double26 == 35.0d);
    }

    @Test
    public void test14087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest28.test14087");
        double[] doubleArray4 = new double[] { '4', (byte) 10 };
        double[] doubleArray5 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator6 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray4, doubleArray5);
        double double7 = graggBulirschStoerIntegrator6.getCurrentStepStart();
        double[] doubleArray12 = new double[] { '4', (byte) 10 };
        double[] doubleArray13 = new double[] {};
        org.apache.commons.math.ode.GraggBulirschStoerIntegrator graggBulirschStoerIntegrator14 = new org.apache.commons.math.ode.GraggBulirschStoerIntegrator((double) (byte) 10, (double) '#', doubleArray12, doubleArray13);
        org.apache.commons.math.ode.StepHandler stepHandler15 = graggBulirschStoerIntegrator14.getStepHandler();
        graggBulirschStoerIntegrator6.setStepHandler(stepHandler15);
        graggBulirschStoerIntegrator6.setOrderControl((int) (short) -1, (double) (-1L), (double) 10);
        double double21 = graggBulirschStoerIntegrator6.getMinStep();
        graggBulirschStoerIntegrator6.setStepsizeControl(35.0d, (double) (byte) 1, (double) 10.0f, (double) 100L);
        double double27 = graggBulirschStoerIntegrator6.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        graggBulirschStoerIntegrator6.addSwitchingFunction(switchingFunction28, (double) 1.0f, 8.770179971434215d, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[52.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[]");
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }
}

