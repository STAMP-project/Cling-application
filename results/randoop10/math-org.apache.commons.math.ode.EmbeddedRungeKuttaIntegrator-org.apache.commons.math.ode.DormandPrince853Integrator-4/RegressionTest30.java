import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test15001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15001");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, (double) '#', 0.9d, (double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        double double6 = dormandPrince853Integrator4.getSafety();
        double double7 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double8 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 5.916079783099616d + "'", double7 == 5.916079783099616d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 5.916079783099616d + "'", double8 == 5.916079783099616d);
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getSafety();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler13 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str14 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str14, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 0, 0.0d, (double) ' ', 0.9486832980505138d);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMinReduction(0.0d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction13, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator12.setMinReduction(100.0d);
        double double20 = dormandPrince853Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction21, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler26 = dormandPrince853Integrator12.getStepHandler();
        int int27 = dormandPrince853Integrator12.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction28, (double) (-1L), (double) (byte) 1, (int) (short) 1);
        double double33 = dormandPrince853Integrator12.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator12.getStepHandler();
        boolean boolean35 = stepHandler34.requiresDenseOutput();
        dormandPrince853Integrator4.setStepHandler(stepHandler34);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        stepHandler34.handleStep(stepInterpolator37, true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.9d + "'", double33 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) 10.0f);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction14, (double) (-1), (double) 3, 1);
        java.lang.String str19 = dormandPrince853Integrator4.getName();
        double double20 = dormandPrince853Integrator4.getSafety();
        double double21 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int22 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str19, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(100.0d, (double) 1L, 98.48857801796105d, 8.0d);
        int int5 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler6 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertNotNull(stepHandler6);
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        double[] doubleArray3 = new double[] { Double.NaN };
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray3, doubleArray12);
        java.lang.String str18 = dormandPrince853Integrator17.getName();
        java.lang.String str19 = dormandPrince853Integrator17.getName();
        int int20 = dormandPrince853Integrator17.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        dormandPrince853Integrator17.addSwitchingFunction(switchingFunction21, 0.9d, (double) (-1.0f), (int) (byte) 10);
        double double26 = dormandPrince853Integrator17.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        dormandPrince853Integrator17.addSwitchingFunction(switchingFunction27, 5.477225575051661d, 0.9486832980505138d, (int) '4');
        double double32 = dormandPrince853Integrator17.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str19, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.2d + "'", double26 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setMinReduction(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler15 = dormandPrince853Integrator4.getStepHandler();
        double[] doubleArray24 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray27 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator28 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray24, doubleArray27);
        double double29 = dormandPrince853Integrator28.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        dormandPrince853Integrator28.addSwitchingFunction(switchingFunction30, 100.0d, (double) 1L, (int) (byte) 10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator39 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        dormandPrince853Integrator39.addSwitchingFunction(switchingFunction40, (double) 10, (double) 'a', (int) (byte) 10);
        double double45 = dormandPrince853Integrator39.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction46 = null;
        dormandPrince853Integrator39.addSwitchingFunction(switchingFunction46, (double) 1.0f, (double) '#', (int) (short) 0);
        double double51 = dormandPrince853Integrator39.getCurrentSignedStepsize();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator56 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) -1, (-1.0d), (double) (byte) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator61 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double62 = dormandPrince853Integrator61.getSafety();
        double double63 = dormandPrince853Integrator61.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator68 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction69 = null;
        dormandPrince853Integrator68.addSwitchingFunction(switchingFunction69, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator68.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler76 = dormandPrince853Integrator68.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator77 = null;
        stepHandler76.handleStep(stepInterpolator77, false);
        stepHandler76.reset();
        dormandPrince853Integrator61.setStepHandler(stepHandler76);
        dormandPrince853Integrator56.setStepHandler(stepHandler76);
        stepHandler76.reset();
        dormandPrince853Integrator39.setStepHandler(stepHandler76);
        dormandPrince853Integrator28.setStepHandler(stepHandler76);
        boolean boolean86 = stepHandler76.requiresDenseOutput();
        dormandPrince853Integrator4.setStepHandler(stepHandler76);
        int int88 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray27), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 1.0d + "'", double29 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.9d + "'", double62 == 0.9d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 10.0d + "'", double63 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler76);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + 8 + "'", int88 == 8);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getSafety();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        double double13 = dormandPrince853Integrator4.getCurrentStepStart();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        double double15 = dormandPrince853Integrator4.getMinReduction();
        int int16 = dormandPrince853Integrator4.getOrder();
        double double17 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler18 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler18);
        dormandPrince853Integrator4.setMinReduction((double) (-1.0f));
        double double22 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double23 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, 17.88854381999832d, 4.161791450287817d, 0.0d);
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException4 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray3);
        org.apache.commons.math.MathException mathException5 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException4);
        org.apache.commons.math.ode.DerivativeException derivativeException6 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException4);
        java.lang.String str7 = derivativeException4.getPattern();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        boolean boolean11 = switchingFunctionsHandler9.evaluateStep(stepInterpolator10);
        double[] doubleArray21 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray24 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator25 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray21, doubleArray24);
        switchingFunctionsHandler9.stepAccepted(100.0d, doubleArray21);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        switchingFunctionsHandler9.add(switchingFunction27, 100.0d, (double) 0.0f, (int) (byte) 1);
        java.io.IOException iOException33 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator39 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        dormandPrince853Integrator39.addSwitchingFunction(switchingFunction40, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator39.setMinReduction(100.0d);
        double double47 = dormandPrince853Integrator39.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        dormandPrince853Integrator39.addSwitchingFunction(switchingFunction48, (double) 3, (double) (-1L), (int) (byte) -1);
        java.lang.Object[] objArray53 = new java.lang.Object[] { switchingFunctionsHandler9, "hi!", "Dormand-Prince 8 (5, 3)", (-1L) };
        java.lang.Object[] objArray55 = new java.lang.Object[] {};
        java.lang.Throwable throwable56 = null;
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException("hi!", objArray55, throwable56);
        org.apache.commons.math.MathException mathException58 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException57);
        java.lang.String str59 = mathException58.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException60 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException58);
        org.apache.commons.math.MathException mathException61 = new org.apache.commons.math.MathException("hi!", objArray53, (java.lang.Throwable) mathException58);
        derivativeException4.addSuppressed((java.lang.Throwable) mathException58);
        java.lang.String str63 = derivativeException4.getPattern();
        java.lang.Object[] objArray64 = derivativeException4.getArguments();
        org.apache.commons.math.MathException mathException65 = new org.apache.commons.math.MathException("org.apache.commons.math.MathException: org.apache.commons.math.MathException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) derivativeException4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str7, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray55), "[]");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str63, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[]");
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler18 = dormandPrince853Integrator4.getStepHandler();
        double double19 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setMinReduction(0.0d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator26 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double27 = dormandPrince853Integrator26.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        dormandPrince853Integrator26.addSwitchingFunction(switchingFunction28, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double33 = dormandPrince853Integrator26.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator26.getStepHandler();
        double double35 = dormandPrince853Integrator26.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler36 = dormandPrince853Integrator26.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler36);
        double double38 = dormandPrince853Integrator4.getMinStep();
        double double39 = dormandPrince853Integrator4.getMinStep();
        double double40 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 100.0d + "'", double19 == 100.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.9d + "'", double27 == 0.9d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        double double12 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.StepHandler stepHandler13 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setMinReduction(31.810829150682025d);
        double double16 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) -1, (-1.0d), (double) (byte) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double10 = dormandPrince853Integrator9.getSafety();
        double double11 = dormandPrince853Integrator9.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        dormandPrince853Integrator16.addSwitchingFunction(switchingFunction17, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator16.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator16.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        stepHandler24.handleStep(stepInterpolator25, false);
        stepHandler24.reset();
        dormandPrince853Integrator9.setStepHandler(stepHandler24);
        dormandPrince853Integrator4.setStepHandler(stepHandler24);
        dormandPrince853Integrator4.setMinReduction((double) 2);
        dormandPrince853Integrator4.setMaxGrowth(1.0d);
        org.apache.commons.math.ode.StepHandler stepHandler35 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction36, 3.0d, 4.0d, (int) (byte) 1);
        double double41 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) -1, (-1.0d), (double) (byte) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double10 = dormandPrince853Integrator9.getSafety();
        double double11 = dormandPrince853Integrator9.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        dormandPrince853Integrator16.addSwitchingFunction(switchingFunction17, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator16.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator16.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        stepHandler24.handleStep(stepInterpolator25, false);
        stepHandler24.reset();
        dormandPrince853Integrator9.setStepHandler(stepHandler24);
        dormandPrince853Integrator4.setStepHandler(stepHandler24);
        double double31 = dormandPrince853Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler32 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler32);
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertNull(stepHandler34);
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        boolean boolean6 = switchingFunctionsHandler4.evaluateStep(stepInterpolator5);
        double[] doubleArray16 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray19 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray16, doubleArray19);
        switchingFunctionsHandler4.stepAccepted(100.0d, doubleArray16);
        switchingFunctionsHandler2.stepAccepted((double) (short) 1, doubleArray16);
        double double23 = switchingFunctionsHandler2.getEventTime();
        double double24 = switchingFunctionsHandler2.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        switchingFunctionsHandler2.add(switchingFunction25, 0.6324555320336759d, (double) '#', (int) '4');
        double[] doubleArray36 = new double[] { 97.0d, Double.NaN, ' ' };
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler39 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        boolean boolean41 = switchingFunctionsHandler39.evaluateStep(stepInterpolator40);
        double[] doubleArray51 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray54 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator55 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray51, doubleArray54);
        switchingFunctionsHandler39.stepAccepted(100.0d, doubleArray51);
        boolean boolean57 = switchingFunctionsHandler39.isEmpty();
        double[] doubleArray67 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray70 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator71 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray67, doubleArray70);
        boolean boolean72 = switchingFunctionsHandler39.reset(10.0d, doubleArray70);
        double[] doubleArray76 = new double[] { Double.NaN };
        double[] doubleArray85 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray88 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator89 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray85, doubleArray88);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator90 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray76, doubleArray85);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator91 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 10, (double) (byte) 10, doubleArray70, doubleArray85);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator92 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1.0f, (double) 1L, doubleArray36, doubleArray85);
        boolean boolean93 = switchingFunctionsHandler2.reset((double) 10.0f, doubleArray36);
        double[] doubleArray94 = null;
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator95 = new org.apache.commons.math.ode.DormandPrince853Integrator(17.320508075688775d, (double) (byte) 10, doubleArray36, doubleArray94);
        dormandPrince853Integrator95.setMaxGrowth(3.732075599071396d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.9, 0.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[97.0, NaN, 32.0]");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray85), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) -1, 1.0d, (double) 100.0f, (double) (-1.0f));
        double double5 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, 97.0d, (double) 'a', 2);
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        double double12 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) (short) 1, 35.0d, 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        dormandPrince853Integrator12.setSafety((double) (-1.0f));
        dormandPrince853Integrator12.setMaxGrowth(100.0d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        dormandPrince853Integrator24.addSwitchingFunction(switchingFunction25, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator24.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler32 = dormandPrince853Integrator24.getStepHandler();
        boolean boolean33 = stepHandler32.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator34 = null;
        stepHandler32.handleStep(stepInterpolator34, false);
        dormandPrince853Integrator12.setStepHandler(stepHandler32);
        double double38 = dormandPrince853Integrator12.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler39 = dormandPrince853Integrator12.getStepHandler();
        dormandPrince853Integrator12.setInitialStepSize((-0.0d));
        java.lang.String str42 = dormandPrince853Integrator12.getName();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.9d + "'", double38 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler39);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str42, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1L, (double) 100, (double) 0.0f, (double) (short) 1);
        double double5 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double6 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double7 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setInitialStepSize((double) 0.0f);
        org.apache.commons.math.ode.StepHandler stepHandler10 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str11 = dormandPrince853Integrator4.getName();
        double double12 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str11, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray12);
        double[] doubleArray22 = new double[] { Double.NaN };
        double[] doubleArray31 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray34 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator35 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray31, doubleArray34);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray22, doubleArray31);
        boolean boolean37 = switchingFunctionsHandler0.reset(100.0d, doubleArray22);
        double double38 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        switchingFunctionsHandler0.add(switchingFunction39, 14.142135623730951d, (double) 'a', 100);
        double double44 = switchingFunctionsHandler0.getEventTime();
        boolean boolean45 = switchingFunctionsHandler0.isEmpty();
        boolean boolean46 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        switchingFunctionsHandler0.add(switchingFunction47, (double) 100L, 98.48857801796105d, (int) (byte) -1);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator52 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean53 = switchingFunctionsHandler0.evaluateStep(stepInterpolator52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        boolean boolean4 = switchingFunctionsHandler0.isEmpty();
        boolean boolean5 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        boolean boolean7 = switchingFunctionsHandler0.evaluateStep(stepInterpolator6);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler9 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator10 = null;
        boolean boolean11 = switchingFunctionsHandler9.evaluateStep(stepInterpolator10);
        double[] doubleArray23 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray26 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator27 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray23, doubleArray26);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler28 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        boolean boolean30 = switchingFunctionsHandler28.evaluateStep(stepInterpolator29);
        double[] doubleArray40 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray43 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray40, doubleArray43);
        switchingFunctionsHandler28.stepAccepted(100.0d, doubleArray40);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler47 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean48 = switchingFunctionsHandler47.stop();
        double double49 = switchingFunctionsHandler47.getEventTime();
        double[] doubleArray54 = new double[] { Double.NaN };
        double[] doubleArray63 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray66 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator67 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray63, doubleArray66);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator68 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray54, doubleArray63);
        switchingFunctionsHandler47.stepAccepted(0.2d, doubleArray54);
        boolean boolean70 = switchingFunctionsHandler28.reset((double) 'a', doubleArray54);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator71 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 1, (double) 100, doubleArray26, doubleArray54);
        boolean boolean72 = switchingFunctionsHandler9.reset((double) 1.0f, doubleArray26);
        boolean boolean73 = switchingFunctionsHandler0.reset((double) '4', doubleArray26);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator74 = null;
        boolean boolean75 = switchingFunctionsHandler0.evaluateStep(stepInterpolator74);
        boolean boolean76 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double49));
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100, (double) 2, 0.9d, (double) (byte) 1);
        double double5 = dormandPrince853Integrator4.getMaxStep();
        double double6 = dormandPrince853Integrator4.getMinReduction();
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setSafety((-1.0d));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction10, 3.732075599071396d, (double) 8, (int) '#');
        dormandPrince853Integrator4.setSafety(8.0d);
        double double17 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double18 = dormandPrince853Integrator4.getMaxGrowth();
        java.lang.String str19 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 14.142135623730951d + "'", double17 == 14.142135623730951d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str19, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0.0f, (double) (short) 0, 0.0d, (double) (-1L));
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setSafety(2.0d);
        java.lang.String str8 = dormandPrince853Integrator4.getName();
        int int9 = dormandPrince853Integrator4.getOrder();
        java.lang.String str10 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth(100.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) (short) 100, (double) '4', (int) (short) 0);
        dormandPrince853Integrator4.setSafety(17.88854381999832d);
        double double20 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str21 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str8, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str10, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str21, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        java.lang.String str16 = dormandPrince853Integrator12.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        dormandPrince853Integrator21.addSwitchingFunction(switchingFunction22, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator21.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler29 = dormandPrince853Integrator21.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        stepHandler29.handleStep(stepInterpolator30, false);
        boolean boolean33 = stepHandler29.requiresDenseOutput();
        dormandPrince853Integrator12.setStepHandler(stepHandler29);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator39 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        dormandPrince853Integrator39.addSwitchingFunction(switchingFunction40, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator39.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler47 = dormandPrince853Integrator39.getStepHandler();
        boolean boolean48 = stepHandler47.requiresDenseOutput();
        boolean boolean49 = stepHandler47.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator50 = null;
        stepHandler47.handleStep(stepInterpolator50, true);
        dormandPrince853Integrator12.setStepHandler(stepHandler47);
        java.lang.String str54 = dormandPrince853Integrator12.getName();
        double double55 = dormandPrince853Integrator12.getMinStep();
        double double56 = dormandPrince853Integrator12.getMinStep();
        double double57 = dormandPrince853Integrator12.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str54, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 1.0d + "'", double55 == 1.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 1.0d + "'", double56 == 1.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 0.9d + "'", double57 == 0.9d);
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, (double) 10, (double) 2, (double) (short) 1);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        int int6 = dormandPrince853Integrator4.getOrder();
        int int7 = dormandPrince853Integrator4.getOrder();
        double double8 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setMaxGrowth(55.3841974787333d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 8 + "'", int6 == 8);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 1, (double) 2, 14.142135623730951d, (double) (short) 100);
        double double5 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        double double13 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str14 = dormandPrince853Integrator4.getName();
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMinReduction((double) 1L);
        int int18 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str14, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler18 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler18);
        dormandPrince853Integrator4.setSafety((double) 8);
        java.lang.String str22 = dormandPrince853Integrator4.getName();
        java.lang.String str23 = dormandPrince853Integrator4.getName();
        double double24 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double25 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double26 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setSafety(52.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str22, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str23, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 1, (double) (byte) -1, 0.9486832980505138d, (double) (short) -1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, 5.623413251903491d, 0.0d, (int) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler10 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator11 = null;
        stepHandler10.handleStep(stepInterpolator11, false);
        org.junit.Assert.assertNotNull(stepHandler10);
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        double double2 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray9 = new double[] { Double.NaN };
        double[] doubleArray18 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray21 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray18, doubleArray21);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray9, doubleArray18);
        double[] doubleArray32 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray35 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray32, doubleArray35);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator37 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 0, (double) 100L, doubleArray9, doubleArray32);
        boolean boolean38 = switchingFunctionsHandler0.reset((double) 1, doubleArray9);
        boolean boolean39 = switchingFunctionsHandler0.stop();
        boolean boolean40 = switchingFunctionsHandler0.isEmpty();
        boolean boolean41 = switchingFunctionsHandler0.stop();
        java.lang.Class<?> wildcardClass42 = switchingFunctionsHandler0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray9), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        double double10 = dormandPrince853Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction11, (double) 1.0f, (double) '#', (int) (short) 0);
        double double16 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) -1, (-1.0d), (double) (byte) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator26 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double27 = dormandPrince853Integrator26.getSafety();
        double double28 = dormandPrince853Integrator26.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator33 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction34 = null;
        dormandPrince853Integrator33.addSwitchingFunction(switchingFunction34, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator33.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler41 = dormandPrince853Integrator33.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        stepHandler41.handleStep(stepInterpolator42, false);
        stepHandler41.reset();
        dormandPrince853Integrator26.setStepHandler(stepHandler41);
        dormandPrince853Integrator21.setStepHandler(stepHandler41);
        stepHandler41.reset();
        dormandPrince853Integrator4.setStepHandler(stepHandler41);
        dormandPrince853Integrator4.setSafety((double) 0.0f);
        double double52 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setInitialStepSize(13.92838827718412d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.9d + "'", double27 == 0.9d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 0.2d + "'", double52 == 0.2d);
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        java.lang.String str16 = dormandPrince853Integrator12.getName();
        double double17 = dormandPrince853Integrator12.getSafety();
        double double18 = dormandPrince853Integrator12.getCurrentSignedStepsize();
        dormandPrince853Integrator12.setMinReduction((double) 100);
        dormandPrince853Integrator12.setMinReduction((double) (short) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction23, 8.0d, (double) (byte) 1, 10);
        double double28 = dormandPrince853Integrator12.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9d + "'", double17 == 0.9d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9486832980505138d + "'", double18 == 0.9486832980505138d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.9486832980505138d + "'", double28 == 0.9486832980505138d);
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray12);
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray28 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray31 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray28, doubleArray31);
        boolean boolean33 = switchingFunctionsHandler0.reset(10.0d, doubleArray31);
        double[] doubleArray35 = null;
        switchingFunctionsHandler0.stepAccepted(4.053600464421103d, doubleArray35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler3.evaluateStep(stepInterpolator4);
        double[] doubleArray15 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray18 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray15, doubleArray18);
        switchingFunctionsHandler3.stepAccepted(100.0d, doubleArray15);
        switchingFunctionsHandler0.stepAccepted((double) (short) 10, doubleArray15);
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        switchingFunctionsHandler0.add(switchingFunction23, (double) 0.0f, (double) 10L, (int) (short) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        switchingFunctionsHandler0.add(switchingFunction28, (double) 1L, (double) (short) 0, (int) (byte) -1);
        double double33 = switchingFunctionsHandler0.getEventTime();
        boolean boolean34 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        switchingFunctionsHandler0.add(switchingFunction35, (double) (-1), (double) (byte) 0, (int) (byte) 100);
        boolean boolean40 = switchingFunctionsHandler0.stop();
        boolean boolean41 = switchingFunctionsHandler0.stop();
        boolean boolean42 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler18 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler18);
        dormandPrince853Integrator4.setMinReduction((double) (-1.0f));
        java.lang.String str22 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler23 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler23);
        java.lang.String str25 = dormandPrince853Integrator4.getName();
        double double26 = dormandPrince853Integrator4.getCurrentStepStart();
        double double27 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler28 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str22, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str25, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertNull(stepHandler28);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setSafety((double) 0L);
        org.apache.commons.math.ode.StepHandler stepHandler16 = dormandPrince853Integrator12.getStepHandler();
        dormandPrince853Integrator12.setMinReduction(100.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction19, 4.47213595499958d, Double.NaN, (int) 'a');
        double double24 = dormandPrince853Integrator12.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) 3, (double) (-1L), (int) (byte) -1);
        double double18 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction19, (double) (-1), (double) 1.0f, 8);
        java.lang.String str24 = dormandPrince853Integrator4.getName();
        double double25 = dormandPrince853Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction26, 0.9486832980505138d, 100.0d, (int) ' ');
        dormandPrince853Integrator4.setMaxGrowth((double) (byte) 0);
        java.lang.String str33 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str24, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str33, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler34);
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray12);
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray28 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray31 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray28, doubleArray31);
        boolean boolean33 = switchingFunctionsHandler0.reset(10.0d, doubleArray31);
        double double34 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler36 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler36.evaluateStep(stepInterpolator37);
        double[] doubleArray48 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray51 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator52 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray48, doubleArray51);
        switchingFunctionsHandler36.stepAccepted(100.0d, doubleArray48);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction54 = null;
        switchingFunctionsHandler36.add(switchingFunction54, 100.0d, (double) 0.0f, (int) (byte) 1);
        boolean boolean59 = switchingFunctionsHandler36.stop();
        double[] doubleArray64 = new double[] { Double.NaN };
        double[] doubleArray73 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray76 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator77 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray73, doubleArray76);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator78 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray64, doubleArray73);
        boolean boolean79 = switchingFunctionsHandler36.reset((double) 1L, doubleArray64);
        switchingFunctionsHandler0.stepAccepted((double) 0, doubleArray64);
        double double81 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray88 = new double[] { (byte) 10, 10.0d, (short) 10, 8, (-1) };
        boolean boolean89 = switchingFunctionsHandler0.reset((double) ' ', doubleArray88);
        boolean boolean90 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator91 = null;
        boolean boolean92 = switchingFunctionsHandler0.evaluateStep(stepInterpolator91);
        boolean boolean93 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[10.0, 10.0, 10.0, 8.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        java.lang.String str16 = dormandPrince853Integrator12.getName();
        double double17 = dormandPrince853Integrator12.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction18, (double) (byte) 100, (double) 8, (int) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction23, (double) (byte) 1, 0.9d, (int) (byte) 100);
        dormandPrince853Integrator12.setMaxGrowth(100.0d);
        double double30 = dormandPrince853Integrator12.getCurrentStepStart();
        int int31 = dormandPrince853Integrator12.getOrder();
        dormandPrince853Integrator12.setMaxGrowth(13.160740129524925d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9d + "'", double17 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 8 + "'", int31 == 8);
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        double double10 = dormandPrince853Integrator4.getSafety();
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setSafety((double) 1L);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction15, 4.47213595499958d, (double) 1, (int) (short) -1);
        double double20 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        double double10 = dormandPrince853Integrator4.getSafety();
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setMaxGrowth((double) ' ');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction14 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction14, (double) (short) 100, (double) (short) -1, (int) 'a');
        dormandPrince853Integrator4.setInitialStepSize((double) '#');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction21, 13.92838827718412d, (double) (short) 10, (-1));
        double double26 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double27 = dormandPrince853Integrator4.getMinReduction();
        double double28 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setSafety((double) 1L);
        double double31 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.2d + "'", double27 == 0.2d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(97.0d, (double) 0L, 0.0d, (double) 10.0f);
        double double5 = dormandPrince853Integrator4.getMaxStep();
        double double6 = dormandPrince853Integrator4.getMaxStep();
        double double7 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction8 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction8, (double) 0, 5.623413251903491d, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler2.evaluateStep(stepInterpolator3);
        double[] doubleArray14 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray17 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray14, doubleArray17);
        switchingFunctionsHandler2.stepAccepted(100.0d, doubleArray14);
        switchingFunctionsHandler0.stepAccepted((double) (short) 1, doubleArray14);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        switchingFunctionsHandler0.add(switchingFunction21, (double) (byte) -1, (double) (byte) -1, 2);
        boolean boolean26 = switchingFunctionsHandler0.stop();
        double double27 = switchingFunctionsHandler0.getEventTime();
        boolean boolean28 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        switchingFunctionsHandler0.add(switchingFunction29, (double) (-1L), 100.0d, 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction34 = null;
        switchingFunctionsHandler0.add(switchingFunction34, (double) 100, (double) 0L, (int) ' ');
        org.apache.commons.math.ode.StepInterpolator stepInterpolator39 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean40 = switchingFunctionsHandler0.evaluateStep(stepInterpolator39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) 1, (double) 100.0f, (double) 100.0f);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double10 = dormandPrince853Integrator9.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        dormandPrince853Integrator9.addSwitchingFunction(switchingFunction11, (double) '#', (double) (-1.0f), (int) (short) 100);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        dormandPrince853Integrator20.addSwitchingFunction(switchingFunction21, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator20.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler28 = dormandPrince853Integrator20.getStepHandler();
        boolean boolean29 = stepHandler28.requiresDenseOutput();
        boolean boolean30 = stepHandler28.requiresDenseOutput();
        dormandPrince853Integrator9.setStepHandler(stepHandler28);
        dormandPrince853Integrator4.setStepHandler(stepHandler28);
        org.apache.commons.math.ode.StepHandler stepHandler33 = dormandPrince853Integrator4.getStepHandler();
        double double34 = dormandPrince853Integrator4.getCurrentStepStart();
        double double35 = dormandPrince853Integrator4.getMaxGrowth();
        int int36 = dormandPrince853Integrator4.getOrder();
        java.lang.String str37 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth(17.320508075688775d);
        int int40 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler41 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler42 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str37, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertNotNull(stepHandler42);
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler18 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler18);
        java.lang.String str20 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth((double) '4');
        java.lang.String str23 = dormandPrince853Integrator4.getName();
        double double24 = dormandPrince853Integrator4.getCurrentStepStart();
        double double25 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler26 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str20, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str23, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 52.0d + "'", double25 == 52.0d);
        org.junit.Assert.assertNull(stepHandler26);
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray12);
        double[] doubleArray22 = new double[] { Double.NaN };
        double[] doubleArray31 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray34 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator35 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray31, doubleArray34);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray22, doubleArray31);
        boolean boolean37 = switchingFunctionsHandler0.reset(100.0d, doubleArray22);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        boolean boolean39 = switchingFunctionsHandler0.evaluateStep(stepInterpolator38);
        boolean boolean40 = switchingFunctionsHandler0.isEmpty();
        double double41 = switchingFunctionsHandler0.getEventTime();
        boolean boolean42 = switchingFunctionsHandler0.isEmpty();
        boolean boolean43 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction44 = null;
        switchingFunctionsHandler0.add(switchingFunction44, 10.0d, (double) (byte) 10, 8);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction49 = null;
        switchingFunctionsHandler0.add(switchingFunction49, 0.0d, 9.612601554586078d, 8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        double[] doubleArray3 = new double[] { Double.NaN };
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray3, doubleArray12);
        java.lang.String str18 = dormandPrince853Integrator17.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        dormandPrince853Integrator17.addSwitchingFunction(switchingFunction19, (double) (byte) -1, (double) 0L, 8);
        int int24 = dormandPrince853Integrator17.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator29 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        dormandPrince853Integrator29.addSwitchingFunction(switchingFunction30, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator29.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler37 = dormandPrince853Integrator29.getStepHandler();
        boolean boolean38 = stepHandler37.requiresDenseOutput();
        boolean boolean39 = stepHandler37.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        stepHandler37.handleStep(stepInterpolator40, true);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator43 = null;
        stepHandler37.handleStep(stepInterpolator43, true);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator46 = null;
        stepHandler37.handleStep(stepInterpolator46, true);
        boolean boolean49 = stepHandler37.requiresDenseOutput();
        dormandPrince853Integrator17.setStepHandler(stepHandler37);
        boolean boolean51 = stepHandler37.requiresDenseOutput();
        boolean boolean52 = stepHandler37.requiresDenseOutput();
        boolean boolean53 = stepHandler37.requiresDenseOutput();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 8 + "'", int24 == 8);
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) -1, (-1.0d), (double) (byte) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double10 = dormandPrince853Integrator9.getSafety();
        double double11 = dormandPrince853Integrator9.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        dormandPrince853Integrator16.addSwitchingFunction(switchingFunction17, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator16.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator16.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        stepHandler24.handleStep(stepInterpolator25, false);
        stepHandler24.reset();
        dormandPrince853Integrator9.setStepHandler(stepHandler24);
        dormandPrince853Integrator4.setStepHandler(stepHandler24);
        double double31 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setMinReduction(97.0d);
        java.lang.String str34 = dormandPrince853Integrator4.getName();
        double double35 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.2d + "'", double31 == 0.2d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str34, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(2.0d, 0.2d, (double) 8, (double) 8);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth((double) (byte) 0);
        int int8 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler13 = dormandPrince853Integrator4.getStepHandler();
        double double14 = dormandPrince853Integrator4.getCurrentStepStart();
        double double15 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double16 = dormandPrince853Integrator4.getCurrentStepStart();
        int int17 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction18, 0.2d, (double) (byte) -1, (int) (short) 100);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator27 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        dormandPrince853Integrator27.addSwitchingFunction(switchingFunction28, (double) 10, (double) 'a', (int) (byte) 10);
        int int33 = dormandPrince853Integrator27.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator27.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler34);
        org.apache.commons.math.ode.StepHandler stepHandler36 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str37 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler38 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 8 + "'", int17 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str37, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler38);
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getMaxStep();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setInitialStepSize((double) 10L);
        dormandPrince853Integrator4.setMaxGrowth((double) '#');
        dormandPrince853Integrator4.setMaxGrowth(0.2d);
        int int19 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double25 = dormandPrince853Integrator24.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        dormandPrince853Integrator24.addSwitchingFunction(switchingFunction26, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double31 = dormandPrince853Integrator24.getCurrentStepStart();
        java.lang.String str32 = dormandPrince853Integrator24.getName();
        org.apache.commons.math.ode.StepHandler stepHandler33 = dormandPrince853Integrator24.getStepHandler();
        double double34 = dormandPrince853Integrator24.getCurrentStepStart();
        double double35 = dormandPrince853Integrator24.getCurrentSignedStepsize();
        double double36 = dormandPrince853Integrator24.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler37 = dormandPrince853Integrator24.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler38 = dormandPrince853Integrator24.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler38);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double31));
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str32, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertNotNull(stepHandler38);
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, (double) '#', 0.9d, (double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler6 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator11 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double12 = dormandPrince853Integrator11.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        dormandPrince853Integrator17.addSwitchingFunction(switchingFunction18, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator17.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler25 = dormandPrince853Integrator17.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        stepHandler25.handleStep(stepInterpolator26, false);
        dormandPrince853Integrator11.setStepHandler(stepHandler25);
        dormandPrince853Integrator4.setStepHandler(stepHandler25);
        double double31 = dormandPrince853Integrator4.getMaxGrowth();
        java.lang.String str32 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setSafety((double) 1L);
        int int35 = dormandPrince853Integrator4.getOrder();
        java.lang.String str36 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMinReduction((double) (-1));
        dormandPrince853Integrator4.setInitialStepSize((double) (short) 10);
        int int41 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str32, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 8 + "'", int35 == 8);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str36, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setInitialStepSize((double) 1L);
        int int12 = dormandPrince853Integrator4.getOrder();
        double double13 = dormandPrince853Integrator4.getCurrentStepStart();
        int int14 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction15, (double) 100L, (double) 10L, (int) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler20 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setMaxGrowth((double) '4');
        double double23 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setMaxGrowth((double) 10);
        double double26 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) (short) 0, (double) 1, (double) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) (short) -1, (double) (byte) 0, (int) (byte) 10);
        double double10 = dormandPrince853Integrator4.getMinStep();
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        int int11 = dormandPrince853Integrator4.getOrder();
        double double12 = dormandPrince853Integrator4.getSafety();
        int int13 = dormandPrince853Integrator4.getOrder();
        double double14 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        java.lang.String str16 = dormandPrince853Integrator12.getName();
        double double17 = dormandPrince853Integrator12.getCurrentStepStart();
        double double18 = dormandPrince853Integrator12.getMinStep();
        java.lang.String str19 = dormandPrince853Integrator12.getName();
        double double20 = dormandPrince853Integrator12.getCurrentSignedStepsize();
        java.lang.String str21 = dormandPrince853Integrator12.getName();
        double double22 = dormandPrince853Integrator12.getSafety();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator27 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 100, (double) 0.0f, (double) (-1L), (double) 10L);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double33 = dormandPrince853Integrator32.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction34 = null;
        dormandPrince853Integrator32.addSwitchingFunction(switchingFunction34, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double39 = dormandPrince853Integrator32.getCurrentStepStart();
        java.lang.String str40 = dormandPrince853Integrator32.getName();
        org.apache.commons.math.ode.StepHandler stepHandler41 = dormandPrince853Integrator32.getStepHandler();
        double double42 = dormandPrince853Integrator32.getCurrentStepStart();
        double double43 = dormandPrince853Integrator32.getCurrentSignedStepsize();
        double double44 = dormandPrince853Integrator32.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler45 = dormandPrince853Integrator32.getStepHandler();
        dormandPrince853Integrator27.setStepHandler(stepHandler45);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator51 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) (short) 0, (double) 1, (double) 100);
        dormandPrince853Integrator51.setMaxGrowth((double) (short) -1);
        dormandPrince853Integrator51.setMaxGrowth(0.9486832980505138d);
        double[] doubleArray59 = new double[] { Double.NaN };
        double[] doubleArray68 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray71 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator72 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray68, doubleArray71);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator73 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray59, doubleArray68);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction74 = null;
        dormandPrince853Integrator73.addSwitchingFunction(switchingFunction74, (double) 8, (double) '4', 0);
        org.apache.commons.math.ode.StepHandler stepHandler79 = dormandPrince853Integrator73.getStepHandler();
        dormandPrince853Integrator51.setStepHandler(stepHandler79);
        boolean boolean81 = stepHandler79.requiresDenseOutput();
        stepHandler79.reset();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator83 = null;
        stepHandler79.handleStep(stepInterpolator83, false);
        dormandPrince853Integrator27.setStepHandler(stepHandler79);
        boolean boolean87 = stepHandler79.requiresDenseOutput();
        dormandPrince853Integrator12.setStepHandler(stepHandler79);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str19, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9486832980505138d + "'", double20 == 0.9486832980505138d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str21, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.9d + "'", double33 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str40, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler45);
        org.junit.Assert.assertNotNull(doubleArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray59), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray68), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray71), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(stepHandler79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(1.4997884186649117d, 2.1355799447448818d, 9.612601554586078d, (double) 0L);
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) (short) 0, (double) 1, (double) 100);
        dormandPrince853Integrator4.setMaxGrowth((double) (short) -1);
        dormandPrince853Integrator4.setMaxGrowth(0.9486832980505138d);
        double double9 = dormandPrince853Integrator4.getCurrentStepStart();
        double double10 = dormandPrince853Integrator4.getSafety();
        double double11 = dormandPrince853Integrator4.getSafety();
        int int12 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler13 = dormandPrince853Integrator4.getStepHandler();
        boolean boolean14 = stepHandler13.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setInitialStepSize((double) (short) 10);
        int int9 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMinReduction((double) (short) 1);
        int int12 = dormandPrince853Integrator4.getOrder();
        java.lang.String str13 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth(99.24141172814957d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getSafety();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        java.lang.String str13 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setSafety((double) 1);
        double double16 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setSafety((double) 10L);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double16));
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        java.lang.String str13 = dormandPrince853Integrator4.getName();
        double double14 = dormandPrince853Integrator4.getCurrentStepStart();
        int int15 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction16, (double) 10L, 5.885661912765424d, 10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator25 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) ' ', (double) (-1.0f), 14.142135623730951d);
        org.apache.commons.math.ode.StepHandler stepHandler26 = dormandPrince853Integrator25.getStepHandler();
        double double27 = dormandPrince853Integrator25.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler28 = dormandPrince853Integrator25.getStepHandler();
        stepHandler28.reset();
        dormandPrince853Integrator4.setStepHandler(stepHandler28);
        stepHandler28.reset();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue(Double.isNaN(double27));
        org.junit.Assert.assertNotNull(stepHandler28);
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0, Double.NaN, 3.0d, (-1.0d));
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setMaxGrowth((double) (-1.0f));
        java.lang.String str9 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str9, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        double[] doubleArray3 = new double[] { Double.NaN };
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray3, doubleArray12);
        java.lang.String str18 = dormandPrince853Integrator17.getName();
        double double19 = dormandPrince853Integrator17.getMinStep();
        java.lang.String str20 = dormandPrince853Integrator17.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator25 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double26 = dormandPrince853Integrator25.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        dormandPrince853Integrator25.addSwitchingFunction(switchingFunction27, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double32 = dormandPrince853Integrator25.getSafety();
        double double33 = dormandPrince853Integrator25.getMaxGrowth();
        double double34 = dormandPrince853Integrator25.getCurrentStepStart();
        double double35 = dormandPrince853Integrator25.getCurrentStepStart();
        dormandPrince853Integrator25.setSafety(14.142135623730951d);
        double double38 = dormandPrince853Integrator25.getCurrentSignedStepsize();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction44 = null;
        dormandPrince853Integrator43.addSwitchingFunction(switchingFunction44, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator43.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler51 = dormandPrince853Integrator43.getStepHandler();
        double double52 = dormandPrince853Integrator43.getMaxStep();
        double double53 = dormandPrince853Integrator43.getMinReduction();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator58 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double59 = dormandPrince853Integrator58.getSafety();
        double double60 = dormandPrince853Integrator58.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator65 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction66 = null;
        dormandPrince853Integrator65.addSwitchingFunction(switchingFunction66, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator65.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler73 = dormandPrince853Integrator65.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator74 = null;
        stepHandler73.handleStep(stepInterpolator74, false);
        stepHandler73.reset();
        dormandPrince853Integrator58.setStepHandler(stepHandler73);
        dormandPrince853Integrator43.setStepHandler(stepHandler73);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator80 = null;
        stepHandler73.handleStep(stepInterpolator80, true);
        boolean boolean83 = stepHandler73.requiresDenseOutput();
        dormandPrince853Integrator25.setStepHandler(stepHandler73);
        org.apache.commons.math.ode.StepHandler stepHandler85 = dormandPrince853Integrator25.getStepHandler();
        boolean boolean86 = stepHandler85.requiresDenseOutput();
        dormandPrince853Integrator17.setStepHandler(stepHandler85);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str20, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.9d + "'", double26 == 0.9d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.9d + "'", double32 == 0.9d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 100.0d + "'", double53 == 100.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 0.9d + "'", double59 == 0.9d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler73);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(stepHandler85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        double double12 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler13 = dormandPrince853Integrator4.getStepHandler();
        boolean boolean14 = stepHandler13.requiresDenseOutput();
        stepHandler13.reset();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) '4', (double) (-1L), 3);
        double double18 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str19 = dormandPrince853Integrator4.getName();
        double double20 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler21 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str19, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(stepHandler21);
    }

    @Test
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.6324555320336759d, (double) (short) 1, Double.NaN, (double) 1.0f);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        double double6 = dormandPrince853Integrator4.getMaxGrowth();
        double double7 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.7952707287670506d + "'", double7 == 0.7952707287670506d);
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) 3, (double) (-1L), (int) (byte) -1);
        double double18 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setMaxGrowth(0.0d);
        dormandPrince853Integrator4.setMinReduction(5.916079783099616d);
        org.apache.commons.math.ode.StepHandler stepHandler23 = dormandPrince853Integrator4.getStepHandler();
        double double24 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler25 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setInitialStepSize(12.246584906270447d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler25);
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        int int12 = dormandPrince853Integrator4.getOrder();
        double double13 = dormandPrince853Integrator4.getMaxStep();
        dormandPrince853Integrator4.setSafety((double) ' ');
        org.apache.commons.math.ode.StepHandler stepHandler16 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler16);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction18, (double) 0L, (-1.0d), (int) 'a');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction23, 8.0d, (double) (-1), (int) (short) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getSafety();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        double double13 = dormandPrince853Integrator4.getCurrentStepStart();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        double double15 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str16 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth((double) 3);
        double double19 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setSafety(1.7320508075688772d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 100, (double) 0.0f, (double) (-1L), (double) 10L);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double10 = dormandPrince853Integrator9.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        dormandPrince853Integrator9.addSwitchingFunction(switchingFunction11, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double16 = dormandPrince853Integrator9.getCurrentStepStart();
        java.lang.String str17 = dormandPrince853Integrator9.getName();
        org.apache.commons.math.ode.StepHandler stepHandler18 = dormandPrince853Integrator9.getStepHandler();
        double double19 = dormandPrince853Integrator9.getCurrentStepStart();
        double double20 = dormandPrince853Integrator9.getCurrentSignedStepsize();
        double double21 = dormandPrince853Integrator9.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler22 = dormandPrince853Integrator9.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler22);
        boolean boolean24 = stepHandler22.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        stepHandler22.handleStep(stepInterpolator25, true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str17, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        java.lang.String str14 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setInitialStepSize(0.9240210864723069d);
        org.apache.commons.math.ode.StepHandler stepHandler17 = dormandPrince853Integrator12.getStepHandler();
        double double18 = dormandPrince853Integrator12.getCurrentSignedStepsize();
        double double19 = dormandPrince853Integrator12.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str14, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9486832980505138d + "'", double18 == 0.9486832980505138d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2d + "'", double19 == 0.2d);
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator2 = null;
        boolean boolean3 = switchingFunctionsHandler0.evaluateStep(stepInterpolator2);
        boolean boolean4 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean7 = switchingFunctionsHandler6.stop();
        double double8 = switchingFunctionsHandler6.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction9 = null;
        switchingFunctionsHandler6.add(switchingFunction9, (double) (byte) 0, (double) 10.0f, 1);
        boolean boolean14 = switchingFunctionsHandler6.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler16 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator17 = null;
        boolean boolean18 = switchingFunctionsHandler16.evaluateStep(stepInterpolator17);
        double[] doubleArray28 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray31 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray28, doubleArray31);
        switchingFunctionsHandler16.stepAccepted(100.0d, doubleArray28);
        double[] doubleArray38 = new double[] { Double.NaN };
        double[] doubleArray47 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray50 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator51 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray47, doubleArray50);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator52 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray38, doubleArray47);
        boolean boolean53 = switchingFunctionsHandler16.reset(100.0d, doubleArray38);
        boolean boolean54 = switchingFunctionsHandler6.reset((double) (-1), doubleArray38);
        switchingFunctionsHandler0.stepAccepted((double) (short) 100, doubleArray38);
        double double56 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator57 = null;
        boolean boolean58 = switchingFunctionsHandler0.evaluateStep(stepInterpolator57);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction59 = null;
        switchingFunctionsHandler0.add(switchingFunction59, 22.80350850198276d, (double) 'a', (int) (byte) -1);
        boolean boolean64 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray47), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray50), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double56));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray12);
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        double double19 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler21 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean22 = switchingFunctionsHandler21.stop();
        double double23 = switchingFunctionsHandler21.getEventTime();
        double[] doubleArray28 = new double[] { Double.NaN };
        double[] doubleArray37 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray40 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray37, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray28, doubleArray37);
        switchingFunctionsHandler21.stepAccepted(0.2d, doubleArray28);
        boolean boolean44 = switchingFunctionsHandler0.reset((double) '4', doubleArray28);
        boolean boolean45 = switchingFunctionsHandler0.stop();
        double double46 = switchingFunctionsHandler0.getEventTime();
        boolean boolean47 = switchingFunctionsHandler0.stop();
        double[] doubleArray49 = null;
        boolean boolean50 = switchingFunctionsHandler0.reset(4.053600464421103d, doubleArray49);
        boolean boolean51 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        double double16 = dormandPrince853Integrator12.getMaxGrowth();
        double double17 = dormandPrince853Integrator12.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction18, (double) 0, (double) 'a', (int) '4');
        double double23 = dormandPrince853Integrator12.getMinReduction();
        double double24 = dormandPrince853Integrator12.getMinReduction();
        int int25 = dormandPrince853Integrator12.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler26 = dormandPrince853Integrator12.getStepHandler();
        int int27 = dormandPrince853Integrator12.getOrder();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9d + "'", double23 == 0.9d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9d + "'", double24 == 0.9d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0, Double.NaN, 3.0d, (-1.0d));
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        double double7 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) (short) 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.9d + "'", double7 == 0.9d);
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        double double11 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double12 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int13 = dormandPrince853Integrator4.getOrder();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler15 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) 1, (double) 100.0f, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler21 = dormandPrince853Integrator20.getStepHandler();
        double double22 = dormandPrince853Integrator20.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator27 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        dormandPrince853Integrator27.addSwitchingFunction(switchingFunction28, (double) 10, (double) 'a', (int) (byte) 10);
        int int33 = dormandPrince853Integrator27.getOrder();
        double double34 = dormandPrince853Integrator27.getCurrentSignedStepsize();
        java.lang.String str35 = dormandPrince853Integrator27.getName();
        double double36 = dormandPrince853Integrator27.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler37 = dormandPrince853Integrator27.getStepHandler();
        stepHandler37.reset();
        dormandPrince853Integrator20.setStepHandler(stepHandler37);
        dormandPrince853Integrator4.setStepHandler(stepHandler37);
        int int41 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setSafety((double) (-1.0f));
        org.apache.commons.math.ode.SwitchingFunction switchingFunction44 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction44, 0.0d, 22.80350850198276d, (int) (short) 0);
        dormandPrince853Integrator4.setMinReduction((double) 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str35, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double36));
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        double double13 = dormandPrince853Integrator12.getMinStep();
        dormandPrince853Integrator12.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler16 = dormandPrince853Integrator12.getStepHandler();
        dormandPrince853Integrator12.setInitialStepSize(2.0d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) 1, (double) 100.0f, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator23.getStepHandler();
        double double25 = dormandPrince853Integrator23.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator30 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction31 = null;
        dormandPrince853Integrator30.addSwitchingFunction(switchingFunction31, (double) 10, (double) 'a', (int) (byte) 10);
        int int36 = dormandPrince853Integrator30.getOrder();
        double double37 = dormandPrince853Integrator30.getCurrentSignedStepsize();
        java.lang.String str38 = dormandPrince853Integrator30.getName();
        double double39 = dormandPrince853Integrator30.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler40 = dormandPrince853Integrator30.getStepHandler();
        stepHandler40.reset();
        dormandPrince853Integrator23.setStepHandler(stepHandler40);
        dormandPrince853Integrator12.setStepHandler(stepHandler40);
        dormandPrince853Integrator12.setSafety(3.430936289925951d);
        dormandPrince853Integrator12.setMaxGrowth(0.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str38, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double39));
        org.junit.Assert.assertNotNull(stepHandler40);
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100, (double) 2, 0.9d, (double) (byte) 1);
        double double5 = dormandPrince853Integrator4.getMaxStep();
        java.lang.String str6 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator11 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double12 = dormandPrince853Integrator11.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator11.addSwitchingFunction(switchingFunction13, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double18 = dormandPrince853Integrator11.getSafety();
        double double19 = dormandPrince853Integrator11.getMaxGrowth();
        double double20 = dormandPrince853Integrator11.getCurrentStepStart();
        double double21 = dormandPrince853Integrator11.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler22 = dormandPrince853Integrator11.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        stepHandler22.handleStep(stepInterpolator23, true);
        dormandPrince853Integrator4.setStepHandler(stepHandler22);
        int int27 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMinReduction(2.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction30, 13.92838827718412d, 13.92838827718412d, 0);
        double double35 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction36, (double) 100.0f, 11.801859293002996d, 10);
        dormandPrince853Integrator4.setSafety(4.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str6, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9d + "'", double18 == 0.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2d + "'", double21 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 14.142135623730951d + "'", double35 == 14.142135623730951d);
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0.0f, (double) (short) 0, 0.0d, (double) (-1L));
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        double double6 = dormandPrince853Integrator4.getSafety();
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.9d + "'", double6 == 0.9d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler11 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        double double13 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler14 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setSafety(0.0d);
        dormandPrince853Integrator4.setMinReduction(0.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction19, 0.6324555320336759d, 0.0d, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler14);
    }

    @Test
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(97.0d, 5.885661912765424d, 100.0d, (double) 100);
        dormandPrince853Integrator4.setSafety((double) (byte) 10);
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setInitialStepSize(0.0d);
        dormandPrince853Integrator4.setMaxGrowth(98.48857801796105d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        double double13 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double19 = dormandPrince853Integrator18.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        dormandPrince853Integrator24.addSwitchingFunction(switchingFunction25, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator24.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler32 = dormandPrince853Integrator24.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator33 = null;
        stepHandler32.handleStep(stepInterpolator33, false);
        dormandPrince853Integrator18.setStepHandler(stepHandler32);
        dormandPrince853Integrator4.setStepHandler(stepHandler32);
        double double38 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int39 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setSafety((-1.0d));
        double double42 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setMinReduction(1.4142135623730951d);
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler32);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 8 + "'", int39 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double42));
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        boolean boolean6 = switchingFunctionsHandler4.evaluateStep(stepInterpolator5);
        double[] doubleArray16 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray19 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray16, doubleArray19);
        switchingFunctionsHandler4.stepAccepted(100.0d, doubleArray16);
        switchingFunctionsHandler2.stepAccepted((double) (short) 1, doubleArray16);
        double[] doubleArray26 = new double[] { Double.NaN };
        double[] doubleArray35 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray38 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator39 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray35, doubleArray38);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator40 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray26, doubleArray35);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator(10.0d, (double) 10, doubleArray16, doubleArray26);
        double double42 = dormandPrince853Integrator41.getSafety();
        double double43 = dormandPrince853Integrator41.getCurrentStepStart();
        dormandPrince853Integrator41.setSafety((double) 0.0f);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.9d + "'", double42 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setInitialStepSize((double) 1L);
        int int12 = dormandPrince853Integrator4.getOrder();
        double double13 = dormandPrince853Integrator4.getCurrentStepStart();
        int int14 = dormandPrince853Integrator4.getOrder();
        double double15 = dormandPrince853Integrator4.getMaxGrowth();
        double double16 = dormandPrince853Integrator4.getMinStep();
        double double17 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setSafety((double) (-1));
        org.apache.commons.math.ode.StepHandler stepHandler20 = dormandPrince853Integrator4.getStepHandler();
        double double21 = dormandPrince853Integrator4.getMaxStep();
        double double22 = dormandPrince853Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double17));
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setInitialStepSize((double) 1L);
        int int12 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setSafety((double) (byte) 100);
        dormandPrince853Integrator4.setMinReduction((double) (-1));
        double double17 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setMinReduction((double) (byte) 100);
        double double20 = dormandPrince853Integrator4.getSafety();
        double double21 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) 3, (double) (-1L), (int) (byte) -1);
        double double18 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setMaxGrowth(0.0d);
        java.lang.String str21 = dormandPrince853Integrator4.getName();
        double double22 = dormandPrince853Integrator4.getMaxStep();
        double double23 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str21, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
    }

    @Test
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setInitialStepSize((double) 100.0f);
        int int15 = dormandPrince853Integrator4.getOrder();
        java.lang.String str16 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth((double) 1);
        double double19 = dormandPrince853Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler20 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertNotNull(stepHandler20);
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        double[] doubleArray4 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler5 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator6 = null;
        boolean boolean7 = switchingFunctionsHandler5.evaluateStep(stepInterpolator6);
        double[] doubleArray17 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray20 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray17, doubleArray20);
        switchingFunctionsHandler5.stepAccepted(100.0d, doubleArray17);
        boolean boolean23 = switchingFunctionsHandler5.isEmpty();
        boolean boolean24 = switchingFunctionsHandler5.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        boolean boolean26 = switchingFunctionsHandler5.evaluateStep(stepInterpolator25);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler28 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean29 = switchingFunctionsHandler28.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler31 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator32 = null;
        boolean boolean33 = switchingFunctionsHandler31.evaluateStep(stepInterpolator32);
        double[] doubleArray43 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray46 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator47 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray43, doubleArray46);
        switchingFunctionsHandler31.stepAccepted(100.0d, doubleArray43);
        switchingFunctionsHandler28.stepAccepted((double) (short) 10, doubleArray43);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean52 = switchingFunctionsHandler51.stop();
        double double53 = switchingFunctionsHandler51.getEventTime();
        double[] doubleArray58 = new double[] { Double.NaN };
        double[] doubleArray67 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray70 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator71 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray67, doubleArray70);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator72 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray58, doubleArray67);
        switchingFunctionsHandler51.stepAccepted(0.2d, doubleArray58);
        boolean boolean74 = switchingFunctionsHandler28.reset((double) (byte) -1, doubleArray58);
        boolean boolean75 = switchingFunctionsHandler5.reset((double) (-1L), doubleArray58);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator76 = new org.apache.commons.math.ode.DormandPrince853Integrator(13.92838827718412d, (double) '4', doubleArray4, doubleArray58);
        double[] doubleArray77 = null;
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator78 = new org.apache.commons.math.ode.DormandPrince853Integrator(6.5147610572485615d, (double) 100L, doubleArray58, doubleArray77);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(doubleArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray43), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) -1, (-1.0d), (double) (byte) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double10 = dormandPrince853Integrator9.getSafety();
        double double11 = dormandPrince853Integrator9.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        dormandPrince853Integrator16.addSwitchingFunction(switchingFunction17, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator16.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator16.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        stepHandler24.handleStep(stepInterpolator25, false);
        stepHandler24.reset();
        dormandPrince853Integrator9.setStepHandler(stepHandler24);
        dormandPrince853Integrator4.setStepHandler(stepHandler24);
        double double31 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setMinReduction(97.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction34 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction34, 3.1622776601683795d, 32.0d, (int) (byte) -1);
        double double39 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.2d + "'", double31 == 0.2d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 100.0d + "'", double39 == 100.0d);
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 'a', 2.0d, 0.0d, (double) (byte) 100);
        double double5 = dormandPrince853Integrator4.getMinReduction();
        double[] doubleArray14 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray17 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray14, doubleArray17);
        java.lang.String str19 = dormandPrince853Integrator18.getName();
        dormandPrince853Integrator18.setMinReduction(0.9d);
        java.lang.String str22 = dormandPrince853Integrator18.getName();
        double double23 = dormandPrince853Integrator18.getCurrentStepStart();
        double double24 = dormandPrince853Integrator18.getCurrentSignedStepsize();
        java.lang.String str25 = dormandPrince853Integrator18.getName();
        java.lang.String str26 = dormandPrince853Integrator18.getName();
        org.apache.commons.math.ode.StepHandler stepHandler27 = dormandPrince853Integrator18.getStepHandler();
        double double28 = dormandPrince853Integrator18.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler29 = dormandPrince853Integrator18.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler29);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.2d + "'", double5 == 0.2d);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str19, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str22, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9486832980505138d + "'", double24 == 0.9486832980505138d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str25, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str26, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler27);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.9d + "'", double28 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler29);
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray12);
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray28 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray31 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray28, doubleArray31);
        boolean boolean33 = switchingFunctionsHandler0.reset(10.0d, doubleArray31);
        double double34 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        switchingFunctionsHandler0.add(switchingFunction35, (double) (byte) 10, (double) 2, 3);
        boolean boolean40 = switchingFunctionsHandler0.stop();
        double double41 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        switchingFunctionsHandler0.add(switchingFunction42, (double) (byte) -1, (double) (short) 100, (int) (byte) -1);
        double double47 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler49 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator52 = null;
        boolean boolean53 = switchingFunctionsHandler51.evaluateStep(stepInterpolator52);
        double[] doubleArray63 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray66 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator67 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray63, doubleArray66);
        switchingFunctionsHandler51.stepAccepted(100.0d, doubleArray63);
        switchingFunctionsHandler49.stepAccepted((double) (short) 1, doubleArray63);
        double double70 = switchingFunctionsHandler49.getEventTime();
        double double71 = switchingFunctionsHandler49.getEventTime();
        double[] doubleArray80 = new double[] { (short) -1, (byte) -1, '4', 10L, ' ' };
        double[] doubleArray89 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray92 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator93 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray89, doubleArray92);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator94 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, (double) (byte) 0, doubleArray80, doubleArray89);
        switchingFunctionsHandler49.stepAccepted((double) 1L, doubleArray89);
        boolean boolean96 = switchingFunctionsHandler0.reset(55.71355310873648d, doubleArray89);
        double double97 = switchingFunctionsHandler0.getEventTime();
        double double98 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double41));
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.9, 0.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertTrue(Double.isNaN(double71));
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[-1.0, -1.0, 52.0, 10.0, 32.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray92), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double97));
        org.junit.Assert.assertTrue(Double.isNaN(double98));
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0L, 0.0d, 100.0d, (double) 100.0f);
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) -1, 1.0d, (double) 100.0f, (double) (-1.0f));
        double double5 = dormandPrince853Integrator4.getMaxGrowth();
        double double6 = dormandPrince853Integrator4.getCurrentStepStart();
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        double double8 = dormandPrince853Integrator4.getSafety();
        double double9 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.9d + "'", double8 == 0.9d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        double[] doubleArray3 = new double[] { Double.NaN };
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray3, doubleArray12);
        double double18 = dormandPrince853Integrator17.getCurrentSignedStepsize();
        double double19 = dormandPrince853Integrator17.getCurrentStepStart();
        double double20 = dormandPrince853Integrator17.getMinReduction();
        dormandPrince853Integrator17.setSafety(0.0d);
        double double23 = dormandPrince853Integrator17.getCurrentStepStart();
        dormandPrince853Integrator17.setMinReduction((double) 1.0f);
        dormandPrince853Integrator17.setSafety((double) 0.0f);
        int int28 = dormandPrince853Integrator17.getOrder();
        java.lang.String str29 = dormandPrince853Integrator17.getName();
        double double30 = dormandPrince853Integrator17.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str29, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 1.0d + "'", double30 == 1.0d);
    }

    @Test
    public void test15095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15095");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) (short) 0, (double) 1, (double) 100);
        dormandPrince853Integrator4.setMaxGrowth((double) (short) -1);
        double double7 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setInitialStepSize((double) 1);
        double double10 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test15096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15096");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(32.0d, 2.0d, (double) 1, (double) (short) 10);
        dormandPrince853Integrator4.setMinReduction((double) 1L);
        double double7 = dormandPrince853Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 2.0d + "'", double7 == 2.0d);
    }

    @Test
    public void test15097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15097");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getCurrentStepStart();
        double double6 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction7 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction7, (double) 1L, 0.0d, (int) '#');
        double double12 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler13 = dormandPrince853Integrator4.getStepHandler();
        double double14 = dormandPrince853Integrator4.getMaxStep();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test15098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15098");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, (double) '#', 0.9d, (double) (short) 100);
        dormandPrince853Integrator4.setMaxGrowth(0.0d);
        double double7 = dormandPrince853Integrator4.getMinReduction();
        double double8 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setInitialStepSize(22.80350850198276d);
        dormandPrince853Integrator4.setInitialStepSize(6.1090716144692525d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test15099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15099");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        double double10 = dormandPrince853Integrator4.getSafety();
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        double double13 = dormandPrince853Integrator4.getSafety();
        double double14 = dormandPrince853Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler15 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler15);
        double double17 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test15100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15100");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        java.lang.String str16 = dormandPrince853Integrator12.getName();
        double double17 = dormandPrince853Integrator12.getMinStep();
        double double18 = dormandPrince853Integrator12.getMinReduction();
        dormandPrince853Integrator12.setSafety((double) (byte) 100);
        int int21 = dormandPrince853Integrator12.getOrder();
        dormandPrince853Integrator12.setMinReduction(9.486832980505138d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 1.0d + "'", double17 == 1.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9d + "'", double18 == 0.9d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test15101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15101");
        double[] doubleArray5 = new double[] { Double.NaN };
        double[] doubleArray14 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray17 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray14, doubleArray17);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray5, doubleArray14);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler22 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        boolean boolean26 = switchingFunctionsHandler24.evaluateStep(stepInterpolator25);
        double[] doubleArray36 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray39 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator40 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray36, doubleArray39);
        switchingFunctionsHandler24.stepAccepted(100.0d, doubleArray36);
        switchingFunctionsHandler22.stepAccepted((double) (short) 1, doubleArray36);
        double[] doubleArray46 = new double[] { Double.NaN };
        double[] doubleArray55 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray58 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator59 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray55, doubleArray58);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator60 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray46, doubleArray55);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator61 = new org.apache.commons.math.ode.DormandPrince853Integrator(10.0d, (double) 10, doubleArray36, doubleArray46);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator62 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 100, (double) 0.0f, doubleArray14, doubleArray36);
        java.lang.String str63 = dormandPrince853Integrator62.getName();
        java.lang.String str64 = dormandPrince853Integrator62.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction65 = null;
        dormandPrince853Integrator62.addSwitchingFunction(switchingFunction65, (double) (byte) 1, 0.0d, (int) '#');
        double double70 = dormandPrince853Integrator62.getSafety();
        dormandPrince853Integrator62.setMinReduction(3.0d);
        java.lang.String str73 = dormandPrince853Integrator62.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction74 = null;
        dormandPrince853Integrator62.addSwitchingFunction(switchingFunction74, (double) ' ', 31.810829150682025d, (int) (short) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction79 = null;
        dormandPrince853Integrator62.addSwitchingFunction(switchingFunction79, 0.0d, 100.0d, (int) (short) 10);
        double double84 = dormandPrince853Integrator62.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(doubleArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray5), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str63, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str64, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.9d + "'", double70 == 0.9d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str73, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 0.0d + "'", double84 == 0.0d);
    }

    @Test
    public void test15102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15102");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1L, (double) 100, (double) 0.0f, (double) (short) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction10 = null;
        dormandPrince853Integrator9.addSwitchingFunction(switchingFunction10, (double) 10, (double) 'a', (int) (byte) 10);
        int int15 = dormandPrince853Integrator9.getOrder();
        double double16 = dormandPrince853Integrator9.getCurrentSignedStepsize();
        double double17 = dormandPrince853Integrator9.getCurrentSignedStepsize();
        int int18 = dormandPrince853Integrator9.getOrder();
        double double19 = dormandPrince853Integrator9.getMinReduction();
        int int20 = dormandPrince853Integrator9.getOrder();
        int int21 = dormandPrince853Integrator9.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator26 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        dormandPrince853Integrator26.addSwitchingFunction(switchingFunction27, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator26.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator26.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator35 = null;
        stepHandler34.handleStep(stepInterpolator35, false);
        stepHandler34.reset();
        dormandPrince853Integrator9.setStepHandler(stepHandler34);
        double double40 = dormandPrince853Integrator9.getCurrentStepStart();
        int int41 = dormandPrince853Integrator9.getOrder();
        int int42 = dormandPrince853Integrator9.getOrder();
        double double43 = dormandPrince853Integrator9.getCurrentStepStart();
        double double44 = dormandPrince853Integrator9.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler45 = dormandPrince853Integrator9.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler45);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator51 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        dormandPrince853Integrator51.addSwitchingFunction(switchingFunction52, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator51.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler59 = dormandPrince853Integrator51.getStepHandler();
        double double60 = dormandPrince853Integrator51.getMaxStep();
        double double61 = dormandPrince853Integrator51.getMinReduction();
        dormandPrince853Integrator51.setInitialStepSize((double) '4');
        double double64 = dormandPrince853Integrator51.getCurrentStepStart();
        java.lang.String str65 = dormandPrince853Integrator51.getName();
        org.apache.commons.math.ode.StepHandler stepHandler66 = dormandPrince853Integrator51.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler66);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction68 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction68, 31.810829150682025d, 72.11102550927978d, (int) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction73 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction73, (double) 10.0f, 2.8284271247461903d, 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction78 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction78, Double.NaN, 55.3841974787333d, (int) (short) -1);
        double double83 = dormandPrince853Integrator4.getMaxStep();
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2d + "'", double19 == 0.2d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue(Double.isNaN(double40));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 8 + "'", int41 == 8);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 8 + "'", int42 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler45);
        org.junit.Assert.assertNotNull(stepHandler59);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 10.0d + "'", double60 == 10.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 100.0d + "'", double61 == 100.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double64));
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str65, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 100.0d + "'", double83 == 100.0d);
    }

    @Test
    public void test15103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15103");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, (double) '#', 0.9d, (double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler6 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator11 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double12 = dormandPrince853Integrator11.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        dormandPrince853Integrator17.addSwitchingFunction(switchingFunction18, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator17.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler25 = dormandPrince853Integrator17.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        stepHandler25.handleStep(stepInterpolator26, false);
        dormandPrince853Integrator11.setStepHandler(stepHandler25);
        dormandPrince853Integrator4.setStepHandler(stepHandler25);
        double double31 = dormandPrince853Integrator4.getMaxGrowth();
        double double32 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction33, (double) 100L, 8.0d, 100);
        int int38 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 35.0d + "'", double32 == 35.0d);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 8 + "'", int38 == 8);
    }

    @Test
    public void test15104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15104");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        double double13 = dormandPrince853Integrator4.getMaxStep();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        double double16 = dormandPrince853Integrator4.getMaxStep();
        double double17 = dormandPrince853Integrator4.getMinStep();
        int int18 = dormandPrince853Integrator4.getOrder();
        int int19 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction20, 41.61791450287817d, 1.4997884186649117d, 3);
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
    }

    @Test
    public void test15105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15105");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, (double) (byte) -1, 11.892071150027212d, (double) (-1.0f));
        double[] doubleArray13 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray16 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray13, doubleArray16);
        java.lang.String str18 = dormandPrince853Integrator17.getName();
        dormandPrince853Integrator17.setSafety((double) 0L);
        dormandPrince853Integrator17.setMaxGrowth((double) 'a');
        int int23 = dormandPrince853Integrator17.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        dormandPrince853Integrator17.addSwitchingFunction(switchingFunction24, (double) 100L, (double) 1.0f, (int) 'a');
        dormandPrince853Integrator17.setInitialStepSize((double) '4');
        double double31 = dormandPrince853Integrator17.getCurrentSignedStepsize();
        int int32 = dormandPrince853Integrator17.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        dormandPrince853Integrator17.addSwitchingFunction(switchingFunction33, (double) (byte) 10, (double) (-1L), 10);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction38 = null;
        dormandPrince853Integrator17.addSwitchingFunction(switchingFunction38, (double) (byte) 1, (double) 100, (int) (byte) 10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator47 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1L, (double) 100, (double) 0.0f, (double) (short) 1);
        int int48 = dormandPrince853Integrator47.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler49 = dormandPrince853Integrator47.getStepHandler();
        dormandPrince853Integrator17.setStepHandler(stepHandler49);
        dormandPrince853Integrator4.setStepHandler(stepHandler49);
        java.lang.String str52 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertNotNull(doubleArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray13), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9486832980505138d + "'", double31 == 0.9486832980505138d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 8 + "'", int48 == 8);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str52, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15106");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100, (double) 2, 0.9d, (double) (byte) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (-0.0d), 0.2d, (int) (short) 0);
        org.apache.commons.math.ode.StepHandler stepHandler10 = dormandPrince853Integrator4.getStepHandler();
        boolean boolean11 = stepHandler10.requiresDenseOutput();
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test15107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15107");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        int int13 = dormandPrince853Integrator4.getOrder();
        int int14 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMinReduction((double) (short) -1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction17, 97.0d, (double) (byte) -1, (int) (byte) 0);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator26 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double27 = dormandPrince853Integrator26.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        dormandPrince853Integrator26.addSwitchingFunction(switchingFunction28, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double33 = dormandPrince853Integrator26.getSafety();
        double double34 = dormandPrince853Integrator26.getMaxGrowth();
        java.lang.String str35 = dormandPrince853Integrator26.getName();
        dormandPrince853Integrator26.setSafety((double) 1);
        double double38 = dormandPrince853Integrator26.getCurrentStepStart();
        dormandPrince853Integrator26.setSafety((double) 2);
        org.apache.commons.math.ode.StepHandler stepHandler41 = dormandPrince853Integrator26.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler41);
        java.lang.String str43 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.9d + "'", double27 == 0.9d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.9d + "'", double33 == 0.9d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str35, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertNotNull(stepHandler41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str43, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15108");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', 0.6324555320336759d, 31.622776601683793d, 13.92838827718412d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double10 = dormandPrince853Integrator9.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        dormandPrince853Integrator9.addSwitchingFunction(switchingFunction11, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double16 = dormandPrince853Integrator9.getCurrentStepStart();
        dormandPrince853Integrator9.setInitialStepSize((double) 0.0f);
        java.lang.String str19 = dormandPrince853Integrator9.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        dormandPrince853Integrator9.addSwitchingFunction(switchingFunction20, Double.NaN, (double) 100.0f, (int) (byte) 0);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator29 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        dormandPrince853Integrator29.addSwitchingFunction(switchingFunction30, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator29.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler37 = dormandPrince853Integrator29.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        stepHandler37.handleStep(stepInterpolator38, false);
        boolean boolean41 = stepHandler37.requiresDenseOutput();
        dormandPrince853Integrator9.setStepHandler(stepHandler37);
        boolean boolean43 = stepHandler37.requiresDenseOutput();
        boolean boolean44 = stepHandler37.requiresDenseOutput();
        boolean boolean45 = stepHandler37.requiresDenseOutput();
        dormandPrince853Integrator4.setStepHandler(stepHandler37);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double16));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str19, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler37);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test15109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15109");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setInitialStepSize((double) 0.0f);
        java.lang.String str14 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction15, (double) (short) 10, (double) '#', 2);
        double double20 = dormandPrince853Integrator4.getSafety();
        double double21 = dormandPrince853Integrator4.getCurrentStepStart();
        int int22 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str14, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9d + "'", double20 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
    }

    @Test
    public void test15110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15110");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', (double) 1, (-1.0d), (double) (-1L));
        int int5 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test15111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15111");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getSafety();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setInitialStepSize((double) 8);
        double double15 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str16 = dormandPrince853Integrator4.getName();
        double double17 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double17));
    }

    @Test
    public void test15112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15112");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        double double11 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setMaxGrowth((double) 10L);
        double double14 = dormandPrince853Integrator4.getCurrentStepStart();
        int int15 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setSafety(2.8284271247461903d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
    }

    @Test
    public void test15113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15113");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler3.evaluateStep(stepInterpolator4);
        double[] doubleArray15 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray18 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray15, doubleArray18);
        switchingFunctionsHandler3.stepAccepted(100.0d, doubleArray15);
        switchingFunctionsHandler0.stepAccepted((double) (short) 10, doubleArray15);
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        double double23 = switchingFunctionsHandler0.getEventTime();
        boolean boolean24 = switchingFunctionsHandler0.stop();
        boolean boolean25 = switchingFunctionsHandler0.isEmpty();
        boolean boolean26 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test15114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15114");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler3.evaluateStep(stepInterpolator4);
        double[] doubleArray15 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray18 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray15, doubleArray18);
        switchingFunctionsHandler3.stepAccepted(100.0d, doubleArray15);
        switchingFunctionsHandler0.stepAccepted((double) (short) 10, doubleArray15);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler23 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean24 = switchingFunctionsHandler23.stop();
        double double25 = switchingFunctionsHandler23.getEventTime();
        double[] doubleArray30 = new double[] { Double.NaN };
        double[] doubleArray39 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray42 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator43 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray39, doubleArray42);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray30, doubleArray39);
        switchingFunctionsHandler23.stepAccepted(0.2d, doubleArray30);
        boolean boolean46 = switchingFunctionsHandler0.reset((double) (byte) -1, doubleArray30);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler48 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean49 = switchingFunctionsHandler48.stop();
        double double50 = switchingFunctionsHandler48.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler52 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator53 = null;
        boolean boolean54 = switchingFunctionsHandler52.evaluateStep(stepInterpolator53);
        double[] doubleArray64 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray67 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator68 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray64, doubleArray67);
        switchingFunctionsHandler52.stepAccepted(100.0d, doubleArray64);
        switchingFunctionsHandler48.stepAccepted(10.0d, doubleArray64);
        boolean boolean71 = switchingFunctionsHandler0.reset(0.0d, doubleArray64);
        boolean boolean72 = switchingFunctionsHandler0.isEmpty();
        double double73 = switchingFunctionsHandler0.getEventTime();
        boolean boolean74 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator75 = null;
        boolean boolean76 = switchingFunctionsHandler0.evaluateStep(stepInterpolator75);
        double double77 = switchingFunctionsHandler0.getEventTime();
        boolean boolean78 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator79 = null;
        boolean boolean80 = switchingFunctionsHandler0.evaluateStep(stepInterpolator79);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double73));
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double77));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test15115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15115");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        double double13 = dormandPrince853Integrator4.getMaxStep();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100, (double) 2, 0.9d, (double) (byte) 1);
        double double21 = dormandPrince853Integrator20.getMaxStep();
        java.lang.String str22 = dormandPrince853Integrator20.getName();
        org.apache.commons.math.ode.StepHandler stepHandler23 = dormandPrince853Integrator20.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler23);
        double double25 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setMaxGrowth((-0.0d));
        double[] doubleArray36 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray39 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator40 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray36, doubleArray39);
        java.lang.String str41 = dormandPrince853Integrator40.getName();
        dormandPrince853Integrator40.setSafety((double) 0L);
        dormandPrince853Integrator40.setMaxGrowth((double) 'a');
        int int46 = dormandPrince853Integrator40.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        dormandPrince853Integrator40.addSwitchingFunction(switchingFunction47, (double) 100L, (double) 1.0f, (int) 'a');
        dormandPrince853Integrator40.setInitialStepSize((double) '4');
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator58 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction59 = null;
        dormandPrince853Integrator58.addSwitchingFunction(switchingFunction59, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator58.setMinReduction(100.0d);
        double double66 = dormandPrince853Integrator58.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction67 = null;
        dormandPrince853Integrator58.addSwitchingFunction(switchingFunction67, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler72 = dormandPrince853Integrator58.getStepHandler();
        java.lang.String str73 = dormandPrince853Integrator58.getName();
        org.apache.commons.math.ode.StepHandler stepHandler74 = dormandPrince853Integrator58.getStepHandler();
        dormandPrince853Integrator40.setStepHandler(stepHandler74);
        double double76 = dormandPrince853Integrator40.getCurrentStepStart();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator81 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction82 = null;
        dormandPrince853Integrator81.addSwitchingFunction(switchingFunction82, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator81.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler89 = dormandPrince853Integrator81.getStepHandler();
        boolean boolean90 = stepHandler89.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator91 = null;
        stepHandler89.handleStep(stepInterpolator91, false);
        dormandPrince853Integrator40.setStepHandler(stepHandler89);
        dormandPrince853Integrator4.setStepHandler(stepHandler89);
        double double96 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int97 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 2.0d + "'", double21 == 2.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str22, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue(Double.isNaN(double25));
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str41, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler72);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str73, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler74);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertNotNull(stepHandler89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + double96 + "' != '" + 10.0d + "'", double96 == 10.0d);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 8 + "'", int97 == 8);
    }

    @Test
    public void test15116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15116");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getMaxStep();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setInitialStepSize((double) 10L);
        double double15 = dormandPrince853Integrator4.getMaxGrowth();
        java.lang.String str16 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15117");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        boolean boolean6 = switchingFunctionsHandler4.evaluateStep(stepInterpolator5);
        double[] doubleArray16 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray19 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray16, doubleArray19);
        switchingFunctionsHandler4.stepAccepted(100.0d, doubleArray16);
        switchingFunctionsHandler2.stepAccepted((double) (short) 1, doubleArray16);
        double[] doubleArray26 = new double[] { Double.NaN };
        double[] doubleArray35 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray38 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator39 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray35, doubleArray38);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator40 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray26, doubleArray35);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator(10.0d, (double) 10, doubleArray16, doubleArray26);
        double double42 = dormandPrince853Integrator41.getSafety();
        java.lang.String str43 = dormandPrince853Integrator41.getName();
        dormandPrince853Integrator41.setMaxGrowth((double) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler46 = dormandPrince853Integrator41.getStepHandler();
        boolean boolean47 = stepHandler46.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator48 = null;
        stepHandler46.handleStep(stepInterpolator48, false);
        boolean boolean51 = stepHandler46.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.9d + "'", double42 == 0.9d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str43, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test15118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15118");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler4 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator5 = null;
        boolean boolean6 = switchingFunctionsHandler4.evaluateStep(stepInterpolator5);
        double[] doubleArray16 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray19 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray16, doubleArray19);
        switchingFunctionsHandler4.stepAccepted(100.0d, doubleArray16);
        switchingFunctionsHandler2.stepAccepted((double) (short) 1, doubleArray16);
        double[] doubleArray26 = new double[] { Double.NaN };
        double[] doubleArray35 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray38 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator39 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray35, doubleArray38);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator40 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray26, doubleArray35);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator(10.0d, (double) 10, doubleArray16, doubleArray26);
        double double42 = dormandPrince853Integrator41.getSafety();
        double double43 = dormandPrince853Integrator41.getCurrentStepStart();
        dormandPrince853Integrator41.setInitialStepSize((double) 100L);
        double double46 = dormandPrince853Integrator41.getCurrentStepStart();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator51 = new org.apache.commons.math.ode.DormandPrince853Integrator(0.0d, 10.0d, Double.NaN, 17.320508075688775d);
        org.apache.commons.math.ode.StepHandler stepHandler52 = dormandPrince853Integrator51.getStepHandler();
        dormandPrince853Integrator41.setStepHandler(stepHandler52);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction54 = null;
        dormandPrince853Integrator41.addSwitchingFunction(switchingFunction54, 13.92838827718412d, (double) 1.0f, (int) (short) 1);
        java.lang.String str59 = dormandPrince853Integrator41.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator64 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) (short) 0, (double) 1, (double) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction65 = null;
        dormandPrince853Integrator64.addSwitchingFunction(switchingFunction65, (double) 1.0f, (double) 0, (int) (byte) 0);
        double double70 = dormandPrince853Integrator64.getCurrentSignedStepsize();
        java.lang.String str71 = dormandPrince853Integrator64.getName();
        dormandPrince853Integrator64.setSafety(97.0d);
        double double74 = dormandPrince853Integrator64.getCurrentStepStart();
        dormandPrince853Integrator64.setInitialStepSize(4.161791450287817d);
        org.apache.commons.math.ode.StepHandler stepHandler77 = dormandPrince853Integrator64.getStepHandler();
        dormandPrince853Integrator41.setStepHandler(stepHandler77);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.9d + "'", double42 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double43));
        org.junit.Assert.assertTrue(Double.isNaN(double46));
        org.junit.Assert.assertNotNull(stepHandler52);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str59, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double70));
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str71, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double74));
        org.junit.Assert.assertNotNull(stepHandler77);
    }

    @Test
    public void test15119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15119");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        dormandPrince853Integrator10.addSwitchingFunction(switchingFunction11, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator10.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler18 = dormandPrince853Integrator10.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        stepHandler18.handleStep(stepInterpolator19, false);
        dormandPrince853Integrator4.setStepHandler(stepHandler18);
        double double23 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setInitialStepSize(100.0d);
        double double26 = dormandPrince853Integrator4.getCurrentStepStart();
        double double27 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setSafety(17.320508075688775d);
        double double30 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str31 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str31, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15120");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(3.760603093086394d, 23.893706400185096d, 18.708286933869708d, 22.80350850198276d);
    }

    @Test
    public void test15121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15121");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setInitialStepSize((double) 0.0f);
        java.lang.String str14 = dormandPrince853Integrator4.getName();
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction16, Double.NaN, (double) 100, (int) (short) 1);
        double double21 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setMinReduction(3.430936289925951d);
        dormandPrince853Integrator4.setInitialStepSize(0.0d);
        double double26 = dormandPrince853Integrator4.getMinStep();
        double double27 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str14, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double21));
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.9d + "'", double27 == 0.9d);
    }

    @Test
    public void test15122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15122");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray12);
        double[] doubleArray22 = new double[] { Double.NaN };
        double[] doubleArray31 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray34 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator35 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray31, doubleArray34);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray22, doubleArray31);
        boolean boolean37 = switchingFunctionsHandler0.reset(100.0d, doubleArray22);
        double double38 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        switchingFunctionsHandler0.add(switchingFunction39, 14.142135623730951d, (double) 'a', 100);
        double double44 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler46 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator47 = null;
        boolean boolean48 = switchingFunctionsHandler46.evaluateStep(stepInterpolator47);
        double[] doubleArray58 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray61 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator62 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray58, doubleArray61);
        switchingFunctionsHandler46.stepAccepted(100.0d, doubleArray58);
        boolean boolean64 = switchingFunctionsHandler46.isEmpty();
        double[] doubleArray74 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray77 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator78 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray74, doubleArray77);
        boolean boolean79 = switchingFunctionsHandler46.reset(10.0d, doubleArray77);
        boolean boolean80 = switchingFunctionsHandler0.reset((double) (-1), doubleArray77);
        boolean boolean81 = switchingFunctionsHandler0.stop();
        boolean boolean82 = switchingFunctionsHandler0.isEmpty();
        boolean boolean83 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction84 = null;
        switchingFunctionsHandler0.add(switchingFunction84, (double) 3, (double) (short) 100, 0);
        double double89 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction90 = null;
        switchingFunctionsHandler0.add(switchingFunction90, (-0.0d), 0.9486832980505138d, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray22), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray34), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(doubleArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray74), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double89));
    }

    @Test
    public void test15123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15123");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setSafety((double) 0L);
        dormandPrince853Integrator12.setMaxGrowth((double) 'a');
        int int18 = dormandPrince853Integrator12.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction19, (double) 100L, (double) 1.0f, (int) 'a');
        dormandPrince853Integrator12.setInitialStepSize((double) '4');
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator30 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction31 = null;
        dormandPrince853Integrator30.addSwitchingFunction(switchingFunction31, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator30.setMinReduction(100.0d);
        double double38 = dormandPrince853Integrator30.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        dormandPrince853Integrator30.addSwitchingFunction(switchingFunction39, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler44 = dormandPrince853Integrator30.getStepHandler();
        java.lang.String str45 = dormandPrince853Integrator30.getName();
        org.apache.commons.math.ode.StepHandler stepHandler46 = dormandPrince853Integrator30.getStepHandler();
        dormandPrince853Integrator12.setStepHandler(stepHandler46);
        double double48 = dormandPrince853Integrator12.getCurrentStepStart();
        org.apache.commons.math.ode.StepHandler stepHandler49 = dormandPrince853Integrator12.getStepHandler();
        int int50 = dormandPrince853Integrator12.getOrder();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str45, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 8 + "'", int50 == 8);
    }

    @Test
    public void test15124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15124");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(17.320508075688775d, (double) 8, Double.NaN, 3.0d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        double double6 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator11 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        dormandPrince853Integrator11.addSwitchingFunction(switchingFunction12, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator11.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler19 = dormandPrince853Integrator11.getStepHandler();
        java.lang.String str20 = dormandPrince853Integrator11.getName();
        double double21 = dormandPrince853Integrator11.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator26 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double27 = dormandPrince853Integrator26.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        dormandPrince853Integrator26.addSwitchingFunction(switchingFunction28, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double33 = dormandPrince853Integrator26.getCurrentStepStart();
        java.lang.String str34 = dormandPrince853Integrator26.getName();
        org.apache.commons.math.ode.StepHandler stepHandler35 = dormandPrince853Integrator26.getStepHandler();
        dormandPrince853Integrator11.setStepHandler(stepHandler35);
        stepHandler35.reset();
        boolean boolean38 = stepHandler35.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator39 = null;
        stepHandler35.handleStep(stepInterpolator39, false);
        dormandPrince853Integrator4.setStepHandler(stepHandler35);
        org.apache.commons.math.ode.StepHandler stepHandler43 = dormandPrince853Integrator4.getStepHandler();
        stepHandler43.reset();
        boolean boolean45 = stepHandler43.requiresDenseOutput();
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.2d + "'", double6 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str20, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.9d + "'", double27 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str34, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(stepHandler43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test15125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15125");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler3.evaluateStep(stepInterpolator4);
        double[] doubleArray15 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray18 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray15, doubleArray18);
        switchingFunctionsHandler3.stepAccepted(100.0d, doubleArray15);
        switchingFunctionsHandler0.stepAccepted((double) (short) 10, doubleArray15);
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        boolean boolean23 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        switchingFunctionsHandler0.add(switchingFunction24, (double) (-1L), 14.142135623730951d, (int) (short) 10);
        double double29 = switchingFunctionsHandler0.getEventTime();
        double double30 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator31 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean32 = switchingFunctionsHandler0.evaluateStep(stepInterpolator31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test15126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15126");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str13 = dormandPrince853Integrator4.getName();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction15, (double) 2, (double) 10, 0);
        double double20 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int21 = dormandPrince853Integrator4.getOrder();
        int int22 = dormandPrince853Integrator4.getOrder();
        int int23 = dormandPrince853Integrator4.getOrder();
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
    }

    @Test
    public void test15127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15127");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        double double10 = dormandPrince853Integrator4.getSafety();
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) (-1L), (double) 100, 3);
        java.lang.String str18 = dormandPrince853Integrator4.getName();
        double double19 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double20 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setInitialStepSize(11.801859293002996d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
    }

    @Test
    public void test15128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15128");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray12);
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        double double19 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler21 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean22 = switchingFunctionsHandler21.stop();
        double double23 = switchingFunctionsHandler21.getEventTime();
        double[] doubleArray28 = new double[] { Double.NaN };
        double[] doubleArray37 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray40 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray37, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray28, doubleArray37);
        switchingFunctionsHandler21.stepAccepted(0.2d, doubleArray28);
        boolean boolean44 = switchingFunctionsHandler0.reset((double) '4', doubleArray28);
        double[] doubleArray54 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray57 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator58 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray54, doubleArray57);
        boolean boolean59 = switchingFunctionsHandler0.reset((double) (-1), doubleArray57);
        double double60 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator61 = null;
        boolean boolean62 = switchingFunctionsHandler0.evaluateStep(stepInterpolator61);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler64 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean65 = switchingFunctionsHandler64.stop();
        double double66 = switchingFunctionsHandler64.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler68 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator69 = null;
        boolean boolean70 = switchingFunctionsHandler68.evaluateStep(stepInterpolator69);
        double[] doubleArray80 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray83 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator84 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray80, doubleArray83);
        switchingFunctionsHandler68.stepAccepted(100.0d, doubleArray80);
        switchingFunctionsHandler64.stepAccepted(10.0d, doubleArray80);
        switchingFunctionsHandler0.stepAccepted(1.0d, doubleArray80);
        double double88 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(doubleArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray54), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double66));
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(doubleArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray80), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray83), "[0.9, 0.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double88));
    }

    @Test
    public void test15129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15129");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getSafety();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        double double13 = dormandPrince853Integrator4.getCurrentStepStart();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        double double15 = dormandPrince853Integrator4.getMinReduction();
        int int16 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setSafety((double) (byte) 0);
        int int19 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        dormandPrince853Integrator24.addSwitchingFunction(switchingFunction25, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator24.setMinReduction(100.0d);
        double double32 = dormandPrince853Integrator24.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        dormandPrince853Integrator24.addSwitchingFunction(switchingFunction33, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler38 = null;
        dormandPrince853Integrator24.setStepHandler(stepHandler38);
        java.lang.String str40 = dormandPrince853Integrator24.getName();
        dormandPrince853Integrator24.setMaxGrowth((double) '4');
        double double43 = dormandPrince853Integrator24.getCurrentSignedStepsize();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator48 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, (double) '#', 0.9d, (double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler49 = dormandPrince853Integrator48.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator54 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        dormandPrince853Integrator54.addSwitchingFunction(switchingFunction55, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator54.setMinReduction(100.0d);
        double double62 = dormandPrince853Integrator54.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction63 = null;
        dormandPrince853Integrator54.addSwitchingFunction(switchingFunction63, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler68 = dormandPrince853Integrator54.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator69 = null;
        stepHandler68.handleStep(stepInterpolator69, false);
        boolean boolean72 = stepHandler68.requiresDenseOutput();
        dormandPrince853Integrator48.setStepHandler(stepHandler68);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator74 = null;
        stepHandler68.handleStep(stepInterpolator74, true);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator77 = null;
        stepHandler68.handleStep(stepInterpolator77, true);
        dormandPrince853Integrator24.setStepHandler(stepHandler68);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator81 = null;
        stepHandler68.handleStep(stepInterpolator81, true);
        dormandPrince853Integrator4.setStepHandler(stepHandler68);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str40, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler68);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test15130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15130");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getSafety();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setInitialStepSize((double) '#');
        dormandPrince853Integrator4.setMinReduction((double) (short) -1);
        double double17 = dormandPrince853Integrator4.getMaxStep();
        double[] doubleArray26 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray29 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator30 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray26, doubleArray29);
        java.lang.String str31 = dormandPrince853Integrator30.getName();
        dormandPrince853Integrator30.setMinReduction(0.9d);
        double double34 = dormandPrince853Integrator30.getMaxGrowth();
        double double35 = dormandPrince853Integrator30.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction36 = null;
        dormandPrince853Integrator30.addSwitchingFunction(switchingFunction36, (double) 0, (double) 'a', (int) '4');
        double double41 = dormandPrince853Integrator30.getMinReduction();
        double double42 = dormandPrince853Integrator30.getCurrentSignedStepsize();
        double[] doubleArray46 = new double[] { Double.NaN };
        double[] doubleArray55 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray58 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator59 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray55, doubleArray58);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator60 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray46, doubleArray55);
        java.lang.String str61 = dormandPrince853Integrator60.getName();
        java.lang.String str62 = dormandPrince853Integrator60.getName();
        org.apache.commons.math.ode.StepHandler stepHandler63 = dormandPrince853Integrator60.getStepHandler();
        boolean boolean64 = stepHandler63.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator65 = null;
        stepHandler63.handleStep(stepInterpolator65, false);
        boolean boolean68 = stepHandler63.requiresDenseOutput();
        dormandPrince853Integrator30.setStepHandler(stepHandler63);
        dormandPrince853Integrator4.setStepHandler(stepHandler63);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator71 = null;
        stepHandler63.handleStep(stepInterpolator71, false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str31, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 1.0d + "'", double35 == 1.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 0.9d + "'", double41 == 0.9d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.9486832980505138d + "'", double42 == 0.9486832980505138d);
        org.junit.Assert.assertNotNull(doubleArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray46), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray55), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray58), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str61, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str62, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test15131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15131");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        java.lang.String str16 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMaxGrowth((double) 3);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) 1, (double) 100.0f, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator23.getStepHandler();
        dormandPrince853Integrator12.setStepHandler(stepHandler24);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator30 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 10, (double) ' ', (double) (-1.0f), 14.142135623730951d);
        org.apache.commons.math.ode.StepHandler stepHandler31 = dormandPrince853Integrator30.getStepHandler();
        dormandPrince853Integrator12.setStepHandler(stepHandler31);
        org.apache.commons.math.ode.StepHandler stepHandler33 = dormandPrince853Integrator12.getStepHandler();
        double double34 = dormandPrince853Integrator12.getSafety();
        double double35 = dormandPrince853Integrator12.getMinReduction();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.9d + "'", double34 == 0.9d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.9d + "'", double35 == 0.9d);
    }

    @Test
    public void test15132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15132");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray12);
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray28 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray31 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray28, doubleArray31);
        boolean boolean33 = switchingFunctionsHandler0.reset(10.0d, doubleArray31);
        double double34 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler36 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        boolean boolean38 = switchingFunctionsHandler36.evaluateStep(stepInterpolator37);
        double[] doubleArray48 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray51 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator52 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray48, doubleArray51);
        switchingFunctionsHandler36.stepAccepted(100.0d, doubleArray48);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction54 = null;
        switchingFunctionsHandler36.add(switchingFunction54, 100.0d, (double) 0.0f, (int) (byte) 1);
        boolean boolean59 = switchingFunctionsHandler36.stop();
        double[] doubleArray64 = new double[] { Double.NaN };
        double[] doubleArray73 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray76 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator77 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray73, doubleArray76);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator78 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray64, doubleArray73);
        boolean boolean79 = switchingFunctionsHandler36.reset((double) 1L, doubleArray64);
        switchingFunctionsHandler0.stepAccepted((double) 0, doubleArray64);
        double double81 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray88 = new double[] { (byte) 10, 10.0d, (short) 10, 8, (-1) };
        boolean boolean89 = switchingFunctionsHandler0.reset((double) ' ', doubleArray88);
        boolean boolean90 = switchingFunctionsHandler0.isEmpty();
        double double91 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction92 = null;
        switchingFunctionsHandler0.add(switchingFunction92, 11.585065449428521d, 3.0d, 3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray73), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray76), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double81));
        org.junit.Assert.assertNotNull(doubleArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray88), "[10.0, 10.0, 10.0, 8.0, -1.0]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double91));
    }

    @Test
    public void test15133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15133");
        double[] doubleArray7 = new double[] { Double.NaN };
        double[] doubleArray16 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray19 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray16, doubleArray19);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray7, doubleArray16);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler26 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator27 = null;
        boolean boolean28 = switchingFunctionsHandler26.evaluateStep(stepInterpolator27);
        double[] doubleArray38 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray41 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray38, doubleArray41);
        switchingFunctionsHandler26.stepAccepted(100.0d, doubleArray38);
        switchingFunctionsHandler24.stepAccepted((double) (short) 1, doubleArray38);
        double[] doubleArray48 = new double[] { Double.NaN };
        double[] doubleArray57 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray60 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator61 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray57, doubleArray60);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator62 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray48, doubleArray57);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator63 = new org.apache.commons.math.ode.DormandPrince853Integrator(10.0d, (double) 10, doubleArray38, doubleArray48);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator64 = new org.apache.commons.math.ode.DormandPrince853Integrator((-1.0d), (double) '#', doubleArray16, doubleArray38);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler65 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean66 = switchingFunctionsHandler65.stop();
        double double67 = switchingFunctionsHandler65.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler69 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator70 = null;
        boolean boolean71 = switchingFunctionsHandler69.evaluateStep(stepInterpolator70);
        double[] doubleArray81 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray84 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator85 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray81, doubleArray84);
        switchingFunctionsHandler69.stepAccepted(100.0d, doubleArray81);
        switchingFunctionsHandler65.stepAccepted(10.0d, doubleArray81);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator88 = new org.apache.commons.math.ode.DormandPrince853Integrator(31.622776601683793d, (double) 'a', doubleArray16, doubleArray81);
        java.lang.String str89 = dormandPrince853Integrator88.getName();
        int int90 = dormandPrince853Integrator88.getOrder();
        double double91 = dormandPrince853Integrator88.getCurrentStepStart();
        double double92 = dormandPrince853Integrator88.getSafety();
        double double93 = dormandPrince853Integrator88.getCurrentSignedStepsize();
        double double94 = dormandPrince853Integrator88.getMaxGrowth();
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(doubleArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray38), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray41), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray57), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray60), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double67));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(doubleArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray81), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray84);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray84), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str89, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 8 + "'", int90 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double91));
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 0.9d + "'", double92 == 0.9d);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 55.3841974787333d + "'", double93 == 55.3841974787333d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 10.0d + "'", double94 == 10.0d);
    }

    @Test
    public void test15134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15134");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray12);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        switchingFunctionsHandler0.add(switchingFunction18, 100.0d, (double) 0.0f, (int) (byte) 1);
        boolean boolean23 = switchingFunctionsHandler0.stop();
        double[] doubleArray28 = new double[] { Double.NaN };
        double[] doubleArray37 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray40 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray37, doubleArray40);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray28, doubleArray37);
        boolean boolean43 = switchingFunctionsHandler0.reset((double) 1L, doubleArray28);
        boolean boolean44 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction45 = null;
        switchingFunctionsHandler0.add(switchingFunction45, 0.0d, (double) 0.0f, (int) 'a');
        boolean boolean50 = switchingFunctionsHandler0.isEmpty();
        boolean boolean51 = switchingFunctionsHandler0.stop();
        double double52 = switchingFunctionsHandler0.getEventTime();
        double double53 = switchingFunctionsHandler0.getEventTime();
        boolean boolean54 = switchingFunctionsHandler0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray37), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray40), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test15135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15135");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setMinReduction(3.0d);
        double double8 = dormandPrince853Integrator4.getMaxStep();
        double double9 = dormandPrince853Integrator4.getMinStep();
        java.lang.String str10 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str10, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15136");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        dormandPrince853Integrator12.setSafety((double) (-1.0f));
        dormandPrince853Integrator12.setMaxGrowth(100.0d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        dormandPrince853Integrator24.addSwitchingFunction(switchingFunction25, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator24.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler32 = dormandPrince853Integrator24.getStepHandler();
        boolean boolean33 = stepHandler32.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator34 = null;
        stepHandler32.handleStep(stepInterpolator34, false);
        dormandPrince853Integrator12.setStepHandler(stepHandler32);
        boolean boolean38 = stepHandler32.requiresDenseOutput();
        stepHandler32.reset();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test15137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15137");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler3.evaluateStep(stepInterpolator4);
        double[] doubleArray15 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray18 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray15, doubleArray18);
        switchingFunctionsHandler3.stepAccepted(100.0d, doubleArray15);
        switchingFunctionsHandler0.stepAccepted((double) (short) 10, doubleArray15);
        boolean boolean22 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        boolean boolean24 = switchingFunctionsHandler0.evaluateStep(stepInterpolator23);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        switchingFunctionsHandler0.add(switchingFunction25, 1.0d, (double) (byte) 0, 3);
        double double30 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test15138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15138");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        double double6 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setInitialStepSize((double) (short) 10);
        double double9 = dormandPrince853Integrator4.getCurrentStepStart();
        double double10 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler11 = dormandPrince853Integrator4.getStepHandler();
        double double12 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, 0.0d, 1.4997884186649117d, 0);
        java.lang.String str18 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15139");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str13 = dormandPrince853Integrator4.getName();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        double double15 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler16 = dormandPrince853Integrator4.getStepHandler();
        boolean boolean17 = stepHandler16.requiresDenseOutput();
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test15140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15140");
        double[] doubleArray3 = new double[] { Double.NaN };
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray3, doubleArray12);
        double double18 = dormandPrince853Integrator17.getCurrentSignedStepsize();
        double double19 = dormandPrince853Integrator17.getCurrentStepStart();
        double double20 = dormandPrince853Integrator17.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler21 = dormandPrince853Integrator17.getStepHandler();
        dormandPrince853Integrator17.setSafety(14.142135623730951d);
        java.lang.String str24 = dormandPrince853Integrator17.getName();
        double double25 = dormandPrince853Integrator17.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str24, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double25));
    }

    @Test
    public void test15141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15141");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler18 = null;
        dormandPrince853Integrator4.setStepHandler(stepHandler18);
        dormandPrince853Integrator4.setSafety((double) 8);
        java.lang.String str22 = dormandPrince853Integrator4.getName();
        int int23 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str22, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        org.junit.Assert.assertNull(stepHandler24);
    }

    @Test
    public void test15142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15142");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        double[] doubleArray17 = new double[] { Double.NaN };
        double[] doubleArray26 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray29 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator30 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray26, doubleArray29);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator31 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray17, doubleArray26);
        org.apache.commons.math.ode.StepHandler stepHandler32 = dormandPrince853Integrator31.getStepHandler();
        dormandPrince853Integrator12.setStepHandler(stepHandler32);
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator12.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator39 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        dormandPrince853Integrator39.addSwitchingFunction(switchingFunction40, (double) 10, (double) 'a', (int) (byte) 10);
        int int45 = dormandPrince853Integrator39.getOrder();
        double double46 = dormandPrince853Integrator39.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator51 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction52 = null;
        dormandPrince853Integrator51.addSwitchingFunction(switchingFunction52, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator51.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler59 = dormandPrince853Integrator51.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator60 = null;
        stepHandler59.handleStep(stepInterpolator60, false);
        stepHandler59.reset();
        dormandPrince853Integrator39.setStepHandler(stepHandler59);
        dormandPrince853Integrator12.setStepHandler(stepHandler59);
        java.lang.String str66 = dormandPrince853Integrator12.getName();
        org.apache.commons.math.ode.StepHandler stepHandler67 = dormandPrince853Integrator12.getStepHandler();
        double double68 = dormandPrince853Integrator12.getMaxGrowth();
        java.lang.String str69 = dormandPrince853Integrator12.getName();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(stepHandler32);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 8 + "'", int45 == 8);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler59);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str66, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler67);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str69, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15143");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        double double11 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setMaxGrowth((double) 10L);
        double double14 = dormandPrince853Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction15, (double) (byte) 1, 0.6324555320336759d, (int) (byte) -1);
        double double20 = dormandPrince853Integrator4.getSafety();
        double double21 = dormandPrince853Integrator4.getMinReduction();
        double double22 = dormandPrince853Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator27 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        dormandPrince853Integrator27.addSwitchingFunction(switchingFunction28, (double) 10, (double) 'a', (int) (byte) 10);
        int int33 = dormandPrince853Integrator27.getOrder();
        double double34 = dormandPrince853Integrator27.getMinStep();
        dormandPrince853Integrator27.setMaxGrowth((double) 10L);
        double double37 = dormandPrince853Integrator27.getCurrentStepStart();
        dormandPrince853Integrator27.setMaxGrowth(100.0d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction45 = null;
        dormandPrince853Integrator44.addSwitchingFunction(switchingFunction45, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator44.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler52 = dormandPrince853Integrator44.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction53 = null;
        dormandPrince853Integrator44.addSwitchingFunction(switchingFunction53, (double) '4', (double) (-1L), 3);
        dormandPrince853Integrator44.setMaxGrowth(0.2d);
        org.apache.commons.math.ode.StepHandler stepHandler60 = dormandPrince853Integrator44.getStepHandler();
        dormandPrince853Integrator44.setMaxGrowth((double) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler63 = dormandPrince853Integrator44.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator64 = null;
        stepHandler63.handleStep(stepInterpolator64, false);
        dormandPrince853Integrator27.setStepHandler(stepHandler63);
        boolean boolean68 = stepHandler63.requiresDenseOutput();
        dormandPrince853Integrator4.setStepHandler(stepHandler63);
        double double70 = dormandPrince853Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.9d + "'", double20 == 0.9d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2d + "'", double21 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double22));
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertNotNull(stepHandler52);
        org.junit.Assert.assertNotNull(stepHandler60);
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 0.2d + "'", double70 == 0.2d);
    }

    @Test
    public void test15144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15144");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) 3, (double) (-1L), (int) (byte) -1);
        int int18 = dormandPrince853Integrator4.getOrder();
        java.lang.String str19 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction20, (double) (short) -1, (double) 10, 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction25, 1.0d, (double) 3, (int) (short) 100);
        double double30 = dormandPrince853Integrator4.getMinStep();
        double double31 = dormandPrince853Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str19, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 100.0d + "'", double31 == 100.0d);
    }

    @Test
    public void test15145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15145");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        double double11 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double12 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int13 = dormandPrince853Integrator4.getOrder();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        int int15 = dormandPrince853Integrator4.getOrder();
        int int16 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        dormandPrince853Integrator21.addSwitchingFunction(switchingFunction22, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator21.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler29 = dormandPrince853Integrator21.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        stepHandler29.handleStep(stepInterpolator30, false);
        stepHandler29.reset();
        dormandPrince853Integrator4.setStepHandler(stepHandler29);
        double double35 = dormandPrince853Integrator4.getCurrentStepStart();
        int int36 = dormandPrince853Integrator4.getOrder();
        int int37 = dormandPrince853Integrator4.getOrder();
        double double38 = dormandPrince853Integrator4.getCurrentStepStart();
        double double39 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setSafety((double) (byte) 10);
        dormandPrince853Integrator4.setInitialStepSize((double) 3);
        java.lang.String str44 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator49 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, (double) '#', 0.9d, (double) (short) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        dormandPrince853Integrator49.addSwitchingFunction(switchingFunction50, 1.0d, (double) (short) -1, 0);
        java.lang.String str55 = dormandPrince853Integrator49.getName();
        dormandPrince853Integrator49.setMaxGrowth(3.1622776601683795d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator62 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double63 = dormandPrince853Integrator62.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction64 = null;
        dormandPrince853Integrator62.addSwitchingFunction(switchingFunction64, (double) '#', (double) (-1.0f), (int) (short) 100);
        dormandPrince853Integrator62.setInitialStepSize((double) ' ');
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator75 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction76 = null;
        dormandPrince853Integrator75.addSwitchingFunction(switchingFunction76, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator75.setMinReduction(100.0d);
        double double83 = dormandPrince853Integrator75.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction84 = null;
        dormandPrince853Integrator75.addSwitchingFunction(switchingFunction84, (double) 3, (double) (-1L), (int) (byte) -1);
        dormandPrince853Integrator75.setMinReduction((double) (byte) 10);
        org.apache.commons.math.ode.StepHandler stepHandler91 = dormandPrince853Integrator75.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator92 = null;
        stepHandler91.handleStep(stepInterpolator92, false);
        dormandPrince853Integrator62.setStepHandler(stepHandler91);
        stepHandler91.reset();
        dormandPrince853Integrator49.setStepHandler(stepHandler91);
        dormandPrince853Integrator4.setStepHandler(stepHandler91);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue(Double.isNaN(double35));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double38));
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str44, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str55, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 0.9d + "'", double63 == 0.9d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler91);
    }

    @Test
    public void test15146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15146");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator10 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        dormandPrince853Integrator10.addSwitchingFunction(switchingFunction11, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator10.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler18 = dormandPrince853Integrator10.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator19 = null;
        stepHandler18.handleStep(stepInterpolator19, false);
        dormandPrince853Integrator4.setStepHandler(stepHandler18);
        boolean boolean23 = stepHandler18.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator24 = null;
        stepHandler18.handleStep(stepInterpolator24, true);
        boolean boolean27 = stepHandler18.requiresDenseOutput();
        boolean boolean28 = stepHandler18.requiresDenseOutput();
        stepHandler18.reset();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test15147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15147");
        double[] doubleArray2 = null;
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean4 = switchingFunctionsHandler3.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler6 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator7 = null;
        boolean boolean8 = switchingFunctionsHandler6.evaluateStep(stepInterpolator7);
        double[] doubleArray18 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray21 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray18, doubleArray21);
        switchingFunctionsHandler6.stepAccepted(100.0d, doubleArray18);
        switchingFunctionsHandler3.stepAccepted((double) (short) 10, doubleArray18);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler26 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean27 = switchingFunctionsHandler26.stop();
        double double28 = switchingFunctionsHandler26.getEventTime();
        double[] doubleArray33 = new double[] { Double.NaN };
        double[] doubleArray42 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray45 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator46 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray42, doubleArray45);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator47 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray33, doubleArray42);
        switchingFunctionsHandler26.stepAccepted(0.2d, doubleArray33);
        boolean boolean49 = switchingFunctionsHandler3.reset((double) (byte) -1, doubleArray33);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean52 = switchingFunctionsHandler51.stop();
        double double53 = switchingFunctionsHandler51.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler55 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator56 = null;
        boolean boolean57 = switchingFunctionsHandler55.evaluateStep(stepInterpolator56);
        double[] doubleArray67 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray70 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator71 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray67, doubleArray70);
        switchingFunctionsHandler55.stepAccepted(100.0d, doubleArray67);
        switchingFunctionsHandler51.stepAccepted(10.0d, doubleArray67);
        boolean boolean74 = switchingFunctionsHandler3.reset(0.0d, doubleArray67);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator75 = new org.apache.commons.math.ode.DormandPrince853Integrator(100.0d, 52.0d, doubleArray2, doubleArray67);
        double double76 = dormandPrince853Integrator75.getCurrentStepStart();
        double double77 = dormandPrince853Integrator75.getMinStep();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double28));
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray42), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray45), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double53));
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double76));
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 100.0d + "'", double77 == 100.0d);
    }

    @Test
    public void test15148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15148");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        java.lang.String str16 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMaxGrowth((double) 3);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator23 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) 1, (double) 100.0f, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator23.getStepHandler();
        dormandPrince853Integrator12.setStepHandler(stepHandler24);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator30 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double31 = dormandPrince853Integrator30.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        dormandPrince853Integrator30.addSwitchingFunction(switchingFunction32, (double) '#', (double) (-1.0f), (int) (short) 100);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator41 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        dormandPrince853Integrator41.addSwitchingFunction(switchingFunction42, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator41.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler49 = dormandPrince853Integrator41.getStepHandler();
        boolean boolean50 = stepHandler49.requiresDenseOutput();
        boolean boolean51 = stepHandler49.requiresDenseOutput();
        dormandPrince853Integrator30.setStepHandler(stepHandler49);
        double double53 = dormandPrince853Integrator30.getSafety();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator58 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction59 = null;
        dormandPrince853Integrator58.addSwitchingFunction(switchingFunction59, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator58.setMinReduction(100.0d);
        double double66 = dormandPrince853Integrator58.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction67 = null;
        dormandPrince853Integrator58.addSwitchingFunction(switchingFunction67, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler72 = dormandPrince853Integrator58.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator73 = null;
        stepHandler72.handleStep(stepInterpolator73, false);
        dormandPrince853Integrator30.setStepHandler(stepHandler72);
        dormandPrince853Integrator12.setStepHandler(stepHandler72);
        java.lang.String str78 = dormandPrince853Integrator12.getName();
        java.lang.String str79 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setSafety(4.0d);
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9d + "'", double31 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 0.9d + "'", double53 == 0.9d);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler72);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str78, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str79, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15149");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        java.lang.String str6 = dormandPrince853Integrator4.getName();
        java.lang.String str7 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth((double) 100.0f);
        double double10 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setMinReduction(3.732075599071396d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str6, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str7, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test15150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15150");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getSafety();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setInitialStepSize((double) 8);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        dormandPrince853Integrator19.addSwitchingFunction(switchingFunction20, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator19.setMinReduction(100.0d);
        double double27 = dormandPrince853Integrator19.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        dormandPrince853Integrator19.addSwitchingFunction(switchingFunction28, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler33 = dormandPrince853Integrator19.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler33);
        double double35 = dormandPrince853Integrator4.getSafety();
        int int36 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler37 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.9d + "'", double35 == 0.9d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 8 + "'", int36 == 8);
        org.junit.Assert.assertNotNull(stepHandler37);
    }

    @Test
    public void test15151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15151");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 100, (double) 3, 10.0d, (double) ' ');
        int int5 = dormandPrince853Integrator4.getOrder();
        double double6 = dormandPrince853Integrator4.getMaxGrowth();
        double[] doubleArray15 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray18 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray15, doubleArray18);
        java.lang.String str20 = dormandPrince853Integrator19.getName();
        dormandPrince853Integrator19.setMinReduction(0.9d);
        java.lang.String str23 = dormandPrince853Integrator19.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator28 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double29 = dormandPrince853Integrator28.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        dormandPrince853Integrator28.addSwitchingFunction(switchingFunction30, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double35 = dormandPrince853Integrator28.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler36 = dormandPrince853Integrator28.getStepHandler();
        double double37 = dormandPrince853Integrator28.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler38 = dormandPrince853Integrator28.getStepHandler();
        dormandPrince853Integrator19.setStepHandler(stepHandler38);
        double double40 = dormandPrince853Integrator19.getMinReduction();
        java.lang.String str41 = dormandPrince853Integrator19.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        dormandPrince853Integrator19.addSwitchingFunction(switchingFunction42, 3.0d, 0.6324555320336759d, (int) (short) 0);
        org.apache.commons.math.ode.StepHandler stepHandler47 = dormandPrince853Integrator19.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator52 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction53 = null;
        dormandPrince853Integrator52.addSwitchingFunction(switchingFunction53, (double) 10, (double) 'a', (int) (byte) 10);
        int int58 = dormandPrince853Integrator52.getOrder();
        double double59 = dormandPrince853Integrator52.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator64 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction65 = null;
        dormandPrince853Integrator64.addSwitchingFunction(switchingFunction65, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator64.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler72 = dormandPrince853Integrator64.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator73 = null;
        stepHandler72.handleStep(stepInterpolator73, false);
        stepHandler72.reset();
        dormandPrince853Integrator52.setStepHandler(stepHandler72);
        dormandPrince853Integrator52.setInitialStepSize((double) (short) 0);
        java.lang.String str80 = dormandPrince853Integrator52.getName();
        org.apache.commons.math.ode.StepHandler stepHandler81 = dormandPrince853Integrator52.getStepHandler();
        boolean boolean82 = stepHandler81.requiresDenseOutput();
        dormandPrince853Integrator19.setStepHandler(stepHandler81);
        boolean boolean84 = stepHandler81.requiresDenseOutput();
        dormandPrince853Integrator4.setStepHandler(stepHandler81);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str20, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str23, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.9d + "'", double29 == 0.9d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9d + "'", double40 == 0.9d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str41, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 8 + "'", int58 == 8);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler72);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str80, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test15152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15152");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        java.lang.String str16 = dormandPrince853Integrator12.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double22 = dormandPrince853Integrator21.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        dormandPrince853Integrator21.addSwitchingFunction(switchingFunction23, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double28 = dormandPrince853Integrator21.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler29 = dormandPrince853Integrator21.getStepHandler();
        double double30 = dormandPrince853Integrator21.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler31 = dormandPrince853Integrator21.getStepHandler();
        dormandPrince853Integrator12.setStepHandler(stepHandler31);
        java.lang.String str33 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMaxGrowth(0.0d);
        dormandPrince853Integrator12.setInitialStepSize(5.885661912765424d);
        double double38 = dormandPrince853Integrator12.getMinStep();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str33, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 1.0d + "'", double38 == 1.0d);
    }

    @Test
    public void test15153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15153");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) ' ', 31.622776601683793d, (double) 3, 31.622776601683793d);
        int int5 = dormandPrince853Integrator4.getOrder();
        double double6 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double7 = dormandPrince853Integrator4.getMinReduction();
        double double8 = dormandPrince853Integrator4.getCurrentStepStart();
        java.lang.String str9 = dormandPrince853Integrator4.getName();
        double double10 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction11, 8.523468443062363d, 0.4472135954999579d, (int) (short) -1);
        java.lang.String str16 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 31.810829150682025d + "'", double6 == 31.810829150682025d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.2d + "'", double7 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str9, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 32.0d + "'", double10 == 32.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15154");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        double double11 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double12 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int13 = dormandPrince853Integrator4.getOrder();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        int int15 = dormandPrince853Integrator4.getOrder();
        int int16 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        dormandPrince853Integrator21.addSwitchingFunction(switchingFunction22, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator21.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler29 = dormandPrince853Integrator21.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        stepHandler29.handleStep(stepInterpolator30, false);
        stepHandler29.reset();
        dormandPrince853Integrator4.setStepHandler(stepHandler29);
        double double35 = dormandPrince853Integrator4.getMaxStep();
        double double36 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int37 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setSafety((double) (byte) 100);
        int int40 = dormandPrince853Integrator4.getOrder();
        double double41 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 8 + "'", int16 == 8);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 8 + "'", int37 == 8);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 8 + "'", int40 == 8);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
    }

    @Test
    public void test15155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15155");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setInitialStepSize((double) 1L);
        int int12 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction13, (double) 10L, 0.9486832980505138d, (int) (byte) -1);
        java.lang.String str18 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setSafety((double) '#');
        double double21 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setMaxGrowth(29.862677864476527d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str18, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test15156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15156");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        java.lang.String str16 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMaxGrowth((double) 3);
        double double19 = dormandPrince853Integrator12.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction20, 0.0d, 2.0d, (int) '#');
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction25, 0.2d, (double) 100L, (int) '#');
        double double30 = dormandPrince853Integrator12.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction31 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction31, (double) 1L, (double) ' ', (int) 'a');
        double double36 = dormandPrince853Integrator12.getMaxStep();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 0.9d + "'", double30 == 0.9d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.9d + "'", double36 == 0.9d);
    }

    @Test
    public void test15157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15157");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 10, 2.0d, 0.0d, 3.0d);
        dormandPrince853Integrator4.setInitialStepSize((double) (short) -1);
        org.apache.commons.math.ode.StepHandler stepHandler7 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction13, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator12.setMinReduction(100.0d);
        double double20 = dormandPrince853Integrator12.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction21 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction21, (double) 3, (double) (-1L), (int) (byte) -1);
        dormandPrince853Integrator12.setMinReduction((double) (byte) 10);
        org.apache.commons.math.ode.StepHandler stepHandler28 = dormandPrince853Integrator12.getStepHandler();
        stepHandler28.reset();
        boolean boolean30 = stepHandler28.requiresDenseOutput();
        stepHandler28.reset();
        dormandPrince853Integrator4.setStepHandler(stepHandler28);
        dormandPrince853Integrator4.setMaxGrowth(3.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction35, (double) (byte) 1, (double) (short) 1, 10);
        org.apache.commons.math.ode.StepHandler stepHandler40 = dormandPrince853Integrator4.getStepHandler();
        double[] doubleArray49 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray52 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator53 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray49, doubleArray52);
        double double54 = dormandPrince853Integrator53.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler55 = dormandPrince853Integrator53.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler55);
        org.junit.Assert.assertNotNull(stepHandler7);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stepHandler40);
        org.junit.Assert.assertNotNull(doubleArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray49), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray52), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 1.0d + "'", double54 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler55);
    }

    @Test
    public void test15158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15158");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction16, (double) (-1.0f), (double) (byte) 0, (int) (short) -1);
        int int21 = dormandPrince853Integrator12.getOrder();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator26 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        dormandPrince853Integrator26.addSwitchingFunction(switchingFunction27, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator26.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler34 = dormandPrince853Integrator26.getStepHandler();
        double double35 = dormandPrince853Integrator26.getMaxStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator40 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double41 = dormandPrince853Integrator40.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator46 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        dormandPrince853Integrator46.addSwitchingFunction(switchingFunction47, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator46.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler54 = dormandPrince853Integrator46.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator55 = null;
        stepHandler54.handleStep(stepInterpolator55, false);
        dormandPrince853Integrator40.setStepHandler(stepHandler54);
        dormandPrince853Integrator26.setStepHandler(stepHandler54);
        dormandPrince853Integrator12.setStepHandler(stepHandler54);
        double double61 = dormandPrince853Integrator12.getMinStep();
        double double62 = dormandPrince853Integrator12.getCurrentStepStart();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(stepHandler34);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler54);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 1.0d + "'", double61 == 1.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double62));
    }

    @Test
    public void test15159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15159");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 100, 35.0d, (-0.0d), (-1.0d));
        dormandPrince853Integrator4.setInitialStepSize(4.521218853280617d);
        dormandPrince853Integrator4.setSafety(3.760603093086394d);
    }

    @Test
    public void test15160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15160");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        double double10 = dormandPrince853Integrator4.getCurrentStepStart();
        double double11 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        double double13 = dormandPrince853Integrator4.getCurrentStepStart();
        double double14 = dormandPrince853Integrator4.getCurrentStepStart();
        dormandPrince853Integrator4.setInitialStepSize(4.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue(Double.isNaN(double14));
    }

    @Test
    public void test15161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15161");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        double double12 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler13 = dormandPrince853Integrator4.getStepHandler();
        int int14 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setSafety((double) (byte) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double22 = dormandPrince853Integrator21.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        dormandPrince853Integrator21.addSwitchingFunction(switchingFunction23, (double) '#', (double) (-1.0f), (int) (short) 100);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction33 = null;
        dormandPrince853Integrator32.addSwitchingFunction(switchingFunction33, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator32.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler40 = dormandPrince853Integrator32.getStepHandler();
        boolean boolean41 = stepHandler40.requiresDenseOutput();
        boolean boolean42 = stepHandler40.requiresDenseOutput();
        dormandPrince853Integrator21.setStepHandler(stepHandler40);
        double double44 = dormandPrince853Integrator21.getSafety();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator49 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction50 = null;
        dormandPrince853Integrator49.addSwitchingFunction(switchingFunction50, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator49.setMinReduction(100.0d);
        double double57 = dormandPrince853Integrator49.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction58 = null;
        dormandPrince853Integrator49.addSwitchingFunction(switchingFunction58, (double) 3, (double) (-1L), (int) (byte) -1);
        org.apache.commons.math.ode.StepHandler stepHandler63 = dormandPrince853Integrator49.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator64 = null;
        stepHandler63.handleStep(stepInterpolator64, false);
        dormandPrince853Integrator21.setStepHandler(stepHandler63);
        dormandPrince853Integrator4.setStepHandler(stepHandler63);
        int int69 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction70 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction70, 3.760603093086394d, (double) (byte) -1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.9d + "'", double22 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 0.9d + "'", double44 == 0.9d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler63);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 8 + "'", int69 == 8);
    }

    @Test
    public void test15162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15162");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        double double13 = dormandPrince853Integrator12.getMinStep();
        dormandPrince853Integrator12.setInitialStepSize((double) (short) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction16, (double) '#', 1.0d, (-1));
        dormandPrince853Integrator12.setInitialStepSize(7.211102550927978d);
        org.apache.commons.math.ode.StepHandler stepHandler23 = dormandPrince853Integrator12.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator28 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction29 = null;
        dormandPrince853Integrator28.addSwitchingFunction(switchingFunction29, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator28.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler36 = dormandPrince853Integrator28.getStepHandler();
        boolean boolean37 = stepHandler36.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator38 = null;
        stepHandler36.handleStep(stepInterpolator38, false);
        boolean boolean41 = stepHandler36.requiresDenseOutput();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        stepHandler36.handleStep(stepInterpolator42, false);
        boolean boolean45 = stepHandler36.requiresDenseOutput();
        dormandPrince853Integrator12.setStepHandler(stepHandler36);
        java.lang.String str47 = dormandPrince853Integrator12.getName();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 1.0d + "'", double13 == 1.0d);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertNotNull(stepHandler36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str47, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15163");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        double double2 = switchingFunctionsHandler0.getEventTime();
        double[] doubleArray7 = new double[] { Double.NaN };
        double[] doubleArray16 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray19 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator20 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray16, doubleArray19);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray7, doubleArray16);
        switchingFunctionsHandler0.stepAccepted(0.2d, doubleArray7);
        boolean boolean23 = switchingFunctionsHandler0.isEmpty();
        double double24 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        boolean boolean26 = switchingFunctionsHandler0.evaluateStep(stepInterpolator25);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator27 = null;
        boolean boolean28 = switchingFunctionsHandler0.evaluateStep(stepInterpolator27);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator29 = null;
        boolean boolean30 = switchingFunctionsHandler0.evaluateStep(stepInterpolator29);
        boolean boolean31 = switchingFunctionsHandler0.stop();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertNotNull(doubleArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray7), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray16), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray19), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test15164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15164");
        java.io.IOException iOException3 = new java.io.IOException("org.apache.commons.math.ode.IntegratorException");
        java.io.IOException iOException4 = new java.io.IOException("org.apache.commons.math.MathException: java.io.IOException: org.apache.commons.math.ode.DerivativeException: hi!", (java.lang.Throwable) iOException3);
        java.lang.Throwable[] throwableArray5 = iOException4.getSuppressed();
        java.lang.String[] strArray8 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException9 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray8);
        org.apache.commons.math.MathException mathException10 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException9);
        org.apache.commons.math.ode.DerivativeException derivativeException11 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException9);
        java.lang.String str12 = derivativeException9.getPattern();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler14 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator15 = null;
        boolean boolean16 = switchingFunctionsHandler14.evaluateStep(stepInterpolator15);
        double[] doubleArray26 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray29 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator30 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray26, doubleArray29);
        switchingFunctionsHandler14.stepAccepted(100.0d, doubleArray26);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        switchingFunctionsHandler14.add(switchingFunction32, 100.0d, (double) 0.0f, (int) (byte) 1);
        java.io.IOException iOException38 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator44 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction45 = null;
        dormandPrince853Integrator44.addSwitchingFunction(switchingFunction45, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator44.setMinReduction(100.0d);
        double double52 = dormandPrince853Integrator44.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction53 = null;
        dormandPrince853Integrator44.addSwitchingFunction(switchingFunction53, (double) 3, (double) (-1L), (int) (byte) -1);
        java.lang.Object[] objArray58 = new java.lang.Object[] { switchingFunctionsHandler14, "hi!", "Dormand-Prince 8 (5, 3)", (-1L) };
        java.lang.Object[] objArray60 = new java.lang.Object[] {};
        java.lang.Throwable throwable61 = null;
        org.apache.commons.math.MathException mathException62 = new org.apache.commons.math.MathException("hi!", objArray60, throwable61);
        org.apache.commons.math.MathException mathException63 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException62);
        java.lang.String str64 = mathException63.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException65 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException63);
        org.apache.commons.math.MathException mathException66 = new org.apache.commons.math.MathException("hi!", objArray58, (java.lang.Throwable) mathException63);
        derivativeException9.addSuppressed((java.lang.Throwable) mathException63);
        java.lang.String str68 = derivativeException9.getPattern();
        java.lang.Object[] objArray69 = derivativeException9.getArguments();
        org.apache.commons.math.MathException mathException70 = new org.apache.commons.math.MathException((java.lang.Throwable) derivativeException9);
        org.apache.commons.math.MathException mathException71 = new org.apache.commons.math.MathException("java.io.IOException: org.apache.commons.math.ode.DerivativeException: org.apache.commons.math.MathException: hi!", (java.lang.Object[]) throwableArray5, (java.lang.Throwable) derivativeException9);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str12, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(doubleArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray26), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray29), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 10.0d + "'", double52 == 10.0d);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str68, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
    }

    @Test
    public void test15165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15165");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, (double) '#', 0.9d, (double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler6 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator11 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double12 = dormandPrince853Integrator11.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction18 = null;
        dormandPrince853Integrator17.addSwitchingFunction(switchingFunction18, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator17.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler25 = dormandPrince853Integrator17.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator26 = null;
        stepHandler25.handleStep(stepInterpolator26, false);
        dormandPrince853Integrator11.setStepHandler(stepHandler25);
        dormandPrince853Integrator4.setStepHandler(stepHandler25);
        double double31 = dormandPrince853Integrator4.getMaxGrowth();
        int int32 = dormandPrince853Integrator4.getOrder();
        int int33 = dormandPrince853Integrator4.getOrder();
        double double34 = dormandPrince853Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator39 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double40 = dormandPrince853Integrator39.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        dormandPrince853Integrator39.addSwitchingFunction(switchingFunction41, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double46 = dormandPrince853Integrator39.getSafety();
        double double47 = dormandPrince853Integrator39.getMaxGrowth();
        double double48 = dormandPrince853Integrator39.getCurrentStepStart();
        double double49 = dormandPrince853Integrator39.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler50 = dormandPrince853Integrator39.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler51 = dormandPrince853Integrator39.getStepHandler();
        boolean boolean52 = stepHandler51.requiresDenseOutput();
        boolean boolean53 = stepHandler51.requiresDenseOutput();
        dormandPrince853Integrator4.setStepHandler(stepHandler51);
        java.lang.String str55 = dormandPrince853Integrator4.getName();
        int int56 = dormandPrince853Integrator4.getOrder();
        double double57 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setInitialStepSize((double) 8);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertNotNull(stepHandler6);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler25);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 8 + "'", int33 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 0.9d + "'", double40 == 0.9d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9d + "'", double46 == 0.9d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double48));
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 0.2d + "'", double49 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler50);
        org.junit.Assert.assertNotNull(stepHandler51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str55, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 8 + "'", int56 == 8);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 1.0d + "'", double57 == 1.0d);
    }

    @Test
    public void test15166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15166");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 0.0f, (double) (short) 0, 0.0d, (double) (-1L));
        java.lang.String str5 = dormandPrince853Integrator4.getName();
        double[] doubleArray14 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray17 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray14, doubleArray17);
        java.lang.String str19 = dormandPrince853Integrator18.getName();
        double[] doubleArray23 = new double[] { Double.NaN };
        double[] doubleArray32 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray35 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator36 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray32, doubleArray35);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator37 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray23, doubleArray32);
        org.apache.commons.math.ode.StepHandler stepHandler38 = dormandPrince853Integrator37.getStepHandler();
        dormandPrince853Integrator18.setStepHandler(stepHandler38);
        org.apache.commons.math.ode.StepHandler stepHandler40 = dormandPrince853Integrator18.getStepHandler();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator45 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double46 = dormandPrince853Integrator45.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        dormandPrince853Integrator45.addSwitchingFunction(switchingFunction47, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double52 = dormandPrince853Integrator45.getCurrentStepStart();
        java.lang.String str53 = dormandPrince853Integrator45.getName();
        java.lang.String str54 = dormandPrince853Integrator45.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction55 = null;
        dormandPrince853Integrator45.addSwitchingFunction(switchingFunction55, (double) ' ', (double) (short) 0, (int) '#');
        double double60 = dormandPrince853Integrator45.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction61 = null;
        dormandPrince853Integrator45.addSwitchingFunction(switchingFunction61, 1.0d, (double) 2, (int) (byte) 1);
        org.apache.commons.math.ode.StepHandler stepHandler66 = dormandPrince853Integrator45.getStepHandler();
        dormandPrince853Integrator18.setStepHandler(stepHandler66);
        org.apache.commons.math.ode.StepHandler stepHandler68 = dormandPrince853Integrator18.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator69 = null;
        stepHandler68.handleStep(stepInterpolator69, true);
        dormandPrince853Integrator4.setStepHandler(stepHandler68);
        java.lang.String str73 = dormandPrince853Integrator4.getName();
        double double74 = dormandPrince853Integrator4.getMaxStep();
        int int75 = dormandPrince853Integrator4.getOrder();
        double double76 = dormandPrince853Integrator4.getMinStep();
        dormandPrince853Integrator4.setMinReduction((double) (-1L));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str5, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str19, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray32), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray35), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(stepHandler38);
        org.junit.Assert.assertNotNull(stepHandler40);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 0.9d + "'", double46 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double52));
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str53, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str54, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double60));
        org.junit.Assert.assertNotNull(stepHandler66);
        org.junit.Assert.assertNotNull(stepHandler68);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str73, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 0.0d + "'", double74 == 0.0d);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 8 + "'", int75 == 8);
        org.junit.Assert.assertTrue("'" + double76 + "' != '" + 0.0d + "'", double76 == 0.0d);
    }

    @Test
    public void test15167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15167");
        double[] doubleArray3 = new double[] { Double.NaN };
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator17 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray3, doubleArray12);
        double double18 = dormandPrince853Integrator17.getCurrentSignedStepsize();
        double double19 = dormandPrince853Integrator17.getCurrentStepStart();
        double double20 = dormandPrince853Integrator17.getMinReduction();
        dormandPrince853Integrator17.setSafety(0.0d);
        dormandPrince853Integrator17.setSafety(0.0d);
        org.apache.commons.math.ode.StepHandler stepHandler25 = dormandPrince853Integrator17.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        dormandPrince853Integrator17.addSwitchingFunction(switchingFunction26, 6.1090716144692525d, 20.40153156630532d, (int) (short) 0);
        org.junit.Assert.assertNotNull(doubleArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray3), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double19));
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.2d + "'", double20 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler25);
    }

    @Test
    public void test15168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15168");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setSafety((double) 1);
        double double12 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double13 = dormandPrince853Integrator4.getMinReduction();
        double double14 = dormandPrince853Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 5.623413251903491d, 22.80350850198276d, (double) (short) 0);
        java.lang.String str20 = dormandPrince853Integrator19.getName();
        org.apache.commons.math.ode.StepHandler stepHandler21 = dormandPrince853Integrator19.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler21);
        stepHandler21.reset();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str20, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler21);
    }

    @Test
    public void test15169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15169");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMaxGrowth((double) 10L);
        double double13 = dormandPrince853Integrator4.getSafety();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        double double15 = dormandPrince853Integrator4.getMaxStep();
        java.lang.String str16 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler17 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler17);
    }

    @Test
    public void test15170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15170");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler2 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator3 = null;
        boolean boolean4 = switchingFunctionsHandler2.evaluateStep(stepInterpolator3);
        double[] doubleArray14 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray17 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator18 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray14, doubleArray17);
        switchingFunctionsHandler2.stepAccepted(100.0d, doubleArray14);
        boolean boolean20 = switchingFunctionsHandler2.isEmpty();
        double[] doubleArray30 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray33 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator34 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray30, doubleArray33);
        boolean boolean35 = switchingFunctionsHandler2.reset(10.0d, doubleArray33);
        double[] doubleArray39 = new double[] { Double.NaN };
        double[] doubleArray48 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray51 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator52 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray48, doubleArray51);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator53 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray39, doubleArray48);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator54 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 10, (double) (byte) 10, doubleArray33, doubleArray48);
        java.lang.String str55 = dormandPrince853Integrator54.getName();
        dormandPrince853Integrator54.setMinReduction(0.2d);
        dormandPrince853Integrator54.setInitialStepSize((double) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(doubleArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray14), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray17), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(doubleArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray30), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray33), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray48), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray51), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str55, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15171");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (-1L), 2.0d, 0.0d, 11.892071150027212d);
        double double5 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety(18.708286933869708d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
    }

    @Test
    public void test15172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15172");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) -1, (-1.0d), (double) (byte) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double10 = dormandPrince853Integrator9.getSafety();
        double double11 = dormandPrince853Integrator9.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        dormandPrince853Integrator16.addSwitchingFunction(switchingFunction17, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator16.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator16.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        stepHandler24.handleStep(stepInterpolator25, false);
        stepHandler24.reset();
        dormandPrince853Integrator9.setStepHandler(stepHandler24);
        dormandPrince853Integrator4.setStepHandler(stepHandler24);
        dormandPrince853Integrator4.setMinReduction((double) 2);
        dormandPrince853Integrator4.setMaxGrowth(0.9486832980505138d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator39 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction40 = null;
        dormandPrince853Integrator39.addSwitchingFunction(switchingFunction40, (double) 10, (double) 'a', (int) (byte) 10);
        double double45 = dormandPrince853Integrator39.getCurrentStepStart();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction46 = null;
        dormandPrince853Integrator39.addSwitchingFunction(switchingFunction46, (double) 1.0f, (double) '#', (int) (short) 0);
        double double51 = dormandPrince853Integrator39.getCurrentSignedStepsize();
        java.lang.String str52 = dormandPrince853Integrator39.getName();
        double[] doubleArray61 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray64 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator65 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray61, doubleArray64);
        java.lang.String str66 = dormandPrince853Integrator65.getName();
        dormandPrince853Integrator65.setMinReduction(0.9d);
        java.lang.String str69 = dormandPrince853Integrator65.getName();
        org.apache.commons.math.ode.StepHandler stepHandler70 = dormandPrince853Integrator65.getStepHandler();
        dormandPrince853Integrator39.setStepHandler(stepHandler70);
        dormandPrince853Integrator4.setStepHandler(stepHandler70);
        int int73 = dormandPrince853Integrator4.getOrder();
        double double74 = dormandPrince853Integrator4.getMinReduction();
        double double75 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue(Double.isNaN(double45));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 10.0d + "'", double51 == 10.0d);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str52, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(doubleArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray61), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray64), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str66, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str69, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 8 + "'", int73 == 8);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 2.0d + "'", double74 == 2.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double75));
    }

    @Test
    public void test15173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15173");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        double double11 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        dormandPrince853Integrator16.addSwitchingFunction(switchingFunction17, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator16.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator16.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        stepHandler24.handleStep(stepInterpolator25, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator28 = null;
        stepHandler24.handleStep(stepInterpolator28, true);
        dormandPrince853Integrator4.setStepHandler(stepHandler24);
        dormandPrince853Integrator4.setMaxGrowth((double) (byte) -1);
        dormandPrince853Integrator4.setMaxGrowth((double) 1L);
        double double36 = dormandPrince853Integrator4.getSafety();
        java.lang.String str37 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.9d + "'", double36 == 0.9d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str37, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15174");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        org.apache.commons.math.ode.DerivativeException derivativeException3 = new org.apache.commons.math.ode.DerivativeException("org.apache.commons.math.MathException: hi!", strArray2);
        org.apache.commons.math.MathException mathException4 = new org.apache.commons.math.MathException("", (java.lang.Throwable) derivativeException3);
        org.apache.commons.math.ode.DerivativeException derivativeException5 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) derivativeException3);
        java.lang.String str6 = derivativeException3.getPattern();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler8 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator9 = null;
        boolean boolean10 = switchingFunctionsHandler8.evaluateStep(stepInterpolator9);
        double[] doubleArray20 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray23 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray20, doubleArray23);
        switchingFunctionsHandler8.stepAccepted(100.0d, doubleArray20);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        switchingFunctionsHandler8.add(switchingFunction26, 100.0d, (double) 0.0f, (int) (byte) 1);
        java.io.IOException iOException32 = new java.io.IOException("hi!");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator38 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction39 = null;
        dormandPrince853Integrator38.addSwitchingFunction(switchingFunction39, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator38.setMinReduction(100.0d);
        double double46 = dormandPrince853Integrator38.getMaxGrowth();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction47 = null;
        dormandPrince853Integrator38.addSwitchingFunction(switchingFunction47, (double) 3, (double) (-1L), (int) (byte) -1);
        java.lang.Object[] objArray52 = new java.lang.Object[] { switchingFunctionsHandler8, "hi!", "Dormand-Prince 8 (5, 3)", (-1L) };
        java.lang.Object[] objArray54 = new java.lang.Object[] {};
        java.lang.Throwable throwable55 = null;
        org.apache.commons.math.MathException mathException56 = new org.apache.commons.math.MathException("hi!", objArray54, throwable55);
        org.apache.commons.math.MathException mathException57 = new org.apache.commons.math.MathException((java.lang.Throwable) mathException56);
        java.lang.String str58 = mathException57.getPattern();
        org.apache.commons.math.ode.DerivativeException derivativeException59 = new org.apache.commons.math.ode.DerivativeException((java.lang.Throwable) mathException57);
        org.apache.commons.math.MathException mathException60 = new org.apache.commons.math.MathException("hi!", objArray52, (java.lang.Throwable) mathException57);
        derivativeException3.addSuppressed((java.lang.Throwable) mathException57);
        java.io.IOException iOException62 = new java.io.IOException((java.lang.Throwable) mathException57);
        java.io.IOException iOException63 = new java.io.IOException((java.lang.Throwable) iOException62);
        java.lang.String str64 = iOException63.toString();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.apache.commons.math.MathException: hi!" + "'", str6, "org.apache.commons.math.MathException: hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(doubleArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray20), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray23), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[]");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!" + "'", str64, "java.io.IOException: java.io.IOException: org.apache.commons.math.MathException: hi!");
    }

    @Test
    public void test15175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15175");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setInitialStepSize((double) 1L);
        int int12 = dormandPrince853Integrator4.getOrder();
        double double13 = dormandPrince853Integrator4.getCurrentStepStart();
        int int14 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction15, (double) 100L, (double) 10L, (int) (short) 1);
        org.apache.commons.math.ode.StepHandler stepHandler20 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str21 = dormandPrince853Integrator4.getName();
        double double22 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler23 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str25 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str21, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.2d + "'", double22 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str25, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15176");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) (short) 0, (double) 1, (double) 100);
        dormandPrince853Integrator4.setMaxGrowth((double) (short) -1);
        dormandPrince853Integrator4.setMaxGrowth(0.9486832980505138d);
        double[] doubleArray12 = new double[] { Double.NaN };
        double[] doubleArray21 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray24 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator25 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray21, doubleArray24);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator26 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray12, doubleArray21);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        dormandPrince853Integrator26.addSwitchingFunction(switchingFunction27, (double) 8, (double) '4', 0);
        org.apache.commons.math.ode.StepHandler stepHandler32 = dormandPrince853Integrator26.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler32);
        double double34 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str35 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMaxGrowth((double) (-1L));
        double double38 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler39 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator40 = null;
        stepHandler39.handleStep(stepInterpolator40, true);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray21), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray24), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(stepHandler32);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str35, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.2d + "'", double38 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler39);
    }

    @Test
    public void test15177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15177");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) (short) 0, (double) 1, (double) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 1.0f, (double) 0, (int) (byte) 0);
        double double10 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction11 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction11, (double) (-1), 97.0d, 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction16 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction16, 0.0d, 3.0d, (int) (byte) -1);
        java.lang.String str21 = dormandPrince853Integrator4.getName();
        int int22 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler23 = dormandPrince853Integrator4.getStepHandler();
        stepHandler23.reset();
        stepHandler23.reset();
        boolean boolean26 = stepHandler23.requiresDenseOutput();
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str21, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
        org.junit.Assert.assertNotNull(stepHandler23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test15178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15178");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        double double10 = dormandPrince853Integrator4.getSafety();
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        double double12 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setMinReduction((double) (byte) 1);
        double double15 = dormandPrince853Integrator4.getMaxStep();
        double double16 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setSafety(10.0d);
        dormandPrince853Integrator4.setInitialStepSize((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test15179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15179");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(17.320508075688775d, 0.9240210864723069d, 3.430936289925951d, 7.211102550927978d);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
    }

    @Test
    public void test15180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15180");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator4.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler12 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str13 = dormandPrince853Integrator4.getName();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        double double15 = dormandPrince853Integrator4.getMaxStep();
        org.apache.commons.math.ode.StepHandler stepHandler16 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler17 = dormandPrince853Integrator4.getStepHandler();
        double double18 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertNotNull(stepHandler12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler16);
        org.junit.Assert.assertNotNull(stepHandler17);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
    }

    @Test
    public void test15181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15181");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (byte) 100, Double.NaN, (double) 2, 17.320508075688775d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) -1, (-1.0d), (double) (byte) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator14 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double15 = dormandPrince853Integrator14.getSafety();
        double double16 = dormandPrince853Integrator14.getMinStep();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator21 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction22 = null;
        dormandPrince853Integrator21.addSwitchingFunction(switchingFunction22, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator21.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler29 = dormandPrince853Integrator21.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator30 = null;
        stepHandler29.handleStep(stepInterpolator30, false);
        stepHandler29.reset();
        dormandPrince853Integrator14.setStepHandler(stepHandler29);
        dormandPrince853Integrator9.setStepHandler(stepHandler29);
        stepHandler29.reset();
        dormandPrince853Integrator4.setStepHandler(stepHandler29);
        double double38 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setSafety((double) (byte) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction41 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction41, 100.0d, 13.92838827718412d, (int) '4');
        org.apache.commons.math.ode.StepHandler stepHandler46 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler47 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setMinReduction((double) (-1L));
        double double50 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.9d + "'", double15 == 0.9d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler29);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 0.9d + "'", double38 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler46);
        org.junit.Assert.assertNotNull(stepHandler47);
        org.junit.Assert.assertTrue(Double.isNaN(double50));
    }

    @Test
    public void test15182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15182");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        double double11 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        double double12 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        int int13 = dormandPrince853Integrator4.getOrder();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction15, (double) 100, (double) (short) 0, (int) (short) 1);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator24 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double25 = dormandPrince853Integrator24.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction26 = null;
        dormandPrince853Integrator24.addSwitchingFunction(switchingFunction26, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double31 = dormandPrince853Integrator24.getSafety();
        double double32 = dormandPrince853Integrator24.getMaxGrowth();
        double double33 = dormandPrince853Integrator24.getCurrentStepStart();
        double double34 = dormandPrince853Integrator24.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler35 = dormandPrince853Integrator24.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator36 = null;
        stepHandler35.handleStep(stepInterpolator36, true);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator39 = null;
        stepHandler35.handleStep(stepInterpolator39, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator42 = null;
        stepHandler35.handleStep(stepInterpolator42, true);
        dormandPrince853Integrator4.setStepHandler(stepHandler35);
        dormandPrince853Integrator4.setSafety(100.0d);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction48, (double) (byte) 100, (double) ' ', 3);
        int int53 = dormandPrince853Integrator4.getOrder();
        double double54 = dormandPrince853Integrator4.getMaxGrowth();
        org.apache.commons.math.ode.StepHandler stepHandler55 = dormandPrince853Integrator4.getStepHandler();
        stepHandler55.reset();
        boolean boolean57 = stepHandler55.requiresDenseOutput();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 8 + "'", int13 == 8);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.9d + "'", double25 == 0.9d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.9d + "'", double31 == 0.9d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double33));
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.2d + "'", double34 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler35);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 8 + "'", int53 == 8);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test15183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15183");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getSafety();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setInitialStepSize((double) 8);
        double double15 = dormandPrince853Integrator4.getMaxStep();
        double double16 = dormandPrince853Integrator4.getMinReduction();
        dormandPrince853Integrator4.setMaxGrowth((double) (short) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction19, 0.4472135954999579d, 31.810829150682025d, (int) (byte) 0);
        double double24 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.2d + "'", double16 == 0.2d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test15184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15184");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler3.evaluateStep(stepInterpolator4);
        double[] doubleArray15 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray18 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray15, doubleArray18);
        switchingFunctionsHandler3.stepAccepted(100.0d, doubleArray15);
        switchingFunctionsHandler0.stepAccepted((double) (short) 10, doubleArray15);
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        switchingFunctionsHandler0.add(switchingFunction23, (double) 0.0f, (double) 10L, (int) (short) 100);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction28 = null;
        switchingFunctionsHandler0.add(switchingFunction28, (double) 1L, (double) (short) 0, (int) (byte) -1);
        boolean boolean33 = switchingFunctionsHandler0.isEmpty();
        boolean boolean34 = switchingFunctionsHandler0.isEmpty();
        boolean boolean35 = switchingFunctionsHandler0.stop();
        boolean boolean36 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction37 = null;
        switchingFunctionsHandler0.add(switchingFunction37, 4.47213595499958d, 0.9486832980505138d, 2);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction42 = null;
        switchingFunctionsHandler0.add(switchingFunction42, 5.477225575051661d, (double) (byte) 100, (int) (byte) 0);
        boolean boolean47 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        switchingFunctionsHandler0.add(switchingFunction48, 23.893706400185096d, 8.0d, (int) ' ');
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test15185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15185");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler3.evaluateStep(stepInterpolator4);
        double[] doubleArray15 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray18 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray15, doubleArray18);
        switchingFunctionsHandler3.stepAccepted(100.0d, doubleArray15);
        switchingFunctionsHandler0.stepAccepted((double) (short) 10, doubleArray15);
        boolean boolean22 = switchingFunctionsHandler0.isEmpty();
        double double23 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        switchingFunctionsHandler0.add(switchingFunction24, (double) 0, 2.0d, (int) (byte) -1);
        double double29 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction30 = null;
        switchingFunctionsHandler0.add(switchingFunction30, (double) '4', 0.0d, (int) ' ');
        double[] doubleArray36 = null;
        // The following exception was thrown during execution in test generation
        try {
            switchingFunctionsHandler0.stepAccepted(8.0d, doubleArray36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue(Double.isNaN(double29));
    }

    @Test
    public void test15186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15186");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100L, 100.0d, (double) 100L, (double) '4');
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator9 = new org.apache.commons.math.ode.DormandPrince853Integrator(Double.NaN, (double) (short) 0, (double) 1, (double) 100);
        org.apache.commons.math.ode.StepHandler stepHandler10 = dormandPrince853Integrator9.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction17 = null;
        dormandPrince853Integrator16.addSwitchingFunction(switchingFunction17, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator16.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler24 = dormandPrince853Integrator16.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        stepHandler24.handleStep(stepInterpolator25, false);
        stepHandler24.reset();
        dormandPrince853Integrator4.setStepHandler(stepHandler24);
        double double30 = dormandPrince853Integrator4.getCurrentStepStart();
        org.junit.Assert.assertNotNull(stepHandler10);
        org.junit.Assert.assertNotNull(stepHandler24);
        org.junit.Assert.assertTrue(Double.isNaN(double30));
    }

    @Test
    public void test15187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15187");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(10.0d, 9.486832980505138d, 6.1090716144692525d, 9.612601554586078d);
        double double5 = dormandPrince853Integrator4.getMinStep();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test15188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15188");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        double double10 = dormandPrince853Integrator4.getSafety();
        dormandPrince853Integrator4.setInitialStepSize((double) '4');
        double double13 = dormandPrince853Integrator4.getMinReduction();
        double double14 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler16 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.9d + "'", double10 == 0.9d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.2d + "'", double13 == 0.2d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler16);
    }

    @Test
    public void test15189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15189");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setMaxGrowth((double) 10L);
        double double13 = dormandPrince853Integrator4.getSafety();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction15, (double) (-1L), 0.0d, (int) (byte) 0);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction20 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction20, 0.2d, (double) 8, 1);
        int int25 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler26 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction27 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction27, (double) (-1.0f), 5.916079783099616d, (int) (short) 100);
        double double32 = dormandPrince853Integrator4.getCurrentStepStart();
        java.lang.String str33 = dormandPrince853Integrator4.getName();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.9d + "'", double13 == 0.9d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 8 + "'", int25 == 8);
        org.junit.Assert.assertNotNull(stepHandler26);
        org.junit.Assert.assertTrue(Double.isNaN(double32));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str33, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15190");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100, (double) 2, 0.9d, (double) (byte) 1);
        double double5 = dormandPrince853Integrator4.getMaxStep();
        java.lang.String str6 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator11 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double12 = dormandPrince853Integrator11.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction13 = null;
        dormandPrince853Integrator11.addSwitchingFunction(switchingFunction13, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double18 = dormandPrince853Integrator11.getSafety();
        double double19 = dormandPrince853Integrator11.getMaxGrowth();
        double double20 = dormandPrince853Integrator11.getCurrentStepStart();
        double double21 = dormandPrince853Integrator11.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler22 = dormandPrince853Integrator11.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator23 = null;
        stepHandler22.handleStep(stepInterpolator23, true);
        dormandPrince853Integrator4.setStepHandler(stepHandler22);
        int int27 = dormandPrince853Integrator4.getOrder();
        double double28 = dormandPrince853Integrator4.getSafety();
        int int29 = dormandPrince853Integrator4.getOrder();
        dormandPrince853Integrator4.setSafety(22.80350850198276d);
        double double32 = dormandPrince853Integrator4.getMinReduction();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 2.0d + "'", double5 == 2.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str6, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.9d + "'", double12 == 0.9d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9d + "'", double18 == 0.9d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double20));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.2d + "'", double21 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler22);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.9d + "'", double28 == 0.9d);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 8 + "'", int29 == 8);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 0.2d + "'", double32 == 0.2d);
    }

    @Test
    public void test15191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15191");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator(11.892071150027212d, 1.0d, 5.885661912765424d, 7.671806770745353d);
    }

    @Test
    public void test15192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15192");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean1 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler3 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator4 = null;
        boolean boolean5 = switchingFunctionsHandler3.evaluateStep(stepInterpolator4);
        double[] doubleArray15 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray18 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray15, doubleArray18);
        switchingFunctionsHandler3.stepAccepted(100.0d, doubleArray15);
        switchingFunctionsHandler0.stepAccepted((double) (short) 10, doubleArray15);
        boolean boolean22 = switchingFunctionsHandler0.stop();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler24 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator25 = null;
        boolean boolean26 = switchingFunctionsHandler24.evaluateStep(stepInterpolator25);
        double[] doubleArray36 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray39 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator40 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray36, doubleArray39);
        switchingFunctionsHandler24.stepAccepted(100.0d, doubleArray36);
        boolean boolean42 = switchingFunctionsHandler0.reset((double) 100, doubleArray36);
        boolean boolean43 = switchingFunctionsHandler0.stop();
        double double44 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction45 = null;
        switchingFunctionsHandler0.add(switchingFunction45, (double) (-1), (double) (byte) -1, 8);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler51 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator52 = null;
        boolean boolean53 = switchingFunctionsHandler51.evaluateStep(stepInterpolator52);
        double[] doubleArray63 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray66 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator67 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray63, doubleArray66);
        switchingFunctionsHandler51.stepAccepted(100.0d, doubleArray63);
        double double69 = switchingFunctionsHandler51.getEventTime();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator70 = null;
        boolean boolean71 = switchingFunctionsHandler51.evaluateStep(stepInterpolator70);
        double double72 = switchingFunctionsHandler51.getEventTime();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler74 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean75 = switchingFunctionsHandler74.isEmpty();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator76 = null;
        boolean boolean77 = switchingFunctionsHandler74.evaluateStep(stepInterpolator76);
        double[] doubleArray79 = new double[] {};
        switchingFunctionsHandler74.stepAccepted((double) 100L, doubleArray79);
        switchingFunctionsHandler51.stepAccepted(17.320508075688775d, doubleArray79);
        boolean boolean82 = switchingFunctionsHandler0.reset(4.521218853280617d, doubleArray79);
        boolean boolean83 = switchingFunctionsHandler0.stop();
        double double84 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray18), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(doubleArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray36), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray39), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double44));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(doubleArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray63), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray66), "[0.9, 0.0]");
        org.junit.Assert.assertTrue(Double.isNaN(double69));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double72));
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(doubleArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray79), "[]");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double84));
    }

    @Test
    public void test15193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15193");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) 100, (double) 10.0f, (double) 10.0f, (double) (byte) 10);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        dormandPrince853Integrator4.setMinReduction((double) 2);
        java.lang.String str8 = dormandPrince853Integrator4.getName();
        double double9 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator14 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction15 = null;
        dormandPrince853Integrator14.addSwitchingFunction(switchingFunction15, (double) 10, (double) 'a', (int) (byte) 10);
        int int20 = dormandPrince853Integrator14.getOrder();
        double double21 = dormandPrince853Integrator14.getCurrentSignedStepsize();
        double double22 = dormandPrince853Integrator14.getCurrentSignedStepsize();
        double double23 = dormandPrince853Integrator14.getCurrentStepStart();
        double double24 = dormandPrince853Integrator14.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction25 = null;
        dormandPrince853Integrator14.addSwitchingFunction(switchingFunction25, (double) 1.0f, (double) (byte) 0, (int) (short) 10);
        org.apache.commons.math.ode.StepHandler stepHandler30 = dormandPrince853Integrator14.getStepHandler();
        dormandPrince853Integrator4.setStepHandler(stepHandler30);
        org.junit.Assert.assertNotNull(stepHandler5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str8, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 2.0d + "'", double9 == 2.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 8 + "'", int20 == 8);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double23));
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.9d + "'", double24 == 0.9d);
        org.junit.Assert.assertNotNull(stepHandler30);
    }

    @Test
    public void test15194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15194");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction12 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction12, (double) 0, (double) 1.0f, 0);
        java.lang.String str17 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator22 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double23 = dormandPrince853Integrator22.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction24 = null;
        dormandPrince853Integrator22.addSwitchingFunction(switchingFunction24, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double29 = dormandPrince853Integrator22.getCurrentStepStart();
        java.lang.String str30 = dormandPrince853Integrator22.getName();
        java.lang.String str31 = dormandPrince853Integrator22.getName();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction32 = null;
        dormandPrince853Integrator22.addSwitchingFunction(switchingFunction32, (double) ' ', (double) (short) 0, (int) '#');
        double double37 = dormandPrince853Integrator22.getCurrentStepStart();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator42 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double43 = dormandPrince853Integrator42.getMaxGrowth();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator48 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction49 = null;
        dormandPrince853Integrator48.addSwitchingFunction(switchingFunction49, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator48.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler56 = dormandPrince853Integrator48.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator57 = null;
        stepHandler56.handleStep(stepInterpolator57, false);
        dormandPrince853Integrator42.setStepHandler(stepHandler56);
        double double61 = dormandPrince853Integrator42.getMinStep();
        dormandPrince853Integrator42.setInitialStepSize(100.0d);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator68 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction69 = null;
        dormandPrince853Integrator68.addSwitchingFunction(switchingFunction69, (double) 10, (double) 'a', (int) (byte) 10);
        dormandPrince853Integrator68.setMinReduction(100.0d);
        org.apache.commons.math.ode.StepHandler stepHandler76 = dormandPrince853Integrator68.getStepHandler();
        boolean boolean77 = stepHandler76.requiresDenseOutput();
        dormandPrince853Integrator42.setStepHandler(stepHandler76);
        dormandPrince853Integrator22.setStepHandler(stepHandler76);
        dormandPrince853Integrator4.setStepHandler(stepHandler76);
        double double81 = dormandPrince853Integrator4.getMaxGrowth();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str17, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.9d + "'", double23 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double29));
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str30, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str31, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue(Double.isNaN(double37));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler56);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
    }

    @Test
    public void test15195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15195");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        org.apache.commons.math.ode.StepHandler stepHandler11 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setMinReduction((double) (byte) 1);
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        java.lang.String str16 = dormandPrince853Integrator4.getName();
        double double17 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertNotNull(stepHandler11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test15196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15196");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray12);
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        double[] doubleArray28 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray31 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray28, doubleArray31);
        boolean boolean33 = switchingFunctionsHandler0.reset(10.0d, doubleArray31);
        double double34 = switchingFunctionsHandler0.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction35 = null;
        switchingFunctionsHandler0.add(switchingFunction35, (double) (byte) 10, (double) 2, 3);
        boolean boolean40 = switchingFunctionsHandler0.stop();
        double[] doubleArray42 = null;
        boolean boolean43 = switchingFunctionsHandler0.reset((double) (short) 1, doubleArray42);
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler45 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        boolean boolean46 = switchingFunctionsHandler45.stop();
        double double47 = switchingFunctionsHandler45.getEventTime();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction48 = null;
        switchingFunctionsHandler45.add(switchingFunction48, (double) (byte) 0, (double) 10.0f, 1);
        boolean boolean53 = switchingFunctionsHandler45.isEmpty();
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler55 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator56 = null;
        boolean boolean57 = switchingFunctionsHandler55.evaluateStep(stepInterpolator56);
        double[] doubleArray67 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray70 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator71 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray67, doubleArray70);
        switchingFunctionsHandler55.stepAccepted(100.0d, doubleArray67);
        double[] doubleArray77 = new double[] { Double.NaN };
        double[] doubleArray86 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray89 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator90 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray86, doubleArray89);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator91 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10L, (double) (short) 0, doubleArray77, doubleArray86);
        boolean boolean92 = switchingFunctionsHandler55.reset(100.0d, doubleArray77);
        boolean boolean93 = switchingFunctionsHandler45.reset((double) (-1), doubleArray77);
        boolean boolean94 = switchingFunctionsHandler0.reset(32.0d, doubleArray77);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction95 = null;
        switchingFunctionsHandler0.add(switchingFunction95, 11.801859293002996d, 5.885661912765424d, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(doubleArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray28), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray31), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double34));
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double47));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(doubleArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray67), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray70), "[0.9, 0.0]");
        org.junit.Assert.assertNotNull(doubleArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray77), "[NaN]");
        org.junit.Assert.assertNotNull(doubleArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray86), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray89), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test15197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15197");
        double[] doubleArray8 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray11 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator12 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray8, doubleArray11);
        java.lang.String str13 = dormandPrince853Integrator12.getName();
        dormandPrince853Integrator12.setMinReduction(0.9d);
        java.lang.String str16 = dormandPrince853Integrator12.getName();
        double double17 = dormandPrince853Integrator12.getSafety();
        double double18 = dormandPrince853Integrator12.getCurrentSignedStepsize();
        dormandPrince853Integrator12.setMinReduction((double) 100);
        dormandPrince853Integrator12.setMinReduction((double) (short) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction23 = null;
        dormandPrince853Integrator12.addSwitchingFunction(switchingFunction23, 8.0d, (double) (byte) 1, 10);
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator32 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, (double) '#', 0.9d, (double) (short) 100);
        org.apache.commons.math.ode.StepHandler stepHandler33 = dormandPrince853Integrator32.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator34 = null;
        stepHandler33.handleStep(stepInterpolator34, false);
        org.apache.commons.math.ode.StepInterpolator stepInterpolator37 = null;
        stepHandler33.handleStep(stepInterpolator37, false);
        boolean boolean40 = stepHandler33.requiresDenseOutput();
        dormandPrince853Integrator12.setStepHandler(stepHandler33);
        stepHandler33.reset();
        stepHandler33.reset();
        boolean boolean44 = stepHandler33.requiresDenseOutput();
        org.junit.Assert.assertNotNull(doubleArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray8), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray11), "[0.9, 0.0]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str13, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str16, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.9d + "'", double17 == 0.9d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.9486832980505138d + "'", double18 == 0.9486832980505138d);
        org.junit.Assert.assertNotNull(stepHandler33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test15198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15198");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getCurrentStepStart();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler13 = dormandPrince853Integrator4.getStepHandler();
        double double14 = dormandPrince853Integrator4.getCurrentStepStart();
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator19 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 100.0f, (double) (byte) 1, (double) 100.0f, (double) 100.0f);
        org.apache.commons.math.ode.StepHandler stepHandler20 = dormandPrince853Integrator19.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler21 = dormandPrince853Integrator19.getStepHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator22 = null;
        stepHandler21.handleStep(stepInterpolator22, true);
        boolean boolean25 = stepHandler21.requiresDenseOutput();
        dormandPrince853Integrator4.setStepHandler(stepHandler21);
        double double27 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertTrue(Double.isNaN(double14));
        org.junit.Assert.assertNotNull(stepHandler20);
        org.junit.Assert.assertNotNull(stepHandler21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
    }

    @Test
    public void test15199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15199");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getCurrentStepStart();
        java.lang.String str6 = dormandPrince853Integrator4.getName();
        double double7 = dormandPrince853Integrator4.getMaxStep();
        double double8 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        dormandPrince853Integrator4.setInitialStepSize((-0.0d));
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str6, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test15200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15200");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        double double5 = dormandPrince853Integrator4.getSafety();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction6 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction6, (double) '#', (double) (-1.0f), (int) (short) 100);
        double double11 = dormandPrince853Integrator4.getSafety();
        double double12 = dormandPrince853Integrator4.getMaxGrowth();
        double double13 = dormandPrince853Integrator4.getCurrentStepStart();
        double double14 = dormandPrince853Integrator4.getMinReduction();
        org.apache.commons.math.ode.StepHandler stepHandler15 = dormandPrince853Integrator4.getStepHandler();
        double double16 = dormandPrince853Integrator4.getMaxGrowth();
        dormandPrince853Integrator4.setInitialStepSize((double) (byte) 0);
        int int19 = dormandPrince853Integrator4.getOrder();
        double double20 = dormandPrince853Integrator4.getMinStep();
        org.apache.commons.math.ode.StepHandler stepHandler21 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.9d + "'", double5 == 0.9d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.9d + "'", double11 == 0.9d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.2d + "'", double14 == 0.2d);
        org.junit.Assert.assertNotNull(stepHandler15);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 8 + "'", int19 == 8);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertNotNull(stepHandler21);
    }

    @Test
    public void test15201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15201");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 10, (double) (byte) 10, (double) (short) 100, (double) 1);
        org.apache.commons.math.ode.SwitchingFunction switchingFunction5 = null;
        dormandPrince853Integrator4.addSwitchingFunction(switchingFunction5, (double) 10, (double) 'a', (int) (byte) 10);
        int int10 = dormandPrince853Integrator4.getOrder();
        double double11 = dormandPrince853Integrator4.getCurrentSignedStepsize();
        java.lang.String str12 = dormandPrince853Integrator4.getName();
        org.apache.commons.math.ode.StepHandler stepHandler13 = dormandPrince853Integrator4.getStepHandler();
        org.apache.commons.math.ode.StepHandler stepHandler14 = dormandPrince853Integrator4.getStepHandler();
        java.lang.String str15 = dormandPrince853Integrator4.getName();
        dormandPrince853Integrator4.setInitialStepSize((double) 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 8 + "'", int10 == 8);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str12, "Dormand-Prince 8 (5, 3)");
        org.junit.Assert.assertNotNull(stepHandler13);
        org.junit.Assert.assertNotNull(stepHandler14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Dormand-Prince 8 (5, 3)" + "'", str15, "Dormand-Prince 8 (5, 3)");
    }

    @Test
    public void test15202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15202");
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator4 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) (short) -1, 0.9240210864723069d, (double) 0.0f, 22.80350850198276d);
        org.apache.commons.math.ode.StepHandler stepHandler5 = dormandPrince853Integrator4.getStepHandler();
        org.junit.Assert.assertNotNull(stepHandler5);
    }

    @Test
    public void test15203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15203");
        org.apache.commons.math.ode.SwitchingFunctionsHandler switchingFunctionsHandler0 = new org.apache.commons.math.ode.SwitchingFunctionsHandler();
        org.apache.commons.math.ode.StepInterpolator stepInterpolator1 = null;
        boolean boolean2 = switchingFunctionsHandler0.evaluateStep(stepInterpolator1);
        double[] doubleArray12 = new double[] { 0.0d, 100L, (short) 100, 1.0f, (short) -1, (byte) 10 };
        double[] doubleArray15 = new double[] { 0.9d, 0.0f };
        org.apache.commons.math.ode.DormandPrince853Integrator dormandPrince853Integrator16 = new org.apache.commons.math.ode.DormandPrince853Integrator((double) 1, 0.9d, doubleArray12, doubleArray15);
        switchingFunctionsHandler0.stepAccepted(100.0d, doubleArray12);
        boolean boolean18 = switchingFunctionsHandler0.isEmpty();
        org.apache.commons.math.ode.SwitchingFunction switchingFunction19 = null;
        switchingFunctionsHandler0.add(switchingFunction19, 0.9d, (double) (byte) 100, 3);
        double double24 = switchingFunctionsHandler0.getEventTime();
        boolean boolean25 = switchingFunctionsHandler0.stop();
        double double26 = switchingFunctionsHandler0.getEventTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(doubleArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray12), "[0.0, 100.0, 100.0, 1.0, -1.0, 10.0]");
        org.junit.Assert.assertNotNull(doubleArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(doubleArray15), "[0.9, 0.0]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double24));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue(Double.isNaN(double26));
    }
}

