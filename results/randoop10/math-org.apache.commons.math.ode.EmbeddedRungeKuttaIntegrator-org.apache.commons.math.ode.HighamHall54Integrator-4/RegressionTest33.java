import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test16501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16501");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        double double26 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction28, (double) (short) 10, (double) (byte) -1, (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction33, (double) 0L, (double) (-1L), (int) 'a');
        highamHall54Integrator4.setInitialStepSize((double) 3);
        double double40 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction43 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction43, (-0.0d), (double) (byte) 100, 0);
        org.apache.commons.math.ode.StepHandler stepHandler48 = null;
        highamHall54Integrator4.setStepHandler(stepHandler48);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction50, (double) 10.0f, 100.0d, (int) (byte) -1);
        double double55 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double56 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9d + "'", double40 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
    }

    @Test
    public void test16502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16502");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, (double) 1.0f, (double) (byte) -1, 10);
        boolean boolean6 = switchingFunctionsHandler0.isEmpty();
        boolean boolean7 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        boolean boolean13 = switchingFunctionsHandler11.evaluateStep(stepInterpolator12);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        boolean boolean15 = switchingFunctionsHandler11.evaluateStep(stepInterpolator14);
        double[] doubleArray19 = null;
        double[] doubleArray26 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray19, doubleArray26);
        boolean boolean28 = switchingFunctionsHandler11.reset(100.0d, doubleArray19);
        double[] doubleArray35 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler36 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler36.evaluateStep(stepInterpolator37);
        double double39 = switchingFunctionsHandler36.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        switchingFunctionsHandler36.add(switchingFunction40, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler46 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator47 = null;
        boolean boolean48 = switchingFunctionsHandler46.evaluateStep(stepInterpolator47);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler50 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator51 = null;
        boolean boolean52 = switchingFunctionsHandler50.evaluateStep(stepInterpolator51);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator53 = null;
        boolean boolean54 = switchingFunctionsHandler50.evaluateStep(stepInterpolator53);
        double[] doubleArray60 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler50.stepAccepted((double) (byte) 1, doubleArray60);
        boolean boolean62 = switchingFunctionsHandler46.reset((double) (byte) 1, doubleArray60);
        boolean boolean63 = switchingFunctionsHandler36.reset((double) '4', doubleArray60);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray35, doubleArray60);
        boolean boolean65 = switchingFunctionsHandler11.reset(0.0d, doubleArray35);
        double[] doubleArray66 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) 10, doubleArray35, doubleArray66);
        boolean boolean68 = switchingFunctionsHandler0.reset((double) 5, doubleArray66);
        boolean boolean69 = switchingFunctionsHandler0.isEmpty();
        boolean boolean70 = switchingFunctionsHandler0.isEmpty();
        boolean boolean71 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test16503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16503");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction25, (double) (byte) 1, (double) (short) 10, 100);
        double double30 = highamHall54Integrator4.getCurrentStepStart();
        double double31 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth(Double.NaN);
        highamHall54Integrator4.setMinReduction(100.0d);
        highamHall54Integrator4.setInitialStepSize((double) 0L);
        double double38 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double38));
    }

    @Test
    public void test16504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16504");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1, 3.1622776601683795d, 12.823355189994377d, 10.198039027185569d);
    }

    @Test
    public void test16505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16505");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        java.lang.String str11 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, (double) 100L, (double) 0L, (int) (byte) 1);
        double double17 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, 0.2d, (double) 0L, (double) 0L);
        highamHall54Integrator22.setInitialStepSize((double) (byte) 100);
        double double25 = highamHall54Integrator22.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator22.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler26);
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator4.getStepHandler();
        boolean boolean29 = stepHandler28.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2d + "'", double25 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test16506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16506");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), 31.144823004794873d, (double) '4', (double) 2);
        double double5 = highamHall54Integrator4.getMaxStep();
        java.lang.String str6 = highamHall54Integrator4.getName();
        java.lang.String str7 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 31.144823004794873d + "'", double5 == 31.144823004794873d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
    }

    @Test
    public void test16507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16507");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler16);
        int int18 = highamHall54Integrator4.getOrder();
        java.lang.String str19 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler22 = null;
        highamHall54Integrator4.setStepHandler(stepHandler22);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
    }

    @Test
    public void test16508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16508");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str13 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, 0.0d, 3.0d, (int) ' ');
        double double19 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double20 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator4.getStepHandler();
        java.lang.String str22 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertNull(stepHandler21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
    }

    @Test
    public void test16509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16509");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        int int11 = highamHall54Integrator4.getOrder();
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getSafety();
        double double14 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNull(stepHandler15);
    }

    @Test
    public void test16510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16510");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        double double17 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str18 = highamHall54Integrator4.getName();
        double double19 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth((double) 3);
        int int22 = highamHall54Integrator4.getOrder();
        double double23 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(stepHandler15);
        org.junit.Assert.assertNull(stepHandler16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9d + "'", double23 == 0.9d);
    }

    @Test
    public void test16511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16511");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (-1.0d), (double) (short) 10, (int) (byte) 1);
        highamHall54Integrator4.setMaxGrowth((double) (-1));
        double double15 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, (double) (short) -1, (double) (short) 1, (int) '4');
        double double21 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator26.getStepHandler();
        highamHall54Integrator26.setInitialStepSize((double) 3);
        double double30 = highamHall54Integrator26.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator35.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler44 = null;
        highamHall54Integrator43.setStepHandler(stepHandler44);
        double double46 = highamHall54Integrator43.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler47 = null;
        highamHall54Integrator43.setStepHandler(stepHandler47);
        double double49 = highamHall54Integrator43.getMaxStep();
        double double50 = highamHall54Integrator43.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler56 = highamHall54Integrator55.getStepHandler();
        highamHall54Integrator43.setStepHandler(stepHandler56);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler63 = null;
        highamHall54Integrator62.setStepHandler(stepHandler63);
        double double65 = highamHall54Integrator62.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler66 = null;
        highamHall54Integrator62.setStepHandler(stepHandler66);
        double double68 = highamHall54Integrator62.getMaxStep();
        double double69 = highamHall54Integrator62.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler75 = highamHall54Integrator74.getStepHandler();
        highamHall54Integrator62.setStepHandler(stepHandler75);
        highamHall54Integrator43.setStepHandler(stepHandler75);
        highamHall54Integrator35.setStepHandler(stepHandler75);
        highamHall54Integrator26.setStepHandler(stepHandler75);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator80 = null;
        stepHandler75.handleStep(stepInterpolator80, true);
        highamHall54Integrator4.setStepHandler(stepHandler75);
        double double84 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + (-1.0d) + "'", double49 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler56);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler75);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
    }

    @Test
    public void test16512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16512");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 3);
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator13 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator13.getStepHandler();
        boolean boolean15 = stepHandler14.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        stepHandler14.handleStep(stepInterpolator16, false);
        highamHall54Integrator4.setStepHandler(stepHandler14);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction20, (double) (short) 100, (double) 0.0f, (int) '#');
        java.lang.String str25 = highamHall54Integrator4.getName();
        double double26 = highamHall54Integrator4.getMaxGrowth();
        double double27 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
    }

    @Test
    public void test16513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16513");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(24.947901585376336d, (double) (byte) 1, 55.3841974787333d, (-0.0d));
        int int5 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test16514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16514");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 5, 0.9d, 10.0d, 22.02271554554524d);
    }

    @Test
    public void test16515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16515");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) 1L, 0.0d, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) (byte) 100, Double.NaN, (int) (byte) 0);
        java.lang.String str11 = highamHall54Integrator4.getName();
        java.lang.String str12 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setSafety((double) 0.0f);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator19.getStepHandler();
        highamHall54Integrator19.setInitialStepSize((double) 3);
        double double23 = highamHall54Integrator19.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler29 = highamHall54Integrator28.getStepHandler();
        highamHall54Integrator28.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler37 = null;
        highamHall54Integrator36.setStepHandler(stepHandler37);
        double double39 = highamHall54Integrator36.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler40 = null;
        highamHall54Integrator36.setStepHandler(stepHandler40);
        double double42 = highamHall54Integrator36.getMaxStep();
        double double43 = highamHall54Integrator36.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler49 = highamHall54Integrator48.getStepHandler();
        highamHall54Integrator36.setStepHandler(stepHandler49);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler56 = null;
        highamHall54Integrator55.setStepHandler(stepHandler56);
        double double58 = highamHall54Integrator55.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler59 = null;
        highamHall54Integrator55.setStepHandler(stepHandler59);
        double double61 = highamHall54Integrator55.getMaxStep();
        double double62 = highamHall54Integrator55.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler68 = highamHall54Integrator67.getStepHandler();
        highamHall54Integrator55.setStepHandler(stepHandler68);
        highamHall54Integrator36.setStepHandler(stepHandler68);
        highamHall54Integrator28.setStepHandler(stepHandler68);
        highamHall54Integrator19.setStepHandler(stepHandler68);
        double double73 = highamHall54Integrator19.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler74 = highamHall54Integrator19.getStepHandler();
        stepHandler74.reset();
        boolean boolean76 = stepHandler74.requiresDenseOutput();
        boolean boolean77 = stepHandler74.requiresDenseOutput();
        stepHandler74.reset();
        highamHall54Integrator4.setStepHandler(stepHandler74);
        double double80 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler68);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertNotNull(stepHandler74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 1.0d + "'", double80 == 1.0d);
    }

    @Test
    public void test16516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16516");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str10 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 10);
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str14 = highamHall54Integrator4.getName();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
    }

    @Test
    public void test16517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16517");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler2.evaluateStep(stepInterpolator3);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler6.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler6.evaluateStep(stepInterpolator9);
        double[] doubleArray16 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler6.stepAccepted((double) (byte) 1, doubleArray16);
        boolean boolean18 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray16);
        double[] doubleArray24 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler25.evaluateStep(stepInterpolator26);
        double double28 = switchingFunctionsHandler25.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        switchingFunctionsHandler25.add(switchingFunction29, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler35 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler35.evaluateStep(stepInterpolator36);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        boolean boolean41 = switchingFunctionsHandler39.evaluateStep(stepInterpolator40);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        boolean boolean43 = switchingFunctionsHandler39.evaluateStep(stepInterpolator42);
        double[] doubleArray49 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler39.stepAccepted((double) (byte) 1, doubleArray49);
        boolean boolean51 = switchingFunctionsHandler35.reset((double) (byte) 1, doubleArray49);
        boolean boolean52 = switchingFunctionsHandler25.reset((double) '4', doubleArray49);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray24, doubleArray49);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (short) 1, doubleArray16, doubleArray24);
        highamHall54Integrator54.setInitialStepSize((double) 5);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        highamHall54Integrator54.addSwitchingFunction(switchingFunction57, 0.0d, (double) 10, (int) (short) 100);
        double double62 = highamHall54Integrator54.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler63 = highamHall54Integrator54.getStepHandler();
        double double64 = highamHall54Integrator54.getMinReduction();
        java.lang.String str65 = highamHall54Integrator54.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 0.2d + "'", double64 == 0.2d);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Higham-Hall 5(4)" + "'", str65, "Higham-Hall 5(4)");
    }

    @Test
    public void test16518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16518");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double double3 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction4 = null;
        switchingFunctionsHandler0.add(switchingFunction4, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        boolean boolean12 = switchingFunctionsHandler10.evaluateStep(stepInterpolator11);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler14 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator15 = null;
        boolean boolean16 = switchingFunctionsHandler14.evaluateStep(stepInterpolator15);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        boolean boolean18 = switchingFunctionsHandler14.evaluateStep(stepInterpolator17);
        double[] doubleArray24 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler14.stepAccepted((double) (byte) 1, doubleArray24);
        boolean boolean26 = switchingFunctionsHandler10.reset((double) (byte) 1, doubleArray24);
        boolean boolean27 = switchingFunctionsHandler0.reset((double) '4', doubleArray24);
        boolean boolean28 = switchingFunctionsHandler0.stop();
        boolean boolean29 = switchingFunctionsHandler0.stop();
        double double30 = switchingFunctionsHandler0.getEventTime();
        boolean boolean31 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        switchingFunctionsHandler0.add(switchingFunction32, (double) 1, (double) 1L, (-1));
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler40 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator41 = null;
        boolean boolean42 = switchingFunctionsHandler40.evaluateStep(stepInterpolator41);
        double double43 = switchingFunctionsHandler40.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction44 = null;
        switchingFunctionsHandler40.add(switchingFunction44, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler50 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator51 = null;
        boolean boolean52 = switchingFunctionsHandler50.evaluateStep(stepInterpolator51);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler54 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator55 = null;
        boolean boolean56 = switchingFunctionsHandler54.evaluateStep(stepInterpolator55);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator57 = null;
        boolean boolean58 = switchingFunctionsHandler54.evaluateStep(stepInterpolator57);
        double[] doubleArray64 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler54.stepAccepted((double) (byte) 1, doubleArray64);
        boolean boolean66 = switchingFunctionsHandler50.reset((double) (byte) 1, doubleArray64);
        boolean boolean67 = switchingFunctionsHandler40.reset((double) '4', doubleArray64);
        double[] doubleArray74 = new double[] { (-1), 0.0f, '#', (-1), 3, 0.0f };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator75 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 1.0f, doubleArray64, doubleArray74);
        boolean boolean76 = switchingFunctionsHandler0.reset(31.622776601683793d, doubleArray74);
        double double77 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction78 = null;
        switchingFunctionsHandler0.add(switchingFunction78, 31.144823004794873d, 97.0d, (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction83 = null;
        switchingFunctionsHandler0.add(switchingFunction83, 30.408967315912587d, 0.0d, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[-1.0, 0.0, 35.0, -1.0, 3.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
    }

    @Test
    public void test16519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16519");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, 100.0d, (double) (short) -1, (double) 10);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 0.0f, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator15 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, Double.NaN, (double) (-1), (double) 100.0f);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator20.getStepHandler();
        highamHall54Integrator20.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler24 = highamHall54Integrator20.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler30 = null;
        highamHall54Integrator29.setStepHandler(stepHandler30);
        double double32 = highamHall54Integrator29.getCurrentSignedStepsize();
        double double33 = highamHall54Integrator29.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler39 = highamHall54Integrator38.getStepHandler();
        highamHall54Integrator29.setStepHandler(stepHandler39);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator41 = null;
        stepHandler39.handleStep(stepInterpolator41, true);
        highamHall54Integrator20.setStepHandler(stepHandler39);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator45 = null;
        stepHandler39.handleStep(stepInterpolator45, true);
        highamHall54Integrator15.setStepHandler(stepHandler39);
        highamHall54Integrator4.setStepHandler(stepHandler39);
        org.apache.commons.math.ode.StepHandler stepHandler50 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertNotNull(stepHandler50);
    }

    @Test
    public void test16520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16520");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        double double26 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator4.getStepHandler();
        double double28 = highamHall54Integrator4.getMaxStep();
        double double29 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMinReduction((double) (-1));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 10, 10.0d, (double) 10, Double.NaN);
        highamHall54Integrator36.setSafety((double) '4');
        highamHall54Integrator36.setMaxGrowth(0.0d);
        double double41 = highamHall54Integrator36.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator36.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator43 = null;
        stepHandler42.handleStep(stepInterpolator43, false);
        highamHall54Integrator4.setStepHandler(stepHandler42);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator47 = null;
        stepHandler42.handleStep(stepInterpolator47, true);
        boolean boolean50 = stepHandler42.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.2d + "'", double41 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test16521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16521");
        double[] doubleArray8 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray11 = null;
        double[] doubleArray18 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray11, doubleArray18);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray8, doubleArray11);
        highamHall54Integrator20.setMaxGrowth((double) 1.0f);
        double double23 = highamHall54Integrator20.getMinReduction();
        double double24 = highamHall54Integrator20.getSafety();
        double double25 = highamHall54Integrator20.getCurrentSignedStepsize();
        java.lang.String str26 = highamHall54Integrator20.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator(97.0d, (double) 5, 0.4472135954999579d, (double) (-1));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler37 = highamHall54Integrator36.getStepHandler();
        highamHall54Integrator36.setInitialStepSize((double) 3);
        highamHall54Integrator36.setInitialStepSize((double) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator46.getStepHandler();
        boolean boolean48 = stepHandler47.requiresDenseOutput();
        highamHall54Integrator36.setStepHandler(stepHandler47);
        highamHall54Integrator31.setStepHandler(stepHandler47);
        double double51 = highamHall54Integrator31.getCurrentStepStart();
        int int52 = highamHall54Integrator31.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler58 = null;
        highamHall54Integrator57.setStepHandler(stepHandler58);
        double double60 = highamHall54Integrator57.getCurrentSignedStepsize();
        double double61 = highamHall54Integrator57.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler67 = highamHall54Integrator66.getStepHandler();
        highamHall54Integrator57.setStepHandler(stepHandler67);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator69 = null;
        stepHandler67.handleStep(stepInterpolator69, false);
        boolean boolean72 = stepHandler67.requiresDenseOutput();
        highamHall54Integrator31.setStepHandler(stepHandler67);
        highamHall54Integrator20.setStepHandler(stepHandler67);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9d + "'", double24 == 0.9d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Higham-Hall 5(4)" + "'", str26, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(stepHandler67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test16522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16522");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        highamHall54Integrator4.setMaxGrowth((double) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, (double) '4', 97.0d, (int) '#');
        highamHall54Integrator4.setMinReduction(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator4.getStepHandler();
        double double24 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction25, 0.0d, 0.0d, 2);
        java.lang.String str30 = highamHall54Integrator4.getName();
        double double31 = highamHall54Integrator4.getSafety();
        java.lang.String str32 = highamHall54Integrator4.getName();
        java.lang.String str33 = highamHall54Integrator4.getName();
        java.lang.String str34 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNull(stepHandler23);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Higham-Hall 5(4)" + "'", str30, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9d + "'", double31 == 0.9d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Higham-Hall 5(4)" + "'", str32, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Higham-Hall 5(4)" + "'", str33, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Higham-Hall 5(4)" + "'", str34, "Higham-Hall 5(4)");
    }

    @Test
    public void test16523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16523");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) -1, (-1.0d), (double) (short) 100, (double) 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator9 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        highamHall54Integrator9.setMinReduction((double) 10.0f);
        double double12 = highamHall54Integrator9.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler18 = null;
        highamHall54Integrator17.setStepHandler(stepHandler18);
        double double20 = highamHall54Integrator17.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler21 = null;
        highamHall54Integrator17.setStepHandler(stepHandler21);
        double double23 = highamHall54Integrator17.getMaxStep();
        double double24 = highamHall54Integrator17.getMinStep();
        double double25 = highamHall54Integrator17.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler31 = highamHall54Integrator30.getStepHandler();
        highamHall54Integrator30.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator30.getStepHandler();
        boolean boolean35 = stepHandler34.requiresDenseOutput();
        highamHall54Integrator17.setStepHandler(stepHandler34);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        stepHandler34.handleStep(stepInterpolator37, true);
        stepHandler34.reset();
        highamHall54Integrator9.setStepHandler(stepHandler34);
        stepHandler34.reset();
        highamHall54Integrator4.setStepHandler(stepHandler34);
        stepHandler34.reset();
        boolean boolean45 = stepHandler34.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test16524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16524");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 3.1622776601683795d, 5.477225575051661d, 56.568542494923804d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator9 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler10 = null;
        highamHall54Integrator9.setStepHandler(stepHandler10);
        double double12 = highamHall54Integrator9.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler13 = null;
        highamHall54Integrator9.setStepHandler(stepHandler13);
        double double15 = highamHall54Integrator9.getMaxStep();
        double double16 = highamHall54Integrator9.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator9.setStepHandler(stepHandler22);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler29 = null;
        highamHall54Integrator28.setStepHandler(stepHandler29);
        double double31 = highamHall54Integrator28.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler32 = null;
        highamHall54Integrator28.setStepHandler(stepHandler32);
        double double34 = highamHall54Integrator28.getMaxStep();
        double double35 = highamHall54Integrator28.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler41 = highamHall54Integrator40.getStepHandler();
        highamHall54Integrator28.setStepHandler(stepHandler41);
        highamHall54Integrator9.setStepHandler(stepHandler41);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler49 = null;
        highamHall54Integrator48.setStepHandler(stepHandler49);
        double double51 = highamHall54Integrator48.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler52 = null;
        highamHall54Integrator48.setStepHandler(stepHandler52);
        double double54 = highamHall54Integrator48.getMaxStep();
        double double55 = highamHall54Integrator48.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler61 = highamHall54Integrator60.getStepHandler();
        highamHall54Integrator48.setStepHandler(stepHandler61);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction63 = null;
        highamHall54Integrator48.addSwitchingFunction(switchingFunction63, (double) '4', 1.0d, (int) (short) -1);
        double double68 = highamHall54Integrator48.getMaxStep();
        double double69 = highamHall54Integrator48.getSafety();
        double double70 = highamHall54Integrator48.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler71 = highamHall54Integrator48.getStepHandler();
        boolean boolean72 = stepHandler71.requiresDenseOutput();
        highamHall54Integrator9.setStepHandler(stepHandler71);
        stepHandler71.reset();
        stepHandler71.reset();
        boolean boolean76 = stepHandler71.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator77 = null;
        stepHandler71.handleStep(stepInterpolator77, true);
        stepHandler71.reset();
        highamHall54Integrator4.setStepHandler(stepHandler71);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator82 = null;
        stepHandler71.handleStep(stepInterpolator82, false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 0.9d + "'", double69 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertNotNull(stepHandler71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test16525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16525");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) 100L, (double) (-1L), 0.2d);
    }

    @Test
    public void test16526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16526");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        boolean boolean3 = switchingFunctionsHandler0.stop();
        double[] doubleArray10 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        boolean boolean13 = switchingFunctionsHandler11.evaluateStep(stepInterpolator12);
        double double14 = switchingFunctionsHandler11.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        switchingFunctionsHandler11.add(switchingFunction15, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler21 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator22 = null;
        boolean boolean23 = switchingFunctionsHandler21.evaluateStep(stepInterpolator22);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler25.evaluateStep(stepInterpolator26);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator28 = null;
        boolean boolean29 = switchingFunctionsHandler25.evaluateStep(stepInterpolator28);
        double[] doubleArray35 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler25.stepAccepted((double) (byte) 1, doubleArray35);
        boolean boolean37 = switchingFunctionsHandler21.reset((double) (byte) 1, doubleArray35);
        boolean boolean38 = switchingFunctionsHandler11.reset((double) '4', doubleArray35);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray10, doubleArray35);
        switchingFunctionsHandler0.stepAccepted(1.0d, doubleArray10);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator41 = null;
        boolean boolean42 = switchingFunctionsHandler0.evaluateStep(stepInterpolator41);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator43 = null;
        boolean boolean44 = switchingFunctionsHandler0.evaluateStep(stepInterpolator43);
        double double45 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator46 = null;
        boolean boolean47 = switchingFunctionsHandler0.evaluateStep(stepInterpolator46);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator48 = null;
        boolean boolean49 = switchingFunctionsHandler0.evaluateStep(stepInterpolator48);
        boolean boolean50 = switchingFunctionsHandler0.stop();
        double double51 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
    }

    @Test
    public void test16527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16527");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 1.0f, (double) (short) 10, (double) (byte) 10);
        double double5 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        java.lang.String str7 = highamHall54Integrator4.getName();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 3.1622776601683795d + "'", double8 == 3.1622776601683795d);
    }

    @Test
    public void test16528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16528");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str8 = highamHall54Integrator4.getName();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str10 = highamHall54Integrator4.getName();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = null;
        highamHall54Integrator16.setStepHandler(stepHandler17);
        double double19 = highamHall54Integrator16.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler20 = null;
        highamHall54Integrator16.setStepHandler(stepHandler20);
        double double22 = highamHall54Integrator16.getMaxStep();
        double double23 = highamHall54Integrator16.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler29 = highamHall54Integrator28.getStepHandler();
        highamHall54Integrator16.setStepHandler(stepHandler29);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction31 = null;
        highamHall54Integrator16.addSwitchingFunction(switchingFunction31, (double) '4', 1.0d, (int) (short) -1);
        double double36 = highamHall54Integrator16.getMaxStep();
        double double37 = highamHall54Integrator16.getSafety();
        highamHall54Integrator16.setInitialStepSize(0.0d);
        double double40 = highamHall54Integrator16.getMinStep();
        double double41 = highamHall54Integrator16.getSafety();
        highamHall54Integrator16.setInitialStepSize((double) (byte) -1);
        highamHall54Integrator16.setMaxGrowth((double) 100L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 'a', (double) (short) 0, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction51 = null;
        highamHall54Integrator50.addSwitchingFunction(switchingFunction51, (double) 0, (double) 1L, (int) '4');
        int int56 = highamHall54Integrator50.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        highamHall54Integrator50.addSwitchingFunction(switchingFunction57, (double) (short) -1, (double) 1.0f, (int) 'a');
        double double62 = highamHall54Integrator50.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler63 = highamHall54Integrator50.getStepHandler();
        boolean boolean64 = stepHandler63.requiresDenseOutput();
        highamHall54Integrator16.setStepHandler(stepHandler63);
        boolean boolean66 = stepHandler63.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler63);
        double double68 = highamHall54Integrator4.getMaxStep();
        double double69 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + (-1.0d) + "'", double36 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.9d + "'", double37 == 0.9d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9d + "'", double41 == 0.9d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 31.144823004794873d + "'", double62 == 31.144823004794873d);
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + (-1.0d) + "'", double68 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 10.0d + "'", double69 == 10.0d);
    }

    @Test
    public void test16529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16529");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str12 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 0.0f);
        highamHall54Integrator4.setMinReduction((double) 100.0f);
        double double17 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double18 = highamHall54Integrator4.getMaxStep();
        double double19 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test16530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16530");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMaxStep();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test16531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16531");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str9 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) 1L);
        double double12 = highamHall54Integrator4.getMinReduction();
        java.lang.String str13 = highamHall54Integrator4.getName();
        java.lang.String str14 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
    }

    @Test
    public void test16532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16532");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler24 = null;
        highamHall54Integrator23.setStepHandler(stepHandler24);
        double double26 = highamHall54Integrator23.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = null;
        highamHall54Integrator23.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator23.getMaxStep();
        double double30 = highamHall54Integrator23.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator23.setStepHandler(stepHandler36);
        highamHall54Integrator4.setStepHandler(stepHandler36);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction39, (double) (-1L), (double) 1L, (-1));
        highamHall54Integrator4.setInitialStepSize((double) (short) 10);
        double double46 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction47, 10.198039027185569d, (double) 1, (int) (byte) 10);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9d + "'", double46 == 0.9d);
    }

    @Test
    public void test16533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16533");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 10, 10.0d, (double) 10, Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator10.getStepHandler();
        highamHall54Integrator10.setMinReduction(10.0d);
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator10.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler14);
        highamHall54Integrator4.setMinReduction(1.0d);
        double double18 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test16534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16534");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str12 = highamHall54Integrator4.getName();
        int int13 = highamHall54Integrator4.getOrder();
        java.lang.String str14 = highamHall54Integrator4.getName();
        double double15 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test16535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16535");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray4 = null;
        double[] doubleArray11 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray4, doubleArray11);
        switchingFunctionsHandler0.stepAccepted((double) 10L, doubleArray4);
        boolean boolean14 = switchingFunctionsHandler0.isEmpty();
        double double15 = switchingFunctionsHandler0.getEventTime();
        boolean boolean16 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        boolean boolean18 = switchingFunctionsHandler0.evaluateStep(stepInterpolator17);
        boolean boolean19 = switchingFunctionsHandler0.isEmpty();
        boolean boolean20 = switchingFunctionsHandler0.stop();
        boolean boolean21 = switchingFunctionsHandler0.isEmpty();
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        boolean boolean23 = switchingFunctionsHandler0.stop();
        boolean boolean24 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        boolean boolean32 = switchingFunctionsHandler30.evaluateStep(stepInterpolator31);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler34 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator35 = null;
        boolean boolean36 = switchingFunctionsHandler34.evaluateStep(stepInterpolator35);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler34.evaluateStep(stepInterpolator37);
        double[] doubleArray44 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler34.stepAccepted((double) (byte) 1, doubleArray44);
        boolean boolean46 = switchingFunctionsHandler30.reset((double) (byte) 1, doubleArray44);
        double[] doubleArray52 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler53 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator54 = null;
        boolean boolean55 = switchingFunctionsHandler53.evaluateStep(stepInterpolator54);
        double double56 = switchingFunctionsHandler53.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        switchingFunctionsHandler53.add(switchingFunction57, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler63 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator64 = null;
        boolean boolean65 = switchingFunctionsHandler63.evaluateStep(stepInterpolator64);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler67 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator68 = null;
        boolean boolean69 = switchingFunctionsHandler67.evaluateStep(stepInterpolator68);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator70 = null;
        boolean boolean71 = switchingFunctionsHandler67.evaluateStep(stepInterpolator70);
        double[] doubleArray77 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler67.stepAccepted((double) (byte) 1, doubleArray77);
        boolean boolean79 = switchingFunctionsHandler63.reset((double) (byte) 1, doubleArray77);
        boolean boolean80 = switchingFunctionsHandler53.reset((double) '4', doubleArray77);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator81 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray52, doubleArray77);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator82 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (short) 1, doubleArray44, doubleArray52);
        double[] doubleArray83 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) 100L, doubleArray44, doubleArray83);
        boolean boolean85 = switchingFunctionsHandler0.reset(5.656854249492381d, doubleArray44);
        boolean boolean86 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test16536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16536");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator13 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100L, 0.0d, (double) 100.0f, 0.0d);
        double double14 = highamHall54Integrator13.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator13.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler15);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction17, 100.0d, 0.0d, 2);
        highamHall54Integrator4.setMaxGrowth(0.0d);
        int int24 = highamHall54Integrator4.getOrder();
        double double25 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.2d + "'", double25 == 0.2d);
    }

    @Test
    public void test16537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16537");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double double3 = switchingFunctionsHandler0.getEventTime();
        boolean boolean4 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler6.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        boolean boolean12 = switchingFunctionsHandler10.evaluateStep(stepInterpolator11);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        boolean boolean14 = switchingFunctionsHandler10.evaluateStep(stepInterpolator13);
        double[] doubleArray20 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler10.stepAccepted((double) (byte) 1, doubleArray20);
        boolean boolean22 = switchingFunctionsHandler6.reset((double) (byte) 1, doubleArray20);
        double double23 = switchingFunctionsHandler6.getEventTime();
        double[] doubleArray27 = null;
        double[] doubleArray34 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray27, doubleArray34);
        boolean boolean36 = switchingFunctionsHandler6.reset((double) 10.0f, doubleArray34);
        boolean boolean37 = switchingFunctionsHandler0.reset((double) (byte) 10, doubleArray34);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        boolean boolean41 = switchingFunctionsHandler39.evaluateStep(stepInterpolator40);
        double double42 = switchingFunctionsHandler39.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction43 = null;
        switchingFunctionsHandler39.add(switchingFunction43, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler49 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator50 = null;
        boolean boolean51 = switchingFunctionsHandler49.evaluateStep(stepInterpolator50);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler53 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator54 = null;
        boolean boolean55 = switchingFunctionsHandler53.evaluateStep(stepInterpolator54);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator56 = null;
        boolean boolean57 = switchingFunctionsHandler53.evaluateStep(stepInterpolator56);
        double[] doubleArray63 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler53.stepAccepted((double) (byte) 1, doubleArray63);
        boolean boolean65 = switchingFunctionsHandler49.reset((double) (byte) 1, doubleArray63);
        boolean boolean66 = switchingFunctionsHandler39.reset((double) '4', doubleArray63);
        switchingFunctionsHandler0.stepAccepted((double) (short) 1, doubleArray63);
        double double68 = switchingFunctionsHandler0.getEventTime();
        boolean boolean69 = switchingFunctionsHandler0.isEmpty();
        double double70 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction71 = null;
        switchingFunctionsHandler0.add(switchingFunction71, (double) 1L, 0.0d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double70));
    }

    @Test
    public void test16538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16538");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int13 = highamHall54Integrator4.getOrder();
        int int14 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety(4.47213595499958d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test16539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16539");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray4 = null;
        double[] doubleArray11 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray4, doubleArray11);
        switchingFunctionsHandler0.stepAccepted((double) 10L, doubleArray4);
        double double14 = switchingFunctionsHandler0.getEventTime();
        boolean boolean15 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test16540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16540");
        double[] doubleArray2 = null;
        double[] doubleArray9 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray2, doubleArray9);
        java.lang.String str11 = highamHall54Integrator10.getName();
        int int12 = highamHall54Integrator10.getOrder();
        double double13 = highamHall54Integrator10.getMaxGrowth();
        java.lang.String str14 = highamHall54Integrator10.getName();
        double double15 = highamHall54Integrator10.getCurrentStepStart();
        double double16 = highamHall54Integrator10.getMaxStep();
        java.lang.String str17 = highamHall54Integrator10.getName();
        int int18 = highamHall54Integrator10.getOrder();
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test16541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16541");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        java.lang.String str8 = highamHall54Integrator4.getName();
        double double9 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMaxGrowth(97.0d);
        highamHall54Integrator4.setInitialStepSize((double) (short) 100);
        double double14 = highamHall54Integrator4.getMinReduction();
        double double15 = highamHall54Integrator4.getMaxGrowth();
        int int16 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 97.0d + "'", double15 == 97.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test16542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16542");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator13 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator13.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler14);
        double double16 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        int int19 = highamHall54Integrator4.getOrder();
        double double20 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 5 + "'", int19 == 5);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test16543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16543");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str12 = highamHall54Integrator4.getName();
        int int13 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction((double) (-1.0f));
        double double16 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMinReduction((-0.0d));
        double double19 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety(0.0d);
        double double22 = highamHall54Integrator4.getMinStep();
        double double23 = highamHall54Integrator4.getMaxStep();
        java.lang.String str24 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Higham-Hall 5(4)" + "'", str24, "Higham-Hall 5(4)");
    }

    @Test
    public void test16544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16544");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, 100.0d, (double) (short) -1, (double) 10);
        highamHall54Integrator4.setMaxGrowth((double) (byte) -1);
        double double7 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) (byte) 0, (double) 2, (int) (short) 100);
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int14 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety((double) '4');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction17, (double) (-1.0f), 32.0d, (int) (byte) -1);
        highamHall54Integrator4.setInitialStepSize(1.4142135623730951d);
        double double24 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test16545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16545");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        double double13 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) 0.0f);
        double double16 = highamHall54Integrator4.getMinStep();
        double double17 = highamHall54Integrator4.getCurrentStepStart();
        int int18 = highamHall54Integrator4.getOrder();
        double double19 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str20 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Higham-Hall 5(4)" + "'", str20, "Higham-Hall 5(4)");
    }

    @Test
    public void test16546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16546");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(26.8534961428265d, (double) ' ', 24.947901585376336d, (double) 0L);
    }

    @Test
    public void test16547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16547");
        double[] doubleArray7 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler8 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler8.evaluateStep(stepInterpolator9);
        double double11 = switchingFunctionsHandler8.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        switchingFunctionsHandler8.add(switchingFunction12, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler18 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        boolean boolean20 = switchingFunctionsHandler18.evaluateStep(stepInterpolator19);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        boolean boolean24 = switchingFunctionsHandler22.evaluateStep(stepInterpolator23);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        boolean boolean26 = switchingFunctionsHandler22.evaluateStep(stepInterpolator25);
        double[] doubleArray32 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler22.stepAccepted((double) (byte) 1, doubleArray32);
        boolean boolean34 = switchingFunctionsHandler18.reset((double) (byte) 1, doubleArray32);
        boolean boolean35 = switchingFunctionsHandler8.reset((double) '4', doubleArray32);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray7, doubleArray32);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler37 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        boolean boolean39 = switchingFunctionsHandler37.evaluateStep(stepInterpolator38);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        boolean boolean43 = switchingFunctionsHandler41.evaluateStep(stepInterpolator42);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator44 = null;
        boolean boolean45 = switchingFunctionsHandler41.evaluateStep(stepInterpolator44);
        double[] doubleArray51 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler41.stepAccepted((double) (byte) 1, doubleArray51);
        boolean boolean53 = switchingFunctionsHandler37.reset((double) (byte) 1, doubleArray51);
        double double54 = switchingFunctionsHandler37.getEventTime();
        double[] doubleArray58 = null;
        double[] doubleArray65 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray58, doubleArray65);
        boolean boolean67 = switchingFunctionsHandler37.reset((double) 10.0f, doubleArray65);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) 10.0f, doubleArray32, doubleArray65);
        org.apache.commons.math.ode.StepHandler stepHandler69 = highamHall54Integrator68.getStepHandler();
        java.lang.String str70 = highamHall54Integrator68.getName();
        highamHall54Integrator68.setInitialStepSize(9.486832980505138d);
        double double73 = highamHall54Integrator68.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(stepHandler69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Higham-Hall 5(4)" + "'", str70, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.0d + "'", double73 == 0.0d);
    }

    @Test
    public void test16548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16548");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        double double10 = highamHall54Integrator4.getSafety();
        java.lang.String str11 = highamHall54Integrator4.getName();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
    }

    @Test
    public void test16549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16549");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray8, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler0.reset(100.0d, doubleArray8);
        double[] doubleArray24 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler25.evaluateStep(stepInterpolator26);
        double double28 = switchingFunctionsHandler25.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        switchingFunctionsHandler25.add(switchingFunction29, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler35 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler35.evaluateStep(stepInterpolator36);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        boolean boolean41 = switchingFunctionsHandler39.evaluateStep(stepInterpolator40);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        boolean boolean43 = switchingFunctionsHandler39.evaluateStep(stepInterpolator42);
        double[] doubleArray49 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler39.stepAccepted((double) (byte) 1, doubleArray49);
        boolean boolean51 = switchingFunctionsHandler35.reset((double) (byte) 1, doubleArray49);
        boolean boolean52 = switchingFunctionsHandler25.reset((double) '4', doubleArray49);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray24, doubleArray49);
        boolean boolean54 = switchingFunctionsHandler0.reset(0.0d, doubleArray24);
        double double55 = switchingFunctionsHandler0.getEventTime();
        boolean boolean56 = switchingFunctionsHandler0.isEmpty();
        boolean boolean57 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator58 = null;
        boolean boolean59 = switchingFunctionsHandler0.evaluateStep(stepInterpolator58);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler61 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator62 = null;
        boolean boolean63 = switchingFunctionsHandler61.evaluateStep(stepInterpolator62);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction64 = null;
        switchingFunctionsHandler61.add(switchingFunction64, (double) 10, (double) 1.0f, (int) '4');
        boolean boolean69 = switchingFunctionsHandler61.stop();
        boolean boolean70 = switchingFunctionsHandler61.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction71 = null;
        switchingFunctionsHandler61.add(switchingFunction71, (double) (short) 10, (double) '#', (int) (short) -1);
        boolean boolean76 = switchingFunctionsHandler61.stop();
        double[] doubleArray80 = new double[] { ' ', 1 };
        boolean boolean81 = switchingFunctionsHandler61.reset((double) 10L, doubleArray80);
        boolean boolean82 = switchingFunctionsHandler0.reset((double) (short) 10, doubleArray80);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction83 = null;
        switchingFunctionsHandler0.add(switchingFunction83, 2.0d, 17.78279410038923d, (int) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction88 = null;
        switchingFunctionsHandler0.add(switchingFunction88, 52.0d, 32.0d, 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[32.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test16550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16550");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, 100.0d, (double) (short) -1, (double) 10);
        highamHall54Integrator4.setMaxGrowth((double) (byte) -1);
        double double7 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) (byte) 0, (double) 2, (int) (short) 100);
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int14 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety((double) '4');
        highamHall54Integrator4.setMaxGrowth((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test16551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16551");
        double[] doubleArray12 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray15 = null;
        double[] doubleArray22 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray15, doubleArray22);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray12, doubleArray15);
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, (double) (byte) -1, doubleArray12, doubleArray25);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator28 = null;
        boolean boolean29 = switchingFunctionsHandler27.evaluateStep(stepInterpolator28);
        double double30 = switchingFunctionsHandler27.getEventTime();
        boolean boolean31 = switchingFunctionsHandler27.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        switchingFunctionsHandler27.add(switchingFunction32, (double) 1, (-1.0d), (int) (short) 1);
        double[] doubleArray48 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray51 = null;
        double[] doubleArray58 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray51, doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray48, doubleArray51);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler61 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator62 = null;
        boolean boolean63 = switchingFunctionsHandler61.evaluateStep(stepInterpolator62);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler65 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator66 = null;
        boolean boolean67 = switchingFunctionsHandler65.evaluateStep(stepInterpolator66);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator68 = null;
        boolean boolean69 = switchingFunctionsHandler65.evaluateStep(stepInterpolator68);
        double[] doubleArray75 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler65.stepAccepted((double) (byte) 1, doubleArray75);
        boolean boolean77 = switchingFunctionsHandler61.reset((double) (byte) 1, doubleArray75);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (byte) 100, doubleArray48, doubleArray75);
        boolean boolean79 = switchingFunctionsHandler27.reset(0.0d, doubleArray48);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator80 = new org.apache.commons.math.ode.HighamHall54Integrator(97.0d, (double) (byte) 0, doubleArray12, doubleArray48);
        java.lang.String str81 = highamHall54Integrator80.getName();
        java.lang.String str82 = highamHall54Integrator80.getName();
        double double83 = highamHall54Integrator80.getCurrentSignedStepsize();
        double double84 = highamHall54Integrator80.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(doubleArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray75), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Higham-Hall 5(4)" + "'", str81, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "Higham-Hall 5(4)" + "'", str82, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 0.0d + "'", double83 == 0.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
    }

    @Test
    public void test16552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16552");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) 1L, 0.0d, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) (byte) 100, Double.NaN, (int) (byte) 0);
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test16553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16553");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        highamHall54Integrator4.setMaxGrowth((double) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, (double) '4', 97.0d, (int) '#');
        double double21 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator4.getStepHandler();
        double double23 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMinReduction((double) 100.0f);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
    }

    @Test
    public void test16554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16554");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler2.evaluateStep(stepInterpolator3);
        double double5 = switchingFunctionsHandler2.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        switchingFunctionsHandler2.add(switchingFunction6, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        boolean boolean14 = switchingFunctionsHandler12.evaluateStep(stepInterpolator13);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler16 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        boolean boolean18 = switchingFunctionsHandler16.evaluateStep(stepInterpolator17);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        boolean boolean20 = switchingFunctionsHandler16.evaluateStep(stepInterpolator19);
        double[] doubleArray26 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler16.stepAccepted((double) (byte) 1, doubleArray26);
        boolean boolean28 = switchingFunctionsHandler12.reset((double) (byte) 1, doubleArray26);
        boolean boolean29 = switchingFunctionsHandler2.reset((double) '4', doubleArray26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        boolean boolean32 = switchingFunctionsHandler30.evaluateStep(stepInterpolator31);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler34 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator35 = null;
        boolean boolean36 = switchingFunctionsHandler34.evaluateStep(stepInterpolator35);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler34.evaluateStep(stepInterpolator37);
        double[] doubleArray44 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler34.stepAccepted((double) (byte) 1, doubleArray44);
        boolean boolean46 = switchingFunctionsHandler30.reset((double) (byte) 1, doubleArray44);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, 0.0d, doubleArray26, doubleArray44);
        double double48 = highamHall54Integrator47.getMinStep();
        highamHall54Integrator47.setSafety((double) (byte) 10);
        double double51 = highamHall54Integrator47.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        highamHall54Integrator47.addSwitchingFunction(switchingFunction52, (double) (short) 100, (double) (-1), (int) (byte) 0);
        java.lang.String str57 = highamHall54Integrator47.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Higham-Hall 5(4)" + "'", str57, "Higham-Hall 5(4)");
    }

    @Test
    public void test16555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16555");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', 1.0d, (double) (short) 1, 0.2d);
        double double5 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMinReduction((double) (byte) 100);
        double double8 = highamHall54Integrator4.getMinReduction();
        int int9 = highamHall54Integrator4.getOrder();
        java.lang.String str10 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
    }

    @Test
    public void test16556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16556");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 3);
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        highamHall54Integrator4.setInitialStepSize((double) 10.0f);
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getMaxStep();
        java.lang.String str14 = highamHall54Integrator4.getName();
        double double15 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test16557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16557");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray8, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler0.reset(100.0d, doubleArray8);
        double[] doubleArray24 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler25.evaluateStep(stepInterpolator26);
        double double28 = switchingFunctionsHandler25.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        switchingFunctionsHandler25.add(switchingFunction29, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler35 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler35.evaluateStep(stepInterpolator36);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        boolean boolean41 = switchingFunctionsHandler39.evaluateStep(stepInterpolator40);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        boolean boolean43 = switchingFunctionsHandler39.evaluateStep(stepInterpolator42);
        double[] doubleArray49 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler39.stepAccepted((double) (byte) 1, doubleArray49);
        boolean boolean51 = switchingFunctionsHandler35.reset((double) (byte) 1, doubleArray49);
        boolean boolean52 = switchingFunctionsHandler25.reset((double) '4', doubleArray49);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray24, doubleArray49);
        boolean boolean54 = switchingFunctionsHandler0.reset(0.0d, doubleArray24);
        double double55 = switchingFunctionsHandler0.getEventTime();
        boolean boolean56 = switchingFunctionsHandler0.isEmpty();
        boolean boolean57 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray61 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler62 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator63 = null;
        boolean boolean64 = switchingFunctionsHandler62.evaluateStep(stepInterpolator63);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler66 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator67 = null;
        boolean boolean68 = switchingFunctionsHandler66.evaluateStep(stepInterpolator67);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator69 = null;
        boolean boolean70 = switchingFunctionsHandler66.evaluateStep(stepInterpolator69);
        double[] doubleArray76 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler66.stepAccepted((double) (byte) 1, doubleArray76);
        boolean boolean78 = switchingFunctionsHandler62.reset((double) (byte) 1, doubleArray76);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator79 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) (-1), doubleArray61, doubleArray76);
        boolean boolean80 = switchingFunctionsHandler0.reset((double) (short) -1, doubleArray76);
        double double81 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction82 = null;
        switchingFunctionsHandler0.add(switchingFunction82, 9.486832980505138d, (double) 0.0f, (int) 'a');
        boolean boolean87 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test16558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16558");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, 0.0d, (double) 1, (double) 10.0f);
        int int5 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test16559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16559");
        double[] doubleArray8 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray11 = null;
        double[] doubleArray18 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray11, doubleArray18);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray8, doubleArray11);
        highamHall54Integrator20.setMaxGrowth((double) 1.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        highamHall54Integrator20.addSwitchingFunction(switchingFunction23, (double) (byte) 0, (double) 1, (int) (byte) 0);
        double double28 = highamHall54Integrator20.getMinReduction();
        double double29 = highamHall54Integrator20.getMinReduction();
        double double30 = highamHall54Integrator20.getSafety();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.2d + "'", double28 == 0.2d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.9d + "'", double30 == 0.9d);
    }

    @Test
    public void test16560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16560");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler24 = null;
        highamHall54Integrator23.setStepHandler(stepHandler24);
        double double26 = highamHall54Integrator23.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = null;
        highamHall54Integrator23.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator23.getMaxStep();
        double double30 = highamHall54Integrator23.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator23.setStepHandler(stepHandler36);
        highamHall54Integrator4.setStepHandler(stepHandler36);
        double double39 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler40 = highamHall54Integrator4.getStepHandler();
        java.lang.String str41 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction42, (double) '4', 0.4472135954999579d, 100);
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator4.getStepHandler();
        double double48 = highamHall54Integrator4.getSafety();
        java.lang.String str49 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Higham-Hall 5(4)" + "'", str41, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.9d + "'", double48 == 0.9d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Higham-Hall 5(4)" + "'", str49, "Higham-Hall 5(4)");
    }

    @Test
    public void test16561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16561");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) (-1.0f), (double) (byte) 0, (int) (short) -1);
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int15 = highamHall54Integrator4.getOrder();
        double double16 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize(0.2d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9d + "'", double16 == 0.9d);
    }

    @Test
    public void test16562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16562");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 3);
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator13 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator13.getStepHandler();
        highamHall54Integrator13.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler22 = null;
        highamHall54Integrator21.setStepHandler(stepHandler22);
        double double24 = highamHall54Integrator21.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler25 = null;
        highamHall54Integrator21.setStepHandler(stepHandler25);
        double double27 = highamHall54Integrator21.getMaxStep();
        double double28 = highamHall54Integrator21.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator33.getStepHandler();
        highamHall54Integrator21.setStepHandler(stepHandler34);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler41 = null;
        highamHall54Integrator40.setStepHandler(stepHandler41);
        double double43 = highamHall54Integrator40.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler44 = null;
        highamHall54Integrator40.setStepHandler(stepHandler44);
        double double46 = highamHall54Integrator40.getMaxStep();
        double double47 = highamHall54Integrator40.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler53 = highamHall54Integrator52.getStepHandler();
        highamHall54Integrator40.setStepHandler(stepHandler53);
        highamHall54Integrator21.setStepHandler(stepHandler53);
        highamHall54Integrator13.setStepHandler(stepHandler53);
        highamHall54Integrator4.setStepHandler(stepHandler53);
        double double58 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str59 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setSafety((double) 1.0f);
        double double62 = highamHall54Integrator4.getMaxGrowth();
        double double63 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction64 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction64, 9.924141172814958d, 97.0d, (int) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler69 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler53);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Higham-Hall 5(4)" + "'", str59, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertNotNull(stepHandler69);
    }

    @Test
    public void test16563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16563");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', (double) (short) 1, (double) 100.0f, (double) 2);
        int int5 = highamHall54Integrator4.getOrder();
        double double6 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 100);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        highamHall54Integrator14.setMinReduction((double) 10.0f);
        double double17 = highamHall54Integrator14.getCurrentSignedStepsize();
        java.lang.String str18 = highamHall54Integrator14.getName();
        java.lang.String str19 = highamHall54Integrator14.getName();
        highamHall54Integrator14.setMaxGrowth((double) 1L);
        highamHall54Integrator14.setMaxGrowth((double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler24 = highamHall54Integrator14.getStepHandler();
        highamHall54Integrator14.setMaxGrowth(0.0d);
        double double27 = highamHall54Integrator14.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator14.getStepHandler();
        boolean boolean29 = stepHandler28.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler28);
        boolean boolean31 = stepHandler28.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test16564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16564");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler8 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler8.evaluateStep(stepInterpolator9);
        double double11 = switchingFunctionsHandler8.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        switchingFunctionsHandler8.add(switchingFunction12, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler18 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        boolean boolean20 = switchingFunctionsHandler18.evaluateStep(stepInterpolator19);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        boolean boolean24 = switchingFunctionsHandler22.evaluateStep(stepInterpolator23);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        boolean boolean26 = switchingFunctionsHandler22.evaluateStep(stepInterpolator25);
        double[] doubleArray32 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler22.stepAccepted((double) (byte) 1, doubleArray32);
        boolean boolean34 = switchingFunctionsHandler18.reset((double) (byte) 1, doubleArray32);
        boolean boolean35 = switchingFunctionsHandler8.reset((double) '4', doubleArray32);
        double[] doubleArray42 = new double[] { (-1), 0.0f, '#', (-1), 3, 0.0f };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 1.0f, doubleArray32, doubleArray42);
        double[] doubleArray46 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler47 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator48 = null;
        boolean boolean49 = switchingFunctionsHandler47.evaluateStep(stepInterpolator48);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator52 = null;
        boolean boolean53 = switchingFunctionsHandler51.evaluateStep(stepInterpolator52);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator54 = null;
        boolean boolean55 = switchingFunctionsHandler51.evaluateStep(stepInterpolator54);
        double[] doubleArray61 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler51.stepAccepted((double) (byte) 1, doubleArray61);
        boolean boolean63 = switchingFunctionsHandler47.reset((double) (byte) 1, doubleArray61);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) (-1), doubleArray46, doubleArray61);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator(0.2d, (double) (short) 0, doubleArray32, doubleArray61);
        switchingFunctionsHandler0.stepAccepted(Double.NaN, doubleArray61);
        boolean boolean67 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction68 = null;
        switchingFunctionsHandler0.add(switchingFunction68, 2.449489742783178d, 0.4472135954999579d, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[-1.0, 0.0, 35.0, -1.0, 3.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test16565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16565");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize(1.4142135623730951d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNull(stepHandler12);
    }

    @Test
    public void test16566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16566");
        double[] doubleArray7 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler8 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler8.evaluateStep(stepInterpolator9);
        double double11 = switchingFunctionsHandler8.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        switchingFunctionsHandler8.add(switchingFunction12, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler18 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        boolean boolean20 = switchingFunctionsHandler18.evaluateStep(stepInterpolator19);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        boolean boolean24 = switchingFunctionsHandler22.evaluateStep(stepInterpolator23);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        boolean boolean26 = switchingFunctionsHandler22.evaluateStep(stepInterpolator25);
        double[] doubleArray32 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler22.stepAccepted((double) (byte) 1, doubleArray32);
        boolean boolean34 = switchingFunctionsHandler18.reset((double) (byte) 1, doubleArray32);
        boolean boolean35 = switchingFunctionsHandler8.reset((double) '4', doubleArray32);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray7, doubleArray32);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler37 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        boolean boolean39 = switchingFunctionsHandler37.evaluateStep(stepInterpolator38);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        boolean boolean43 = switchingFunctionsHandler41.evaluateStep(stepInterpolator42);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator44 = null;
        boolean boolean45 = switchingFunctionsHandler41.evaluateStep(stepInterpolator44);
        double[] doubleArray51 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler41.stepAccepted((double) (byte) 1, doubleArray51);
        boolean boolean53 = switchingFunctionsHandler37.reset((double) (byte) 1, doubleArray51);
        double double54 = switchingFunctionsHandler37.getEventTime();
        double[] doubleArray58 = null;
        double[] doubleArray65 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray58, doubleArray65);
        boolean boolean67 = switchingFunctionsHandler37.reset((double) 10.0f, doubleArray65);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0, (double) 10.0f, doubleArray32, doubleArray65);
        java.lang.String str69 = highamHall54Integrator68.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction70 = null;
        highamHall54Integrator68.addSwitchingFunction(switchingFunction70, (double) (short) 100, (double) 1L, (int) 'a');
        double double75 = highamHall54Integrator68.getCurrentSignedStepsize();
        highamHall54Integrator68.setSafety((double) '#');
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Higham-Hall 5(4)" + "'", str69, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 0.0d + "'", double75 == 0.0d);
    }

    @Test
    public void test16567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16567");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler16);
        int int18 = highamHall54Integrator4.getOrder();
        java.lang.String str19 = highamHall54Integrator4.getName();
        java.lang.String str20 = highamHall54Integrator4.getName();
        double double21 = highamHall54Integrator4.getCurrentStepStart();
        int int22 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator27.getStepHandler();
        highamHall54Integrator27.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler31 = highamHall54Integrator27.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler37 = null;
        highamHall54Integrator36.setStepHandler(stepHandler37);
        double double39 = highamHall54Integrator36.getCurrentSignedStepsize();
        double double40 = highamHall54Integrator36.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler46 = highamHall54Integrator45.getStepHandler();
        highamHall54Integrator36.setStepHandler(stepHandler46);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator48 = null;
        stepHandler46.handleStep(stepInterpolator48, true);
        highamHall54Integrator27.setStepHandler(stepHandler46);
        stepHandler46.reset();
        highamHall54Integrator4.setStepHandler(stepHandler46);
        java.lang.String str54 = highamHall54Integrator4.getName();
        double double55 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Higham-Hall 5(4)" + "'", str20, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Higham-Hall 5(4)" + "'", str54, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double55));
    }

    @Test
    public void test16568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16568");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        int int10 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, 9.848857801796104d, 0.0d, 5);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, (double) (short) 10, 59.16079783099616d, (int) 'a');
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test16569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16569");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 3);
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 5);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = null;
        highamHall54Integrator16.setStepHandler(stepHandler17);
        double double19 = highamHall54Integrator16.getCurrentSignedStepsize();
        double double20 = highamHall54Integrator16.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator25.getStepHandler();
        highamHall54Integrator16.setStepHandler(stepHandler26);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator28 = null;
        stepHandler26.handleStep(stepInterpolator28, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        stepHandler26.handleStep(stepInterpolator31, false);
        highamHall54Integrator4.setStepHandler(stepHandler26);
        stepHandler26.reset();
        stepHandler26.reset();
        stepHandler26.reset();
        stepHandler26.reset();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(stepHandler26);
    }

    @Test
    public void test16570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16570");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str8 = highamHall54Integrator4.getName();
        double double9 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator14.getStepHandler();
        highamHall54Integrator14.setMinReduction(10.0d);
        int int18 = highamHall54Integrator14.getOrder();
        java.lang.String str19 = highamHall54Integrator14.getName();
        double double20 = highamHall54Integrator14.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        highamHall54Integrator14.addSwitchingFunction(switchingFunction21, (double) (byte) 10, (double) (short) -1, (int) '4');
        double double26 = highamHall54Integrator14.getMinReduction();
        double double27 = highamHall54Integrator14.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator14.getStepHandler();
        boolean boolean29 = stepHandler28.requiresDenseOutput();
        boolean boolean30 = stepHandler28.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler28);
        boolean boolean32 = stepHandler28.requiresDenseOutput();
        boolean boolean33 = stepHandler28.requiresDenseOutput();
        boolean boolean34 = stepHandler28.requiresDenseOutput();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test16571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16571");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 100.0f, (double) 10L, (int) 'a');
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety((double) 1L);
        java.lang.String str16 = highamHall54Integrator4.getName();
        double double17 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str18 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator4.getStepHandler();
        java.lang.String str20 = highamHall54Integrator4.getName();
        double double21 = highamHall54Integrator4.getMaxStep();
        double double22 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Higham-Hall 5(4)" + "'", str20, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
    }

    @Test
    public void test16572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16572");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) 1L, 2.0d, 1.0d);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        boolean boolean9 = switchingFunctionsHandler7.evaluateStep(stepInterpolator8);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        boolean boolean11 = switchingFunctionsHandler7.evaluateStep(stepInterpolator10);
        double[] doubleArray17 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler7.stepAccepted((double) (byte) 1, doubleArray17);
        double[] doubleArray21 = null;
        double[] doubleArray28 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray21, doubleArray28);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100.0f, (double) 10L, doubleArray17, doubleArray21);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        double double37 = highamHall54Integrator35.getMinStep();
        double double38 = highamHall54Integrator35.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler39 = highamHall54Integrator35.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        stepHandler39.handleStep(stepInterpolator40, false);
        boolean boolean43 = stepHandler39.requiresDenseOutput();
        highamHall54Integrator30.setStepHandler(stepHandler39);
        stepHandler39.reset();
        stepHandler39.reset();
        boolean boolean47 = stepHandler39.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler39);
        int int49 = highamHall54Integrator4.getOrder();
        double double50 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.9d + "'", double50 == 0.9d);
    }

    @Test
    public void test16573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16573");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (short) 1, 97.0d, (-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator9 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        highamHall54Integrator9.setMinReduction((double) 10.0f);
        double double12 = highamHall54Integrator9.getCurrentSignedStepsize();
        java.lang.String str13 = highamHall54Integrator9.getName();
        java.lang.String str14 = highamHall54Integrator9.getName();
        highamHall54Integrator9.setMaxGrowth((double) 1L);
        highamHall54Integrator9.setMaxGrowth((double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator9.getStepHandler();
        highamHall54Integrator9.setMaxGrowth(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator9.getStepHandler();
        boolean boolean23 = stepHandler22.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler22);
        org.apache.commons.math.ode.StepHandler stepHandler25 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertNotNull(stepHandler26);
    }

    @Test
    public void test16574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16574");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100.0f, (double) (short) 100, 100.0d, (double) 2);
        highamHall54Integrator4.setMinReduction(100.0d);
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test16575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16575");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 100, 31.622776601683793d, 3.1622776601683795d, (double) 100);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test16576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16576");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        double double26 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator4.getStepHandler();
        double double28 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction31 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction31, 0.0d, (double) 1.0f, (int) '4');
        java.lang.String str36 = highamHall54Integrator4.getName();
        double double37 = highamHall54Integrator4.getSafety();
        java.lang.String str38 = highamHall54Integrator4.getName();
        java.lang.String str39 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction40, (double) (short) 100, 0.0d, (int) (byte) 10);
        highamHall54Integrator4.setMaxGrowth((double) (short) 0);
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator48 = null;
        stepHandler47.handleStep(stepInterpolator48, true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Higham-Hall 5(4)" + "'", str36, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 0.9d + "'", double37 == 0.9d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Higham-Hall 5(4)" + "'", str38, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Higham-Hall 5(4)" + "'", str39, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler47);
    }

    @Test
    public void test16577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16577");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize(1.0d);
        int int12 = highamHall54Integrator4.getOrder();
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test16578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16578");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double13 = highamHall54Integrator4.getSafety();
        double double14 = highamHall54Integrator4.getMinStep();
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        double double16 = highamHall54Integrator4.getSafety();
        java.lang.String str17 = highamHall54Integrator4.getName();
        double double18 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.9d + "'", double16 == 0.9d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test16579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16579");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        java.lang.String str7 = highamHall54Integrator4.getName();
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, 0.4472135954999579d, 0.4472135954999579d, (int) (byte) 10);
        highamHall54Integrator4.setMaxGrowth(9.924141172814958d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test16580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16580");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator13 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler14 = null;
        highamHall54Integrator13.setStepHandler(stepHandler14);
        double double16 = highamHall54Integrator13.getCurrentSignedStepsize();
        double double17 = highamHall54Integrator13.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator22.getStepHandler();
        highamHall54Integrator13.setStepHandler(stepHandler23);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        stepHandler23.handleStep(stepInterpolator25, true);
        highamHall54Integrator4.setStepHandler(stepHandler23);
        stepHandler23.reset();
        stepHandler23.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        stepHandler23.handleStep(stepInterpolator31, true);
        boolean boolean34 = stepHandler23.requiresDenseOutput();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test16581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16581");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        boolean boolean5 = switchingFunctionsHandler0.stop();
        double double6 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray16 = new double[] { 1, (short) 100, 1.0f, 10.0d, (byte) 0, (short) 100 };
        double[] doubleArray27 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray30 = null;
        double[] doubleArray37 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray30, doubleArray37);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray27, doubleArray30);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler40 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator41 = null;
        boolean boolean42 = switchingFunctionsHandler40.evaluateStep(stepInterpolator41);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler44 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator45 = null;
        boolean boolean46 = switchingFunctionsHandler44.evaluateStep(stepInterpolator45);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator47 = null;
        boolean boolean48 = switchingFunctionsHandler44.evaluateStep(stepInterpolator47);
        double[] doubleArray54 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler44.stepAccepted((double) (byte) 1, doubleArray54);
        boolean boolean56 = switchingFunctionsHandler40.reset((double) (byte) 1, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (byte) 100, doubleArray27, doubleArray54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, (double) (byte) 1, doubleArray16, doubleArray27);
        boolean boolean59 = switchingFunctionsHandler0.reset((double) 3, doubleArray16);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator60 = null;
        boolean boolean61 = switchingFunctionsHandler0.evaluateStep(stepInterpolator60);
        boolean boolean62 = switchingFunctionsHandler0.stop();
        boolean boolean63 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray65 = null;
        boolean boolean66 = switchingFunctionsHandler0.reset((double) (byte) -1, doubleArray65);
        boolean boolean67 = switchingFunctionsHandler0.isEmpty();
        boolean boolean68 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 100.0, 1.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test16582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16582");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) 0, 0.9d, 0.0d);
        highamHall54Integrator4.setInitialStepSize(3.0d);
        java.lang.String str7 = highamHall54Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
    }

    @Test
    public void test16583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16583");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        boolean boolean6 = switchingFunctionsHandler4.evaluateStep(stepInterpolator5);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler8 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler8.evaluateStep(stepInterpolator9);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        boolean boolean12 = switchingFunctionsHandler8.evaluateStep(stepInterpolator11);
        double[] doubleArray18 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler8.stepAccepted((double) (byte) 1, doubleArray18);
        boolean boolean20 = switchingFunctionsHandler4.reset((double) (byte) 1, doubleArray18);
        double[] doubleArray26 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator28 = null;
        boolean boolean29 = switchingFunctionsHandler27.evaluateStep(stepInterpolator28);
        double double30 = switchingFunctionsHandler27.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction31 = null;
        switchingFunctionsHandler27.add(switchingFunction31, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler37 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        boolean boolean39 = switchingFunctionsHandler37.evaluateStep(stepInterpolator38);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        boolean boolean43 = switchingFunctionsHandler41.evaluateStep(stepInterpolator42);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator44 = null;
        boolean boolean45 = switchingFunctionsHandler41.evaluateStep(stepInterpolator44);
        double[] doubleArray51 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler41.stepAccepted((double) (byte) 1, doubleArray51);
        boolean boolean53 = switchingFunctionsHandler37.reset((double) (byte) 1, doubleArray51);
        boolean boolean54 = switchingFunctionsHandler27.reset((double) '4', doubleArray51);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray26, doubleArray51);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (short) 1, doubleArray18, doubleArray26);
        double[] doubleArray57 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) 100L, doubleArray18, doubleArray57);
        double double59 = highamHall54Integrator58.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction60 = null;
        highamHall54Integrator58.addSwitchingFunction(switchingFunction60, (double) (short) 0, (double) 0, (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction65 = null;
        highamHall54Integrator58.addSwitchingFunction(switchingFunction65, 10.0d, 5.477225575051661d, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.2d + "'", double59 == 0.2d);
    }

    @Test
    public void test16584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16584");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray13 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray16 = null;
        double[] doubleArray23 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray16, doubleArray23);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray13, doubleArray16);
        double[] doubleArray26 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, (double) (byte) -1, doubleArray13, doubleArray26);
        switchingFunctionsHandler0.stepAccepted(9.848857801796104d, doubleArray13);
        double double29 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        boolean boolean31 = switchingFunctionsHandler0.evaluateStep(stepInterpolator30);
        double[] doubleArray35 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler36 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler36.evaluateStep(stepInterpolator37);
        double double39 = switchingFunctionsHandler36.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        switchingFunctionsHandler36.add(switchingFunction40, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler46 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator47 = null;
        boolean boolean48 = switchingFunctionsHandler46.evaluateStep(stepInterpolator47);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler50 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator51 = null;
        boolean boolean52 = switchingFunctionsHandler50.evaluateStep(stepInterpolator51);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator53 = null;
        boolean boolean54 = switchingFunctionsHandler50.evaluateStep(stepInterpolator53);
        double[] doubleArray60 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler50.stepAccepted((double) (byte) 1, doubleArray60);
        boolean boolean62 = switchingFunctionsHandler46.reset((double) (byte) 1, doubleArray60);
        boolean boolean63 = switchingFunctionsHandler36.reset((double) '4', doubleArray60);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (-1), doubleArray35, doubleArray60);
        switchingFunctionsHandler0.stepAccepted(2.106706162744047d, doubleArray60);
        boolean boolean66 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[]");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test16585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16585");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler13 = null;
        highamHall54Integrator12.setStepHandler(stepHandler13);
        double double15 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler16 = null;
        highamHall54Integrator12.setStepHandler(stepHandler16);
        double double18 = highamHall54Integrator12.getMaxStep();
        double double19 = highamHall54Integrator12.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler25 = highamHall54Integrator24.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler25);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler32 = null;
        highamHall54Integrator31.setStepHandler(stepHandler32);
        double double34 = highamHall54Integrator31.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler35 = null;
        highamHall54Integrator31.setStepHandler(stepHandler35);
        double double37 = highamHall54Integrator31.getMaxStep();
        double double38 = highamHall54Integrator31.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler44 = highamHall54Integrator43.getStepHandler();
        highamHall54Integrator31.setStepHandler(stepHandler44);
        highamHall54Integrator12.setStepHandler(stepHandler44);
        highamHall54Integrator4.setStepHandler(stepHandler44);
        double double48 = highamHall54Integrator4.getCurrentStepStart();
        double double49 = highamHall54Integrator4.getMinStep();
        double double50 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize((double) ' ');
        highamHall54Integrator4.setMaxGrowth((double) 3);
        highamHall54Integrator4.setInitialStepSize(10.0d);
        double double57 = highamHall54Integrator4.getMaxStep();
        java.lang.String str58 = highamHall54Integrator4.getName();
        int int59 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction60 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction60, 7.211102550927978d, (double) (-1.0f), (int) (short) 0);
        double double65 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double66 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "Higham-Hall 5(4)" + "'", str58, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 5 + "'", int59 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 3.0d + "'", double66 == 3.0d);
    }

    @Test
    public void test16586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16586");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) 0L, (double) 3, (double) (short) 10);
        java.lang.String str5 = highamHall54Integrator4.getName();
        int int6 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction(100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
    }

    @Test
    public void test16587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16587");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, 100.0d, (double) (short) -1, (double) 10);
        highamHall54Integrator4.setMaxGrowth((double) (byte) -1);
        double double7 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) (byte) 0, (double) 2, (int) (short) 100);
        int int13 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, (double) (-1.0f), 0.2d, (int) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator4.getStepHandler();
        boolean boolean20 = stepHandler19.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test16588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16588");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 'a', (double) (short) 0, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) 0, (double) 1L, (int) '4');
        java.lang.String str10 = highamHall54Integrator4.getName();
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
    }

    @Test
    public void test16589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16589");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 3);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) (byte) 100, (double) (-1), 0);
        double double13 = highamHall54Integrator4.getMaxGrowth();
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMinReduction((double) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler24 = highamHall54Integrator23.getStepHandler();
        highamHall54Integrator23.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler32 = highamHall54Integrator31.getStepHandler();
        highamHall54Integrator31.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler35 = highamHall54Integrator31.getStepHandler();
        highamHall54Integrator23.setStepHandler(stepHandler35);
        int int37 = highamHall54Integrator23.getOrder();
        java.lang.String str38 = highamHall54Integrator23.getName();
        java.lang.String str39 = highamHall54Integrator23.getName();
        double double40 = highamHall54Integrator23.getCurrentStepStart();
        double double41 = highamHall54Integrator23.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator46.getStepHandler();
        double double48 = highamHall54Integrator46.getMinStep();
        java.lang.String str49 = highamHall54Integrator46.getName();
        int int50 = highamHall54Integrator46.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction51 = null;
        highamHall54Integrator46.addSwitchingFunction(switchingFunction51, (double) (short) 0, (double) ' ', (-1));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler61 = highamHall54Integrator60.getStepHandler();
        double double62 = highamHall54Integrator60.getMinStep();
        double double63 = highamHall54Integrator60.getCurrentSignedStepsize();
        highamHall54Integrator60.setInitialStepSize(10.0d);
        double double66 = highamHall54Integrator60.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler67 = highamHall54Integrator60.getStepHandler();
        highamHall54Integrator46.setStepHandler(stepHandler67);
        highamHall54Integrator23.setStepHandler(stepHandler67);
        highamHall54Integrator4.setStepHandler(stepHandler67);
        org.apache.commons.math.ode.StepHandler stepHandler71 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertNotNull(stepHandler32);
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 5 + "'", int37 == 5);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Higham-Hall 5(4)" + "'", str38, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Higham-Hall 5(4)" + "'", str39, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Higham-Hall 5(4)" + "'", str49, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 5 + "'", int50 == 5);
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double63));
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertNotNull(stepHandler67);
        org.junit.Assert.assertNotNull(stepHandler71);
    }

    @Test
    public void test16590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16590");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray4 = null;
        double[] doubleArray11 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray4, doubleArray11);
        switchingFunctionsHandler0.stepAccepted((double) 10L, doubleArray4);
        boolean boolean14 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler16 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray20 = null;
        double[] doubleArray27 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray20, doubleArray27);
        switchingFunctionsHandler16.stepAccepted((double) 10L, doubleArray20);
        boolean boolean30 = switchingFunctionsHandler16.isEmpty();
        double double31 = switchingFunctionsHandler16.getEventTime();
        boolean boolean32 = switchingFunctionsHandler16.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler34 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator35 = null;
        boolean boolean36 = switchingFunctionsHandler34.evaluateStep(stepInterpolator35);
        double double37 = switchingFunctionsHandler34.getEventTime();
        boolean boolean38 = switchingFunctionsHandler34.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        switchingFunctionsHandler34.add(switchingFunction39, (double) 1, (-1.0d), (int) (short) 1);
        double[] doubleArray55 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray58 = null;
        double[] doubleArray65 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray58, doubleArray65);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator67 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray55, doubleArray58);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler68 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator69 = null;
        boolean boolean70 = switchingFunctionsHandler68.evaluateStep(stepInterpolator69);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler72 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator73 = null;
        boolean boolean74 = switchingFunctionsHandler72.evaluateStep(stepInterpolator73);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator75 = null;
        boolean boolean76 = switchingFunctionsHandler72.evaluateStep(stepInterpolator75);
        double[] doubleArray82 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler72.stepAccepted((double) (byte) 1, doubleArray82);
        boolean boolean84 = switchingFunctionsHandler68.reset((double) (byte) 1, doubleArray82);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator85 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (byte) 100, doubleArray55, doubleArray82);
        boolean boolean86 = switchingFunctionsHandler34.reset(0.0d, doubleArray55);
        boolean boolean87 = switchingFunctionsHandler16.reset((double) (byte) 1, doubleArray55);
        switchingFunctionsHandler0.stepAccepted((double) '#', doubleArray55);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction89 = null;
        switchingFunctionsHandler0.add(switchingFunction89, (double) 0L, 97.0d, 0);
        double double94 = switchingFunctionsHandler0.getEventTime();
        boolean boolean95 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator96 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean97 = switchingFunctionsHandler0.evaluateStep(stepInterpolator96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray65), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(doubleArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray82), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double94));
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test16591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16591");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (short) 0, 5.477225575051661d, (double) (byte) 1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
    }

    @Test
    public void test16592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16592");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1), (double) (short) 0, (double) (byte) 100, (double) 100L);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        stepHandler5.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        stepHandler5.handleStep(stepInterpolator7, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        stepHandler5.handleStep(stepInterpolator10, true);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        stepHandler5.handleStep(stepInterpolator13, false);
        org.junit.Assert.assertNotNull(stepHandler5);
    }

    @Test
    public void test16593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16593");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        java.lang.String str9 = highamHall54Integrator4.getName();
        java.lang.String str10 = highamHall54Integrator4.getName();
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMinReduction((double) ' ');
        int int14 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test16594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16594");
        double[] doubleArray8 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray11 = null;
        double[] doubleArray18 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray11, doubleArray18);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray8, doubleArray11);
        highamHall54Integrator20.setMaxGrowth((double) 1.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        highamHall54Integrator20.addSwitchingFunction(switchingFunction23, (double) (byte) 10, 31.144823004794873d, (int) (short) 1);
        highamHall54Integrator20.setMaxGrowth(3.1622776601683795d);
        int int30 = highamHall54Integrator20.getOrder();
        double double31 = highamHall54Integrator20.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test16595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16595");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        java.lang.String str11 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, (double) 100L, (double) 0L, (int) (byte) 1);
        double double17 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth((double) 10L);
        double double20 = highamHall54Integrator4.getMaxStep();
        int int21 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 1);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test16596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16596");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 3);
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 5);
        int int12 = highamHall54Integrator4.getOrder();
        double double13 = highamHall54Integrator4.getMaxStep();
        java.lang.String str14 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler20 = null;
        highamHall54Integrator19.setStepHandler(stepHandler20);
        double double22 = highamHall54Integrator19.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler23 = null;
        highamHall54Integrator19.setStepHandler(stepHandler23);
        double double25 = highamHall54Integrator19.getMaxStep();
        double double26 = highamHall54Integrator19.getMinStep();
        double double27 = highamHall54Integrator19.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler33 = highamHall54Integrator32.getStepHandler();
        highamHall54Integrator32.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator32.getStepHandler();
        boolean boolean37 = stepHandler36.requiresDenseOutput();
        highamHall54Integrator19.setStepHandler(stepHandler36);
        double double39 = highamHall54Integrator19.getCurrentSignedStepsize();
        double double40 = highamHall54Integrator19.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        highamHall54Integrator19.addSwitchingFunction(switchingFunction41, (double) (short) -1, (double) (-1.0f), (int) (byte) -1);
        int int46 = highamHall54Integrator19.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler52 = null;
        highamHall54Integrator51.setStepHandler(stepHandler52);
        double double54 = highamHall54Integrator51.getCurrentSignedStepsize();
        double double55 = highamHall54Integrator51.getCurrentStepStart();
        double double56 = highamHall54Integrator51.getCurrentStepStart();
        double double57 = highamHall54Integrator51.getCurrentSignedStepsize();
        double double58 = highamHall54Integrator51.getSafety();
        double double59 = highamHall54Integrator51.getMaxStep();
        double double60 = highamHall54Integrator51.getMaxGrowth();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler66 = highamHall54Integrator65.getStepHandler();
        highamHall54Integrator65.setMinReduction((double) 10L);
        double double69 = highamHall54Integrator65.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler70 = highamHall54Integrator65.getStepHandler();
        double double71 = highamHall54Integrator65.getCurrentSignedStepsize();
        double double72 = highamHall54Integrator65.getSafety();
        double double73 = highamHall54Integrator65.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler74 = highamHall54Integrator65.getStepHandler();
        highamHall54Integrator51.setStepHandler(stepHandler74);
        highamHall54Integrator19.setStepHandler(stepHandler74);
        stepHandler74.reset();
        highamHall54Integrator4.setStepHandler(stepHandler74);
        double double79 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9d + "'", double40 == 0.9d);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 5 + "'", int46 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.9d + "'", double58 == 0.9d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertNotNull(stepHandler70);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.9d + "'", double72 == 0.9d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 10.0d + "'", double73 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler74);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 5.0d + "'", double79 == 5.0d);
    }

    @Test
    public void test16597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16597");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        java.lang.String str8 = highamHall54Integrator4.getName();
        double double9 = highamHall54Integrator4.getMinReduction();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(76.91605673134588d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test16598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16598");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int8 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) (-1.0f), (double) 2, (int) '#');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, 17.78279410038923d, (double) (short) 0, (int) '#');
        double double19 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }

    @Test
    public void test16599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16599");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 10.0d, (double) (-1), (double) (short) -1);
        int int5 = highamHall54Integrator4.getOrder();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double7 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.1622776601683795d + "'", double6 == 3.1622776601683795d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test16600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16600");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 0.0f);
        java.lang.String str8 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        int int12 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test16601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16601");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(31.810829150682025d, 2.23606797749979d, (double) 3, (double) 2);
    }

    @Test
    public void test16602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16602");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, 100.0d, (double) (short) -1, (double) 10);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) 0.0f, (double) (short) 10, (int) (short) 1);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator15 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler16 = null;
        highamHall54Integrator15.setStepHandler(stepHandler16);
        double double18 = highamHall54Integrator15.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler19 = null;
        highamHall54Integrator15.setStepHandler(stepHandler19);
        double double21 = highamHall54Integrator15.getMaxStep();
        double double22 = highamHall54Integrator15.getMinStep();
        double double23 = highamHall54Integrator15.getCurrentSignedStepsize();
        java.lang.String str24 = highamHall54Integrator15.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler30 = null;
        highamHall54Integrator29.setStepHandler(stepHandler30);
        double double32 = highamHall54Integrator29.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler33 = null;
        highamHall54Integrator29.setStepHandler(stepHandler33);
        double double35 = highamHall54Integrator29.getMaxStep();
        double double36 = highamHall54Integrator29.getMinStep();
        double double37 = highamHall54Integrator29.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler43 = highamHall54Integrator42.getStepHandler();
        highamHall54Integrator42.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler46 = highamHall54Integrator42.getStepHandler();
        boolean boolean47 = stepHandler46.requiresDenseOutput();
        highamHall54Integrator29.setStepHandler(stepHandler46);
        java.lang.String str49 = highamHall54Integrator29.getName();
        org.apache.commons.math.ode.StepHandler stepHandler50 = highamHall54Integrator29.getStepHandler();
        highamHall54Integrator15.setStepHandler(stepHandler50);
        highamHall54Integrator4.setStepHandler(stepHandler50);
        double double53 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str54 = highamHall54Integrator4.getName();
        double double55 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMinReduction(97.0d);
        double double58 = highamHall54Integrator4.getMinStep();
        double double59 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Higham-Hall 5(4)" + "'", str24, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(stepHandler43);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Higham-Hall 5(4)" + "'", str49, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Higham-Hall 5(4)" + "'", str54, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 100.0d + "'", double58 == 100.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.9d + "'", double59 == 0.9d);
    }

    @Test
    public void test16603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16603");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 'a', (double) (short) 0, (double) (-1));
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getMaxStep();
        java.lang.String str7 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) (-1));
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 31.144823004794873d + "'", double10 == 31.144823004794873d);
    }

    @Test
    public void test16604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16604");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(3.1622776601683795d, (double) (short) 100, Double.NaN, (double) (-1L));
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        int int6 = highamHall54Integrator4.getOrder();
        java.lang.String str7 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
    }

    @Test
    public void test16605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16605");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler16);
        int int18 = highamHall54Integrator4.getOrder();
        java.lang.String str19 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator4.getStepHandler();
        double double21 = highamHall54Integrator4.getCurrentStepStart();
        double double22 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator27.getStepHandler();
        double double29 = highamHall54Integrator27.getMinStep();
        double double30 = highamHall54Integrator27.getCurrentSignedStepsize();
        highamHall54Integrator27.setInitialStepSize(10.0d);
        double double33 = highamHall54Integrator27.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator27.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler35 = highamHall54Integrator27.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler35);
        stepHandler35.reset();
        boolean boolean38 = stepHandler35.requiresDenseOutput();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test16606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16606");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, 0.0d, (double) 'a', (int) '#');
        highamHall54Integrator4.setInitialStepSize(9.848857801796104d);
        java.lang.String str15 = highamHall54Integrator4.getName();
        double double16 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 10, 10.0d, (double) 10, Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator21.getStepHandler();
        double double23 = highamHall54Integrator21.getCurrentStepStart();
        highamHall54Integrator21.setInitialStepSize((double) (byte) 0);
        double double26 = highamHall54Integrator21.getCurrentSignedStepsize();
        highamHall54Integrator21.setMinReduction((double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler29 = highamHall54Integrator21.getStepHandler();
        boolean boolean30 = stepHandler29.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler29);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Higham-Hall 5(4)" + "'", str15, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test16607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16607");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 100.0f, (double) 10L, (int) 'a');
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int14 = highamHall54Integrator4.getOrder();
        int int15 = highamHall54Integrator4.getOrder();
        double double16 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety(0.4472135954999579d);
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator4.getStepHandler();
        java.lang.Class<?> wildcardClass20 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test16608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16608");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction1 = null;
        switchingFunctionsHandler0.add(switchingFunction1, (double) 1.0f, (double) (byte) -1, 10);
        double double6 = switchingFunctionsHandler0.getEventTime();
        boolean boolean7 = switchingFunctionsHandler0.stop();
        double double8 = switchingFunctionsHandler0.getEventTime();
        boolean boolean9 = switchingFunctionsHandler0.isEmpty();
        double double10 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        boolean boolean14 = switchingFunctionsHandler12.evaluateStep(stepInterpolator13);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator15 = null;
        boolean boolean16 = switchingFunctionsHandler12.evaluateStep(stepInterpolator15);
        double[] doubleArray22 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler12.stepAccepted((double) (byte) 1, doubleArray22);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        boolean boolean25 = switchingFunctionsHandler12.evaluateStep(stepInterpolator24);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        switchingFunctionsHandler12.add(switchingFunction26, (double) (byte) 100, (double) 3, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler32 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator33 = null;
        boolean boolean34 = switchingFunctionsHandler32.evaluateStep(stepInterpolator33);
        double double35 = switchingFunctionsHandler32.getEventTime();
        boolean boolean36 = switchingFunctionsHandler32.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction37 = null;
        switchingFunctionsHandler32.add(switchingFunction37, (double) 1, (-1.0d), (int) (short) 1);
        double[] doubleArray53 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray56 = null;
        double[] doubleArray63 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray56, doubleArray63);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray53, doubleArray56);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler66 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator67 = null;
        boolean boolean68 = switchingFunctionsHandler66.evaluateStep(stepInterpolator67);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler70 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator71 = null;
        boolean boolean72 = switchingFunctionsHandler70.evaluateStep(stepInterpolator71);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator73 = null;
        boolean boolean74 = switchingFunctionsHandler70.evaluateStep(stepInterpolator73);
        double[] doubleArray80 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler70.stepAccepted((double) (byte) 1, doubleArray80);
        boolean boolean82 = switchingFunctionsHandler66.reset((double) (byte) 1, doubleArray80);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator83 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (byte) 100, doubleArray53, doubleArray80);
        boolean boolean84 = switchingFunctionsHandler32.reset(0.0d, doubleArray53);
        boolean boolean85 = switchingFunctionsHandler12.reset((double) 100, doubleArray53);
        boolean boolean86 = switchingFunctionsHandler0.reset(2.1213203435596424d, doubleArray53);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(doubleArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray53), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test16609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16609");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth((double) 10);
        int int13 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator18.getStepHandler();
        double double20 = highamHall54Integrator18.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator18.getStepHandler();
        int int22 = highamHall54Integrator18.getOrder();
        highamHall54Integrator18.setSafety((double) (byte) 1);
        double double25 = highamHall54Integrator18.getSafety();
        double double26 = highamHall54Integrator18.getCurrentSignedStepsize();
        double double27 = highamHall54Integrator18.getCurrentSignedStepsize();
        double double28 = highamHall54Integrator18.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler34 = null;
        highamHall54Integrator33.setStepHandler(stepHandler34);
        double double36 = highamHall54Integrator33.getCurrentSignedStepsize();
        double double37 = highamHall54Integrator33.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler43 = highamHall54Integrator42.getStepHandler();
        highamHall54Integrator33.setStepHandler(stepHandler43);
        double double45 = highamHall54Integrator33.getCurrentSignedStepsize();
        double double46 = highamHall54Integrator33.getMaxGrowth();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler52 = null;
        highamHall54Integrator51.setStepHandler(stepHandler52);
        double double54 = highamHall54Integrator51.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler55 = null;
        highamHall54Integrator51.setStepHandler(stepHandler55);
        double double57 = highamHall54Integrator51.getMaxStep();
        double double58 = highamHall54Integrator51.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler64 = highamHall54Integrator63.getStepHandler();
        highamHall54Integrator51.setStepHandler(stepHandler64);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction66 = null;
        highamHall54Integrator51.addSwitchingFunction(switchingFunction66, (double) '4', 1.0d, (int) (short) -1);
        double double71 = highamHall54Integrator51.getMaxStep();
        double double72 = highamHall54Integrator51.getSafety();
        highamHall54Integrator51.setInitialStepSize(1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler75 = highamHall54Integrator51.getStepHandler();
        highamHall54Integrator33.setStepHandler(stepHandler75);
        highamHall54Integrator18.setStepHandler(stepHandler75);
        highamHall54Integrator4.setStepHandler(stepHandler75);
        highamHall54Integrator4.setInitialStepSize(5.477225575051661d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(stepHandler43);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double54));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler64);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + (-1.0d) + "'", double71 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.9d + "'", double72 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler75);
    }

    @Test
    public void test16610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16610");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        java.lang.String str11 = highamHall54Integrator4.getName();
        double double12 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 'a', (double) (short) 0, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator17.addSwitchingFunction(switchingFunction18, (double) 0, (double) 1L, (int) '4');
        java.lang.String str23 = highamHall54Integrator17.getName();
        double double24 = highamHall54Integrator17.getSafety();
        double double25 = highamHall54Integrator17.getCurrentSignedStepsize();
        double double26 = highamHall54Integrator17.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9d + "'", double24 == 0.9d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 31.144823004794873d + "'", double25 == 31.144823004794873d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 31.144823004794873d + "'", double26 == 31.144823004794873d);
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test16611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16611");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        int int11 = highamHall54Integrator4.getOrder();
        double double12 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, (double) (short) 100, (double) '4', 3);
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator4.getStepHandler();
        java.lang.String str19 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setSafety(10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertNull(stepHandler18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
    }

    @Test
    public void test16612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16612");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction3 = null;
        switchingFunctionsHandler0.add(switchingFunction3, (double) 10, (double) 1.0f, (int) '4');
        boolean boolean8 = switchingFunctionsHandler0.stop();
        boolean boolean9 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler13 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        boolean boolean15 = switchingFunctionsHandler13.evaluateStep(stepInterpolator14);
        double double16 = switchingFunctionsHandler13.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        switchingFunctionsHandler13.add(switchingFunction17, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler23 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        boolean boolean25 = switchingFunctionsHandler23.evaluateStep(stepInterpolator24);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator28 = null;
        boolean boolean29 = switchingFunctionsHandler27.evaluateStep(stepInterpolator28);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        boolean boolean31 = switchingFunctionsHandler27.evaluateStep(stepInterpolator30);
        double[] doubleArray37 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler27.stepAccepted((double) (byte) 1, doubleArray37);
        boolean boolean39 = switchingFunctionsHandler23.reset((double) (byte) 1, doubleArray37);
        boolean boolean40 = switchingFunctionsHandler13.reset((double) '4', doubleArray37);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        boolean boolean43 = switchingFunctionsHandler41.evaluateStep(stepInterpolator42);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler45 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator46 = null;
        boolean boolean47 = switchingFunctionsHandler45.evaluateStep(stepInterpolator46);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator48 = null;
        boolean boolean49 = switchingFunctionsHandler45.evaluateStep(stepInterpolator48);
        double[] doubleArray55 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler45.stepAccepted((double) (byte) 1, doubleArray55);
        boolean boolean57 = switchingFunctionsHandler41.reset((double) (byte) 1, doubleArray55);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, 0.0d, doubleArray37, doubleArray55);
        boolean boolean59 = switchingFunctionsHandler0.reset((double) (short) 0, doubleArray55);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator60 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean61 = switchingFunctionsHandler0.evaluateStep(stepInterpolator60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test16613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16613");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        java.lang.String str8 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator13 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator13.getStepHandler();
        highamHall54Integrator13.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator13.getStepHandler();
        boolean boolean18 = stepHandler17.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        stepHandler17.handleStep(stepInterpolator19, true);
        highamHall54Integrator4.setStepHandler(stepHandler17);
        java.lang.String str23 = highamHall54Integrator4.getName();
        double double24 = highamHall54Integrator4.getCurrentStepStart();
        double double25 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler31 = highamHall54Integrator30.getStepHandler();
        double double32 = highamHall54Integrator30.getMinStep();
        double double33 = highamHall54Integrator30.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator30.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator35 = null;
        stepHandler34.handleStep(stepInterpolator35, false);
        boolean boolean38 = stepHandler34.requiresDenseOutput();
        stepHandler34.reset();
        stepHandler34.reset();
        highamHall54Integrator4.setStepHandler(stepHandler34);
        highamHall54Integrator4.setSafety((double) (byte) 1);
        double double44 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double45 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue(Double.isNaN(double45));
    }

    @Test
    public void test16614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16614");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        java.lang.String str25 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction27, 32.0d, 10.0d, (int) (short) 100);
        double double32 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler33 = highamHall54Integrator4.getStepHandler();
        double double34 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test16615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16615");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double double3 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction4 = null;
        switchingFunctionsHandler0.add(switchingFunction4, (double) 0L, (double) 0, (int) 'a');
        boolean boolean9 = switchingFunctionsHandler0.isEmpty();
        double double10 = switchingFunctionsHandler0.getEventTime();
        boolean boolean11 = switchingFunctionsHandler0.isEmpty();
        double double12 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        switchingFunctionsHandler0.add(switchingFunction13, (double) ' ', (double) (byte) 1, 1);
        double[] doubleArray21 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        boolean boolean24 = switchingFunctionsHandler22.evaluateStep(stepInterpolator23);
        double double25 = switchingFunctionsHandler22.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        switchingFunctionsHandler22.add(switchingFunction26, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler32 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator33 = null;
        boolean boolean34 = switchingFunctionsHandler32.evaluateStep(stepInterpolator33);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler36 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler36.evaluateStep(stepInterpolator37);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator39 = null;
        boolean boolean40 = switchingFunctionsHandler36.evaluateStep(stepInterpolator39);
        double[] doubleArray46 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler36.stepAccepted((double) (byte) 1, doubleArray46);
        boolean boolean48 = switchingFunctionsHandler32.reset((double) (byte) 1, doubleArray46);
        boolean boolean49 = switchingFunctionsHandler22.reset((double) '4', doubleArray46);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (-1), doubleArray21, doubleArray46);
        boolean boolean51 = switchingFunctionsHandler0.reset((double) (short) 100, doubleArray21);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        switchingFunctionsHandler0.add(switchingFunction52, 3.1622776601683795d, (double) 1.0f, (int) (byte) 10);
        double[] doubleArray58 = null;
        boolean boolean59 = switchingFunctionsHandler0.reset(5.656854249492381d, doubleArray58);
        double double60 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction61 = null;
        switchingFunctionsHandler0.add(switchingFunction61, 17.752843424574987d, (double) (byte) -1, (int) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction66 = null;
        switchingFunctionsHandler0.add(switchingFunction66, (double) 0.0f, (double) 1.0f, (int) '4');
        double double71 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }

    @Test
    public void test16616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16616");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler24 = null;
        highamHall54Integrator23.setStepHandler(stepHandler24);
        double double26 = highamHall54Integrator23.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = null;
        highamHall54Integrator23.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator23.getMaxStep();
        double double30 = highamHall54Integrator23.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator23.setStepHandler(stepHandler36);
        highamHall54Integrator4.setStepHandler(stepHandler36);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction39, (double) (-1L), (double) 1L, (-1));
        highamHall54Integrator4.setInitialStepSize((double) (short) 10);
        double double46 = highamHall54Integrator4.getSafety();
        java.lang.String str47 = highamHall54Integrator4.getName();
        int int48 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        double double51 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        int int54 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9d + "'", double46 == 0.9d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Higham-Hall 5(4)" + "'", str47, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 5 + "'", int48 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 5 + "'", int54 == 5);
    }

    @Test
    public void test16617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16617");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize(1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 10);
        int int31 = highamHall54Integrator4.getOrder();
        double double32 = highamHall54Integrator4.getMinStep();
        double double33 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
    }

    @Test
    public void test16618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16618");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, (double) (byte) -1, (double) (short) -1, (double) 3);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        java.lang.String str7 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
    }

    @Test
    public void test16619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16619");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        highamHall54Integrator4.setSafety((double) 10.0f);
        double double21 = highamHall54Integrator4.getCurrentStepStart();
        int int22 = highamHall54Integrator4.getOrder();
        double double23 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler29 = null;
        highamHall54Integrator28.setStepHandler(stepHandler29);
        double double31 = highamHall54Integrator28.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler32 = null;
        highamHall54Integrator28.setStepHandler(stepHandler32);
        double double34 = highamHall54Integrator28.getMaxStep();
        double double35 = highamHall54Integrator28.getMinStep();
        double double36 = highamHall54Integrator28.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator41.getStepHandler();
        highamHall54Integrator41.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler45 = highamHall54Integrator41.getStepHandler();
        boolean boolean46 = stepHandler45.requiresDenseOutput();
        highamHall54Integrator28.setStepHandler(stepHandler45);
        double double48 = highamHall54Integrator28.getSafety();
        java.lang.String str49 = highamHall54Integrator28.getName();
        org.apache.commons.math.ode.StepHandler stepHandler50 = highamHall54Integrator28.getStepHandler();
        java.lang.String str51 = highamHall54Integrator28.getName();
        java.lang.String str52 = highamHall54Integrator28.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction53 = null;
        highamHall54Integrator28.addSwitchingFunction(switchingFunction53, (-1.0d), 10.0d, (-1));
        highamHall54Integrator28.setSafety(31.622776601683793d);
        org.apache.commons.math.ode.StepHandler stepHandler60 = highamHall54Integrator28.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler60);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertNotNull(stepHandler45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.9d + "'", double48 == 0.9d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Higham-Hall 5(4)" + "'", str49, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Higham-Hall 5(4)" + "'", str51, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Higham-Hall 5(4)" + "'", str52, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler60);
    }

    @Test
    public void test16620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16620");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str12 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) (short) 10);
        double double15 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        java.lang.String str17 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction(2.23606797749979d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNull(stepHandler16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
    }

    @Test
    public void test16621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16621");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, 100.0d, (double) (short) -1, (double) 10);
        highamHall54Integrator4.setMaxGrowth((double) (byte) -1);
        double double7 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) (byte) 0, (double) 2, (int) (short) 100);
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str14 = highamHall54Integrator4.getName();
        double double15 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((double) 3);
        double double18 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2d + "'", double18 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler19);
    }

    @Test
    public void test16622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16622");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 10, 10.0d, (double) 10, Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler11 = null;
        highamHall54Integrator10.setStepHandler(stepHandler11);
        double double13 = highamHall54Integrator10.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler14 = null;
        highamHall54Integrator10.setStepHandler(stepHandler14);
        double double16 = highamHall54Integrator10.getMaxStep();
        double double17 = highamHall54Integrator10.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator22.getStepHandler();
        highamHall54Integrator10.setStepHandler(stepHandler23);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler30 = null;
        highamHall54Integrator29.setStepHandler(stepHandler30);
        double double32 = highamHall54Integrator29.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler33 = null;
        highamHall54Integrator29.setStepHandler(stepHandler33);
        double double35 = highamHall54Integrator29.getMaxStep();
        double double36 = highamHall54Integrator29.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator41.getStepHandler();
        highamHall54Integrator29.setStepHandler(stepHandler42);
        highamHall54Integrator10.setStepHandler(stepHandler42);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator45 = null;
        stepHandler42.handleStep(stepInterpolator45, true);
        highamHall54Integrator4.setStepHandler(stepHandler42);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler54 = null;
        highamHall54Integrator53.setStepHandler(stepHandler54);
        double double56 = highamHall54Integrator53.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler57 = null;
        highamHall54Integrator53.setStepHandler(stepHandler57);
        double double59 = highamHall54Integrator53.getMaxStep();
        double double60 = highamHall54Integrator53.getMinStep();
        double double61 = highamHall54Integrator53.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler67 = highamHall54Integrator66.getStepHandler();
        highamHall54Integrator66.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler70 = highamHall54Integrator66.getStepHandler();
        boolean boolean71 = stepHandler70.requiresDenseOutput();
        highamHall54Integrator53.setStepHandler(stepHandler70);
        double double73 = highamHall54Integrator53.getSafety();
        java.lang.String str74 = highamHall54Integrator53.getName();
        org.apache.commons.math.ode.StepHandler stepHandler75 = highamHall54Integrator53.getStepHandler();
        boolean boolean76 = stepHandler75.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler75);
        double double78 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertNotNull(stepHandler67);
        org.junit.Assert.assertNotNull(stepHandler70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 0.9d + "'", double73 == 0.9d);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "Higham-Hall 5(4)" + "'", str74, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 0.2d + "'", double78 == 0.2d);
    }

    @Test
    public void test16623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16623");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double double1 = switchingFunctionsHandler0.getEventTime();
        boolean boolean2 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        double double5 = switchingFunctionsHandler0.getEventTime();
        double double6 = switchingFunctionsHandler0.getEventTime();
        boolean boolean7 = switchingFunctionsHandler0.isEmpty();
        double double8 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        switchingFunctionsHandler10.add(switchingFunction11, (double) 1.0f, (double) (byte) -1, 10);
        boolean boolean16 = switchingFunctionsHandler10.stop();
        boolean boolean17 = switchingFunctionsHandler10.isEmpty();
        boolean boolean18 = switchingFunctionsHandler10.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator21 = null;
        boolean boolean22 = switchingFunctionsHandler20.evaluateStep(stepInterpolator21);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        switchingFunctionsHandler20.add(switchingFunction23, (double) (short) 1, (double) 1L, 3);
        boolean boolean28 = switchingFunctionsHandler20.stop();
        boolean boolean29 = switchingFunctionsHandler20.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler31 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler35 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler35.evaluateStep(stepInterpolator36);
        double double38 = switchingFunctionsHandler35.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        switchingFunctionsHandler35.add(switchingFunction39, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler45 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator46 = null;
        boolean boolean47 = switchingFunctionsHandler45.evaluateStep(stepInterpolator46);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler49 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator50 = null;
        boolean boolean51 = switchingFunctionsHandler49.evaluateStep(stepInterpolator50);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator52 = null;
        boolean boolean53 = switchingFunctionsHandler49.evaluateStep(stepInterpolator52);
        double[] doubleArray59 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler49.stepAccepted((double) (byte) 1, doubleArray59);
        boolean boolean61 = switchingFunctionsHandler45.reset((double) (byte) 1, doubleArray59);
        boolean boolean62 = switchingFunctionsHandler35.reset((double) '4', doubleArray59);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler63 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator64 = null;
        boolean boolean65 = switchingFunctionsHandler63.evaluateStep(stepInterpolator64);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler67 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator68 = null;
        boolean boolean69 = switchingFunctionsHandler67.evaluateStep(stepInterpolator68);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator70 = null;
        boolean boolean71 = switchingFunctionsHandler67.evaluateStep(stepInterpolator70);
        double[] doubleArray77 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler67.stepAccepted((double) (byte) 1, doubleArray77);
        boolean boolean79 = switchingFunctionsHandler63.reset((double) (byte) 1, doubleArray77);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator80 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, 0.0d, doubleArray59, doubleArray77);
        boolean boolean81 = switchingFunctionsHandler31.reset(31.144823004794873d, doubleArray59);
        boolean boolean82 = switchingFunctionsHandler20.reset(31.144823004794873d, doubleArray59);
        boolean boolean83 = switchingFunctionsHandler10.reset((double) '4', doubleArray59);
        boolean boolean84 = switchingFunctionsHandler0.reset(0.0d, doubleArray59);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction85 = null;
        switchingFunctionsHandler0.add(switchingFunction85, Double.NaN, 4.47213595499958d, 3);
        boolean boolean90 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue(Double.isNaN(double1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test16624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16624");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) (byte) 10, (double) 1, 3);
        java.lang.String str13 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth((double) 100);
        highamHall54Integrator4.setInitialStepSize(56.568542494923804d);
        highamHall54Integrator4.setMaxGrowth((double) 100L);
        highamHall54Integrator4.setMinReduction(10.198039027185569d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler14);
    }

    @Test
    public void test16625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16625");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth((double) (byte) 10);
        double double10 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setMinReduction((double) ' ');
        highamHall54Integrator4.setMinReduction(5.0d);
        double double15 = highamHall54Integrator4.getMinStep();
        double double16 = highamHall54Integrator4.getMinStep();
        double double17 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setSafety(4.216965034285822d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction20, 24.947901585376336d, 0.0d, (int) (byte) -1);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test16626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16626");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.isEmpty();
        boolean boolean2 = switchingFunctionsHandler0.isEmpty();
        boolean boolean3 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler0.evaluateStep(stepInterpolator4);
        boolean boolean6 = switchingFunctionsHandler0.stop();
        double[] doubleArray20 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray23 = null;
        double[] doubleArray30 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray23, doubleArray30);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray20, doubleArray23);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler33 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator34 = null;
        boolean boolean35 = switchingFunctionsHandler33.evaluateStep(stepInterpolator34);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler37 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        boolean boolean39 = switchingFunctionsHandler37.evaluateStep(stepInterpolator38);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        boolean boolean41 = switchingFunctionsHandler37.evaluateStep(stepInterpolator40);
        double[] doubleArray47 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler37.stepAccepted((double) (byte) 1, doubleArray47);
        boolean boolean49 = switchingFunctionsHandler33.reset((double) (byte) 1, doubleArray47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (byte) 100, doubleArray20, doubleArray47);
        double[] doubleArray51 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator(3.1622776601683795d, 0.2d, doubleArray47, doubleArray51);
        switchingFunctionsHandler0.stepAccepted(3.0d, doubleArray47);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction54 = null;
        switchingFunctionsHandler0.add(switchingFunction54, (double) (byte) 1, 0.2d, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test16627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16627");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, 100.0d, (double) (short) 1, (double) (byte) 10);
        int int5 = highamHall54Integrator4.getOrder();
        double double6 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction(17.78279410038923d);
        int int9 = highamHall54Integrator4.getOrder();
        java.lang.String str10 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
    }

    @Test
    public void test16628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16628");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 0, (double) (byte) 0, (double) (-1.0f), (double) 1.0f);
        int int5 = highamHall54Integrator4.getOrder();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str7 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
    }

    @Test
    public void test16629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16629");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction3 = null;
        switchingFunctionsHandler0.add(switchingFunction3, (double) 10, (double) 1.0f, (int) '4');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        switchingFunctionsHandler0.add(switchingFunction8, 2.0d, (double) (byte) 0, (int) '4');
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler14 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator15 = null;
        boolean boolean16 = switchingFunctionsHandler14.evaluateStep(stepInterpolator15);
        double double17 = switchingFunctionsHandler14.getEventTime();
        double double18 = switchingFunctionsHandler14.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler20 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean21 = switchingFunctionsHandler20.isEmpty();
        boolean boolean22 = switchingFunctionsHandler20.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        boolean boolean24 = switchingFunctionsHandler20.evaluateStep(stepInterpolator23);
        boolean boolean25 = switchingFunctionsHandler20.isEmpty();
        double double26 = switchingFunctionsHandler20.getEventTime();
        double[] doubleArray33 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler34 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator35 = null;
        boolean boolean36 = switchingFunctionsHandler34.evaluateStep(stepInterpolator35);
        double double37 = switchingFunctionsHandler34.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction38 = null;
        switchingFunctionsHandler34.add(switchingFunction38, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler44 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator45 = null;
        boolean boolean46 = switchingFunctionsHandler44.evaluateStep(stepInterpolator45);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler48 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator49 = null;
        boolean boolean50 = switchingFunctionsHandler48.evaluateStep(stepInterpolator49);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator51 = null;
        boolean boolean52 = switchingFunctionsHandler48.evaluateStep(stepInterpolator51);
        double[] doubleArray58 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler48.stepAccepted((double) (byte) 1, doubleArray58);
        boolean boolean60 = switchingFunctionsHandler44.reset((double) (byte) 1, doubleArray58);
        boolean boolean61 = switchingFunctionsHandler34.reset((double) '4', doubleArray58);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray33, doubleArray58);
        boolean boolean63 = switchingFunctionsHandler20.reset(3.0d, doubleArray58);
        switchingFunctionsHandler14.stepAccepted(5.477225575051661d, doubleArray58);
        boolean boolean65 = switchingFunctionsHandler0.reset((double) ' ', doubleArray58);
        boolean boolean66 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test16630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16630");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (short) -1, (double) 2, 100.0d);
        highamHall54Integrator4.setSafety((double) 100.0f);
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str8 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator13 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator13.getStepHandler();
        boolean boolean15 = stepHandler14.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        stepHandler14.handleStep(stepInterpolator16, false);
        boolean boolean19 = stepHandler14.requiresDenseOutput();
        stepHandler14.reset();
        highamHall54Integrator4.setStepHandler(stepHandler14);
        double double22 = highamHall54Integrator4.getMaxStep();
        int int23 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
    }

    @Test
    public void test16631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16631");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        highamHall54Integrator4.setMaxGrowth((double) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, (double) '4', 97.0d, (int) '#');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler26 = null;
        highamHall54Integrator25.setStepHandler(stepHandler26);
        double double28 = highamHall54Integrator25.getCurrentSignedStepsize();
        double double29 = highamHall54Integrator25.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler35 = highamHall54Integrator34.getStepHandler();
        highamHall54Integrator25.setStepHandler(stepHandler35);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        stepHandler35.handleStep(stepInterpolator37, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        stepHandler35.handleStep(stepInterpolator40, false);
        highamHall54Integrator4.setStepHandler(stepHandler35);
        highamHall54Integrator4.setSafety((double) 0);
        double double46 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator4.getStepHandler();
        double double48 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler49 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.2d + "'", double46 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler49);
    }

    @Test
    public void test16632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16632");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, (double) (short) 100, 1.0d, (double) (short) 10);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator9 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator9.getStepHandler();
        highamHall54Integrator9.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator9.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        stepHandler13.handleStep(stepInterpolator14, true);
        highamHall54Integrator4.setStepHandler(stepHandler13);
        double double18 = highamHall54Integrator4.getMinReduction();
        double double19 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2d + "'", double18 == 0.2d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test16633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16633");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str8 = highamHall54Integrator4.getName();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator14.getStepHandler();
        highamHall54Integrator14.setInitialStepSize((double) 3);
        highamHall54Integrator14.setInitialStepSize((double) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler25 = highamHall54Integrator24.getStepHandler();
        boolean boolean26 = stepHandler25.requiresDenseOutput();
        highamHall54Integrator14.setStepHandler(stepHandler25);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler33 = highamHall54Integrator32.getStepHandler();
        highamHall54Integrator32.setMinReduction(10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        highamHall54Integrator32.addSwitchingFunction(switchingFunction36, (-1.0d), (double) (short) 10, (int) (byte) 1);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler46 = highamHall54Integrator45.getStepHandler();
        highamHall54Integrator45.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler54 = null;
        highamHall54Integrator53.setStepHandler(stepHandler54);
        double double56 = highamHall54Integrator53.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler57 = null;
        highamHall54Integrator53.setStepHandler(stepHandler57);
        double double59 = highamHall54Integrator53.getMaxStep();
        double double60 = highamHall54Integrator53.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler66 = highamHall54Integrator65.getStepHandler();
        highamHall54Integrator53.setStepHandler(stepHandler66);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator72 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler73 = null;
        highamHall54Integrator72.setStepHandler(stepHandler73);
        double double75 = highamHall54Integrator72.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler76 = null;
        highamHall54Integrator72.setStepHandler(stepHandler76);
        double double78 = highamHall54Integrator72.getMaxStep();
        double double79 = highamHall54Integrator72.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler85 = highamHall54Integrator84.getStepHandler();
        highamHall54Integrator72.setStepHandler(stepHandler85);
        highamHall54Integrator53.setStepHandler(stepHandler85);
        highamHall54Integrator45.setStepHandler(stepHandler85);
        boolean boolean89 = stepHandler85.requiresDenseOutput();
        highamHall54Integrator32.setStepHandler(stepHandler85);
        highamHall54Integrator14.setStepHandler(stepHandler85);
        highamHall54Integrator4.setStepHandler(stepHandler85);
        double double93 = highamHall54Integrator4.getMaxStep();
        java.lang.String str94 = highamHall54Integrator4.getName();
        double double95 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth(0.4472135954999579d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler85);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "Higham-Hall 5(4)" + "'", str94, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double95));
    }

    @Test
    public void test16634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16634");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, 0.2d, (double) (short) 10);
        double double5 = highamHall54Integrator4.getMinStep();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        double double8 = highamHall54Integrator4.getMinStep();
        double double9 = highamHall54Integrator4.getSafety();
        java.lang.String str10 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, (double) 10, 17.752843424574987d, (int) 'a');
        highamHall54Integrator4.setMaxGrowth((double) '4');
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        stepHandler18.handleStep(stepInterpolator19, true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.9d + "'", double9 == 0.9d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler18);
    }

    @Test
    public void test16635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16635");
        double[] doubleArray8 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray11 = null;
        double[] doubleArray18 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray11, doubleArray18);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray8, doubleArray11);
        highamHall54Integrator20.setMaxGrowth((double) 1.0f);
        double double23 = highamHall54Integrator20.getMinReduction();
        highamHall54Integrator20.setInitialStepSize(1.0d);
        double double26 = highamHall54Integrator20.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test16636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16636");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        highamHall54Integrator4.setMaxGrowth((double) 10);
        double double16 = highamHall54Integrator4.getMinReduction();
        double double17 = highamHall54Integrator4.getMaxStep();
        double double18 = highamHall54Integrator4.getMinStep();
        double double19 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth(56.568542494923804d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 10, 10.0d, (double) 10, Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator26.getStepHandler();
        double double28 = highamHall54Integrator26.getCurrentStepStart();
        highamHall54Integrator26.setInitialStepSize((double) (byte) 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, 100.0d, (double) (short) -1, (double) 10);
        double double36 = highamHall54Integrator35.getCurrentStepStart();
        double double37 = highamHall54Integrator35.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler43 = highamHall54Integrator42.getStepHandler();
        double double44 = highamHall54Integrator42.getMinStep();
        double double45 = highamHall54Integrator42.getCurrentSignedStepsize();
        highamHall54Integrator42.setInitialStepSize(10.0d);
        double double48 = highamHall54Integrator42.getMinStep();
        double double49 = highamHall54Integrator42.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler55 = highamHall54Integrator54.getStepHandler();
        double double56 = highamHall54Integrator54.getMinStep();
        double double57 = highamHall54Integrator54.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler58 = highamHall54Integrator54.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator59 = null;
        stepHandler58.handleStep(stepInterpolator59, false);
        highamHall54Integrator42.setStepHandler(stepHandler58);
        highamHall54Integrator35.setStepHandler(stepHandler58);
        stepHandler58.reset();
        highamHall54Integrator26.setStepHandler(stepHandler58);
        stepHandler58.reset();
        highamHall54Integrator4.setStepHandler(stepHandler58);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler43);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(stepHandler55);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler58);
    }

    @Test
    public void test16637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16637");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler18 = null;
        highamHall54Integrator17.setStepHandler(stepHandler18);
        double double20 = highamHall54Integrator17.getCurrentSignedStepsize();
        double double21 = highamHall54Integrator17.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator26.getStepHandler();
        highamHall54Integrator17.setStepHandler(stepHandler27);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        stepHandler27.handleStep(stepInterpolator29, true);
        highamHall54Integrator4.setStepHandler(stepHandler27);
        org.apache.commons.math.ode.StepHandler stepHandler33 = highamHall54Integrator4.getStepHandler();
        double double34 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler40 = highamHall54Integrator39.getStepHandler();
        double double41 = highamHall54Integrator39.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator39.getStepHandler();
        java.lang.String str43 = highamHall54Integrator39.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler49 = highamHall54Integrator48.getStepHandler();
        highamHall54Integrator48.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler52 = highamHall54Integrator48.getStepHandler();
        boolean boolean53 = stepHandler52.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator54 = null;
        stepHandler52.handleStep(stepInterpolator54, true);
        highamHall54Integrator39.setStepHandler(stepHandler52);
        stepHandler52.reset();
        highamHall54Integrator4.setStepHandler(stepHandler52);
        org.apache.commons.math.ode.StepHandler stepHandler60 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setSafety((double) 10L);
        highamHall54Integrator4.setSafety(1.4142135623730951d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(stepHandler40);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Higham-Hall 5(4)" + "'", str43, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertNotNull(stepHandler52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(stepHandler60);
    }

    @Test
    public void test16638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16638");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler6.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler6.evaluateStep(stepInterpolator9);
        double[] doubleArray14 = null;
        double[] doubleArray21 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray14, doubleArray21);
        boolean boolean23 = switchingFunctionsHandler6.reset(100.0d, doubleArray14);
        double[] doubleArray30 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler31 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator32 = null;
        boolean boolean33 = switchingFunctionsHandler31.evaluateStep(stepInterpolator32);
        double double34 = switchingFunctionsHandler31.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        switchingFunctionsHandler31.add(switchingFunction35, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        boolean boolean43 = switchingFunctionsHandler41.evaluateStep(stepInterpolator42);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler45 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator46 = null;
        boolean boolean47 = switchingFunctionsHandler45.evaluateStep(stepInterpolator46);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator48 = null;
        boolean boolean49 = switchingFunctionsHandler45.evaluateStep(stepInterpolator48);
        double[] doubleArray55 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler45.stepAccepted((double) (byte) 1, doubleArray55);
        boolean boolean57 = switchingFunctionsHandler41.reset((double) (byte) 1, doubleArray55);
        boolean boolean58 = switchingFunctionsHandler31.reset((double) '4', doubleArray55);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray30, doubleArray55);
        boolean boolean60 = switchingFunctionsHandler6.reset(0.0d, doubleArray30);
        double double61 = switchingFunctionsHandler6.getEventTime();
        boolean boolean62 = switchingFunctionsHandler6.isEmpty();
        boolean boolean63 = switchingFunctionsHandler6.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator64 = null;
        boolean boolean65 = switchingFunctionsHandler6.evaluateStep(stepInterpolator64);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler67 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator68 = null;
        boolean boolean69 = switchingFunctionsHandler67.evaluateStep(stepInterpolator68);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction70 = null;
        switchingFunctionsHandler67.add(switchingFunction70, (double) 10, (double) 1.0f, (int) '4');
        boolean boolean75 = switchingFunctionsHandler67.stop();
        boolean boolean76 = switchingFunctionsHandler67.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction77 = null;
        switchingFunctionsHandler67.add(switchingFunction77, (double) (short) 10, (double) '#', (int) (short) -1);
        boolean boolean82 = switchingFunctionsHandler67.stop();
        double[] doubleArray86 = new double[] { ' ', 1 };
        boolean boolean87 = switchingFunctionsHandler67.reset((double) 10L, doubleArray86);
        boolean boolean88 = switchingFunctionsHandler6.reset((double) (short) 10, doubleArray86);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray86);
        boolean boolean90 = switchingFunctionsHandler0.isEmpty();
        boolean boolean91 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction92 = null;
        switchingFunctionsHandler0.add(switchingFunction92, 17.752843424574987d, 22.02271554554524d, (int) (short) 100);
        double double97 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double61));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[32.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double97));
    }

    @Test
    public void test16639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16639");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(22.80350850198276d, (double) (byte) 1, 22.80350850198276d, 24.947901585376336d);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test16640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16640");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setInitialStepSize((double) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction10, (double) 0.0f, (double) (byte) 1, 100);
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        double double16 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        stepHandler17.handleStep(stepInterpolator18, false);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
    }

    @Test
    public void test16641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16641");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double double12 = highamHall54Integrator4.getCurrentStepStart();
        double double13 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        int int15 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator20.getStepHandler();
        double double22 = highamHall54Integrator20.getMinStep();
        double double23 = highamHall54Integrator20.getCurrentSignedStepsize();
        highamHall54Integrator20.setInitialStepSize(10.0d);
        double double26 = highamHall54Integrator20.getMinStep();
        double double27 = highamHall54Integrator20.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler33 = highamHall54Integrator32.getStepHandler();
        double double34 = highamHall54Integrator32.getMinStep();
        double double35 = highamHall54Integrator32.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator32.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        stepHandler36.handleStep(stepInterpolator37, false);
        highamHall54Integrator20.setStepHandler(stepHandler36);
        highamHall54Integrator20.setMinReduction(31.144823004794873d);
        highamHall54Integrator20.setMinReduction((double) 1);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler50 = null;
        highamHall54Integrator49.setStepHandler(stepHandler50);
        double double52 = highamHall54Integrator49.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler53 = null;
        highamHall54Integrator49.setStepHandler(stepHandler53);
        double double55 = highamHall54Integrator49.getMaxStep();
        double double56 = highamHall54Integrator49.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler62 = highamHall54Integrator61.getStepHandler();
        highamHall54Integrator49.setStepHandler(stepHandler62);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator68 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler69 = null;
        highamHall54Integrator68.setStepHandler(stepHandler69);
        double double71 = highamHall54Integrator68.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler72 = null;
        highamHall54Integrator68.setStepHandler(stepHandler72);
        double double74 = highamHall54Integrator68.getMaxStep();
        double double75 = highamHall54Integrator68.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator80 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler81 = highamHall54Integrator80.getStepHandler();
        highamHall54Integrator68.setStepHandler(stepHandler81);
        highamHall54Integrator49.setStepHandler(stepHandler81);
        double double84 = highamHall54Integrator49.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler85 = highamHall54Integrator49.getStepHandler();
        highamHall54Integrator20.setStepHandler(stepHandler85);
        highamHall54Integrator4.setStepHandler(stepHandler85);
        boolean boolean88 = stepHandler85.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler62);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + (-1.0d) + "'", double74 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 10.0d + "'", double75 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler81);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler85);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test16642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16642");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        int int11 = highamHall54Integrator4.getOrder();
        double double12 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, (double) (short) 100, (double) '4', 3);
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction20, (double) 5, 5.0d, (int) (short) 1);
        int int25 = highamHall54Integrator4.getOrder();
        java.lang.String str26 = highamHall54Integrator4.getName();
        int int27 = highamHall54Integrator4.getOrder();
        double double28 = highamHall54Integrator4.getMinReduction();
        double double29 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setInitialStepSize((double) 100);
        int int32 = highamHall54Integrator4.getOrder();
        double double33 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Higham-Hall 5(4)" + "'", str26, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.2d + "'", double28 == 0.2d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 5 + "'", int32 == 5);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
    }

    @Test
    public void test16643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16643");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray8, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler0.reset(100.0d, doubleArray8);
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        boolean boolean19 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test16644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16644");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 0, (double) 10L, 31.144823004794873d, 2.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator9 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler10 = null;
        highamHall54Integrator9.setStepHandler(stepHandler10);
        double double12 = highamHall54Integrator9.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler13 = null;
        highamHall54Integrator9.setStepHandler(stepHandler13);
        double double15 = highamHall54Integrator9.getMaxStep();
        double double16 = highamHall54Integrator9.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator9.setStepHandler(stepHandler22);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        highamHall54Integrator9.addSwitchingFunction(switchingFunction24, (double) '4', 1.0d, (int) (short) -1);
        double double29 = highamHall54Integrator9.getMaxStep();
        double double30 = highamHall54Integrator9.getSafety();
        highamHall54Integrator9.setMaxGrowth((double) 10);
        double double33 = highamHall54Integrator9.getCurrentStepStart();
        java.lang.String str34 = highamHall54Integrator9.getName();
        highamHall54Integrator9.setSafety((double) 0L);
        java.lang.String str37 = highamHall54Integrator9.getName();
        java.lang.String str38 = highamHall54Integrator9.getName();
        org.apache.commons.math.ode.StepHandler stepHandler39 = highamHall54Integrator9.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler39);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator41 = null;
        stepHandler39.handleStep(stepInterpolator41, false);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.9d + "'", double30 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Higham-Hall 5(4)" + "'", str34, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Higham-Hall 5(4)" + "'", str37, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Higham-Hall 5(4)" + "'", str38, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler39);
    }

    @Test
    public void test16645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16645");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) -1, 12.823355189994377d, (double) 10.0f, 7.211102550927978d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        java.lang.String str6 = highamHall54Integrator4.getName();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
    }

    @Test
    public void test16646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16646");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str8 = highamHall54Integrator4.getName();
        double double9 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler15 = null;
        highamHall54Integrator14.setStepHandler(stepHandler15);
        double double17 = highamHall54Integrator14.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler18 = null;
        highamHall54Integrator14.setStepHandler(stepHandler18);
        double double20 = highamHall54Integrator14.getMaxStep();
        double double21 = highamHall54Integrator14.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator26.getStepHandler();
        highamHall54Integrator14.setStepHandler(stepHandler27);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        highamHall54Integrator14.addSwitchingFunction(switchingFunction29, (double) '4', 1.0d, (int) (short) -1);
        double double34 = highamHall54Integrator14.getMaxStep();
        int int35 = highamHall54Integrator14.getOrder();
        java.lang.String str36 = highamHall54Integrator14.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction37 = null;
        highamHall54Integrator14.addSwitchingFunction(switchingFunction37, (double) 100.0f, (double) 0, (int) (short) 10);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator46.getStepHandler();
        double double48 = highamHall54Integrator46.getMinStep();
        double double49 = highamHall54Integrator46.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler50 = highamHall54Integrator46.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler56 = highamHall54Integrator55.getStepHandler();
        highamHall54Integrator55.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler59 = highamHall54Integrator55.getStepHandler();
        boolean boolean60 = stepHandler59.requiresDenseOutput();
        highamHall54Integrator46.setStepHandler(stepHandler59);
        boolean boolean62 = stepHandler59.requiresDenseOutput();
        highamHall54Integrator14.setStepHandler(stepHandler59);
        highamHall54Integrator4.setStepHandler(stepHandler59);
        highamHall54Integrator4.setInitialStepSize(35.0d);
        java.lang.Class<?> wildcardClass67 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Higham-Hall 5(4)" + "'", str36, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertNotNull(stepHandler56);
        org.junit.Assert.assertNotNull(stepHandler59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test16647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16647");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler16);
        int int18 = highamHall54Integrator4.getOrder();
        java.lang.String str19 = highamHall54Integrator4.getName();
        java.lang.String str20 = highamHall54Integrator4.getName();
        double double21 = highamHall54Integrator4.getCurrentStepStart();
        int int22 = highamHall54Integrator4.getOrder();
        double double23 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setInitialStepSize((double) '4');
        double double26 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Higham-Hall 5(4)" + "'", str20, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test16648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16648");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 10, 10.0d, (double) 10, Double.NaN);
        highamHall54Integrator4.setSafety((double) '4');
        highamHall54Integrator4.setMaxGrowth(0.0d);
        double double9 = highamHall54Integrator4.getMinReduction();
        highamHall54Integrator4.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator4.getStepHandler();
        java.lang.String str13 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, (double) (byte) 0, (double) (-1), (int) (byte) -1);
        java.lang.String str19 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator4.getStepHandler();
        int int21 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler27 = null;
        highamHall54Integrator26.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator26.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler30 = null;
        highamHall54Integrator26.setStepHandler(stepHandler30);
        double double32 = highamHall54Integrator26.getMaxStep();
        double double33 = highamHall54Integrator26.getMinStep();
        double double34 = highamHall54Integrator26.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler40 = highamHall54Integrator39.getStepHandler();
        highamHall54Integrator39.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler43 = highamHall54Integrator39.getStepHandler();
        boolean boolean44 = stepHandler43.requiresDenseOutput();
        highamHall54Integrator26.setStepHandler(stepHandler43);
        double double46 = highamHall54Integrator26.getSafety();
        java.lang.String str47 = highamHall54Integrator26.getName();
        org.apache.commons.math.ode.StepHandler stepHandler48 = highamHall54Integrator26.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler48);
        highamHall54Integrator4.setInitialStepSize(0.9d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction52, 22.80350850198276d, 0.9d, 100);
        double double57 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler58 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.2d + "'", double9 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(stepHandler40);
        org.junit.Assert.assertNotNull(stepHandler43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9d + "'", double46 == 0.9d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Higham-Hall 5(4)" + "'", str47, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler58);
    }

    @Test
    public void test16649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16649");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator17.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator17.getStepHandler();
        boolean boolean22 = stepHandler21.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler21);
        double double24 = highamHall54Integrator4.getSafety();
        java.lang.String str25 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setSafety((double) '#');
        java.lang.String str28 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 0.2d, (double) (-1L), (double) (byte) -1);
        double double34 = highamHall54Integrator33.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler35 = highamHall54Integrator33.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler35);
        java.lang.String str37 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction(1.0d);
        double double40 = highamHall54Integrator4.getMaxStep();
        int int41 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9d + "'", double24 == 0.9d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Higham-Hall 5(4)" + "'", str28, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Higham-Hall 5(4)" + "'", str37, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 5 + "'", int41 == 5);
        org.junit.Assert.assertNotNull(stepHandler42);
    }

    @Test
    public void test16650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16650");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        boolean boolean3 = switchingFunctionsHandler0.stop();
        boolean boolean4 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler6.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        switchingFunctionsHandler6.add(switchingFunction9, (double) 10, (double) 1.0f, (int) '4');
        boolean boolean14 = switchingFunctionsHandler6.stop();
        boolean boolean15 = switchingFunctionsHandler6.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        switchingFunctionsHandler6.add(switchingFunction16, (double) (short) 10, (double) '#', (int) (short) -1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean23 = switchingFunctionsHandler22.isEmpty();
        boolean boolean24 = switchingFunctionsHandler22.stop();
        double double25 = switchingFunctionsHandler22.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        switchingFunctionsHandler22.add(switchingFunction26, 0.0d, (double) (short) 100, 1);
        double[] doubleArray37 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler38 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator39 = null;
        boolean boolean40 = switchingFunctionsHandler38.evaluateStep(stepInterpolator39);
        double double41 = switchingFunctionsHandler38.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        switchingFunctionsHandler38.add(switchingFunction42, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler48 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator49 = null;
        boolean boolean50 = switchingFunctionsHandler48.evaluateStep(stepInterpolator49);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler52 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator53 = null;
        boolean boolean54 = switchingFunctionsHandler52.evaluateStep(stepInterpolator53);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator55 = null;
        boolean boolean56 = switchingFunctionsHandler52.evaluateStep(stepInterpolator55);
        double[] doubleArray62 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler52.stepAccepted((double) (byte) 1, doubleArray62);
        boolean boolean64 = switchingFunctionsHandler48.reset((double) (byte) 1, doubleArray62);
        boolean boolean65 = switchingFunctionsHandler38.reset((double) '4', doubleArray62);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator66 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray37, doubleArray62);
        boolean boolean67 = switchingFunctionsHandler22.reset((double) (byte) 1, doubleArray62);
        boolean boolean68 = switchingFunctionsHandler6.reset((double) 0, doubleArray62);
        boolean boolean69 = switchingFunctionsHandler0.reset((double) 5, doubleArray62);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test16651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16651");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator17.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator17.getStepHandler();
        boolean boolean22 = stepHandler21.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler21);
        double double24 = highamHall54Integrator4.getSafety();
        java.lang.String str25 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setSafety((double) '#');
        java.lang.String str28 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction((double) (-1L));
        double double31 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double32 = highamHall54Integrator4.getMaxStep();
        double double33 = highamHall54Integrator4.getMaxGrowth();
        double double34 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler40 = highamHall54Integrator39.getStepHandler();
        highamHall54Integrator39.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler48 = highamHall54Integrator47.getStepHandler();
        highamHall54Integrator47.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler51 = highamHall54Integrator47.getStepHandler();
        highamHall54Integrator39.setStepHandler(stepHandler51);
        int int53 = highamHall54Integrator39.getOrder();
        java.lang.String str54 = highamHall54Integrator39.getName();
        org.apache.commons.math.ode.StepHandler stepHandler55 = highamHall54Integrator39.getStepHandler();
        double double56 = highamHall54Integrator39.getCurrentStepStart();
        double double57 = highamHall54Integrator39.getSafety();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler63 = highamHall54Integrator62.getStepHandler();
        double double64 = highamHall54Integrator62.getMinStep();
        double double65 = highamHall54Integrator62.getCurrentSignedStepsize();
        highamHall54Integrator62.setInitialStepSize(10.0d);
        double double68 = highamHall54Integrator62.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler69 = highamHall54Integrator62.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler70 = highamHall54Integrator62.getStepHandler();
        highamHall54Integrator39.setStepHandler(stepHandler70);
        highamHall54Integrator4.setStepHandler(stepHandler70);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9d + "'", double24 == 0.9d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Higham-Hall 5(4)" + "'", str28, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler40);
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Higham-Hall 5(4)" + "'", str54, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler55);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.9d + "'", double57 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double65));
        org.junit.Assert.assertTrue(Double.isNaN(double68));
        org.junit.Assert.assertNotNull(stepHandler69);
        org.junit.Assert.assertNotNull(stepHandler70);
    }

    @Test
    public void test16652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16652");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(32.0d, 9.486832980505138d, 22.22397209204091d, 2.514866859365871d);
    }

    @Test
    public void test16653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16653");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler24 = null;
        highamHall54Integrator23.setStepHandler(stepHandler24);
        double double26 = highamHall54Integrator23.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = null;
        highamHall54Integrator23.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator23.getMaxStep();
        double double30 = highamHall54Integrator23.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator23.setStepHandler(stepHandler36);
        highamHall54Integrator4.setStepHandler(stepHandler36);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction39, (double) (-1L), (double) 1L, (-1));
        highamHall54Integrator4.setInitialStepSize((double) (short) 10);
        double double46 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction47, 0.0d, (double) (short) 1, (int) ' ');
        highamHall54Integrator4.setMaxGrowth(100.0d);
        java.lang.String str54 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction55, 5.0d, (double) 1, 100);
        java.lang.String str60 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction61 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction61, 3.1622776601683795d, (double) (short) 1, 0);
        double double66 = highamHall54Integrator4.getCurrentStepStart();
        double double67 = highamHall54Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9d + "'", double46 == 0.9d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Higham-Hall 5(4)" + "'", str54, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Higham-Hall 5(4)" + "'", str60, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
    }

    @Test
    public void test16654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16654");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray8, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler0.reset(100.0d, doubleArray8);
        double[] doubleArray24 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler25.evaluateStep(stepInterpolator26);
        double double28 = switchingFunctionsHandler25.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        switchingFunctionsHandler25.add(switchingFunction29, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler35 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler35.evaluateStep(stepInterpolator36);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        boolean boolean41 = switchingFunctionsHandler39.evaluateStep(stepInterpolator40);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        boolean boolean43 = switchingFunctionsHandler39.evaluateStep(stepInterpolator42);
        double[] doubleArray49 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler39.stepAccepted((double) (byte) 1, doubleArray49);
        boolean boolean51 = switchingFunctionsHandler35.reset((double) (byte) 1, doubleArray49);
        boolean boolean52 = switchingFunctionsHandler25.reset((double) '4', doubleArray49);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray24, doubleArray49);
        boolean boolean54 = switchingFunctionsHandler0.reset(0.0d, doubleArray24);
        boolean boolean55 = switchingFunctionsHandler0.isEmpty();
        boolean boolean56 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator57 = null;
        boolean boolean58 = switchingFunctionsHandler0.evaluateStep(stepInterpolator57);
        boolean boolean59 = switchingFunctionsHandler0.stop();
        double double60 = switchingFunctionsHandler0.getEventTime();
        boolean boolean61 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test16655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16655");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (-1.0d), (double) (short) 10, (int) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        double double14 = highamHall54Integrator4.getSafety();
        int int15 = highamHall54Integrator4.getOrder();
        double double16 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 0.2d, (double) (-1L), (double) (byte) -1);
        double double22 = highamHall54Integrator21.getCurrentStepStart();
        highamHall54Integrator21.setSafety((double) (byte) 1);
        double double25 = highamHall54Integrator21.getMaxGrowth();
        highamHall54Integrator21.setInitialStepSize((double) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler28);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler35 = highamHall54Integrator34.getStepHandler();
        double double36 = highamHall54Integrator34.getMinStep();
        double double37 = highamHall54Integrator34.getCurrentSignedStepsize();
        highamHall54Integrator34.setInitialStepSize(10.0d);
        double double40 = highamHall54Integrator34.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler41 = highamHall54Integrator34.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler41);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.9d + "'", double14 == 0.9d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(stepHandler41);
    }

    @Test
    public void test16656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16656");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray4 = null;
        double[] doubleArray11 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray4, doubleArray11);
        switchingFunctionsHandler0.stepAccepted((double) 10L, doubleArray4);
        boolean boolean14 = switchingFunctionsHandler0.isEmpty();
        double double15 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        switchingFunctionsHandler0.add(switchingFunction16, (double) 3, 2.8230477686716258d, (int) (byte) 0);
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test16657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16657");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 'a', (double) (short) 0, (double) (-1));
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double7 = highamHall54Integrator4.getMaxStep();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth(59.16079783099616d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 31.144823004794873d + "'", double6 == 31.144823004794873d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 97.0d + "'", double7 == 97.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 31.144823004794873d + "'", double8 == 31.144823004794873d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test16658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16658");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 3);
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler9 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 5);
        int int12 = highamHall54Integrator4.getOrder();
        double double13 = highamHall54Integrator4.getMaxStep();
        double double14 = highamHall54Integrator4.getMaxGrowth();
        double double15 = highamHall54Integrator4.getMaxGrowth();
        double double16 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double17 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(stepHandler9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test16659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16659");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) 1, 52.0d, 5.0d);
        int int5 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test16660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16660");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 3);
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        highamHall54Integrator4.setMaxGrowth((double) (byte) 100);
        double double12 = highamHall54Integrator4.getMaxStep();
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) 10.0f);
        int int16 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) 1L);
        double double19 = highamHall54Integrator4.getMinReduction();
        int int20 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setSafety(1.4142135623730951d);
        double double23 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2d + "'", double19 == 0.2d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test16661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16661");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 100.0f, (double) 10L, (int) 'a');
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety((double) 1L);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator21.setInitialStepSize((double) 3);
        double double25 = highamHall54Integrator21.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator30 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler31 = highamHall54Integrator30.getStepHandler();
        highamHall54Integrator30.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler39 = null;
        highamHall54Integrator38.setStepHandler(stepHandler39);
        double double41 = highamHall54Integrator38.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler42 = null;
        highamHall54Integrator38.setStepHandler(stepHandler42);
        double double44 = highamHall54Integrator38.getMaxStep();
        double double45 = highamHall54Integrator38.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler51 = highamHall54Integrator50.getStepHandler();
        highamHall54Integrator38.setStepHandler(stepHandler51);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler58 = null;
        highamHall54Integrator57.setStepHandler(stepHandler58);
        double double60 = highamHall54Integrator57.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler61 = null;
        highamHall54Integrator57.setStepHandler(stepHandler61);
        double double63 = highamHall54Integrator57.getMaxStep();
        double double64 = highamHall54Integrator57.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator69 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler70 = highamHall54Integrator69.getStepHandler();
        highamHall54Integrator57.setStepHandler(stepHandler70);
        highamHall54Integrator38.setStepHandler(stepHandler70);
        highamHall54Integrator30.setStepHandler(stepHandler70);
        highamHall54Integrator21.setStepHandler(stepHandler70);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator75 = null;
        stepHandler70.handleStep(stepInterpolator75, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator78 = null;
        stepHandler70.handleStep(stepInterpolator78, false);
        highamHall54Integrator4.setStepHandler(stepHandler70);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator82 = null;
        stepHandler70.handleStep(stepInterpolator82, false);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + (-1.0d) + "'", double44 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler70);
    }

    @Test
    public void test16662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16662");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double9 = highamHall54Integrator4.getMinStep();
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = null;
        highamHall54Integrator16.setStepHandler(stepHandler17);
        double double19 = highamHall54Integrator16.getCurrentSignedStepsize();
        double double20 = highamHall54Integrator16.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator25.getStepHandler();
        highamHall54Integrator16.setStepHandler(stepHandler26);
        java.lang.String str28 = highamHall54Integrator16.getName();
        org.apache.commons.math.ode.StepHandler stepHandler29 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler29);
        double double31 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double32 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Higham-Hall 5(4)" + "'", str28, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test16663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16663");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        java.lang.String str8 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator13 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator13.getStepHandler();
        highamHall54Integrator13.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator13.getStepHandler();
        boolean boolean18 = stepHandler17.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        stepHandler17.handleStep(stepInterpolator19, true);
        highamHall54Integrator4.setStepHandler(stepHandler17);
        java.lang.String str23 = highamHall54Integrator4.getName();
        double double24 = highamHall54Integrator4.getCurrentStepStart();
        double double25 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety((double) 0);
        double double28 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double29 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) 1L, 0.0d, 0.0d);
        double double35 = highamHall54Integrator34.getCurrentStepStart();
        int int36 = highamHall54Integrator34.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, 100.0d, (double) (short) -1, (double) 10);
        double double42 = highamHall54Integrator41.getCurrentStepStart();
        double double43 = highamHall54Integrator41.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler49 = highamHall54Integrator48.getStepHandler();
        double double50 = highamHall54Integrator48.getMinStep();
        double double51 = highamHall54Integrator48.getCurrentSignedStepsize();
        highamHall54Integrator48.setInitialStepSize(10.0d);
        double double54 = highamHall54Integrator48.getMinStep();
        double double55 = highamHall54Integrator48.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler61 = highamHall54Integrator60.getStepHandler();
        double double62 = highamHall54Integrator60.getMinStep();
        double double63 = highamHall54Integrator60.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler64 = highamHall54Integrator60.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator65 = null;
        stepHandler64.handleStep(stepInterpolator65, false);
        highamHall54Integrator48.setStepHandler(stepHandler64);
        highamHall54Integrator41.setStepHandler(stepHandler64);
        stepHandler64.reset();
        highamHall54Integrator34.setStepHandler(stepHandler64);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator72 = null;
        stepHandler64.handleStep(stepInterpolator72, false);
        stepHandler64.reset();
        stepHandler64.reset();
        stepHandler64.reset();
        stepHandler64.reset();
        boolean boolean79 = stepHandler64.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler64);
        java.lang.String str81 = highamHall54Integrator4.getName();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Higham-Hall 5(4)" + "'", str23, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 5 + "'", int36 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 100.0d + "'", double43 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler64);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "Higham-Hall 5(4)" + "'", str81, "Higham-Hall 5(4)");
    }

    @Test
    public void test16664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16664");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator13 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler14 = null;
        highamHall54Integrator13.setStepHandler(stepHandler14);
        double double16 = highamHall54Integrator13.getCurrentSignedStepsize();
        double double17 = highamHall54Integrator13.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator22.getStepHandler();
        highamHall54Integrator13.setStepHandler(stepHandler23);
        double double25 = highamHall54Integrator13.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        highamHall54Integrator13.addSwitchingFunction(switchingFunction26, (double) 1.0f, (double) (short) 1, (int) (byte) 10);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        double double37 = highamHall54Integrator35.getCurrentStepStart();
        double double38 = highamHall54Integrator35.getMaxStep();
        double double39 = highamHall54Integrator35.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler40 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator13.setStepHandler(stepHandler40);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        stepHandler40.handleStep(stepInterpolator42, false);
        stepHandler40.reset();
        boolean boolean46 = stepHandler40.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler40);
        highamHall54Integrator4.setInitialStepSize((double) '4');
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(stepHandler40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test16665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16665");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler15 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        boolean boolean17 = switchingFunctionsHandler15.evaluateStep(stepInterpolator16);
        double double18 = switchingFunctionsHandler15.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        switchingFunctionsHandler15.add(switchingFunction19, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler25.evaluateStep(stepInterpolator26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        boolean boolean31 = switchingFunctionsHandler29.evaluateStep(stepInterpolator30);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator32 = null;
        boolean boolean33 = switchingFunctionsHandler29.evaluateStep(stepInterpolator32);
        double[] doubleArray39 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler29.stepAccepted((double) (byte) 1, doubleArray39);
        boolean boolean41 = switchingFunctionsHandler25.reset((double) (byte) 1, doubleArray39);
        boolean boolean42 = switchingFunctionsHandler15.reset((double) '4', doubleArray39);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler43 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator44 = null;
        boolean boolean45 = switchingFunctionsHandler43.evaluateStep(stepInterpolator44);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler47 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator48 = null;
        boolean boolean49 = switchingFunctionsHandler47.evaluateStep(stepInterpolator48);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator50 = null;
        boolean boolean51 = switchingFunctionsHandler47.evaluateStep(stepInterpolator50);
        double[] doubleArray57 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler47.stepAccepted((double) (byte) 1, doubleArray57);
        boolean boolean59 = switchingFunctionsHandler43.reset((double) (byte) 1, doubleArray57);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, 0.0d, doubleArray39, doubleArray57);
        double double61 = highamHall54Integrator60.getMinStep();
        highamHall54Integrator60.setSafety((double) (byte) 10);
        java.lang.String str64 = highamHall54Integrator60.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator69 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 0.2d, (double) (-1L), (double) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler70 = highamHall54Integrator69.getStepHandler();
        highamHall54Integrator60.setStepHandler(stepHandler70);
        double double72 = highamHall54Integrator60.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler73 = highamHall54Integrator60.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator74 = null;
        stepHandler73.handleStep(stepInterpolator74, true);
        highamHall54Integrator4.setStepHandler(stepHandler73);
        double double78 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler79 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Higham-Hall 5(4)" + "'", str64, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler70);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 0.0d + "'", double72 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler73);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler79);
    }

    @Test
    public void test16666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16666");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (-1.0d), (double) (short) 10, (int) (byte) 1);
        highamHall54Integrator4.setMaxGrowth((double) (-1));
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, (double) 0.0f, (-0.0d), 1);
        int int21 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
    }

    @Test
    public void test16667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16667");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) 0L, (double) 3, (double) (short) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, 31.622776601683793d, Double.NaN, (int) (short) 100);
        highamHall54Integrator4.setInitialStepSize(2.514866859365871d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = highamHall54Integrator4.getStepHandler();
        double double13 = highamHall54Integrator4.getMinStep();
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test16668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16668");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, (double) (byte) 10, (double) 1.0f, 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction18, (double) (short) 100, 10.0d, (int) (byte) -1);
        double double23 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test16669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16669");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        double[] doubleArray10 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler0.stepAccepted((double) (byte) 1, doubleArray10);
        double[] doubleArray18 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler19 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator20 = null;
        boolean boolean21 = switchingFunctionsHandler19.evaluateStep(stepInterpolator20);
        double double22 = switchingFunctionsHandler19.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        switchingFunctionsHandler19.add(switchingFunction23, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        boolean boolean31 = switchingFunctionsHandler29.evaluateStep(stepInterpolator30);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler33 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator34 = null;
        boolean boolean35 = switchingFunctionsHandler33.evaluateStep(stepInterpolator34);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler33.evaluateStep(stepInterpolator36);
        double[] doubleArray43 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler33.stepAccepted((double) (byte) 1, doubleArray43);
        boolean boolean45 = switchingFunctionsHandler29.reset((double) (byte) 1, doubleArray43);
        boolean boolean46 = switchingFunctionsHandler19.reset((double) '4', doubleArray43);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray18, doubleArray43);
        boolean boolean48 = switchingFunctionsHandler0.reset((double) (byte) 0, doubleArray43);
        boolean boolean49 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator50 = null;
        boolean boolean51 = switchingFunctionsHandler0.evaluateStep(stepInterpolator50);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator52 = null;
        boolean boolean53 = switchingFunctionsHandler0.evaluateStep(stepInterpolator52);
        boolean boolean54 = switchingFunctionsHandler0.isEmpty();
        double double55 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator56 = null;
        boolean boolean57 = switchingFunctionsHandler0.evaluateStep(stepInterpolator56);
        double double58 = switchingFunctionsHandler0.getEventTime();
        double double59 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test16670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16670");
        double[] doubleArray10 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray13 = null;
        double[] doubleArray20 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray13, doubleArray20);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray10, doubleArray13);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler23 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        boolean boolean25 = switchingFunctionsHandler23.evaluateStep(stepInterpolator24);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator28 = null;
        boolean boolean29 = switchingFunctionsHandler27.evaluateStep(stepInterpolator28);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        boolean boolean31 = switchingFunctionsHandler27.evaluateStep(stepInterpolator30);
        double[] doubleArray37 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler27.stepAccepted((double) (byte) 1, doubleArray37);
        boolean boolean39 = switchingFunctionsHandler23.reset((double) (byte) 1, doubleArray37);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (byte) 100, doubleArray10, doubleArray37);
        double double41 = highamHall54Integrator40.getMinStep();
        double double42 = highamHall54Integrator40.getMaxGrowth();
        highamHall54Integrator40.setMinReduction((double) (short) -1);
        highamHall54Integrator40.setSafety(10.0d);
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator40.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator52 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler53 = highamHall54Integrator52.getStepHandler();
        double double54 = highamHall54Integrator52.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler55 = highamHall54Integrator52.getStepHandler();
        highamHall54Integrator52.setMaxGrowth((double) (byte) 0);
        double double58 = highamHall54Integrator52.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler59 = highamHall54Integrator52.getStepHandler();
        highamHall54Integrator40.setStepHandler(stepHandler59);
        double double61 = highamHall54Integrator40.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 100.0d + "'", double41 == 100.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertNotNull(stepHandler53);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler55);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(stepHandler59);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
    }

    @Test
    public void test16671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16671");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        highamHall54Integrator4.setMinReduction((double) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator4.getStepHandler();
        double double27 = highamHall54Integrator4.getSafety();
        double double28 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.9d + "'", double27 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
    }

    @Test
    public void test16672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16672");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 100.0f, (double) 10L, (int) 'a');
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety((double) 1L);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        java.lang.String str17 = highamHall54Integrator4.getName();
        java.lang.String str18 = highamHall54Integrator4.getName();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
    }

    @Test
    public void test16673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16673");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 'a', (double) (short) 0, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) 0, (double) 1L, (int) '4');
        java.lang.String str10 = highamHall54Integrator4.getName();
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        int int14 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator19.getStepHandler();
        double double21 = highamHall54Integrator19.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator19.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        stepHandler22.handleStep(stepInterpolator23, true);
        boolean boolean26 = stepHandler22.requiresDenseOutput();
        boolean boolean27 = stepHandler22.requiresDenseOutput();
        boolean boolean28 = stepHandler22.requiresDenseOutput();
        boolean boolean29 = stepHandler22.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler22);
        double double31 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth((double) (short) -1);
        highamHall54Integrator4.setInitialStepSize(14.142135623730951d);
        double double36 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        double double39 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 31.144823004794873d + "'", double12 == 31.144823004794873d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 31.144823004794873d + "'", double36 == 31.144823004794873d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
    }

    @Test
    public void test16674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16674");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator17.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator17.getStepHandler();
        boolean boolean22 = stepHandler21.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler21);
        double double24 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double25 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction26, (double) (short) -1, (double) (-1.0f), (int) (byte) -1);
        java.lang.String str31 = highamHall54Integrator4.getName();
        double double32 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Higham-Hall 5(4)" + "'", str31, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test16675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16675");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double double3 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction4 = null;
        switchingFunctionsHandler0.add(switchingFunction4, (double) 0L, (double) 0, (int) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        switchingFunctionsHandler0.add(switchingFunction9, (double) 2, (double) (byte) 1, (int) (short) 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler15 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator16 = null;
        boolean boolean17 = switchingFunctionsHandler15.evaluateStep(stepInterpolator16);
        double double18 = switchingFunctionsHandler15.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        switchingFunctionsHandler15.add(switchingFunction19, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler25.evaluateStep(stepInterpolator26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        boolean boolean31 = switchingFunctionsHandler29.evaluateStep(stepInterpolator30);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator32 = null;
        boolean boolean33 = switchingFunctionsHandler29.evaluateStep(stepInterpolator32);
        double[] doubleArray39 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler29.stepAccepted((double) (byte) 1, doubleArray39);
        boolean boolean41 = switchingFunctionsHandler25.reset((double) (byte) 1, doubleArray39);
        boolean boolean42 = switchingFunctionsHandler15.reset((double) '4', doubleArray39);
        boolean boolean43 = switchingFunctionsHandler15.stop();
        boolean boolean44 = switchingFunctionsHandler15.stop();
        double double45 = switchingFunctionsHandler15.getEventTime();
        double double46 = switchingFunctionsHandler15.getEventTime();
        double[] doubleArray60 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray63 = null;
        double[] doubleArray70 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator71 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray63, doubleArray70);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator72 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray60, doubleArray63);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler73 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator74 = null;
        boolean boolean75 = switchingFunctionsHandler73.evaluateStep(stepInterpolator74);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler77 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator78 = null;
        boolean boolean79 = switchingFunctionsHandler77.evaluateStep(stepInterpolator78);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator80 = null;
        boolean boolean81 = switchingFunctionsHandler77.evaluateStep(stepInterpolator80);
        double[] doubleArray87 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler77.stepAccepted((double) (byte) 1, doubleArray87);
        boolean boolean89 = switchingFunctionsHandler73.reset((double) (byte) 1, doubleArray87);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator90 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (byte) 100, doubleArray60, doubleArray87);
        double[] doubleArray91 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator92 = new org.apache.commons.math.ode.HighamHall54Integrator(3.1622776601683795d, 0.2d, doubleArray87, doubleArray91);
        boolean boolean93 = switchingFunctionsHandler15.reset(0.9d, doubleArray87);
        boolean boolean94 = switchingFunctionsHandler0.reset(0.0d, doubleArray87);
        double double95 = switchingFunctionsHandler0.getEventTime();
        boolean boolean96 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(doubleArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray87), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double95));
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test16676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16676");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100L, 0.0d, 10.0d, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMinReduction(0.0d);
        highamHall54Integrator4.setMinReduction(0.0d);
        double double10 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str11 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
    }

    @Test
    public void test16677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16677");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMinReduction(22.80350850198276d);
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator(17.78279410038923d, (double) '4', (double) 3, 32.0d);
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertNotNull(stepHandler17);
    }

    @Test
    public void test16678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16678");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        double double19 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 10, 10.0d, (double) 10, Double.NaN);
        highamHall54Integrator24.setSafety((double) '4');
        highamHall54Integrator24.setMaxGrowth(0.0d);
        double double29 = highamHall54Integrator24.getMinReduction();
        highamHall54Integrator24.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler32 = highamHall54Integrator24.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler32);
        double double34 = highamHall54Integrator4.getSafety();
        double double35 = highamHall54Integrator4.getSafety();
        java.lang.String str36 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler32);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.9d + "'", double34 == 0.9d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.9d + "'", double35 == 0.9d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Higham-Hall 5(4)" + "'", str36, "Higham-Hall 5(4)");
    }

    @Test
    public void test16679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16679");
        double[] doubleArray4 = new double[] { 100, 0.0d };
        double[] doubleArray10 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        boolean boolean13 = switchingFunctionsHandler11.evaluateStep(stepInterpolator12);
        double double14 = switchingFunctionsHandler11.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        switchingFunctionsHandler11.add(switchingFunction15, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler21 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator22 = null;
        boolean boolean23 = switchingFunctionsHandler21.evaluateStep(stepInterpolator22);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler25.evaluateStep(stepInterpolator26);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator28 = null;
        boolean boolean29 = switchingFunctionsHandler25.evaluateStep(stepInterpolator28);
        double[] doubleArray35 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler25.stepAccepted((double) (byte) 1, doubleArray35);
        boolean boolean37 = switchingFunctionsHandler21.reset((double) (byte) 1, doubleArray35);
        boolean boolean38 = switchingFunctionsHandler11.reset((double) '4', doubleArray35);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator39 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray10, doubleArray35);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, (double) 1L, doubleArray4, doubleArray35);
        double double41 = highamHall54Integrator40.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator40.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler48 = null;
        highamHall54Integrator47.setStepHandler(stepHandler48);
        double double50 = highamHall54Integrator47.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler51 = null;
        highamHall54Integrator47.setStepHandler(stepHandler51);
        double double53 = highamHall54Integrator47.getMaxStep();
        double double54 = highamHall54Integrator47.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler60 = highamHall54Integrator59.getStepHandler();
        highamHall54Integrator47.setStepHandler(stepHandler60);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction62 = null;
        highamHall54Integrator47.addSwitchingFunction(switchingFunction62, (double) '4', 1.0d, (int) (short) -1);
        double double67 = highamHall54Integrator47.getMaxStep();
        double double68 = highamHall54Integrator47.getSafety();
        highamHall54Integrator47.setInitialStepSize(0.0d);
        double double71 = highamHall54Integrator47.getMinStep();
        highamHall54Integrator47.setMaxGrowth((double) (short) 100);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler79 = highamHall54Integrator78.getStepHandler();
        highamHall54Integrator78.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler82 = highamHall54Integrator78.getStepHandler();
        java.lang.String str83 = highamHall54Integrator78.getName();
        org.apache.commons.math.ode.StepHandler stepHandler84 = highamHall54Integrator78.getStepHandler();
        highamHall54Integrator47.setStepHandler(stepHandler84);
        highamHall54Integrator40.setStepHandler(stepHandler84);
        java.lang.String str87 = highamHall54Integrator40.getName();
        org.junit.Assert.assertNotNull(doubleArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray4), "[100.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler60);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + (-1.0d) + "'", double67 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.9d + "'", double68 == 0.9d);
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler79);
        org.junit.Assert.assertNotNull(stepHandler82);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "Higham-Hall 5(4)" + "'", str83, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler84);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "Higham-Hall 5(4)" + "'", str87, "Higham-Hall 5(4)");
    }

    @Test
    public void test16680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16680");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler2.evaluateStep(stepInterpolator3);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler6.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler6.evaluateStep(stepInterpolator9);
        double[] doubleArray16 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler6.stepAccepted((double) (byte) 1, doubleArray16);
        boolean boolean18 = switchingFunctionsHandler2.reset((double) (byte) 1, doubleArray16);
        double[] doubleArray24 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler25.evaluateStep(stepInterpolator26);
        double double28 = switchingFunctionsHandler25.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        switchingFunctionsHandler25.add(switchingFunction29, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler35 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler35.evaluateStep(stepInterpolator36);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        boolean boolean41 = switchingFunctionsHandler39.evaluateStep(stepInterpolator40);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        boolean boolean43 = switchingFunctionsHandler39.evaluateStep(stepInterpolator42);
        double[] doubleArray49 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler39.stepAccepted((double) (byte) 1, doubleArray49);
        boolean boolean51 = switchingFunctionsHandler35.reset((double) (byte) 1, doubleArray49);
        boolean boolean52 = switchingFunctionsHandler25.reset((double) '4', doubleArray49);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray24, doubleArray49);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (short) 1, doubleArray16, doubleArray24);
        double double55 = highamHall54Integrator54.getCurrentSignedStepsize();
        int int56 = highamHall54Integrator54.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        highamHall54Integrator54.addSwitchingFunction(switchingFunction57, (double) 1L, 0.0d, 1);
        highamHall54Integrator54.setMaxGrowth(9.848857801796104d);
        double double64 = highamHall54Integrator54.getCurrentStepStart();
        java.lang.String str65 = highamHall54Integrator54.getName();
        highamHall54Integrator54.setInitialStepSize(52.0d);
        java.lang.String str68 = highamHall54Integrator54.getName();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 5 + "'", int56 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Higham-Hall 5(4)" + "'", str65, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Higham-Hall 5(4)" + "'", str68, "Higham-Hall 5(4)");
    }

    @Test
    public void test16681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16681");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator18 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator18.getStepHandler();
        double double20 = highamHall54Integrator18.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator18.getStepHandler();
        java.lang.String str22 = highamHall54Integrator18.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator27.getStepHandler();
        highamHall54Integrator27.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler31 = highamHall54Integrator27.getStepHandler();
        boolean boolean32 = stepHandler31.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator33 = null;
        stepHandler31.handleStep(stepInterpolator33, true);
        highamHall54Integrator18.setStepHandler(stepHandler31);
        boolean boolean37 = stepHandler31.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        stepHandler31.handleStep(stepInterpolator38, true);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator41 = null;
        stepHandler31.handleStep(stepInterpolator41, false);
        highamHall54Integrator4.setStepHandler(stepHandler31);
        double double45 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler46 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertNotNull(stepHandler46);
    }

    @Test
    public void test16682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16682");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 10);
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction29, (double) ' ', (double) 100L, 0);
        java.lang.String str34 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction35, (double) 'a', (double) 'a', (int) (short) 100);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (short) 1, 97.0d, (-1.0d));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler50 = highamHall54Integrator49.getStepHandler();
        double double51 = highamHall54Integrator49.getMinStep();
        double double52 = highamHall54Integrator49.getCurrentSignedStepsize();
        int int53 = highamHall54Integrator49.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler54 = highamHall54Integrator49.getStepHandler();
        highamHall54Integrator44.setStepHandler(stepHandler54);
        highamHall54Integrator4.setStepHandler(stepHandler54);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator61 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler62 = highamHall54Integrator61.getStepHandler();
        double double63 = highamHall54Integrator61.getMinStep();
        double double64 = highamHall54Integrator61.getCurrentSignedStepsize();
        highamHall54Integrator61.setInitialStepSize(10.0d);
        double double67 = highamHall54Integrator61.getMinStep();
        highamHall54Integrator61.setInitialStepSize((double) (-1));
        org.apache.commons.math.ode.StepHandler stepHandler70 = highamHall54Integrator61.getStepHandler();
        java.lang.String str71 = highamHall54Integrator61.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator76 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler77 = highamHall54Integrator76.getStepHandler();
        double double78 = highamHall54Integrator76.getCurrentStepStart();
        double double79 = highamHall54Integrator76.getCurrentSignedStepsize();
        highamHall54Integrator76.setInitialStepSize((double) (byte) 100);
        double double82 = highamHall54Integrator76.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler83 = highamHall54Integrator76.getStepHandler();
        highamHall54Integrator61.setStepHandler(stepHandler83);
        highamHall54Integrator4.setStepHandler(stepHandler83);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Higham-Hall 5(4)" + "'", str34, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
        org.junit.Assert.assertNotNull(stepHandler54);
        org.junit.Assert.assertNotNull(stepHandler62);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Higham-Hall 5(4)" + "'", str71, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler77);
        org.junit.Assert.assertTrue(Double.isNaN(double78));
        org.junit.Assert.assertTrue(Double.isNaN(double79));
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 10.0d + "'", double82 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler83);
    }

    @Test
    public void test16683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16683");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.9d, (double) 10.0f, 0.9d, Double.NaN);
        java.lang.String str5 = highamHall54Integrator4.getName();
        double double6 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str7 = highamHall54Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
    }

    @Test
    public void test16684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16684");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth(31.144823004794873d);
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, 59.16079783099616d, 9.486832980505138d, (int) '#');
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test16685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16685");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize(1.0d);
        java.lang.String str28 = highamHall54Integrator4.getName();
        double double29 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double30 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler31 = null;
        highamHall54Integrator4.setStepHandler(stepHandler31);
        java.lang.String str33 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Higham-Hall 5(4)" + "'", str28, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Higham-Hall 5(4)" + "'", str33, "Higham-Hall 5(4)");
    }

    @Test
    public void test16686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16686");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator17.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator17.getStepHandler();
        boolean boolean22 = stepHandler21.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler21);
        double double24 = highamHall54Integrator4.getSafety();
        java.lang.String str25 = highamHall54Integrator4.getName();
        double double26 = highamHall54Integrator4.getSafety();
        java.lang.String str27 = highamHall54Integrator4.getName();
        double double28 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str29 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler30 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler31 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize(0.9486832980505138d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9d + "'", double24 == 0.9d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.9d + "'", double26 == 0.9d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Higham-Hall 5(4)" + "'", str27, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Higham-Hall 5(4)" + "'", str29, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler30);
        org.junit.Assert.assertNotNull(stepHandler31);
    }

    @Test
    public void test16687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16687");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, (double) ' ', (double) 0L, 0.0d);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, 5.916079783099616d, 17.752843424574987d, (int) '#');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test16688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16688");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) (-1.0f), (double) (byte) 0, (int) (short) -1);
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double15 = highamHall54Integrator4.getMaxStep();
        double double16 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str17 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Higham-Hall 5(4)" + "'", str17, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler18);
    }

    @Test
    public void test16689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16689");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        double double7 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) ' ', 0.2d, (int) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, (double) (short) 100, (double) '4', 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction18, 1.0d, 0.4472135954999579d, (int) '4');
        double double23 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test16690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16690");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 0.2d, (double) (-1L), (double) (byte) -1);
        double double5 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        stepHandler6.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        stepHandler6.handleStep(stepInterpolator8, false);
        boolean boolean11 = stepHandler6.requiresDenseOutput();
        boolean boolean12 = stepHandler6.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test16691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16691");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(2.0d, (double) (-1), (double) (-1L), 32.0d);
        int int5 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator10.getStepHandler();
        double double12 = highamHall54Integrator10.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator10.getStepHandler();
        java.lang.String str14 = highamHall54Integrator10.getName();
        double double15 = highamHall54Integrator10.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator10.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler16);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator18 = null;
        stepHandler16.handleStep(stepInterpolator18, true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler16);
    }

    @Test
    public void test16692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16692");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction3 = null;
        switchingFunctionsHandler0.add(switchingFunction3, (double) 10, (double) 1.0f, (int) '4');
        double double8 = switchingFunctionsHandler0.getEventTime();
        double double9 = switchingFunctionsHandler0.getEventTime();
        double double10 = switchingFunctionsHandler0.getEventTime();
        double double11 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler13 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        switchingFunctionsHandler13.add(switchingFunction14, 5.477225575051661d, 0.2d, (int) (byte) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        switchingFunctionsHandler13.add(switchingFunction19, (double) (-1), 22.80350850198276d, (int) (short) 10);
        double[] doubleArray37 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray40 = null;
        double[] doubleArray47 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray40, doubleArray47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray37, doubleArray40);
        double[] doubleArray50 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator51 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, (double) (byte) -1, doubleArray37, doubleArray50);
        double[] doubleArray62 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray65 = null;
        double[] doubleArray72 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator73 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray65, doubleArray72);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator74 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray62, doubleArray65);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler75 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator76 = null;
        boolean boolean77 = switchingFunctionsHandler75.evaluateStep(stepInterpolator76);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler79 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator80 = null;
        boolean boolean81 = switchingFunctionsHandler79.evaluateStep(stepInterpolator80);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator82 = null;
        boolean boolean83 = switchingFunctionsHandler79.evaluateStep(stepInterpolator82);
        double[] doubleArray89 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler79.stepAccepted((double) (byte) 1, doubleArray89);
        boolean boolean91 = switchingFunctionsHandler75.reset((double) (byte) 1, doubleArray89);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator92 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (byte) 100, doubleArray62, doubleArray89);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator93 = new org.apache.commons.math.ode.HighamHall54Integrator(31.810829150682025d, (double) 0.0f, doubleArray50, doubleArray89);
        boolean boolean94 = switchingFunctionsHandler13.reset(0.0d, doubleArray50);
        // The following exception was thrown during execution in test generation
        try {
            switchingFunctionsHandler0.stepAccepted(3.1622776601683795d, doubleArray50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[]");
        org.junit.Assert.assertNotNull(doubleArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray62), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray72), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test16693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16693");
        double[] doubleArray8 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray11 = null;
        double[] doubleArray18 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray11, doubleArray18);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray8, doubleArray11);
        highamHall54Integrator20.setMaxGrowth((double) 1.0f);
        double double23 = highamHall54Integrator20.getMinReduction();
        double double24 = highamHall54Integrator20.getCurrentStepStart();
        java.lang.String str25 = highamHall54Integrator20.getName();
        double double26 = highamHall54Integrator20.getCurrentStepStart();
        java.lang.String str27 = highamHall54Integrator20.getName();
        double double28 = highamHall54Integrator20.getCurrentSignedStepsize();
        highamHall54Integrator20.setInitialStepSize(17.78279410038923d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        double double37 = highamHall54Integrator35.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler38 = highamHall54Integrator35.getStepHandler();
        double double39 = highamHall54Integrator35.getSafety();
        highamHall54Integrator35.setSafety((double) 2);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 'a', (double) (short) 0, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        highamHall54Integrator46.addSwitchingFunction(switchingFunction47, (double) '#', (double) 100, (int) '#');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator56 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 0.2d, (double) (-1L), (double) (byte) -1);
        double double57 = highamHall54Integrator56.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler58 = highamHall54Integrator56.getStepHandler();
        highamHall54Integrator46.setStepHandler(stepHandler58);
        highamHall54Integrator35.setStepHandler(stepHandler58);
        java.lang.String str61 = highamHall54Integrator35.getName();
        org.apache.commons.math.ode.StepHandler stepHandler62 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator20.setStepHandler(stepHandler62);
        boolean boolean64 = stepHandler62.requiresDenseOutput();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Higham-Hall 5(4)" + "'", str27, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 0.9d + "'", double39 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Higham-Hall 5(4)" + "'", str61, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test16694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16694");
        double[] doubleArray8 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray11 = null;
        double[] doubleArray18 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray11, doubleArray18);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray8, doubleArray11);
        highamHall54Integrator20.setMaxGrowth((double) 1.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        highamHall54Integrator20.addSwitchingFunction(switchingFunction23, (double) (byte) 10, 31.144823004794873d, (int) (short) 1);
        highamHall54Integrator20.setInitialStepSize((double) 100);
        java.lang.String str30 = highamHall54Integrator20.getName();
        double double31 = highamHall54Integrator20.getCurrentSignedStepsize();
        double double32 = highamHall54Integrator20.getMaxGrowth();
        java.lang.String str33 = highamHall54Integrator20.getName();
        double double34 = highamHall54Integrator20.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Higham-Hall 5(4)" + "'", str30, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 1.0d + "'", double32 == 1.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Higham-Hall 5(4)" + "'", str33, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
    }

    @Test
    public void test16695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16695");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(0.9d);
        double double18 = highamHall54Integrator4.getMinReduction();
        java.lang.String str19 = highamHall54Integrator4.getName();
        double double20 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator4.getStepHandler();
        java.lang.String str22 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator4.getStepHandler();
        double double24 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9d + "'", double18 == 0.9d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertNull(stepHandler21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Higham-Hall 5(4)" + "'", str22, "Higham-Hall 5(4)");
        org.junit.Assert.assertNull(stepHandler23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test16696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16696");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler2.evaluateStep(stepInterpolator3);
        double double5 = switchingFunctionsHandler2.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        switchingFunctionsHandler2.add(switchingFunction6, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        boolean boolean14 = switchingFunctionsHandler12.evaluateStep(stepInterpolator13);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler16 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        boolean boolean18 = switchingFunctionsHandler16.evaluateStep(stepInterpolator17);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        boolean boolean20 = switchingFunctionsHandler16.evaluateStep(stepInterpolator19);
        double[] doubleArray26 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler16.stepAccepted((double) (byte) 1, doubleArray26);
        boolean boolean28 = switchingFunctionsHandler12.reset((double) (byte) 1, doubleArray26);
        boolean boolean29 = switchingFunctionsHandler2.reset((double) '4', doubleArray26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        boolean boolean32 = switchingFunctionsHandler30.evaluateStep(stepInterpolator31);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler34 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator35 = null;
        boolean boolean36 = switchingFunctionsHandler34.evaluateStep(stepInterpolator35);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler34.evaluateStep(stepInterpolator37);
        double[] doubleArray44 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler34.stepAccepted((double) (byte) 1, doubleArray44);
        boolean boolean46 = switchingFunctionsHandler30.reset((double) (byte) 1, doubleArray44);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, 0.0d, doubleArray26, doubleArray44);
        double double48 = highamHall54Integrator47.getMinStep();
        highamHall54Integrator47.setSafety((double) (byte) 10);
        java.lang.String str51 = highamHall54Integrator47.getName();
        double double52 = highamHall54Integrator47.getCurrentStepStart();
        highamHall54Integrator47.setMinReduction((double) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        highamHall54Integrator47.addSwitchingFunction(switchingFunction55, 0.0d, (double) '4', (int) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler60 = highamHall54Integrator47.getStepHandler();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Higham-Hall 5(4)" + "'", str51, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertNotNull(stepHandler60);
    }

    @Test
    public void test16697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16697");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str8 = highamHall54Integrator4.getName();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMinReduction((double) (byte) 100);
        int int12 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setMinReduction(2.0d);
        int int15 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test16698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16698");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        double double17 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler23 = null;
        highamHall54Integrator22.setStepHandler(stepHandler23);
        double double25 = highamHall54Integrator22.getCurrentSignedStepsize();
        double double26 = highamHall54Integrator22.getCurrentStepStart();
        double double27 = highamHall54Integrator22.getCurrentStepStart();
        double double28 = highamHall54Integrator22.getCurrentSignedStepsize();
        double double29 = highamHall54Integrator22.getSafety();
        double double30 = highamHall54Integrator22.getMaxStep();
        int int31 = highamHall54Integrator22.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler37 = highamHall54Integrator36.getStepHandler();
        highamHall54Integrator36.setInitialStepSize((double) 3);
        double double40 = highamHall54Integrator36.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler46 = highamHall54Integrator45.getStepHandler();
        highamHall54Integrator45.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler54 = null;
        highamHall54Integrator53.setStepHandler(stepHandler54);
        double double56 = highamHall54Integrator53.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler57 = null;
        highamHall54Integrator53.setStepHandler(stepHandler57);
        double double59 = highamHall54Integrator53.getMaxStep();
        double double60 = highamHall54Integrator53.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler66 = highamHall54Integrator65.getStepHandler();
        highamHall54Integrator53.setStepHandler(stepHandler66);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator72 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler73 = null;
        highamHall54Integrator72.setStepHandler(stepHandler73);
        double double75 = highamHall54Integrator72.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler76 = null;
        highamHall54Integrator72.setStepHandler(stepHandler76);
        double double78 = highamHall54Integrator72.getMaxStep();
        double double79 = highamHall54Integrator72.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler85 = highamHall54Integrator84.getStepHandler();
        highamHall54Integrator72.setStepHandler(stepHandler85);
        highamHall54Integrator53.setStepHandler(stepHandler85);
        highamHall54Integrator45.setStepHandler(stepHandler85);
        highamHall54Integrator36.setStepHandler(stepHandler85);
        double double90 = highamHall54Integrator36.getCurrentStepStart();
        java.lang.String str91 = highamHall54Integrator36.getName();
        org.apache.commons.math.ode.StepHandler stepHandler92 = highamHall54Integrator36.getStepHandler();
        highamHall54Integrator22.setStepHandler(stepHandler92);
        highamHall54Integrator4.setStepHandler(stepHandler92);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction95 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction95, 10.198039027185569d, 9.848857801796104d, 2);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(stepHandler15);
        org.junit.Assert.assertNull(stepHandler16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.9d + "'", double29 == 0.9d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + (-1.0d) + "'", double30 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 5 + "'", int31 == 5);
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + (-1.0d) + "'", double78 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 10.0d + "'", double79 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler85);
        org.junit.Assert.assertTrue(Double.isNaN(double90));
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "Higham-Hall 5(4)" + "'", str91, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler92);
    }

    @Test
    public void test16699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16699");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 3);
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        highamHall54Integrator4.setMaxGrowth((double) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, Double.NaN, (double) (-1), 10);
        int int17 = highamHall54Integrator4.getOrder();
        double double18 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test16700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16700");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        highamHall54Integrator4.setSafety((double) (short) -1);
        double double10 = highamHall54Integrator4.getMinStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler12 = null;
        highamHall54Integrator4.setStepHandler(stepHandler12);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction14, 0.0d, (double) (byte) 1, 0);
        highamHall54Integrator4.setMinReduction((double) 100L);
        highamHall54Integrator4.setInitialStepSize((double) (short) -1);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test16701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16701");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 'a', (double) (short) 0, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) '#', (double) 100, (int) '#');
        double double10 = highamHall54Integrator4.getCurrentStepStart();
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 31.144823004794873d + "'", double11 == 31.144823004794873d);
    }

    @Test
    public void test16702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16702");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        boolean boolean5 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        boolean boolean7 = switchingFunctionsHandler0.evaluateStep(stepInterpolator6);
        boolean boolean8 = switchingFunctionsHandler0.stop();
        double double9 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler11 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator12 = null;
        boolean boolean13 = switchingFunctionsHandler11.evaluateStep(stepInterpolator12);
        double double14 = switchingFunctionsHandler11.getEventTime();
        boolean boolean15 = switchingFunctionsHandler11.stop();
        double double16 = switchingFunctionsHandler11.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        boolean boolean18 = switchingFunctionsHandler11.evaluateStep(stepInterpolator17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        switchingFunctionsHandler11.add(switchingFunction19, (double) 0, 100.0d, 0);
        boolean boolean24 = switchingFunctionsHandler11.stop();
        boolean boolean25 = switchingFunctionsHandler11.isEmpty();
        boolean boolean26 = switchingFunctionsHandler11.isEmpty();
        boolean boolean27 = switchingFunctionsHandler11.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        switchingFunctionsHandler11.add(switchingFunction28, 0.9d, (double) 0, 2);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler34 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator35 = null;
        boolean boolean36 = switchingFunctionsHandler34.evaluateStep(stepInterpolator35);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler34.evaluateStep(stepInterpolator37);
        double[] doubleArray44 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler34.stepAccepted((double) (byte) 1, doubleArray44);
        double[] doubleArray52 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler53 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator54 = null;
        boolean boolean55 = switchingFunctionsHandler53.evaluateStep(stepInterpolator54);
        double double56 = switchingFunctionsHandler53.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        switchingFunctionsHandler53.add(switchingFunction57, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler63 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator64 = null;
        boolean boolean65 = switchingFunctionsHandler63.evaluateStep(stepInterpolator64);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler67 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator68 = null;
        boolean boolean69 = switchingFunctionsHandler67.evaluateStep(stepInterpolator68);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator70 = null;
        boolean boolean71 = switchingFunctionsHandler67.evaluateStep(stepInterpolator70);
        double[] doubleArray77 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler67.stepAccepted((double) (byte) 1, doubleArray77);
        boolean boolean79 = switchingFunctionsHandler63.reset((double) (byte) 1, doubleArray77);
        boolean boolean80 = switchingFunctionsHandler53.reset((double) '4', doubleArray77);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator81 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray52, doubleArray77);
        boolean boolean82 = switchingFunctionsHandler34.reset((double) (byte) 0, doubleArray77);
        boolean boolean83 = switchingFunctionsHandler11.reset(2.1213203435596424d, doubleArray77);
        switchingFunctionsHandler0.stepAccepted(3.7829664360127033d, doubleArray77);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test16703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16703");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator17.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator17.getStepHandler();
        boolean boolean22 = stepHandler21.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler21);
        double double24 = highamHall54Integrator4.getSafety();
        java.lang.String str25 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setSafety((double) '#');
        highamHall54Integrator4.setSafety((double) (-1));
        double double30 = highamHall54Integrator4.getCurrentStepStart();
        double double31 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9d + "'", double24 == 0.9d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
    }

    @Test
    public void test16704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16704");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 100.0f, (double) 10L, (int) 'a');
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety((double) 1L);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(9.848857801796104d);
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMaxGrowth(26.8534961428265d);
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertNotNull(stepHandler22);
    }

    @Test
    public void test16705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16705");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler2.evaluateStep(stepInterpolator3);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        boolean boolean6 = switchingFunctionsHandler2.evaluateStep(stepInterpolator5);
        double[] doubleArray12 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler2.stepAccepted((double) (byte) 1, doubleArray12);
        double[] doubleArray16 = null;
        double[] doubleArray23 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray16, doubleArray23);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100.0f, (double) 10L, doubleArray12, doubleArray16);
        double double26 = highamHall54Integrator25.getMaxGrowth();
        double double27 = highamHall54Integrator25.getMaxGrowth();
        double double28 = highamHall54Integrator25.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler29 = highamHall54Integrator25.getStepHandler();
        java.lang.String str30 = highamHall54Integrator25.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = null;
        highamHall54Integrator35.setStepHandler(stepHandler36);
        double double38 = highamHall54Integrator35.getCurrentSignedStepsize();
        double double39 = highamHall54Integrator35.getCurrentStepStart();
        java.lang.String str40 = highamHall54Integrator35.getName();
        java.lang.String str41 = highamHall54Integrator35.getName();
        java.lang.String str42 = highamHall54Integrator35.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler48 = highamHall54Integrator47.getStepHandler();
        highamHall54Integrator47.setMinReduction((double) 10L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction51 = null;
        highamHall54Integrator47.addSwitchingFunction(switchingFunction51, (double) 100.0f, (double) 10L, (int) 'a');
        org.apache.commons.math.ode.StepHandler stepHandler56 = highamHall54Integrator47.getStepHandler();
        highamHall54Integrator35.setStepHandler(stepHandler56);
        highamHall54Integrator25.setStepHandler(stepHandler56);
        stepHandler56.reset();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Higham-Hall 5(4)" + "'", str30, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Higham-Hall 5(4)" + "'", str40, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Higham-Hall 5(4)" + "'", str41, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Higham-Hall 5(4)" + "'", str42, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler48);
        org.junit.Assert.assertNotNull(stepHandler56);
    }

    @Test
    public void test16706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16706");
        double[] doubleArray2 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler3.evaluateStep(stepInterpolator4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        boolean boolean9 = switchingFunctionsHandler7.evaluateStep(stepInterpolator8);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        boolean boolean11 = switchingFunctionsHandler7.evaluateStep(stepInterpolator10);
        double[] doubleArray17 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler7.stepAccepted((double) (byte) 1, doubleArray17);
        boolean boolean19 = switchingFunctionsHandler3.reset((double) (byte) 1, doubleArray17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) (-1), doubleArray2, doubleArray17);
        double double21 = highamHall54Integrator20.getMinStep();
        highamHall54Integrator20.setInitialStepSize(3.1622776601683795d);
        int int24 = highamHall54Integrator20.getOrder();
        int int25 = highamHall54Integrator20.getOrder();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test16707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16707");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) 1L, (double) (-1), (double) 3);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
    }

    @Test
    public void test16708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16708");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 10, 10.0d, (double) 10, Double.NaN);
        highamHall54Integrator4.setSafety((double) '4');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction7, (double) 3, (double) 5, (int) (byte) 0);
        double double12 = highamHall54Integrator4.getSafety();
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double15 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction18, (double) 1L, 5.0d, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 52.0d + "'", double12 == 52.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test16709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16709");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 3);
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        highamHall54Integrator4.setMaxGrowth((double) (byte) 100);
        double double12 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction13, (double) (short) 0, 0.0d, 100);
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 100);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler26 = null;
        highamHall54Integrator25.setStepHandler(stepHandler26);
        double double28 = highamHall54Integrator25.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler29 = null;
        highamHall54Integrator25.setStepHandler(stepHandler29);
        double double31 = highamHall54Integrator25.getMaxStep();
        double double32 = highamHall54Integrator25.getMinStep();
        double double33 = highamHall54Integrator25.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler39 = highamHall54Integrator38.getStepHandler();
        highamHall54Integrator38.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator38.getStepHandler();
        boolean boolean43 = stepHandler42.requiresDenseOutput();
        highamHall54Integrator25.setStepHandler(stepHandler42);
        double double45 = highamHall54Integrator25.getSafety();
        java.lang.String str46 = highamHall54Integrator25.getName();
        highamHall54Integrator25.setSafety((double) '#');
        int int49 = highamHall54Integrator25.getOrder();
        highamHall54Integrator25.setMaxGrowth(10.0d);
        java.lang.String str52 = highamHall54Integrator25.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator57 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler58 = highamHall54Integrator57.getStepHandler();
        boolean boolean59 = stepHandler58.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator60 = null;
        stepHandler58.handleStep(stepInterpolator60, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator63 = null;
        stepHandler58.handleStep(stepInterpolator63, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator66 = null;
        stepHandler58.handleStep(stepInterpolator66, true);
        highamHall54Integrator25.setStepHandler(stepHandler58);
        boolean boolean70 = stepHandler58.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler58);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.9d + "'", double45 == 0.9d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Higham-Hall 5(4)" + "'", str46, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Higham-Hall 5(4)" + "'", str52, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test16710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16710");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(2.23606797749979d, 8.917795292374965d, (double) 0, 2.1213203435596424d);
    }

    @Test
    public void test16711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16711");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100L, 0.0d, (double) 100.0f, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (-1.0d), (double) (byte) -1, (int) (byte) 0);
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getMaxStep();
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        double double14 = highamHall54Integrator4.getMinReduction();
        double double15 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(3.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test16712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16712");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100L, 0.0d, (double) 100.0f, 0.0d);
        double double5 = highamHall54Integrator4.getMinStep();
        java.lang.String str6 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler12 = null;
        highamHall54Integrator11.setStepHandler(stepHandler12);
        double double14 = highamHall54Integrator11.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler15 = null;
        highamHall54Integrator11.setStepHandler(stepHandler15);
        double double17 = highamHall54Integrator11.getMinReduction();
        double double18 = highamHall54Integrator11.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator11.addSwitchingFunction(switchingFunction19, 0.0d, 10.0d, 2);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler29 = highamHall54Integrator28.getStepHandler();
        highamHall54Integrator28.setInitialStepSize((double) 3);
        highamHall54Integrator28.setInitialStepSize((double) 'a');
        highamHall54Integrator28.setMaxGrowth((double) 0L);
        highamHall54Integrator28.setMaxGrowth(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler43 = null;
        highamHall54Integrator42.setStepHandler(stepHandler43);
        double double45 = highamHall54Integrator42.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler46 = null;
        highamHall54Integrator42.setStepHandler(stepHandler46);
        double double48 = highamHall54Integrator42.getMaxStep();
        double double49 = highamHall54Integrator42.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler55 = highamHall54Integrator54.getStepHandler();
        highamHall54Integrator42.setStepHandler(stepHandler55);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction57 = null;
        highamHall54Integrator42.addSwitchingFunction(switchingFunction57, (double) '4', 1.0d, (int) (short) -1);
        double double62 = highamHall54Integrator42.getMaxStep();
        double double63 = highamHall54Integrator42.getSafety();
        highamHall54Integrator42.setInitialStepSize(1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler66 = highamHall54Integrator42.getStepHandler();
        highamHall54Integrator28.setStepHandler(stepHandler66);
        highamHall54Integrator11.setStepHandler(stepHandler66);
        highamHall54Integrator4.setStepHandler(stepHandler66);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction70 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction70, (double) (-1.0f), 9.848857801796104d, (int) 'a');
        highamHall54Integrator4.setSafety((double) (byte) 10);
        double double77 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler78 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 100.0d + "'", double5 == 100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2d + "'", double17 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler55);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.9d + "'", double63 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 100.0d + "'", double77 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler78);
    }

    @Test
    public void test16713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16713");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 100.0f, (double) 10L, (int) 'a');
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        int int14 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        double double17 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler23 = null;
        highamHall54Integrator22.setStepHandler(stepHandler23);
        double double25 = highamHall54Integrator22.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler26 = null;
        highamHall54Integrator22.setStepHandler(stepHandler26);
        double double28 = highamHall54Integrator22.getMaxStep();
        double double29 = highamHall54Integrator22.getMinStep();
        double double30 = highamHall54Integrator22.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator35.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler39 = highamHall54Integrator35.getStepHandler();
        boolean boolean40 = stepHandler39.requiresDenseOutput();
        highamHall54Integrator22.setStepHandler(stepHandler39);
        highamHall54Integrator4.setStepHandler(stepHandler39);
        double double43 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler49 = highamHall54Integrator48.getStepHandler();
        double double50 = highamHall54Integrator48.getMinStep();
        double double51 = highamHall54Integrator48.getCurrentSignedStepsize();
        int int52 = highamHall54Integrator48.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler53 = highamHall54Integrator48.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator54 = null;
        stepHandler53.handleStep(stepInterpolator54, true);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator57 = null;
        stepHandler53.handleStep(stepInterpolator57, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator60 = null;
        stepHandler53.handleStep(stepInterpolator60, true);
        highamHall54Integrator4.setStepHandler(stepHandler53);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator64 = null;
        stepHandler53.handleStep(stepInterpolator64, false);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertNotNull(stepHandler53);
    }

    @Test
    public void test16714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16714");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        double double26 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double27 = highamHall54Integrator4.getSafety();
        int int28 = highamHall54Integrator4.getOrder();
        int int29 = highamHall54Integrator4.getOrder();
        int int30 = highamHall54Integrator4.getOrder();
        double double31 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double32 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.9d + "'", double27 == 0.9d);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test16715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16715");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) (byte) 0, (double) (byte) 100, 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        highamHall54Integrator17.setMinReduction((double) 10.0f);
        double double20 = highamHall54Integrator17.getCurrentSignedStepsize();
        java.lang.String str21 = highamHall54Integrator17.getName();
        double double22 = highamHall54Integrator17.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator17.getStepHandler();
        stepHandler23.reset();
        highamHall54Integrator4.setStepHandler(stepHandler23);
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Higham-Hall 5(4)" + "'", str21, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertNotNull(stepHandler26);
    }

    @Test
    public void test16716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16716");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 100.0f, (double) 10L, (int) 'a');
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety((double) 1L);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator21.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler30 = null;
        highamHall54Integrator29.setStepHandler(stepHandler30);
        double double32 = highamHall54Integrator29.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler33 = null;
        highamHall54Integrator29.setStepHandler(stepHandler33);
        double double35 = highamHall54Integrator29.getMaxStep();
        double double36 = highamHall54Integrator29.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator41.getStepHandler();
        highamHall54Integrator29.setStepHandler(stepHandler42);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator48 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler49 = null;
        highamHall54Integrator48.setStepHandler(stepHandler49);
        double double51 = highamHall54Integrator48.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler52 = null;
        highamHall54Integrator48.setStepHandler(stepHandler52);
        double double54 = highamHall54Integrator48.getMaxStep();
        double double55 = highamHall54Integrator48.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator60 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler61 = highamHall54Integrator60.getStepHandler();
        highamHall54Integrator48.setStepHandler(stepHandler61);
        highamHall54Integrator29.setStepHandler(stepHandler61);
        highamHall54Integrator21.setStepHandler(stepHandler61);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator65 = null;
        stepHandler61.handleStep(stepInterpolator65, false);
        highamHall54Integrator4.setStepHandler(stepHandler61);
        double double69 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction70 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction70, (double) 0L, 9.848857801796104d, (int) (short) 1);
        highamHall54Integrator4.setMinReduction((double) (byte) 0);
        double double77 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertTrue(Double.isNaN(double51));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler61);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + (-1.0d) + "'", double69 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double77));
    }

    @Test
    public void test16717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16717");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator17.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator17.getStepHandler();
        boolean boolean22 = stepHandler21.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler21);
        double double24 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double25 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double26 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction((double) (short) 1);
        double double29 = highamHall54Integrator4.getCurrentStepStart();
        int int30 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
    }

    @Test
    public void test16718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16718");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (double) 100.0f, (double) 10L, (int) 'a');
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety((double) 1L);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(9.848857801796104d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler24 = null;
        highamHall54Integrator23.setStepHandler(stepHandler24);
        double double26 = highamHall54Integrator23.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = null;
        highamHall54Integrator23.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator23.getMinReduction();
        int int30 = highamHall54Integrator23.getOrder();
        highamHall54Integrator23.setInitialStepSize((double) '4');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator37 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler38 = null;
        highamHall54Integrator37.setStepHandler(stepHandler38);
        double double40 = highamHall54Integrator37.getCurrentSignedStepsize();
        double double41 = highamHall54Integrator37.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator46.getStepHandler();
        highamHall54Integrator37.setStepHandler(stepHandler47);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator49 = null;
        stepHandler47.handleStep(stepInterpolator49, true);
        highamHall54Integrator23.setStepHandler(stepHandler47);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator53 = null;
        stepHandler47.handleStep(stepInterpolator53, true);
        stepHandler47.reset();
        highamHall54Integrator4.setStepHandler(stepHandler47);
        double double58 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue(Double.isNaN(double58));
    }

    @Test
    public void test16719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16719");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 100.0f, (double) 100, (double) (byte) -1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        int int6 = highamHall54Integrator4.getOrder();
        double[] doubleArray12 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler13 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator14 = null;
        boolean boolean15 = switchingFunctionsHandler13.evaluateStep(stepInterpolator14);
        double double16 = switchingFunctionsHandler13.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        switchingFunctionsHandler13.add(switchingFunction17, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler23 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        boolean boolean25 = switchingFunctionsHandler23.evaluateStep(stepInterpolator24);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator28 = null;
        boolean boolean29 = switchingFunctionsHandler27.evaluateStep(stepInterpolator28);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        boolean boolean31 = switchingFunctionsHandler27.evaluateStep(stepInterpolator30);
        double[] doubleArray37 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler27.stepAccepted((double) (byte) 1, doubleArray37);
        boolean boolean39 = switchingFunctionsHandler23.reset((double) (byte) 1, doubleArray37);
        boolean boolean40 = switchingFunctionsHandler13.reset((double) '4', doubleArray37);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray12, doubleArray37);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        highamHall54Integrator41.addSwitchingFunction(switchingFunction42, 0.0d, 0.9d, (int) (short) 0);
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator41.getStepHandler();
        boolean boolean48 = stepHandler47.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler47);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test16720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16720");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        double double19 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 10, 10.0d, (double) 10, Double.NaN);
        highamHall54Integrator24.setSafety((double) '4');
        highamHall54Integrator24.setMaxGrowth(0.0d);
        double double29 = highamHall54Integrator24.getMinReduction();
        highamHall54Integrator24.setSafety(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler32 = highamHall54Integrator24.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler32);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator(31.144823004794873d, (double) 1, (double) (short) 100, 10.0d);
        org.apache.commons.math.ode.StepHandler stepHandler39 = highamHall54Integrator38.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler39);
        org.apache.commons.math.ode.StepHandler stepHandler41 = highamHall54Integrator4.getStepHandler();
        stepHandler41.reset();
        boolean boolean43 = stepHandler41.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.2d + "'", double29 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler32);
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test16721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16721");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        java.lang.String str11 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        double double18 = highamHall54Integrator16.getMinStep();
        double double19 = highamHall54Integrator16.getCurrentSignedStepsize();
        highamHall54Integrator16.setInitialStepSize(10.0d);
        double double22 = highamHall54Integrator16.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler23);
        java.lang.String str25 = highamHall54Integrator4.getName();
        java.lang.String str26 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler28 = highamHall54Integrator4.getStepHandler();
        double double29 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth((double) 0L);
        double double32 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNull(stepHandler10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Higham-Hall 5(4)" + "'", str26, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.2d + "'", double32 == 0.2d);
    }

    @Test
    public void test16722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16722");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        java.lang.String str8 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) 0.0f);
        highamHall54Integrator4.setMinReduction((double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setSafety((double) (byte) -1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, 2.1213203435596424d, 100.0d, (int) (short) -1);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler13);
    }

    @Test
    public void test16723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16723");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMaxGrowth(0.0d);
        java.lang.String str11 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = null;
        highamHall54Integrator16.setStepHandler(stepHandler17);
        double double19 = highamHall54Integrator16.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler20 = null;
        highamHall54Integrator16.setStepHandler(stepHandler20);
        double double22 = highamHall54Integrator16.getMaxStep();
        double double23 = highamHall54Integrator16.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator28 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler29 = highamHall54Integrator28.getStepHandler();
        highamHall54Integrator16.setStepHandler(stepHandler29);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        stepHandler29.handleStep(stepInterpolator31, true);
        highamHall54Integrator4.setStepHandler(stepHandler29);
        org.apache.commons.math.ode.StepHandler stepHandler35 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        stepHandler35.handleStep(stepInterpolator36, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator39 = null;
        stepHandler35.handleStep(stepInterpolator39, false);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Higham-Hall 5(4)" + "'", str11, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertNotNull(stepHandler35);
    }

    @Test
    public void test16724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16724");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 10, 10.0d, (double) 10, Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator10 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler11 = null;
        highamHall54Integrator10.setStepHandler(stepHandler11);
        double double13 = highamHall54Integrator10.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler14 = null;
        highamHall54Integrator10.setStepHandler(stepHandler14);
        double double16 = highamHall54Integrator10.getMaxStep();
        double double17 = highamHall54Integrator10.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler23 = highamHall54Integrator22.getStepHandler();
        highamHall54Integrator10.setStepHandler(stepHandler23);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler30 = null;
        highamHall54Integrator29.setStepHandler(stepHandler30);
        double double32 = highamHall54Integrator29.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler33 = null;
        highamHall54Integrator29.setStepHandler(stepHandler33);
        double double35 = highamHall54Integrator29.getMaxStep();
        double double36 = highamHall54Integrator29.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator41 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator41.getStepHandler();
        highamHall54Integrator29.setStepHandler(stepHandler42);
        highamHall54Integrator10.setStepHandler(stepHandler42);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator45 = null;
        stepHandler42.handleStep(stepInterpolator45, true);
        highamHall54Integrator4.setStepHandler(stepHandler42);
        org.apache.commons.math.ode.StepHandler stepHandler49 = highamHall54Integrator4.getStepHandler();
        double double50 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str51 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Higham-Hall 5(4)" + "'", str51, "Higham-Hall 5(4)");
    }

    @Test
    public void test16725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16725");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double double3 = switchingFunctionsHandler0.getEventTime();
        boolean boolean4 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler6.evaluateStep(stepInterpolator7);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler10 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        boolean boolean12 = switchingFunctionsHandler10.evaluateStep(stepInterpolator11);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        boolean boolean14 = switchingFunctionsHandler10.evaluateStep(stepInterpolator13);
        double[] doubleArray20 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler10.stepAccepted((double) (byte) 1, doubleArray20);
        boolean boolean22 = switchingFunctionsHandler6.reset((double) (byte) 1, doubleArray20);
        double double23 = switchingFunctionsHandler6.getEventTime();
        double[] doubleArray27 = null;
        double[] doubleArray34 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray27, doubleArray34);
        boolean boolean36 = switchingFunctionsHandler6.reset((double) 10.0f, doubleArray34);
        boolean boolean37 = switchingFunctionsHandler0.reset((double) (byte) 10, doubleArray34);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        boolean boolean41 = switchingFunctionsHandler39.evaluateStep(stepInterpolator40);
        double double42 = switchingFunctionsHandler39.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction43 = null;
        switchingFunctionsHandler39.add(switchingFunction43, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler49 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator50 = null;
        boolean boolean51 = switchingFunctionsHandler49.evaluateStep(stepInterpolator50);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler53 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator54 = null;
        boolean boolean55 = switchingFunctionsHandler53.evaluateStep(stepInterpolator54);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator56 = null;
        boolean boolean57 = switchingFunctionsHandler53.evaluateStep(stepInterpolator56);
        double[] doubleArray63 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler53.stepAccepted((double) (byte) 1, doubleArray63);
        boolean boolean65 = switchingFunctionsHandler49.reset((double) (byte) 1, doubleArray63);
        boolean boolean66 = switchingFunctionsHandler39.reset((double) '4', doubleArray63);
        switchingFunctionsHandler0.stepAccepted((double) (short) 1, doubleArray63);
        boolean boolean68 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator69 = null;
        boolean boolean70 = switchingFunctionsHandler0.evaluateStep(stepInterpolator69);
        double double71 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double71));
    }

    @Test
    public void test16726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16726");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (-1.0d), (double) (short) 10, (int) (byte) 1);
        highamHall54Integrator4.setMaxGrowth((double) (-1));
        double double15 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double16 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator4.getStepHandler();
        double double18 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
    }

    @Test
    public void test16727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16727");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        double double8 = highamHall54Integrator4.getMaxStep();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize(1.4142135623730951d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test16728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16728");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) (-1.0f), (double) '4', (int) (short) 100);
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize(10.0d);
        double double19 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setSafety(100.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction22, (double) 100L, 0.4472135954999579d, (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertNull(stepHandler16);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
    }

    @Test
    public void test16729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16729");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getSafety();
        double double12 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 9.848857801796104d, (double) 0, (double) 1);
        double double18 = highamHall54Integrator17.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler19);
        stepHandler19.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler19);
    }

    @Test
    public void test16730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16730");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) '4', (double) 10.0f, 1.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator9 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator9.getStepHandler();
        highamHall54Integrator9.setMinReduction(10.0d);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator9.getStepHandler();
        boolean boolean14 = stepHandler13.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler13);
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        int int18 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 0.2d, (double) (-1L), (double) (byte) -1);
        double double24 = highamHall54Integrator23.getCurrentStepStart();
        highamHall54Integrator23.setSafety((double) (byte) 1);
        java.lang.String str27 = highamHall54Integrator23.getName();
        highamHall54Integrator23.setMinReduction((double) (short) 0);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator34 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler35 = null;
        highamHall54Integrator34.setStepHandler(stepHandler35);
        double double37 = highamHall54Integrator34.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler38 = null;
        highamHall54Integrator34.setStepHandler(stepHandler38);
        double double40 = highamHall54Integrator34.getMaxStep();
        double double41 = highamHall54Integrator34.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator46 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler47 = highamHall54Integrator46.getStepHandler();
        highamHall54Integrator34.setStepHandler(stepHandler47);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler54 = null;
        highamHall54Integrator53.setStepHandler(stepHandler54);
        double double56 = highamHall54Integrator53.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler57 = null;
        highamHall54Integrator53.setStepHandler(stepHandler57);
        double double59 = highamHall54Integrator53.getMaxStep();
        double double60 = highamHall54Integrator53.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler66 = highamHall54Integrator65.getStepHandler();
        highamHall54Integrator53.setStepHandler(stepHandler66);
        highamHall54Integrator34.setStepHandler(stepHandler66);
        stepHandler66.reset();
        stepHandler66.reset();
        boolean boolean71 = stepHandler66.requiresDenseOutput();
        highamHall54Integrator23.setStepHandler(stepHandler66);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator73 = null;
        stepHandler66.handleStep(stepInterpolator73, false);
        stepHandler66.reset();
        highamHall54Integrator4.setStepHandler(stepHandler66);
        boolean boolean78 = stepHandler66.requiresDenseOutput();
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Higham-Hall 5(4)" + "'", str27, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
    }

    @Test
    public void test16731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16731");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, (double) (byte) 10, (double) (short) -1, (int) '4');
        double double16 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler22 = null;
        highamHall54Integrator21.setStepHandler(stepHandler22);
        double double24 = highamHall54Integrator21.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler25 = null;
        highamHall54Integrator21.setStepHandler(stepHandler25);
        double double27 = highamHall54Integrator21.getMaxStep();
        double double28 = highamHall54Integrator21.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator33.getStepHandler();
        highamHall54Integrator21.setStepHandler(stepHandler34);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        highamHall54Integrator21.addSwitchingFunction(switchingFunction36, (double) '4', 1.0d, (int) (short) -1);
        double double41 = highamHall54Integrator21.getMaxStep();
        double double42 = highamHall54Integrator21.getSafety();
        double double43 = highamHall54Integrator21.getCurrentSignedStepsize();
        java.lang.String str44 = highamHall54Integrator21.getName();
        int int45 = highamHall54Integrator21.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler51 = highamHall54Integrator50.getStepHandler();
        highamHall54Integrator50.setInitialStepSize((double) 3);
        highamHall54Integrator50.setInitialStepSize((double) 'a');
        highamHall54Integrator50.setMaxGrowth((double) 0L);
        highamHall54Integrator50.setMaxGrowth(0.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator64 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler65 = null;
        highamHall54Integrator64.setStepHandler(stepHandler65);
        double double67 = highamHall54Integrator64.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler68 = null;
        highamHall54Integrator64.setStepHandler(stepHandler68);
        double double70 = highamHall54Integrator64.getMaxStep();
        double double71 = highamHall54Integrator64.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator76 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler77 = highamHall54Integrator76.getStepHandler();
        highamHall54Integrator64.setStepHandler(stepHandler77);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction79 = null;
        highamHall54Integrator64.addSwitchingFunction(switchingFunction79, (double) '4', 1.0d, (int) (short) -1);
        double double84 = highamHall54Integrator64.getMaxStep();
        double double85 = highamHall54Integrator64.getSafety();
        highamHall54Integrator64.setInitialStepSize(1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler88 = highamHall54Integrator64.getStepHandler();
        highamHall54Integrator50.setStepHandler(stepHandler88);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator90 = null;
        stepHandler88.handleStep(stepInterpolator90, true);
        highamHall54Integrator21.setStepHandler(stepHandler88);
        highamHall54Integrator4.setStepHandler(stepHandler88);
        stepHandler88.reset();
        boolean boolean96 = stepHandler88.requiresDenseOutput();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + (-1.0d) + "'", double41 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.9d + "'", double42 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Higham-Hall 5(4)" + "'", str44, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 5 + "'", int45 == 5);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double71 + "' != '" + 10.0d + "'", double71 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler77);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double85 + "' != '" + 0.9d + "'", double85 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler88);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test16732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16732");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str12 = highamHall54Integrator4.getName();
        int int13 = highamHall54Integrator4.getOrder();
        double double14 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth(32.0d);
        double double17 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str18 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler19 = highamHall54Integrator4.getStepHandler();
        stepHandler19.reset();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Higham-Hall 5(4)" + "'", str18, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler19);
    }

    @Test
    public void test16733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16733");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMinReduction();
        int int11 = highamHall54Integrator4.getOrder();
        highamHall54Integrator4.setInitialStepSize((double) '4');
        highamHall54Integrator4.setInitialStepSize((double) (-1));
        int int16 = highamHall54Integrator4.getOrder();
        double double17 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler19 = null;
        highamHall54Integrator4.setStepHandler(stepHandler19);
        highamHall54Integrator4.setMinReduction(24.947901585376336d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler28 = null;
        highamHall54Integrator27.setStepHandler(stepHandler28);
        double double30 = highamHall54Integrator27.getCurrentSignedStepsize();
        double double31 = highamHall54Integrator27.getCurrentStepStart();
        java.lang.String str32 = highamHall54Integrator27.getName();
        double double33 = highamHall54Integrator27.getMinStep();
        double double34 = highamHall54Integrator27.getCurrentSignedStepsize();
        int int35 = highamHall54Integrator27.getOrder();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) 1L, (double) 0.0f, (double) 2);
        org.apache.commons.math.ode.StepHandler stepHandler41 = highamHall54Integrator40.getStepHandler();
        highamHall54Integrator27.setStepHandler(stepHandler41);
        stepHandler41.reset();
        highamHall54Integrator4.setStepHandler(stepHandler41);
        org.apache.commons.math.ode.StepHandler stepHandler45 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNull(stepHandler18);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Higham-Hall 5(4)" + "'", str32, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertNotNull(stepHandler45);
    }

    @Test
    public void test16734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16734");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', (double) (short) 100, 3.0d, (double) (byte) 0);
        double double5 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize(31.144823004794873d);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        stepHandler8.reset();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 56.568542494923804d + "'", double5 == 56.568542494923804d);
        org.junit.Assert.assertNotNull(stepHandler8);
    }

    @Test
    public void test16735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16735");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (-1.0d), (double) (short) 10, (int) (byte) 1);
        double double13 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        java.lang.String str15 = highamHall54Integrator4.getName();
        java.lang.String str16 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler22 = null;
        highamHall54Integrator21.setStepHandler(stepHandler22);
        double double24 = highamHall54Integrator21.getCurrentSignedStepsize();
        double double25 = highamHall54Integrator21.getCurrentStepStart();
        java.lang.String str26 = highamHall54Integrator21.getName();
        double double27 = highamHall54Integrator21.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        highamHall54Integrator21.addSwitchingFunction(switchingFunction28, (double) (-1.0f), (double) (short) 1, 100);
        java.lang.String str33 = highamHall54Integrator21.getName();
        highamHall54Integrator21.setInitialStepSize((double) 1L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, Double.NaN, (double) (-1), (double) 100.0f);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator45 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler46 = highamHall54Integrator45.getStepHandler();
        highamHall54Integrator45.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler49 = highamHall54Integrator45.getStepHandler();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler55 = null;
        highamHall54Integrator54.setStepHandler(stepHandler55);
        double double57 = highamHall54Integrator54.getCurrentSignedStepsize();
        double double58 = highamHall54Integrator54.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler64 = highamHall54Integrator63.getStepHandler();
        highamHall54Integrator54.setStepHandler(stepHandler64);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator66 = null;
        stepHandler64.handleStep(stepInterpolator66, true);
        highamHall54Integrator45.setStepHandler(stepHandler64);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator70 = null;
        stepHandler64.handleStep(stepInterpolator70, true);
        highamHall54Integrator40.setStepHandler(stepHandler64);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator74 = null;
        stepHandler64.handleStep(stepInterpolator74, false);
        highamHall54Integrator21.setStepHandler(stepHandler64);
        highamHall54Integrator4.setStepHandler(stepHandler64);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction79 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction79, (double) 2, 3.7829664360127033d, (int) (short) 100);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Higham-Hall 5(4)" + "'", str15, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Higham-Hall 5(4)" + "'", str16, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Higham-Hall 5(4)" + "'", str26, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Higham-Hall 5(4)" + "'", str33, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue(Double.isNaN(double57));
        org.junit.Assert.assertTrue(Double.isNaN(double58));
        org.junit.Assert.assertNotNull(stepHandler64);
    }

    @Test
    public void test16736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16736");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 'a', 2.0d, 0.2d, 5.477225575051661d);
    }

    @Test
    public void test16737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16737");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 10, 10.0d, (double) 10, Double.NaN);
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, (double) 'a', (double) 10L, (int) (short) 10);
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test16738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16738");
        double[] doubleArray2 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler3.evaluateStep(stepInterpolator4);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler7 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator8 = null;
        boolean boolean9 = switchingFunctionsHandler7.evaluateStep(stepInterpolator8);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        boolean boolean11 = switchingFunctionsHandler7.evaluateStep(stepInterpolator10);
        double[] doubleArray17 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler7.stepAccepted((double) (byte) 1, doubleArray17);
        boolean boolean19 = switchingFunctionsHandler3.reset((double) (byte) 1, doubleArray17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) (-1), doubleArray2, doubleArray17);
        double double21 = highamHall54Integrator20.getMinStep();
        highamHall54Integrator20.setInitialStepSize(3.1622776601683795d);
        int int24 = highamHall54Integrator20.getOrder();
        double double25 = highamHall54Integrator20.getMinStep();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 1.0d + "'", double21 == 1.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test16739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16739");
        double[] doubleArray7 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler8 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler8.evaluateStep(stepInterpolator9);
        double double11 = switchingFunctionsHandler8.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        switchingFunctionsHandler8.add(switchingFunction12, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler18 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        boolean boolean20 = switchingFunctionsHandler18.evaluateStep(stepInterpolator19);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        boolean boolean24 = switchingFunctionsHandler22.evaluateStep(stepInterpolator23);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        boolean boolean26 = switchingFunctionsHandler22.evaluateStep(stepInterpolator25);
        double[] doubleArray32 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler22.stepAccepted((double) (byte) 1, doubleArray32);
        boolean boolean34 = switchingFunctionsHandler18.reset((double) (byte) 1, doubleArray32);
        boolean boolean35 = switchingFunctionsHandler8.reset((double) '4', doubleArray32);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator36 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray7, doubleArray32);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler37 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        boolean boolean39 = switchingFunctionsHandler37.evaluateStep(stepInterpolator38);
        double double40 = switchingFunctionsHandler37.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        switchingFunctionsHandler37.add(switchingFunction41, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler47 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator48 = null;
        boolean boolean49 = switchingFunctionsHandler47.evaluateStep(stepInterpolator48);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator52 = null;
        boolean boolean53 = switchingFunctionsHandler51.evaluateStep(stepInterpolator52);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator54 = null;
        boolean boolean55 = switchingFunctionsHandler51.evaluateStep(stepInterpolator54);
        double[] doubleArray61 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler51.stepAccepted((double) (byte) 1, doubleArray61);
        boolean boolean63 = switchingFunctionsHandler47.reset((double) (byte) 1, doubleArray61);
        boolean boolean64 = switchingFunctionsHandler37.reset((double) '4', doubleArray61);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator65 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (-1L), (double) (-1L), doubleArray32, doubleArray61);
        double double66 = highamHall54Integrator65.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction67 = null;
        highamHall54Integrator65.addSwitchingFunction(switchingFunction67, 0.9d, (double) 0.0f, (int) 'a');
        int int72 = highamHall54Integrator65.getOrder();
        java.lang.String str73 = highamHall54Integrator65.getName();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 5 + "'", int72 == 5);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Higham-Hall 5(4)" + "'", str73, "Higham-Hall 5(4)");
    }

    @Test
    public void test16740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16740");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getCurrentStepStart();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction11, 5.580754698496868d, (double) (byte) 0, (-1));
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test16741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16741");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize(10.0d);
        double double10 = highamHall54Integrator4.getMinStep();
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        double double18 = highamHall54Integrator16.getMinStep();
        double double19 = highamHall54Integrator16.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator16.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator21 = null;
        stepHandler20.handleStep(stepInterpolator21, false);
        highamHall54Integrator4.setStepHandler(stepHandler20);
        java.lang.String str25 = highamHall54Integrator4.getName();
        double double26 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator4.getStepHandler();
        double double28 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction29, (double) (short) 0, (double) 100.0f, 0);
        highamHall54Integrator4.setMinReduction(32.0d);
        java.lang.String str36 = highamHall54Integrator4.getName();
        double double37 = highamHall54Integrator4.getMinStep();
        double double38 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMinReduction(22.80350850198276d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.9d + "'", double28 == 0.9d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Higham-Hall 5(4)" + "'", str36, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
    }

    @Test
    public void test16742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16742");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        double[] doubleArray10 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler0.stepAccepted((double) (byte) 1, doubleArray10);
        double[] doubleArray18 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler19 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator20 = null;
        boolean boolean21 = switchingFunctionsHandler19.evaluateStep(stepInterpolator20);
        double double22 = switchingFunctionsHandler19.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        switchingFunctionsHandler19.add(switchingFunction23, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        boolean boolean31 = switchingFunctionsHandler29.evaluateStep(stepInterpolator30);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler33 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator34 = null;
        boolean boolean35 = switchingFunctionsHandler33.evaluateStep(stepInterpolator34);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler33.evaluateStep(stepInterpolator36);
        double[] doubleArray43 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler33.stepAccepted((double) (byte) 1, doubleArray43);
        boolean boolean45 = switchingFunctionsHandler29.reset((double) (byte) 1, doubleArray43);
        boolean boolean46 = switchingFunctionsHandler19.reset((double) '4', doubleArray43);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray18, doubleArray43);
        boolean boolean48 = switchingFunctionsHandler0.reset((double) (byte) 0, doubleArray43);
        boolean boolean49 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        switchingFunctionsHandler0.add(switchingFunction50, 100.0d, (double) 10L, 5);
        boolean boolean55 = switchingFunctionsHandler0.isEmpty();
        double double56 = switchingFunctionsHandler0.getEventTime();
        boolean boolean57 = switchingFunctionsHandler0.stop();
        boolean boolean58 = switchingFunctionsHandler0.isEmpty();
        double double59 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double59));
    }

    @Test
    public void test16743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16743");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler2.evaluateStep(stepInterpolator3);
        double double5 = switchingFunctionsHandler2.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        switchingFunctionsHandler2.add(switchingFunction6, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        boolean boolean14 = switchingFunctionsHandler12.evaluateStep(stepInterpolator13);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler16 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        boolean boolean18 = switchingFunctionsHandler16.evaluateStep(stepInterpolator17);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        boolean boolean20 = switchingFunctionsHandler16.evaluateStep(stepInterpolator19);
        double[] doubleArray26 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler16.stepAccepted((double) (byte) 1, doubleArray26);
        boolean boolean28 = switchingFunctionsHandler12.reset((double) (byte) 1, doubleArray26);
        boolean boolean29 = switchingFunctionsHandler2.reset((double) '4', doubleArray26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        boolean boolean32 = switchingFunctionsHandler30.evaluateStep(stepInterpolator31);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler34 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator35 = null;
        boolean boolean36 = switchingFunctionsHandler34.evaluateStep(stepInterpolator35);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler34.evaluateStep(stepInterpolator37);
        double[] doubleArray44 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler34.stepAccepted((double) (byte) 1, doubleArray44);
        boolean boolean46 = switchingFunctionsHandler30.reset((double) (byte) 1, doubleArray44);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, 0.0d, doubleArray26, doubleArray44);
        double double48 = highamHall54Integrator47.getMinStep();
        highamHall54Integrator47.setSafety((double) (byte) 10);
        double double51 = highamHall54Integrator47.getMinStep();
        double double52 = highamHall54Integrator47.getCurrentStepStart();
        highamHall54Integrator47.setSafety((double) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 0.0d + "'", double51 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
    }

    @Test
    public void test16744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16744");
        double[] doubleArray2 = null;
        double[] doubleArray15 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray18 = null;
        double[] doubleArray25 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray18, doubleArray25);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator27 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray15, doubleArray18);
        double[] doubleArray28 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, (double) (byte) -1, doubleArray15, doubleArray28);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        boolean boolean32 = switchingFunctionsHandler30.evaluateStep(stepInterpolator31);
        double double33 = switchingFunctionsHandler30.getEventTime();
        boolean boolean34 = switchingFunctionsHandler30.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        switchingFunctionsHandler30.add(switchingFunction35, (double) 1, (-1.0d), (int) (short) 1);
        double[] doubleArray51 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray54 = null;
        double[] doubleArray61 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator62 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray54, doubleArray61);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator63 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray51, doubleArray54);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler64 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator65 = null;
        boolean boolean66 = switchingFunctionsHandler64.evaluateStep(stepInterpolator65);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler68 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator69 = null;
        boolean boolean70 = switchingFunctionsHandler68.evaluateStep(stepInterpolator69);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator71 = null;
        boolean boolean72 = switchingFunctionsHandler68.evaluateStep(stepInterpolator71);
        double[] doubleArray78 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler68.stepAccepted((double) (byte) 1, doubleArray78);
        boolean boolean80 = switchingFunctionsHandler64.reset((double) (byte) 1, doubleArray78);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator81 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (byte) 100, doubleArray51, doubleArray78);
        boolean boolean82 = switchingFunctionsHandler30.reset(0.0d, doubleArray51);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator83 = new org.apache.commons.math.ode.HighamHall54Integrator(97.0d, (double) (byte) 0, doubleArray15, doubleArray51);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator84 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, (double) (byte) 0, doubleArray2, doubleArray15);
        int int85 = highamHall54Integrator84.getOrder();
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(doubleArray78);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray78), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 5 + "'", int85 == 5);
    }

    @Test
    public void test16745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16745");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str8 = highamHall54Integrator4.getName();
        java.lang.String str9 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) 1L);
        highamHall54Integrator4.setMaxGrowth((double) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        stepHandler14.reset();
        boolean boolean16 = stepHandler14.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test16746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16746");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler2.evaluateStep(stepInterpolator3);
        double double5 = switchingFunctionsHandler2.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        switchingFunctionsHandler2.add(switchingFunction6, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler12 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator13 = null;
        boolean boolean14 = switchingFunctionsHandler12.evaluateStep(stepInterpolator13);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler16 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        boolean boolean18 = switchingFunctionsHandler16.evaluateStep(stepInterpolator17);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        boolean boolean20 = switchingFunctionsHandler16.evaluateStep(stepInterpolator19);
        double[] doubleArray26 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler16.stepAccepted((double) (byte) 1, doubleArray26);
        boolean boolean28 = switchingFunctionsHandler12.reset((double) (byte) 1, doubleArray26);
        boolean boolean29 = switchingFunctionsHandler2.reset((double) '4', doubleArray26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler30 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        boolean boolean32 = switchingFunctionsHandler30.evaluateStep(stepInterpolator31);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler34 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator35 = null;
        boolean boolean36 = switchingFunctionsHandler34.evaluateStep(stepInterpolator35);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler34.evaluateStep(stepInterpolator37);
        double[] doubleArray44 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler34.stepAccepted((double) (byte) 1, doubleArray44);
        boolean boolean46 = switchingFunctionsHandler30.reset((double) (byte) 1, doubleArray44);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator47 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0L, 0.0d, doubleArray26, doubleArray44);
        double double48 = highamHall54Integrator47.getMinStep();
        double double49 = highamHall54Integrator47.getSafety();
        highamHall54Integrator47.setMinReduction(0.0d);
        int int52 = highamHall54Integrator47.getOrder();
        int int53 = highamHall54Integrator47.getOrder();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray44), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.0d + "'", double48 == 0.0d);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.9d + "'", double49 == 0.9d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 5 + "'", int52 == 5);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 5 + "'", int53 == 5);
    }

    @Test
    public void test16747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16747");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 1.0f, (double) (short) 10, (double) (byte) 10);
        double double5 = highamHall54Integrator4.getMaxStep();
        java.lang.String str6 = highamHall54Integrator4.getName();
        java.lang.Class<?> wildcardClass7 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test16748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16748");
        double[] doubleArray10 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray13 = null;
        double[] doubleArray20 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray13, doubleArray20);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator22 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray10, doubleArray13);
        double[] doubleArray23 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, (double) (byte) -1, doubleArray10, doubleArray23);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        highamHall54Integrator24.addSwitchingFunction(switchingFunction25, 52.0d, (double) ' ', (int) (short) -1);
        int int30 = highamHall54Integrator24.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler31 = highamHall54Integrator24.getStepHandler();
        org.junit.Assert.assertNotNull(doubleArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray10), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 5 + "'", int30 == 5);
        org.junit.Assert.assertNotNull(stepHandler31);
    }

    @Test
    public void test16749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16749");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMaxGrowth((double) 10);
        highamHall54Integrator4.setInitialStepSize((-1.0d));
        double double30 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler31 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction32, 9.924141172814958d, (double) (byte) 0, 0);
        org.apache.commons.math.ode.StepHandler stepHandler37 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) (-1));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertNotNull(stepHandler37);
    }

    @Test
    public void test16750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16750");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        java.lang.String str7 = highamHall54Integrator4.getName();
        double double8 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth((double) 10);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator15 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator15.getStepHandler();
        highamHall54Integrator15.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler24 = highamHall54Integrator23.getStepHandler();
        highamHall54Integrator23.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator23.getStepHandler();
        highamHall54Integrator15.setStepHandler(stepHandler27);
        boolean boolean29 = stepHandler27.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        stepHandler27.handleStep(stepInterpolator30, false);
        highamHall54Integrator4.setStepHandler(stepHandler27);
        java.lang.String str34 = highamHall54Integrator4.getName();
        int int35 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Higham-Hall 5(4)" + "'", str34, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 5 + "'", int35 == 5);
    }

    @Test
    public void test16751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16751");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        java.lang.String str26 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator4.getStepHandler();
        java.lang.String str28 = highamHall54Integrator4.getName();
        double double29 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double30 = highamHall54Integrator4.getMinReduction();
        java.lang.String str31 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Higham-Hall 5(4)" + "'", str26, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Higham-Hall 5(4)" + "'", str28, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.2d + "'", double30 == 0.2d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Higham-Hall 5(4)" + "'", str31, "Higham-Hall 5(4)");
    }

    @Test
    public void test16752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16752");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 3);
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        highamHall54Integrator4.setMaxGrowth((double) (byte) 100);
        double double12 = highamHall54Integrator4.getMinReduction();
        double double13 = highamHall54Integrator4.getSafety();
        double double14 = highamHall54Integrator4.getCurrentStepStart();
        double double15 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, 17.78279410038923d, 35.0d, (int) (byte) 0);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test16753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16753");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(0.0d, 17.78279410038923d, (double) 100, Double.NaN);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator9 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler10 = null;
        highamHall54Integrator9.setStepHandler(stepHandler10);
        double double12 = highamHall54Integrator9.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler13 = null;
        highamHall54Integrator9.setStepHandler(stepHandler13);
        double double15 = highamHall54Integrator9.getMaxStep();
        double double16 = highamHall54Integrator9.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator21 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator21.getStepHandler();
        highamHall54Integrator9.setStepHandler(stepHandler22);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        highamHall54Integrator9.addSwitchingFunction(switchingFunction24, (double) '4', 1.0d, (int) (short) -1);
        double double29 = highamHall54Integrator9.getMaxStep();
        java.lang.String str30 = highamHall54Integrator9.getName();
        org.apache.commons.math.ode.StepHandler stepHandler31 = highamHall54Integrator9.getStepHandler();
        double double32 = highamHall54Integrator9.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler33 = highamHall54Integrator9.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler33);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Higham-Hall 5(4)" + "'", str30, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler33);
    }

    @Test
    public void test16754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16754");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        java.lang.String str26 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator4.getStepHandler();
        java.lang.String str28 = highamHall54Integrator4.getName();
        double double29 = highamHall54Integrator4.getMinStep();
        java.lang.String str30 = highamHall54Integrator4.getName();
        double double31 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double32 = highamHall54Integrator4.getMaxStep();
        double double33 = highamHall54Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Higham-Hall 5(4)" + "'", str26, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Higham-Hall 5(4)" + "'", str28, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Higham-Hall 5(4)" + "'", str30, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + (-1.0d) + "'", double32 == (-1.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double33));
    }

    @Test
    public void test16755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16755");
        double[] doubleArray12 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray15 = null;
        double[] doubleArray22 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray15, doubleArray22);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray12, doubleArray15);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler25.evaluateStep(stepInterpolator26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler29 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        boolean boolean31 = switchingFunctionsHandler29.evaluateStep(stepInterpolator30);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator32 = null;
        boolean boolean33 = switchingFunctionsHandler29.evaluateStep(stepInterpolator32);
        double[] doubleArray39 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler29.stepAccepted((double) (byte) 1, doubleArray39);
        boolean boolean41 = switchingFunctionsHandler25.reset((double) (byte) 1, doubleArray39);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (byte) 100, doubleArray12, doubleArray39);
        double[] doubleArray43 = null;
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator44 = new org.apache.commons.math.ode.HighamHall54Integrator(3.1622776601683795d, 0.2d, doubleArray39, doubleArray43);
        org.apache.commons.math.ode.StepHandler stepHandler45 = highamHall54Integrator44.getStepHandler();
        java.lang.String str46 = highamHall54Integrator44.getName();
        double double47 = highamHall54Integrator44.getSafety();
        java.lang.String str48 = highamHall54Integrator44.getName();
        highamHall54Integrator44.setSafety(22.02271554554524d);
        java.lang.String str51 = highamHall54Integrator44.getName();
        double double52 = highamHall54Integrator44.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(stepHandler45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Higham-Hall 5(4)" + "'", str46, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.9d + "'", double47 == 0.9d);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Higham-Hall 5(4)" + "'", str48, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Higham-Hall 5(4)" + "'", str51, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.2d + "'", double52 == 0.2d);
    }

    @Test
    public void test16756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16756");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler11 = highamHall54Integrator4.getStepHandler();
        double double12 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 100L, (double) 10.0f, 0.9d);
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler18);
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator4.getStepHandler();
        int int21 = highamHall54Integrator4.getOrder();
        int int22 = highamHall54Integrator4.getOrder();
        int int23 = highamHall54Integrator4.getOrder();
        java.lang.String str24 = highamHall54Integrator4.getName();
        int int25 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.2d + "'", double10 == 0.2d);
        org.junit.Assert.assertNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Higham-Hall 5(4)" + "'", str24, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 5 + "'", int25 == 5);
    }

    @Test
    public void test16757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16757");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) '4', (double) (short) 0, 31.144823004794873d, (double) 3);
        highamHall54Integrator4.setInitialStepSize((double) 10);
    }

    @Test
    public void test16758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16758");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 'a', (double) (short) 0, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction5, (double) 0, (double) 1L, (int) '4');
        int int10 = highamHall54Integrator4.getOrder();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double double12 = highamHall54Integrator4.getMinReduction();
        java.lang.String str13 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) 100.0f);
        double double16 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setSafety(24.947901585376336d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Higham-Hall 5(4)" + "'", str13, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 97.0d + "'", double16 == 97.0d);
    }

    @Test
    public void test16759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16759");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        double double12 = highamHall54Integrator4.getMinReduction();
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double14 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMinReduction(0.4472135954999579d);
        highamHall54Integrator4.setSafety((double) 3);
        highamHall54Integrator4.setInitialStepSize(5.477225575051661d);
        highamHall54Integrator4.setMinReduction((-0.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.2d + "'", double12 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test16760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16760");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray8, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler0.reset(100.0d, doubleArray8);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler19 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator20 = null;
        boolean boolean21 = switchingFunctionsHandler19.evaluateStep(stepInterpolator20);
        double double22 = switchingFunctionsHandler19.getEventTime();
        boolean boolean23 = switchingFunctionsHandler19.stop();
        double double24 = switchingFunctionsHandler19.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        boolean boolean26 = switchingFunctionsHandler19.evaluateStep(stepInterpolator25);
        double[] doubleArray36 = new double[] { 1, (short) 100, 1.0f, 10.0d, (byte) 0, (short) 100 };
        double[] doubleArray47 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray50 = null;
        double[] doubleArray57 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator58 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray50, doubleArray57);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator59 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray47, doubleArray50);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler60 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator61 = null;
        boolean boolean62 = switchingFunctionsHandler60.evaluateStep(stepInterpolator61);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler64 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator65 = null;
        boolean boolean66 = switchingFunctionsHandler64.evaluateStep(stepInterpolator65);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator67 = null;
        boolean boolean68 = switchingFunctionsHandler64.evaluateStep(stepInterpolator67);
        double[] doubleArray74 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler64.stepAccepted((double) (byte) 1, doubleArray74);
        boolean boolean76 = switchingFunctionsHandler60.reset((double) (byte) 1, doubleArray74);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator77 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100, (double) (byte) 100, doubleArray47, doubleArray74);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator78 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, (double) (byte) 1, doubleArray36, doubleArray47);
        switchingFunctionsHandler19.stepAccepted((double) (byte) -1, doubleArray47);
        boolean boolean80 = switchingFunctionsHandler0.reset((double) 1L, doubleArray47);
        double double81 = switchingFunctionsHandler0.getEventTime();
        boolean boolean82 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator83 = null;
        boolean boolean84 = switchingFunctionsHandler0.evaluateStep(stepInterpolator83);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[1.0, 100.0, 1.0, 10.0, 0.0, 100.0]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test16761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16761");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (-1.0d), (double) (short) 10, (int) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        double double14 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction15, 100.0d, (double) ' ', 3);
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator4.getStepHandler();
        double double21 = highamHall54Integrator4.getCurrentStepStart();
        double double22 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
    }

    @Test
    public void test16762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16762");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str9 = highamHall54Integrator4.getName();
        double double10 = highamHall54Integrator4.getMaxGrowth();
        double double11 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setInitialStepSize((double) (-1L));
        highamHall54Integrator4.setMaxGrowth((double) 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction16, (double) '4', 97.0d, (int) '#');
        double double21 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double22 = highamHall54Integrator4.getCurrentStepStart();
        double double23 = highamHall54Integrator4.getMinReduction();
        double double24 = highamHall54Integrator4.getMinStep();
        double double25 = highamHall54Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.2d + "'", double23 == 0.2d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertNull(stepHandler26);
    }

    @Test
    public void test16763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16763");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) 1L, 0.0d, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str6 = highamHall54Integrator4.getName();
        java.lang.String str7 = highamHall54Integrator4.getName();
        double double8 = highamHall54Integrator4.getSafety();
        double double9 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        boolean boolean11 = stepHandler10.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Higham-Hall 5(4)" + "'", str7, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 3.1622776601683795d + "'", double9 == 3.1622776601683795d);
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test16764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16764");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler24 = null;
        highamHall54Integrator23.setStepHandler(stepHandler24);
        double double26 = highamHall54Integrator23.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = null;
        highamHall54Integrator23.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator23.getMaxStep();
        double double30 = highamHall54Integrator23.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator23.setStepHandler(stepHandler36);
        highamHall54Integrator4.setStepHandler(stepHandler36);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction39, (double) (-1L), (double) 1L, (-1));
        highamHall54Integrator4.setInitialStepSize((double) (short) 10);
        double double46 = highamHall54Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction47, 0.0d, (double) (short) 1, (int) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler52 = highamHall54Integrator4.getStepHandler();
        double double53 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction54 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction54, 52.0d, 24.947901585376336d, 10);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9d + "'", double46 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler52);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
    }

    @Test
    public void test16765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16765");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator12.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler16 = highamHall54Integrator12.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler16);
        int int18 = highamHall54Integrator4.getOrder();
        java.lang.String str19 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction20, (double) 100, (double) (byte) 100, 5);
        java.lang.String str25 = highamHall54Integrator4.getName();
        double double26 = highamHall54Integrator4.getSafety();
        double double27 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str28 = highamHall54Integrator4.getName();
        double double29 = highamHall54Integrator4.getMaxGrowth();
        double double30 = highamHall54Integrator4.getMinStep();
        double double31 = highamHall54Integrator4.getMaxGrowth();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.9d + "'", double26 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Higham-Hall 5(4)" + "'", str28, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test16766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16766");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        double[] doubleArray4 = null;
        double[] doubleArray11 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray4, doubleArray11);
        switchingFunctionsHandler0.stepAccepted((double) 10L, doubleArray4);
        boolean boolean14 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        switchingFunctionsHandler0.add(switchingFunction15, 0.2d, (double) 1, (int) (byte) -1);
        double[] doubleArray26 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator28 = null;
        boolean boolean29 = switchingFunctionsHandler27.evaluateStep(stepInterpolator28);
        double double30 = switchingFunctionsHandler27.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction31 = null;
        switchingFunctionsHandler27.add(switchingFunction31, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler37 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        boolean boolean39 = switchingFunctionsHandler37.evaluateStep(stepInterpolator38);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler41 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        boolean boolean43 = switchingFunctionsHandler41.evaluateStep(stepInterpolator42);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator44 = null;
        boolean boolean45 = switchingFunctionsHandler41.evaluateStep(stepInterpolator44);
        double[] doubleArray51 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler41.stepAccepted((double) (byte) 1, doubleArray51);
        boolean boolean53 = switchingFunctionsHandler37.reset((double) (byte) 1, doubleArray51);
        boolean boolean54 = switchingFunctionsHandler27.reset((double) '4', doubleArray51);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator55 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray26, doubleArray51);
        boolean boolean56 = switchingFunctionsHandler0.reset((double) 1L, doubleArray51);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator57 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = switchingFunctionsHandler0.evaluateStep(stepInterpolator57);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test16767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16767");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) 1L, 0.0d, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) (byte) 100, Double.NaN, (int) (byte) 0);
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, (double) 0, 0.9d, (int) (short) 100);
        double double17 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction18, (double) 'a', (double) 'a', 0);
        double double23 = highamHall54Integrator4.getMinStep();
        java.lang.String str24 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMinReduction((double) (-1L));
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler32 = null;
        highamHall54Integrator31.setStepHandler(stepHandler32);
        double double34 = highamHall54Integrator31.getCurrentSignedStepsize();
        double double35 = highamHall54Integrator31.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator40 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler41 = highamHall54Integrator40.getStepHandler();
        highamHall54Integrator31.setStepHandler(stepHandler41);
        boolean boolean43 = stepHandler41.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler41);
        highamHall54Integrator4.setMinReduction(9.924141172814958d);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2d + "'", double17 == 0.2d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Higham-Hall 5(4)" + "'", str24, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test16768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16768");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler0.evaluateStep(stepInterpolator3);
        double[] doubleArray8 = null;
        double[] doubleArray15 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray8, doubleArray15);
        boolean boolean17 = switchingFunctionsHandler0.reset(100.0d, doubleArray8);
        double[] doubleArray24 = new double[] { (byte) -1, (byte) 100, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler25 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        boolean boolean27 = switchingFunctionsHandler25.evaluateStep(stepInterpolator26);
        double double28 = switchingFunctionsHandler25.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        switchingFunctionsHandler25.add(switchingFunction29, 1.0d, Double.NaN, 1);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler35 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        boolean boolean37 = switchingFunctionsHandler35.evaluateStep(stepInterpolator36);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        boolean boolean41 = switchingFunctionsHandler39.evaluateStep(stepInterpolator40);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        boolean boolean43 = switchingFunctionsHandler39.evaluateStep(stepInterpolator42);
        double[] doubleArray49 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler39.stepAccepted((double) (byte) 1, doubleArray49);
        boolean boolean51 = switchingFunctionsHandler35.reset((double) (byte) 1, doubleArray49);
        boolean boolean52 = switchingFunctionsHandler25.reset((double) '4', doubleArray49);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator53 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) (byte) 0, doubleArray24, doubleArray49);
        boolean boolean54 = switchingFunctionsHandler0.reset(0.0d, doubleArray24);
        double double55 = switchingFunctionsHandler0.getEventTime();
        boolean boolean56 = switchingFunctionsHandler0.isEmpty();
        boolean boolean57 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction58 = null;
        switchingFunctionsHandler0.add(switchingFunction58, (double) (-1L), (double) (short) 10, (int) (short) 10);
        boolean boolean63 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction64 = null;
        switchingFunctionsHandler0.add(switchingFunction64, (double) 100L, 9.924141172814958d, 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[-1.0, 100.0, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double55));
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test16769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16769");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', 17.752843424574987d, 9.486832980505138d, 1.4142135623730951d);
    }

    @Test
    public void test16770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16770");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (-1.0d), (double) (short) 10, (int) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler13 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(0.9d);
        double double16 = highamHall54Integrator4.getMaxGrowth();
        double double17 = highamHall54Integrator4.getSafety();
        double double18 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str19 = highamHall54Integrator4.getName();
        java.lang.String str20 = highamHall54Integrator4.getName();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9d + "'", double17 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double18));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Higham-Hall 5(4)" + "'", str20, "Higham-Hall 5(4)");
    }

    @Test
    public void test16771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16771");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize(0.0d);
        double double28 = highamHall54Integrator4.getMinStep();
        double double29 = highamHall54Integrator4.getSafety();
        double double30 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setSafety(97.0d);
        int int33 = highamHall54Integrator4.getOrder();
        double double34 = highamHall54Integrator4.getMinStep();
        highamHall54Integrator4.setMaxGrowth(3.1622776601683795d);
        highamHall54Integrator4.setMinReduction((double) 1L);
        double double39 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler40 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.9d + "'", double29 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 5 + "'", int33 == 5);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler40);
    }

    @Test
    public void test16772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16772");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 0.0f, (double) 5, (double) 1, (double) (short) -1);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double7 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str8 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
    }

    @Test
    public void test16773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16773");
        double[] doubleArray12 = new double[] { 10.0d, 0, 100L, 10.0d, (byte) 1, '4' };
        double[] doubleArray15 = null;
        double[] doubleArray22 = new double[] { 100.0d, 100L, 1, (-1L), 1.0d, 0 };
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (byte) 1, (double) (-1L), doubleArray15, doubleArray22);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1.0f, (double) 0, doubleArray12, doubleArray15);
        double[] doubleArray25 = new double[] {};
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator26 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 100, (double) (byte) -1, doubleArray12, doubleArray25);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler27 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        switchingFunctionsHandler27.add(switchingFunction28, (double) 1.0f, (double) (byte) -1, 10);
        boolean boolean33 = switchingFunctionsHandler27.isEmpty();
        boolean boolean34 = switchingFunctionsHandler27.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler36 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler36.evaluateStep(stepInterpolator37);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler40 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator41 = null;
        boolean boolean42 = switchingFunctionsHandler40.evaluateStep(stepInterpolator41);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator43 = null;
        boolean boolean44 = switchingFunctionsHandler40.evaluateStep(stepInterpolator43);
        double[] doubleArray50 = new double[] { 1L, 1, (-1.0d), 1 };
        switchingFunctionsHandler40.stepAccepted((double) (byte) 1, doubleArray50);
        boolean boolean52 = switchingFunctionsHandler36.reset((double) (byte) 1, doubleArray50);
        boolean boolean53 = switchingFunctionsHandler27.reset((double) 1L, doubleArray50);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator54 = new org.apache.commons.math.ode.HighamHall54Integrator((double) ' ', 0.9d, doubleArray25, doubleArray50);
        highamHall54Integrator54.setInitialStepSize((double) (short) 0);
        highamHall54Integrator54.setInitialStepSize(32.0d);
        double double59 = highamHall54Integrator54.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[10.0, 0.0, 100.0, 10.0, 1.0, 52.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[100.0, 100.0, 1.0, -1.0, 1.0, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray25), "[]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[1.0, 1.0, -1.0, 1.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.2d + "'", double59 == 0.2d);
    }

    @Test
    public void test16774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16774");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler7 = highamHall54Integrator4.getStepHandler();
        int int8 = highamHall54Integrator4.getOrder();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str10 = highamHall54Integrator4.getName();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Higham-Hall 5(4)" + "'", str10, "Higham-Hall 5(4)");
    }

    @Test
    public void test16775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16775");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        int int8 = highamHall54Integrator4.getOrder();
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler10 = highamHall54Integrator4.getStepHandler();
        double double11 = highamHall54Integrator4.getMinReduction();
        int int12 = highamHall54Integrator4.getOrder();
        double double13 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        double double15 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
    }

    @Test
    public void test16776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16776");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10L, 0.0d, 0.2d, (double) (short) 10);
        double double5 = highamHall54Integrator4.getMinStep();
        double double6 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setMaxGrowth(10.0d);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator13 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler14 = null;
        highamHall54Integrator13.setStepHandler(stepHandler14);
        double double16 = highamHall54Integrator13.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler17 = null;
        highamHall54Integrator13.setStepHandler(stepHandler17);
        double double19 = highamHall54Integrator13.getMaxStep();
        double double20 = highamHall54Integrator13.getMaxGrowth();
        java.lang.String str21 = highamHall54Integrator13.getName();
        double double22 = highamHall54Integrator13.getCurrentSignedStepsize();
        double double23 = highamHall54Integrator13.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler24 = highamHall54Integrator13.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler25 = highamHall54Integrator13.getStepHandler();
        double double26 = highamHall54Integrator13.getCurrentSignedStepsize();
        java.lang.String str27 = highamHall54Integrator13.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator32 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10.0f, (double) 'a', (double) (short) 0, (double) (-1));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        highamHall54Integrator32.addSwitchingFunction(switchingFunction33, (double) '#', (double) 100, (int) '#');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator42 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 0.2d, (double) (-1L), (double) (byte) -1);
        double double43 = highamHall54Integrator42.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler44 = highamHall54Integrator42.getStepHandler();
        highamHall54Integrator32.setStepHandler(stepHandler44);
        highamHall54Integrator13.setStepHandler(stepHandler44);
        highamHall54Integrator4.setStepHandler(stepHandler44);
        double double48 = highamHall54Integrator4.getMinReduction();
        int int49 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Higham-Hall 5(4)" + "'", str21, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNull(stepHandler24);
        org.junit.Assert.assertNull(stepHandler25);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Higham-Hall 5(4)" + "'", str27, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 0.2d + "'", double48 == 0.2d);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 5 + "'", int49 == 5);
    }

    @Test
    public void test16777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16777");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double14 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler15 = highamHall54Integrator4.getStepHandler();
        double double16 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test16778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16778");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(2.0d, (double) (-1L), 97.0d, (double) (-1));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
    }

    @Test
    public void test16779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16779");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        highamHall54Integrator4.setMinReduction((double) 100.0f);
        java.lang.String str12 = highamHall54Integrator4.getName();
        double double13 = highamHall54Integrator4.getMinStep();
        double double14 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str15 = highamHall54Integrator4.getName();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Higham-Hall 5(4)" + "'", str12, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Higham-Hall 5(4)" + "'", str15, "Higham-Hall 5(4)");
    }

    @Test
    public void test16780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16780");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler24 = null;
        highamHall54Integrator23.setStepHandler(stepHandler24);
        double double26 = highamHall54Integrator23.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = null;
        highamHall54Integrator23.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator23.getMaxStep();
        double double30 = highamHall54Integrator23.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator23.setStepHandler(stepHandler36);
        highamHall54Integrator4.setStepHandler(stepHandler36);
        double double39 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str40 = highamHall54Integrator4.getName();
        java.lang.String str41 = highamHall54Integrator4.getName();
        double double42 = highamHall54Integrator4.getMinStep();
        double double43 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str44 = highamHall54Integrator4.getName();
        java.lang.String str45 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Higham-Hall 5(4)" + "'", str40, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Higham-Hall 5(4)" + "'", str41, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Higham-Hall 5(4)" + "'", str44, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Higham-Hall 5(4)" + "'", str45, "Higham-Hall 5(4)");
    }

    @Test
    public void test16781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16781");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction(10.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction8, (-1.0d), (double) (short) 10, (int) (byte) 1);
        highamHall54Integrator4.setMaxGrowth((double) (-1));
        double double15 = highamHall54Integrator4.getMinReduction();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator20 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler21 = null;
        highamHall54Integrator20.setStepHandler(stepHandler21);
        double double23 = highamHall54Integrator20.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler24 = null;
        highamHall54Integrator20.setStepHandler(stepHandler24);
        double double26 = highamHall54Integrator20.getMaxStep();
        double double27 = highamHall54Integrator20.getMinStep();
        double double28 = highamHall54Integrator20.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator33 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler34 = highamHall54Integrator33.getStepHandler();
        highamHall54Integrator33.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler37 = highamHall54Integrator33.getStepHandler();
        boolean boolean38 = stepHandler37.requiresDenseOutput();
        highamHall54Integrator20.setStepHandler(stepHandler37);
        double double40 = highamHall54Integrator20.getSafety();
        java.lang.String str41 = highamHall54Integrator20.getName();
        highamHall54Integrator20.setSafety((double) '#');
        java.lang.String str44 = highamHall54Integrator20.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator49 = new org.apache.commons.math.ode.HighamHall54Integrator(1.0d, 0.2d, (double) (-1L), (double) (byte) -1);
        double double50 = highamHall54Integrator49.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler51 = highamHall54Integrator49.getStepHandler();
        highamHall54Integrator20.setStepHandler(stepHandler51);
        stepHandler51.reset();
        highamHall54Integrator4.setStepHandler(stepHandler51);
        double double55 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction56 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction56, 0.7952707287670507d, 0.0d, (int) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler61 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9d + "'", double40 == 0.9d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Higham-Hall 5(4)" + "'", str41, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Higham-Hall 5(4)" + "'", str44, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + (-1.0d) + "'", double55 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler61);
    }

    @Test
    public void test16782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16782");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(31.622776601683793d, 0.0d, (double) (-1), (double) 100.0f);
        highamHall54Integrator4.setMinReduction((double) (byte) -1);
        double double7 = highamHall54Integrator4.getSafety();
        double double8 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction9, 17.78279410038923d, 3.7829664360127033d, (int) '#');
        java.lang.String str14 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Higham-Hall 5(4)" + "'", str14, "Higham-Hall 5(4)");
    }

    @Test
    public void test16783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16783");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler8 = highamHall54Integrator4.getStepHandler();
        double double9 = highamHall54Integrator4.getCurrentStepStart();
        double double10 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler8);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test16784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16784");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        double double8 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator13 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator13.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler14);
        boolean boolean16 = stepHandler14.requiresDenseOutput();
        boolean boolean17 = stepHandler14.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test16785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16785");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(10.0d, (double) 1L, 0.0d, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction6, (double) (byte) 100, Double.NaN, (int) (byte) 0);
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction12, (double) 0, 0.9d, (int) (short) 100);
        double double17 = highamHall54Integrator4.getMinReduction();
        double double18 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setSafety((double) (byte) 10);
        int int21 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler22 = highamHall54Integrator4.getStepHandler();
        double double23 = highamHall54Integrator4.getCurrentStepStart();
        double double24 = highamHall54Integrator4.getCurrentStepStart();
        java.lang.String str25 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction26, 2.1213203435596424d, 3.1622776601683795d, (int) (short) 10);
        java.lang.String str31 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2d + "'", double17 == 0.2d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Higham-Hall 5(4)" + "'", str31, "Higham-Hall 5(4)");
    }

    @Test
    public void test16786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16786");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, 10.0d, 17.78279410038923d, (double) '4');
        int int5 = highamHall54Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test16787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16787");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(7.211102550927978d, 2.514866859365871d, 0.2d, 0.0d);
    }

    @Test
    public void test16788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16788");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator23 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler24 = null;
        highamHall54Integrator23.setStepHandler(stepHandler24);
        double double26 = highamHall54Integrator23.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = null;
        highamHall54Integrator23.setStepHandler(stepHandler27);
        double double29 = highamHall54Integrator23.getMaxStep();
        double double30 = highamHall54Integrator23.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator35 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler36 = highamHall54Integrator35.getStepHandler();
        highamHall54Integrator23.setStepHandler(stepHandler36);
        highamHall54Integrator4.setStepHandler(stepHandler36);
        double double39 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str40 = highamHall54Integrator4.getName();
        java.lang.String str41 = highamHall54Integrator4.getName();
        int int42 = highamHall54Integrator4.getOrder();
        double double43 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str44 = highamHall54Integrator4.getName();
        java.lang.String str45 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator50 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler51 = highamHall54Integrator50.getStepHandler();
        highamHall54Integrator50.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler54 = highamHall54Integrator50.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        highamHall54Integrator50.addSwitchingFunction(switchingFunction55, (double) (-1.0f), (double) (byte) 0, (int) (short) -1);
        double double60 = highamHall54Integrator50.getMaxStep();
        double double61 = highamHall54Integrator50.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler62 = highamHall54Integrator50.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler62);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Higham-Hall 5(4)" + "'", str40, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Higham-Hall 5(4)" + "'", str41, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 5 + "'", int42 == 5);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Higham-Hall 5(4)" + "'", str44, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Higham-Hall 5(4)" + "'", str45, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertNotNull(stepHandler54);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + (-1.0d) + "'", double61 == (-1.0d));
        org.junit.Assert.assertNotNull(stepHandler62);
    }

    @Test
    public void test16789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16789");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        highamHall54Integrator4.setMaxGrowth((double) (byte) -1);
        double double13 = highamHall54Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler14 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction15, 55.3841974787333d, (double) (short) 10, (int) (byte) 0);
        double double20 = highamHall54Integrator4.getMinReduction();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertNull(stepHandler14);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
    }

    @Test
    public void test16790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16790");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        double double26 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction28, (double) (short) 10, (double) (byte) -1, (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction33, (double) 0L, (double) (-1L), (int) 'a');
        highamHall54Integrator4.setInitialStepSize((double) 3);
        double double40 = highamHall54Integrator4.getMaxGrowth();
        java.lang.String str41 = highamHall54Integrator4.getName();
        java.lang.String str42 = highamHall54Integrator4.getName();
        double double43 = highamHall54Integrator4.getMinStep();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 10.0d + "'", double40 == 10.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Higham-Hall 5(4)" + "'", str41, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Higham-Hall 5(4)" + "'", str42, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
    }

    @Test
    public void test16791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16791");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 100L, 0.0d, (double) 100.0f, 0.0d);
        double double5 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler6 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setInitialStepSize((double) 100.0f);
        java.lang.String str9 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator14 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1L, (double) (short) 0, 10.0d, (double) (byte) -1);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator19 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator19.getStepHandler();
        highamHall54Integrator19.setInitialStepSize((double) 3);
        highamHall54Integrator19.setInitialStepSize((double) 'a');
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator29 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler30 = highamHall54Integrator29.getStepHandler();
        boolean boolean31 = stepHandler30.requiresDenseOutput();
        highamHall54Integrator19.setStepHandler(stepHandler30);
        boolean boolean33 = stepHandler30.requiresDenseOutput();
        stepHandler30.reset();
        boolean boolean35 = stepHandler30.requiresDenseOutput();
        highamHall54Integrator14.setStepHandler(stepHandler30);
        highamHall54Integrator4.setStepHandler(stepHandler30);
        stepHandler30.reset();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertNotNull(stepHandler30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test16792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16792");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 3, 2.514866859365871d, 32.0d, 10.0d);
        java.lang.String str5 = highamHall54Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
    }

    @Test
    public void test16793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16793");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        highamHall54Integrator4.setStepHandler(stepHandler17);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction19, (double) '4', 1.0d, (int) (short) -1);
        double double24 = highamHall54Integrator4.getMaxStep();
        double double25 = highamHall54Integrator4.getSafety();
        double double26 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator4.getStepHandler();
        double double28 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setInitialStepSize((double) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction31 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction31, 0.0d, (double) 1.0f, (int) '4');
        java.lang.String str36 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setInitialStepSize((double) (byte) 100);
        double double39 = highamHall54Integrator4.getMaxGrowth();
        highamHall54Integrator4.setMaxGrowth(3.3635856610148585d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Higham-Hall 5(4)" + "'", str36, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
    }

    @Test
    public void test16794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16794");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = null;
        highamHall54Integrator4.setStepHandler(stepHandler5);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler8 = null;
        highamHall54Integrator4.setStepHandler(stepHandler8);
        double double10 = highamHall54Integrator4.getMaxStep();
        double double11 = highamHall54Integrator4.getMinStep();
        double double12 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator17 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator17.getStepHandler();
        highamHall54Integrator17.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler21 = highamHall54Integrator17.getStepHandler();
        boolean boolean22 = stepHandler21.requiresDenseOutput();
        highamHall54Integrator4.setStepHandler(stepHandler21);
        double double24 = highamHall54Integrator4.getSafety();
        java.lang.String str25 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler26 = highamHall54Integrator4.getStepHandler();
        java.lang.String str27 = highamHall54Integrator4.getName();
        java.lang.String str28 = highamHall54Integrator4.getName();
        double double29 = highamHall54Integrator4.getMinStep();
        java.lang.String str30 = highamHall54Integrator4.getName();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9d + "'", double24 == 0.9d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Higham-Hall 5(4)" + "'", str27, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Higham-Hall 5(4)" + "'", str28, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Higham-Hall 5(4)" + "'", str30, "Higham-Hall 5(4)");
    }

    @Test
    public void test16795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16795");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        highamHall54Integrator4.setMinReduction((double) 10L);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator12 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler13 = null;
        highamHall54Integrator12.setStepHandler(stepHandler13);
        double double15 = highamHall54Integrator12.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler16 = null;
        highamHall54Integrator12.setStepHandler(stepHandler16);
        double double18 = highamHall54Integrator12.getMaxStep();
        double double19 = highamHall54Integrator12.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator24 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler25 = highamHall54Integrator24.getStepHandler();
        highamHall54Integrator12.setStepHandler(stepHandler25);
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator31 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler32 = null;
        highamHall54Integrator31.setStepHandler(stepHandler32);
        double double34 = highamHall54Integrator31.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler35 = null;
        highamHall54Integrator31.setStepHandler(stepHandler35);
        double double37 = highamHall54Integrator31.getMaxStep();
        double double38 = highamHall54Integrator31.getMinStep();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator43 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler44 = highamHall54Integrator43.getStepHandler();
        highamHall54Integrator31.setStepHandler(stepHandler44);
        highamHall54Integrator12.setStepHandler(stepHandler44);
        highamHall54Integrator4.setStepHandler(stepHandler44);
        double double48 = highamHall54Integrator4.getCurrentStepStart();
        double double49 = highamHall54Integrator4.getMinStep();
        double double50 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setMinReduction((double) 1);
        double double53 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler54 = highamHall54Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        highamHall54Integrator4.addSwitchingFunction(switchingFunction55, 1.0d, 35.0d, (int) '4');
        highamHall54Integrator4.setMaxGrowth(2.23606797749979d);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue(Double.isNaN(double15));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.9d + "'", double50 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(stepHandler54);
    }

    @Test
    public void test16796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16796");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) (short) 1, (double) (short) 0, 1.0d, Double.NaN);
        highamHall54Integrator4.setMinReduction((double) (short) 1);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test16797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16797");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler5 = highamHall54Integrator4.getStepHandler();
        double double6 = highamHall54Integrator4.getMinStep();
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize(10.0d);
        double double10 = highamHall54Integrator4.getMinStep();
        double double11 = highamHall54Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator16 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler17 = highamHall54Integrator16.getStepHandler();
        double double18 = highamHall54Integrator16.getMinStep();
        double double19 = highamHall54Integrator16.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler20 = highamHall54Integrator16.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator21 = null;
        stepHandler20.handleStep(stepInterpolator21, false);
        highamHall54Integrator4.setStepHandler(stepHandler20);
        java.lang.String str25 = highamHall54Integrator4.getName();
        double double26 = highamHall54Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler27 = highamHall54Integrator4.getStepHandler();
        double double28 = highamHall54Integrator4.getSafety();
        double double29 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str30 = highamHall54Integrator4.getName();
        double double31 = highamHall54Integrator4.getSafety();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Higham-Hall 5(4)" + "'", str25, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.9d + "'", double28 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Higham-Hall 5(4)" + "'", str30, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9d + "'", double31 == 0.9d);
    }

    @Test
    public void test16798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16798");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        highamHall54Integrator4.setMinReduction((double) 10.0f);
        double double7 = highamHall54Integrator4.getCurrentSignedStepsize();
        java.lang.String str8 = highamHall54Integrator4.getName();
        java.lang.String str9 = highamHall54Integrator4.getName();
        highamHall54Integrator4.setMaxGrowth((double) 1L);
        double double12 = highamHall54Integrator4.getMaxStep();
        double double13 = highamHall54Integrator4.getSafety();
        highamHall54Integrator4.setInitialStepSize(3.1622776601683795d);
        double double16 = highamHall54Integrator4.getMinReduction();
        int int17 = highamHall54Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler18 = highamHall54Integrator4.getStepHandler();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Higham-Hall 5(4)" + "'", str8, "Higham-Hall 5(4)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Higham-Hall 5(4)" + "'", str9, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertNotNull(stepHandler18);
    }

    @Test
    public void test16799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16799");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 1, 56.568542494923804d, (double) 0.0f, (double) (short) -1);
        java.lang.String str5 = highamHall54Integrator4.getName();
        java.lang.Class<?> wildcardClass6 = highamHall54Integrator4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Higham-Hall 5(4)" + "'", str5, "Higham-Hall 5(4)");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test16800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test16800");
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator4 = new org.apache.commons.math.ode.HighamHall54Integrator(100.0d, (double) 0L, (double) 3, (double) (short) 10);
        double double5 = highamHall54Integrator4.getMinReduction();
        java.lang.String str6 = highamHall54Integrator4.getName();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator11 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler12 = null;
        highamHall54Integrator11.setStepHandler(stepHandler12);
        double double14 = highamHall54Integrator11.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler15 = null;
        highamHall54Integrator11.setStepHandler(stepHandler15);
        double double17 = highamHall54Integrator11.getMaxStep();
        double double18 = highamHall54Integrator11.getMaxGrowth();
        java.lang.String str19 = highamHall54Integrator11.getName();
        double double20 = highamHall54Integrator11.getMinReduction();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator25 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler26 = null;
        highamHall54Integrator25.setStepHandler(stepHandler26);
        double double28 = highamHall54Integrator25.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler29 = null;
        highamHall54Integrator25.setStepHandler(stepHandler29);
        double double31 = highamHall54Integrator25.getMaxStep();
        double double32 = highamHall54Integrator25.getMinStep();
        double double33 = highamHall54Integrator25.getCurrentSignedStepsize();
        org.apache.commons.math.ode.HighamHall54Integrator highamHall54Integrator38 = new org.apache.commons.math.ode.HighamHall54Integrator((double) 10, (double) (byte) -1, 100.0d, (double) (-1.0f));
        org.apache.commons.math.ode.StepHandler stepHandler39 = highamHall54Integrator38.getStepHandler();
        highamHall54Integrator38.setMinReduction((double) 10L);
        org.apache.commons.math.ode.StepHandler stepHandler42 = highamHall54Integrator38.getStepHandler();
        boolean boolean43 = stepHandler42.requiresDenseOutput();
        highamHall54Integrator25.setStepHandler(stepHandler42);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator45 = null;
        stepHandler42.handleStep(stepInterpolator45, true);
        stepHandler42.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator49 = null;
        stepHandler42.handleStep(stepInterpolator49, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator52 = null;
        stepHandler42.handleStep(stepInterpolator52, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator55 = null;
        stepHandler42.handleStep(stepInterpolator55, true);
        highamHall54Integrator11.setStepHandler(stepHandler42);
        stepHandler42.reset();
        highamHall54Integrator4.setStepHandler(stepHandler42);
        double double61 = highamHall54Integrator4.getCurrentSignedStepsize();
        highamHall54Integrator4.setInitialStepSize(35.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Higham-Hall 5(4)" + "'", str6, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Higham-Hall 5(4)" + "'", str19, "Higham-Hall 5(4)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertNotNull(stepHandler42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 0.0d + "'", double61 == 0.0d);
    }
}

